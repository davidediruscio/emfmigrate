
package it.univaq.coevolution;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MigrationStandaloneSetup extends MigrationStandaloneSetupGenerated{

	public static void doSetup() {
		new MigrationStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

