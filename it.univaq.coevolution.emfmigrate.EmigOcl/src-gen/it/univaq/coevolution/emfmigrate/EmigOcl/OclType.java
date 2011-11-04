/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getOclExpression <em>Ocl Expression</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getOperation <em>Operation</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getMapType2 <em>Map Type2</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getMapType <em>Map Type</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getCollectionTypes <em>Collection Types</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getTupleTypeAttribute <em>Tuple Type Attribute</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getVariableDeclaration <em>Variable Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getOclType()
 * @model
 * @generated
 */
public interface OclType extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getOclType_Name()
	 * @model unique="false" dataType="it.univaq.coevolution.emfmigrate.EmigOcl.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition#getContext_ <em>Context </em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' container reference.
	 * @see #setDefinitions(OclContextDefinition)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getOclType_Definitions()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition#getContext_
	 * @model opposite="context_" transient="false" ordered="false"
	 * @generated
	 */
	OclContextDefinition getDefinitions();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getDefinitions <em>Definitions</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitions</em>' container reference.
	 * @see #getDefinitions()
	 * @generated
	 */
	void setDefinitions(OclContextDefinition value);

	/**
	 * Returns the value of the '<em><b>Ocl Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Expression</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Expression</em>' container reference.
	 * @see #setOclExpression(OclExpression)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getOclType_OclExpression()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getType
	 * @model opposite="type" transient="false" ordered="false"
	 * @generated
	 */
	OclExpression getOclExpression();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getOclExpression <em>Ocl Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl Expression</em>' container reference.
	 * @see #getOclExpression()
	 * @generated
	 */
	void setOclExpression(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getOclType_Operation()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Operation#getReturnType
	 * @model opposite="returnType" transient="false" ordered="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Map Type2</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Type2</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Type2</em>' container reference.
	 * @see #setMapType2(MapType)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getOclType_MapType2()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapType#getValueType
	 * @model opposite="valueType" transient="false" ordered="false"
	 * @generated
	 */
	MapType getMapType2();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getMapType2 <em>Map Type2</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Type2</em>' container reference.
	 * @see #getMapType2()
	 * @generated
	 */
	void setMapType2(MapType value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' container reference.
	 * @see #setAttribute(Attribute)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getOclType_Attribute()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Attribute#getType
	 * @model opposite="type" transient="false" ordered="false"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getAttribute <em>Attribute</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' container reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Map Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapType#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Type</em>' container reference.
	 * @see #setMapType(MapType)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getOclType_MapType()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapType#getKeyType
	 * @model opposite="keyType" transient="false" ordered="false"
	 * @generated
	 */
	MapType getMapType();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getMapType <em>Map Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Type</em>' container reference.
	 * @see #getMapType()
	 * @generated
	 */
	void setMapType(MapType value);

	/**
	 * Returns the value of the '<em><b>Collection Types</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Types</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Types</em>' container reference.
	 * @see #setCollectionTypes(CollectionType)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getOclType_CollectionTypes()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType#getElementType
	 * @model opposite="elementType" transient="false" ordered="false"
	 * @generated
	 */
	CollectionType getCollectionTypes();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getCollectionTypes <em>Collection Types</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Types</em>' container reference.
	 * @see #getCollectionTypes()
	 * @generated
	 */
	void setCollectionTypes(CollectionType value);

	/**
	 * Returns the value of the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Type Attribute</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Type Attribute</em>' container reference.
	 * @see #setTupleTypeAttribute(TupleTypeAttribute)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getOclType_TupleTypeAttribute()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getType
	 * @model opposite="type" transient="false" ordered="false"
	 * @generated
	 */
	TupleTypeAttribute getTupleTypeAttribute();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getTupleTypeAttribute <em>Tuple Type Attribute</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Type Attribute</em>' container reference.
	 * @see #getTupleTypeAttribute()
	 * @generated
	 */
	void setTupleTypeAttribute(TupleTypeAttribute value);

	/**
	 * Returns the value of the '<em><b>Variable Declaration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Declaration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration</em>' container reference.
	 * @see #setVariableDeclaration(VariableDeclaration)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getOclType_VariableDeclaration()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration#getType
	 * @model opposite="type" transient="false" ordered="false"
	 * @generated
	 */
	VariableDeclaration getVariableDeclaration();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getVariableDeclaration <em>Variable Declaration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Declaration</em>' container reference.
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	void setVariableDeclaration(VariableDeclaration value);

} // OclType
