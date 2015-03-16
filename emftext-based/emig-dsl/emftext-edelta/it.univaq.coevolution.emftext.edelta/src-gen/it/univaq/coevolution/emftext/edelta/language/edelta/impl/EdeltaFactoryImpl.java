/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.impl;

import it.univaq.coevolution.emftext.edelta.language.edelta.Argument;
import it.univaq.coevolution.emftext.edelta.language.edelta.Attribute;
import it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorCall;
import it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorDef;
import it.univaq.coevolution.emftext.edelta.language.edelta.DataType;
import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory;
import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.FeatureKind;
import it.univaq.coevolution.emftext.edelta.language.edelta.Model;
import it.univaq.coevolution.emftext.edelta.language.edelta.Module;
import it.univaq.coevolution.emftext.edelta.language.edelta.Parameter;
import it.univaq.coevolution.emftext.edelta.language.edelta.Reference;
import it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.Setter;
import it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue;
import it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute;
import it.univaq.coevolution.emftext.edelta.language.edelta.addClass;
import it.univaq.coevolution.emftext.edelta.language.edelta.addPackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.addReference;
import it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute;
import it.univaq.coevolution.emftext.edelta.language.edelta.changeClass;
import it.univaq.coevolution.emftext.edelta.language.edelta.changePackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.changeReference;
import it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute;
import it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass;
import it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference;
import it.univaq.coevolution.emftext.edelta.language.edelta.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdeltaFactoryImpl extends EFactoryImpl implements EdeltaFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EdeltaFactory init()
  {
		try {
			EdeltaFactory theEdeltaFactory = (EdeltaFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emfmigrate.org/edelta"); 
			if (theEdeltaFactory != null) {
				return theEdeltaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdeltaFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EdeltaFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case EdeltaPackage.DATA_TYPE: return createDataType();
			case EdeltaPackage.CLASS: return createClass();
			case EdeltaPackage.ATTRIBUTE_OPERATION: return createAttributeOperation();
			case EdeltaPackage.REFERENCE_OPERATION: return createReferenceOperation();
			case EdeltaPackage.ADD_PACKAGE: return createaddPackage();
			case EdeltaPackage.DELETE_PACKAGE: return createdeletePackage();
			case EdeltaPackage.CHANGE_PACKAGE: return createchangePackage();
			case EdeltaPackage.PACKAGE: return createPackage();
			case EdeltaPackage.MODEL: return createModel();
			case EdeltaPackage.MODULE: return createModule();
			case EdeltaPackage.CHANGE_CLASS: return createchangeClass();
			case EdeltaPackage.DELETE_CLASS: return createdeleteClass();
			case EdeltaPackage.ADD_CLASS: return createaddClass();
			case EdeltaPackage.ATTRIBUTE: return createAttribute();
			case EdeltaPackage.REFERENCE: return createReference();
			case EdeltaPackage.ADD_ATTRIBUTE: return createaddAttribute();
			case EdeltaPackage.DELETE_ATTRIBUTE: return createdeleteAttribute();
			case EdeltaPackage.CHANGE_ATTRIBUTE: return createchangeAttribute();
			case EdeltaPackage.ADD_REFERENCE: return createaddReference();
			case EdeltaPackage.DELETE_REFERENCE: return createdeleteReference();
			case EdeltaPackage.CHANGE_REFERENCE: return createchangeReference();
			case EdeltaPackage.SETTER: return createSetter();
			case EdeltaPackage.SETTER_VALUE: return createSetterValue();
			case EdeltaPackage.PARAMETER: return createParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case EdeltaPackage.FEATURE_KIND:
				return createFeatureKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case EdeltaPackage.FEATURE_KIND:
				return convertFeatureKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataType createDataType()
  {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.coevolution.emftext.edelta.language.edelta.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOperation createAttributeOperation() {
		AttributeOperationImpl attributeOperation = new AttributeOperationImpl();
		return attributeOperation;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceOperation createReferenceOperation() {
		ReferenceOperationImpl referenceOperation = new ReferenceOperationImpl();
		return referenceOperation;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public addPackage createaddPackage() {
		addPackageImpl addPackage = new addPackageImpl();
		return addPackage;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public deletePackage createdeletePackage() {
		deletePackageImpl deletePackage = new deletePackageImpl();
		return deletePackage;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public changePackage createchangePackage() {
		changePackageImpl changePackage = new changePackageImpl();
		return changePackage;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.coevolution.emftext.edelta.language.edelta.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public changeClass createchangeClass() {
		changeClassImpl changeClass = new changeClassImpl();
		return changeClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public deleteClass createdeleteClass() {
		deleteClassImpl deleteClass = new deleteClassImpl();
		return deleteClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public addClass createaddClass() {
		addClassImpl addClass = new addClassImpl();
		return addClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public addAttribute createaddAttribute() {
		addAttributeImpl addAttribute = new addAttributeImpl();
		return addAttribute;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public deleteAttribute createdeleteAttribute() {
		deleteAttributeImpl deleteAttribute = new deleteAttributeImpl();
		return deleteAttribute;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public changeAttribute createchangeAttribute() {
		changeAttributeImpl changeAttribute = new changeAttributeImpl();
		return changeAttribute;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public addReference createaddReference() {
		addReferenceImpl addReference = new addReferenceImpl();
		return addReference;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public deleteReference createdeleteReference() {
		deleteReferenceImpl deleteReference = new deleteReferenceImpl();
		return deleteReference;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public changeReference createchangeReference() {
		changeReferenceImpl changeReference = new changeReferenceImpl();
		return changeReference;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setter createSetter() {
		SetterImpl setter = new SetterImpl();
		return setter;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetterValue createSetterValue() {
		SetterValueImpl setterValue = new SetterValueImpl();
		return setterValue;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FeatureKind createFeatureKindFromString(EDataType eDataType, String initialValue)
  {
		FeatureKind result = FeatureKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertFeatureKindToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EdeltaPackage getEdeltaPackage()
  {
		return (EdeltaPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static EdeltaPackage getPackage()
  {
		return EdeltaPackage.eINSTANCE;
	}

} //EdeltaFactoryImpl
