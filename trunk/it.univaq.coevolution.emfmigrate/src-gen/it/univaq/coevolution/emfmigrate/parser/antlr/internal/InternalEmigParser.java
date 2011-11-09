package it.univaq.coevolution.emfmigrate.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.univaq.coevolution.emfmigrate.services.EmigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEmigParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Library'", "'{'", "'}'", "'Migration'", "';'", "'include'", "'migrate'", "':'", "','", "'with'", "'transformation'", "'model'", "'tcs-model'", "'rule'", "'['", "']'", "'package'", "'='", "'changePackage'", "'addPackage'", "'deletePackage'", "'('", "')'", "'where'", "'class'", "'changeClass'", "'addClass'", "'deleteClass'", "'attribute'", "'changeEAttribute'", "'addEAttribute'", "'deleteEAttribute'", "'reference'", "'changeEReference'", "'addEReference'", "'deleteEReference'", "'set'", "'->'", "'&'", "'null'", "'#'", "'.'", "'%'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalEmigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEmigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEmigParser.tokenNames; }
    public String getGrammarFileName() { return "../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g"; }



     	private EmigGrammarAccess grammarAccess;
     	
        public InternalEmigParser(TokenStream input, EmigGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MyModel";	
       	}
       	
       	@Override
       	protected EmigGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMyModel"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:67:1: entryRuleMyModel returns [EObject current=null] : iv_ruleMyModel= ruleMyModel EOF ;
    public final EObject entryRuleMyModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyModel = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:68:2: (iv_ruleMyModel= ruleMyModel EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:69:2: iv_ruleMyModel= ruleMyModel EOF
            {
             newCompositeNode(grammarAccess.getMyModelRule()); 
            pushFollow(FOLLOW_ruleMyModel_in_entryRuleMyModel75);
            iv_ruleMyModel=ruleMyModel();

            state._fsp--;

             current =iv_ruleMyModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyModel85); 

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
    // $ANTLR end "entryRuleMyModel"


    // $ANTLR start "ruleMyModel"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:76:1: ruleMyModel returns [EObject current=null] : ( ( (lv_migrationLib_0_0= ruleMigrationLibrary ) ) | ( (lv_MigrationProgr_1_0= ruleMigrationProgram ) ) ) ;
    public final EObject ruleMyModel() throws RecognitionException {
        EObject current = null;

        EObject lv_migrationLib_0_0 = null;

        EObject lv_MigrationProgr_1_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:79:28: ( ( ( (lv_migrationLib_0_0= ruleMigrationLibrary ) ) | ( (lv_MigrationProgr_1_0= ruleMigrationProgram ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:80:1: ( ( (lv_migrationLib_0_0= ruleMigrationLibrary ) ) | ( (lv_MigrationProgr_1_0= ruleMigrationProgram ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:80:1: ( ( (lv_migrationLib_0_0= ruleMigrationLibrary ) ) | ( (lv_MigrationProgr_1_0= ruleMigrationProgram ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:80:2: ( (lv_migrationLib_0_0= ruleMigrationLibrary ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:80:2: ( (lv_migrationLib_0_0= ruleMigrationLibrary ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:81:1: (lv_migrationLib_0_0= ruleMigrationLibrary )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:81:1: (lv_migrationLib_0_0= ruleMigrationLibrary )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:82:3: lv_migrationLib_0_0= ruleMigrationLibrary
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyModelAccess().getMigrationLibMigrationLibraryParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMigrationLibrary_in_ruleMyModel131);
                    lv_migrationLib_0_0=ruleMigrationLibrary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyModelRule());
                    	        }
                           		set(
                           			current, 
                           			"migrationLib",
                            		lv_migrationLib_0_0, 
                            		"MigrationLibrary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:99:6: ( (lv_MigrationProgr_1_0= ruleMigrationProgram ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:99:6: ( (lv_MigrationProgr_1_0= ruleMigrationProgram ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:100:1: (lv_MigrationProgr_1_0= ruleMigrationProgram )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:100:1: (lv_MigrationProgr_1_0= ruleMigrationProgram )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:101:3: lv_MigrationProgr_1_0= ruleMigrationProgram
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyModelAccess().getMigrationProgrMigrationProgramParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMigrationProgram_in_ruleMyModel158);
                    lv_MigrationProgr_1_0=ruleMigrationProgram();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyModelRule());
                    	        }
                           		set(
                           			current, 
                           			"MigrationProgr",
                            		lv_MigrationProgr_1_0, 
                            		"MigrationProgram");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyModel"


    // $ANTLR start "entryRuleMigrationLibrary"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:125:1: entryRuleMigrationLibrary returns [EObject current=null] : iv_ruleMigrationLibrary= ruleMigrationLibrary EOF ;
    public final EObject entryRuleMigrationLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationLibrary = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:126:2: (iv_ruleMigrationLibrary= ruleMigrationLibrary EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:127:2: iv_ruleMigrationLibrary= ruleMigrationLibrary EOF
            {
             newCompositeNode(grammarAccess.getMigrationLibraryRule()); 
            pushFollow(FOLLOW_ruleMigrationLibrary_in_entryRuleMigrationLibrary194);
            iv_ruleMigrationLibrary=ruleMigrationLibrary();

            state._fsp--;

             current =iv_ruleMigrationLibrary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationLibrary204); 

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
    // $ANTLR end "entryRuleMigrationLibrary"


    // $ANTLR start "ruleMigrationLibrary"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:134:1: ruleMigrationLibrary returns [EObject current=null] : (otherlv_0= 'Library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' ) ;
    public final EObject ruleMigrationLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rules_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:137:28: ( (otherlv_0= 'Library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:138:1: (otherlv_0= 'Library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:138:1: (otherlv_0= 'Library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:138:3: otherlv_0= 'Library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMigrationLibrary241); 

                	newLeafNode(otherlv_0, grammarAccess.getMigrationLibraryAccess().getLibraryKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:142:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:143:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:143:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:144:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationLibrary258); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMigrationLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationLibraryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMigrationLibrary275); 

                	newLeafNode(otherlv_2, grammarAccess.getMigrationLibraryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:164:1: ( (lv_rules_3_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:165:1: (lv_rules_3_0= ruleRule )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:165:1: (lv_rules_3_0= ruleRule )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:166:3: lv_rules_3_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMigrationLibraryAccess().getRulesRuleParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleMigrationLibrary296);
            	    lv_rules_3_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMigrationLibraryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_3_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleMigrationLibrary309); 

                	newLeafNode(otherlv_4, grammarAccess.getMigrationLibraryAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMigrationLibrary"


    // $ANTLR start "entryRuleMigrationProgram"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:196:1: entryRuleMigrationProgram returns [EObject current=null] : iv_ruleMigrationProgram= ruleMigrationProgram EOF ;
    public final EObject entryRuleMigrationProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationProgram = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:197:2: (iv_ruleMigrationProgram= ruleMigrationProgram EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:198:2: iv_ruleMigrationProgram= ruleMigrationProgram EOF
            {
             newCompositeNode(grammarAccess.getMigrationProgramRule()); 
            pushFollow(FOLLOW_ruleMigrationProgram_in_entryRuleMigrationProgram347);
            iv_ruleMigrationProgram=ruleMigrationProgram();

            state._fsp--;

             current =iv_ruleMigrationProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationProgram357); 

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
    // $ANTLR end "entryRuleMigrationProgram"


    // $ANTLR start "ruleMigrationProgram"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:205:1: ruleMigrationProgram returns [EObject current=null] : (otherlv_0= 'Migration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'include' ( (lv_libs_4_0= RULE_STRING ) ) otherlv_5= ';' )* ( (lv_migr_6_0= 'migrate' ) ) ( (lv_typeArt_7_0= ruleArtifact ) ) ( (lv_artifact_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) ) otherlv_13= 'with' ( (lv_delta_14_0= RULE_STRING ) ) otherlv_15= '{' ( (lv_rules_16_0= ruleRule ) )* otherlv_17= '}' ) ;
    public final EObject ruleMigrationProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_libs_4_0=null;
        Token otherlv_5=null;
        Token lv_migr_6_0=null;
        Token lv_artifact_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_delta_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_typeArt_7_0 = null;

        EObject lv_rules_16_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:208:28: ( (otherlv_0= 'Migration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'include' ( (lv_libs_4_0= RULE_STRING ) ) otherlv_5= ';' )* ( (lv_migr_6_0= 'migrate' ) ) ( (lv_typeArt_7_0= ruleArtifact ) ) ( (lv_artifact_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) ) otherlv_13= 'with' ( (lv_delta_14_0= RULE_STRING ) ) otherlv_15= '{' ( (lv_rules_16_0= ruleRule ) )* otherlv_17= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:209:1: (otherlv_0= 'Migration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'include' ( (lv_libs_4_0= RULE_STRING ) ) otherlv_5= ';' )* ( (lv_migr_6_0= 'migrate' ) ) ( (lv_typeArt_7_0= ruleArtifact ) ) ( (lv_artifact_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) ) otherlv_13= 'with' ( (lv_delta_14_0= RULE_STRING ) ) otherlv_15= '{' ( (lv_rules_16_0= ruleRule ) )* otherlv_17= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:209:1: (otherlv_0= 'Migration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'include' ( (lv_libs_4_0= RULE_STRING ) ) otherlv_5= ';' )* ( (lv_migr_6_0= 'migrate' ) ) ( (lv_typeArt_7_0= ruleArtifact ) ) ( (lv_artifact_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) ) otherlv_13= 'with' ( (lv_delta_14_0= RULE_STRING ) ) otherlv_15= '{' ( (lv_rules_16_0= ruleRule ) )* otherlv_17= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:209:3: otherlv_0= 'Migration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'include' ( (lv_libs_4_0= RULE_STRING ) ) otherlv_5= ';' )* ( (lv_migr_6_0= 'migrate' ) ) ( (lv_typeArt_7_0= ruleArtifact ) ) ( (lv_artifact_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) ) otherlv_13= 'with' ( (lv_delta_14_0= RULE_STRING ) ) otherlv_15= '{' ( (lv_rules_16_0= ruleRule ) )* otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleMigrationProgram394); 

                	newLeafNode(otherlv_0, grammarAccess.getMigrationProgramAccess().getMigrationKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:213:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:214:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:214:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:215:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationProgram411); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMigrationProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMigrationProgram428); 

                	newLeafNode(otherlv_2, grammarAccess.getMigrationProgramAccess().getSemicolonKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:235:1: (otherlv_3= 'include' ( (lv_libs_4_0= RULE_STRING ) ) otherlv_5= ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:235:3: otherlv_3= 'include' ( (lv_libs_4_0= RULE_STRING ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleMigrationProgram441); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMigrationProgramAccess().getIncludeKeyword_3_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:239:1: ( (lv_libs_4_0= RULE_STRING ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:240:1: (lv_libs_4_0= RULE_STRING )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:240:1: (lv_libs_4_0= RULE_STRING )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:241:3: lv_libs_4_0= RULE_STRING
            	    {
            	    lv_libs_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMigrationProgram458); 

            	    			newLeafNode(lv_libs_4_0, grammarAccess.getMigrationProgramAccess().getLibsSTRINGTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"libs",
            	            		lv_libs_4_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleMigrationProgram475); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMigrationProgramAccess().getSemicolonKeyword_3_2());
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:261:3: ( (lv_migr_6_0= 'migrate' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:262:1: (lv_migr_6_0= 'migrate' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:262:1: (lv_migr_6_0= 'migrate' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:263:3: lv_migr_6_0= 'migrate'
            {
            lv_migr_6_0=(Token)match(input,17,FOLLOW_17_in_ruleMigrationProgram495); 

                    newLeafNode(lv_migr_6_0, grammarAccess.getMigrationProgramAccess().getMigrMigrateKeyword_4_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                   		setWithLastConsumed(current, "migr", lv_migr_6_0, "migrate");
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:276:2: ( (lv_typeArt_7_0= ruleArtifact ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:277:1: (lv_typeArt_7_0= ruleArtifact )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:277:1: (lv_typeArt_7_0= ruleArtifact )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:278:3: lv_typeArt_7_0= ruleArtifact
            {
             
            	        newCompositeNode(grammarAccess.getMigrationProgramAccess().getTypeArtArtifactParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleArtifact_in_ruleMigrationProgram529);
            lv_typeArt_7_0=ruleArtifact();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMigrationProgramRule());
            	        }
                   		set(
                   			current, 
                   			"typeArt",
                    		lv_typeArt_7_0, 
                    		"Artifact");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:294:2: ( (lv_artifact_8_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:295:1: (lv_artifact_8_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:295:1: (lv_artifact_8_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:296:3: lv_artifact_8_0= RULE_STRING
            {
            lv_artifact_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMigrationProgram546); 

            			newLeafNode(lv_artifact_8_0, grammarAccess.getMigrationProgramAccess().getArtifactSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"artifact",
                    		lv_artifact_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleMigrationProgram563); 

                	newLeafNode(otherlv_9, grammarAccess.getMigrationProgramAccess().getColonKeyword_7());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:316:1: ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:316:2: ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:316:2: ( (otherlv_10= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:317:1: (otherlv_10= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:317:1: (otherlv_10= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:318:3: otherlv_10= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationProgram584); 

            		newLeafNode(otherlv_10, grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_8_0_0()); 
            	

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:329:2: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:329:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            {
            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleMigrationProgram597); 

                	newLeafNode(otherlv_11, grammarAccess.getMigrationProgramAccess().getCommaKeyword_8_1_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:333:1: ( (otherlv_12= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:334:1: (otherlv_12= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:334:1: (otherlv_12= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:335:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationProgram617); 

            		newLeafNode(otherlv_12, grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_8_1_1_0()); 
            	

            }


            }


            }


            }

            otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleMigrationProgram631); 

                	newLeafNode(otherlv_13, grammarAccess.getMigrationProgramAccess().getWithKeyword_9());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:350:1: ( (lv_delta_14_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:351:1: (lv_delta_14_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:351:1: (lv_delta_14_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:352:3: lv_delta_14_0= RULE_STRING
            {
            lv_delta_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMigrationProgram648); 

            			newLeafNode(lv_delta_14_0, grammarAccess.getMigrationProgramAccess().getDeltaSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"delta",
                    		lv_delta_14_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_15=(Token)match(input,12,FOLLOW_12_in_ruleMigrationProgram665); 

                	newLeafNode(otherlv_15, grammarAccess.getMigrationProgramAccess().getLeftCurlyBracketKeyword_11());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:372:1: ( (lv_rules_16_0= ruleRule ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:373:1: (lv_rules_16_0= ruleRule )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:373:1: (lv_rules_16_0= ruleRule )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:374:3: lv_rules_16_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMigrationProgramAccess().getRulesRuleParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleMigrationProgram686);
            	    lv_rules_16_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMigrationProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_16_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleMigrationProgram699); 

                	newLeafNode(otherlv_17, grammarAccess.getMigrationProgramAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMigrationProgram"


    // $ANTLR start "entryRuleArtifact"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:402:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:403:2: (iv_ruleArtifact= ruleArtifact EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:404:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_ruleArtifact_in_entryRuleArtifact735);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifact745); 

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
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:411:1: ruleArtifact returns [EObject current=null] : ( ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) ) ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:414:28: ( ( ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:415:1: ( ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:415:1: ( ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:416:1: ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:416:1: ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:417:1: (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:417:1: (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:418:3: lv_type_0_1= 'transformation'
                    {
                    lv_type_0_1=(Token)match(input,21,FOLLOW_21_in_ruleArtifact789); 

                            newLeafNode(lv_type_0_1, grammarAccess.getArtifactAccess().getTypeTransformationKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArtifactRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:430:8: lv_type_0_2= 'model'
                    {
                    lv_type_0_2=(Token)match(input,22,FOLLOW_22_in_ruleArtifact818); 

                            newLeafNode(lv_type_0_2, grammarAccess.getArtifactAccess().getTypeModelKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArtifactRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:442:8: lv_type_0_3= 'tcs-model'
                    {
                    lv_type_0_3=(Token)match(input,23,FOLLOW_23_in_ruleArtifact847); 

                            newLeafNode(lv_type_0_3, grammarAccess.getArtifactAccess().getTypeTcsModelKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArtifactRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleRule"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:465:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:466:2: (iv_ruleRule= ruleRule EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:467:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule898);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule908); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:474:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_filter_3_0 = null;

        EObject lv_rewritingRules_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:477:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:478:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:478:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:478:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleRule945); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:482:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:483:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:483:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:484:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule962); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleRule979); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:504:1: ( (lv_filter_3_0= ruleOpDef ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:505:1: (lv_filter_3_0= ruleOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:505:1: (lv_filter_3_0= ruleOpDef )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:506:3: lv_filter_3_0= ruleOpDef
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getFilterOpDefParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleOpDef_in_ruleRule1000);
            lv_filter_3_0=ruleOpDef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"filter",
                    		lv_filter_3_0, 
                    		"OpDef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleRule1012); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getRightSquareBracketKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRule1024); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_5());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:530:1: ( (lv_rewritingRules_6_0= ruleRewritingRule ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:531:1: (lv_rewritingRules_6_0= ruleRewritingRule )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:531:1: (lv_rewritingRules_6_0= ruleRewritingRule )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:532:3: lv_rewritingRules_6_0= ruleRewritingRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getRewritingRulesRewritingRuleParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRewritingRule_in_ruleRule1045);
            	    lv_rewritingRules_6_0=ruleRewritingRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rewritingRules",
            	            		lv_rewritingRules_6_0, 
            	            		"RewritingRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleRule1058); 

                	newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:560:1: entryRuleOpDef returns [EObject current=null] : iv_ruleOpDef= ruleOpDef EOF ;
    public final EObject entryRuleOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:561:2: (iv_ruleOpDef= ruleOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:562:2: iv_ruleOpDef= ruleOpDef EOF
            {
             newCompositeNode(grammarAccess.getOpDefRule()); 
            pushFollow(FOLLOW_ruleOpDef_in_entryRuleOpDef1094);
            iv_ruleOpDef=ruleOpDef();

            state._fsp--;

             current =iv_ruleOpDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpDef1104); 

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
    // $ANTLR end "entryRuleOpDef"


    // $ANTLR start "ruleOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:569:1: ruleOpDef returns [EObject current=null] : (this_EPackageOpDef_0= ruleEPackageOpDef | this_EClassOpDef_1= ruleEClassOpDef | this_EAttributeOpDef_2= ruleEAttributeOpDef | this_EReferenceOpDef_3= ruleEReferenceOpDef ) ;
    public final EObject ruleOpDef() throws RecognitionException {
        EObject current = null;

        EObject this_EPackageOpDef_0 = null;

        EObject this_EClassOpDef_1 = null;

        EObject this_EAttributeOpDef_2 = null;

        EObject this_EReferenceOpDef_3 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:572:28: ( (this_EPackageOpDef_0= ruleEPackageOpDef | this_EClassOpDef_1= ruleEClassOpDef | this_EAttributeOpDef_2= ruleEAttributeOpDef | this_EReferenceOpDef_3= ruleEReferenceOpDef ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:573:1: (this_EPackageOpDef_0= ruleEPackageOpDef | this_EClassOpDef_1= ruleEClassOpDef | this_EAttributeOpDef_2= ruleEAttributeOpDef | this_EReferenceOpDef_3= ruleEReferenceOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:573:1: (this_EPackageOpDef_0= ruleEPackageOpDef | this_EClassOpDef_1= ruleEClassOpDef | this_EAttributeOpDef_2= ruleEAttributeOpDef | this_EReferenceOpDef_3= ruleEReferenceOpDef )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt7=1;
                }
                break;
            case 35:
                {
                alt7=2;
                }
                break;
            case 39:
                {
                alt7=3;
                }
                break;
            case 43:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:574:5: this_EPackageOpDef_0= ruleEPackageOpDef
                    {
                     
                            newCompositeNode(grammarAccess.getOpDefAccess().getEPackageOpDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEPackageOpDef_in_ruleOpDef1151);
                    this_EPackageOpDef_0=ruleEPackageOpDef();

                    state._fsp--;

                     
                            current = this_EPackageOpDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:584:5: this_EClassOpDef_1= ruleEClassOpDef
                    {
                     
                            newCompositeNode(grammarAccess.getOpDefAccess().getEClassOpDefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEClassOpDef_in_ruleOpDef1178);
                    this_EClassOpDef_1=ruleEClassOpDef();

                    state._fsp--;

                     
                            current = this_EClassOpDef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:594:5: this_EAttributeOpDef_2= ruleEAttributeOpDef
                    {
                     
                            newCompositeNode(grammarAccess.getOpDefAccess().getEAttributeOpDefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEAttributeOpDef_in_ruleOpDef1205);
                    this_EAttributeOpDef_2=ruleEAttributeOpDef();

                    state._fsp--;

                     
                            current = this_EAttributeOpDef_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:604:5: this_EReferenceOpDef_3= ruleEReferenceOpDef
                    {
                     
                            newCompositeNode(grammarAccess.getOpDefAccess().getEReferenceOpDefParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEReferenceOpDef_in_ruleOpDef1232);
                    this_EReferenceOpDef_3=ruleEReferenceOpDef();

                    state._fsp--;

                     
                            current = this_EReferenceOpDef_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpDef"


    // $ANTLR start "entryRuleEPackageOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:620:1: entryRuleEPackageOpDef returns [EObject current=null] : iv_ruleEPackageOpDef= ruleEPackageOpDef EOF ;
    public final EObject entryRuleEPackageOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackageOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:621:2: (iv_ruleEPackageOpDef= ruleEPackageOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:622:2: iv_ruleEPackageOpDef= ruleEPackageOpDef EOF
            {
             newCompositeNode(grammarAccess.getEPackageOpDefRule()); 
            pushFollow(FOLLOW_ruleEPackageOpDef_in_entryRuleEPackageOpDef1267);
            iv_ruleEPackageOpDef=ruleEPackageOpDef();

            state._fsp--;

             current =iv_ruleEPackageOpDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPackageOpDef1277); 

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
    // $ANTLR end "entryRuleEPackageOpDef"


    // $ANTLR start "ruleEPackageOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:629:1: ruleEPackageOpDef returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' ) ) ;
    public final EObject ruleEPackageOpDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_op_3_0=null;
        Token lv_op_4_0=null;
        Token lv_op_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        EObject lv_var_1_0 = null;

        EObject lv_ref_7_0 = null;

        EObject lv_setters_13_0 = null;

        EObject lv_classes_14_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:632:28: ( ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:633:1: ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:633:1: ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:633:2: (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:633:2: (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:633:4: otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleEPackageOpDef1315); 

                	newLeafNode(otherlv_0, grammarAccess.getEPackageOpDefAccess().getPackageKeyword_0_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:637:1: ( (lv_var_1_0= rulePackage ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:638:1: (lv_var_1_0= rulePackage )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:638:1: (lv_var_1_0= rulePackage )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:639:3: lv_var_1_0= rulePackage
            {
             
            	        newCompositeNode(grammarAccess.getEPackageOpDefAccess().getVarPackageParserRuleCall_0_1_0()); 
            	    
            pushFollow(FOLLOW_rulePackage_in_ruleEPackageOpDef1336);
            lv_var_1_0=rulePackage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEPackageOpDefRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_1_0, 
                    		"Package");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleEPackageOpDef1348); 

                	newLeafNode(otherlv_2, grammarAccess.getEPackageOpDefAccess().getEqualsSignKeyword_0_2());
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:659:2: ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:659:3: ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:659:3: ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 30:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:659:4: ( (lv_op_3_0= 'changePackage' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:659:4: ( (lv_op_3_0= 'changePackage' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:660:1: (lv_op_3_0= 'changePackage' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:660:1: (lv_op_3_0= 'changePackage' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:661:3: lv_op_3_0= 'changePackage'
                    {
                    lv_op_3_0=(Token)match(input,29,FOLLOW_29_in_ruleEPackageOpDef1369); 

                            newLeafNode(lv_op_3_0, grammarAccess.getEPackageOpDefAccess().getOpChangePackageKeyword_1_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEPackageOpDefRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_3_0, "changePackage");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:675:6: ( (lv_op_4_0= 'addPackage' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:675:6: ( (lv_op_4_0= 'addPackage' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:676:1: (lv_op_4_0= 'addPackage' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:676:1: (lv_op_4_0= 'addPackage' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:677:3: lv_op_4_0= 'addPackage'
                    {
                    lv_op_4_0=(Token)match(input,30,FOLLOW_30_in_ruleEPackageOpDef1406); 

                            newLeafNode(lv_op_4_0, grammarAccess.getEPackageOpDefAccess().getOpAddPackageKeyword_1_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEPackageOpDefRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_4_0, "addPackage");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:691:6: ( (lv_op_5_0= 'deletePackage' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:691:6: ( (lv_op_5_0= 'deletePackage' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:692:1: (lv_op_5_0= 'deletePackage' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:692:1: (lv_op_5_0= 'deletePackage' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:693:3: lv_op_5_0= 'deletePackage'
                    {
                    lv_op_5_0=(Token)match(input,31,FOLLOW_31_in_ruleEPackageOpDef1443); 

                            newLeafNode(lv_op_5_0, grammarAccess.getEPackageOpDefAccess().getOpDeletePackageKeyword_1_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEPackageOpDefRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_5_0, "deletePackage");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleEPackageOpDef1469); 

                	newLeafNode(otherlv_6, grammarAccess.getEPackageOpDefAccess().getLeftParenthesisKeyword_1_1());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:710:1: ( (lv_ref_7_0= rulePackage ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:711:1: (lv_ref_7_0= rulePackage )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:711:1: (lv_ref_7_0= rulePackage )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:712:3: lv_ref_7_0= rulePackage
            {
             
            	        newCompositeNode(grammarAccess.getEPackageOpDefAccess().getRefPackageParserRuleCall_1_2_0()); 
            	    
            pushFollow(FOLLOW_rulePackage_in_ruleEPackageOpDef1490);
            lv_ref_7_0=rulePackage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEPackageOpDefRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_7_0, 
                    		"Package");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleEPackageOpDef1502); 

                	newLeafNode(otherlv_8, grammarAccess.getEPackageOpDefAccess().getColonKeyword_1_3());
                
            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleEPackageOpDef1514); 

                	newLeafNode(otherlv_9, grammarAccess.getEPackageOpDefAccess().getPackageKeyword_1_4());
                
            otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleEPackageOpDef1526); 

                	newLeafNode(otherlv_10, grammarAccess.getEPackageOpDefAccess().getRightParenthesisKeyword_1_5());
                
            otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleEPackageOpDef1538); 

                	newLeafNode(otherlv_11, grammarAccess.getEPackageOpDefAccess().getWhereKeyword_1_6());
                
            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleEPackageOpDef1550); 

                	newLeafNode(otherlv_12, grammarAccess.getEPackageOpDefAccess().getLeftCurlyBracketKeyword_1_7());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:748:1: ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==47) ) {
                    alt9=1;
                }
                else if ( (LA9_0==35) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:748:2: ( (lv_setters_13_0= rulesetterDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:748:2: ( (lv_setters_13_0= rulesetterDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:749:1: (lv_setters_13_0= rulesetterDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:749:1: (lv_setters_13_0= rulesetterDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:750:3: lv_setters_13_0= rulesetterDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEPackageOpDefAccess().getSettersSetterDefParserRuleCall_1_8_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesetterDef_in_ruleEPackageOpDef1572);
            	    lv_setters_13_0=rulesetterDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEPackageOpDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"setters",
            	            		lv_setters_13_0, 
            	            		"setterDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:767:6: ( (lv_classes_14_0= ruleEClassOpDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:767:6: ( (lv_classes_14_0= ruleEClassOpDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:768:1: (lv_classes_14_0= ruleEClassOpDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:768:1: (lv_classes_14_0= ruleEClassOpDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:769:3: lv_classes_14_0= ruleEClassOpDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEPackageOpDefAccess().getClassesEClassOpDefParserRuleCall_1_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEClassOpDef_in_ruleEPackageOpDef1599);
            	    lv_classes_14_0=ruleEClassOpDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEPackageOpDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classes",
            	            		lv_classes_14_0, 
            	            		"EClassOpDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleEPackageOpDef1613); 

                	newLeafNode(otherlv_15, grammarAccess.getEPackageOpDefAccess().getRightCurlyBracketKeyword_1_9());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPackageOpDef"


    // $ANTLR start "entryRuleEClassOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:797:1: entryRuleEClassOpDef returns [EObject current=null] : iv_ruleEClassOpDef= ruleEClassOpDef EOF ;
    public final EObject entryRuleEClassOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClassOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:798:2: (iv_ruleEClassOpDef= ruleEClassOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:799:2: iv_ruleEClassOpDef= ruleEClassOpDef EOF
            {
             newCompositeNode(grammarAccess.getEClassOpDefRule()); 
            pushFollow(FOLLOW_ruleEClassOpDef_in_entryRuleEClassOpDef1650);
            iv_ruleEClassOpDef=ruleEClassOpDef();

            state._fsp--;

             current =iv_ruleEClassOpDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEClassOpDef1660); 

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
    // $ANTLR end "entryRuleEClassOpDef"


    // $ANTLR start "ruleEClassOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:806:1: ruleEClassOpDef returns [EObject current=null] : ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) ) ) ;
    public final EObject ruleEClassOpDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_op_3_0=null;
        Token lv_op_4_0=null;
        Token lv_op_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        EObject lv_var_1_0 = null;

        EObject lv_ref_7_0 = null;

        EObject lv_setters_13_0 = null;

        EObject lv_attributes_14_0 = null;

        EObject lv_references_15_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:809:28: ( ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:810:1: ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:810:1: ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:810:2: (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:810:2: (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:810:4: otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleEClassOpDef1698); 

                	newLeafNode(otherlv_0, grammarAccess.getEClassOpDefAccess().getClassKeyword_0_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:814:1: ( (lv_var_1_0= ruleClass ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:815:1: (lv_var_1_0= ruleClass )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:815:1: (lv_var_1_0= ruleClass )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:816:3: lv_var_1_0= ruleClass
            {
             
            	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getVarClassParserRuleCall_0_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClass_in_ruleEClassOpDef1719);
            lv_var_1_0=ruleClass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEClassOpDefRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_1_0, 
                    		"Class");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleEClassOpDef1731); 

                	newLeafNode(otherlv_2, grammarAccess.getEClassOpDefAccess().getEqualsSignKeyword_0_2());
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:836:2: ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:836:3: ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:836:3: ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case 38:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:836:4: ( (lv_op_3_0= 'changeClass' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:836:4: ( (lv_op_3_0= 'changeClass' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:837:1: (lv_op_3_0= 'changeClass' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:837:1: (lv_op_3_0= 'changeClass' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:838:3: lv_op_3_0= 'changeClass'
                    {
                    lv_op_3_0=(Token)match(input,36,FOLLOW_36_in_ruleEClassOpDef1752); 

                            newLeafNode(lv_op_3_0, grammarAccess.getEClassOpDefAccess().getOpChangeClassKeyword_1_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEClassOpDefRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_3_0, "changeClass");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:852:6: ( (lv_op_4_0= 'addClass' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:852:6: ( (lv_op_4_0= 'addClass' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:853:1: (lv_op_4_0= 'addClass' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:853:1: (lv_op_4_0= 'addClass' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:854:3: lv_op_4_0= 'addClass'
                    {
                    lv_op_4_0=(Token)match(input,37,FOLLOW_37_in_ruleEClassOpDef1789); 

                            newLeafNode(lv_op_4_0, grammarAccess.getEClassOpDefAccess().getOpAddClassKeyword_1_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEClassOpDefRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_4_0, "addClass");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:868:6: ( (lv_op_5_0= 'deleteClass' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:868:6: ( (lv_op_5_0= 'deleteClass' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:869:1: (lv_op_5_0= 'deleteClass' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:869:1: (lv_op_5_0= 'deleteClass' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:870:3: lv_op_5_0= 'deleteClass'
                    {
                    lv_op_5_0=(Token)match(input,38,FOLLOW_38_in_ruleEClassOpDef1826); 

                            newLeafNode(lv_op_5_0, grammarAccess.getEClassOpDefAccess().getOpDeleteClassKeyword_1_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEClassOpDefRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_5_0, "deleteClass");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleEClassOpDef1852); 

                	newLeafNode(otherlv_6, grammarAccess.getEClassOpDefAccess().getLeftParenthesisKeyword_1_1());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:887:1: ( (lv_ref_7_0= ruleClass ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:888:1: (lv_ref_7_0= ruleClass )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:888:1: (lv_ref_7_0= ruleClass )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:889:3: lv_ref_7_0= ruleClass
            {
             
            	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getRefClassParserRuleCall_1_2_0()); 
            	    
            pushFollow(FOLLOW_ruleClass_in_ruleEClassOpDef1873);
            lv_ref_7_0=ruleClass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEClassOpDefRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_7_0, 
                    		"Class");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleEClassOpDef1885); 

                	newLeafNode(otherlv_8, grammarAccess.getEClassOpDefAccess().getColonKeyword_1_3());
                
            otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleEClassOpDef1897); 

                	newLeafNode(otherlv_9, grammarAccess.getEClassOpDefAccess().getClassKeyword_1_4());
                
            otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleEClassOpDef1909); 

                	newLeafNode(otherlv_10, grammarAccess.getEClassOpDefAccess().getRightParenthesisKeyword_1_5());
                
            otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleEClassOpDef1921); 

                	newLeafNode(otherlv_11, grammarAccess.getEClassOpDefAccess().getWhereKeyword_1_6());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:921:1: (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:921:3: otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}'
            {
            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleEClassOpDef1934); 

                	newLeafNode(otherlv_12, grammarAccess.getEClassOpDefAccess().getLeftCurlyBracketKeyword_1_7_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:925:1: ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )*
            loop11:
            do {
                int alt11=4;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    alt11=1;
                    }
                    break;
                case 39:
                    {
                    alt11=2;
                    }
                    break;
                case 43:
                    {
                    alt11=3;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:925:2: ( (lv_setters_13_0= rulesetterDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:925:2: ( (lv_setters_13_0= rulesetterDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:926:1: (lv_setters_13_0= rulesetterDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:926:1: (lv_setters_13_0= rulesetterDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:927:3: lv_setters_13_0= rulesetterDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getSettersSetterDefParserRuleCall_1_7_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesetterDef_in_ruleEClassOpDef1956);
            	    lv_setters_13_0=rulesetterDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEClassOpDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"setters",
            	            		lv_setters_13_0, 
            	            		"setterDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:944:6: ( (lv_attributes_14_0= ruleEAttributeOpDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:944:6: ( (lv_attributes_14_0= ruleEAttributeOpDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:945:1: (lv_attributes_14_0= ruleEAttributeOpDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:945:1: (lv_attributes_14_0= ruleEAttributeOpDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:946:3: lv_attributes_14_0= ruleEAttributeOpDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getAttributesEAttributeOpDefParserRuleCall_1_7_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEAttributeOpDef_in_ruleEClassOpDef1983);
            	    lv_attributes_14_0=ruleEAttributeOpDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEClassOpDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_14_0, 
            	            		"EAttributeOpDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:963:6: ( (lv_references_15_0= ruleEReferenceOpDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:963:6: ( (lv_references_15_0= ruleEReferenceOpDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:964:1: (lv_references_15_0= ruleEReferenceOpDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:964:1: (lv_references_15_0= ruleEReferenceOpDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:965:3: lv_references_15_0= ruleEReferenceOpDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getReferencesEReferenceOpDefParserRuleCall_1_7_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEReferenceOpDef_in_ruleEClassOpDef2010);
            	    lv_references_15_0=ruleEReferenceOpDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEClassOpDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"references",
            	            		lv_references_15_0, 
            	            		"EReferenceOpDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_16=(Token)match(input,13,FOLLOW_13_in_ruleEClassOpDef2024); 

                	newLeafNode(otherlv_16, grammarAccess.getEClassOpDefAccess().getRightCurlyBracketKeyword_1_7_2());
                

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEClassOpDef"


    // $ANTLR start "entryRuleEAttributeOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:993:1: entryRuleEAttributeOpDef returns [EObject current=null] : iv_ruleEAttributeOpDef= ruleEAttributeOpDef EOF ;
    public final EObject entryRuleEAttributeOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:994:2: (iv_ruleEAttributeOpDef= ruleEAttributeOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:995:2: iv_ruleEAttributeOpDef= ruleEAttributeOpDef EOF
            {
             newCompositeNode(grammarAccess.getEAttributeOpDefRule()); 
            pushFollow(FOLLOW_ruleEAttributeOpDef_in_entryRuleEAttributeOpDef2062);
            iv_ruleEAttributeOpDef=ruleEAttributeOpDef();

            state._fsp--;

             current =iv_ruleEAttributeOpDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEAttributeOpDef2072); 

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
    // $ANTLR end "entryRuleEAttributeOpDef"


    // $ANTLR start "ruleEAttributeOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1002:1: ruleEAttributeOpDef returns [EObject current=null] : ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) ) ) ;
    public final EObject ruleEAttributeOpDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_op_3_0=null;
        Token lv_op_4_0=null;
        Token lv_op_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_var_1_0 = null;

        EObject lv_ref_7_0 = null;

        EObject lv_setters_13_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1005:28: ( ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1006:1: ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1006:1: ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1006:2: (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1006:2: (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1006:4: otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEAttributeOpDef2110); 

                	newLeafNode(otherlv_0, grammarAccess.getEAttributeOpDefAccess().getAttributeKeyword_0_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1010:1: ( (lv_var_1_0= ruleAttribute ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1011:1: (lv_var_1_0= ruleAttribute )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1011:1: (lv_var_1_0= ruleAttribute )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1012:3: lv_var_1_0= ruleAttribute
            {
             
            	        newCompositeNode(grammarAccess.getEAttributeOpDefAccess().getVarAttributeParserRuleCall_0_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttribute_in_ruleEAttributeOpDef2131);
            lv_var_1_0=ruleAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEAttributeOpDefRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_1_0, 
                    		"Attribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleEAttributeOpDef2143); 

                	newLeafNode(otherlv_2, grammarAccess.getEAttributeOpDefAccess().getEqualsSignKeyword_0_2());
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1032:2: ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1032:3: ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1032:3: ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1032:4: ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1032:4: ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt12=1;
                }
                break;
            case 41:
                {
                alt12=2;
                }
                break;
            case 42:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1032:5: ( (lv_op_3_0= 'changeEAttribute' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1032:5: ( (lv_op_3_0= 'changeEAttribute' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1033:1: (lv_op_3_0= 'changeEAttribute' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1033:1: (lv_op_3_0= 'changeEAttribute' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1034:3: lv_op_3_0= 'changeEAttribute'
                    {
                    lv_op_3_0=(Token)match(input,40,FOLLOW_40_in_ruleEAttributeOpDef2165); 

                            newLeafNode(lv_op_3_0, grammarAccess.getEAttributeOpDefAccess().getOpChangeEAttributeKeyword_1_0_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeOpDefRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_3_0, "changeEAttribute");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1048:6: ( (lv_op_4_0= 'addEAttribute' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1048:6: ( (lv_op_4_0= 'addEAttribute' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1049:1: (lv_op_4_0= 'addEAttribute' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1049:1: (lv_op_4_0= 'addEAttribute' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1050:3: lv_op_4_0= 'addEAttribute'
                    {
                    lv_op_4_0=(Token)match(input,41,FOLLOW_41_in_ruleEAttributeOpDef2202); 

                            newLeafNode(lv_op_4_0, grammarAccess.getEAttributeOpDefAccess().getOpAddEAttributeKeyword_1_0_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeOpDefRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_4_0, "addEAttribute");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1064:6: ( (lv_op_5_0= 'deleteEAttribute' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1064:6: ( (lv_op_5_0= 'deleteEAttribute' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1065:1: (lv_op_5_0= 'deleteEAttribute' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1065:1: (lv_op_5_0= 'deleteEAttribute' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1066:3: lv_op_5_0= 'deleteEAttribute'
                    {
                    lv_op_5_0=(Token)match(input,42,FOLLOW_42_in_ruleEAttributeOpDef2239); 

                            newLeafNode(lv_op_5_0, grammarAccess.getEAttributeOpDefAccess().getOpDeleteEAttributeKeyword_1_0_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEAttributeOpDefRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_5_0, "deleteEAttribute");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleEAttributeOpDef2265); 

                	newLeafNode(otherlv_6, grammarAccess.getEAttributeOpDefAccess().getLeftParenthesisKeyword_1_0_1());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1083:1: ( (lv_ref_7_0= ruleAttribute ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1084:1: (lv_ref_7_0= ruleAttribute )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1084:1: (lv_ref_7_0= ruleAttribute )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1085:3: lv_ref_7_0= ruleAttribute
            {
             
            	        newCompositeNode(grammarAccess.getEAttributeOpDefAccess().getRefAttributeParserRuleCall_1_0_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttribute_in_ruleEAttributeOpDef2286);
            lv_ref_7_0=ruleAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEAttributeOpDefRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_7_0, 
                    		"Attribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleEAttributeOpDef2298); 

                	newLeafNode(otherlv_8, grammarAccess.getEAttributeOpDefAccess().getColonKeyword_1_0_3());
                
            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleEAttributeOpDef2310); 

                	newLeafNode(otherlv_9, grammarAccess.getEAttributeOpDefAccess().getAttributeKeyword_1_0_4());
                

            }

            otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleEAttributeOpDef2323); 

                	newLeafNode(otherlv_10, grammarAccess.getEAttributeOpDefAccess().getRightParenthesisKeyword_1_1());
                
            otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleEAttributeOpDef2335); 

                	newLeafNode(otherlv_11, grammarAccess.getEAttributeOpDefAccess().getWhereKeyword_1_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1117:1: ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            else if ( (LA14_0==15) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1117:2: (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1117:2: (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1117:4: otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleEAttributeOpDef2349); 

                        	newLeafNode(otherlv_12, grammarAccess.getEAttributeOpDefAccess().getLeftCurlyBracketKeyword_1_3_0_0());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1121:1: ( (lv_setters_13_0= rulesetterDef ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==47) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1122:1: (lv_setters_13_0= rulesetterDef )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1122:1: (lv_setters_13_0= rulesetterDef )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1123:3: lv_setters_13_0= rulesetterDef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAttributeOpDefAccess().getSettersSetterDefParserRuleCall_1_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulesetterDef_in_ruleEAttributeOpDef2370);
                    	    lv_setters_13_0=rulesetterDef();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEAttributeOpDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"setters",
                    	            		lv_setters_13_0, 
                    	            		"setterDef");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleEAttributeOpDef2383); 

                        	newLeafNode(otherlv_14, grammarAccess.getEAttributeOpDefAccess().getRightCurlyBracketKeyword_1_3_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1144:7: otherlv_15= ';'
                    {
                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleEAttributeOpDef2402); 

                        	newLeafNode(otherlv_15, grammarAccess.getEAttributeOpDefAccess().getSemicolonKeyword_1_3_1());
                        

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAttributeOpDef"


    // $ANTLR start "entryRuleEReferenceOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1156:1: entryRuleEReferenceOpDef returns [EObject current=null] : iv_ruleEReferenceOpDef= ruleEReferenceOpDef EOF ;
    public final EObject entryRuleEReferenceOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReferenceOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1157:2: (iv_ruleEReferenceOpDef= ruleEReferenceOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1158:2: iv_ruleEReferenceOpDef= ruleEReferenceOpDef EOF
            {
             newCompositeNode(grammarAccess.getEReferenceOpDefRule()); 
            pushFollow(FOLLOW_ruleEReferenceOpDef_in_entryRuleEReferenceOpDef2440);
            iv_ruleEReferenceOpDef=ruleEReferenceOpDef();

            state._fsp--;

             current =iv_ruleEReferenceOpDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEReferenceOpDef2450); 

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
    // $ANTLR end "entryRuleEReferenceOpDef"


    // $ANTLR start "ruleEReferenceOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1165:1: ruleEReferenceOpDef returns [EObject current=null] : ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) ) ) ;
    public final EObject ruleEReferenceOpDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_op_3_0=null;
        Token lv_op_4_0=null;
        Token lv_op_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_var_1_0 = null;

        EObject lv_ref_7_0 = null;

        EObject lv_setters_13_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1168:28: ( ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1169:1: ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1169:1: ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1169:2: (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1169:2: (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1169:4: otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleEReferenceOpDef2488); 

                	newLeafNode(otherlv_0, grammarAccess.getEReferenceOpDefAccess().getReferenceKeyword_0_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1173:1: ( (lv_var_1_0= ruleReference ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1174:1: (lv_var_1_0= ruleReference )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1174:1: (lv_var_1_0= ruleReference )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1175:3: lv_var_1_0= ruleReference
            {
             
            	        newCompositeNode(grammarAccess.getEReferenceOpDefAccess().getVarReferenceParserRuleCall_0_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReference_in_ruleEReferenceOpDef2509);
            lv_var_1_0=ruleReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEReferenceOpDefRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_1_0, 
                    		"Reference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleEReferenceOpDef2521); 

                	newLeafNode(otherlv_2, grammarAccess.getEReferenceOpDefAccess().getEqualsSignKeyword_0_2());
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1195:2: ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1195:3: ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1195:3: ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1195:4: ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1195:4: ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt15=1;
                }
                break;
            case 45:
                {
                alt15=2;
                }
                break;
            case 46:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1195:5: ( (lv_op_3_0= 'changeEReference' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1195:5: ( (lv_op_3_0= 'changeEReference' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1196:1: (lv_op_3_0= 'changeEReference' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1196:1: (lv_op_3_0= 'changeEReference' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1197:3: lv_op_3_0= 'changeEReference'
                    {
                    lv_op_3_0=(Token)match(input,44,FOLLOW_44_in_ruleEReferenceOpDef2543); 

                            newLeafNode(lv_op_3_0, grammarAccess.getEReferenceOpDefAccess().getOpChangeEReferenceKeyword_1_0_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceOpDefRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_3_0, "changeEReference");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1211:6: ( (lv_op_4_0= 'addEReference' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1211:6: ( (lv_op_4_0= 'addEReference' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1212:1: (lv_op_4_0= 'addEReference' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1212:1: (lv_op_4_0= 'addEReference' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1213:3: lv_op_4_0= 'addEReference'
                    {
                    lv_op_4_0=(Token)match(input,45,FOLLOW_45_in_ruleEReferenceOpDef2580); 

                            newLeafNode(lv_op_4_0, grammarAccess.getEReferenceOpDefAccess().getOpAddEReferenceKeyword_1_0_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceOpDefRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_4_0, "addEReference");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1227:6: ( (lv_op_5_0= 'deleteEReference' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1227:6: ( (lv_op_5_0= 'deleteEReference' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1228:1: (lv_op_5_0= 'deleteEReference' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1228:1: (lv_op_5_0= 'deleteEReference' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1229:3: lv_op_5_0= 'deleteEReference'
                    {
                    lv_op_5_0=(Token)match(input,46,FOLLOW_46_in_ruleEReferenceOpDef2617); 

                            newLeafNode(lv_op_5_0, grammarAccess.getEReferenceOpDefAccess().getOpDeleteEReferenceKeyword_1_0_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEReferenceOpDefRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_5_0, "deleteEReference");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleEReferenceOpDef2643); 

                	newLeafNode(otherlv_6, grammarAccess.getEReferenceOpDefAccess().getLeftParenthesisKeyword_1_0_1());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1246:1: ( (lv_ref_7_0= ruleReference ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1247:1: (lv_ref_7_0= ruleReference )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1247:1: (lv_ref_7_0= ruleReference )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1248:3: lv_ref_7_0= ruleReference
            {
             
            	        newCompositeNode(grammarAccess.getEReferenceOpDefAccess().getRefReferenceParserRuleCall_1_0_2_0()); 
            	    
            pushFollow(FOLLOW_ruleReference_in_ruleEReferenceOpDef2664);
            lv_ref_7_0=ruleReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEReferenceOpDefRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_7_0, 
                    		"Reference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleEReferenceOpDef2676); 

                	newLeafNode(otherlv_8, grammarAccess.getEReferenceOpDefAccess().getColonKeyword_1_0_3());
                
            otherlv_9=(Token)match(input,43,FOLLOW_43_in_ruleEReferenceOpDef2688); 

                	newLeafNode(otherlv_9, grammarAccess.getEReferenceOpDefAccess().getReferenceKeyword_1_0_4());
                

            }

            otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleEReferenceOpDef2701); 

                	newLeafNode(otherlv_10, grammarAccess.getEReferenceOpDefAccess().getRightParenthesisKeyword_1_1());
                
            otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleEReferenceOpDef2713); 

                	newLeafNode(otherlv_11, grammarAccess.getEReferenceOpDefAccess().getWhereKeyword_1_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1280:1: (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1280:3: otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}'
            {
            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleEReferenceOpDef2726); 

                	newLeafNode(otherlv_12, grammarAccess.getEReferenceOpDefAccess().getLeftCurlyBracketKeyword_1_3_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1284:1: ( (lv_setters_13_0= rulesetterDef ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==47) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1285:1: (lv_setters_13_0= rulesetterDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1285:1: (lv_setters_13_0= rulesetterDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1286:3: lv_setters_13_0= rulesetterDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEReferenceOpDefAccess().getSettersSetterDefParserRuleCall_1_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesetterDef_in_ruleEReferenceOpDef2747);
            	    lv_setters_13_0=rulesetterDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEReferenceOpDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"setters",
            	            		lv_setters_13_0, 
            	            		"setterDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleEReferenceOpDef2760); 

                	newLeafNode(otherlv_14, grammarAccess.getEReferenceOpDefAccess().getRightCurlyBracketKeyword_1_3_2());
                

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEReferenceOpDef"


    // $ANTLR start "entryRulesetterDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1314:1: entryRulesetterDef returns [EObject current=null] : iv_rulesetterDef= rulesetterDef EOF ;
    public final EObject entryRulesetterDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesetterDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1315:2: (iv_rulesetterDef= rulesetterDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1316:2: iv_rulesetterDef= rulesetterDef EOF
            {
             newCompositeNode(grammarAccess.getSetterDefRule()); 
            pushFollow(FOLLOW_rulesetterDef_in_entryRulesetterDef2798);
            iv_rulesetterDef=rulesetterDef();

            state._fsp--;

             current =iv_rulesetterDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesetterDef2808); 

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
    // $ANTLR end "entryRulesetterDef"


    // $ANTLR start "rulesetterDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1323:1: rulesetterDef returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' ) ;
    public final EObject rulesetterDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_operator_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_par_3_0 = null;

        EObject lv_par_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1326:28: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1327:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1327:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1327:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_rulesetterDef2845); 

                	newLeafNode(otherlv_0, grammarAccess.getSetterDefAccess().getSetKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1331:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1332:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1332:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1333:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSetterDefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesetterDef2865); 

            		newLeafNode(otherlv_1, grammarAccess.getSetterDefAccess().getMetafeatureEStructuralFeatureCrossReference_1_0()); 
            	

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1344:2: ( (lv_operator_2_0= '=' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1345:1: (lv_operator_2_0= '=' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1345:1: (lv_operator_2_0= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1346:3: lv_operator_2_0= '='
            {
            lv_operator_2_0=(Token)match(input,28,FOLLOW_28_in_rulesetterDef2883); 

                    newLeafNode(lv_operator_2_0, grammarAccess.getSetterDefAccess().getOperatorEqualsSignKeyword_2_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetterDefRule());
            	        }
                   		setWithLastConsumed(current, "operator", lv_operator_2_0, "=");
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1359:2: ( (lv_par_3_0= ruleParameter ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1360:1: (lv_par_3_0= ruleParameter )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1360:1: (lv_par_3_0= ruleParameter )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1361:3: lv_par_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getSetterDefAccess().getParParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_rulesetterDef2917);
            lv_par_3_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetterDefRule());
            	        }
                   		add(
                   			current, 
                   			"par",
                    		lv_par_3_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1377:2: (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1377:4: otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_rulesetterDef2930); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSetterDefAccess().getCommaKeyword_4_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1381:1: ( (lv_par_5_0= ruleParameter ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1382:1: (lv_par_5_0= ruleParameter )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1382:1: (lv_par_5_0= ruleParameter )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1383:3: lv_par_5_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSetterDefAccess().getParParameterParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_rulesetterDef2951);
            	    lv_par_5_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSetterDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"par",
            	            		lv_par_5_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_rulesetterDef2965); 

                	newLeafNode(otherlv_6, grammarAccess.getSetterDefAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesetterDef"


    // $ANTLR start "entryRuleRewritingRule"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1411:1: entryRuleRewritingRule returns [EObject current=null] : iv_ruleRewritingRule= ruleRewritingRule EOF ;
    public final EObject entryRuleRewritingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewritingRule = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1412:2: (iv_ruleRewritingRule= ruleRewritingRule EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1413:2: iv_ruleRewritingRule= ruleRewritingRule EOF
            {
             newCompositeNode(grammarAccess.getRewritingRuleRule()); 
            pushFollow(FOLLOW_ruleRewritingRule_in_entryRuleRewritingRule3001);
            iv_ruleRewritingRule=ruleRewritingRule();

            state._fsp--;

             current =iv_ruleRewritingRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRewritingRule3011); 

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
    // $ANTLR end "entryRuleRewritingRule"


    // $ANTLR start "ruleRewritingRule"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1420:1: ruleRewritingRule returns [EObject current=null] : ( ( ( (lv_migratorSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* ) ;
    public final EObject ruleRewritingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_migratorSX_0_0 = null;

        EObject lv_migratorDX_2_0 = null;

        EObject lv_migratorSX_4_0 = null;

        EObject lv_migratorDX_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1423:28: ( ( ( ( (lv_migratorSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1424:1: ( ( ( (lv_migratorSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1424:1: ( ( ( (lv_migratorSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1424:2: ( ( (lv_migratorSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )*
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1424:2: ( ( (lv_migratorSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1424:3: ( (lv_migratorSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1424:3: ( (lv_migratorSX_0_0= ruleMigratorSX ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1425:1: (lv_migratorSX_0_0= ruleMigratorSX )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1425:1: (lv_migratorSX_0_0= ruleMigratorSX )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1426:3: lv_migratorSX_0_0= ruleMigratorSX
            {
             
            	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorSXMigratorSXParserRuleCall_0_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMigratorSX_in_ruleRewritingRule3058);
            lv_migratorSX_0_0=ruleMigratorSX();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRewritingRuleRule());
            	        }
                   		add(
                   			current, 
                   			"migratorSX",
                    		lv_migratorSX_0_0, 
                    		"MigratorSX");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleRewritingRule3070); 

                	newLeafNode(otherlv_1, grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1446:1: ( (lv_migratorDX_2_0= ruleMigratorDX ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1447:1: (lv_migratorDX_2_0= ruleMigratorDX )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1447:1: (lv_migratorDX_2_0= ruleMigratorDX )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1448:3: lv_migratorDX_2_0= ruleMigratorDX
            {
             
            	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_0_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMigratorDX_in_ruleRewritingRule3091);
            lv_migratorDX_2_0=ruleMigratorDX();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRewritingRuleRule());
            	        }
                   		add(
                   			current, 
                   			"migratorDX",
                    		lv_migratorDX_2_0, 
                    		"MigratorDX");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1464:3: (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==49) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1464:5: otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) )
            	    {
            	    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleRewritingRule3105); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRewritingRuleAccess().getAmpersandKeyword_1_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1468:1: ( (lv_migratorSX_4_0= ruleMigratorSX ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1469:1: (lv_migratorSX_4_0= ruleMigratorSX )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1469:1: (lv_migratorSX_4_0= ruleMigratorSX )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1470:3: lv_migratorSX_4_0= ruleMigratorSX
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorSXMigratorSXParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMigratorSX_in_ruleRewritingRule3126);
            	    lv_migratorSX_4_0=ruleMigratorSX();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRewritingRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"migratorSX",
            	            		lv_migratorSX_4_0, 
            	            		"MigratorSX");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleRewritingRule3138); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_1_2());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1490:1: ( (lv_migratorDX_6_0= ruleMigratorDX ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1491:1: (lv_migratorDX_6_0= ruleMigratorDX )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1491:1: (lv_migratorDX_6_0= ruleMigratorDX )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1492:3: lv_migratorDX_6_0= ruleMigratorDX
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMigratorDX_in_ruleRewritingRule3159);
            	    lv_migratorDX_6_0=ruleMigratorDX();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRewritingRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"migratorDX",
            	            		lv_migratorDX_6_0, 
            	            		"MigratorDX");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRewritingRule"


    // $ANTLR start "entryRuleMigrator"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1516:1: entryRuleMigrator returns [EObject current=null] : iv_ruleMigrator= ruleMigrator EOF ;
    public final EObject entryRuleMigrator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrator = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1517:2: (iv_ruleMigrator= ruleMigrator EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1518:2: iv_ruleMigrator= ruleMigrator EOF
            {
             newCompositeNode(grammarAccess.getMigratorRule()); 
            pushFollow(FOLLOW_ruleMigrator_in_entryRuleMigrator3197);
            iv_ruleMigrator=ruleMigrator();

            state._fsp--;

             current =iv_ruleMigrator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrator3207); 

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
    // $ANTLR end "entryRuleMigrator"


    // $ANTLR start "ruleMigrator"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1525:1: ruleMigrator returns [EObject current=null] : (this_MigratorSX_0= ruleMigratorSX | this_MigratorDX_1= ruleMigratorDX ) ;
    public final EObject ruleMigrator() throws RecognitionException {
        EObject current = null;

        EObject this_MigratorSX_0 = null;

        EObject this_MigratorDX_1 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1528:28: ( (this_MigratorSX_0= ruleMigratorSX | this_MigratorDX_1= ruleMigratorDX ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1529:1: (this_MigratorSX_0= ruleMigratorSX | this_MigratorDX_1= ruleMigratorDX )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1529:1: (this_MigratorSX_0= ruleMigratorSX | this_MigratorDX_1= ruleMigratorDX )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==18) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==RULE_ID) ) {
                        int LA19_4 = input.LA(4);

                        if ( (LA19_4==34) ) {
                            alt19=1;
                        }
                        else if ( (LA19_4==25) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==50) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1530:5: this_MigratorSX_0= ruleMigratorSX
                    {
                     
                            newCompositeNode(grammarAccess.getMigratorAccess().getMigratorSXParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMigratorSX_in_ruleMigrator3254);
                    this_MigratorSX_0=ruleMigratorSX();

                    state._fsp--;

                     
                            current = this_MigratorSX_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1540:5: this_MigratorDX_1= ruleMigratorDX
                    {
                     
                            newCompositeNode(grammarAccess.getMigratorAccess().getMigratorDXParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMigratorDX_in_ruleMigrator3281);
                    this_MigratorDX_1=ruleMigratorDX();

                    state._fsp--;

                     
                            current = this_MigratorDX_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMigrator"


    // $ANTLR start "entryRuleMigratorSX"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1556:1: entryRuleMigratorSX returns [EObject current=null] : iv_ruleMigratorSX= ruleMigratorSX EOF ;
    public final EObject entryRuleMigratorSX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigratorSX = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1557:2: (iv_ruleMigratorSX= ruleMigratorSX EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1558:2: iv_ruleMigratorSX= ruleMigratorSX EOF
            {
             newCompositeNode(grammarAccess.getMigratorSXRule()); 
            pushFollow(FOLLOW_ruleMigratorSX_in_entryRuleMigratorSX3316);
            iv_ruleMigratorSX=ruleMigratorSX();

            state._fsp--;

             current =iv_ruleMigratorSX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigratorSX3326); 

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
    // $ANTLR end "entryRuleMigratorSX"


    // $ANTLR start "ruleMigratorSX"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1565:1: ruleMigratorSX returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']' ) ;
    public final EObject ruleMigratorSX() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_filterSX_6_0 = null;

        EObject lv_filterSX_8_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1568:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1569:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1569:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1569:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1569:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1570:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMigratorSXAccess().getMigratorSXAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1575:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1576:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1576:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1577:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorSX3377); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMigratorSXAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMigratorSXRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMigratorSX3394); 

                	newLeafNode(otherlv_2, grammarAccess.getMigratorSXAccess().getColonKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1597:1: ( (otherlv_3= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1598:1: (otherlv_3= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1598:1: (otherlv_3= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1599:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMigratorSXRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorSX3414); 

            		newLeafNode(otherlv_3, grammarAccess.getMigratorSXAccess().getElementSXEClassCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleMigratorSX3426); 

                	newLeafNode(otherlv_4, grammarAccess.getMigratorSXAccess().getWhereKeyword_4());
                
            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleMigratorSX3438); 

                	newLeafNode(otherlv_5, grammarAccess.getMigratorSXAccess().getLeftSquareBracketKeyword_5());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1618:1: ( (lv_filterSX_6_0= ruleFilterMigrator ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1619:1: (lv_filterSX_6_0= ruleFilterMigrator )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1619:1: (lv_filterSX_6_0= ruleFilterMigrator )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1620:3: lv_filterSX_6_0= ruleFilterMigrator
            {
             
            	        newCompositeNode(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorSX3459);
            lv_filterSX_6_0=ruleFilterMigrator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMigratorSXRule());
            	        }
                   		add(
                   			current, 
                   			"filterSX",
                    		lv_filterSX_6_0, 
                    		"FilterMigrator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1636:2: (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==49) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1636:4: otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) )
            	    {
            	    otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleMigratorSX3472); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMigratorSXAccess().getAmpersandKeyword_7_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1640:1: ( (lv_filterSX_8_0= ruleFilterMigrator ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1641:1: (lv_filterSX_8_0= ruleFilterMigrator )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1641:1: (lv_filterSX_8_0= ruleFilterMigrator )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1642:3: lv_filterSX_8_0= ruleFilterMigrator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorSX3493);
            	    lv_filterSX_8_0=ruleFilterMigrator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMigratorSXRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"filterSX",
            	            		lv_filterSX_8_0, 
            	            		"FilterMigrator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleMigratorSX3507); 

                	newLeafNode(otherlv_9, grammarAccess.getMigratorSXAccess().getRightSquareBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMigratorSX"


    // $ANTLR start "entryRuleMigratorDX"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1670:1: entryRuleMigratorDX returns [EObject current=null] : iv_ruleMigratorDX= ruleMigratorDX EOF ;
    public final EObject entryRuleMigratorDX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigratorDX = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1671:2: (iv_ruleMigratorDX= ruleMigratorDX EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1672:2: iv_ruleMigratorDX= ruleMigratorDX EOF
            {
             newCompositeNode(grammarAccess.getMigratorDXRule()); 
            pushFollow(FOLLOW_ruleMigratorDX_in_entryRuleMigratorDX3543);
            iv_ruleMigratorDX=ruleMigratorDX();

            state._fsp--;

             current =iv_ruleMigratorDX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigratorDX3553); 

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
    // $ANTLR end "entryRuleMigratorDX"


    // $ANTLR start "ruleMigratorDX"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1679:1: ruleMigratorDX returns [EObject current=null] : ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) ) | otherlv_9= 'null' ) ;
    public final EObject ruleMigratorDX() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_filterDX_5_0 = null;

        EObject lv_filterDX_7_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1682:28: ( ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) ) | otherlv_9= 'null' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1683:1: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) ) | otherlv_9= 'null' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1683:1: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) ) | otherlv_9= 'null' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==50) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1683:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1683:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1683:3: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1683:3: ()
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1684:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMigratorDXAccess().getMigratorDXAction_0_0(),
                                current);
                        

                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1689:2: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1689:3: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']'
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1689:3: ( (lv_name_1_0= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1690:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1690:1: (lv_name_1_0= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1691:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorDX3606); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getMigratorDXAccess().getNameIDTerminalRuleCall_0_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMigratorDXRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMigratorDX3623); 

                        	newLeafNode(otherlv_2, grammarAccess.getMigratorDXAccess().getColonKeyword_0_1_1());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1711:1: ( (otherlv_3= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1712:1: (otherlv_3= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1712:1: (otherlv_3= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1713:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMigratorDXRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorDX3643); 

                    		newLeafNode(otherlv_3, grammarAccess.getMigratorDXAccess().getElementDXEClassCrossReference_0_1_2_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleMigratorDX3655); 

                        	newLeafNode(otherlv_4, grammarAccess.getMigratorDXAccess().getLeftSquareBracketKeyword_0_1_3());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1728:1: ( (lv_filterDX_5_0= ruleFilterMigrator ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1729:1: (lv_filterDX_5_0= ruleFilterMigrator )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1729:1: (lv_filterDX_5_0= ruleFilterMigrator )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1730:3: lv_filterDX_5_0= ruleFilterMigrator
                    {
                     
                    	        newCompositeNode(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorDX3676);
                    lv_filterDX_5_0=ruleFilterMigrator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMigratorDXRule());
                    	        }
                           		add(
                           			current, 
                           			"filterDX",
                            		lv_filterDX_5_0, 
                            		"FilterMigrator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1746:2: (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==49) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1746:4: otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) )
                    	    {
                    	    otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleMigratorDX3689); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getMigratorDXAccess().getAmpersandKeyword_0_1_5_0());
                    	        
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1750:1: ( (lv_filterDX_7_0= ruleFilterMigrator ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1751:1: (lv_filterDX_7_0= ruleFilterMigrator )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1751:1: (lv_filterDX_7_0= ruleFilterMigrator )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1752:3: lv_filterDX_7_0= ruleFilterMigrator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_1_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorDX3710);
                    	    lv_filterDX_7_0=ruleFilterMigrator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMigratorDXRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"filterDX",
                    	            		lv_filterDX_7_0, 
                    	            		"FilterMigrator");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleMigratorDX3724); 

                        	newLeafNode(otherlv_8, grammarAccess.getMigratorDXAccess().getRightSquareBracketKeyword_0_1_6());
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1773:7: otherlv_9= 'null'
                    {
                    otherlv_9=(Token)match(input,50,FOLLOW_50_in_ruleMigratorDX3744); 

                        	newLeafNode(otherlv_9, grammarAccess.getMigratorDXAccess().getNullKeyword_1());
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMigratorDX"


    // $ANTLR start "entryRuleFilterMigrator"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1785:1: entryRuleFilterMigrator returns [EObject current=null] : iv_ruleFilterMigrator= ruleFilterMigrator EOF ;
    public final EObject entryRuleFilterMigrator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterMigrator = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1786:2: (iv_ruleFilterMigrator= ruleFilterMigrator EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1787:2: iv_ruleFilterMigrator= ruleFilterMigrator EOF
            {
             newCompositeNode(grammarAccess.getFilterMigratorRule()); 
            pushFollow(FOLLOW_ruleFilterMigrator_in_entryRuleFilterMigrator3780);
            iv_ruleFilterMigrator=ruleFilterMigrator();

            state._fsp--;

             current =iv_ruleFilterMigrator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterMigrator3790); 

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
    // $ANTLR end "entryRuleFilterMigrator"


    // $ANTLR start "ruleFilterMigrator"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1794:1: ruleFilterMigrator returns [EObject current=null] : ( ( (lv_featureSX_0_0= ruleDotNavigationObjSX ) ) ( (lv_op_1_0= '=' ) ) ( (lv_value_2_0= ruleDotNavigationObjDX ) )? ) ;
    public final EObject ruleFilterMigrator() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_featureSX_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1797:28: ( ( ( (lv_featureSX_0_0= ruleDotNavigationObjSX ) ) ( (lv_op_1_0= '=' ) ) ( (lv_value_2_0= ruleDotNavigationObjDX ) )? ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1798:1: ( ( (lv_featureSX_0_0= ruleDotNavigationObjSX ) ) ( (lv_op_1_0= '=' ) ) ( (lv_value_2_0= ruleDotNavigationObjDX ) )? )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1798:1: ( ( (lv_featureSX_0_0= ruleDotNavigationObjSX ) ) ( (lv_op_1_0= '=' ) ) ( (lv_value_2_0= ruleDotNavigationObjDX ) )? )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1798:2: ( (lv_featureSX_0_0= ruleDotNavigationObjSX ) ) ( (lv_op_1_0= '=' ) ) ( (lv_value_2_0= ruleDotNavigationObjDX ) )?
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1798:2: ( (lv_featureSX_0_0= ruleDotNavigationObjSX ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1799:1: (lv_featureSX_0_0= ruleDotNavigationObjSX )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1799:1: (lv_featureSX_0_0= ruleDotNavigationObjSX )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1800:3: lv_featureSX_0_0= ruleDotNavigationObjSX
            {
             
            	        newCompositeNode(grammarAccess.getFilterMigratorAccess().getFeatureSXDotNavigationObjSXParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDotNavigationObjSX_in_ruleFilterMigrator3836);
            lv_featureSX_0_0=ruleDotNavigationObjSX();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterMigratorRule());
            	        }
                   		set(
                   			current, 
                   			"featureSX",
                    		lv_featureSX_0_0, 
                    		"DotNavigationObjSX");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1816:2: ( (lv_op_1_0= '=' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1817:1: (lv_op_1_0= '=' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1817:1: (lv_op_1_0= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1818:3: lv_op_1_0= '='
            {
            lv_op_1_0=(Token)match(input,28,FOLLOW_28_in_ruleFilterMigrator3854); 

                    newLeafNode(lv_op_1_0, grammarAccess.getFilterMigratorAccess().getOpEqualsSignKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterMigratorRule());
            	        }
                   		setWithLastConsumed(current, "op", lv_op_1_0, "=");
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1831:2: ( (lv_value_2_0= ruleDotNavigationObjDX ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==51) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1832:1: (lv_value_2_0= ruleDotNavigationObjDX )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1832:1: (lv_value_2_0= ruleDotNavigationObjDX )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1833:3: lv_value_2_0= ruleDotNavigationObjDX
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterMigratorAccess().getValueDotNavigationObjDXParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDotNavigationObjDX_in_ruleFilterMigrator3888);
                    lv_value_2_0=ruleDotNavigationObjDX();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterMigratorRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"DotNavigationObjDX");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterMigrator"


    // $ANTLR start "entryRuleDotNavigationObjSX"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1857:1: entryRuleDotNavigationObjSX returns [EObject current=null] : iv_ruleDotNavigationObjSX= ruleDotNavigationObjSX EOF ;
    public final EObject entryRuleDotNavigationObjSX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotNavigationObjSX = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1858:2: (iv_ruleDotNavigationObjSX= ruleDotNavigationObjSX EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1859:2: iv_ruleDotNavigationObjSX= ruleDotNavigationObjSX EOF
            {
             newCompositeNode(grammarAccess.getDotNavigationObjSXRule()); 
            pushFollow(FOLLOW_ruleDotNavigationObjSX_in_entryRuleDotNavigationObjSX3925);
            iv_ruleDotNavigationObjSX=ruleDotNavigationObjSX();

            state._fsp--;

             current =iv_ruleDotNavigationObjSX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDotNavigationObjSX3935); 

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
    // $ANTLR end "entryRuleDotNavigationObjSX"


    // $ANTLR start "ruleDotNavigationObjSX"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1866:1: ruleDotNavigationObjSX returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleDotNavigationObjSX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1869:28: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1870:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1870:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1870:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleDotNavigationObjSX3972); 

                	newLeafNode(otherlv_0, grammarAccess.getDotNavigationObjSXAccess().getNumberSignKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1874:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1875:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1875:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1876:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDotNavigationObjSXRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDotNavigationObjSX3992); 

            		newLeafNode(otherlv_1, grammarAccess.getDotNavigationObjSXAccess().getObjEObjectCrossReference_1_0()); 
            	

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1887:2: (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==52) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1887:4: otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleDotNavigationObjSX4005); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDotNavigationObjSXAccess().getFullStopKeyword_2_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1891:1: ( (otherlv_3= RULE_ID ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1892:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1892:1: (otherlv_3= RULE_ID )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1893:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDotNavigationObjSXRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDotNavigationObjSX4025); 

            	    		newLeafNode(otherlv_3, grammarAccess.getDotNavigationObjSXAccess().getRefEStructuralFeatureCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotNavigationObjSX"


    // $ANTLR start "entryRuleDotNavigationObjDX"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1912:1: entryRuleDotNavigationObjDX returns [EObject current=null] : iv_ruleDotNavigationObjDX= ruleDotNavigationObjDX EOF ;
    public final EObject entryRuleDotNavigationObjDX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotNavigationObjDX = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1913:2: (iv_ruleDotNavigationObjDX= ruleDotNavigationObjDX EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1914:2: iv_ruleDotNavigationObjDX= ruleDotNavigationObjDX EOF
            {
             newCompositeNode(grammarAccess.getDotNavigationObjDXRule()); 
            pushFollow(FOLLOW_ruleDotNavigationObjDX_in_entryRuleDotNavigationObjDX4063);
            iv_ruleDotNavigationObjDX=ruleDotNavigationObjDX();

            state._fsp--;

             current =iv_ruleDotNavigationObjDX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDotNavigationObjDX4073); 

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
    // $ANTLR end "entryRuleDotNavigationObjDX"


    // $ANTLR start "ruleDotNavigationObjDX"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1921:1: ruleDotNavigationObjDX returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleDotNavigationObjDX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1924:28: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1925:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1925:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1925:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleDotNavigationObjDX4110); 

                	newLeafNode(otherlv_0, grammarAccess.getDotNavigationObjDXAccess().getNumberSignKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1929:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1930:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1930:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1931:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDotNavigationObjDXRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDotNavigationObjDX4130); 

            		newLeafNode(otherlv_1, grammarAccess.getDotNavigationObjDXAccess().getObjEObjectCrossReference_1_0()); 
            	

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1942:2: (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==52) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1942:4: otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleDotNavigationObjDX4143); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDotNavigationObjDXAccess().getFullStopKeyword_2_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1946:1: ( (otherlv_3= RULE_ID ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1947:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1947:1: (otherlv_3= RULE_ID )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1948:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDotNavigationObjDXRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDotNavigationObjDX4163); 

            	    		newLeafNode(otherlv_3, grammarAccess.getDotNavigationObjDXAccess().getRefEStructuralFeatureCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotNavigationObjDX"


    // $ANTLR start "entryRuleParameter"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1967:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1968:2: (iv_ruleParameter= ruleParameter EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1969:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4201);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4211); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1976:1: ruleParameter returns [EObject current=null] : (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1979:28: ( (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1980:1: (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1980:1: (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1980:3: otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleParameter4248); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getPercentSignKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1984:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1985:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1985:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1986:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter4265); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
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

             leaveRule(); 
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


    // $ANTLR start "entryRulePackage"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2010:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2011:2: (iv_rulePackage= rulePackage EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2012:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage4306);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage4316); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2019:1: rulePackage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2022:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2023:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2023:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2023:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2023:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2024:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPackageAccess().getPackageAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2029:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2030:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2030:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2031:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage4367); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

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

             leaveRule(); 
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


    // $ANTLR start "entryRuleClass"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2055:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2056:2: (iv_ruleClass= ruleClass EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2057:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass4408);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass4418); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2064:1: ruleClass returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2067:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2068:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2068:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2068:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2068:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2069:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClassAccess().getClassAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2074:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2075:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2075:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2076:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass4469); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

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

             leaveRule(); 
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


    // $ANTLR start "entryRuleAttribute"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2100:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2101:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2102:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4510);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4520); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2109:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2112:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2113:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2113:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2113:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2113:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2114:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeAccess().getAttributeAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2119:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2120:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2120:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2121:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute4571); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

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

             leaveRule(); 
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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2145:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2146:2: (iv_ruleReference= ruleReference EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2147:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference4612);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference4622); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2154:1: ruleReference returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2157:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2158:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2158:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2158:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2158:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2159:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferenceAccess().getReferenceAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2164:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2165:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2165:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2166:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference4673); 

            			newLeafNode(lv_name_1_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

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

             leaveRule(); 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMyModel_in_entryRuleMyModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationLibrary_in_ruleMyModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationProgram_in_ruleMyModel158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationLibrary_in_entryRuleMigrationLibrary194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationLibrary204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMigrationLibrary241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationLibrary258 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMigrationLibrary275 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleMigrationLibrary296 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_13_in_ruleMigrationLibrary309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationProgram_in_entryRuleMigrationProgram347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationProgram357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMigrationProgram394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationProgram411 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMigrationProgram428 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleMigrationProgram441 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMigrationProgram458 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMigrationProgram475 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleMigrationProgram495 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleArtifact_in_ruleMigrationProgram529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMigrationProgram546 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMigrationProgram563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationProgram584 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationProgram597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationProgram617 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMigrationProgram631 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMigrationProgram648 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMigrationProgram665 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleMigrationProgram686 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_13_in_ruleMigrationProgram699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifact745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleArtifact789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleArtifact818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleArtifact847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRule945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule962 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRule979 = new BitSet(new long[]{0x0000088808000000L});
    public static final BitSet FOLLOW_ruleOpDef_in_ruleRule1000 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRule1012 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRule1024 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleRewritingRule_in_ruleRule1045 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleRule1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpDef_in_entryRuleOpDef1094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpDef1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageOpDef_in_ruleOpDef1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_ruleOpDef1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_ruleOpDef1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_ruleOpDef1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageOpDef_in_entryRuleEPackageOpDef1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPackageOpDef1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEPackageOpDef1315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackage_in_ruleEPackageOpDef1336 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEPackageOpDef1348 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_29_in_ruleEPackageOpDef1369 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30_in_ruleEPackageOpDef1406 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31_in_ruleEPackageOpDef1443 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEPackageOpDef1469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackage_in_ruleEPackageOpDef1490 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEPackageOpDef1502 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEPackageOpDef1514 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEPackageOpDef1526 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEPackageOpDef1538 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEPackageOpDef1550 = new BitSet(new long[]{0x0000800800002000L});
    public static final BitSet FOLLOW_rulesetterDef_in_ruleEPackageOpDef1572 = new BitSet(new long[]{0x0000800800002000L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_ruleEPackageOpDef1599 = new BitSet(new long[]{0x0000800800002000L});
    public static final BitSet FOLLOW_13_in_ruleEPackageOpDef1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_entryRuleEClassOpDef1650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEClassOpDef1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEClassOpDef1698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleEClassOpDef1719 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEClassOpDef1731 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_36_in_ruleEClassOpDef1752 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_37_in_ruleEClassOpDef1789 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_38_in_ruleEClassOpDef1826 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEClassOpDef1852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleEClassOpDef1873 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEClassOpDef1885 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleEClassOpDef1897 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEClassOpDef1909 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEClassOpDef1921 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEClassOpDef1934 = new BitSet(new long[]{0x0000888808002000L});
    public static final BitSet FOLLOW_rulesetterDef_in_ruleEClassOpDef1956 = new BitSet(new long[]{0x0000888808002000L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_ruleEClassOpDef1983 = new BitSet(new long[]{0x0000888808002000L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_ruleEClassOpDef2010 = new BitSet(new long[]{0x0000888808002000L});
    public static final BitSet FOLLOW_13_in_ruleEClassOpDef2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_entryRuleEAttributeOpDef2062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEAttributeOpDef2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEAttributeOpDef2110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEAttributeOpDef2131 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEAttributeOpDef2143 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_40_in_ruleEAttributeOpDef2165 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_41_in_ruleEAttributeOpDef2202 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_42_in_ruleEAttributeOpDef2239 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEAttributeOpDef2265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEAttributeOpDef2286 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEAttributeOpDef2298 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEAttributeOpDef2310 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEAttributeOpDef2323 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEAttributeOpDef2335 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleEAttributeOpDef2349 = new BitSet(new long[]{0x0000800000002000L});
    public static final BitSet FOLLOW_rulesetterDef_in_ruleEAttributeOpDef2370 = new BitSet(new long[]{0x0000800000002000L});
    public static final BitSet FOLLOW_13_in_ruleEAttributeOpDef2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEAttributeOpDef2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_entryRuleEReferenceOpDef2440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEReferenceOpDef2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEReferenceOpDef2488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReference_in_ruleEReferenceOpDef2509 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEReferenceOpDef2521 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_44_in_ruleEReferenceOpDef2543 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_45_in_ruleEReferenceOpDef2580 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_46_in_ruleEReferenceOpDef2617 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEReferenceOpDef2643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReference_in_ruleEReferenceOpDef2664 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEReferenceOpDef2676 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEReferenceOpDef2688 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEReferenceOpDef2701 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEReferenceOpDef2713 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEReferenceOpDef2726 = new BitSet(new long[]{0x0000800000002000L});
    public static final BitSet FOLLOW_rulesetterDef_in_ruleEReferenceOpDef2747 = new BitSet(new long[]{0x0000800000002000L});
    public static final BitSet FOLLOW_13_in_ruleEReferenceOpDef2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetterDef_in_entryRulesetterDef2798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesetterDef2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulesetterDef2845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesetterDef2865 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulesetterDef2883 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_rulesetterDef2917 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_rulesetterDef2930 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_rulesetterDef2951 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_rulesetterDef2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewritingRule_in_entryRuleRewritingRule3001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRewritingRule3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_ruleRewritingRule3058 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleRewritingRule3070 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_ruleRewritingRule3091 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRewritingRule3105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_ruleRewritingRule3126 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleRewritingRule3138 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_ruleRewritingRule3159 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleMigrator_in_entryRuleMigrator3197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrator3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_ruleMigrator3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_ruleMigrator3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_entryRuleMigratorSX3316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigratorSX3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorSX3377 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMigratorSX3394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorSX3414 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMigratorSX3426 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMigratorSX3438 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorSX3459 = new BitSet(new long[]{0x0002000004000000L});
    public static final BitSet FOLLOW_49_in_ruleMigratorSX3472 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorSX3493 = new BitSet(new long[]{0x0002000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMigratorSX3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_entryRuleMigratorDX3543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigratorDX3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorDX3606 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMigratorDX3623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorDX3643 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMigratorDX3655 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorDX3676 = new BitSet(new long[]{0x0002000004000000L});
    public static final BitSet FOLLOW_49_in_ruleMigratorDX3689 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorDX3710 = new BitSet(new long[]{0x0002000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMigratorDX3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleMigratorDX3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_entryRuleFilterMigrator3780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterMigrator3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjSX_in_ruleFilterMigrator3836 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFilterMigrator3854 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjDX_in_ruleFilterMigrator3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjSX_in_entryRuleDotNavigationObjSX3925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDotNavigationObjSX3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDotNavigationObjSX3972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDotNavigationObjSX3992 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDotNavigationObjSX4005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDotNavigationObjSX4025 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjDX_in_entryRuleDotNavigationObjDX4063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDotNavigationObjDX4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDotNavigationObjDX4110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDotNavigationObjDX4130 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDotNavigationObjDX4143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDotNavigationObjDX4163 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleParameter4248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage4306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass4408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference4612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference4673 = new BitSet(new long[]{0x0000000000000002L});

}