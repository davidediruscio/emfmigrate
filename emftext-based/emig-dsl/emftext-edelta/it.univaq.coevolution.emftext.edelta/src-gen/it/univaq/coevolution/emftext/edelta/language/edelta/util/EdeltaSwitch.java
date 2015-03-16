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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage
 * @generated
 */
public class EdeltaSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EdeltaPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EdeltaSwitch()
  {
		if (modelPackage == null) {
			modelPackage = EdeltaPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case EdeltaPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.CLASS: {
				it.univaq.coevolution.emftext.edelta.language.edelta.Class class_ = (it.univaq.coevolution.emftext.edelta.language.edelta.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.PACKAGE_OPERATION: {
				PackageOperation packageOperation = (PackageOperation)theEObject;
				T result = casePackageOperation(packageOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.FEATURE_OPERATION: {
				FeatureOperation featureOperation = (FeatureOperation)theEObject;
				T result = caseFeatureOperation(featureOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.ATTRIBUTE_OPERATION: {
				AttributeOperation attributeOperation = (AttributeOperation)theEObject;
				T result = caseAttributeOperation(attributeOperation);
				if (result == null) result = caseFeatureOperation(attributeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.REFERENCE_OPERATION: {
				ReferenceOperation referenceOperation = (ReferenceOperation)theEObject;
				T result = caseReferenceOperation(referenceOperation);
				if (result == null) result = caseFeatureOperation(referenceOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.ATOMIC_OPERATOR: {
				AtomicOperator atomicOperator = (AtomicOperator)theEObject;
				T result = caseAtomicOperator(atomicOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.ADD_PACKAGE: {
				addPackage addPackage = (addPackage)theEObject;
				T result = caseaddPackage(addPackage);
				if (result == null) result = casePackageOperation(addPackage);
				if (result == null) result = caseNamedElement(addPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.DELETE_PACKAGE: {
				deletePackage deletePackage = (deletePackage)theEObject;
				T result = casedeletePackage(deletePackage);
				if (result == null) result = casePackageOperation(deletePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.CHANGE_PACKAGE: {
				changePackage changePackage = (changePackage)theEObject;
				T result = casechangePackage(changePackage);
				if (result == null) result = casePackageOperation(changePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.PACKAGE: {
				it.univaq.coevolution.emftext.edelta.language.edelta.Package package_ = (it.univaq.coevolution.emftext.edelta.language.edelta.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseType(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.CLASS_OPERATION: {
				ClassOperation classOperation = (ClassOperation)theEObject;
				T result = caseClassOperation(classOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.CHANGE_CLASS: {
				changeClass changeClass = (changeClass)theEObject;
				T result = casechangeClass(changeClass);
				if (result == null) result = caseClassOperation(changeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.DELETE_CLASS: {
				deleteClass deleteClass = (deleteClass)theEObject;
				T result = casedeleteClass(deleteClass);
				if (result == null) result = caseClassOperation(deleteClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.ADD_CLASS: {
				addClass addClass = (addClass)theEObject;
				T result = caseaddClass(addClass);
				if (result == null) result = caseClassOperation(addClass);
				if (result == null) result = caseNamedElement(addClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = caseType(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseFeature(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = caseType(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseFeature(reference);
				if (result == null) result = caseNamedElement(reference);
				if (result == null) result = caseType(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.ADD_ATTRIBUTE: {
				addAttribute addAttribute = (addAttribute)theEObject;
				T result = caseaddAttribute(addAttribute);
				if (result == null) result = caseAttributeOperation(addAttribute);
				if (result == null) result = caseNamedElement(addAttribute);
				if (result == null) result = caseFeatureOperation(addAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.DELETE_ATTRIBUTE: {
				deleteAttribute deleteAttribute = (deleteAttribute)theEObject;
				T result = casedeleteAttribute(deleteAttribute);
				if (result == null) result = caseAttributeOperation(deleteAttribute);
				if (result == null) result = caseFeatureOperation(deleteAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.CHANGE_ATTRIBUTE: {
				changeAttribute changeAttribute = (changeAttribute)theEObject;
				T result = casechangeAttribute(changeAttribute);
				if (result == null) result = caseAttributeOperation(changeAttribute);
				if (result == null) result = caseFeatureOperation(changeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.ADD_REFERENCE: {
				addReference addReference = (addReference)theEObject;
				T result = caseaddReference(addReference);
				if (result == null) result = caseReferenceOperation(addReference);
				if (result == null) result = caseNamedElement(addReference);
				if (result == null) result = caseFeatureOperation(addReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.DELETE_REFERENCE: {
				deleteReference deleteReference = (deleteReference)theEObject;
				T result = casedeleteReference(deleteReference);
				if (result == null) result = caseReferenceOperation(deleteReference);
				if (result == null) result = caseFeatureOperation(deleteReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.CHANGE_REFERENCE: {
				changeReference changeReference = (changeReference)theEObject;
				T result = casechangeReference(changeReference);
				if (result == null) result = caseReferenceOperation(changeReference);
				if (result == null) result = caseFeatureOperation(changeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.SETTER: {
				Setter setter = (Setter)theEObject;
				T result = caseSetter(setter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.SETTER_VALUE: {
				SetterValue setterValue = (SetterValue)theEObject;
				T result = caseSetterValue(setterValue);
				if (result == null) result = caseNamedElement(setterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdeltaPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNamedElement(NamedElement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseType(Type object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDataType(DataType object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(it.univaq.coevolution.emftext.edelta.language.edelta.Class object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageOperation(PackageOperation object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureOperation(FeatureOperation object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeOperation(AttributeOperation object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceOperation(ReferenceOperation object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicOperator(AtomicOperator object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>add Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>add Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaddPackage(addPackage object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>delete Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>delete Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedeletePackage(deletePackage object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>change Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>change Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casechangePackage(changePackage object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(it.univaq.coevolution.emftext.edelta.language.edelta.Package object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassOperation(ClassOperation object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>change Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>change Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casechangeClass(changeClass object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>delete Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>delete Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedeleteClass(deleteClass object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>add Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>add Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaddClass(addClass object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseFeature(Feature object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>add Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>add Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaddAttribute(addAttribute object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>delete Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>delete Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedeleteAttribute(deleteAttribute object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>change Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>change Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casechangeAttribute(changeAttribute object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>add Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>add Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaddReference(addReference object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>delete Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>delete Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedeleteReference(deleteReference object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>change Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>change Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casechangeReference(changeReference object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Setter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetter(Setter object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Setter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetterValue(SetterValue object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //EdeltaSwitch
