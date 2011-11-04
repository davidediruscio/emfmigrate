/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.Iterator#getLoopExpr <em>Loop Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getIterator()
 * @model
 * @generated
 */
public interface Iterator extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Loop Expr</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp#getIterators <em>Iterators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Expr</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Expr</em>' container reference.
	 * @see #setLoopExpr(LoopExp)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getIterator_LoopExpr()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp#getIterators
	 * @model opposite="iterators" transient="false" ordered="false"
	 * @generated
	 */
	LoopExp getLoopExpr();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Iterator#getLoopExpr <em>Loop Expr</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Expr</em>' container reference.
	 * @see #getLoopExpr()
	 * @generated
	 */
	void setLoopExpr(LoopExp value);

} // Iterator
