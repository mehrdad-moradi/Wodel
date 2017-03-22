/*
 * generated by Xtext
 */
package wodel.dsls.ui;

import manager.MutatorChangeListener;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Use this class to register components to be used within the IDE.
 */
public class WodelUiModule extends wodel.dsls.ui.AbstractWodelUiModule {
	public WodelUiModule(AbstractUIPlugin plugin) {
		super(plugin);
		IResourceChangeListener listener = new MutatorChangeListener();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(listener, IResourceChangeEvent.POST_CHANGE);
	}
	public Class<? extends org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage> bindLanguageRootPreferencePage() {
	    return wodel.dsls.ui.customize.CustomizeWodelPreferencePage.class;
	}
}
