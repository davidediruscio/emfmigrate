/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig.util;

import it.univaq.coevolution.emftext.emig.language.emig.Attribute;
import it.univaq.coevolution.emftext.emig.language.emig.AttributeOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.Binding;
import it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.ComplexOperatorCallDef;
import it.univaq.coevolution.emftext.emig.language.emig.EmigPackage;
import it.univaq.coevolution.emftext.emig.language.emig.Feature;
import it.univaq.coevolution.emftext.emig.language.emig.FeatureOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.FilterRuleDef;
import it.univaq.coevolution.emftext.emig.language.emig.FilterRule;
import it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement;
import it.univaq.coevolution.emftext.emig.language.emig.MParameter;
import it.univaq.coevolution.emftext.emig.language.emig.MigrationLibrary;
import it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram;
import it.univaq.coevolution.emftext.emig.language.emig.OpDef;
import it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.Reference;
import it.univaq.coevolution.emftext.emig.language.emig.ReferenceOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.RewritingRule;
import it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement;
import it.univaq.coevolution.emftext.emig.language.emig.Rule;
import it.univaq.coevolution.emftext.emig.language.emig.SetterDef;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import be.ac.vub.simpleocl.LocatedElement;
import be.ac.vub.simpleocl.Module;
import be.ac.vub.simpleocl.ModuleElement;
import be.ac.vub.simpleocl.NamedElement;
import be.ac.vub.simpleocl.VariableDeclaration;

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
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage
 * @generated
 */
public class EmigSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EmigPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EmigSwitch()
  {
		if (modelPackage == null) {
			modelPackage = EmigPackage.eINSTANCE;
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
			case EmigPackage.MIGRATION_LIBRARY: {
				MigrationLibrary migrationLibrary = (MigrationLibrary)theEObject;
				T result = caseMigrationLibrary(migrationLibrary);
				if (result == null) result = caseModule(migrationLibrary);
				if (result == null) result = caseNamedElement(migrationLibrary);
				if (result == null) result = caseLocatedElement(migrationLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.MIGRATION_PROGRAM: {
				MigrationProgram migrationProgram = (MigrationProgram)theEObject;
				T result = caseMigrationProgram(migrationProgram);
				if (result == null) result = caseMigrationLibrary(migrationProgram);
				if (result == null) result = caseModule(migrationProgram);
				if (result == null) result = caseNamedElement(migrationProgram);
				if (result == null) result = caseLocatedElement(migrationProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseNamedElement(rule);
				if (result == null) result = caseModuleElement(rule);
				if (result == null) result = caseLocatedElement(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.REWRITING_RULE: {
				RewritingRule rewritingRule = (RewritingRule)theEObject;
				T result = caseRewritingRule(rewritingRule);
				if (result == null) result = caseLocatedElement(rewritingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = caseLocatedElement(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.LEFT_RULE_ELEMENT: {
				LeftRuleElement leftRuleElement = (LeftRuleElement)theEObject;
				T result = caseLeftRuleElement(leftRuleElement);
				if (result == null) result = caseVariableDeclaration(leftRuleElement);
				if (result == null) result = caseLocatedElement(leftRuleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.RIGHT_RULE_ELEMENT: {
				RightRuleElement rightRuleElement = (RightRuleElement)theEObject;
				T result = caseRightRuleElement(rightRuleElement);
				if (result == null) result = caseVariableDeclaration(rightRuleElement);
				if (result == null) result = caseLocatedElement(rightRuleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.OP_DEF: {
				OpDef opDef = (OpDef)theEObject;
				T result = caseOpDef(opDef);
				if (result == null) result = caseLocatedElement(opDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.PACKAGE_OP_DEF: {
				PackageOpDef packageOpDef = (PackageOpDef)theEObject;
				T result = casePackageOpDef(packageOpDef);
				if (result == null) result = caseOpDef(packageOpDef);
				if (result == null) result = caseLocatedElement(packageOpDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.PACKAGE: {
				it.univaq.coevolution.emftext.emig.language.emig.Package package_ = (it.univaq.coevolution.emftext.emig.language.emig.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseVariableDeclaration(package_);
				if (result == null) result = caseLocatedElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.CLASS_OP_DEF: {
				ClassOpDef classOpDef = (ClassOpDef)theEObject;
				T result = caseClassOpDef(classOpDef);
				if (result == null) result = caseOpDef(classOpDef);
				if (result == null) result = caseLocatedElement(classOpDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.CLASS: {
				it.univaq.coevolution.emftext.emig.language.emig.Class class_ = (it.univaq.coevolution.emftext.emig.language.emig.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseVariableDeclaration(class_);
				if (result == null) result = caseLocatedElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.FEATURE_OP_DEF: {
				FeatureOpDef featureOpDef = (FeatureOpDef)theEObject;
				T result = caseFeatureOpDef(featureOpDef);
				if (result == null) result = caseOpDef(featureOpDef);
				if (result == null) result = caseLocatedElement(featureOpDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.ATTRIBUTE_OP_DEF: {
				AttributeOpDef attributeOpDef = (AttributeOpDef)theEObject;
				T result = caseAttributeOpDef(attributeOpDef);
				if (result == null) result = caseFeatureOpDef(attributeOpDef);
				if (result == null) result = caseOpDef(attributeOpDef);
				if (result == null) result = caseLocatedElement(attributeOpDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseVariableDeclaration(feature);
				if (result == null) result = caseLocatedElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseFeature(attribute);
				if (result == null) result = caseVariableDeclaration(attribute);
				if (result == null) result = caseLocatedElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.REFERENCE_OP_DEF: {
				ReferenceOpDef referenceOpDef = (ReferenceOpDef)theEObject;
				T result = caseReferenceOpDef(referenceOpDef);
				if (result == null) result = caseFeatureOpDef(referenceOpDef);
				if (result == null) result = caseOpDef(referenceOpDef);
				if (result == null) result = caseLocatedElement(referenceOpDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseFeature(reference);
				if (result == null) result = caseVariableDeclaration(reference);
				if (result == null) result = caseLocatedElement(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.SETTER_DEF: {
				SetterDef setterDef = (SetterDef)theEObject;
				T result = caseSetterDef(setterDef);
				if (result == null) result = caseLocatedElement(setterDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmigPackage.MPARAMETER: {
				MParameter mParameter = (MParameter)theEObject;
				T result = caseMParameter(mParameter);
				if (result == null) result = caseVariableDeclaration(mParameter);
				if (result == null) result = caseLocatedElement(mParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedElement(LocatedElement object) {
		return null;
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
	public T caseNamedElement(NamedElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Module Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleElement(ModuleElement object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Migration Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migration Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMigrationLibrary(MigrationLibrary object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Migration Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migration Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMigrationProgram(MigrationProgram object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Rewriting Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rewriting Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRewritingRule(RewritingRule object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Rule Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Rule Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftRuleElement(LeftRuleElement object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Rule Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Rule Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightRuleElement(RightRuleElement object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Op Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Op Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpDef(OpDef object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Op Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Op Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageOpDef(PackageOpDef object) {
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
	public T casePackage(it.univaq.coevolution.emftext.emig.language.emig.Package object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Op Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Op Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassOpDef(ClassOpDef object) {
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
	public T caseClass(it.univaq.coevolution.emftext.emig.language.emig.Class object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Op Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Op Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureOpDef(FeatureOpDef object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Op Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Op Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeOpDef(AttributeOpDef object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Reference Op Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Op Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceOpDef(ReferenceOpDef object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Setter Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setter Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetterDef(SetterDef object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameter(MParameter object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
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

} //EmigSwitch
