/*
 * generated by Xtext
 */
package org.configureoptions;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ConfigureOptionsStandaloneSetup extends ConfigureOptionsStandaloneSetupGenerated{

	public static void doSetup() {
		new ConfigureOptionsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

