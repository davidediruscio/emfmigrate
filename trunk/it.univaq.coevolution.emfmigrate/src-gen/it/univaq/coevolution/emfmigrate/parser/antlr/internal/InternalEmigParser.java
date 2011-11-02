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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Library'", "'{'", "'}'", "'include'", "';'", "'migrate'", "':'", "','", "'with'", "'transformation'", "'model'", "'tcs-model'", "'rule'", "'['", "']'", "'package'", "'='", "'changePackage'", "'addPackage'", "'deletePackage'", "'('", "')'", "'where'", "'class'", "'changeClass'", "'addClass'", "'deleteClass'", "'attribute'", "'changeEAttribute'", "'addEAttribute'", "'deleteEAttribute'", "'reference'", "'changeEReference'", "'addEReference'", "'deleteEReference'", "'set'", "'->'", "'&'", "'null'", "'#'", "'.'", "'%'"
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
            else if ( (LA1_0==14||LA1_0==16) ) {
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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:134:1: ruleMigrationLibrary returns [EObject current=null] : (otherlv_0= 'Library' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' ) ;
    public final EObject ruleMigrationLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rules_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:137:28: ( (otherlv_0= 'Library' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:138:1: (otherlv_0= 'Library' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:138:1: (otherlv_0= 'Library' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:138:3: otherlv_0= 'Library' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMigrationLibrary241); 

                	newLeafNode(otherlv_0, grammarAccess.getMigrationLibraryAccess().getLibraryKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:142:1: ( (lv_title_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:143:1: (lv_title_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:143:1: (lv_title_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:144:3: lv_title_1_0= RULE_ID
            {
            lv_title_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationLibrary258); 

            			newLeafNode(lv_title_1_0, grammarAccess.getMigrationLibraryAccess().getTitleIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationLibraryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
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

                if ( (LA2_0==23) ) {
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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:194:1: entryRuleMigrationProgram returns [EObject current=null] : iv_ruleMigrationProgram= ruleMigrationProgram EOF ;
    public final EObject entryRuleMigrationProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationProgram = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:195:2: (iv_ruleMigrationProgram= ruleMigrationProgram EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:196:2: iv_ruleMigrationProgram= ruleMigrationProgram EOF
            {
             newCompositeNode(grammarAccess.getMigrationProgramRule()); 
            pushFollow(FOLLOW_ruleMigrationProgram_in_entryRuleMigrationProgram345);
            iv_ruleMigrationProgram=ruleMigrationProgram();

            state._fsp--;

             current =iv_ruleMigrationProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationProgram355); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:203:1: ruleMigrationProgram returns [EObject current=null] : ( (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) ( (lv_typeArt_4_0= ruleArtifact ) ) ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}' ) ;
    public final EObject ruleMigrationProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_libs_1_0=null;
        Token otherlv_2=null;
        Token lv_migr_3_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_delta_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_typeArt_4_0 = null;

        EObject lv_rules_13_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:206:28: ( ( (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) ( (lv_typeArt_4_0= ruleArtifact ) ) ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:207:1: ( (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) ( (lv_typeArt_4_0= ruleArtifact ) ) ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:207:1: ( (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) ( (lv_typeArt_4_0= ruleArtifact ) ) ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:207:2: (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) ( (lv_typeArt_4_0= ruleArtifact ) ) ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:207:2: (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:207:4: otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';'
            	    {
            	    otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleMigrationProgram393); 

            	        	newLeafNode(otherlv_0, grammarAccess.getMigrationProgramAccess().getIncludeKeyword_0_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:211:1: ( (lv_libs_1_0= RULE_STRING ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:212:1: (lv_libs_1_0= RULE_STRING )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:212:1: (lv_libs_1_0= RULE_STRING )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:213:3: lv_libs_1_0= RULE_STRING
            	    {
            	    lv_libs_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMigrationProgram410); 

            	    			newLeafNode(lv_libs_1_0, grammarAccess.getMigrationProgramAccess().getLibsSTRINGTerminalRuleCall_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"libs",
            	            		lv_libs_1_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMigrationProgram427); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMigrationProgramAccess().getSemicolonKeyword_0_2());
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:233:3: ( (lv_migr_3_0= 'migrate' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:234:1: (lv_migr_3_0= 'migrate' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:234:1: (lv_migr_3_0= 'migrate' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:235:3: lv_migr_3_0= 'migrate'
            {
            lv_migr_3_0=(Token)match(input,16,FOLLOW_16_in_ruleMigrationProgram447); 

                    newLeafNode(lv_migr_3_0, grammarAccess.getMigrationProgramAccess().getMigrMigrateKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                   		setWithLastConsumed(current, "migr", lv_migr_3_0, "migrate");
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:248:2: ( (lv_typeArt_4_0= ruleArtifact ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:249:1: (lv_typeArt_4_0= ruleArtifact )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:249:1: (lv_typeArt_4_0= ruleArtifact )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:250:3: lv_typeArt_4_0= ruleArtifact
            {
             
            	        newCompositeNode(grammarAccess.getMigrationProgramAccess().getTypeArtArtifactParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArtifact_in_ruleMigrationProgram481);
            lv_typeArt_4_0=ruleArtifact();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMigrationProgramRule());
            	        }
                   		set(
                   			current, 
                   			"typeArt",
                    		lv_typeArt_4_0, 
                    		"Artifact");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:266:2: ( (lv_name_5_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:267:1: (lv_name_5_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:267:1: (lv_name_5_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:268:3: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMigrationProgram498); 

            			newLeafNode(lv_name_5_0, grammarAccess.getMigrationProgramAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleMigrationProgram515); 

                	newLeafNode(otherlv_6, grammarAccess.getMigrationProgramAccess().getColonKeyword_4());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:288:1: ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:288:2: ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:288:2: ( (otherlv_7= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:289:1: (otherlv_7= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:289:1: (otherlv_7= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:290:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationProgram536); 

            		newLeafNode(otherlv_7, grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_5_0_0()); 
            	

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:301:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:301:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            {
            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleMigrationProgram549); 

                	newLeafNode(otherlv_8, grammarAccess.getMigrationProgramAccess().getCommaKeyword_5_1_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:305:1: ( (otherlv_9= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:306:1: (otherlv_9= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:306:1: (otherlv_9= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:307:3: otherlv_9= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationProgram569); 

            		newLeafNode(otherlv_9, grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_5_1_1_0()); 
            	

            }


            }


            }


            }

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleMigrationProgram583); 

                	newLeafNode(otherlv_10, grammarAccess.getMigrationProgramAccess().getWithKeyword_6());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:322:1: ( (lv_delta_11_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:323:1: (lv_delta_11_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:323:1: (lv_delta_11_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:324:3: lv_delta_11_0= RULE_STRING
            {
            lv_delta_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMigrationProgram600); 

            			newLeafNode(lv_delta_11_0, grammarAccess.getMigrationProgramAccess().getDeltaSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"delta",
                    		lv_delta_11_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleMigrationProgram617); 

                	newLeafNode(otherlv_12, grammarAccess.getMigrationProgramAccess().getLeftCurlyBracketKeyword_8());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:344:1: ( (lv_rules_13_0= ruleRule ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:345:1: (lv_rules_13_0= ruleRule )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:345:1: (lv_rules_13_0= ruleRule )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:346:3: lv_rules_13_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMigrationProgramAccess().getRulesRuleParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleMigrationProgram638);
            	    lv_rules_13_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMigrationProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_13_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleMigrationProgram651); 

                	newLeafNode(otherlv_14, grammarAccess.getMigrationProgramAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:374:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:375:2: (iv_ruleArtifact= ruleArtifact EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:376:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_ruleArtifact_in_entryRuleArtifact687);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifact697); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:383:1: ruleArtifact returns [EObject current=null] : ( ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) ) ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:386:28: ( ( ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:387:1: ( ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:387:1: ( ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:388:1: ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:388:1: ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:389:1: (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:389:1: (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:390:3: lv_type_0_1= 'transformation'
                    {
                    lv_type_0_1=(Token)match(input,20,FOLLOW_20_in_ruleArtifact741); 

                            newLeafNode(lv_type_0_1, grammarAccess.getArtifactAccess().getTypeTransformationKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArtifactRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:402:8: lv_type_0_2= 'model'
                    {
                    lv_type_0_2=(Token)match(input,21,FOLLOW_21_in_ruleArtifact770); 

                            newLeafNode(lv_type_0_2, grammarAccess.getArtifactAccess().getTypeModelKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArtifactRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:414:8: lv_type_0_3= 'tcs-model'
                    {
                    lv_type_0_3=(Token)match(input,22,FOLLOW_22_in_ruleArtifact799); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:437:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:438:2: (iv_ruleRule= ruleRule EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:439:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule850);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule860); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:446:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:449:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:450:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:450:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:450:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleRule897); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:454:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:455:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:455:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:456:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule914); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleRule931); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:476:1: ( (lv_filter_3_0= ruleOpDef ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:477:1: (lv_filter_3_0= ruleOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:477:1: (lv_filter_3_0= ruleOpDef )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:478:3: lv_filter_3_0= ruleOpDef
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getFilterOpDefParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleOpDef_in_ruleRule952);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleRule964); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getRightSquareBracketKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRule976); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_5());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:502:1: ( (lv_rewritingRules_6_0= ruleRewritingRule ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:503:1: (lv_rewritingRules_6_0= ruleRewritingRule )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:503:1: (lv_rewritingRules_6_0= ruleRewritingRule )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:504:3: lv_rewritingRules_6_0= ruleRewritingRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getRewritingRulesRewritingRuleParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRewritingRule_in_ruleRule997);
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

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleRule1010); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:532:1: entryRuleOpDef returns [EObject current=null] : iv_ruleOpDef= ruleOpDef EOF ;
    public final EObject entryRuleOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:533:2: (iv_ruleOpDef= ruleOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:534:2: iv_ruleOpDef= ruleOpDef EOF
            {
             newCompositeNode(grammarAccess.getOpDefRule()); 
            pushFollow(FOLLOW_ruleOpDef_in_entryRuleOpDef1046);
            iv_ruleOpDef=ruleOpDef();

            state._fsp--;

             current =iv_ruleOpDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpDef1056); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:541:1: ruleOpDef returns [EObject current=null] : (this_EPackageOpDef_0= ruleEPackageOpDef | this_EClassOpDef_1= ruleEClassOpDef | this_EAttributeOpDef_2= ruleEAttributeOpDef | this_EReferenceOpDef_3= ruleEReferenceOpDef ) ;
    public final EObject ruleOpDef() throws RecognitionException {
        EObject current = null;

        EObject this_EPackageOpDef_0 = null;

        EObject this_EClassOpDef_1 = null;

        EObject this_EAttributeOpDef_2 = null;

        EObject this_EReferenceOpDef_3 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:544:28: ( (this_EPackageOpDef_0= ruleEPackageOpDef | this_EClassOpDef_1= ruleEClassOpDef | this_EAttributeOpDef_2= ruleEAttributeOpDef | this_EReferenceOpDef_3= ruleEReferenceOpDef ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:545:1: (this_EPackageOpDef_0= ruleEPackageOpDef | this_EClassOpDef_1= ruleEClassOpDef | this_EAttributeOpDef_2= ruleEAttributeOpDef | this_EReferenceOpDef_3= ruleEReferenceOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:545:1: (this_EPackageOpDef_0= ruleEPackageOpDef | this_EClassOpDef_1= ruleEClassOpDef | this_EAttributeOpDef_2= ruleEAttributeOpDef | this_EReferenceOpDef_3= ruleEReferenceOpDef )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 38:
                {
                alt7=3;
                }
                break;
            case 42:
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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:546:5: this_EPackageOpDef_0= ruleEPackageOpDef
                    {
                     
                            newCompositeNode(grammarAccess.getOpDefAccess().getEPackageOpDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEPackageOpDef_in_ruleOpDef1103);
                    this_EPackageOpDef_0=ruleEPackageOpDef();

                    state._fsp--;

                     
                            current = this_EPackageOpDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:556:5: this_EClassOpDef_1= ruleEClassOpDef
                    {
                     
                            newCompositeNode(grammarAccess.getOpDefAccess().getEClassOpDefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEClassOpDef_in_ruleOpDef1130);
                    this_EClassOpDef_1=ruleEClassOpDef();

                    state._fsp--;

                     
                            current = this_EClassOpDef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:566:5: this_EAttributeOpDef_2= ruleEAttributeOpDef
                    {
                     
                            newCompositeNode(grammarAccess.getOpDefAccess().getEAttributeOpDefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEAttributeOpDef_in_ruleOpDef1157);
                    this_EAttributeOpDef_2=ruleEAttributeOpDef();

                    state._fsp--;

                     
                            current = this_EAttributeOpDef_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:576:5: this_EReferenceOpDef_3= ruleEReferenceOpDef
                    {
                     
                            newCompositeNode(grammarAccess.getOpDefAccess().getEReferenceOpDefParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEReferenceOpDef_in_ruleOpDef1184);
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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:592:1: entryRuleEPackageOpDef returns [EObject current=null] : iv_ruleEPackageOpDef= ruleEPackageOpDef EOF ;
    public final EObject entryRuleEPackageOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackageOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:593:2: (iv_ruleEPackageOpDef= ruleEPackageOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:594:2: iv_ruleEPackageOpDef= ruleEPackageOpDef EOF
            {
             newCompositeNode(grammarAccess.getEPackageOpDefRule()); 
            pushFollow(FOLLOW_ruleEPackageOpDef_in_entryRuleEPackageOpDef1219);
            iv_ruleEPackageOpDef=ruleEPackageOpDef();

            state._fsp--;

             current =iv_ruleEPackageOpDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPackageOpDef1229); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:601:1: ruleEPackageOpDef returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' ) ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:604:28: ( ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:605:1: ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:605:1: ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:605:2: (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:605:2: (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:605:4: otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleEPackageOpDef1267); 

                	newLeafNode(otherlv_0, grammarAccess.getEPackageOpDefAccess().getPackageKeyword_0_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:609:1: ( (lv_var_1_0= rulePackage ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:610:1: (lv_var_1_0= rulePackage )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:610:1: (lv_var_1_0= rulePackage )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:611:3: lv_var_1_0= rulePackage
            {
             
            	        newCompositeNode(grammarAccess.getEPackageOpDefAccess().getVarPackageParserRuleCall_0_1_0()); 
            	    
            pushFollow(FOLLOW_rulePackage_in_ruleEPackageOpDef1288);
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEPackageOpDef1300); 

                	newLeafNode(otherlv_2, grammarAccess.getEPackageOpDefAccess().getEqualsSignKeyword_0_2());
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:631:2: ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:631:3: ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:631:3: ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 30:
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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:631:4: ( (lv_op_3_0= 'changePackage' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:631:4: ( (lv_op_3_0= 'changePackage' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:632:1: (lv_op_3_0= 'changePackage' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:632:1: (lv_op_3_0= 'changePackage' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:633:3: lv_op_3_0= 'changePackage'
                    {
                    lv_op_3_0=(Token)match(input,28,FOLLOW_28_in_ruleEPackageOpDef1321); 

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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:647:6: ( (lv_op_4_0= 'addPackage' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:647:6: ( (lv_op_4_0= 'addPackage' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:648:1: (lv_op_4_0= 'addPackage' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:648:1: (lv_op_4_0= 'addPackage' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:649:3: lv_op_4_0= 'addPackage'
                    {
                    lv_op_4_0=(Token)match(input,29,FOLLOW_29_in_ruleEPackageOpDef1358); 

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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:663:6: ( (lv_op_5_0= 'deletePackage' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:663:6: ( (lv_op_5_0= 'deletePackage' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:664:1: (lv_op_5_0= 'deletePackage' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:664:1: (lv_op_5_0= 'deletePackage' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:665:3: lv_op_5_0= 'deletePackage'
                    {
                    lv_op_5_0=(Token)match(input,30,FOLLOW_30_in_ruleEPackageOpDef1395); 

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

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleEPackageOpDef1421); 

                	newLeafNode(otherlv_6, grammarAccess.getEPackageOpDefAccess().getLeftParenthesisKeyword_1_1());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:682:1: ( (lv_ref_7_0= rulePackage ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:683:1: (lv_ref_7_0= rulePackage )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:683:1: (lv_ref_7_0= rulePackage )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:684:3: lv_ref_7_0= rulePackage
            {
             
            	        newCompositeNode(grammarAccess.getEPackageOpDefAccess().getRefPackageParserRuleCall_1_2_0()); 
            	    
            pushFollow(FOLLOW_rulePackage_in_ruleEPackageOpDef1442);
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

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEPackageOpDef1454); 

                	newLeafNode(otherlv_8, grammarAccess.getEPackageOpDefAccess().getColonKeyword_1_3());
                
            otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleEPackageOpDef1466); 

                	newLeafNode(otherlv_9, grammarAccess.getEPackageOpDefAccess().getPackageKeyword_1_4());
                
            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleEPackageOpDef1478); 

                	newLeafNode(otherlv_10, grammarAccess.getEPackageOpDefAccess().getRightParenthesisKeyword_1_5());
                
            otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleEPackageOpDef1490); 

                	newLeafNode(otherlv_11, grammarAccess.getEPackageOpDefAccess().getWhereKeyword_1_6());
                
            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleEPackageOpDef1502); 

                	newLeafNode(otherlv_12, grammarAccess.getEPackageOpDefAccess().getLeftCurlyBracketKeyword_1_7());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:720:1: ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==46) ) {
                    alt9=1;
                }
                else if ( (LA9_0==34) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:720:2: ( (lv_setters_13_0= rulesetterDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:720:2: ( (lv_setters_13_0= rulesetterDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:721:1: (lv_setters_13_0= rulesetterDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:721:1: (lv_setters_13_0= rulesetterDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:722:3: lv_setters_13_0= rulesetterDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEPackageOpDefAccess().getSettersSetterDefParserRuleCall_1_8_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesetterDef_in_ruleEPackageOpDef1524);
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
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:739:6: ( (lv_classes_14_0= ruleEClassOpDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:739:6: ( (lv_classes_14_0= ruleEClassOpDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:740:1: (lv_classes_14_0= ruleEClassOpDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:740:1: (lv_classes_14_0= ruleEClassOpDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:741:3: lv_classes_14_0= ruleEClassOpDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEPackageOpDefAccess().getClassesEClassOpDefParserRuleCall_1_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEClassOpDef_in_ruleEPackageOpDef1551);
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

            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleEPackageOpDef1565); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:769:1: entryRuleEClassOpDef returns [EObject current=null] : iv_ruleEClassOpDef= ruleEClassOpDef EOF ;
    public final EObject entryRuleEClassOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClassOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:770:2: (iv_ruleEClassOpDef= ruleEClassOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:771:2: iv_ruleEClassOpDef= ruleEClassOpDef EOF
            {
             newCompositeNode(grammarAccess.getEClassOpDefRule()); 
            pushFollow(FOLLOW_ruleEClassOpDef_in_entryRuleEClassOpDef1602);
            iv_ruleEClassOpDef=ruleEClassOpDef();

            state._fsp--;

             current =iv_ruleEClassOpDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEClassOpDef1612); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:778:1: ruleEClassOpDef returns [EObject current=null] : ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) ) ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:781:28: ( ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:782:1: ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:782:1: ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:782:2: (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:782:2: (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:782:4: otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleEClassOpDef1650); 

                	newLeafNode(otherlv_0, grammarAccess.getEClassOpDefAccess().getClassKeyword_0_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:786:1: ( (lv_var_1_0= ruleClass ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:787:1: (lv_var_1_0= ruleClass )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:787:1: (lv_var_1_0= ruleClass )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:788:3: lv_var_1_0= ruleClass
            {
             
            	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getVarClassParserRuleCall_0_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClass_in_ruleEClassOpDef1671);
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEClassOpDef1683); 

                	newLeafNode(otherlv_2, grammarAccess.getEClassOpDefAccess().getEqualsSignKeyword_0_2());
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:808:2: ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:808:3: ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:808:3: ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt10=1;
                }
                break;
            case 36:
                {
                alt10=2;
                }
                break;
            case 37:
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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:808:4: ( (lv_op_3_0= 'changeClass' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:808:4: ( (lv_op_3_0= 'changeClass' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:809:1: (lv_op_3_0= 'changeClass' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:809:1: (lv_op_3_0= 'changeClass' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:810:3: lv_op_3_0= 'changeClass'
                    {
                    lv_op_3_0=(Token)match(input,35,FOLLOW_35_in_ruleEClassOpDef1704); 

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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:824:6: ( (lv_op_4_0= 'addClass' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:824:6: ( (lv_op_4_0= 'addClass' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:825:1: (lv_op_4_0= 'addClass' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:825:1: (lv_op_4_0= 'addClass' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:826:3: lv_op_4_0= 'addClass'
                    {
                    lv_op_4_0=(Token)match(input,36,FOLLOW_36_in_ruleEClassOpDef1741); 

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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:840:6: ( (lv_op_5_0= 'deleteClass' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:840:6: ( (lv_op_5_0= 'deleteClass' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:841:1: (lv_op_5_0= 'deleteClass' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:841:1: (lv_op_5_0= 'deleteClass' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:842:3: lv_op_5_0= 'deleteClass'
                    {
                    lv_op_5_0=(Token)match(input,37,FOLLOW_37_in_ruleEClassOpDef1778); 

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

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleEClassOpDef1804); 

                	newLeafNode(otherlv_6, grammarAccess.getEClassOpDefAccess().getLeftParenthesisKeyword_1_1());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:859:1: ( (lv_ref_7_0= ruleClass ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:860:1: (lv_ref_7_0= ruleClass )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:860:1: (lv_ref_7_0= ruleClass )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:861:3: lv_ref_7_0= ruleClass
            {
             
            	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getRefClassParserRuleCall_1_2_0()); 
            	    
            pushFollow(FOLLOW_ruleClass_in_ruleEClassOpDef1825);
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

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEClassOpDef1837); 

                	newLeafNode(otherlv_8, grammarAccess.getEClassOpDefAccess().getColonKeyword_1_3());
                
            otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleEClassOpDef1849); 

                	newLeafNode(otherlv_9, grammarAccess.getEClassOpDefAccess().getClassKeyword_1_4());
                
            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleEClassOpDef1861); 

                	newLeafNode(otherlv_10, grammarAccess.getEClassOpDefAccess().getRightParenthesisKeyword_1_5());
                
            otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleEClassOpDef1873); 

                	newLeafNode(otherlv_11, grammarAccess.getEClassOpDefAccess().getWhereKeyword_1_6());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:893:1: (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:893:3: otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}'
            {
            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleEClassOpDef1886); 

                	newLeafNode(otherlv_12, grammarAccess.getEClassOpDefAccess().getLeftCurlyBracketKeyword_1_7_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:897:1: ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )*
            loop11:
            do {
                int alt11=4;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    alt11=1;
                    }
                    break;
                case 38:
                    {
                    alt11=2;
                    }
                    break;
                case 42:
                    {
                    alt11=3;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:897:2: ( (lv_setters_13_0= rulesetterDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:897:2: ( (lv_setters_13_0= rulesetterDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:898:1: (lv_setters_13_0= rulesetterDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:898:1: (lv_setters_13_0= rulesetterDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:899:3: lv_setters_13_0= rulesetterDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getSettersSetterDefParserRuleCall_1_7_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesetterDef_in_ruleEClassOpDef1908);
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
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:916:6: ( (lv_attributes_14_0= ruleEAttributeOpDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:916:6: ( (lv_attributes_14_0= ruleEAttributeOpDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:917:1: (lv_attributes_14_0= ruleEAttributeOpDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:917:1: (lv_attributes_14_0= ruleEAttributeOpDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:918:3: lv_attributes_14_0= ruleEAttributeOpDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getAttributesEAttributeOpDefParserRuleCall_1_7_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEAttributeOpDef_in_ruleEClassOpDef1935);
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
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:935:6: ( (lv_references_15_0= ruleEReferenceOpDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:935:6: ( (lv_references_15_0= ruleEReferenceOpDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:936:1: (lv_references_15_0= ruleEReferenceOpDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:936:1: (lv_references_15_0= ruleEReferenceOpDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:937:3: lv_references_15_0= ruleEReferenceOpDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getReferencesEReferenceOpDefParserRuleCall_1_7_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEReferenceOpDef_in_ruleEClassOpDef1962);
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

            otherlv_16=(Token)match(input,13,FOLLOW_13_in_ruleEClassOpDef1976); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:965:1: entryRuleEAttributeOpDef returns [EObject current=null] : iv_ruleEAttributeOpDef= ruleEAttributeOpDef EOF ;
    public final EObject entryRuleEAttributeOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:966:2: (iv_ruleEAttributeOpDef= ruleEAttributeOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:967:2: iv_ruleEAttributeOpDef= ruleEAttributeOpDef EOF
            {
             newCompositeNode(grammarAccess.getEAttributeOpDefRule()); 
            pushFollow(FOLLOW_ruleEAttributeOpDef_in_entryRuleEAttributeOpDef2014);
            iv_ruleEAttributeOpDef=ruleEAttributeOpDef();

            state._fsp--;

             current =iv_ruleEAttributeOpDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEAttributeOpDef2024); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:974:1: ruleEAttributeOpDef returns [EObject current=null] : ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) ) ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:977:28: ( ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:978:1: ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:978:1: ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:978:2: (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:978:2: (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:978:4: otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleEAttributeOpDef2062); 

                	newLeafNode(otherlv_0, grammarAccess.getEAttributeOpDefAccess().getAttributeKeyword_0_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:982:1: ( (lv_var_1_0= ruleAttribute ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:983:1: (lv_var_1_0= ruleAttribute )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:983:1: (lv_var_1_0= ruleAttribute )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:984:3: lv_var_1_0= ruleAttribute
            {
             
            	        newCompositeNode(grammarAccess.getEAttributeOpDefAccess().getVarAttributeParserRuleCall_0_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttribute_in_ruleEAttributeOpDef2083);
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEAttributeOpDef2095); 

                	newLeafNode(otherlv_2, grammarAccess.getEAttributeOpDefAccess().getEqualsSignKeyword_0_2());
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1004:2: ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1004:3: ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1004:3: ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1004:4: ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1004:4: ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt12=1;
                }
                break;
            case 40:
                {
                alt12=2;
                }
                break;
            case 41:
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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1004:5: ( (lv_op_3_0= 'changeEAttribute' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1004:5: ( (lv_op_3_0= 'changeEAttribute' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1005:1: (lv_op_3_0= 'changeEAttribute' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1005:1: (lv_op_3_0= 'changeEAttribute' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1006:3: lv_op_3_0= 'changeEAttribute'
                    {
                    lv_op_3_0=(Token)match(input,39,FOLLOW_39_in_ruleEAttributeOpDef2117); 

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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1020:6: ( (lv_op_4_0= 'addEAttribute' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1020:6: ( (lv_op_4_0= 'addEAttribute' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1021:1: (lv_op_4_0= 'addEAttribute' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1021:1: (lv_op_4_0= 'addEAttribute' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1022:3: lv_op_4_0= 'addEAttribute'
                    {
                    lv_op_4_0=(Token)match(input,40,FOLLOW_40_in_ruleEAttributeOpDef2154); 

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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1036:6: ( (lv_op_5_0= 'deleteEAttribute' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1036:6: ( (lv_op_5_0= 'deleteEAttribute' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1037:1: (lv_op_5_0= 'deleteEAttribute' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1037:1: (lv_op_5_0= 'deleteEAttribute' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1038:3: lv_op_5_0= 'deleteEAttribute'
                    {
                    lv_op_5_0=(Token)match(input,41,FOLLOW_41_in_ruleEAttributeOpDef2191); 

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

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleEAttributeOpDef2217); 

                	newLeafNode(otherlv_6, grammarAccess.getEAttributeOpDefAccess().getLeftParenthesisKeyword_1_0_1());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1055:1: ( (lv_ref_7_0= ruleAttribute ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1056:1: (lv_ref_7_0= ruleAttribute )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1056:1: (lv_ref_7_0= ruleAttribute )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1057:3: lv_ref_7_0= ruleAttribute
            {
             
            	        newCompositeNode(grammarAccess.getEAttributeOpDefAccess().getRefAttributeParserRuleCall_1_0_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttribute_in_ruleEAttributeOpDef2238);
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

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEAttributeOpDef2250); 

                	newLeafNode(otherlv_8, grammarAccess.getEAttributeOpDefAccess().getColonKeyword_1_0_3());
                
            otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleEAttributeOpDef2262); 

                	newLeafNode(otherlv_9, grammarAccess.getEAttributeOpDefAccess().getAttributeKeyword_1_0_4());
                

            }

            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleEAttributeOpDef2275); 

                	newLeafNode(otherlv_10, grammarAccess.getEAttributeOpDefAccess().getRightParenthesisKeyword_1_1());
                
            otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleEAttributeOpDef2287); 

                	newLeafNode(otherlv_11, grammarAccess.getEAttributeOpDefAccess().getWhereKeyword_1_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1089:1: ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' )
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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1089:2: (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1089:2: (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1089:4: otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleEAttributeOpDef2301); 

                        	newLeafNode(otherlv_12, grammarAccess.getEAttributeOpDefAccess().getLeftCurlyBracketKeyword_1_3_0_0());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1093:1: ( (lv_setters_13_0= rulesetterDef ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==46) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1094:1: (lv_setters_13_0= rulesetterDef )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1094:1: (lv_setters_13_0= rulesetterDef )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1095:3: lv_setters_13_0= rulesetterDef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAttributeOpDefAccess().getSettersSetterDefParserRuleCall_1_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulesetterDef_in_ruleEAttributeOpDef2322);
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

                    otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleEAttributeOpDef2335); 

                        	newLeafNode(otherlv_14, grammarAccess.getEAttributeOpDefAccess().getRightCurlyBracketKeyword_1_3_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1116:7: otherlv_15= ';'
                    {
                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleEAttributeOpDef2354); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1128:1: entryRuleEReferenceOpDef returns [EObject current=null] : iv_ruleEReferenceOpDef= ruleEReferenceOpDef EOF ;
    public final EObject entryRuleEReferenceOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReferenceOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1129:2: (iv_ruleEReferenceOpDef= ruleEReferenceOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1130:2: iv_ruleEReferenceOpDef= ruleEReferenceOpDef EOF
            {
             newCompositeNode(grammarAccess.getEReferenceOpDefRule()); 
            pushFollow(FOLLOW_ruleEReferenceOpDef_in_entryRuleEReferenceOpDef2392);
            iv_ruleEReferenceOpDef=ruleEReferenceOpDef();

            state._fsp--;

             current =iv_ruleEReferenceOpDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEReferenceOpDef2402); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1137:1: ruleEReferenceOpDef returns [EObject current=null] : ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) ) ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1140:28: ( ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1141:1: ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1141:1: ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1141:2: (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1141:2: (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1141:4: otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleEReferenceOpDef2440); 

                	newLeafNode(otherlv_0, grammarAccess.getEReferenceOpDefAccess().getReferenceKeyword_0_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1145:1: ( (lv_var_1_0= ruleReference ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1146:1: (lv_var_1_0= ruleReference )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1146:1: (lv_var_1_0= ruleReference )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1147:3: lv_var_1_0= ruleReference
            {
             
            	        newCompositeNode(grammarAccess.getEReferenceOpDefAccess().getVarReferenceParserRuleCall_0_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReference_in_ruleEReferenceOpDef2461);
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEReferenceOpDef2473); 

                	newLeafNode(otherlv_2, grammarAccess.getEReferenceOpDefAccess().getEqualsSignKeyword_0_2());
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1167:2: ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1167:3: ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1167:3: ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1167:4: ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1167:4: ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt15=1;
                }
                break;
            case 44:
                {
                alt15=2;
                }
                break;
            case 45:
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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1167:5: ( (lv_op_3_0= 'changeEReference' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1167:5: ( (lv_op_3_0= 'changeEReference' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1168:1: (lv_op_3_0= 'changeEReference' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1168:1: (lv_op_3_0= 'changeEReference' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1169:3: lv_op_3_0= 'changeEReference'
                    {
                    lv_op_3_0=(Token)match(input,43,FOLLOW_43_in_ruleEReferenceOpDef2495); 

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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1183:6: ( (lv_op_4_0= 'addEReference' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1183:6: ( (lv_op_4_0= 'addEReference' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1184:1: (lv_op_4_0= 'addEReference' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1184:1: (lv_op_4_0= 'addEReference' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1185:3: lv_op_4_0= 'addEReference'
                    {
                    lv_op_4_0=(Token)match(input,44,FOLLOW_44_in_ruleEReferenceOpDef2532); 

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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1199:6: ( (lv_op_5_0= 'deleteEReference' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1199:6: ( (lv_op_5_0= 'deleteEReference' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1200:1: (lv_op_5_0= 'deleteEReference' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1200:1: (lv_op_5_0= 'deleteEReference' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1201:3: lv_op_5_0= 'deleteEReference'
                    {
                    lv_op_5_0=(Token)match(input,45,FOLLOW_45_in_ruleEReferenceOpDef2569); 

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

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleEReferenceOpDef2595); 

                	newLeafNode(otherlv_6, grammarAccess.getEReferenceOpDefAccess().getLeftParenthesisKeyword_1_0_1());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1218:1: ( (lv_ref_7_0= ruleReference ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1219:1: (lv_ref_7_0= ruleReference )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1219:1: (lv_ref_7_0= ruleReference )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1220:3: lv_ref_7_0= ruleReference
            {
             
            	        newCompositeNode(grammarAccess.getEReferenceOpDefAccess().getRefReferenceParserRuleCall_1_0_2_0()); 
            	    
            pushFollow(FOLLOW_ruleReference_in_ruleEReferenceOpDef2616);
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

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEReferenceOpDef2628); 

                	newLeafNode(otherlv_8, grammarAccess.getEReferenceOpDefAccess().getColonKeyword_1_0_3());
                
            otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleEReferenceOpDef2640); 

                	newLeafNode(otherlv_9, grammarAccess.getEReferenceOpDefAccess().getReferenceKeyword_1_0_4());
                

            }

            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleEReferenceOpDef2653); 

                	newLeafNode(otherlv_10, grammarAccess.getEReferenceOpDefAccess().getRightParenthesisKeyword_1_1());
                
            otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleEReferenceOpDef2665); 

                	newLeafNode(otherlv_11, grammarAccess.getEReferenceOpDefAccess().getWhereKeyword_1_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1252:1: (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1252:3: otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}'
            {
            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleEReferenceOpDef2678); 

                	newLeafNode(otherlv_12, grammarAccess.getEReferenceOpDefAccess().getLeftCurlyBracketKeyword_1_3_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1256:1: ( (lv_setters_13_0= rulesetterDef ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==46) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1257:1: (lv_setters_13_0= rulesetterDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1257:1: (lv_setters_13_0= rulesetterDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1258:3: lv_setters_13_0= rulesetterDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEReferenceOpDefAccess().getSettersSetterDefParserRuleCall_1_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesetterDef_in_ruleEReferenceOpDef2699);
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

            otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleEReferenceOpDef2712); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1286:1: entryRulesetterDef returns [EObject current=null] : iv_rulesetterDef= rulesetterDef EOF ;
    public final EObject entryRulesetterDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesetterDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1287:2: (iv_rulesetterDef= rulesetterDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1288:2: iv_rulesetterDef= rulesetterDef EOF
            {
             newCompositeNode(grammarAccess.getSetterDefRule()); 
            pushFollow(FOLLOW_rulesetterDef_in_entryRulesetterDef2750);
            iv_rulesetterDef=rulesetterDef();

            state._fsp--;

             current =iv_rulesetterDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesetterDef2760); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1295:1: rulesetterDef returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1298:28: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1299:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1299:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1299:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_rulesetterDef2797); 

                	newLeafNode(otherlv_0, grammarAccess.getSetterDefAccess().getSetKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1303:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1304:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1304:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1305:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSetterDefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesetterDef2817); 

            		newLeafNode(otherlv_1, grammarAccess.getSetterDefAccess().getMetafeatureEStructuralFeatureCrossReference_1_0()); 
            	

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1316:2: ( (lv_operator_2_0= '=' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1317:1: (lv_operator_2_0= '=' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1317:1: (lv_operator_2_0= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1318:3: lv_operator_2_0= '='
            {
            lv_operator_2_0=(Token)match(input,27,FOLLOW_27_in_rulesetterDef2835); 

                    newLeafNode(lv_operator_2_0, grammarAccess.getSetterDefAccess().getOperatorEqualsSignKeyword_2_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetterDefRule());
            	        }
                   		setWithLastConsumed(current, "operator", lv_operator_2_0, "=");
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1331:2: ( (lv_par_3_0= ruleParameter ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1332:1: (lv_par_3_0= ruleParameter )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1332:1: (lv_par_3_0= ruleParameter )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1333:3: lv_par_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getSetterDefAccess().getParParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_rulesetterDef2869);
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

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1349:2: (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1349:4: otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulesetterDef2882); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSetterDefAccess().getCommaKeyword_4_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1353:1: ( (lv_par_5_0= ruleParameter ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1354:1: (lv_par_5_0= ruleParameter )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1354:1: (lv_par_5_0= ruleParameter )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1355:3: lv_par_5_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSetterDefAccess().getParParameterParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_rulesetterDef2903);
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_rulesetterDef2917); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1383:1: entryRuleRewritingRule returns [EObject current=null] : iv_ruleRewritingRule= ruleRewritingRule EOF ;
    public final EObject entryRuleRewritingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewritingRule = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1384:2: (iv_ruleRewritingRule= ruleRewritingRule EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1385:2: iv_ruleRewritingRule= ruleRewritingRule EOF
            {
             newCompositeNode(grammarAccess.getRewritingRuleRule()); 
            pushFollow(FOLLOW_ruleRewritingRule_in_entryRuleRewritingRule2953);
            iv_ruleRewritingRule=ruleRewritingRule();

            state._fsp--;

             current =iv_ruleRewritingRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRewritingRule2963); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1392:1: ruleRewritingRule returns [EObject current=null] : ( ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* ) ;
    public final EObject ruleRewritingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_migratorsSX_0_0 = null;

        EObject lv_migratorDX_2_0 = null;

        EObject lv_migratorSX_4_0 = null;

        EObject lv_migratorDX_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1395:28: ( ( ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1396:1: ( ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1396:1: ( ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1396:2: ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )*
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1396:2: ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1396:3: ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1396:3: ( (lv_migratorsSX_0_0= ruleMigratorSX ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1397:1: (lv_migratorsSX_0_0= ruleMigratorSX )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1397:1: (lv_migratorsSX_0_0= ruleMigratorSX )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1398:3: lv_migratorsSX_0_0= ruleMigratorSX
            {
             
            	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorsSXMigratorSXParserRuleCall_0_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMigratorSX_in_ruleRewritingRule3010);
            lv_migratorsSX_0_0=ruleMigratorSX();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRewritingRuleRule());
            	        }
                   		add(
                   			current, 
                   			"migratorsSX",
                    		lv_migratorsSX_0_0, 
                    		"MigratorSX");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleRewritingRule3022); 

                	newLeafNode(otherlv_1, grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1418:1: ( (lv_migratorDX_2_0= ruleMigratorDX ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1419:1: (lv_migratorDX_2_0= ruleMigratorDX )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1419:1: (lv_migratorDX_2_0= ruleMigratorDX )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1420:3: lv_migratorDX_2_0= ruleMigratorDX
            {
             
            	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_0_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMigratorDX_in_ruleRewritingRule3043);
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

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1436:3: (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==48) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1436:5: otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) )
            	    {
            	    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleRewritingRule3057); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRewritingRuleAccess().getAmpersandKeyword_1_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1440:1: ( (lv_migratorSX_4_0= ruleMigratorSX ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1441:1: (lv_migratorSX_4_0= ruleMigratorSX )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1441:1: (lv_migratorSX_4_0= ruleMigratorSX )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1442:3: lv_migratorSX_4_0= ruleMigratorSX
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorSXMigratorSXParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMigratorSX_in_ruleRewritingRule3078);
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

            	    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleRewritingRule3090); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_1_2());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1462:1: ( (lv_migratorDX_6_0= ruleMigratorDX ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1463:1: (lv_migratorDX_6_0= ruleMigratorDX )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1463:1: (lv_migratorDX_6_0= ruleMigratorDX )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1464:3: lv_migratorDX_6_0= ruleMigratorDX
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMigratorDX_in_ruleRewritingRule3111);
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


    // $ANTLR start "entryRuleMigratorSX"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1490:1: entryRuleMigratorSX returns [EObject current=null] : iv_ruleMigratorSX= ruleMigratorSX EOF ;
    public final EObject entryRuleMigratorSX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigratorSX = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1491:2: (iv_ruleMigratorSX= ruleMigratorSX EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1492:2: iv_ruleMigratorSX= ruleMigratorSX EOF
            {
             newCompositeNode(grammarAccess.getMigratorSXRule()); 
            pushFollow(FOLLOW_ruleMigratorSX_in_entryRuleMigratorSX3151);
            iv_ruleMigratorSX=ruleMigratorSX();

            state._fsp--;

             current =iv_ruleMigratorSX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigratorSX3161); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1499:1: ruleMigratorSX returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']' ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1502:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1503:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1503:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1503:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1503:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1504:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMigratorSXAccess().getMigratorSXAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1509:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1510:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1510:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1511:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorSX3212); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleMigratorSX3229); 

                	newLeafNode(otherlv_2, grammarAccess.getMigratorSXAccess().getColonKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1531:1: ( (otherlv_3= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1532:1: (otherlv_3= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1532:1: (otherlv_3= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1533:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMigratorSXRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorSX3249); 

            		newLeafNode(otherlv_3, grammarAccess.getMigratorSXAccess().getElementSXEClassCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleMigratorSX3261); 

                	newLeafNode(otherlv_4, grammarAccess.getMigratorSXAccess().getWhereKeyword_4());
                
            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleMigratorSX3273); 

                	newLeafNode(otherlv_5, grammarAccess.getMigratorSXAccess().getLeftSquareBracketKeyword_5());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1552:1: ( (lv_filterSX_6_0= ruleFilterMigrator ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1553:1: (lv_filterSX_6_0= ruleFilterMigrator )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1553:1: (lv_filterSX_6_0= ruleFilterMigrator )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1554:3: lv_filterSX_6_0= ruleFilterMigrator
            {
             
            	        newCompositeNode(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorSX3294);
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

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1570:2: (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==48) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1570:4: otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) )
            	    {
            	    otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleMigratorSX3307); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMigratorSXAccess().getAmpersandKeyword_7_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1574:1: ( (lv_filterSX_8_0= ruleFilterMigrator ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1575:1: (lv_filterSX_8_0= ruleFilterMigrator )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1575:1: (lv_filterSX_8_0= ruleFilterMigrator )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1576:3: lv_filterSX_8_0= ruleFilterMigrator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorSX3328);
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
            	    break loop19;
                }
            } while (true);

            otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleMigratorSX3342); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1604:1: entryRuleMigratorDX returns [EObject current=null] : iv_ruleMigratorDX= ruleMigratorDX EOF ;
    public final EObject entryRuleMigratorDX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigratorDX = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1605:2: (iv_ruleMigratorDX= ruleMigratorDX EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1606:2: iv_ruleMigratorDX= ruleMigratorDX EOF
            {
             newCompositeNode(grammarAccess.getMigratorDXRule()); 
            pushFollow(FOLLOW_ruleMigratorDX_in_entryRuleMigratorDX3378);
            iv_ruleMigratorDX=ruleMigratorDX();

            state._fsp--;

             current =iv_ruleMigratorDX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigratorDX3388); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1613:1: ruleMigratorDX returns [EObject current=null] : ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) ) | otherlv_9= 'null' ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1616:28: ( ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) ) | otherlv_9= 'null' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1617:1: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) ) | otherlv_9= 'null' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1617:1: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) ) | otherlv_9= 'null' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==49) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1617:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1617:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1617:3: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1617:3: ()
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1618:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMigratorDXAccess().getMigratorDXAction_0_0(),
                                current);
                        

                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1623:2: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1623:3: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']'
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1623:3: ( (lv_name_1_0= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1624:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1624:1: (lv_name_1_0= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1625:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorDX3441); 

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

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleMigratorDX3458); 

                        	newLeafNode(otherlv_2, grammarAccess.getMigratorDXAccess().getColonKeyword_0_1_1());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1645:1: ( (otherlv_3= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1646:1: (otherlv_3= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1646:1: (otherlv_3= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1647:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMigratorDXRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorDX3478); 

                    		newLeafNode(otherlv_3, grammarAccess.getMigratorDXAccess().getElementDXEClassCrossReference_0_1_2_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleMigratorDX3490); 

                        	newLeafNode(otherlv_4, grammarAccess.getMigratorDXAccess().getLeftSquareBracketKeyword_0_1_3());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1662:1: ( (lv_filterDX_5_0= ruleFilterMigrator ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1663:1: (lv_filterDX_5_0= ruleFilterMigrator )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1663:1: (lv_filterDX_5_0= ruleFilterMigrator )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1664:3: lv_filterDX_5_0= ruleFilterMigrator
                    {
                     
                    	        newCompositeNode(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorDX3511);
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

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1680:2: (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==48) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1680:4: otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) )
                    	    {
                    	    otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleMigratorDX3524); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getMigratorDXAccess().getAmpersandKeyword_0_1_5_0());
                    	        
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1684:1: ( (lv_filterDX_7_0= ruleFilterMigrator ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1685:1: (lv_filterDX_7_0= ruleFilterMigrator )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1685:1: (lv_filterDX_7_0= ruleFilterMigrator )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1686:3: lv_filterDX_7_0= ruleFilterMigrator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_1_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorDX3545);
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleMigratorDX3559); 

                        	newLeafNode(otherlv_8, grammarAccess.getMigratorDXAccess().getRightSquareBracketKeyword_0_1_6());
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1707:7: otherlv_9= 'null'
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_49_in_ruleMigratorDX3579); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1719:1: entryRuleFilterMigrator returns [EObject current=null] : iv_ruleFilterMigrator= ruleFilterMigrator EOF ;
    public final EObject entryRuleFilterMigrator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterMigrator = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1720:2: (iv_ruleFilterMigrator= ruleFilterMigrator EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1721:2: iv_ruleFilterMigrator= ruleFilterMigrator EOF
            {
             newCompositeNode(grammarAccess.getFilterMigratorRule()); 
            pushFollow(FOLLOW_ruleFilterMigrator_in_entryRuleFilterMigrator3615);
            iv_ruleFilterMigrator=ruleFilterMigrator();

            state._fsp--;

             current =iv_ruleFilterMigrator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterMigrator3625); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1728:1: ruleFilterMigrator returns [EObject current=null] : ( ( (lv_featureSX_0_0= ruleDotNavigationObjSX ) ) ( (lv_op_1_0= '=' ) ) ( (lv_value_2_0= ruleDotNavigationObjDX ) )? ) ;
    public final EObject ruleFilterMigrator() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_featureSX_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1731:28: ( ( ( (lv_featureSX_0_0= ruleDotNavigationObjSX ) ) ( (lv_op_1_0= '=' ) ) ( (lv_value_2_0= ruleDotNavigationObjDX ) )? ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1732:1: ( ( (lv_featureSX_0_0= ruleDotNavigationObjSX ) ) ( (lv_op_1_0= '=' ) ) ( (lv_value_2_0= ruleDotNavigationObjDX ) )? )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1732:1: ( ( (lv_featureSX_0_0= ruleDotNavigationObjSX ) ) ( (lv_op_1_0= '=' ) ) ( (lv_value_2_0= ruleDotNavigationObjDX ) )? )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1732:2: ( (lv_featureSX_0_0= ruleDotNavigationObjSX ) ) ( (lv_op_1_0= '=' ) ) ( (lv_value_2_0= ruleDotNavigationObjDX ) )?
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1732:2: ( (lv_featureSX_0_0= ruleDotNavigationObjSX ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1733:1: (lv_featureSX_0_0= ruleDotNavigationObjSX )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1733:1: (lv_featureSX_0_0= ruleDotNavigationObjSX )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1734:3: lv_featureSX_0_0= ruleDotNavigationObjSX
            {
             
            	        newCompositeNode(grammarAccess.getFilterMigratorAccess().getFeatureSXDotNavigationObjSXParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDotNavigationObjSX_in_ruleFilterMigrator3671);
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

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1750:2: ( (lv_op_1_0= '=' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1751:1: (lv_op_1_0= '=' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1751:1: (lv_op_1_0= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1752:3: lv_op_1_0= '='
            {
            lv_op_1_0=(Token)match(input,27,FOLLOW_27_in_ruleFilterMigrator3689); 

                    newLeafNode(lv_op_1_0, grammarAccess.getFilterMigratorAccess().getOpEqualsSignKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterMigratorRule());
            	        }
                   		setWithLastConsumed(current, "op", lv_op_1_0, "=");
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1765:2: ( (lv_value_2_0= ruleDotNavigationObjDX ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1766:1: (lv_value_2_0= ruleDotNavigationObjDX )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1766:1: (lv_value_2_0= ruleDotNavigationObjDX )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1767:3: lv_value_2_0= ruleDotNavigationObjDX
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterMigratorAccess().getValueDotNavigationObjDXParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDotNavigationObjDX_in_ruleFilterMigrator3723);
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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1791:1: entryRuleDotNavigationObjSX returns [EObject current=null] : iv_ruleDotNavigationObjSX= ruleDotNavigationObjSX EOF ;
    public final EObject entryRuleDotNavigationObjSX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotNavigationObjSX = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1792:2: (iv_ruleDotNavigationObjSX= ruleDotNavigationObjSX EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1793:2: iv_ruleDotNavigationObjSX= ruleDotNavigationObjSX EOF
            {
             newCompositeNode(grammarAccess.getDotNavigationObjSXRule()); 
            pushFollow(FOLLOW_ruleDotNavigationObjSX_in_entryRuleDotNavigationObjSX3760);
            iv_ruleDotNavigationObjSX=ruleDotNavigationObjSX();

            state._fsp--;

             current =iv_ruleDotNavigationObjSX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDotNavigationObjSX3770); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1800:1: ruleDotNavigationObjSX returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleDotNavigationObjSX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1803:28: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1804:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1804:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1804:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleDotNavigationObjSX3807); 

                	newLeafNode(otherlv_0, grammarAccess.getDotNavigationObjSXAccess().getNumberSignKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1808:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1809:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1809:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1810:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDotNavigationObjSXRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDotNavigationObjSX3827); 

            		newLeafNode(otherlv_1, grammarAccess.getDotNavigationObjSXAccess().getObjEObjectCrossReference_1_0()); 
            	

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1821:2: (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==51) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1821:4: otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleDotNavigationObjSX3840); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDotNavigationObjSXAccess().getFullStopKeyword_2_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1825:1: ( (otherlv_3= RULE_ID ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1826:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1826:1: (otherlv_3= RULE_ID )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1827:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDotNavigationObjSXRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDotNavigationObjSX3860); 

            	    		newLeafNode(otherlv_3, grammarAccess.getDotNavigationObjSXAccess().getRefEStructuralFeatureCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1846:1: entryRuleDotNavigationObjDX returns [EObject current=null] : iv_ruleDotNavigationObjDX= ruleDotNavigationObjDX EOF ;
    public final EObject entryRuleDotNavigationObjDX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotNavigationObjDX = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1847:2: (iv_ruleDotNavigationObjDX= ruleDotNavigationObjDX EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1848:2: iv_ruleDotNavigationObjDX= ruleDotNavigationObjDX EOF
            {
             newCompositeNode(grammarAccess.getDotNavigationObjDXRule()); 
            pushFollow(FOLLOW_ruleDotNavigationObjDX_in_entryRuleDotNavigationObjDX3898);
            iv_ruleDotNavigationObjDX=ruleDotNavigationObjDX();

            state._fsp--;

             current =iv_ruleDotNavigationObjDX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDotNavigationObjDX3908); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1855:1: ruleDotNavigationObjDX returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleDotNavigationObjDX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1858:28: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1859:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1859:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1859:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleDotNavigationObjDX3945); 

                	newLeafNode(otherlv_0, grammarAccess.getDotNavigationObjDXAccess().getNumberSignKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1863:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1864:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1864:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1865:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDotNavigationObjDXRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDotNavigationObjDX3965); 

            		newLeafNode(otherlv_1, grammarAccess.getDotNavigationObjDXAccess().getObjEObjectCrossReference_1_0()); 
            	

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1876:2: (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==51) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1876:4: otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleDotNavigationObjDX3978); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDotNavigationObjDXAccess().getFullStopKeyword_2_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1880:1: ( (otherlv_3= RULE_ID ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1881:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1881:1: (otherlv_3= RULE_ID )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1882:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDotNavigationObjDXRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDotNavigationObjDX3998); 

            	    		newLeafNode(otherlv_3, grammarAccess.getDotNavigationObjDXAccess().getRefEStructuralFeatureCrossReference_2_1_0()); 
            	    	

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
    // $ANTLR end "ruleDotNavigationObjDX"


    // $ANTLR start "entryRuleParameter"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1901:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1902:2: (iv_ruleParameter= ruleParameter EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1903:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4036);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4046); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1910:1: ruleParameter returns [EObject current=null] : (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1913:28: ( (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1914:1: (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1914:1: (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1914:3: otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleParameter4083); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getPercentSignKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1918:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1919:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1919:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1920:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter4100); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1944:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1945:2: (iv_rulePackage= rulePackage EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1946:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage4141);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage4151); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1953:1: rulePackage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1956:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1957:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1957:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1957:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1957:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1958:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPackageAccess().getPackageAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1963:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1964:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1964:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1965:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage4202); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1989:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1990:2: (iv_ruleClass= ruleClass EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1991:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass4243);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass4253); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1998:1: ruleClass returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2001:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2002:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2002:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2002:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2002:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2003:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClassAccess().getClassAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2008:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2009:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2009:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2010:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass4304); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2034:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2035:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2036:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4345);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4355); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2043:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2046:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2047:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2047:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2047:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2047:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2048:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeAccess().getAttributeAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2053:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2054:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2054:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2055:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute4406); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2079:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2080:2: (iv_ruleReference= ruleReference EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2081:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference4447);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference4457); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2088:1: ruleReference returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2091:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2092:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2092:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2092:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2092:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2093:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferenceAccess().getReferenceAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2098:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2099:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2099:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2100:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference4508); 

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
    public static final BitSet FOLLOW_12_in_ruleMigrationLibrary275 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleMigrationLibrary296 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_13_in_ruleMigrationLibrary309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationProgram_in_entryRuleMigrationProgram345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationProgram355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMigrationProgram393 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMigrationProgram410 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMigrationProgram427 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleMigrationProgram447 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_ruleArtifact_in_ruleMigrationProgram481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMigrationProgram498 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMigrationProgram515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationProgram536 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMigrationProgram549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationProgram569 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationProgram583 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMigrationProgram600 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMigrationProgram617 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleMigrationProgram638 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_13_in_ruleMigrationProgram651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifact697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleArtifact741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleArtifact770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleArtifact799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleRule897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule914 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRule931 = new BitSet(new long[]{0x0000044404000000L});
    public static final BitSet FOLLOW_ruleOpDef_in_ruleRule952 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRule964 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRule976 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleRewritingRule_in_ruleRule997 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleRule1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpDef_in_entryRuleOpDef1046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpDef1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageOpDef_in_ruleOpDef1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_ruleOpDef1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_ruleOpDef1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_ruleOpDef1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageOpDef_in_entryRuleEPackageOpDef1219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPackageOpDef1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEPackageOpDef1267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackage_in_ruleEPackageOpDef1288 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEPackageOpDef1300 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_28_in_ruleEPackageOpDef1321 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29_in_ruleEPackageOpDef1358 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30_in_ruleEPackageOpDef1395 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEPackageOpDef1421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackage_in_ruleEPackageOpDef1442 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEPackageOpDef1454 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEPackageOpDef1466 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEPackageOpDef1478 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEPackageOpDef1490 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEPackageOpDef1502 = new BitSet(new long[]{0x0000400400002000L});
    public static final BitSet FOLLOW_rulesetterDef_in_ruleEPackageOpDef1524 = new BitSet(new long[]{0x0000400400002000L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_ruleEPackageOpDef1551 = new BitSet(new long[]{0x0000400400002000L});
    public static final BitSet FOLLOW_13_in_ruleEPackageOpDef1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_entryRuleEClassOpDef1602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEClassOpDef1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEClassOpDef1650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleEClassOpDef1671 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEClassOpDef1683 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_35_in_ruleEClassOpDef1704 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_36_in_ruleEClassOpDef1741 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_37_in_ruleEClassOpDef1778 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEClassOpDef1804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleEClassOpDef1825 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEClassOpDef1837 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEClassOpDef1849 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEClassOpDef1861 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEClassOpDef1873 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEClassOpDef1886 = new BitSet(new long[]{0x0000444404002000L});
    public static final BitSet FOLLOW_rulesetterDef_in_ruleEClassOpDef1908 = new BitSet(new long[]{0x0000444404002000L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_ruleEClassOpDef1935 = new BitSet(new long[]{0x0000444404002000L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_ruleEClassOpDef1962 = new BitSet(new long[]{0x0000444404002000L});
    public static final BitSet FOLLOW_13_in_ruleEClassOpDef1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_entryRuleEAttributeOpDef2014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEAttributeOpDef2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEAttributeOpDef2062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEAttributeOpDef2083 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEAttributeOpDef2095 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_39_in_ruleEAttributeOpDef2117 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_40_in_ruleEAttributeOpDef2154 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_41_in_ruleEAttributeOpDef2191 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEAttributeOpDef2217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEAttributeOpDef2238 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEAttributeOpDef2250 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEAttributeOpDef2262 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEAttributeOpDef2275 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEAttributeOpDef2287 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleEAttributeOpDef2301 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_rulesetterDef_in_ruleEAttributeOpDef2322 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_13_in_ruleEAttributeOpDef2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEAttributeOpDef2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_entryRuleEReferenceOpDef2392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEReferenceOpDef2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEReferenceOpDef2440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReference_in_ruleEReferenceOpDef2461 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEReferenceOpDef2473 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_43_in_ruleEReferenceOpDef2495 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_44_in_ruleEReferenceOpDef2532 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_45_in_ruleEReferenceOpDef2569 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEReferenceOpDef2595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReference_in_ruleEReferenceOpDef2616 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEReferenceOpDef2628 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleEReferenceOpDef2640 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEReferenceOpDef2653 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEReferenceOpDef2665 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEReferenceOpDef2678 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_rulesetterDef_in_ruleEReferenceOpDef2699 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_13_in_ruleEReferenceOpDef2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetterDef_in_entryRulesetterDef2750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesetterDef2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulesetterDef2797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesetterDef2817 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulesetterDef2835 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_rulesetterDef2869 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_rulesetterDef2882 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_rulesetterDef2903 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_rulesetterDef2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewritingRule_in_entryRuleRewritingRule2953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRewritingRule2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_ruleRewritingRule3010 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRewritingRule3022 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_ruleRewritingRule3043 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleRewritingRule3057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_ruleRewritingRule3078 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRewritingRule3090 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_ruleRewritingRule3111 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_entryRuleMigratorSX3151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigratorSX3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorSX3212 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMigratorSX3229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorSX3249 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMigratorSX3261 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMigratorSX3273 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorSX3294 = new BitSet(new long[]{0x0001000002000000L});
    public static final BitSet FOLLOW_48_in_ruleMigratorSX3307 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorSX3328 = new BitSet(new long[]{0x0001000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMigratorSX3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_entryRuleMigratorDX3378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigratorDX3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorDX3441 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMigratorDX3458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorDX3478 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMigratorDX3490 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorDX3511 = new BitSet(new long[]{0x0001000002000000L});
    public static final BitSet FOLLOW_48_in_ruleMigratorDX3524 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorDX3545 = new BitSet(new long[]{0x0001000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMigratorDX3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMigratorDX3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_entryRuleFilterMigrator3615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterMigrator3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjSX_in_ruleFilterMigrator3671 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFilterMigrator3689 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjDX_in_ruleFilterMigrator3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjSX_in_entryRuleDotNavigationObjSX3760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDotNavigationObjSX3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDotNavigationObjSX3807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDotNavigationObjSX3827 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDotNavigationObjSX3840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDotNavigationObjSX3860 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjDX_in_entryRuleDotNavigationObjDX3898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDotNavigationObjDX3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDotNavigationObjDX3945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDotNavigationObjDX3965 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDotNavigationObjDX3978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDotNavigationObjDX3998 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleParameter4083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage4141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass4243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference4447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference4508 = new BitSet(new long[]{0x0000000000000002L});

}