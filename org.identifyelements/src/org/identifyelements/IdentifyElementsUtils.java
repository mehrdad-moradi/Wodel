package org.identifyelements;

import java.io.IOException;

import mutatorenvironment.MutatorenvironmentPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class IdentifyElementsUtils {

	/**
	 * @param model
	 *            Model one wants to output
	 * @param outputURI
	 *            URI of the new created Model
	 */
	public static void serialize(String xTextURI, String outputURI) {
		EPackage.Registry.INSTANCE.put(MutatorenvironmentPackage.eNS_URI,  MutatorenvironmentPackage.eINSTANCE);
		
		Injector injector = new IdentifyElementsStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet xTextRS = injector.getInstance(XtextResourceSet.class);
		System.out.println("xTextURI: " + xTextURI);
		System.out.println("outputURI: " + outputURI);
		XtextResource xtextInput = (XtextResource)xTextRS.getResource(URI.createURI(xTextURI), true);
		EcoreUtil.resolveAll(xtextInput);
		
		//create an empty xmi resource
		ResourceSet xmiRS = new ResourceSetImpl();
		Resource xmiOutput = xmiRS.createResource(URI.createURI(outputURI));
		
		xmiOutput.getContents().add(xtextInput.getContents().get(0));
		try {
			xmiOutput.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
