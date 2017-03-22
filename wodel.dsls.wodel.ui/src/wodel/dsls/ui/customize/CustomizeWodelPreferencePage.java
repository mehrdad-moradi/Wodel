package wodel.dsls.ui.customize;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage;
import org.eclipse.xtext.ui.editor.preferences.fields.LabelFieldEditor;

import postprocessor.run.IPostprocessor;
import registry.run.IRegistryPostprocessor;

public class CustomizeWodelPreferencePage extends LanguageRootPreferencePage {
	
    @Override
    protected void createFieldEditors() {
    	new LabelFieldEditor("Check this box if you want to generate a registry of the mutations", getFieldEditorParent());
    	addField(new BooleanFieldEditor("Generate registry", "Generate registry", getFieldEditorParent()));
    	new LabelFieldEditor("Choose wich extension you would like to apply for postprocessing", getFieldEditorParent());
    	if (Platform.getExtensionRegistry() != null) {
			IConfigurationElement[] extensions = Platform
					.getExtensionRegistry()
					.getConfigurationElementsFor(
							"wodel.postprocessor.MutPostprocessor");
			for (int j = 0; j < extensions.length; j++) {
				IPostprocessor src = null;
				try {
					src = (IPostprocessor) extensions[j]
							.createExecutableExtension("class");
				} catch (CoreException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				addField(new BooleanFieldEditor(src.getName(), src.getName(), getFieldEditorParent()));
			}
		}
    	if (Platform.getExtensionRegistry() != null) {
			IConfigurationElement[] extensions = Platform
					.getExtensionRegistry()
					.getConfigurationElementsFor(
							"wodel.registry.MutRegistryPostprocessor");
			for (int j = 0; j < extensions.length; j++) {
				IRegistryPostprocessor src = null;
				try {
					src = (IRegistryPostprocessor) extensions[j]
							.createExecutableExtension("class");
				} catch (CoreException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				addField(new BooleanFieldEditor(src.getName(), src.getName(), getFieldEditorParent()));
			}
		}
    	new LabelFieldEditor("Check this box if you want to filter concrete classes on metrics", getFieldEditorParent());
    	addField(new BooleanFieldEditor("Filter concrete classes", "Filter concrete classes", getFieldEditorParent()));
    	new LabelFieldEditor("Check this box if you want to generate metrics of the mutations", getFieldEditorParent());
    	addField(new BooleanFieldEditor("Generate mutant metrics", "Generate mutant metrics", getFieldEditorParent()));
    	new LabelFieldEditor("Check this box if you want to generate debug metrics of the mutations", getFieldEditorParent());
    	addField(new BooleanFieldEditor("Generate debug mutant metrics", "Generate debug mutant metrics", getFieldEditorParent()));
    	new LabelFieldEditor("Check this box if you want to generate all the metrics related to the original seed models", getFieldEditorParent());
    	addField(new BooleanFieldEditor("Base metrics", "Base metrics", getFieldEditorParent()));
    	new LabelFieldEditor("\n\nWrite which number of attempts will be executed until assuring mutant is unique", getFieldEditorParent());
    	addField(new StringFieldEditor("Number of attempts", "", 8, getFieldEditorParent()));
    	new LabelFieldEditor("\n\n", getFieldEditorParent());
    	new LabelFieldEditor("Write the top number of mutants that will be generated by default", getFieldEditorParent());
    	addField(new StringFieldEditor("Number of mutants", "", 8, getFieldEditorParent()));
    }
    @Override
    public void init(IWorkbench workbench) {
    	if (Platform.getExtensionRegistry() != null) {
			IConfigurationElement[] extensions = Platform
					.getExtensionRegistry()
					.getConfigurationElementsFor(
							"wodel.postprocessor.MutPostprocessor");
			for (int j = 0; j < extensions.length; j++) {
				IPostprocessor src = null;
				try {
					src = (IPostprocessor) extensions[j]
							.createExecutableExtension("class");
				} catch (CoreException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				getPreferenceStore().setDefault(src.getName(), false);
			}
		}
    }

}
