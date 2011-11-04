/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapExp#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getMapExp()
 * @model
 * @generated
 */
public interface MapExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emfmigrate.EmigOcl.MapElement}.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapElement#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getMapExp_Elements()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapElement#getMap
	 * @model opposite="map" containment="true"
	 * @generated
	 */
	EList<MapElement> getElements();

} // MapExp
