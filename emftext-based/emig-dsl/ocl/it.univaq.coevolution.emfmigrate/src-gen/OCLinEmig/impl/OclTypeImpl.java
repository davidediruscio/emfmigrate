/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OCLinEmig.impl;

import OCLinEmig.Attribute;
import OCLinEmig.CollectionType;
import OCLinEmig.MapType;
import OCLinEmig.OCLinEmigPackage;
import OCLinEmig.OclContextDefinition;
import OCLinEmig.OclExpression;
import OCLinEmig.OclType;
import OCLinEmig.Operation;
import OCLinEmig.TupleTypeAttribute;
import OCLinEmig.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocl Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OCLinEmig.impl.OclTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link OCLinEmig.impl.OclTypeImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link OCLinEmig.impl.OclTypeImpl#getOclExpression <em>Ocl Expression</em>}</li>
 *   <li>{@link OCLinEmig.impl.OclTypeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link OCLinEmig.impl.OclTypeImpl#getMapType2 <em>Map Type2</em>}</li>
 *   <li>{@link OCLinEmig.impl.OclTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link OCLinEmig.impl.OclTypeImpl#getMapType <em>Map Type</em>}</li>
 *   <li>{@link OCLinEmig.impl.OclTypeImpl#getCollectionTypes <em>Collection Types</em>}</li>
 *   <li>{@link OCLinEmig.impl.OclTypeImpl#getTupleTypeAttribute <em>Tuple Type Attribute</em>}</li>
 *   <li>{@link OCLinEmig.impl.OclTypeImpl#getVariableDeclaration <em>Variable Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OclTypeImpl extends OclExpressionImpl implements OclType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OclTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLinEmigPackage.Literals.OCL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLinEmigPackage.OCL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclContextDefinition getDefinitions() {
		if (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__DEFINITIONS) return null;
		return (OclContextDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitions(OclContextDefinition newDefinitions, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDefinitions, OCLinEmigPackage.OCL_TYPE__DEFINITIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitions(OclContextDefinition newDefinitions) {
		if (newDefinitions != eInternalContainer() || (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__DEFINITIONS && newDefinitions != null)) {
			if (EcoreUtil.isAncestor(this, newDefinitions))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDefinitions != null)
				msgs = ((InternalEObject)newDefinitions).eInverseAdd(this, OCLinEmigPackage.OCL_CONTEXT_DEFINITION__CONTEXT_, OclContextDefinition.class, msgs);
			msgs = basicSetDefinitions(newDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLinEmigPackage.OCL_TYPE__DEFINITIONS, newDefinitions, newDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getOclExpression() {
		if (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__OCL_EXPRESSION) return null;
		return (OclExpression)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOclExpression(OclExpression newOclExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOclExpression, OCLinEmigPackage.OCL_TYPE__OCL_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOclExpression(OclExpression newOclExpression) {
		if (newOclExpression != eInternalContainer() || (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__OCL_EXPRESSION && newOclExpression != null)) {
			if (EcoreUtil.isAncestor(this, newOclExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOclExpression != null)
				msgs = ((InternalEObject)newOclExpression).eInverseAdd(this, OCLinEmigPackage.OCL_EXPRESSION__TYPE, OclExpression.class, msgs);
			msgs = basicSetOclExpression(newOclExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLinEmigPackage.OCL_TYPE__OCL_EXPRESSION, newOclExpression, newOclExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__OPERATION) return null;
		return (Operation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOperation, OCLinEmigPackage.OCL_TYPE__OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != eInternalContainer() || (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__OPERATION && newOperation != null)) {
			if (EcoreUtil.isAncestor(this, newOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, OCLinEmigPackage.OPERATION__RETURN_TYPE, Operation.class, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLinEmigPackage.OCL_TYPE__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getMapType2() {
		if (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__MAP_TYPE2) return null;
		return (MapType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapType2(MapType newMapType2, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMapType2, OCLinEmigPackage.OCL_TYPE__MAP_TYPE2, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapType2(MapType newMapType2) {
		if (newMapType2 != eInternalContainer() || (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__MAP_TYPE2 && newMapType2 != null)) {
			if (EcoreUtil.isAncestor(this, newMapType2))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMapType2 != null)
				msgs = ((InternalEObject)newMapType2).eInverseAdd(this, OCLinEmigPackage.MAP_TYPE__VALUE_TYPE, MapType.class, msgs);
			msgs = basicSetMapType2(newMapType2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLinEmigPackage.OCL_TYPE__MAP_TYPE2, newMapType2, newMapType2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		if (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__ATTRIBUTE) return null;
		return (Attribute)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute(Attribute newAttribute, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAttribute, OCLinEmigPackage.OCL_TYPE__ATTRIBUTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		if (newAttribute != eInternalContainer() || (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__ATTRIBUTE && newAttribute != null)) {
			if (EcoreUtil.isAncestor(this, newAttribute))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAttribute != null)
				msgs = ((InternalEObject)newAttribute).eInverseAdd(this, OCLinEmigPackage.ATTRIBUTE__TYPE, Attribute.class, msgs);
			msgs = basicSetAttribute(newAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLinEmigPackage.OCL_TYPE__ATTRIBUTE, newAttribute, newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getMapType() {
		if (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__MAP_TYPE) return null;
		return (MapType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapType(MapType newMapType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMapType, OCLinEmigPackage.OCL_TYPE__MAP_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapType(MapType newMapType) {
		if (newMapType != eInternalContainer() || (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__MAP_TYPE && newMapType != null)) {
			if (EcoreUtil.isAncestor(this, newMapType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMapType != null)
				msgs = ((InternalEObject)newMapType).eInverseAdd(this, OCLinEmigPackage.MAP_TYPE__KEY_TYPE, MapType.class, msgs);
			msgs = basicSetMapType(newMapType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLinEmigPackage.OCL_TYPE__MAP_TYPE, newMapType, newMapType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType getCollectionTypes() {
		if (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__COLLECTION_TYPES) return null;
		return (CollectionType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectionTypes(CollectionType newCollectionTypes, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCollectionTypes, OCLinEmigPackage.OCL_TYPE__COLLECTION_TYPES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionTypes(CollectionType newCollectionTypes) {
		if (newCollectionTypes != eInternalContainer() || (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__COLLECTION_TYPES && newCollectionTypes != null)) {
			if (EcoreUtil.isAncestor(this, newCollectionTypes))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCollectionTypes != null)
				msgs = ((InternalEObject)newCollectionTypes).eInverseAdd(this, OCLinEmigPackage.COLLECTION_TYPE__ELEMENT_TYPE, CollectionType.class, msgs);
			msgs = basicSetCollectionTypes(newCollectionTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLinEmigPackage.OCL_TYPE__COLLECTION_TYPES, newCollectionTypes, newCollectionTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleTypeAttribute getTupleTypeAttribute() {
		if (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE) return null;
		return (TupleTypeAttribute)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTupleTypeAttribute(TupleTypeAttribute newTupleTypeAttribute, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTupleTypeAttribute, OCLinEmigPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTupleTypeAttribute(TupleTypeAttribute newTupleTypeAttribute) {
		if (newTupleTypeAttribute != eInternalContainer() || (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE && newTupleTypeAttribute != null)) {
			if (EcoreUtil.isAncestor(this, newTupleTypeAttribute))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTupleTypeAttribute != null)
				msgs = ((InternalEObject)newTupleTypeAttribute).eInverseAdd(this, OCLinEmigPackage.TUPLE_TYPE_ATTRIBUTE__TYPE, TupleTypeAttribute.class, msgs);
			msgs = basicSetTupleTypeAttribute(newTupleTypeAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLinEmigPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE, newTupleTypeAttribute, newTupleTypeAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration getVariableDeclaration() {
		if (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__VARIABLE_DECLARATION) return null;
		return (VariableDeclaration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDeclaration(VariableDeclaration newVariableDeclaration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVariableDeclaration, OCLinEmigPackage.OCL_TYPE__VARIABLE_DECLARATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDeclaration(VariableDeclaration newVariableDeclaration) {
		if (newVariableDeclaration != eInternalContainer() || (eContainerFeatureID() != OCLinEmigPackage.OCL_TYPE__VARIABLE_DECLARATION && newVariableDeclaration != null)) {
			if (EcoreUtil.isAncestor(this, newVariableDeclaration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariableDeclaration != null)
				msgs = ((InternalEObject)newVariableDeclaration).eInverseAdd(this, OCLinEmigPackage.VARIABLE_DECLARATION__TYPE, VariableDeclaration.class, msgs);
			msgs = basicSetVariableDeclaration(newVariableDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLinEmigPackage.OCL_TYPE__VARIABLE_DECLARATION, newVariableDeclaration, newVariableDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCLinEmigPackage.OCL_TYPE__DEFINITIONS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDefinitions((OclContextDefinition)otherEnd, msgs);
			case OCLinEmigPackage.OCL_TYPE__OCL_EXPRESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOclExpression((OclExpression)otherEnd, msgs);
			case OCLinEmigPackage.OCL_TYPE__OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOperation((Operation)otherEnd, msgs);
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE2:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMapType2((MapType)otherEnd, msgs);
			case OCLinEmigPackage.OCL_TYPE__ATTRIBUTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAttribute((Attribute)otherEnd, msgs);
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMapType((MapType)otherEnd, msgs);
			case OCLinEmigPackage.OCL_TYPE__COLLECTION_TYPES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCollectionTypes((CollectionType)otherEnd, msgs);
			case OCLinEmigPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTupleTypeAttribute((TupleTypeAttribute)otherEnd, msgs);
			case OCLinEmigPackage.OCL_TYPE__VARIABLE_DECLARATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariableDeclaration((VariableDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCLinEmigPackage.OCL_TYPE__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case OCLinEmigPackage.OCL_TYPE__OCL_EXPRESSION:
				return basicSetOclExpression(null, msgs);
			case OCLinEmigPackage.OCL_TYPE__OPERATION:
				return basicSetOperation(null, msgs);
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE2:
				return basicSetMapType2(null, msgs);
			case OCLinEmigPackage.OCL_TYPE__ATTRIBUTE:
				return basicSetAttribute(null, msgs);
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE:
				return basicSetMapType(null, msgs);
			case OCLinEmigPackage.OCL_TYPE__COLLECTION_TYPES:
				return basicSetCollectionTypes(null, msgs);
			case OCLinEmigPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				return basicSetTupleTypeAttribute(null, msgs);
			case OCLinEmigPackage.OCL_TYPE__VARIABLE_DECLARATION:
				return basicSetVariableDeclaration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OCLinEmigPackage.OCL_TYPE__DEFINITIONS:
				return eInternalContainer().eInverseRemove(this, OCLinEmigPackage.OCL_CONTEXT_DEFINITION__CONTEXT_, OclContextDefinition.class, msgs);
			case OCLinEmigPackage.OCL_TYPE__OCL_EXPRESSION:
				return eInternalContainer().eInverseRemove(this, OCLinEmigPackage.OCL_EXPRESSION__TYPE, OclExpression.class, msgs);
			case OCLinEmigPackage.OCL_TYPE__OPERATION:
				return eInternalContainer().eInverseRemove(this, OCLinEmigPackage.OPERATION__RETURN_TYPE, Operation.class, msgs);
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE2:
				return eInternalContainer().eInverseRemove(this, OCLinEmigPackage.MAP_TYPE__VALUE_TYPE, MapType.class, msgs);
			case OCLinEmigPackage.OCL_TYPE__ATTRIBUTE:
				return eInternalContainer().eInverseRemove(this, OCLinEmigPackage.ATTRIBUTE__TYPE, Attribute.class, msgs);
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE:
				return eInternalContainer().eInverseRemove(this, OCLinEmigPackage.MAP_TYPE__KEY_TYPE, MapType.class, msgs);
			case OCLinEmigPackage.OCL_TYPE__COLLECTION_TYPES:
				return eInternalContainer().eInverseRemove(this, OCLinEmigPackage.COLLECTION_TYPE__ELEMENT_TYPE, CollectionType.class, msgs);
			case OCLinEmigPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				return eInternalContainer().eInverseRemove(this, OCLinEmigPackage.TUPLE_TYPE_ATTRIBUTE__TYPE, TupleTypeAttribute.class, msgs);
			case OCLinEmigPackage.OCL_TYPE__VARIABLE_DECLARATION:
				return eInternalContainer().eInverseRemove(this, OCLinEmigPackage.VARIABLE_DECLARATION__TYPE, VariableDeclaration.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCLinEmigPackage.OCL_TYPE__NAME:
				return getName();
			case OCLinEmigPackage.OCL_TYPE__DEFINITIONS:
				return getDefinitions();
			case OCLinEmigPackage.OCL_TYPE__OCL_EXPRESSION:
				return getOclExpression();
			case OCLinEmigPackage.OCL_TYPE__OPERATION:
				return getOperation();
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE2:
				return getMapType2();
			case OCLinEmigPackage.OCL_TYPE__ATTRIBUTE:
				return getAttribute();
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE:
				return getMapType();
			case OCLinEmigPackage.OCL_TYPE__COLLECTION_TYPES:
				return getCollectionTypes();
			case OCLinEmigPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				return getTupleTypeAttribute();
			case OCLinEmigPackage.OCL_TYPE__VARIABLE_DECLARATION:
				return getVariableDeclaration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCLinEmigPackage.OCL_TYPE__NAME:
				setName((String)newValue);
				return;
			case OCLinEmigPackage.OCL_TYPE__DEFINITIONS:
				setDefinitions((OclContextDefinition)newValue);
				return;
			case OCLinEmigPackage.OCL_TYPE__OCL_EXPRESSION:
				setOclExpression((OclExpression)newValue);
				return;
			case OCLinEmigPackage.OCL_TYPE__OPERATION:
				setOperation((Operation)newValue);
				return;
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE2:
				setMapType2((MapType)newValue);
				return;
			case OCLinEmigPackage.OCL_TYPE__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE:
				setMapType((MapType)newValue);
				return;
			case OCLinEmigPackage.OCL_TYPE__COLLECTION_TYPES:
				setCollectionTypes((CollectionType)newValue);
				return;
			case OCLinEmigPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				setTupleTypeAttribute((TupleTypeAttribute)newValue);
				return;
			case OCLinEmigPackage.OCL_TYPE__VARIABLE_DECLARATION:
				setVariableDeclaration((VariableDeclaration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OCLinEmigPackage.OCL_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OCLinEmigPackage.OCL_TYPE__DEFINITIONS:
				setDefinitions((OclContextDefinition)null);
				return;
			case OCLinEmigPackage.OCL_TYPE__OCL_EXPRESSION:
				setOclExpression((OclExpression)null);
				return;
			case OCLinEmigPackage.OCL_TYPE__OPERATION:
				setOperation((Operation)null);
				return;
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE2:
				setMapType2((MapType)null);
				return;
			case OCLinEmigPackage.OCL_TYPE__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE:
				setMapType((MapType)null);
				return;
			case OCLinEmigPackage.OCL_TYPE__COLLECTION_TYPES:
				setCollectionTypes((CollectionType)null);
				return;
			case OCLinEmigPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				setTupleTypeAttribute((TupleTypeAttribute)null);
				return;
			case OCLinEmigPackage.OCL_TYPE__VARIABLE_DECLARATION:
				setVariableDeclaration((VariableDeclaration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OCLinEmigPackage.OCL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OCLinEmigPackage.OCL_TYPE__DEFINITIONS:
				return getDefinitions() != null;
			case OCLinEmigPackage.OCL_TYPE__OCL_EXPRESSION:
				return getOclExpression() != null;
			case OCLinEmigPackage.OCL_TYPE__OPERATION:
				return getOperation() != null;
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE2:
				return getMapType2() != null;
			case OCLinEmigPackage.OCL_TYPE__ATTRIBUTE:
				return getAttribute() != null;
			case OCLinEmigPackage.OCL_TYPE__MAP_TYPE:
				return getMapType() != null;
			case OCLinEmigPackage.OCL_TYPE__COLLECTION_TYPES:
				return getCollectionTypes() != null;
			case OCLinEmigPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE:
				return getTupleTypeAttribute() != null;
			case OCLinEmigPackage.OCL_TYPE__VARIABLE_DECLARATION:
				return getVariableDeclaration() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OclTypeImpl
