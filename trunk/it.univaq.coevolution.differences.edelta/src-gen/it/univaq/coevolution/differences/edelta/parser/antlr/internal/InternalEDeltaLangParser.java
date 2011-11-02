package it.univaq.coevolution.differences.edelta.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.univaq.coevolution.differences.edelta.services.EDeltaLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEDeltaLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'='", "'{'", "'}'", "'deletePackage'", "'('", "')'", "'addPackage'", "'changePackage'", "'class'", "'changeClass('", "'addClass('", "'deleteClass('", "'set'", "'<='", "','", "';'", "'*'", "'attribute'", "'changeAttribute('", "'addAttribute('", "'deleteAttribute('", "'reference'", "'changeReference'", "'addReference'", "'deleteReference'", "'def change'", "':'", "'bool'", "'int'", "'string'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalEDeltaLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEDeltaLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEDeltaLangParser.tokenNames; }
    public String getGrammarFileName() { return "../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private EDeltaLangGrammarAccess grammarAccess;
     	
        public InternalEDeltaLangParser(TokenStream input, EDeltaLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected EDeltaLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:74:2: (iv_ruleModel= ruleModel EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:75:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:82:1: ruleModel returns [EObject current=null] : ( ( (lv_packages_0_1= ruleEPackageOperation | lv_packages_0_2= ruleComplexOperatorDef ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_packages_0_1 = null;

        EObject lv_packages_0_2 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:85:28: ( ( ( (lv_packages_0_1= ruleEPackageOperation | lv_packages_0_2= ruleComplexOperatorDef ) ) )* )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:86:1: ( ( (lv_packages_0_1= ruleEPackageOperation | lv_packages_0_2= ruleComplexOperatorDef ) ) )*
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:86:1: ( ( (lv_packages_0_1= ruleEPackageOperation | lv_packages_0_2= ruleComplexOperatorDef ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==12||LA2_0==16||(LA2_0>=19 && LA2_0<=20)||LA2_0==38) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:87:1: ( (lv_packages_0_1= ruleEPackageOperation | lv_packages_0_2= ruleComplexOperatorDef ) )
            	    {
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:87:1: ( (lv_packages_0_1= ruleEPackageOperation | lv_packages_0_2= ruleComplexOperatorDef ) )
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:88:1: (lv_packages_0_1= ruleEPackageOperation | lv_packages_0_2= ruleComplexOperatorDef )
            	    {
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:88:1: (lv_packages_0_1= ruleEPackageOperation | lv_packages_0_2= ruleComplexOperatorDef )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==RULE_ID||LA1_0==12||LA1_0==16||(LA1_0>=19 && LA1_0<=20)) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==38) ) {
            	        alt1=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:89:3: lv_packages_0_1= ruleEPackageOperation
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getModelAccess().getPackagesEPackageOperationParserRuleCall_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEPackageOperation_in_ruleModel138);
            	            lv_packages_0_1=ruleEPackageOperation();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getModelRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"packages",
            	                      		lv_packages_0_1, 
            	                      		"EPackageOperation");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:104:8: lv_packages_0_2= ruleComplexOperatorDef
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getModelAccess().getPackagesComplexOperatorDefParserRuleCall_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleComplexOperatorDef_in_ruleModel157);
            	            lv_packages_0_2=ruleComplexOperatorDef();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getModelRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"packages",
            	                      		lv_packages_0_2, 
            	                      		"ComplexOperatorDef");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEPackageOperation"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:130:1: entryRuleEPackageOperation returns [EObject current=null] : iv_ruleEPackageOperation= ruleEPackageOperation EOF ;
    public final EObject entryRuleEPackageOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackageOperation = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:131:2: (iv_ruleEPackageOperation= ruleEPackageOperation EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:132:2: iv_ruleEPackageOperation= ruleEPackageOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPackageOperationRule()); 
            }
            pushFollow(FOLLOW_ruleEPackageOperation_in_entryRuleEPackageOperation196);
            iv_ruleEPackageOperation=ruleEPackageOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPackageOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPackageOperation206); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPackageOperation"


    // $ANTLR start "ruleEPackageOperation"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:139:1: ruleEPackageOperation returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage ) ) ) otherlv_4= '{' ( ( (lv_setters_5_0= rulesetter ) ) | ( (lv_classes_6_0= ruleEClassOperation ) ) )* otherlv_7= '}' ) | ( (lv_complex_8_0= ruleComplexOperator ) ) ) ) ;
    public final EObject ruleEPackageOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_var_1_0 = null;

        EObject lv_op_3_1 = null;

        EObject lv_op_3_2 = null;

        EObject lv_op_3_3 = null;

        EObject lv_setters_5_0 = null;

        EObject lv_classes_6_0 = null;

        EObject lv_complex_8_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:142:28: ( ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage ) ) ) otherlv_4= '{' ( ( (lv_setters_5_0= rulesetter ) ) | ( (lv_classes_6_0= ruleEClassOperation ) ) )* otherlv_7= '}' ) | ( (lv_complex_8_0= ruleComplexOperator ) ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:143:1: ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage ) ) ) otherlv_4= '{' ( ( (lv_setters_5_0= rulesetter ) ) | ( (lv_classes_6_0= ruleEClassOperation ) ) )* otherlv_7= '}' ) | ( (lv_complex_8_0= ruleComplexOperator ) ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:143:1: ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage ) ) ) otherlv_4= '{' ( ( (lv_setters_5_0= rulesetter ) ) | ( (lv_classes_6_0= ruleEClassOperation ) ) )* otherlv_7= '}' ) | ( (lv_complex_8_0= ruleComplexOperator ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:143:2: (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage ) ) ) otherlv_4= '{' ( ( (lv_setters_5_0= rulesetter ) ) | ( (lv_classes_6_0= ruleEClassOperation ) ) )* otherlv_7= '}' ) | ( (lv_complex_8_0= ruleComplexOperator ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:143:2: (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:143:4: otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '='
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleEPackageOperation244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getEPackageOperationAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:147:1: ( (lv_var_1_0= rulePackage ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:148:1: (lv_var_1_0= rulePackage )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:148:1: (lv_var_1_0= rulePackage )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:149:3: lv_var_1_0= rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEPackageOperationAccess().getVarPackageParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackage_in_ruleEPackageOperation265);
                    lv_var_1_0=rulePackage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEPackageOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"var",
                              		lv_var_1_0, 
                              		"Package");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEPackageOperation277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEPackageOperationAccess().getEqualsSignKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:169:3: ( ( ( ( (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage ) ) ) otherlv_4= '{' ( ( (lv_setters_5_0= rulesetter ) ) | ( (lv_classes_6_0= ruleEClassOperation ) ) )* otherlv_7= '}' ) | ( (lv_complex_8_0= ruleComplexOperator ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16||(LA6_0>=19 && LA6_0<=20)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:169:4: ( ( ( (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage ) ) ) otherlv_4= '{' ( ( (lv_setters_5_0= rulesetter ) ) | ( (lv_classes_6_0= ruleEClassOperation ) ) )* otherlv_7= '}' )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:169:4: ( ( ( (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage ) ) ) otherlv_4= '{' ( ( (lv_setters_5_0= rulesetter ) ) | ( (lv_classes_6_0= ruleEClassOperation ) ) )* otherlv_7= '}' )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:169:5: ( ( (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage ) ) ) otherlv_4= '{' ( ( (lv_setters_5_0= rulesetter ) ) | ( (lv_classes_6_0= ruleEClassOperation ) ) )* otherlv_7= '}'
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:169:5: ( ( (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage ) ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:170:1: ( (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:170:1: ( (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:171:1: (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:171:1: (lv_op_3_1= ruleChangePackage | lv_op_3_2= ruleAddPackage | lv_op_3_3= ruleDeletePackage )
                    int alt4=3;
                    switch ( input.LA(1) ) {
                    case 20:
                        {
                        alt4=1;
                        }
                        break;
                    case 19:
                        {
                        alt4=2;
                        }
                        break;
                    case 16:
                        {
                        alt4=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }

                    switch (alt4) {
                        case 1 :
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:172:3: lv_op_3_1= ruleChangePackage
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEPackageOperationAccess().getOpChangePackageParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleChangePackage_in_ruleEPackageOperation304);
                            lv_op_3_1=ruleChangePackage();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEPackageOperationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_3_1, 
                                      		"ChangePackage");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:187:8: lv_op_3_2= ruleAddPackage
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEPackageOperationAccess().getOpAddPackageParserRuleCall_1_0_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAddPackage_in_ruleEPackageOperation323);
                            lv_op_3_2=ruleAddPackage();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEPackageOperationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_3_2, 
                                      		"AddPackage");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:202:8: lv_op_3_3= ruleDeletePackage
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEPackageOperationAccess().getOpDeletePackageParserRuleCall_1_0_0_0_2()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDeletePackage_in_ruleEPackageOperation342);
                            lv_op_3_3=ruleDeletePackage();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEPackageOperationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_3_3, 
                                      		"DeletePackage");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleEPackageOperation357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEPackageOperationAccess().getLeftCurlyBracketKeyword_1_0_1());
                          
                    }
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:224:1: ( ( (lv_setters_5_0= rulesetter ) ) | ( (lv_classes_6_0= ruleEClassOperation ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==25) ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>=21 && LA5_0<=24)) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:224:2: ( (lv_setters_5_0= rulesetter ) )
                    	    {
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:224:2: ( (lv_setters_5_0= rulesetter ) )
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:225:1: (lv_setters_5_0= rulesetter )
                    	    {
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:225:1: (lv_setters_5_0= rulesetter )
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:226:3: lv_setters_5_0= rulesetter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEPackageOperationAccess().getSettersSetterParserRuleCall_1_0_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulesetter_in_ruleEPackageOperation379);
                    	    lv_setters_5_0=rulesetter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEPackageOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"setters",
                    	              		lv_setters_5_0, 
                    	              		"setter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:243:6: ( (lv_classes_6_0= ruleEClassOperation ) )
                    	    {
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:243:6: ( (lv_classes_6_0= ruleEClassOperation ) )
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:244:1: (lv_classes_6_0= ruleEClassOperation )
                    	    {
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:244:1: (lv_classes_6_0= ruleEClassOperation )
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:245:3: lv_classes_6_0= ruleEClassOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEPackageOperationAccess().getClassesEClassOperationParserRuleCall_1_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEClassOperation_in_ruleEPackageOperation406);
                    	    lv_classes_6_0=ruleEClassOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEPackageOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"classes",
                    	              		lv_classes_6_0, 
                    	              		"EClassOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEPackageOperation420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEPackageOperationAccess().getRightCurlyBracketKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:266:6: ( (lv_complex_8_0= ruleComplexOperator ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:266:6: ( (lv_complex_8_0= ruleComplexOperator ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:267:1: (lv_complex_8_0= ruleComplexOperator )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:267:1: (lv_complex_8_0= ruleComplexOperator )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:268:3: lv_complex_8_0= ruleComplexOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEPackageOperationAccess().getComplexComplexOperatorParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComplexOperator_in_ruleEPackageOperation448);
                    lv_complex_8_0=ruleComplexOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEPackageOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"complex",
                              		lv_complex_8_0, 
                              		"ComplexOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPackageOperation"


    // $ANTLR start "entryRuleDeletePackage"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:292:1: entryRuleDeletePackage returns [EObject current=null] : iv_ruleDeletePackage= ruleDeletePackage EOF ;
    public final EObject entryRuleDeletePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletePackage = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:293:2: (iv_ruleDeletePackage= ruleDeletePackage EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:294:2: iv_ruleDeletePackage= ruleDeletePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeletePackageRule()); 
            }
            pushFollow(FOLLOW_ruleDeletePackage_in_entryRuleDeletePackage485);
            iv_ruleDeletePackage=ruleDeletePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeletePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeletePackage495); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeletePackage"


    // $ANTLR start "ruleDeletePackage"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:301:1: ruleDeletePackage returns [EObject current=null] : (otherlv_0= 'deletePackage' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleDeletePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:304:28: ( (otherlv_0= 'deletePackage' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:305:1: (otherlv_0= 'deletePackage' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:305:1: (otherlv_0= 'deletePackage' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:305:3: otherlv_0= 'deletePackage' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDeletePackage532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeletePackageAccess().getDeletePackageKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleDeletePackage544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeletePackageAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:313:1: ( (otherlv_2= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:314:1: (otherlv_2= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:314:1: (otherlv_2= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:315:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeletePackageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeletePackage568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDeletePackageAccess().getRefEPackageCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleDeletePackage580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDeletePackageAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeletePackage"


    // $ANTLR start "entryRuleAddPackage"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:341:1: entryRuleAddPackage returns [EObject current=null] : iv_ruleAddPackage= ruleAddPackage EOF ;
    public final EObject entryRuleAddPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddPackage = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:342:2: (iv_ruleAddPackage= ruleAddPackage EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:343:2: iv_ruleAddPackage= ruleAddPackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddPackageRule()); 
            }
            pushFollow(FOLLOW_ruleAddPackage_in_entryRuleAddPackage616);
            iv_ruleAddPackage=ruleAddPackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddPackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddPackage626); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddPackage"


    // $ANTLR start "ruleAddPackage"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:350:1: ruleAddPackage returns [EObject current=null] : (otherlv_0= 'addPackage' otherlv_1= '(' ( ( (lv_new_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ')' ) ;
    public final EObject ruleAddPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_new_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:353:28: ( (otherlv_0= 'addPackage' otherlv_1= '(' ( ( (lv_new_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ')' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:354:1: (otherlv_0= 'addPackage' otherlv_1= '(' ( ( (lv_new_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ')' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:354:1: (otherlv_0= 'addPackage' otherlv_1= '(' ( ( (lv_new_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ')' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:354:3: otherlv_0= 'addPackage' otherlv_1= '(' ( ( (lv_new_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAddPackage663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAddPackageAccess().getAddPackageKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAddPackage675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAddPackageAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:362:1: ( ( (lv_new_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:362:2: ( (lv_new_2_0= RULE_STRING ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:362:2: ( (lv_new_2_0= RULE_STRING ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:363:1: (lv_new_2_0= RULE_STRING )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:363:1: (lv_new_2_0= RULE_STRING )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:364:3: lv_new_2_0= RULE_STRING
                    {
                    lv_new_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAddPackage693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_new_2_0, grammarAccess.getAddPackageAccess().getNewSTRINGTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAddPackageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"new",
                              		lv_new_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:381:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:381:6: ( (otherlv_3= RULE_ID ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:382:1: (otherlv_3= RULE_ID )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:382:1: (otherlv_3= RULE_ID )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:383:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAddPackageRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddPackage728); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getAddPackageAccess().getRefSTRINGCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAddPackage741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAddPackageAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddPackage"


    // $ANTLR start "entryRuleChangePackage"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:409:1: entryRuleChangePackage returns [EObject current=null] : iv_ruleChangePackage= ruleChangePackage EOF ;
    public final EObject entryRuleChangePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangePackage = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:410:2: (iv_ruleChangePackage= ruleChangePackage EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:411:2: iv_ruleChangePackage= ruleChangePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChangePackageRule()); 
            }
            pushFollow(FOLLOW_ruleChangePackage_in_entryRuleChangePackage777);
            iv_ruleChangePackage=ruleChangePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChangePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangePackage787); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangePackage"


    // $ANTLR start "ruleChangePackage"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:418:1: ruleChangePackage returns [EObject current=null] : (otherlv_0= 'changePackage' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleChangePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:421:28: ( (otherlv_0= 'changePackage' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:422:1: (otherlv_0= 'changePackage' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:422:1: (otherlv_0= 'changePackage' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:422:3: otherlv_0= 'changePackage' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleChangePackage824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getChangePackageAccess().getChangePackageKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleChangePackage836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getChangePackageAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:430:1: ( (otherlv_2= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:431:1: (otherlv_2= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:431:1: (otherlv_2= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:432:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getChangePackageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChangePackage860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getChangePackageAccess().getRefEPackageCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleChangePackage872); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getChangePackageAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangePackage"


    // $ANTLR start "entryRulePackage"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:458:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:459:2: (iv_rulePackage= rulePackage EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:460:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage908);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage918); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:467:1: rulePackage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:470:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:471:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:471:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:471:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:471:2: ()
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:472:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPackageAccess().getPackageAction_0(),
                          current);
                  
            }

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:480:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:481:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:481:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:482:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPackageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleEClassOperation"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:506:1: entryRuleEClassOperation returns [EObject current=null] : iv_ruleEClassOperation= ruleEClassOperation EOF ;
    public final EObject entryRuleEClassOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClassOperation = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:507:2: (iv_ruleEClassOperation= ruleEClassOperation EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:508:2: iv_ruleEClassOperation= ruleEClassOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEClassOperationRule()); 
            }
            pushFollow(FOLLOW_ruleEClassOperation_in_entryRuleEClassOperation1013);
            iv_ruleEClassOperation=ruleEClassOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEClassOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEClassOperation1023); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEClassOperation"


    // $ANTLR start "ruleEClassOperation"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:515:1: ruleEClassOperation returns [EObject current=null] : ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' )? ( ( ( (lv_op_3_0= ruleChangeClass ) ) | ( (lv_op_4_0= ruleAddClass ) ) | ( (lv_op_5_0= ruleDeleteClass ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulesetter ) ) | ( (lv_attributes_8_0= ruleEAttributeOperation ) ) | ( (lv_references_9_0= ruleEReferenceOperation ) ) )* otherlv_10= '}' ) | ( (lv_complex_11_0= ruleComplexOperator ) ) ) ) ) ;
    public final EObject ruleEClassOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_var_1_0 = null;

        EObject lv_op_3_0 = null;

        EObject lv_op_4_0 = null;

        EObject lv_op_5_0 = null;

        EObject lv_setters_7_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_references_9_0 = null;

        EObject lv_complex_11_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:518:28: ( ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' )? ( ( ( (lv_op_3_0= ruleChangeClass ) ) | ( (lv_op_4_0= ruleAddClass ) ) | ( (lv_op_5_0= ruleDeleteClass ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulesetter ) ) | ( (lv_attributes_8_0= ruleEAttributeOperation ) ) | ( (lv_references_9_0= ruleEReferenceOperation ) ) )* otherlv_10= '}' ) | ( (lv_complex_11_0= ruleComplexOperator ) ) ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:519:1: ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' )? ( ( ( (lv_op_3_0= ruleChangeClass ) ) | ( (lv_op_4_0= ruleAddClass ) ) | ( (lv_op_5_0= ruleDeleteClass ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulesetter ) ) | ( (lv_attributes_8_0= ruleEAttributeOperation ) ) | ( (lv_references_9_0= ruleEReferenceOperation ) ) )* otherlv_10= '}' ) | ( (lv_complex_11_0= ruleComplexOperator ) ) ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:519:1: ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' )? ( ( ( (lv_op_3_0= ruleChangeClass ) ) | ( (lv_op_4_0= ruleAddClass ) ) | ( (lv_op_5_0= ruleDeleteClass ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulesetter ) ) | ( (lv_attributes_8_0= ruleEAttributeOperation ) ) | ( (lv_references_9_0= ruleEReferenceOperation ) ) )* otherlv_10= '}' ) | ( (lv_complex_11_0= ruleComplexOperator ) ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:519:2: (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' )? ( ( ( (lv_op_3_0= ruleChangeClass ) ) | ( (lv_op_4_0= ruleAddClass ) ) | ( (lv_op_5_0= ruleDeleteClass ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulesetter ) ) | ( (lv_attributes_8_0= ruleEAttributeOperation ) ) | ( (lv_references_9_0= ruleEReferenceOperation ) ) )* otherlv_10= '}' ) | ( (lv_complex_11_0= ruleComplexOperator ) ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:519:2: (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:519:4: otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '='
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleEClassOperation1061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getEClassOperationAccess().getClassKeyword_0_0());
                          
                    }
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:523:1: ( (lv_var_1_0= ruleClass ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:524:1: (lv_var_1_0= ruleClass )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:524:1: (lv_var_1_0= ruleClass )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:525:3: lv_var_1_0= ruleClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEClassOperationAccess().getVarClassParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_in_ruleEClassOperation1082);
                    lv_var_1_0=ruleClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEClassOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"var",
                              		lv_var_1_0, 
                              		"Class");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEClassOperation1094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEClassOperationAccess().getEqualsSignKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:545:3: ( ( ( (lv_op_3_0= ruleChangeClass ) ) | ( (lv_op_4_0= ruleAddClass ) ) | ( (lv_op_5_0= ruleDeleteClass ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulesetter ) ) | ( (lv_attributes_8_0= ruleEAttributeOperation ) ) | ( (lv_references_9_0= ruleEReferenceOperation ) ) )* otherlv_10= '}' ) | ( (lv_complex_11_0= ruleComplexOperator ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:545:4: ( ( (lv_op_3_0= ruleChangeClass ) ) | ( (lv_op_4_0= ruleAddClass ) ) | ( (lv_op_5_0= ruleDeleteClass ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulesetter ) ) | ( (lv_attributes_8_0= ruleEAttributeOperation ) ) | ( (lv_references_9_0= ruleEReferenceOperation ) ) )* otherlv_10= '}' ) | ( (lv_complex_11_0= ruleComplexOperator ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:545:4: ( ( (lv_op_3_0= ruleChangeClass ) ) | ( (lv_op_4_0= ruleAddClass ) ) | ( (lv_op_5_0= ruleDeleteClass ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:545:5: ( (lv_op_3_0= ruleChangeClass ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:545:5: ( (lv_op_3_0= ruleChangeClass ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:546:1: (lv_op_3_0= ruleChangeClass )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:546:1: (lv_op_3_0= ruleChangeClass )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:547:3: lv_op_3_0= ruleChangeClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEClassOperationAccess().getOpChangeClassParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleChangeClass_in_ruleEClassOperation1119);
                    lv_op_3_0=ruleChangeClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEClassOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_3_0, 
                              		"ChangeClass");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:564:6: ( (lv_op_4_0= ruleAddClass ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:564:6: ( (lv_op_4_0= ruleAddClass ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:565:1: (lv_op_4_0= ruleAddClass )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:565:1: (lv_op_4_0= ruleAddClass )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:566:3: lv_op_4_0= ruleAddClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEClassOperationAccess().getOpAddClassParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAddClass_in_ruleEClassOperation1146);
                    lv_op_4_0=ruleAddClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEClassOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_4_0, 
                              		"AddClass");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:583:6: ( (lv_op_5_0= ruleDeleteClass ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:583:6: ( (lv_op_5_0= ruleDeleteClass ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:584:1: (lv_op_5_0= ruleDeleteClass )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:584:1: (lv_op_5_0= ruleDeleteClass )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:585:3: lv_op_5_0= ruleDeleteClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEClassOperationAccess().getOpDeleteClassParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeleteClass_in_ruleEClassOperation1173);
                    lv_op_5_0=ruleDeleteClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEClassOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_5_0, 
                              		"DeleteClass");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:601:3: ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulesetter ) ) | ( (lv_attributes_8_0= ruleEAttributeOperation ) ) | ( (lv_references_9_0= ruleEReferenceOperation ) ) )* otherlv_10= '}' ) | ( (lv_complex_11_0= ruleComplexOperator ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:601:4: (otherlv_6= '{' ( ( (lv_setters_7_0= rulesetter ) ) | ( (lv_attributes_8_0= ruleEAttributeOperation ) ) | ( (lv_references_9_0= ruleEReferenceOperation ) ) )* otherlv_10= '}' )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:601:4: (otherlv_6= '{' ( ( (lv_setters_7_0= rulesetter ) ) | ( (lv_attributes_8_0= ruleEAttributeOperation ) ) | ( (lv_references_9_0= ruleEReferenceOperation ) ) )* otherlv_10= '}' )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:601:6: otherlv_6= '{' ( ( (lv_setters_7_0= rulesetter ) ) | ( (lv_attributes_8_0= ruleEAttributeOperation ) ) | ( (lv_references_9_0= ruleEReferenceOperation ) ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEClassOperation1188); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEClassOperationAccess().getLeftCurlyBracketKeyword_1_1_0_0());
                          
                    }
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:605:1: ( ( (lv_setters_7_0= rulesetter ) ) | ( (lv_attributes_8_0= ruleEAttributeOperation ) ) | ( (lv_references_9_0= ruleEReferenceOperation ) ) )*
                    loop10:
                    do {
                        int alt10=4;
                        alt10 = dfa10.predict(input);
                        switch (alt10) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:605:2: ( (lv_setters_7_0= rulesetter ) )
                    	    {
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:605:2: ( (lv_setters_7_0= rulesetter ) )
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:606:1: (lv_setters_7_0= rulesetter )
                    	    {
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:606:1: (lv_setters_7_0= rulesetter )
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:607:3: lv_setters_7_0= rulesetter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEClassOperationAccess().getSettersSetterParserRuleCall_1_1_0_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulesetter_in_ruleEClassOperation1210);
                    	    lv_setters_7_0=rulesetter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEClassOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"setters",
                    	              		lv_setters_7_0, 
                    	              		"setter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:624:6: ( (lv_attributes_8_0= ruleEAttributeOperation ) )
                    	    {
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:624:6: ( (lv_attributes_8_0= ruleEAttributeOperation ) )
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:625:1: (lv_attributes_8_0= ruleEAttributeOperation )
                    	    {
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:625:1: (lv_attributes_8_0= ruleEAttributeOperation )
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:626:3: lv_attributes_8_0= ruleEAttributeOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEClassOperationAccess().getAttributesEAttributeOperationParserRuleCall_1_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEAttributeOperation_in_ruleEClassOperation1237);
                    	    lv_attributes_8_0=ruleEAttributeOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEClassOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_8_0, 
                    	              		"EAttributeOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:643:6: ( (lv_references_9_0= ruleEReferenceOperation ) )
                    	    {
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:643:6: ( (lv_references_9_0= ruleEReferenceOperation ) )
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:644:1: (lv_references_9_0= ruleEReferenceOperation )
                    	    {
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:644:1: (lv_references_9_0= ruleEReferenceOperation )
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:645:3: lv_references_9_0= ruleEReferenceOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEClassOperationAccess().getReferencesEReferenceOperationParserRuleCall_1_1_0_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEReferenceOperation_in_ruleEClassOperation1264);
                    	    lv_references_9_0=ruleEReferenceOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEClassOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"references",
                    	              		lv_references_9_0, 
                    	              		"EReferenceOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEClassOperation1278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getEClassOperationAccess().getRightCurlyBracketKeyword_1_1_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:666:6: ( (lv_complex_11_0= ruleComplexOperator ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:666:6: ( (lv_complex_11_0= ruleComplexOperator ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:667:1: (lv_complex_11_0= ruleComplexOperator )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:667:1: (lv_complex_11_0= ruleComplexOperator )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:668:3: lv_complex_11_0= ruleComplexOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEClassOperationAccess().getComplexComplexOperatorParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComplexOperator_in_ruleEClassOperation1306);
                    lv_complex_11_0=ruleComplexOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEClassOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"complex",
                              		lv_complex_11_0, 
                              		"ComplexOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEClassOperation"


    // $ANTLR start "entryRuleChangeClass"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:692:1: entryRuleChangeClass returns [EObject current=null] : iv_ruleChangeClass= ruleChangeClass EOF ;
    public final EObject entryRuleChangeClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeClass = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:693:2: (iv_ruleChangeClass= ruleChangeClass EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:694:2: iv_ruleChangeClass= ruleChangeClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChangeClassRule()); 
            }
            pushFollow(FOLLOW_ruleChangeClass_in_entryRuleChangeClass1344);
            iv_ruleChangeClass=ruleChangeClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChangeClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeClass1354); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeClass"


    // $ANTLR start "ruleChangeClass"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:701:1: ruleChangeClass returns [EObject current=null] : ( ( (lv_op_0_0= 'changeClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleChangeClass() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:704:28: ( ( ( (lv_op_0_0= 'changeClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:705:1: ( ( (lv_op_0_0= 'changeClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:705:1: ( ( (lv_op_0_0= 'changeClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:705:2: ( (lv_op_0_0= 'changeClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:705:2: ( (lv_op_0_0= 'changeClass(' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:706:1: (lv_op_0_0= 'changeClass(' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:706:1: (lv_op_0_0= 'changeClass(' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:707:3: lv_op_0_0= 'changeClass('
            {
            lv_op_0_0=(Token)match(input,22,FOLLOW_22_in_ruleChangeClass1397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_op_0_0, grammarAccess.getChangeClassAccess().getOpChangeClassKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getChangeClassRule());
              	        }
                     		setWithLastConsumed(current, "op", lv_op_0_0, "changeClass(");
              	    
            }

            }


            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:720:2: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:721:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:721:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:722:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getChangeClassRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChangeClass1434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getChangeClassAccess().getRefEClassCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleChangeClass1446); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getChangeClassAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangeClass"


    // $ANTLR start "entryRuleAddClass"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:748:1: entryRuleAddClass returns [EObject current=null] : iv_ruleAddClass= ruleAddClass EOF ;
    public final EObject entryRuleAddClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddClass = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:749:2: (iv_ruleAddClass= ruleAddClass EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:750:2: iv_ruleAddClass= ruleAddClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddClassRule()); 
            }
            pushFollow(FOLLOW_ruleAddClass_in_entryRuleAddClass1482);
            iv_ruleAddClass=ruleAddClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddClass1492); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddClass"


    // $ANTLR start "ruleAddClass"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:757:1: ruleAddClass returns [EObject current=null] : ( ( (lv_op_0_0= 'addClass(' ) ) ( ( (lv_new_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ')' ) ;
    public final EObject ruleAddClass() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token lv_new_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:760:28: ( ( ( (lv_op_0_0= 'addClass(' ) ) ( ( (lv_new_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ')' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:761:1: ( ( (lv_op_0_0= 'addClass(' ) ) ( ( (lv_new_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ')' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:761:1: ( ( (lv_op_0_0= 'addClass(' ) ) ( ( (lv_new_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ')' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:761:2: ( (lv_op_0_0= 'addClass(' ) ) ( ( (lv_new_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ')'
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:761:2: ( (lv_op_0_0= 'addClass(' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:762:1: (lv_op_0_0= 'addClass(' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:762:1: (lv_op_0_0= 'addClass(' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:763:3: lv_op_0_0= 'addClass('
            {
            lv_op_0_0=(Token)match(input,23,FOLLOW_23_in_ruleAddClass1535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_op_0_0, grammarAccess.getAddClassAccess().getOpAddClassKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAddClassRule());
              	        }
                     		setWithLastConsumed(current, "op", lv_op_0_0, "addClass(");
              	    
            }

            }


            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:776:2: ( ( (lv_new_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:776:3: ( (lv_new_1_0= RULE_STRING ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:776:3: ( (lv_new_1_0= RULE_STRING ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:777:1: (lv_new_1_0= RULE_STRING )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:777:1: (lv_new_1_0= RULE_STRING )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:778:3: lv_new_1_0= RULE_STRING
                    {
                    lv_new_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAddClass1566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_new_1_0, grammarAccess.getAddClassAccess().getNewSTRINGTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAddClassRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"new",
                              		lv_new_1_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:795:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:795:6: ( (otherlv_2= RULE_ID ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:796:1: (otherlv_2= RULE_ID )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:796:1: (otherlv_2= RULE_ID )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:797:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAddClassRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddClass1601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getAddClassAccess().getRefSTRINGCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleAddClass1614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAddClassAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddClass"


    // $ANTLR start "entryRuleDeleteClass"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:823:1: entryRuleDeleteClass returns [EObject current=null] : iv_ruleDeleteClass= ruleDeleteClass EOF ;
    public final EObject entryRuleDeleteClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteClass = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:824:2: (iv_ruleDeleteClass= ruleDeleteClass EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:825:2: iv_ruleDeleteClass= ruleDeleteClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteClassRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteClass_in_entryRuleDeleteClass1650);
            iv_ruleDeleteClass=ruleDeleteClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteClass1660); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteClass"


    // $ANTLR start "ruleDeleteClass"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:832:1: ruleDeleteClass returns [EObject current=null] : ( ( (lv_op_0_0= 'deleteClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleDeleteClass() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:835:28: ( ( ( (lv_op_0_0= 'deleteClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:836:1: ( ( (lv_op_0_0= 'deleteClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:836:1: ( ( (lv_op_0_0= 'deleteClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:836:2: ( (lv_op_0_0= 'deleteClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:836:2: ( (lv_op_0_0= 'deleteClass(' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:837:1: (lv_op_0_0= 'deleteClass(' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:837:1: (lv_op_0_0= 'deleteClass(' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:838:3: lv_op_0_0= 'deleteClass('
            {
            lv_op_0_0=(Token)match(input,24,FOLLOW_24_in_ruleDeleteClass1703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_op_0_0, grammarAccess.getDeleteClassAccess().getOpDeleteClassKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteClassRule());
              	        }
                     		setWithLastConsumed(current, "op", lv_op_0_0, "deleteClass(");
              	    
            }

            }


            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:851:2: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:852:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:852:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:853:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteClassRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteClass1740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getDeleteClassAccess().getRefEClassCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDeleteClass1752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDeleteClassAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteClass"


    // $ANTLR start "entryRuleClass"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:879:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:880:2: (iv_ruleClass= ruleClass EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:881:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass1788);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass1798); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:888:1: ruleClass returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:891:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:892:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:892:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:892:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:892:2: ()
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:893:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClassAccess().getClassAction_0(),
                          current);
                  
            }

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:901:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:902:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:902:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:903:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRulesetter"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:927:1: entryRulesetter returns [EObject current=null] : iv_rulesetter= rulesetter EOF ;
    public final EObject entryRulesetter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesetter = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:928:2: (iv_rulesetter= rulesetter EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:929:2: iv_rulesetter= rulesetter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetterRule()); 
            }
            pushFollow(FOLLOW_rulesetter_in_entryRulesetter1893);
            iv_rulesetter=rulesetter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesetter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesetter1903); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesetter"


    // $ANTLR start "rulesetter"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:936:1: rulesetter returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=' ( ( ( (lv_value_3_0= RULE_STRING ) ) | this_BOOL_4= RULE_BOOL ) | ( (lv_card_5_0= ruleCardinality ) ) | ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) ;
    public final EObject rulesetter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token this_BOOL_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_card_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:939:28: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=' ( ( ( (lv_value_3_0= RULE_STRING ) ) | this_BOOL_4= RULE_BOOL ) | ( (lv_card_5_0= ruleCardinality ) ) | ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:940:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=' ( ( ( (lv_value_3_0= RULE_STRING ) ) | this_BOOL_4= RULE_BOOL ) | ( (lv_card_5_0= ruleCardinality ) ) | ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:940:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=' ( ( ( (lv_value_3_0= RULE_STRING ) ) | this_BOOL_4= RULE_BOOL ) | ( (lv_card_5_0= ruleCardinality ) ) | ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:940:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=' ( ( ( (lv_value_3_0= RULE_STRING ) ) | this_BOOL_4= RULE_BOOL ) | ( (lv_card_5_0= ruleCardinality ) ) | ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_rulesetter1940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSetterAccess().getSetKeyword_0());
                  
            }
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:944:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:945:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:945:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:946:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSetterRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesetter1964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getSetterAccess().getMetafeatureEStructuralFeatureCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_rulesetter1976); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSetterAccess().getLessThanSignEqualsSignKeyword_2());
                  
            }
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:964:1: ( ( ( (lv_value_3_0= RULE_STRING ) ) | this_BOOL_4= RULE_BOOL ) | ( (lv_card_5_0= ruleCardinality ) ) | ( (otherlv_6= RULE_ID ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_BOOL:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
            case 29:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:964:2: ( ( (lv_value_3_0= RULE_STRING ) ) | this_BOOL_4= RULE_BOOL )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:964:2: ( ( (lv_value_3_0= RULE_STRING ) ) | this_BOOL_4= RULE_BOOL )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_STRING) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_BOOL) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:964:3: ( (lv_value_3_0= RULE_STRING ) )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:964:3: ( (lv_value_3_0= RULE_STRING ) )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:965:1: (lv_value_3_0= RULE_STRING )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:965:1: (lv_value_3_0= RULE_STRING )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:966:3: lv_value_3_0= RULE_STRING
                            {
                            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulesetter1995); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_value_3_0, grammarAccess.getSetterAccess().getValueSTRINGTerminalRuleCall_3_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSetterRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"value",
                                      		lv_value_3_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:983:6: this_BOOL_4= RULE_BOOL
                            {
                            this_BOOL_4=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rulesetter2017); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_BOOL_4, grammarAccess.getSetterAccess().getBOOLTerminalRuleCall_3_0_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:988:6: ( (lv_card_5_0= ruleCardinality ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:988:6: ( (lv_card_5_0= ruleCardinality ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:989:1: (lv_card_5_0= ruleCardinality )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:989:1: (lv_card_5_0= ruleCardinality )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:990:3: lv_card_5_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSetterAccess().getCardCardinalityParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCardinality_in_rulesetter2044);
                    lv_card_5_0=ruleCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSetterRule());
                      	        }
                             		set(
                             			current, 
                             			"card",
                              		lv_card_5_0, 
                              		"Cardinality");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1007:6: ( (otherlv_6= RULE_ID ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1007:6: ( (otherlv_6= RULE_ID ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1008:1: (otherlv_6= RULE_ID )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1008:1: (otherlv_6= RULE_ID )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1009:3: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSetterRule());
                      	        }
                              
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesetter2074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_6, grammarAccess.getSetterAccess().getValueRefEObjectCrossReference_3_2_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1023:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1023:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,27,FOLLOW_27_in_rulesetter2088); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getSetterAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1027:1: ( (otherlv_8= RULE_ID ) )
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1028:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1028:1: (otherlv_8= RULE_ID )
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1029:3: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSetterRule());
            	      	        }
            	              
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesetter2112); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_8, grammarAccess.getSetterAccess().getValueRefEObjectCrossReference_4_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,28,FOLLOW_28_in_rulesetter2126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getSetterAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesetter"


    // $ANTLR start "entryRuleCardinality"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1055:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1056:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1057:2: iv_ruleCardinality= ruleCardinality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCardinalityRule()); 
            }
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality2163);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCardinality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality2174); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1064:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1067:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1068:1: (this_INT_0= RULE_INT | kw= '*' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1068:1: (this_INT_0= RULE_INT | kw= '*' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==29) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1068:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCardinality2214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1077:2: kw= '*'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleCardinality2238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleEAttributeOperation"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1090:1: entryRuleEAttributeOperation returns [EObject current=null] : iv_ruleEAttributeOperation= ruleEAttributeOperation EOF ;
    public final EObject entryRuleEAttributeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeOperation = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1091:2: (iv_ruleEAttributeOperation= ruleEAttributeOperation EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1092:2: iv_ruleEAttributeOperation= ruleEAttributeOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEAttributeOperationRule()); 
            }
            pushFollow(FOLLOW_ruleEAttributeOperation_in_entryRuleEAttributeOperation2278);
            iv_ruleEAttributeOperation=ruleEAttributeOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEAttributeOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEAttributeOperation2288); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAttributeOperation"


    // $ANTLR start "ruleEAttributeOperation"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1099:1: ruleEAttributeOperation returns [EObject current=null] : ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_0= ruleChangeAttribute ) ) | ( (lv_op_4_0= ruleAddAttribute ) ) | ( (lv_op_5_0= ruleDeleteAttribute ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) ) | ( (lv_complex_9_0= ruleComplexOperator ) ) ) ) ;
    public final EObject ruleEAttributeOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_var_1_0 = null;

        EObject lv_op_3_0 = null;

        EObject lv_op_4_0 = null;

        EObject lv_op_5_0 = null;

        EObject lv_setters_7_0 = null;

        EObject lv_complex_9_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1102:28: ( ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_0= ruleChangeAttribute ) ) | ( (lv_op_4_0= ruleAddAttribute ) ) | ( (lv_op_5_0= ruleDeleteAttribute ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) ) | ( (lv_complex_9_0= ruleComplexOperator ) ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1103:1: ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_0= ruleChangeAttribute ) ) | ( (lv_op_4_0= ruleAddAttribute ) ) | ( (lv_op_5_0= ruleDeleteAttribute ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) ) | ( (lv_complex_9_0= ruleComplexOperator ) ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1103:1: ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_0= ruleChangeAttribute ) ) | ( (lv_op_4_0= ruleAddAttribute ) ) | ( (lv_op_5_0= ruleDeleteAttribute ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) ) | ( (lv_complex_9_0= ruleComplexOperator ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1103:2: (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_0= ruleChangeAttribute ) ) | ( (lv_op_4_0= ruleAddAttribute ) ) | ( (lv_op_5_0= ruleDeleteAttribute ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) ) | ( (lv_complex_9_0= ruleComplexOperator ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1103:2: (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1103:4: otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '='
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleEAttributeOperation2326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getEAttributeOperationAccess().getAttributeKeyword_0_0());
                          
                    }
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1107:1: ( (lv_var_1_0= ruleAttribute ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1108:1: (lv_var_1_0= ruleAttribute )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1108:1: (lv_var_1_0= ruleAttribute )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1109:3: lv_var_1_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEAttributeOperationAccess().getVarAttributeParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleEAttributeOperation2347);
                    lv_var_1_0=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEAttributeOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"var",
                              		lv_var_1_0, 
                              		"Attribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEAttributeOperation2359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEAttributeOperationAccess().getEqualsSignKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1129:3: ( ( ( ( (lv_op_3_0= ruleChangeAttribute ) ) | ( (lv_op_4_0= ruleAddAttribute ) ) | ( (lv_op_5_0= ruleDeleteAttribute ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) ) | ( (lv_complex_9_0= ruleComplexOperator ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=31 && LA20_0<=33)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1129:4: ( ( ( (lv_op_3_0= ruleChangeAttribute ) ) | ( (lv_op_4_0= ruleAddAttribute ) ) | ( (lv_op_5_0= ruleDeleteAttribute ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1129:4: ( ( ( (lv_op_3_0= ruleChangeAttribute ) ) | ( (lv_op_4_0= ruleAddAttribute ) ) | ( (lv_op_5_0= ruleDeleteAttribute ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1129:5: ( ( (lv_op_3_0= ruleChangeAttribute ) ) | ( (lv_op_4_0= ruleAddAttribute ) ) | ( (lv_op_5_0= ruleDeleteAttribute ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1129:5: ( ( (lv_op_3_0= ruleChangeAttribute ) ) | ( (lv_op_4_0= ruleAddAttribute ) ) | ( (lv_op_5_0= ruleDeleteAttribute ) ) )
                    int alt18=3;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt18=1;
                        }
                        break;
                    case 32:
                        {
                        alt18=2;
                        }
                        break;
                    case 33:
                        {
                        alt18=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }

                    switch (alt18) {
                        case 1 :
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1129:6: ( (lv_op_3_0= ruleChangeAttribute ) )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1129:6: ( (lv_op_3_0= ruleChangeAttribute ) )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1130:1: (lv_op_3_0= ruleChangeAttribute )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1130:1: (lv_op_3_0= ruleChangeAttribute )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1131:3: lv_op_3_0= ruleChangeAttribute
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeOperationAccess().getOpChangeAttributeParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleChangeAttribute_in_ruleEAttributeOperation2385);
                            lv_op_3_0=ruleChangeAttribute();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEAttributeOperationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_3_0, 
                                      		"ChangeAttribute");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1148:6: ( (lv_op_4_0= ruleAddAttribute ) )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1148:6: ( (lv_op_4_0= ruleAddAttribute ) )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1149:1: (lv_op_4_0= ruleAddAttribute )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1149:1: (lv_op_4_0= ruleAddAttribute )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1150:3: lv_op_4_0= ruleAddAttribute
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeOperationAccess().getOpAddAttributeParserRuleCall_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAddAttribute_in_ruleEAttributeOperation2412);
                            lv_op_4_0=ruleAddAttribute();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEAttributeOperationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_4_0, 
                                      		"AddAttribute");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1167:6: ( (lv_op_5_0= ruleDeleteAttribute ) )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1167:6: ( (lv_op_5_0= ruleDeleteAttribute ) )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1168:1: (lv_op_5_0= ruleDeleteAttribute )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1168:1: (lv_op_5_0= ruleDeleteAttribute )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1169:3: lv_op_5_0= ruleDeleteAttribute
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeOperationAccess().getOpDeleteAttributeParserRuleCall_1_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDeleteAttribute_in_ruleEAttributeOperation2439);
                            lv_op_5_0=ruleDeleteAttribute();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEAttributeOperationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_5_0, 
                                      		"DeleteAttribute");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1185:3: (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1185:5: otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEAttributeOperation2453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEAttributeOperationAccess().getLeftCurlyBracketKeyword_1_0_1_0());
                          
                    }
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1189:1: ( (lv_setters_7_0= rulesetter ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==25) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1190:1: (lv_setters_7_0= rulesetter )
                    	    {
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1190:1: (lv_setters_7_0= rulesetter )
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1191:3: lv_setters_7_0= rulesetter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEAttributeOperationAccess().getSettersSetterParserRuleCall_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulesetter_in_ruleEAttributeOperation2474);
                    	    lv_setters_7_0=rulesetter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEAttributeOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"setters",
                    	              		lv_setters_7_0, 
                    	              		"setter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEAttributeOperation2487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEAttributeOperationAccess().getRightCurlyBracketKeyword_1_0_1_2());
                          
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1212:6: ( (lv_complex_9_0= ruleComplexOperator ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1212:6: ( (lv_complex_9_0= ruleComplexOperator ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1213:1: (lv_complex_9_0= ruleComplexOperator )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1213:1: (lv_complex_9_0= ruleComplexOperator )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1214:3: lv_complex_9_0= ruleComplexOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEAttributeOperationAccess().getComplexComplexOperatorParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComplexOperator_in_ruleEAttributeOperation2516);
                    lv_complex_9_0=ruleComplexOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEAttributeOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"complex",
                              		lv_complex_9_0, 
                              		"ComplexOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAttributeOperation"


    // $ANTLR start "entryRuleChangeAttribute"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1238:1: entryRuleChangeAttribute returns [EObject current=null] : iv_ruleChangeAttribute= ruleChangeAttribute EOF ;
    public final EObject entryRuleChangeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeAttribute = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1239:2: (iv_ruleChangeAttribute= ruleChangeAttribute EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1240:2: iv_ruleChangeAttribute= ruleChangeAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChangeAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleChangeAttribute_in_entryRuleChangeAttribute2553);
            iv_ruleChangeAttribute=ruleChangeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChangeAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeAttribute2563); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeAttribute"


    // $ANTLR start "ruleChangeAttribute"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1247:1: ruleChangeAttribute returns [EObject current=null] : ( ( (lv_op_0_0= 'changeAttribute(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleChangeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1250:28: ( ( ( (lv_op_0_0= 'changeAttribute(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1251:1: ( ( (lv_op_0_0= 'changeAttribute(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1251:1: ( ( (lv_op_0_0= 'changeAttribute(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1251:2: ( (lv_op_0_0= 'changeAttribute(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1251:2: ( (lv_op_0_0= 'changeAttribute(' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1252:1: (lv_op_0_0= 'changeAttribute(' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1252:1: (lv_op_0_0= 'changeAttribute(' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1253:3: lv_op_0_0= 'changeAttribute('
            {
            lv_op_0_0=(Token)match(input,31,FOLLOW_31_in_ruleChangeAttribute2606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_op_0_0, grammarAccess.getChangeAttributeAccess().getOpChangeAttributeKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getChangeAttributeRule());
              	        }
                     		setWithLastConsumed(current, "op", lv_op_0_0, "changeAttribute(");
              	    
            }

            }


            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1266:2: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1267:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1267:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1268:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getChangeAttributeRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChangeAttribute2643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getChangeAttributeAccess().getRefEAttributeCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleChangeAttribute2655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getChangeAttributeAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangeAttribute"


    // $ANTLR start "entryRuleAddAttribute"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1294:1: entryRuleAddAttribute returns [EObject current=null] : iv_ruleAddAttribute= ruleAddAttribute EOF ;
    public final EObject entryRuleAddAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddAttribute = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1295:2: (iv_ruleAddAttribute= ruleAddAttribute EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1296:2: iv_ruleAddAttribute= ruleAddAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAddAttribute_in_entryRuleAddAttribute2691);
            iv_ruleAddAttribute=ruleAddAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddAttribute2701); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddAttribute"


    // $ANTLR start "ruleAddAttribute"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1303:1: ruleAddAttribute returns [EObject current=null] : ( ( (lv_op_0_0= 'addAttribute(' ) ) ( ( (lv_new_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ')' ) ;
    public final EObject ruleAddAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token lv_new_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1306:28: ( ( ( (lv_op_0_0= 'addAttribute(' ) ) ( ( (lv_new_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ')' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1307:1: ( ( (lv_op_0_0= 'addAttribute(' ) ) ( ( (lv_new_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ')' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1307:1: ( ( (lv_op_0_0= 'addAttribute(' ) ) ( ( (lv_new_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ')' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1307:2: ( (lv_op_0_0= 'addAttribute(' ) ) ( ( (lv_new_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ')'
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1307:2: ( (lv_op_0_0= 'addAttribute(' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1308:1: (lv_op_0_0= 'addAttribute(' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1308:1: (lv_op_0_0= 'addAttribute(' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1309:3: lv_op_0_0= 'addAttribute('
            {
            lv_op_0_0=(Token)match(input,32,FOLLOW_32_in_ruleAddAttribute2744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_op_0_0, grammarAccess.getAddAttributeAccess().getOpAddAttributeKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAddAttributeRule());
              	        }
                     		setWithLastConsumed(current, "op", lv_op_0_0, "addAttribute(");
              	    
            }

            }


            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1322:2: ( ( (lv_new_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1322:3: ( (lv_new_1_0= RULE_STRING ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1322:3: ( (lv_new_1_0= RULE_STRING ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1323:1: (lv_new_1_0= RULE_STRING )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1323:1: (lv_new_1_0= RULE_STRING )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1324:3: lv_new_1_0= RULE_STRING
                    {
                    lv_new_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAddAttribute2775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_new_1_0, grammarAccess.getAddAttributeAccess().getNewSTRINGTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAddAttributeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"new",
                              		lv_new_1_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1341:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1341:6: ( (otherlv_2= RULE_ID ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1342:1: (otherlv_2= RULE_ID )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1342:1: (otherlv_2= RULE_ID )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1343:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAddAttributeRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddAttribute2810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getAddAttributeAccess().getRefSTRINGCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleAddAttribute2823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAddAttributeAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddAttribute"


    // $ANTLR start "entryRuleDeleteAttribute"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1369:1: entryRuleDeleteAttribute returns [EObject current=null] : iv_ruleDeleteAttribute= ruleDeleteAttribute EOF ;
    public final EObject entryRuleDeleteAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteAttribute = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1370:2: (iv_ruleDeleteAttribute= ruleDeleteAttribute EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1371:2: iv_ruleDeleteAttribute= ruleDeleteAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteAttribute_in_entryRuleDeleteAttribute2859);
            iv_ruleDeleteAttribute=ruleDeleteAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteAttribute2869); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteAttribute"


    // $ANTLR start "ruleDeleteAttribute"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1378:1: ruleDeleteAttribute returns [EObject current=null] : ( ( (lv_op_0_0= 'deleteAttribute(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleDeleteAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1381:28: ( ( ( (lv_op_0_0= 'deleteAttribute(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1382:1: ( ( (lv_op_0_0= 'deleteAttribute(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1382:1: ( ( (lv_op_0_0= 'deleteAttribute(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1382:2: ( (lv_op_0_0= 'deleteAttribute(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1382:2: ( (lv_op_0_0= 'deleteAttribute(' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1383:1: (lv_op_0_0= 'deleteAttribute(' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1383:1: (lv_op_0_0= 'deleteAttribute(' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1384:3: lv_op_0_0= 'deleteAttribute('
            {
            lv_op_0_0=(Token)match(input,33,FOLLOW_33_in_ruleDeleteAttribute2912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_op_0_0, grammarAccess.getDeleteAttributeAccess().getOpDeleteAttributeKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteAttributeRule());
              	        }
                     		setWithLastConsumed(current, "op", lv_op_0_0, "deleteAttribute(");
              	    
            }

            }


            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1397:2: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1398:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1398:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1399:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteAttributeRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteAttribute2949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getDeleteAttributeAccess().getRefEAttributeCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDeleteAttribute2961); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDeleteAttributeAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteAttribute"


    // $ANTLR start "entryRuleEReferenceOperation"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1425:1: entryRuleEReferenceOperation returns [EObject current=null] : iv_ruleEReferenceOperation= ruleEReferenceOperation EOF ;
    public final EObject entryRuleEReferenceOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReferenceOperation = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1426:2: (iv_ruleEReferenceOperation= ruleEReferenceOperation EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1427:2: iv_ruleEReferenceOperation= ruleEReferenceOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEReferenceOperationRule()); 
            }
            pushFollow(FOLLOW_ruleEReferenceOperation_in_entryRuleEReferenceOperation2997);
            iv_ruleEReferenceOperation=ruleEReferenceOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEReferenceOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEReferenceOperation3007); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEReferenceOperation"


    // $ANTLR start "ruleEReferenceOperation"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1434:1: ruleEReferenceOperation returns [EObject current=null] : ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_0= ruleChangeReference ) ) | ( (lv_op_4_0= ruleAddReference ) ) | ( (lv_op_5_0= ruleDeleteReference ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) ) | ( (lv_complex_9_0= ruleComplexOperator ) ) ) ) ;
    public final EObject ruleEReferenceOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_var_1_0 = null;

        EObject lv_op_3_0 = null;

        EObject lv_op_4_0 = null;

        EObject lv_op_5_0 = null;

        EObject lv_setters_7_0 = null;

        EObject lv_complex_9_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1437:28: ( ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_0= ruleChangeReference ) ) | ( (lv_op_4_0= ruleAddReference ) ) | ( (lv_op_5_0= ruleDeleteReference ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) ) | ( (lv_complex_9_0= ruleComplexOperator ) ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1438:1: ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_0= ruleChangeReference ) ) | ( (lv_op_4_0= ruleAddReference ) ) | ( (lv_op_5_0= ruleDeleteReference ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) ) | ( (lv_complex_9_0= ruleComplexOperator ) ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1438:1: ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_0= ruleChangeReference ) ) | ( (lv_op_4_0= ruleAddReference ) ) | ( (lv_op_5_0= ruleDeleteReference ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) ) | ( (lv_complex_9_0= ruleComplexOperator ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1438:2: (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' )? ( ( ( ( (lv_op_3_0= ruleChangeReference ) ) | ( (lv_op_4_0= ruleAddReference ) ) | ( (lv_op_5_0= ruleDeleteReference ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) ) | ( (lv_complex_9_0= ruleComplexOperator ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1438:2: (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1438:4: otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '='
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleEReferenceOperation3045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getEReferenceOperationAccess().getReferenceKeyword_0_0());
                          
                    }
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1442:1: ( (lv_var_1_0= ruleReference ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1443:1: (lv_var_1_0= ruleReference )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1443:1: (lv_var_1_0= ruleReference )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1444:3: lv_var_1_0= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEReferenceOperationAccess().getVarReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleEReferenceOperation3066);
                    lv_var_1_0=ruleReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEReferenceOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"var",
                              		lv_var_1_0, 
                              		"Reference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEReferenceOperation3078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEReferenceOperationAccess().getEqualsSignKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1464:3: ( ( ( ( (lv_op_3_0= ruleChangeReference ) ) | ( (lv_op_4_0= ruleAddReference ) ) | ( (lv_op_5_0= ruleDeleteReference ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) ) | ( (lv_complex_9_0= ruleComplexOperator ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=35 && LA25_0<=37)) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1464:4: ( ( ( (lv_op_3_0= ruleChangeReference ) ) | ( (lv_op_4_0= ruleAddReference ) ) | ( (lv_op_5_0= ruleDeleteReference ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1464:4: ( ( ( (lv_op_3_0= ruleChangeReference ) ) | ( (lv_op_4_0= ruleAddReference ) ) | ( (lv_op_5_0= ruleDeleteReference ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1464:5: ( ( (lv_op_3_0= ruleChangeReference ) ) | ( (lv_op_4_0= ruleAddReference ) ) | ( (lv_op_5_0= ruleDeleteReference ) ) ) (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1464:5: ( ( (lv_op_3_0= ruleChangeReference ) ) | ( (lv_op_4_0= ruleAddReference ) ) | ( (lv_op_5_0= ruleDeleteReference ) ) )
                    int alt23=3;
                    switch ( input.LA(1) ) {
                    case 35:
                        {
                        alt23=1;
                        }
                        break;
                    case 36:
                        {
                        alt23=2;
                        }
                        break;
                    case 37:
                        {
                        alt23=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }

                    switch (alt23) {
                        case 1 :
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1464:6: ( (lv_op_3_0= ruleChangeReference ) )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1464:6: ( (lv_op_3_0= ruleChangeReference ) )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1465:1: (lv_op_3_0= ruleChangeReference )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1465:1: (lv_op_3_0= ruleChangeReference )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1466:3: lv_op_3_0= ruleChangeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEReferenceOperationAccess().getOpChangeReferenceParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleChangeReference_in_ruleEReferenceOperation3104);
                            lv_op_3_0=ruleChangeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEReferenceOperationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_3_0, 
                                      		"ChangeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1483:6: ( (lv_op_4_0= ruleAddReference ) )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1483:6: ( (lv_op_4_0= ruleAddReference ) )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1484:1: (lv_op_4_0= ruleAddReference )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1484:1: (lv_op_4_0= ruleAddReference )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1485:3: lv_op_4_0= ruleAddReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEReferenceOperationAccess().getOpAddReferenceParserRuleCall_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAddReference_in_ruleEReferenceOperation3131);
                            lv_op_4_0=ruleAddReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEReferenceOperationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_4_0, 
                                      		"AddReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1502:6: ( (lv_op_5_0= ruleDeleteReference ) )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1502:6: ( (lv_op_5_0= ruleDeleteReference ) )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1503:1: (lv_op_5_0= ruleDeleteReference )
                            {
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1503:1: (lv_op_5_0= ruleDeleteReference )
                            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1504:3: lv_op_5_0= ruleDeleteReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEReferenceOperationAccess().getOpDeleteReferenceParserRuleCall_1_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDeleteReference_in_ruleEReferenceOperation3158);
                            lv_op_5_0=ruleDeleteReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEReferenceOperationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_5_0, 
                                      		"DeleteReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1520:3: (otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}' )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1520:5: otherlv_6= '{' ( (lv_setters_7_0= rulesetter ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEReferenceOperation3172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEReferenceOperationAccess().getLeftCurlyBracketKeyword_1_0_1_0());
                          
                    }
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1524:1: ( (lv_setters_7_0= rulesetter ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==25) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1525:1: (lv_setters_7_0= rulesetter )
                    	    {
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1525:1: (lv_setters_7_0= rulesetter )
                    	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1526:3: lv_setters_7_0= rulesetter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEReferenceOperationAccess().getSettersSetterParserRuleCall_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulesetter_in_ruleEReferenceOperation3193);
                    	    lv_setters_7_0=rulesetter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEReferenceOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"setters",
                    	              		lv_setters_7_0, 
                    	              		"setter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEReferenceOperation3206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEReferenceOperationAccess().getRightCurlyBracketKeyword_1_0_1_2());
                          
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1547:6: ( (lv_complex_9_0= ruleComplexOperator ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1547:6: ( (lv_complex_9_0= ruleComplexOperator ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1548:1: (lv_complex_9_0= ruleComplexOperator )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1548:1: (lv_complex_9_0= ruleComplexOperator )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1549:3: lv_complex_9_0= ruleComplexOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEReferenceOperationAccess().getComplexComplexOperatorParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComplexOperator_in_ruleEReferenceOperation3235);
                    lv_complex_9_0=ruleComplexOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEReferenceOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"complex",
                              		lv_complex_9_0, 
                              		"ComplexOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEReferenceOperation"


    // $ANTLR start "entryRuleChangeReference"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1573:1: entryRuleChangeReference returns [EObject current=null] : iv_ruleChangeReference= ruleChangeReference EOF ;
    public final EObject entryRuleChangeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeReference = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1574:2: (iv_ruleChangeReference= ruleChangeReference EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1575:2: iv_ruleChangeReference= ruleChangeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChangeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleChangeReference_in_entryRuleChangeReference3272);
            iv_ruleChangeReference=ruleChangeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChangeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeReference3282); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeReference"


    // $ANTLR start "ruleChangeReference"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1582:1: ruleChangeReference returns [EObject current=null] : ( ( (lv_op_0_0= 'changeReference' ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleChangeReference() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1585:28: ( ( ( (lv_op_0_0= 'changeReference' ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1586:1: ( ( (lv_op_0_0= 'changeReference' ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1586:1: ( ( (lv_op_0_0= 'changeReference' ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1586:2: ( (lv_op_0_0= 'changeReference' ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1586:2: ( (lv_op_0_0= 'changeReference' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1587:1: (lv_op_0_0= 'changeReference' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1587:1: (lv_op_0_0= 'changeReference' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1588:3: lv_op_0_0= 'changeReference'
            {
            lv_op_0_0=(Token)match(input,35,FOLLOW_35_in_ruleChangeReference3325); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_op_0_0, grammarAccess.getChangeReferenceAccess().getOpChangeReferenceKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getChangeReferenceRule());
              	        }
                     		setWithLastConsumed(current, "op", lv_op_0_0, "changeReference");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleChangeReference3350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getChangeReferenceAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1605:1: ( (otherlv_2= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1606:1: (otherlv_2= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1606:1: (otherlv_2= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1607:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getChangeReferenceRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChangeReference3374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getChangeReferenceAccess().getRefEReferenceCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleChangeReference3386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getChangeReferenceAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangeReference"


    // $ANTLR start "entryRuleAddReference"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1633:1: entryRuleAddReference returns [EObject current=null] : iv_ruleAddReference= ruleAddReference EOF ;
    public final EObject entryRuleAddReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddReference = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1634:2: (iv_ruleAddReference= ruleAddReference EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1635:2: iv_ruleAddReference= ruleAddReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleAddReference_in_entryRuleAddReference3422);
            iv_ruleAddReference=ruleAddReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddReference3432); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddReference"


    // $ANTLR start "ruleAddReference"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1642:1: ruleAddReference returns [EObject current=null] : ( ( (lv_op_0_0= 'addReference' ) ) otherlv_1= '(' ( ( (lv_new_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ')' ) ;
    public final EObject ruleAddReference() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_1=null;
        Token lv_new_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1645:28: ( ( ( (lv_op_0_0= 'addReference' ) ) otherlv_1= '(' ( ( (lv_new_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ')' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1646:1: ( ( (lv_op_0_0= 'addReference' ) ) otherlv_1= '(' ( ( (lv_new_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ')' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1646:1: ( ( (lv_op_0_0= 'addReference' ) ) otherlv_1= '(' ( ( (lv_new_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ')' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1646:2: ( (lv_op_0_0= 'addReference' ) ) otherlv_1= '(' ( ( (lv_new_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ')'
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1646:2: ( (lv_op_0_0= 'addReference' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1647:1: (lv_op_0_0= 'addReference' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1647:1: (lv_op_0_0= 'addReference' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1648:3: lv_op_0_0= 'addReference'
            {
            lv_op_0_0=(Token)match(input,36,FOLLOW_36_in_ruleAddReference3475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_op_0_0, grammarAccess.getAddReferenceAccess().getOpAddReferenceKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAddReferenceRule());
              	        }
                     		setWithLastConsumed(current, "op", lv_op_0_0, "addReference");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAddReference3500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAddReferenceAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1665:1: ( ( (lv_new_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1665:2: ( (lv_new_2_0= RULE_STRING ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1665:2: ( (lv_new_2_0= RULE_STRING ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1666:1: (lv_new_2_0= RULE_STRING )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1666:1: (lv_new_2_0= RULE_STRING )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1667:3: lv_new_2_0= RULE_STRING
                    {
                    lv_new_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAddReference3518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_new_2_0, grammarAccess.getAddReferenceAccess().getNewSTRINGTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAddReferenceRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"new",
                              		lv_new_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1684:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1684:6: ( (otherlv_3= RULE_ID ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1685:1: (otherlv_3= RULE_ID )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1685:1: (otherlv_3= RULE_ID )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1686:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAddReferenceRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddReference3553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getAddReferenceAccess().getRefSTRINGCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAddReference3566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAddReferenceAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddReference"


    // $ANTLR start "entryRuleDeleteReference"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1712:1: entryRuleDeleteReference returns [EObject current=null] : iv_ruleDeleteReference= ruleDeleteReference EOF ;
    public final EObject entryRuleDeleteReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteReference = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1713:2: (iv_ruleDeleteReference= ruleDeleteReference EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1714:2: iv_ruleDeleteReference= ruleDeleteReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteReference_in_entryRuleDeleteReference3602);
            iv_ruleDeleteReference=ruleDeleteReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteReference3612); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteReference"


    // $ANTLR start "ruleDeleteReference"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1721:1: ruleDeleteReference returns [EObject current=null] : ( ( (lv_op_0_0= 'deleteReference' ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleDeleteReference() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1724:28: ( ( ( (lv_op_0_0= 'deleteReference' ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1725:1: ( ( (lv_op_0_0= 'deleteReference' ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1725:1: ( ( (lv_op_0_0= 'deleteReference' ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1725:2: ( (lv_op_0_0= 'deleteReference' ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1725:2: ( (lv_op_0_0= 'deleteReference' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1726:1: (lv_op_0_0= 'deleteReference' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1726:1: (lv_op_0_0= 'deleteReference' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1727:3: lv_op_0_0= 'deleteReference'
            {
            lv_op_0_0=(Token)match(input,37,FOLLOW_37_in_ruleDeleteReference3655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_op_0_0, grammarAccess.getDeleteReferenceAccess().getOpDeleteReferenceKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteReferenceRule());
              	        }
                     		setWithLastConsumed(current, "op", lv_op_0_0, "deleteReference");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleDeleteReference3680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteReferenceAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1744:1: ( (otherlv_2= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1745:1: (otherlv_2= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1745:1: (otherlv_2= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1746:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteReferenceRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteReference3704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDeleteReferenceAccess().getRefEReferenceCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleDeleteReference3716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDeleteReferenceAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteReference"


    // $ANTLR start "entryRuleComplexOperatorDef"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1772:1: entryRuleComplexOperatorDef returns [EObject current=null] : iv_ruleComplexOperatorDef= ruleComplexOperatorDef EOF ;
    public final EObject entryRuleComplexOperatorDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexOperatorDef = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1773:2: (iv_ruleComplexOperatorDef= ruleComplexOperatorDef EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1774:2: iv_ruleComplexOperatorDef= ruleComplexOperatorDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexOperatorDefRule()); 
            }
            pushFollow(FOLLOW_ruleComplexOperatorDef_in_entryRuleComplexOperatorDef3752);
            iv_ruleComplexOperatorDef=ruleComplexOperatorDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexOperatorDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexOperatorDef3762); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexOperatorDef"


    // $ANTLR start "ruleComplexOperatorDef"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1781:1: ruleComplexOperatorDef returns [EObject current=null] : (otherlv_0= 'def change' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_packageOperations_8_0= ruleEPackageOperation ) ) | ( (lv_classOperations_9_0= ruleEClassOperation ) ) | ( (lv_attributeOperations_10_0= ruleEAttributeOperation ) ) | ( (lv_referenceOperations_11_0= ruleEReferenceOperation ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleComplexOperatorDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_packageOperations_8_0 = null;

        EObject lv_classOperations_9_0 = null;

        EObject lv_attributeOperations_10_0 = null;

        EObject lv_referenceOperations_11_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1784:28: ( (otherlv_0= 'def change' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_packageOperations_8_0= ruleEPackageOperation ) ) | ( (lv_classOperations_9_0= ruleEClassOperation ) ) | ( (lv_attributeOperations_10_0= ruleEAttributeOperation ) ) | ( (lv_referenceOperations_11_0= ruleEReferenceOperation ) ) )* otherlv_12= '}' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1785:1: (otherlv_0= 'def change' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_packageOperations_8_0= ruleEPackageOperation ) ) | ( (lv_classOperations_9_0= ruleEClassOperation ) ) | ( (lv_attributeOperations_10_0= ruleEAttributeOperation ) ) | ( (lv_referenceOperations_11_0= ruleEReferenceOperation ) ) )* otherlv_12= '}' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1785:1: (otherlv_0= 'def change' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_packageOperations_8_0= ruleEPackageOperation ) ) | ( (lv_classOperations_9_0= ruleEClassOperation ) ) | ( (lv_attributeOperations_10_0= ruleEAttributeOperation ) ) | ( (lv_referenceOperations_11_0= ruleEReferenceOperation ) ) )* otherlv_12= '}' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1785:3: otherlv_0= 'def change' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_packageOperations_8_0= ruleEPackageOperation ) ) | ( (lv_classOperations_9_0= ruleEClassOperation ) ) | ( (lv_attributeOperations_10_0= ruleEAttributeOperation ) ) | ( (lv_referenceOperations_11_0= ruleEReferenceOperation ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleComplexOperatorDef3799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComplexOperatorDefAccess().getDefChangeKeyword_0());
                  
            }
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1789:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1790:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1790:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1791:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexOperatorDef3816); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getComplexOperatorDefAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getComplexOperatorDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1807:2: (otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1807:4: otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleComplexOperatorDef3834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getComplexOperatorDefAccess().getLeftParenthesisKeyword_2_0());
                  
            }
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1811:1: ( (lv_params_3_0= ruleParameter ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1812:1: (lv_params_3_0= ruleParameter )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1812:1: (lv_params_3_0= ruleParameter )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1813:3: lv_params_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComplexOperatorDefAccess().getParamsParameterParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleComplexOperatorDef3855);
                    lv_params_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComplexOperatorDefRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_3_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1829:3: (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==27) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1829:5: otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleComplexOperatorDef3869); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getComplexOperatorDefAccess().getCommaKeyword_2_2_0());
            	          
            	    }
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1833:1: ( (lv_params_5_0= ruleParameter ) )
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1834:1: (lv_params_5_0= ruleParameter )
            	    {
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1834:1: (lv_params_5_0= ruleParameter )
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1835:3: lv_params_5_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComplexOperatorDefAccess().getParamsParameterParserRuleCall_2_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleComplexOperatorDef3890);
            	    lv_params_5_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComplexOperatorDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"params",
            	              		lv_params_5_0, 
            	              		"Parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleComplexOperatorDef3904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getComplexOperatorDefAccess().getRightParenthesisKeyword_2_3());
                  
            }

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleComplexOperatorDef3917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getComplexOperatorDefAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1859:1: ( ( (lv_packageOperations_8_0= ruleEPackageOperation ) ) | ( (lv_classOperations_9_0= ruleEClassOperation ) ) | ( (lv_attributeOperations_10_0= ruleEAttributeOperation ) ) | ( (lv_referenceOperations_11_0= ruleEReferenceOperation ) ) )*
            loop29:
            do {
                int alt29=5;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1859:2: ( (lv_packageOperations_8_0= ruleEPackageOperation ) )
            	    {
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1859:2: ( (lv_packageOperations_8_0= ruleEPackageOperation ) )
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1860:1: (lv_packageOperations_8_0= ruleEPackageOperation )
            	    {
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1860:1: (lv_packageOperations_8_0= ruleEPackageOperation )
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1861:3: lv_packageOperations_8_0= ruleEPackageOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComplexOperatorDefAccess().getPackageOperationsEPackageOperationParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEPackageOperation_in_ruleComplexOperatorDef3939);
            	    lv_packageOperations_8_0=ruleEPackageOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComplexOperatorDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"packageOperations",
            	              		lv_packageOperations_8_0, 
            	              		"EPackageOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1878:6: ( (lv_classOperations_9_0= ruleEClassOperation ) )
            	    {
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1878:6: ( (lv_classOperations_9_0= ruleEClassOperation ) )
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1879:1: (lv_classOperations_9_0= ruleEClassOperation )
            	    {
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1879:1: (lv_classOperations_9_0= ruleEClassOperation )
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1880:3: lv_classOperations_9_0= ruleEClassOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComplexOperatorDefAccess().getClassOperationsEClassOperationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEClassOperation_in_ruleComplexOperatorDef3966);
            	    lv_classOperations_9_0=ruleEClassOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComplexOperatorDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classOperations",
            	              		lv_classOperations_9_0, 
            	              		"EClassOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1897:6: ( (lv_attributeOperations_10_0= ruleEAttributeOperation ) )
            	    {
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1897:6: ( (lv_attributeOperations_10_0= ruleEAttributeOperation ) )
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1898:1: (lv_attributeOperations_10_0= ruleEAttributeOperation )
            	    {
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1898:1: (lv_attributeOperations_10_0= ruleEAttributeOperation )
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1899:3: lv_attributeOperations_10_0= ruleEAttributeOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComplexOperatorDefAccess().getAttributeOperationsEAttributeOperationParserRuleCall_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEAttributeOperation_in_ruleComplexOperatorDef3993);
            	    lv_attributeOperations_10_0=ruleEAttributeOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComplexOperatorDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributeOperations",
            	              		lv_attributeOperations_10_0, 
            	              		"EAttributeOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1916:6: ( (lv_referenceOperations_11_0= ruleEReferenceOperation ) )
            	    {
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1916:6: ( (lv_referenceOperations_11_0= ruleEReferenceOperation ) )
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1917:1: (lv_referenceOperations_11_0= ruleEReferenceOperation )
            	    {
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1917:1: (lv_referenceOperations_11_0= ruleEReferenceOperation )
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1918:3: lv_referenceOperations_11_0= ruleEReferenceOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComplexOperatorDefAccess().getReferenceOperationsEReferenceOperationParserRuleCall_4_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEReferenceOperation_in_ruleComplexOperatorDef4020);
            	    lv_referenceOperations_11_0=ruleEReferenceOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComplexOperatorDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"referenceOperations",
            	              		lv_referenceOperations_11_0, 
            	              		"EReferenceOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleComplexOperatorDef4034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getComplexOperatorDefAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexOperatorDef"


    // $ANTLR start "entryRuleComplexOperator"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1946:1: entryRuleComplexOperator returns [EObject current=null] : iv_ruleComplexOperator= ruleComplexOperator EOF ;
    public final EObject entryRuleComplexOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexOperator = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1947:2: (iv_ruleComplexOperator= ruleComplexOperator EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1948:2: iv_ruleComplexOperator= ruleComplexOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleComplexOperator_in_entryRuleComplexOperator4070);
            iv_ruleComplexOperator=ruleComplexOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexOperator4080); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexOperator"


    // $ANTLR start "ruleComplexOperator"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1955:1: ruleComplexOperator returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_new_3_0= RULE_STRING ) ) )? (otherlv_4= ',' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_new_6_0= RULE_STRING ) ) ) )* otherlv_7= ')' otherlv_8= ';' ) ;
    public final EObject ruleComplexOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_new_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_new_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1958:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_new_3_0= RULE_STRING ) ) )? (otherlv_4= ',' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_new_6_0= RULE_STRING ) ) ) )* otherlv_7= ')' otherlv_8= ';' ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1959:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_new_3_0= RULE_STRING ) ) )? (otherlv_4= ',' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_new_6_0= RULE_STRING ) ) ) )* otherlv_7= ')' otherlv_8= ';' )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1959:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_new_3_0= RULE_STRING ) ) )? (otherlv_4= ',' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_new_6_0= RULE_STRING ) ) ) )* otherlv_7= ')' otherlv_8= ';' )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1959:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_new_3_0= RULE_STRING ) ) )? (otherlv_4= ',' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_new_6_0= RULE_STRING ) ) ) )* otherlv_7= ')' otherlv_8= ';'
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1959:2: ( (otherlv_0= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1960:1: (otherlv_0= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1960:1: (otherlv_0= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1961:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComplexOperatorRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexOperator4129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getComplexOperatorAccess().getRefComplexOperatorDefCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleComplexOperator4141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getComplexOperatorAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1979:1: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_new_3_0= RULE_STRING ) ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_STRING) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1979:2: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1979:2: ( (otherlv_2= RULE_ID ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1980:1: (otherlv_2= RULE_ID )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1980:1: (otherlv_2= RULE_ID )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1981:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getComplexOperatorRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexOperator4166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getComplexOperatorAccess().getArgsEObjectCrossReference_2_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1996:6: ( (lv_new_3_0= RULE_STRING ) )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1996:6: ( (lv_new_3_0= RULE_STRING ) )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1997:1: (lv_new_3_0= RULE_STRING )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1997:1: (lv_new_3_0= RULE_STRING )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1998:3: lv_new_3_0= RULE_STRING
                    {
                    lv_new_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComplexOperator4189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_new_3_0, grammarAccess.getComplexOperatorAccess().getNewSTRINGTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComplexOperatorRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"new",
                              		lv_new_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2014:4: (otherlv_4= ',' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_new_6_0= RULE_STRING ) ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2014:6: otherlv_4= ',' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_new_6_0= RULE_STRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleComplexOperator4209); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getComplexOperatorAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2018:1: ( ( (otherlv_5= RULE_ID ) ) | ( (lv_new_6_0= RULE_STRING ) ) )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==RULE_ID) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==RULE_STRING) ) {
            	        alt31=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2018:2: ( (otherlv_5= RULE_ID ) )
            	            {
            	            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2018:2: ( (otherlv_5= RULE_ID ) )
            	            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2019:1: (otherlv_5= RULE_ID )
            	            {
            	            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2019:1: (otherlv_5= RULE_ID )
            	            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2020:3: otherlv_5= RULE_ID
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              		  /* */ 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              			if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComplexOperatorRule());
            	              	        }
            	                      
            	            }
            	            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexOperator4234); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		newLeafNode(otherlv_5, grammarAccess.getComplexOperatorAccess().getArgsEObjectCrossReference_3_1_0_0()); 
            	              	
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2035:6: ( (lv_new_6_0= RULE_STRING ) )
            	            {
            	            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2035:6: ( (lv_new_6_0= RULE_STRING ) )
            	            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2036:1: (lv_new_6_0= RULE_STRING )
            	            {
            	            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2036:1: (lv_new_6_0= RULE_STRING )
            	            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2037:3: lv_new_6_0= RULE_STRING
            	            {
            	            lv_new_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComplexOperator4257); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_new_6_0, grammarAccess.getComplexOperatorAccess().getNewSTRINGTerminalRuleCall_3_1_1_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComplexOperatorRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"new",
            	                      		lv_new_6_0, 
            	                      		"STRING");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleComplexOperator4277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getComplexOperatorAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleComplexOperator4289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getComplexOperatorAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexOperator"


    // $ANTLR start "entryRuleParameter"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2069:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2070:2: (iv_ruleParameter= ruleParameter EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2071:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4325);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4335); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2078:1: ruleParameter returns [EObject current=null] : ( (this_Class_0= ruleClass otherlv_1= ':' otherlv_2= 'class' ) | (this_Reference_3= ruleReference otherlv_4= ':' otherlv_5= 'reference' ) | (this_Package_6= rulePackage otherlv_7= ':' otherlv_8= 'package' ) | (this_Attribute_9= ruleAttribute otherlv_10= ':' otherlv_11= 'attribute' ) | (this_BooleanDef_12= ruleBooleanDef otherlv_13= ':' otherlv_14= 'bool' ) | (this_IntDef_15= ruleIntDef otherlv_16= ':' otherlv_17= 'int' ) | (this_StringDef_18= ruleStringDef otherlv_19= ':' otherlv_20= 'string' ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject this_Class_0 = null;

        EObject this_Reference_3 = null;

        EObject this_Package_6 = null;

        EObject this_Attribute_9 = null;

        EObject this_BooleanDef_12 = null;

        EObject this_IntDef_15 = null;

        EObject this_StringDef_18 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2081:28: ( ( (this_Class_0= ruleClass otherlv_1= ':' otherlv_2= 'class' ) | (this_Reference_3= ruleReference otherlv_4= ':' otherlv_5= 'reference' ) | (this_Package_6= rulePackage otherlv_7= ':' otherlv_8= 'package' ) | (this_Attribute_9= ruleAttribute otherlv_10= ':' otherlv_11= 'attribute' ) | (this_BooleanDef_12= ruleBooleanDef otherlv_13= ':' otherlv_14= 'bool' ) | (this_IntDef_15= ruleIntDef otherlv_16= ':' otherlv_17= 'int' ) | (this_StringDef_18= ruleStringDef otherlv_19= ':' otherlv_20= 'string' ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2082:1: ( (this_Class_0= ruleClass otherlv_1= ':' otherlv_2= 'class' ) | (this_Reference_3= ruleReference otherlv_4= ':' otherlv_5= 'reference' ) | (this_Package_6= rulePackage otherlv_7= ':' otherlv_8= 'package' ) | (this_Attribute_9= ruleAttribute otherlv_10= ':' otherlv_11= 'attribute' ) | (this_BooleanDef_12= ruleBooleanDef otherlv_13= ':' otherlv_14= 'bool' ) | (this_IntDef_15= ruleIntDef otherlv_16= ':' otherlv_17= 'int' ) | (this_StringDef_18= ruleStringDef otherlv_19= ':' otherlv_20= 'string' ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2082:1: ( (this_Class_0= ruleClass otherlv_1= ':' otherlv_2= 'class' ) | (this_Reference_3= ruleReference otherlv_4= ':' otherlv_5= 'reference' ) | (this_Package_6= rulePackage otherlv_7= ':' otherlv_8= 'package' ) | (this_Attribute_9= ruleAttribute otherlv_10= ':' otherlv_11= 'attribute' ) | (this_BooleanDef_12= ruleBooleanDef otherlv_13= ':' otherlv_14= 'bool' ) | (this_IntDef_15= ruleIntDef otherlv_16= ':' otherlv_17= 'int' ) | (this_StringDef_18= ruleStringDef otherlv_19= ':' otherlv_20= 'string' ) )
            int alt33=7;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2082:2: (this_Class_0= ruleClass otherlv_1= ':' otherlv_2= 'class' )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2082:2: (this_Class_0= ruleClass otherlv_1= ':' otherlv_2= 'class' )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2083:2: this_Class_0= ruleClass otherlv_1= ':' otherlv_2= 'class'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getClassParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClass_in_ruleParameter4386);
                    this_Class_0=ruleClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Class_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleParameter4397); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_0_1());
                          
                    }
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleParameter4409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getClassKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2103:6: (this_Reference_3= ruleReference otherlv_4= ':' otherlv_5= 'reference' )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2103:6: (this_Reference_3= ruleReference otherlv_4= ':' otherlv_5= 'reference' )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2104:2: this_Reference_3= ruleReference otherlv_4= ':' otherlv_5= 'reference'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getReferenceParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleParameter4442);
                    this_Reference_3=ruleReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Reference_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleParameter4453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getColonKeyword_1_1());
                          
                    }
                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleParameter4465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getReferenceKeyword_1_2());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2124:6: (this_Package_6= rulePackage otherlv_7= ':' otherlv_8= 'package' )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2124:6: (this_Package_6= rulePackage otherlv_7= ':' otherlv_8= 'package' )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2125:2: this_Package_6= rulePackage otherlv_7= ':' otherlv_8= 'package'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getPackageParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePackage_in_ruleParameter4498);
                    this_Package_6=rulePackage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Package_6; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleParameter4509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getColonKeyword_2_1());
                          
                    }
                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleParameter4521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getPackageKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2145:6: (this_Attribute_9= ruleAttribute otherlv_10= ':' otherlv_11= 'attribute' )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2145:6: (this_Attribute_9= ruleAttribute otherlv_10= ':' otherlv_11= 'attribute' )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2146:2: this_Attribute_9= ruleAttribute otherlv_10= ':' otherlv_11= 'attribute'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getAttributeParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleParameter4554);
                    this_Attribute_9=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Attribute_9; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_10=(Token)match(input,39,FOLLOW_39_in_ruleParameter4565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getColonKeyword_3_1());
                          
                    }
                    otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleParameter4577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getAttributeKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2166:6: (this_BooleanDef_12= ruleBooleanDef otherlv_13= ':' otherlv_14= 'bool' )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2166:6: (this_BooleanDef_12= ruleBooleanDef otherlv_13= ':' otherlv_14= 'bool' )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2167:2: this_BooleanDef_12= ruleBooleanDef otherlv_13= ':' otherlv_14= 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getBooleanDefParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanDef_in_ruleParameter4610);
                    this_BooleanDef_12=ruleBooleanDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanDef_12; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_13=(Token)match(input,39,FOLLOW_39_in_ruleParameter4621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getParameterAccess().getColonKeyword_4_1());
                          
                    }
                    otherlv_14=(Token)match(input,40,FOLLOW_40_in_ruleParameter4633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getBoolKeyword_4_2());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2187:6: (this_IntDef_15= ruleIntDef otherlv_16= ':' otherlv_17= 'int' )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2187:6: (this_IntDef_15= ruleIntDef otherlv_16= ':' otherlv_17= 'int' )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2188:2: this_IntDef_15= ruleIntDef otherlv_16= ':' otherlv_17= 'int'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getIntDefParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntDef_in_ruleParameter4666);
                    this_IntDef_15=ruleIntDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntDef_15; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_16=(Token)match(input,39,FOLLOW_39_in_ruleParameter4677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getParameterAccess().getColonKeyword_5_1());
                          
                    }
                    otherlv_17=(Token)match(input,41,FOLLOW_41_in_ruleParameter4689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getParameterAccess().getIntKeyword_5_2());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2208:6: (this_StringDef_18= ruleStringDef otherlv_19= ':' otherlv_20= 'string' )
                    {
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2208:6: (this_StringDef_18= ruleStringDef otherlv_19= ':' otherlv_20= 'string' )
                    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2209:2: this_StringDef_18= ruleStringDef otherlv_19= ':' otherlv_20= 'string'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getStringDefParserRuleCall_6_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringDef_in_ruleParameter4722);
                    this_StringDef_18=ruleStringDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringDef_18; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_19=(Token)match(input,39,FOLLOW_39_in_ruleParameter4733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getParameterAccess().getColonKeyword_6_1());
                          
                    }
                    otherlv_20=(Token)match(input,42,FOLLOW_42_in_ruleParameter4745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getParameterAccess().getStringKeyword_6_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAttribute"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2236:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2237:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2238:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4782);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4792); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2245:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2248:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2249:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2249:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2249:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2249:2: ()
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2250:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributeAccess().getAttributeAction_0(),
                          current);
                  
            }

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2258:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2259:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2259:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2260:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute4846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2284:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2285:2: (iv_ruleReference= ruleReference EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2286:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference4887);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference4897); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2293:1: ruleReference returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2296:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2297:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2297:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2297:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2297:2: ()
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2298:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReferenceAccess().getReferenceAction_0(),
                          current);
                  
            }

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2306:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2307:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2307:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2308:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference4951); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleBooleanDef"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2332:1: entryRuleBooleanDef returns [EObject current=null] : iv_ruleBooleanDef= ruleBooleanDef EOF ;
    public final EObject entryRuleBooleanDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanDef = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2333:2: (iv_ruleBooleanDef= ruleBooleanDef EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2334:2: iv_ruleBooleanDef= ruleBooleanDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanDefRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanDef_in_entryRuleBooleanDef4992);
            iv_ruleBooleanDef=ruleBooleanDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanDef5002); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanDef"


    // $ANTLR start "ruleBooleanDef"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2341:1: ruleBooleanDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBooleanDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2344:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2345:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2345:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2345:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2345:2: ()
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2346:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBooleanDefAccess().getBooleanDefAction_0(),
                          current);
                  
            }

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2354:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2355:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2355:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2356:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanDef5056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBooleanDefAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBooleanDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanDef"


    // $ANTLR start "entryRuleStringDef"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2380:1: entryRuleStringDef returns [EObject current=null] : iv_ruleStringDef= ruleStringDef EOF ;
    public final EObject entryRuleStringDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringDef = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2381:2: (iv_ruleStringDef= ruleStringDef EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2382:2: iv_ruleStringDef= ruleStringDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringDefRule()); 
            }
            pushFollow(FOLLOW_ruleStringDef_in_entryRuleStringDef5097);
            iv_ruleStringDef=ruleStringDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDef5107); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringDef"


    // $ANTLR start "ruleStringDef"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2389:1: ruleStringDef returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStringDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2392:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2393:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2393:1: ( (lv_name_0_0= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2394:1: (lv_name_0_0= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2394:1: (lv_name_0_0= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2395:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringDef5148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getStringDefAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringDef"


    // $ANTLR start "entryRuleIntDef"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2419:1: entryRuleIntDef returns [EObject current=null] : iv_ruleIntDef= ruleIntDef EOF ;
    public final EObject entryRuleIntDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntDef = null;


        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2420:2: (iv_ruleIntDef= ruleIntDef EOF )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2421:2: iv_ruleIntDef= ruleIntDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntDefRule()); 
            }
            pushFollow(FOLLOW_ruleIntDef_in_entryRuleIntDef5188);
            iv_ruleIntDef=ruleIntDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntDef5198); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntDef"


    // $ANTLR start "ruleIntDef"
    // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2428:1: ruleIntDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIntDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2431:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2432:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2432:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2432:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2432:2: ()
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2433:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntDefAccess().getIntDefAction_0(),
                          current);
                  
            }

            }

            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2441:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2442:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2442:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:2443:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntDef5252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getIntDefAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntDef"

    // $ANTLR start synpred14_InternalEDeltaLang
    public final void synpred14_InternalEDeltaLang_fragment() throws RecognitionException {   
        EObject lv_attributes_8_0 = null;


        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:624:6: ( ( (lv_attributes_8_0= ruleEAttributeOperation ) ) )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:624:6: ( (lv_attributes_8_0= ruleEAttributeOperation ) )
        {
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:624:6: ( (lv_attributes_8_0= ruleEAttributeOperation ) )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:625:1: (lv_attributes_8_0= ruleEAttributeOperation )
        {
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:625:1: (lv_attributes_8_0= ruleEAttributeOperation )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:626:3: lv_attributes_8_0= ruleEAttributeOperation
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEClassOperationAccess().getAttributesEAttributeOperationParserRuleCall_1_1_0_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEAttributeOperation_in_synpred14_InternalEDeltaLang1237);
        lv_attributes_8_0=ruleEAttributeOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalEDeltaLang

    // $ANTLR start synpred15_InternalEDeltaLang
    public final void synpred15_InternalEDeltaLang_fragment() throws RecognitionException {   
        EObject lv_references_9_0 = null;


        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:643:6: ( ( (lv_references_9_0= ruleEReferenceOperation ) ) )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:643:6: ( (lv_references_9_0= ruleEReferenceOperation ) )
        {
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:643:6: ( (lv_references_9_0= ruleEReferenceOperation ) )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:644:1: (lv_references_9_0= ruleEReferenceOperation )
        {
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:644:1: (lv_references_9_0= ruleEReferenceOperation )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:645:3: lv_references_9_0= ruleEReferenceOperation
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEClassOperationAccess().getReferencesEReferenceOperationParserRuleCall_1_1_0_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEReferenceOperation_in_synpred15_InternalEDeltaLang1264);
        lv_references_9_0=ruleEReferenceOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15_InternalEDeltaLang

    // $ANTLR start synpred37_InternalEDeltaLang
    public final void synpred37_InternalEDeltaLang_fragment() throws RecognitionException {   
        EObject lv_packageOperations_8_0 = null;


        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1859:2: ( ( (lv_packageOperations_8_0= ruleEPackageOperation ) ) )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1859:2: ( (lv_packageOperations_8_0= ruleEPackageOperation ) )
        {
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1859:2: ( (lv_packageOperations_8_0= ruleEPackageOperation ) )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1860:1: (lv_packageOperations_8_0= ruleEPackageOperation )
        {
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1860:1: (lv_packageOperations_8_0= ruleEPackageOperation )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1861:3: lv_packageOperations_8_0= ruleEPackageOperation
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getComplexOperatorDefAccess().getPackageOperationsEPackageOperationParserRuleCall_4_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEPackageOperation_in_synpred37_InternalEDeltaLang3939);
        lv_packageOperations_8_0=ruleEPackageOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred37_InternalEDeltaLang

    // $ANTLR start synpred39_InternalEDeltaLang
    public final void synpred39_InternalEDeltaLang_fragment() throws RecognitionException {   
        EObject lv_attributeOperations_10_0 = null;


        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1897:6: ( ( (lv_attributeOperations_10_0= ruleEAttributeOperation ) ) )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1897:6: ( (lv_attributeOperations_10_0= ruleEAttributeOperation ) )
        {
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1897:6: ( (lv_attributeOperations_10_0= ruleEAttributeOperation ) )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1898:1: (lv_attributeOperations_10_0= ruleEAttributeOperation )
        {
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1898:1: (lv_attributeOperations_10_0= ruleEAttributeOperation )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1899:3: lv_attributeOperations_10_0= ruleEAttributeOperation
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getComplexOperatorDefAccess().getAttributeOperationsEAttributeOperationParserRuleCall_4_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEAttributeOperation_in_synpred39_InternalEDeltaLang3993);
        lv_attributeOperations_10_0=ruleEAttributeOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred39_InternalEDeltaLang

    // $ANTLR start synpred40_InternalEDeltaLang
    public final void synpred40_InternalEDeltaLang_fragment() throws RecognitionException {   
        EObject lv_referenceOperations_11_0 = null;


        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1916:6: ( ( (lv_referenceOperations_11_0= ruleEReferenceOperation ) ) )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1916:6: ( (lv_referenceOperations_11_0= ruleEReferenceOperation ) )
        {
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1916:6: ( (lv_referenceOperations_11_0= ruleEReferenceOperation ) )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1917:1: (lv_referenceOperations_11_0= ruleEReferenceOperation )
        {
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1917:1: (lv_referenceOperations_11_0= ruleEReferenceOperation )
        // ../it.univaq.coevolution.differences.edelta/src-gen/it/univaq/coevolution/differences/edelta/parser/antlr/internal/InternalEDeltaLang.g:1918:3: lv_referenceOperations_11_0= ruleEReferenceOperation
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getComplexOperatorDefAccess().getReferenceOperationsEReferenceOperationParserRuleCall_4_3_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEReferenceOperation_in_synpred40_InternalEDeltaLang4020);
        lv_referenceOperations_11_0=ruleEReferenceOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred40_InternalEDeltaLang

    // Delegated rules

    public final boolean synpred37_InternalEDeltaLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalEDeltaLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalEDeltaLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalEDeltaLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalEDeltaLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalEDeltaLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalEDeltaLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalEDeltaLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalEDeltaLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalEDeltaLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA10_eotS =
        "\16\uffff";
    static final String DFA10_eofS =
        "\16\uffff";
    static final String DFA10_minS =
        "\1\4\3\uffff\1\21\1\uffff\1\4\2\22\1\4\1\34\2\22\1\0";
    static final String DFA10_maxS =
        "\1\45\3\uffff\1\21\1\uffff\3\33\1\5\1\34\2\33\1\0";
    static final String DFA10_acceptS =
        "\1\uffff\1\4\1\1\1\2\1\uffff\1\3\10\uffff";
    static final String DFA10_specialS =
        "\15\uffff\1\0}>";
    static final String[] DFA10_transitionS = {
            "\1\4\12\uffff\1\1\11\uffff\1\2\4\uffff\4\3\4\5",
            "",
            "",
            "",
            "\1\6",
            "",
            "\1\7\1\10\14\uffff\1\12\10\uffff\1\11",
            "\1\12\10\uffff\1\11",
            "\1\12\10\uffff\1\11",
            "\1\13\1\14",
            "\1\15",
            "\1\12\10\uffff\1\11",
            "\1\12\10\uffff\1\11",
            "\1\uffff"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 605:1: ( ( (lv_setters_7_0= rulesetter ) ) | ( (lv_attributes_8_0= ruleEAttributeOperation ) ) | ( (lv_references_9_0= ruleEReferenceOperation ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_13 = input.LA(1);

                         
                        int index10_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalEDeltaLang()) ) {s = 3;}

                        else if ( (synpred15_InternalEDeltaLang()) ) {s = 5;}

                         
                        input.seek(index10_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\17\uffff";
    static final String DFA29_eofS =
        "\17\uffff";
    static final String DFA29_minS =
        "\1\4\2\uffff\1\21\3\uffff\1\4\2\22\1\4\1\34\2\22\1\0";
    static final String DFA29_maxS =
        "\1\45\2\uffff\1\21\3\uffff\3\33\1\5\1\34\2\33\1\0";
    static final String DFA29_acceptS =
        "\1\uffff\1\5\1\1\1\uffff\1\2\1\3\1\4\10\uffff";
    static final String DFA29_specialS =
        "\16\uffff\1\0}>";
    static final String[] DFA29_transitionS = {
            "\1\3\7\uffff\1\2\2\uffff\1\1\1\2\2\uffff\2\2\4\4\5\uffff\4\5"+
            "\4\6",
            "",
            "",
            "\1\7",
            "",
            "",
            "",
            "\1\10\1\11\14\uffff\1\13\10\uffff\1\12",
            "\1\13\10\uffff\1\12",
            "\1\13\10\uffff\1\12",
            "\1\14\1\15",
            "\1\16",
            "\1\13\10\uffff\1\12",
            "\1\13\10\uffff\1\12",
            "\1\uffff"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "()* loopback of 1859:1: ( ( (lv_packageOperations_8_0= ruleEPackageOperation ) ) | ( (lv_classOperations_9_0= ruleEClassOperation ) ) | ( (lv_attributeOperations_10_0= ruleEAttributeOperation ) ) | ( (lv_referenceOperations_11_0= ruleEReferenceOperation ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_14 = input.LA(1);

                         
                        int index29_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalEDeltaLang()) ) {s = 2;}

                        else if ( (synpred39_InternalEDeltaLang()) ) {s = 5;}

                        else if ( (synpred40_InternalEDeltaLang()) ) {s = 6;}

                         
                        input.seek(index29_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\12\uffff";
    static final String DFA33_eofS =
        "\12\uffff";
    static final String DFA33_minS =
        "\1\4\1\47\1\14\7\uffff";
    static final String DFA33_maxS =
        "\1\4\1\47\1\52\7\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\1\2\1\4\1\6\1\7\1\5\1\1\1\3";
    static final String DFA33_specialS =
        "\12\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1",
            "\1\2",
            "\1\11\10\uffff\1\10\10\uffff\1\4\3\uffff\1\3\5\uffff\1\7\1"+
            "\5\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "2082:1: ( (this_Class_0= ruleClass otherlv_1= ':' otherlv_2= 'class' ) | (this_Reference_3= ruleReference otherlv_4= ':' otherlv_5= 'reference' ) | (this_Package_6= rulePackage otherlv_7= ':' otherlv_8= 'package' ) | (this_Attribute_9= ruleAttribute otherlv_10= ':' otherlv_11= 'attribute' ) | (this_BooleanDef_12= ruleBooleanDef otherlv_13= ':' otherlv_14= 'bool' ) | (this_IntDef_15= ruleIntDef otherlv_16= ':' otherlv_17= 'int' ) | (this_StringDef_18= ruleStringDef otherlv_19= ':' otherlv_20= 'string' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageOperation_in_ruleModel138 = new BitSet(new long[]{0x0000004000191012L});
    public static final BitSet FOLLOW_ruleComplexOperatorDef_in_ruleModel157 = new BitSet(new long[]{0x0000004000191012L});
    public static final BitSet FOLLOW_ruleEPackageOperation_in_entryRuleEPackageOperation196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPackageOperation206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEPackageOperation244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackage_in_ruleEPackageOperation265 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEPackageOperation277 = new BitSet(new long[]{0x0000000000191010L});
    public static final BitSet FOLLOW_ruleChangePackage_in_ruleEPackageOperation304 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleAddPackage_in_ruleEPackageOperation323 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDeletePackage_in_ruleEPackageOperation342 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEPackageOperation357 = new BitSet(new long[]{0x0000000003E08000L});
    public static final BitSet FOLLOW_rulesetter_in_ruleEPackageOperation379 = new BitSet(new long[]{0x0000000003E08000L});
    public static final BitSet FOLLOW_ruleEClassOperation_in_ruleEPackageOperation406 = new BitSet(new long[]{0x0000000003E08000L});
    public static final BitSet FOLLOW_15_in_ruleEPackageOperation420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexOperator_in_ruleEPackageOperation448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletePackage_in_entryRuleDeletePackage485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeletePackage495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDeletePackage532 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeletePackage544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeletePackage568 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDeletePackage580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddPackage_in_entryRuleAddPackage616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddPackage626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAddPackage663 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAddPackage675 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAddPackage693 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddPackage728 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAddPackage741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangePackage_in_entryRuleChangePackage777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangePackage787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleChangePackage824 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleChangePackage836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChangePackage860 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleChangePackage872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassOperation_in_entryRuleEClassOperation1013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEClassOperation1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEClassOperation1061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleEClassOperation1082 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEClassOperation1094 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_ruleChangeClass_in_ruleEClassOperation1119 = new BitSet(new long[]{0x0000000000195010L});
    public static final BitSet FOLLOW_ruleAddClass_in_ruleEClassOperation1146 = new BitSet(new long[]{0x0000000000195010L});
    public static final BitSet FOLLOW_ruleDeleteClass_in_ruleEClassOperation1173 = new BitSet(new long[]{0x0000000000195010L});
    public static final BitSet FOLLOW_14_in_ruleEClassOperation1188 = new BitSet(new long[]{0x0000003FC2199010L});
    public static final BitSet FOLLOW_rulesetter_in_ruleEClassOperation1210 = new BitSet(new long[]{0x0000003FC2199010L});
    public static final BitSet FOLLOW_ruleEAttributeOperation_in_ruleEClassOperation1237 = new BitSet(new long[]{0x0000003FC2199010L});
    public static final BitSet FOLLOW_ruleEReferenceOperation_in_ruleEClassOperation1264 = new BitSet(new long[]{0x0000003FC2199010L});
    public static final BitSet FOLLOW_15_in_ruleEClassOperation1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexOperator_in_ruleEClassOperation1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeClass_in_entryRuleChangeClass1344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeClass1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleChangeClass1397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChangeClass1434 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleChangeClass1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddClass_in_entryRuleAddClass1482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddClass1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAddClass1535 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAddClass1566 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddClass1601 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAddClass1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClass_in_entryRuleDeleteClass1650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteClass1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDeleteClass1703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteClass1740 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDeleteClass1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetter_in_entryRulesetter1893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesetter1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulesetter1940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesetter1964 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulesetter1976 = new BitSet(new long[]{0x00000000200000F0L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulesetter1995 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rulesetter2017 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_rulesetter2044 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesetter2074 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_rulesetter2088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesetter2112 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_rulesetter2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality2163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCardinality2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCardinality2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOperation_in_entryRuleEAttributeOperation2278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEAttributeOperation2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEAttributeOperation2326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEAttributeOperation2347 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEAttributeOperation2359 = new BitSet(new long[]{0x0000000380191010L});
    public static final BitSet FOLLOW_ruleChangeAttribute_in_ruleEAttributeOperation2385 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleAddAttribute_in_ruleEAttributeOperation2412 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDeleteAttribute_in_ruleEAttributeOperation2439 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEAttributeOperation2453 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_rulesetter_in_ruleEAttributeOperation2474 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_15_in_ruleEAttributeOperation2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexOperator_in_ruleEAttributeOperation2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeAttribute_in_entryRuleChangeAttribute2553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeAttribute2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleChangeAttribute2606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChangeAttribute2643 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleChangeAttribute2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddAttribute_in_entryRuleAddAttribute2691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddAttribute2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAddAttribute2744 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAddAttribute2775 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddAttribute2810 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAddAttribute2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteAttribute_in_entryRuleDeleteAttribute2859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteAttribute2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDeleteAttribute2912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteAttribute2949 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDeleteAttribute2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOperation_in_entryRuleEReferenceOperation2997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEReferenceOperation3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEReferenceOperation3045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReference_in_ruleEReferenceOperation3066 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEReferenceOperation3078 = new BitSet(new long[]{0x0000003800191010L});
    public static final BitSet FOLLOW_ruleChangeReference_in_ruleEReferenceOperation3104 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleAddReference_in_ruleEReferenceOperation3131 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDeleteReference_in_ruleEReferenceOperation3158 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEReferenceOperation3172 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_rulesetter_in_ruleEReferenceOperation3193 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_15_in_ruleEReferenceOperation3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexOperator_in_ruleEReferenceOperation3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeReference_in_entryRuleChangeReference3272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeReference3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleChangeReference3325 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleChangeReference3350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChangeReference3374 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleChangeReference3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddReference_in_entryRuleAddReference3422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddReference3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAddReference3475 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAddReference3500 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAddReference3518 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddReference3553 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAddReference3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteReference_in_entryRuleDeleteReference3602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteReference3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDeleteReference3655 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeleteReference3680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteReference3704 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDeleteReference3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexOperatorDef_in_entryRuleComplexOperatorDef3752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexOperatorDef3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleComplexOperatorDef3799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexOperatorDef3816 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleComplexOperatorDef3834 = new BitSet(new long[]{0x0000000008040010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleComplexOperatorDef3855 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_27_in_ruleComplexOperatorDef3869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleComplexOperatorDef3890 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_18_in_ruleComplexOperatorDef3904 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleComplexOperatorDef3917 = new BitSet(new long[]{0x0000003FC3F99010L});
    public static final BitSet FOLLOW_ruleEPackageOperation_in_ruleComplexOperatorDef3939 = new BitSet(new long[]{0x0000003FC3F99010L});
    public static final BitSet FOLLOW_ruleEClassOperation_in_ruleComplexOperatorDef3966 = new BitSet(new long[]{0x0000003FC3F99010L});
    public static final BitSet FOLLOW_ruleEAttributeOperation_in_ruleComplexOperatorDef3993 = new BitSet(new long[]{0x0000003FC3F99010L});
    public static final BitSet FOLLOW_ruleEReferenceOperation_in_ruleComplexOperatorDef4020 = new BitSet(new long[]{0x0000003FC3F99010L});
    public static final BitSet FOLLOW_15_in_ruleComplexOperatorDef4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexOperator_in_entryRuleComplexOperator4070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexOperator4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexOperator4129 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleComplexOperator4141 = new BitSet(new long[]{0x0000000008040030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexOperator4166 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComplexOperator4189 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_27_in_ruleComplexOperator4209 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexOperator4234 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComplexOperator4257 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_18_in_ruleComplexOperator4277 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleComplexOperator4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleParameter4386 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleParameter4397 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleParameter4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleParameter4442 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleParameter4453 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleParameter4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleParameter4498 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleParameter4509 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleParameter4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleParameter4554 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleParameter4565 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleParameter4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDef_in_ruleParameter4610 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleParameter4621 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleParameter4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntDef_in_ruleParameter4666 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleParameter4677 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleParameter4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDef_in_ruleParameter4722 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleParameter4733 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleParameter4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference4887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDef_in_entryRuleBooleanDef4992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanDef5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanDef5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDef_in_entryRuleStringDef5097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDef5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringDef5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntDef_in_entryRuleIntDef5188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntDef5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntDef5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOperation_in_synpred14_InternalEDeltaLang1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOperation_in_synpred15_InternalEDeltaLang1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageOperation_in_synpred37_InternalEDeltaLang3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOperation_in_synpred39_InternalEDeltaLang3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOperation_in_synpred40_InternalEDeltaLang4020 = new BitSet(new long[]{0x0000000000000002L});

}