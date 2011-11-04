/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui;

public class EmigOclAnnotationModel extends org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel {
	
	public EmigOclAnnotationModel(org.eclipse.core.resources.IResource resource) {
		super(resource);
	}
	
	protected org.eclipse.ui.texteditor.MarkerAnnotation createMarkerAnnotation(org.eclipse.core.resources.IMarker marker) {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclMarkerAnnotation(marker);
	}
	
}
