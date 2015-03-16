/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig.impl;

import it.univaq.coevolution.emfmigrate.emig.EmigPackage;
import it.univaq.coevolution.emfmigrate.emig.LocatedElement;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Located Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link it.univaq.coevolution.emfmigrate.emig.impl.LocatedElementImpl#getLine
 * <em>Line</em>}</li>
 * <li>
 * {@link it.univaq.coevolution.emfmigrate.emig.impl.LocatedElementImpl#getEndline
 * <em>Endline</em>}</li>
 * <li>
 * {@link it.univaq.coevolution.emfmigrate.emig.impl.LocatedElementImpl#getOffset
 * <em>Offset</em>}</li>
 * <li>
 * {@link it.univaq.coevolution.emfmigrate.emig.impl.LocatedElementImpl#getEndoffset
 * <em>Endoffset</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class LocatedElementImpl extends MinimalEObjectImpl.Container implements
		LocatedElement {
	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getEndline() <em>Endline</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEndline()
	 * @generated
	 * @ordered
	 */
	protected static final int ENDLINE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getEndoffset() <em>Endoffset</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEndoffset()
	 * @generated
	 * @ordered
	 */
	protected static final int ENDOFFSET_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LocatedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmigPackage.Literals.LOCATED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getLine() {
		return NodeModelUtils.getNode(this).getTotalStartLine();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getEndline() {
		return NodeModelUtils.getNode(this).getTotalEndLine();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getOffset() {
		return NodeModelUtils.getNode(this).getTotalOffset();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getEndoffset() {
		return NodeModelUtils.getNode(this).getTotalEndOffset();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EmigPackage.LOCATED_ELEMENT__LINE:
			return getLine();
		case EmigPackage.LOCATED_ELEMENT__ENDLINE:
			return getEndline();
		case EmigPackage.LOCATED_ELEMENT__OFFSET:
			return getOffset();
		case EmigPackage.LOCATED_ELEMENT__ENDOFFSET:
			return getEndoffset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EmigPackage.LOCATED_ELEMENT__LINE:
			return getLine() != LINE_EDEFAULT;
		case EmigPackage.LOCATED_ELEMENT__ENDLINE:
			return getEndline() != ENDLINE_EDEFAULT;
		case EmigPackage.LOCATED_ELEMENT__OFFSET:
			return getOffset() != OFFSET_EDEFAULT;
		case EmigPackage.LOCATED_ELEMENT__ENDOFFSET:
			return getEndoffset() != ENDOFFSET_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // LocatedElementImpl
