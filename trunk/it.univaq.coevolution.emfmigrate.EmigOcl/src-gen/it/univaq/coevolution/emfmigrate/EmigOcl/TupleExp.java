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
 * A representation of the model object '<em><b>Tuple Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp#getTuplePart <em>Tuple Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getTupleExp()
 * @model
 * @generated
 */
public interface TupleExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Tuple Part</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart}.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Part</em>' containment reference list.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getTupleExp_TuplePart()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart#getTuple
	 * @model opposite="tuple" containment="true"
	 * @generated
	 */
	EList<TuplePart> getTuplePart();

} // TupleExp
