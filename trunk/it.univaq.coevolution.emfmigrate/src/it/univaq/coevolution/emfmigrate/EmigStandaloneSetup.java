
package it.univaq.coevolution.emfmigrate;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EmigStandaloneSetup extends EmigStandaloneSetupGenerated{

	public static void doSetup() {
		new EmigStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

