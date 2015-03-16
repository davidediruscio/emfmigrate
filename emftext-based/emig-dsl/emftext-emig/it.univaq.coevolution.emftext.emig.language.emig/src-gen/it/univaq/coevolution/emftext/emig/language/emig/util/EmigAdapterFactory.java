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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import be.ac.vub.simpleocl.LocatedElement;
import be.ac.vub.simpleocl.Module;
import be.ac.vub.simpleocl.ModuleElement;
import be.ac.vub.simpleocl.NamedElement;
import be.ac.vub.simpleocl.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage
 * @generated
 */
public class EmigAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EmigPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EmigAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = EmigPackage.eINSTANCE;
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
  protected EmigSwitch<Adapter> modelSwitch =
    new EmigSwitch<Adapter>() {
			@Override
			public Adapter caseMigrationLibrary(MigrationLibrary object) {
				return createMigrationLibraryAdapter();
			}
			@Override
			public Adapter caseMigrationProgram(MigrationProgram object) {
				return createMigrationProgramAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseRewritingRule(RewritingRule object) {
				return createRewritingRuleAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseLeftRuleElement(LeftRuleElement object) {
				return createLeftRuleElementAdapter();
			}
			@Override
			public Adapter caseRightRuleElement(RightRuleElement object) {
				return createRightRuleElementAdapter();
			}
			@Override
			public Adapter caseOpDef(OpDef object) {
				return createOpDefAdapter();
			}
			@Override
			public Adapter casePackageOpDef(PackageOpDef object) {
				return createPackageOpDefAdapter();
			}
			@Override
			public Adapter casePackage(it.univaq.coevolution.emftext.emig.language.emig.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseClassOpDef(ClassOpDef object) {
				return createClassOpDefAdapter();
			}
			@Override
			public Adapter caseClass(it.univaq.coevolution.emftext.emig.language.emig.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseFeatureOpDef(FeatureOpDef object) {
				return createFeatureOpDefAdapter();
			}
			@Override
			public Adapter caseAttributeOpDef(AttributeOpDef object) {
				return createAttributeOpDefAdapter();
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
			public Adapter caseReferenceOpDef(ReferenceOpDef object) {
				return createReferenceOpDefAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseSetterDef(SetterDef object) {
				return createSetterDefAdapter();
			}
			@Override
			public Adapter caseMParameter(MParameter object) {
				return createMParameterAdapter();
			}
			@Override
			public Adapter caseLocatedElement(LocatedElement object) {
				return createLocatedElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseModuleElement(ModuleElement object) {
				return createModuleElementAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
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
	 * Creates a new adapter for an object of class '{@link be.ac.vub.simpleocl.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.simpleocl.LocatedElement
	 * @generated
	 */
	public Adapter createLocatedElementAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.simpleocl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.simpleocl.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.simpleocl.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.simpleocl.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.simpleocl.ModuleElement <em>Module Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.simpleocl.ModuleElement
	 * @generated
	 */
	public Adapter createModuleElementAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.MigrationLibrary <em>Migration Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.MigrationLibrary
	 * @generated
	 */
	public Adapter createMigrationLibraryAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram <em>Migration Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram
	 * @generated
	 */
	public Adapter createMigrationProgramAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.RewritingRule <em>Rewriting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RewritingRule
	 * @generated
	 */
	public Adapter createRewritingRuleAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement <em>Left Rule Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement
	 * @generated
	 */
	public Adapter createLeftRuleElementAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement <em>Right Rule Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement
	 * @generated
	 */
	public Adapter createRightRuleElementAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.OpDef <em>Op Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.OpDef
	 * @generated
	 */
	public Adapter createOpDefAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef <em>Package Op Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef
	 * @generated
	 */
	public Adapter createPackageOpDefAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef <em>Class Op Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef
	 * @generated
	 */
	public Adapter createClassOpDefAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.FeatureOpDef <em>Feature Op Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.FeatureOpDef
	 * @generated
	 */
	public Adapter createFeatureOpDefAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.AttributeOpDef <em>Attribute Op Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.AttributeOpDef
	 * @generated
	 */
	public Adapter createAttributeOpDefAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Feature
	 * @generated
	 */
  public Adapter createFeatureAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.ReferenceOpDef <em>Reference Op Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.ReferenceOpDef
	 * @generated
	 */
	public Adapter createReferenceOpDefAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.SetterDef <em>Setter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.SetterDef
	 * @generated
	 */
	public Adapter createSetterDefAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emftext.emig.language.emig.MParameter <em>MParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.MParameter
	 * @generated
	 */
	public Adapter createMParameterAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.simpleocl.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.simpleocl.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
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

} //EmigAdapterFactory
