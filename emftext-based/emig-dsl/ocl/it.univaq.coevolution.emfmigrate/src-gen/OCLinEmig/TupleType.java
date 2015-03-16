/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OCLinEmig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OCLinEmig.TupleType#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLinEmig.OCLinEmigPackage#getTupleType()
 * @model
 * @generated
 */
public interface TupleType extends OclType {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link OCLinEmig.TupleTypeAttribute}.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.TupleTypeAttribute#getTupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see OCLinEmig.OCLinEmigPackage#getTupleType_Attributes()
	 * @see OCLinEmig.TupleTypeAttribute#getTupleType
	 * @model opposite="tupleType" containment="true"
	 * @generated
	 */
	EList<TupleTypeAttribute> getAttributes();

} // TupleType
