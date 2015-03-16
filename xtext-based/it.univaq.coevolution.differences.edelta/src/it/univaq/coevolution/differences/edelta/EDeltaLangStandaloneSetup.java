
package it.univaq.coevolution.differences.edelta;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EDeltaLangStandaloneSetup extends EDeltaLangStandaloneSetupGenerated{

	public static void doSetup() {
		new EDeltaLangStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

