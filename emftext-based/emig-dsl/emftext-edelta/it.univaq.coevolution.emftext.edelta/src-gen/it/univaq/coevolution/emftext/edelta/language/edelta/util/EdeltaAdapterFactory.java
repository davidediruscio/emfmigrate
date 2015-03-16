/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.util;

import it.univaq.coevolution.emftext.edelta.language.edelta.Argument;
import it.univaq.coevolution.emftext.edelta.language.edelta.AtomicOperator;
import it.univaq.coevolution.emftext.edelta.language.edelta.Attribute;
import it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorCall;
import it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorDef;
import it.univaq.coevolution.emftext.edelta.language.edelta.DataType;
import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.Feature;
import it.univaq.coevolution.emftext.edelta.language.edelta.FeatureOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.Model;
import it.univaq.coevolution.emftext.edelta.language.edelta.Module;
import it.univaq.coevolution.emftext.edelta.language.edelta.NamedElement;
import it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.Parameter;
import it.univaq.coevolution.emftext.edelta.language.edelta.Reference;
import it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.Setter;
import it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue;
import it.univaq.coevolution.emftext.edelta.language.edelta.Type;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage
 * @generated
 */
public class EdeltaAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EdeltaPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EdeltaAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = EdeltaPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EdeltaSwitch<Adapter> modelSwitch =
    new EdeltaSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseClass(it.univaq.coevolution.emftext.edelta.language.edelta.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter casePackageOperation(PackageOperation object) {
				return createPackageOperationAdapter();
			}
			@Override
			public Adapter caseFeatureOperation(FeatureOperation object) {
				return createFeatureOperationAdapter();
			}
			@Override
			public Adapter caseAttributeOperation(AttributeOperation object) {
				return createAttributeOperationAdapter();
			}
			@Override
			public Adapter caseReferenceOperation(ReferenceOperation object) {
				return createReferenceOperationAdapter();
			}
			@Override
			public Adapter caseAtomicOperator(AtomicOperator object) {
				return createAtomicOperatorAdapter();
			}
			@Override
			public Adapter caseaddPackage(addPackage object) {
				return createaddPackageAdapter();
			}
			@Override
			public Adapter casedeletePackage(deletePackage object) {
				return createdeletePackageAdapter();
			}
			@Override
			public Adapter casechangePackage(changePackage object) {
				return createchangePackageAdapter();
			}
			@Override
			public Adapter casePackage(it.univaq.coevolution.emftext.edelta.language.edelta.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseClassOperation(ClassOperation object) {
				return createClassOperationAdapter();
			}
			@Override
			public Adapter casechangeClass(changeClass object) {
				return createchangeClassAdapter();
			}
			@Override
			public Adapter casedeleteClass(deleteClass object) {
				return createdeleteClassAdapter();
			}
			@Override
			public Adapter caseaddClass(addClass object) {
				return createaddClassAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseaddAttribute(addAttribute object) {
				return createaddAttributeAdapter();
			}
			@Override
			public Adapter casedeleteAttribute(deleteAttribute object) {
				return createdeleteAttributeAdapter();
			}
			@Override
			public Adapter casechangeAttribute(changeAttribute object) {
				return createchangeAttributeAdapter();
			}
			@Override
			public Adapter caseaddReference(addReference object) {
				return createaddReferenceAdapter();
			}
			@Override
			public Adapter casedeleteReference(deleteReference object) {
				return createdeleteReferenceAdapter();
			}
			@Override
			public Adapter casechangeReference(changeReference object) {
				return createchangeReferenceAdapter();
			}
			@Override
			public Adapter caseSetter(Setter object) {
				return createSetterAdapter();
			}
			@Override
			public Adapter caseSetterValue(SetterValue object) {
				return createSetterValueAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.NamedElement
	 * @generated
	 */
  public Adapter createNamedElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Type
	 * @generated
	 */
  public Adapter createTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.DataType
	 * @generated
	 */
  public Adapter createDataTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation <em>Package Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation
	 * @generated
	 */
	public Adapter createPackageOperationAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.FeatureOperation <em>Feature Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.FeatureOperation
	 * @generated
	 */
	public Adapter createFeatureOperationAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation <em>Attribute Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation
	 * @generated
	 */
	public Adapter createAttributeOperationAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation <em>Reference Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation
	 * @generated
	 */
	public Adapter createReferenceOperationAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.AtomicOperator <em>Atomic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.AtomicOperator
	 * @generated
	 */
	public Adapter createAtomicOperatorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.addPackage <em>add Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.addPackage
	 * @generated
	 */
	public Adapter createaddPackageAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage <em>delete Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage
	 * @generated
	 */
	public Adapter createdeletePackageAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changePackage <em>change Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changePackage
	 * @generated
	 */
	public Adapter createchangePackageAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation <em>Class Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation
	 * @generated
	 */
	public Adapter createClassOperationAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeClass <em>change Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changeClass
	 * @generated
	 */
	public Adapter createchangeClassAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass <em>delete Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass
	 * @generated
	 */
	public Adapter createdeleteClassAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.addClass <em>add Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.addClass
	 * @generated
	 */
	public Adapter createaddClassAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Feature
	 * @generated
	 */
  public Adapter createFeatureAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute <em>add Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute
	 * @generated
	 */
	public Adapter createaddAttributeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute <em>delete Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute
	 * @generated
	 */
	public Adapter createdeleteAttributeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute <em>change Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute
	 * @generated
	 */
	public Adapter createchangeAttributeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.addReference <em>add Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.addReference
	 * @generated
	 */
	public Adapter createaddReferenceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference <em>delete Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference
	 * @generated
	 */
	public Adapter createdeleteReferenceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeReference <em>change Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changeReference
	 * @generated
	 */
	public Adapter createchangeReferenceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Setter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Setter
	 * @generated
	 */
	public Adapter createSetterAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue <em>Setter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue
	 * @generated
	 */
	public Adapter createSetterValueAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //EdeltaAdapterFactory
