/*
* generated by Xtext
*/
package it.univaq.coevolution.differences.edelta.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import it.univaq.coevolution.differences.edelta.services.EDeltaLangGrammarAccess;

public class EDeltaLangParser extends AbstractContentAssistParser {
	
	@Inject
	private EDeltaLangGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected it.univaq.coevolution.differences.edelta.ui.contentassist.antlr.internal.InternalEDeltaLangParser createParser() {
		it.univaq.coevolution.differences.edelta.ui.contentassist.antlr.internal.InternalEDeltaLangParser result = new it.univaq.coevolution.differences.edelta.ui.contentassist.antlr.internal.InternalEDeltaLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getPackagesAlternatives_0(), "rule__Model__PackagesAlternatives_0");
					put(grammarAccess.getEPackageOperationAccess().getAlternatives_1(), "rule__EPackageOperation__Alternatives_1");
					put(grammarAccess.getEPackageOperationAccess().getOpAlternatives_1_0_0_0(), "rule__EPackageOperation__OpAlternatives_1_0_0_0");
					put(grammarAccess.getEPackageOperationAccess().getAlternatives_1_0_2(), "rule__EPackageOperation__Alternatives_1_0_2");
					put(grammarAccess.getAddPackageAccess().getAlternatives_2(), "rule__AddPackage__Alternatives_2");
					put(grammarAccess.getEClassOperationAccess().getAlternatives_1_0(), "rule__EClassOperation__Alternatives_1_0");
					put(grammarAccess.getEClassOperationAccess().getAlternatives_1_1(), "rule__EClassOperation__Alternatives_1_1");
					put(grammarAccess.getEClassOperationAccess().getAlternatives_1_1_0_1(), "rule__EClassOperation__Alternatives_1_1_0_1");
					put(grammarAccess.getAddClassAccess().getAlternatives_1(), "rule__AddClass__Alternatives_1");
					put(grammarAccess.getSetterAccess().getAlternatives_3(), "rule__Setter__Alternatives_3");
					put(grammarAccess.getSetterAccess().getAlternatives_3_0(), "rule__Setter__Alternatives_3_0");
					put(grammarAccess.getCardinalityAccess().getAlternatives(), "rule__Cardinality__Alternatives");
					put(grammarAccess.getEAttributeOperationAccess().getAlternatives_1(), "rule__EAttributeOperation__Alternatives_1");
					put(grammarAccess.getEAttributeOperationAccess().getAlternatives_1_0_0(), "rule__EAttributeOperation__Alternatives_1_0_0");
					put(grammarAccess.getAddAttributeAccess().getAlternatives_1(), "rule__AddAttribute__Alternatives_1");
					put(grammarAccess.getEReferenceOperationAccess().getAlternatives_1(), "rule__EReferenceOperation__Alternatives_1");
					put(grammarAccess.getEReferenceOperationAccess().getAlternatives_1_0_0(), "rule__EReferenceOperation__Alternatives_1_0_0");
					put(grammarAccess.getAddReferenceAccess().getAlternatives_2(), "rule__AddReference__Alternatives_2");
					put(grammarAccess.getComplexOperatorDefAccess().getAlternatives_4(), "rule__ComplexOperatorDef__Alternatives_4");
					put(grammarAccess.getComplexOperatorAccess().getAlternatives_2(), "rule__ComplexOperator__Alternatives_2");
					put(grammarAccess.getComplexOperatorAccess().getAlternatives_3_1(), "rule__ComplexOperator__Alternatives_3_1");
					put(grammarAccess.getParameterAccess().getAlternatives(), "rule__Parameter__Alternatives");
					put(grammarAccess.getEPackageOperationAccess().getGroup(), "rule__EPackageOperation__Group__0");
					put(grammarAccess.getEPackageOperationAccess().getGroup_0(), "rule__EPackageOperation__Group_0__0");
					put(grammarAccess.getEPackageOperationAccess().getGroup_1_0(), "rule__EPackageOperation__Group_1_0__0");
					put(grammarAccess.getDeletePackageAccess().getGroup(), "rule__DeletePackage__Group__0");
					put(grammarAccess.getAddPackageAccess().getGroup(), "rule__AddPackage__Group__0");
					put(grammarAccess.getChangePackageAccess().getGroup(), "rule__ChangePackage__Group__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getEClassOperationAccess().getGroup(), "rule__EClassOperation__Group__0");
					put(grammarAccess.getEClassOperationAccess().getGroup_0(), "rule__EClassOperation__Group_0__0");
					put(grammarAccess.getEClassOperationAccess().getGroup_1(), "rule__EClassOperation__Group_1__0");
					put(grammarAccess.getEClassOperationAccess().getGroup_1_1_0(), "rule__EClassOperation__Group_1_1_0__0");
					put(grammarAccess.getChangeClassAccess().getGroup(), "rule__ChangeClass__Group__0");
					put(grammarAccess.getAddClassAccess().getGroup(), "rule__AddClass__Group__0");
					put(grammarAccess.getDeleteClassAccess().getGroup(), "rule__DeleteClass__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getSetterAccess().getGroup(), "rule__Setter__Group__0");
					put(grammarAccess.getSetterAccess().getGroup_4(), "rule__Setter__Group_4__0");
					put(grammarAccess.getEAttributeOperationAccess().getGroup(), "rule__EAttributeOperation__Group__0");
					put(grammarAccess.getEAttributeOperationAccess().getGroup_0(), "rule__EAttributeOperation__Group_0__0");
					put(grammarAccess.getEAttributeOperationAccess().getGroup_1_0(), "rule__EAttributeOperation__Group_1_0__0");
					put(grammarAccess.getEAttributeOperationAccess().getGroup_1_0_1(), "rule__EAttributeOperation__Group_1_0_1__0");
					put(grammarAccess.getChangeAttributeAccess().getGroup(), "rule__ChangeAttribute__Group__0");
					put(grammarAccess.getAddAttributeAccess().getGroup(), "rule__AddAttribute__Group__0");
					put(grammarAccess.getDeleteAttributeAccess().getGroup(), "rule__DeleteAttribute__Group__0");
					put(grammarAccess.getEReferenceOperationAccess().getGroup(), "rule__EReferenceOperation__Group__0");
					put(grammarAccess.getEReferenceOperationAccess().getGroup_0(), "rule__EReferenceOperation__Group_0__0");
					put(grammarAccess.getEReferenceOperationAccess().getGroup_1_0(), "rule__EReferenceOperation__Group_1_0__0");
					put(grammarAccess.getEReferenceOperationAccess().getGroup_1_0_1(), "rule__EReferenceOperation__Group_1_0_1__0");
					put(grammarAccess.getChangeReferenceAccess().getGroup(), "rule__ChangeReference__Group__0");
					put(grammarAccess.getAddReferenceAccess().getGroup(), "rule__AddReference__Group__0");
					put(grammarAccess.getDeleteReferenceAccess().getGroup(), "rule__DeleteReference__Group__0");
					put(grammarAccess.getComplexOperatorDefAccess().getGroup(), "rule__ComplexOperatorDef__Group__0");
					put(grammarAccess.getComplexOperatorDefAccess().getGroup_2(), "rule__ComplexOperatorDef__Group_2__0");
					put(grammarAccess.getComplexOperatorDefAccess().getGroup_2_2(), "rule__ComplexOperatorDef__Group_2_2__0");
					put(grammarAccess.getComplexOperatorAccess().getGroup(), "rule__ComplexOperator__Group__0");
					put(grammarAccess.getComplexOperatorAccess().getGroup_3(), "rule__ComplexOperator__Group_3__0");
					put(grammarAccess.getParameterAccess().getGroup_0(), "rule__Parameter__Group_0__0");
					put(grammarAccess.getParameterAccess().getGroup_1(), "rule__Parameter__Group_1__0");
					put(grammarAccess.getParameterAccess().getGroup_2(), "rule__Parameter__Group_2__0");
					put(grammarAccess.getParameterAccess().getGroup_3(), "rule__Parameter__Group_3__0");
					put(grammarAccess.getParameterAccess().getGroup_4(), "rule__Parameter__Group_4__0");
					put(grammarAccess.getParameterAccess().getGroup_5(), "rule__Parameter__Group_5__0");
					put(grammarAccess.getParameterAccess().getGroup_6(), "rule__Parameter__Group_6__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getBooleanDefAccess().getGroup(), "rule__BooleanDef__Group__0");
					put(grammarAccess.getIntDefAccess().getGroup(), "rule__IntDef__Group__0");
					put(grammarAccess.getModelAccess().getPackagesAssignment(), "rule__Model__PackagesAssignment");
					put(grammarAccess.getEPackageOperationAccess().getVarAssignment_0_1(), "rule__EPackageOperation__VarAssignment_0_1");
					put(grammarAccess.getEPackageOperationAccess().getOpAssignment_1_0_0(), "rule__EPackageOperation__OpAssignment_1_0_0");
					put(grammarAccess.getEPackageOperationAccess().getSettersAssignment_1_0_2_0(), "rule__EPackageOperation__SettersAssignment_1_0_2_0");
					put(grammarAccess.getEPackageOperationAccess().getClassesAssignment_1_0_2_1(), "rule__EPackageOperation__ClassesAssignment_1_0_2_1");
					put(grammarAccess.getEPackageOperationAccess().getComplexAssignment_1_1(), "rule__EPackageOperation__ComplexAssignment_1_1");
					put(grammarAccess.getDeletePackageAccess().getRefAssignment_2(), "rule__DeletePackage__RefAssignment_2");
					put(grammarAccess.getAddPackageAccess().getNewAssignment_2_0(), "rule__AddPackage__NewAssignment_2_0");
					put(grammarAccess.getAddPackageAccess().getRefAssignment_2_1(), "rule__AddPackage__RefAssignment_2_1");
					put(grammarAccess.getChangePackageAccess().getRefAssignment_2(), "rule__ChangePackage__RefAssignment_2");
					put(grammarAccess.getPackageAccess().getNameAssignment_1(), "rule__Package__NameAssignment_1");
					put(grammarAccess.getEClassOperationAccess().getVarAssignment_0_1(), "rule__EClassOperation__VarAssignment_0_1");
					put(grammarAccess.getEClassOperationAccess().getOpAssignment_1_0_0(), "rule__EClassOperation__OpAssignment_1_0_0");
					put(grammarAccess.getEClassOperationAccess().getOpAssignment_1_0_1(), "rule__EClassOperation__OpAssignment_1_0_1");
					put(grammarAccess.getEClassOperationAccess().getOpAssignment_1_0_2(), "rule__EClassOperation__OpAssignment_1_0_2");
					put(grammarAccess.getEClassOperationAccess().getSettersAssignment_1_1_0_1_0(), "rule__EClassOperation__SettersAssignment_1_1_0_1_0");
					put(grammarAccess.getEClassOperationAccess().getAttributesAssignment_1_1_0_1_1(), "rule__EClassOperation__AttributesAssignment_1_1_0_1_1");
					put(grammarAccess.getEClassOperationAccess().getReferencesAssignment_1_1_0_1_2(), "rule__EClassOperation__ReferencesAssignment_1_1_0_1_2");
					put(grammarAccess.getEClassOperationAccess().getComplexAssignment_1_1_1(), "rule__EClassOperation__ComplexAssignment_1_1_1");
					put(grammarAccess.getChangeClassAccess().getOpAssignment_0(), "rule__ChangeClass__OpAssignment_0");
					put(grammarAccess.getChangeClassAccess().getRefAssignment_1(), "rule__ChangeClass__RefAssignment_1");
					put(grammarAccess.getAddClassAccess().getOpAssignment_0(), "rule__AddClass__OpAssignment_0");
					put(grammarAccess.getAddClassAccess().getNewAssignment_1_0(), "rule__AddClass__NewAssignment_1_0");
					put(grammarAccess.getAddClassAccess().getRefAssignment_1_1(), "rule__AddClass__RefAssignment_1_1");
					put(grammarAccess.getDeleteClassAccess().getOpAssignment_0(), "rule__DeleteClass__OpAssignment_0");
					put(grammarAccess.getDeleteClassAccess().getRefAssignment_1(), "rule__DeleteClass__RefAssignment_1");
					put(grammarAccess.getClassAccess().getNameAssignment_1(), "rule__Class__NameAssignment_1");
					put(grammarAccess.getSetterAccess().getMetafeatureAssignment_1(), "rule__Setter__MetafeatureAssignment_1");
					put(grammarAccess.getSetterAccess().getValueAssignment_3_0_0(), "rule__Setter__ValueAssignment_3_0_0");
					put(grammarAccess.getSetterAccess().getCardAssignment_3_1(), "rule__Setter__CardAssignment_3_1");
					put(grammarAccess.getSetterAccess().getValueRefAssignment_3_2(), "rule__Setter__ValueRefAssignment_3_2");
					put(grammarAccess.getSetterAccess().getValueRefAssignment_4_1(), "rule__Setter__ValueRefAssignment_4_1");
					put(grammarAccess.getEAttributeOperationAccess().getVarAssignment_0_1(), "rule__EAttributeOperation__VarAssignment_0_1");
					put(grammarAccess.getEAttributeOperationAccess().getOpAssignment_1_0_0_0(), "rule__EAttributeOperation__OpAssignment_1_0_0_0");
					put(grammarAccess.getEAttributeOperationAccess().getOpAssignment_1_0_0_1(), "rule__EAttributeOperation__OpAssignment_1_0_0_1");
					put(grammarAccess.getEAttributeOperationAccess().getOpAssignment_1_0_0_2(), "rule__EAttributeOperation__OpAssignment_1_0_0_2");
					put(grammarAccess.getEAttributeOperationAccess().getSettersAssignment_1_0_1_1(), "rule__EAttributeOperation__SettersAssignment_1_0_1_1");
					put(grammarAccess.getEAttributeOperationAccess().getComplexAssignment_1_1(), "rule__EAttributeOperation__ComplexAssignment_1_1");
					put(grammarAccess.getChangeAttributeAccess().getOpAssignment_0(), "rule__ChangeAttribute__OpAssignment_0");
					put(grammarAccess.getChangeAttributeAccess().getRefAssignment_1(), "rule__ChangeAttribute__RefAssignment_1");
					put(grammarAccess.getAddAttributeAccess().getOpAssignment_0(), "rule__AddAttribute__OpAssignment_0");
					put(grammarAccess.getAddAttributeAccess().getNewAssignment_1_0(), "rule__AddAttribute__NewAssignment_1_0");
					put(grammarAccess.getAddAttributeAccess().getRefAssignment_1_1(), "rule__AddAttribute__RefAssignment_1_1");
					put(grammarAccess.getDeleteAttributeAccess().getOpAssignment_0(), "rule__DeleteAttribute__OpAssignment_0");
					put(grammarAccess.getDeleteAttributeAccess().getRefAssignment_1(), "rule__DeleteAttribute__RefAssignment_1");
					put(grammarAccess.getEReferenceOperationAccess().getVarAssignment_0_1(), "rule__EReferenceOperation__VarAssignment_0_1");
					put(grammarAccess.getEReferenceOperationAccess().getOpAssignment_1_0_0_0(), "rule__EReferenceOperation__OpAssignment_1_0_0_0");
					put(grammarAccess.getEReferenceOperationAccess().getOpAssignment_1_0_0_1(), "rule__EReferenceOperation__OpAssignment_1_0_0_1");
					put(grammarAccess.getEReferenceOperationAccess().getOpAssignment_1_0_0_2(), "rule__EReferenceOperation__OpAssignment_1_0_0_2");
					put(grammarAccess.getEReferenceOperationAccess().getSettersAssignment_1_0_1_1(), "rule__EReferenceOperation__SettersAssignment_1_0_1_1");
					put(grammarAccess.getEReferenceOperationAccess().getComplexAssignment_1_1(), "rule__EReferenceOperation__ComplexAssignment_1_1");
					put(grammarAccess.getChangeReferenceAccess().getOpAssignment_0(), "rule__ChangeReference__OpAssignment_0");
					put(grammarAccess.getChangeReferenceAccess().getRefAssignment_2(), "rule__ChangeReference__RefAssignment_2");
					put(grammarAccess.getAddReferenceAccess().getOpAssignment_0(), "rule__AddReference__OpAssignment_0");
					put(grammarAccess.getAddReferenceAccess().getNewAssignment_2_0(), "rule__AddReference__NewAssignment_2_0");
					put(grammarAccess.getAddReferenceAccess().getRefAssignment_2_1(), "rule__AddReference__RefAssignment_2_1");
					put(grammarAccess.getDeleteReferenceAccess().getOpAssignment_0(), "rule__DeleteReference__OpAssignment_0");
					put(grammarAccess.getDeleteReferenceAccess().getRefAssignment_2(), "rule__DeleteReference__RefAssignment_2");
					put(grammarAccess.getComplexOperatorDefAccess().getNameAssignment_1(), "rule__ComplexOperatorDef__NameAssignment_1");
					put(grammarAccess.getComplexOperatorDefAccess().getParamsAssignment_2_1(), "rule__ComplexOperatorDef__ParamsAssignment_2_1");
					put(grammarAccess.getComplexOperatorDefAccess().getParamsAssignment_2_2_1(), "rule__ComplexOperatorDef__ParamsAssignment_2_2_1");
					put(grammarAccess.getComplexOperatorDefAccess().getPackageOperationsAssignment_4_0(), "rule__ComplexOperatorDef__PackageOperationsAssignment_4_0");
					put(grammarAccess.getComplexOperatorDefAccess().getClassOperationsAssignment_4_1(), "rule__ComplexOperatorDef__ClassOperationsAssignment_4_1");
					put(grammarAccess.getComplexOperatorDefAccess().getAttributeOperationsAssignment_4_2(), "rule__ComplexOperatorDef__AttributeOperationsAssignment_4_2");
					put(grammarAccess.getComplexOperatorDefAccess().getReferenceOperationsAssignment_4_3(), "rule__ComplexOperatorDef__ReferenceOperationsAssignment_4_3");
					put(grammarAccess.getComplexOperatorAccess().getRefAssignment_0(), "rule__ComplexOperator__RefAssignment_0");
					put(grammarAccess.getComplexOperatorAccess().getArgsAssignment_2_0(), "rule__ComplexOperator__ArgsAssignment_2_0");
					put(grammarAccess.getComplexOperatorAccess().getNewAssignment_2_1(), "rule__ComplexOperator__NewAssignment_2_1");
					put(grammarAccess.getComplexOperatorAccess().getArgsAssignment_3_1_0(), "rule__ComplexOperator__ArgsAssignment_3_1_0");
					put(grammarAccess.getComplexOperatorAccess().getNewAssignment_3_1_1(), "rule__ComplexOperator__NewAssignment_3_1_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getReferenceAccess().getNameAssignment_1(), "rule__Reference__NameAssignment_1");
					put(grammarAccess.getBooleanDefAccess().getNameAssignment_1(), "rule__BooleanDef__NameAssignment_1");
					put(grammarAccess.getStringDefAccess().getNameAssignment(), "rule__StringDef__NameAssignment");
					put(grammarAccess.getIntDefAccess().getNameAssignment_1(), "rule__IntDef__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			it.univaq.coevolution.differences.edelta.ui.contentassist.antlr.internal.InternalEDeltaLangParser typedParser = (it.univaq.coevolution.differences.edelta.ui.contentassist.antlr.internal.InternalEDeltaLangParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public EDeltaLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EDeltaLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
