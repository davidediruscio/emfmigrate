/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.launch;

/**
 * A class that provides the tabs for the launch configuration.
 */
public class EdeltaLaunchConfigurationTabGroup extends org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup {
	
	public void createTabs(org.eclipse.debug.ui.ILaunchConfigurationDialog dialog, String mode) {
		// Set the overrideLaunchConfigurationTabGroup option to false to implement this
		// method.
		setTabs(new org.eclipse.debug.ui.ILaunchConfigurationTab[] {new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.launch.EdeltaLaunchConfigurationMainTab()});
	}
	
}
