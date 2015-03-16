
package it.univaq.coevolution.emfmigrate;

import it.univaq.coevolution.emfmigrate.EmigStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EmigStandaloneSetup extends EmigStandaloneSetupGenerated{

	public static void doSetup() {
		new EmigStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

