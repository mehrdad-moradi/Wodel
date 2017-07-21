package wizards;

import manager.ModelManager;
import manager.WodelContext;
import mutatorenvironment.MutatorEnvironment;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import org.eclipse.jface.resource.ImageDescriptor;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import java.awt.Composite;
import java.io.*;

import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;

import utils.EclipseHelper;
import wodel.dsls.WodelUtils;
import builder.SampleNature;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;

import exceptions.MetaModelNotFoundException;
import generator.IGenerator;

/**
 * This is a sample new wizard. Its role is to create a new file resource in the
 * provided container. If the container resource (a folder or a project) is
 * selected in the workspace when the wizard is opened, it will accept it as the
 * target container. The wizard creates one file with the extension "mpe". If a
 * sample multi-page editor (also available as a template) is registered for the
 * same extension, it will be able to open it.
 */

public class WodelWizard extends Wizard implements INewWizard {
	private ISelection selection;

	public WodelWizardPage _pageOne;
	public WodelWizardMetamodelPage _pageTwo;

	private static final String WIZARD_NAME = "Wodel Project";

	/**
	 * Constructor for WodelWizard.
	 */
	public WodelWizard() {
		super();
		setWindowTitle(WIZARD_NAME);
		setNeedsProgressMonitor(true);
		// this.setDefaultPageImageDescriptor(ImageDescriptor.createFromImage(new
		// Image(Display.getDefault(),
		// "C:/proyectos/mutation/MutatorProject/icons/wodel4.jpg")));
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		super.addPages();
		_pageOne = new WodelWizardPage(selection);
		_pageOne.setTitle("Wodel Project");
		_pageOne.setDescription("Create a Wodel Project");
		addPage(_pageOne);
		_pageTwo = new WodelWizardMetamodelPage(selection);
		_pageTwo.setTitle("Choose Metamodel");
		_pageTwo.setDescription("Choose Metamodel for Wodel Project");
		addPage(_pageTwo);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		final String fileName = _pageOne.getFileName();
		final String projectName = _pageOne.getProjectName();
		final String modelName = _pageOne.getModelName();
		final String mutantName = _pageOne.getMutantName();
		final HashMap<String, Boolean> wodelExtensions = _pageOne
				.getWodelExtensions();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					doFinish(fileName, projectName, modelName, mutantName,
							monitor, wodelExtensions);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error",
					realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the file if missing
	 * or just replace its contents, and open the editor on the newly created
	 * file.
	 */

	private void doFinish(String fileName, String projectName,
			String modelName, String mutantName, IProgressMonitor monitor,
			HashMap<String, Boolean> wodelExtensions) throws CoreException {

		List<String> folders = new ArrayList<String>();
		folders.add("src");
		folders.add("src-gen");

		List<IProject> referencedProjects = new ArrayList<IProject>();
		Set<String> requiredBundles = new HashSet<String>();
		Set<String> importPackages = new HashSet<String>();
		List<String> exportedPackages = new ArrayList<String>();

		requiredBundles.add("wodel.utils;bundle-version=\"1.0.0\"");
		requiredBundles.add("wodel.models;bundle-version=\"1.0.0\"");
		requiredBundles
				.add("org.eclipse.emf.ecore.xmi;bundle-version=\"2.9.0\"");
		requiredBundles.add("org.eclipse.emf.ecore");
		requiredBundles.add("org.eclipse.emf.compare;bundle-version=\"3.1.2\"");
		requiredBundles.add("com.google.guava;bundle-version=\"15.0.0\"");
		requiredBundles.add("org.apache.log4j;bundle-version=\"1.2.15\"");
		requiredBundles.add("org.eclipse.ocl;bundle-version=\"3.4.2\"");
		requiredBundles.add("org.eclipse.ocl.ecore;bundle-version=\"3.3.100\"");
		requiredBundles.add("org.eclipse.emf.common");
		requiredBundles.add("org.eclipse.core.runtime;bundle-version=\"3.10.0\"");

		IProject project = EclipseHelper.createWodelProject(projectName,
				folders, referencedProjects, requiredBundles, importPackages,
				exportedPackages, monitor, this.getShell());

		monitor.beginTask("Creating data folder", 9);
		final IFolder dataFolder = project.getFolder(new Path("data"));
		dataFolder.create(true, true, monitor);
		
		monitor.beginTask("Creating config folder", 8);
		final IFolder configFolder = dataFolder.getFolder(new Path("config"));
		configFolder.create(true, true, monitor);

		final IFile config = configFolder.getFile(new Path("config.txt"));
		try {
			InputStream stream = openConfigStream(modelName, mutantName);
			if (config.exists()) {
				config.setContents(stream, true, true, monitor);
			} else {
				config.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		
//		monitor.beginTask("Creating resources folder", 8);
//		final IFolder resourcesFolder = project.getFolder(new Path("resources"));
//		resourcesFolder.create(true, true, monitor);
//		
//		try {
//			final File jarFile = new File(MutatorEnvironment.class.getProtectionDomain().getCodeSource().getLocation().getPath());
//			String srcName = "";
//			if (jarFile.isFile()) {
//				final JarFile jar = new JarFile(jarFile);
//				final Enumeration<JarEntry> entries = jar.entries(); //gives ALL entries in jar
//				while(entries.hasMoreElements()) {
//					JarEntry entry = entries.nextElement();
//					if (! entry.isDirectory()) {
//						if (entry.getName().startsWith("models") && entry.getName().endsWith("MutatorEnvironment.ecore")) {
//							final File f = resourcesFolder.getRawLocation().makeAbsolute().toFile();
//							File dest = new File(f.getPath() + '/' + entry.getName().replace("models/", ""));
//							InputStream input = jar.getInputStream(entry);
//							FileOutputStream output = new FileOutputStream(dest);
//							while (input.available() > 0) {
//								output.write(input.read());
//							}
//							output.close();
//							input.close();
//						}
//					}
//				}
//				jar.close();
//		    }
//			else {
//				srcName = MutatorEnvironment.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "models/MutatorEnvironment.ecore";
//				String tarName = resourcesFolder.getRawLocation().makeAbsolute().toFile().getPath() + "/MutatorEnvironment.ecore";
//				final File src = new Path(srcName).toFile();
//				final File dest = new Path(tarName).toFile();
//				if ((src != null) && (dest != null)) {
//					ModelManager.copyFile(src, dest);
//				}
//			}
//		} catch (IOException e) {
//		}
//		
//		try {
//			final File jarFile = new File(MutatorEnvironment.class.getProtectionDomain().getCodeSource().getLocation().getPath());
//			String srcName = "";
//			if (jarFile.isFile()) {
//				final JarFile jar = new JarFile(jarFile);
//				final Enumeration<JarEntry> entries = jar.entries(); //gives ALL entries in jar
//				while(entries.hasMoreElements()) {
//					JarEntry entry = entries.nextElement();
//					if (! entry.isDirectory()) {
//						if (entry.getName().startsWith("models") && entry.getName().endsWith("AppliedMutations.ecore")) {
//							final File f = resourcesFolder.getRawLocation().makeAbsolute().toFile();
//							File dest = new File(f.getPath() + '/' + entry.getName().replace("models/", ""));
//							InputStream input = jar.getInputStream(entry);
//							FileOutputStream output = new FileOutputStream(dest);
//							while (input.available() > 0) {
//								output.write(input.read());
//							}
//							output.close();
//							input.close();
//						}
//					}
//				}
//				jar.close();
//		    }
//			else {
//				srcName = MutatorEnvironment.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "models/AppliedMutations.ecore";
//				String tarName = resourcesFolder.getRawLocation().makeAbsolute().toFile().getPath() + "/AppliedMutations.ecore";
//				final File src = new Path(srcName).toFile();
//				final File dest = new Path(tarName).toFile();
//				if ((src != null) && (dest != null)) {
//					ModelManager.copyFile(src, dest);
//				}
//			}
//		} catch (IOException e) {
//		}
//		
//		try {
//			final File jarFile = new File(MutatorEnvironment.class.getProtectionDomain().getCodeSource().getLocation().getPath());
//			String srcName = "";
//			if (jarFile.isFile()) {
//				final JarFile jar = new JarFile(jarFile);
//				final Enumeration<JarEntry> entries = jar.entries(); //gives ALL entries in jar
//				while(entries.hasMoreElements()) {
//					JarEntry entry = entries.nextElement();
//					if (! entry.isDirectory()) {
//						if (entry.getName().startsWith("models") && entry.getName().endsWith("MutatorMetrics.ecore")) {
//							final File f = resourcesFolder.getRawLocation().makeAbsolute().toFile();
//							File dest = new File(f.getPath() + '/' + entry.getName().replace("models/", ""));
//							InputStream input = jar.getInputStream(entry);
//							FileOutputStream output = new FileOutputStream(dest);
//							while (input.available() > 0) {
//								output.write(input.read());
//							}
//							output.close();
//							input.close();
//						}
//					}
//				}
//				jar.close();
//		    }
//			else {
//				srcName = MutatorEnvironment.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "models/MutatorMetrics.ecore";
//				String tarName = resourcesFolder.getRawLocation().makeAbsolute().toFile().getPath() + "/MutatorMetrics.ecore";
//				final File src = new Path(srcName).toFile();
//				final File dest = new Path(tarName).toFile();
//				if ((src != null) && (dest != null)) {
//					ModelManager.copyFile(src, dest);
//				}
//			}
//		} catch (IOException e) {
//		}
		
		monitor.beginTask("Creating model folder", 8);
		final IFolder modelFolder = project.getFolder(new Path(modelName));
		modelFolder.create(true, true, monitor);
		String metamodel = null;
		//Copies the selected meta-model
		if (_pageTwo.file != null) {
			metamodel = _pageTwo.file.substring(_pageTwo.file.lastIndexOf(File.separator) + 1);
			IFile file = modelFolder.getFile(new Path(metamodel));
			try {
				FileReader fr = new FileReader(_pageTwo.file);
				BufferedReader br = new BufferedReader(fr);
				
				String line = null;
				String def = "";
				while ((line = br.readLine()) != null) {
					def += line + "\n";
				}
				br.close();
				InputStream stream = openContentStream();
				String content = CharStreams.toString(new InputStreamReader(stream, Charsets.UTF_8));
				content += def;
				stream = new ByteArrayInputStream(content.getBytes(Charsets.UTF_8));
				file.create(stream, true, monitor);
				stream.close();
			} catch (IOException e) {
			}
		}

		monitor.beginTask("Creating mutant folder", 8);
		final IFolder mutantFolder = project.getFolder(new Path(mutantName));
		mutantFolder.create(true, true, monitor);
		// create a sample file
		monitor.beginTask("Creating " + fileName, 7);

		final IFolder srcFolder = project.getFolder(new Path("src"));

		final IFile file = srcFolder.getFile(new Path(fileName));
		try {
			InputStream stream = openContentStream();
			String def = "generate 2 mutants\n"
					+ "in \"" + mutantName + "/\"\n"
					+ "from \"" + modelName + "/\"\n";
			if (metamodel != null) {
				def += "metamodel \"" + ModelManager.getMetaModelPath(projectName) + "/" + metamodel + "\"\n\n";
			}
			else {
				def += "metamodel \"\" //fill this with the path to the meta-model\n\n";
			}
			if (metamodel != null) {
				ArrayList<EPackage> packages = ModelManager.loadMetaModel(ModelManager.getMetaModelPath(projectName) + "/" + metamodel);
				ArrayList<EClass> eclasses = ModelManager.getEClasses(packages);
				EClass eclass = eclasses.get(0);
				def += "with commands {\n";
				def += "\tcreate " + eclass.getName() + "\n";
			}
			else {
				def += "\t//fill this with mutation commands\n";
			}
			def += "}";
			if (file.exists()) {
				String content = CharStreams.toString(new InputStreamReader(stream, Charsets.UTF_8));
				content += def;
				stream = new ByteArrayInputStream(content.getBytes(Charsets.UTF_8));
				file.setContents(stream, true, true, monitor);
			} else {
				stream = new ByteArrayInputStream(def.getBytes(Charsets.UTF_8));
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (MetaModelNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
		}
		String xTextFileName = "file:/" + ModelManager.getWorkspaceAbsolutePath() +'/' + project.getFolder(new Path("/src/" + fileName)).getFullPath();
		String xmiFileName = "file:/" + ModelManager.getWorkspaceAbsolutePath() + '/' + project.getFolder(new Path('/' + mutantName + '/' + fileName.replaceAll("mutator", "model"))).getFullPath();
		WodelUtils.serialize(xTextFileName, xmiFileName);


		if (Platform.getExtensionRegistry() != null) {
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IConfigurationElement[] extensions = Platform
					.getExtensionRegistry().getConfigurationElementsFor(
							"wodel.extension.MutApplication");
			for (int j = 0; j < extensions.length; j++) {
				try {
					final IGenerator src = (IGenerator) extensions[j]
							.createExecutableExtension("class");
					if (wodelExtensions.containsKey(src.getName())) {
						// create a sample file
						monitor.beginTask("Creating " + src.getName()
								+ " files", 6);
						if (wodelExtensions.get(src.getName()) == true) {
							src.doGenerate(fileName, metamodel, projectName, mutantName, project, srcFolder,
									configFolder, monitor);
						}
					}
				} catch (CoreException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}

		monitor.beginTask("Creating tests folder", 8);
		final IFile test = configFolder.getFile(new Path("test.txt"));
		try {
			InputStream stream = openTestStream();
			if (test.exists()) {
				test.setContents(stream, true, true, monitor);
			} else {
				test.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		
		final IFolder iconsFolder = dataFolder.getFolder(new Path("icons"));
		iconsFolder.create(true, true, monitor);

		monitor.beginTask("Creating icons folder", 8);
		try {
			iconsFolder.create(true, true, monitor);
		} catch (CoreException e) {
		}
		try {
		//Bundle bundle = Platform.getBundle("wodel.wodeledu");
		//URL fileURL = bundle.getEntry("content");
		final File jarFile = new File(WodelWizard.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		String srcName = "";
		if (jarFile.isFile()) {
			final JarFile jar = new JarFile(jarFile);
			final Enumeration<JarEntry> entries = jar.entries(); //gives ALL entries in jar
		    while(entries.hasMoreElements()) {
		    	JarEntry entry = entries.nextElement();
		    	if (! entry.isDirectory()) {
		    		if (entry.getName().startsWith("icons/metrics")) {
		    			final File f = iconsFolder.getRawLocation().makeAbsolute().toFile();
		    			File path = new File(f.getPath() + '/' + entry.getName().replace("icons/metrics/", "").split("/")[0]);
		    			if (!path.exists()) {
		    				path.mkdir();
		    			}
		    			File dest = new File(f.getPath() + '/' + entry.getName().replace("icons/metrics/", ""));
		    			InputStream input = jar.getInputStream(entry);
		    			FileOutputStream output = new FileOutputStream(dest);
		    			while (input.available() > 0) {
		    				output.write(input.read());
		    			}
		    			output.close();
		    			input.close();
		    		}
	    		}
		    }
		    jar.close();
		}
		else {
			srcName = WodelWizard.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "icons/metrics";
			//String srcName = FileLocator.resolve(fileURL).getFile();
			//System.out.println("srcNameOtro" + srcNameOtro);
			final File src = new Path(srcName).toFile();
			final File dest = iconsFolder.getRawLocation().makeAbsolute().toFile();
			if ((src != null) && (dest != null)) {
				ModelManager.copyFolder(src, dest);
			}
		}
		} catch (IOException e) {
		}

		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);

	}
	
	/**
	 * Toggles the finish button
	 */
	public boolean canFinish()
	{
		if(getContainer().getCurrentPage() == _pageTwo) {
			if (_pageTwo.valid == true) {
				return true;
			}
		}
		return false;
	}

	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openContentStream() {
		String contents = "";
		return new ByteArrayInputStream(contents.getBytes());
	}

	/**
	 * We will initialize file contents with the name of the model folder and
	 * the name of the mutants folder.
	 */

	private InputStream openConfigStream(String modelName, String mutantName) {
		String contents = modelName + "\n" + mutantName;
		return new ByteArrayInputStream(contents.getBytes());
	}

	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openTestStream() {
		String contents = "";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status = new Status(IStatus.ERROR, "MutatorProject",
				IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

}