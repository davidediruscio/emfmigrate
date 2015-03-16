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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEmigParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Library'", "'{'", "'}'", "'include'", "';'", "'migrate'", "':'", "','", "'with'", "'transformation'", "'model'", "'tcs-model'", "'rule'", "'['", "']'", "'package'", "'='", "'changePackage'", "'addPackage'", "'deletePackage'", "'('", "')'", "'where'", "'class'", "'changeClass'", "'addClass'", "'deleteClass'", "'attribute'", "'changeEAttribute'", "'addEAttribute'", "'deleteEAttribute'", "'reference'", "'changeEReference'", "'addEReference'", "'deleteEReference'", "'set'", "'->'", "'&'", "'null'", "'%'", "'String'", "'context'", "'OclType'", "'type'", "'super'", "'Bag'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Map'", "'#'", "'OclUndefined'", "'.'", "'arguments'", "'iterate'", "'|'", "'let'", "'in'", "'If'", "'then'", "'else'", "'endif'", "'Collection'", "'Boolean'", "'Integer'", "'Real'", "'BagType'", "'name'", "'elementType'", "'OrderedSetType'", "'SequenceType'", "'SetType'", "'OclAny'", "'TupleType'", "'( '", "'!'", "'id'", "'variableExp'", "'true'", "'false'", "'Double'"
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
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
    public static final int T__30=30;
    public static final int T__31=31;
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:73:1: entryRuleMyModel returns [EObject current=null] : iv_ruleMyModel= ruleMyModel EOF ;
    public final EObject entryRuleMyModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyModel = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:74:2: (iv_ruleMyModel= ruleMyModel EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:75:2: iv_ruleMyModel= ruleMyModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMyModelRule()); 
            }
            pushFollow(FOLLOW_ruleMyModel_in_entryRuleMyModel81);
            iv_ruleMyModel=ruleMyModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMyModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyModel91); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:82:1: ruleMyModel returns [EObject current=null] : ( ( (lv_migrationLib_0_0= ruleMigrationLibrary ) ) | ( (lv_MigrationProgr_1_0= ruleMigrationProgram ) ) ) ;
    public final EObject ruleMyModel() throws RecognitionException {
        EObject current = null;

        EObject lv_migrationLib_0_0 = null;

        EObject lv_MigrationProgr_1_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:85:28: ( ( ( (lv_migrationLib_0_0= ruleMigrationLibrary ) ) | ( (lv_MigrationProgr_1_0= ruleMigrationProgram ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:86:1: ( ( (lv_migrationLib_0_0= ruleMigrationLibrary ) ) | ( (lv_MigrationProgr_1_0= ruleMigrationProgram ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:86:1: ( ( (lv_migrationLib_0_0= ruleMigrationLibrary ) ) | ( (lv_MigrationProgr_1_0= ruleMigrationProgram ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==14||LA1_0==16) ) {
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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:86:2: ( (lv_migrationLib_0_0= ruleMigrationLibrary ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:86:2: ( (lv_migrationLib_0_0= ruleMigrationLibrary ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:87:1: (lv_migrationLib_0_0= ruleMigrationLibrary )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:87:1: (lv_migrationLib_0_0= ruleMigrationLibrary )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:88:3: lv_migrationLib_0_0= ruleMigrationLibrary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMyModelAccess().getMigrationLibMigrationLibraryParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMigrationLibrary_in_ruleMyModel137);
                    lv_migrationLib_0_0=ruleMigrationLibrary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:105:6: ( (lv_MigrationProgr_1_0= ruleMigrationProgram ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:105:6: ( (lv_MigrationProgr_1_0= ruleMigrationProgram ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:106:1: (lv_MigrationProgr_1_0= ruleMigrationProgram )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:106:1: (lv_MigrationProgr_1_0= ruleMigrationProgram )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:107:3: lv_MigrationProgr_1_0= ruleMigrationProgram
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMyModelAccess().getMigrationProgrMigrationProgramParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMigrationProgram_in_ruleMyModel164);
                    lv_MigrationProgr_1_0=ruleMigrationProgram();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleMyModel"


    // $ANTLR start "entryRuleMigrationLibrary"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:131:1: entryRuleMigrationLibrary returns [EObject current=null] : iv_ruleMigrationLibrary= ruleMigrationLibrary EOF ;
    public final EObject entryRuleMigrationLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationLibrary = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:132:2: (iv_ruleMigrationLibrary= ruleMigrationLibrary EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:133:2: iv_ruleMigrationLibrary= ruleMigrationLibrary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigrationLibraryRule()); 
            }
            pushFollow(FOLLOW_ruleMigrationLibrary_in_entryRuleMigrationLibrary200);
            iv_ruleMigrationLibrary=ruleMigrationLibrary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigrationLibrary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationLibrary210); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:140:1: ruleMigrationLibrary returns [EObject current=null] : (otherlv_0= 'Library' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' ) ;
    public final EObject ruleMigrationLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rules_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:143:28: ( (otherlv_0= 'Library' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:144:1: (otherlv_0= 'Library' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:144:1: (otherlv_0= 'Library' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:144:3: otherlv_0= 'Library' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMigrationLibrary247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMigrationLibraryAccess().getLibraryKeyword_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:148:1: ( (lv_title_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:149:1: (lv_title_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:149:1: (lv_title_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:150:3: lv_title_1_0= RULE_ID
            {
            lv_title_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationLibrary264); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_title_1_0, grammarAccess.getMigrationLibraryAccess().getTitleIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMigrationLibrary281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMigrationLibraryAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:170:1: ( (lv_rules_3_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:171:1: (lv_rules_3_0= ruleRule )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:171:1: (lv_rules_3_0= ruleRule )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:172:3: lv_rules_3_0= ruleRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationLibraryAccess().getRulesRuleParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRule_in_ruleMigrationLibrary302);
            	    lv_rules_3_0=ruleRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleMigrationLibrary315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMigrationLibraryAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleMigrationLibrary"


    // $ANTLR start "entryRuleMigrationProgram"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:200:1: entryRuleMigrationProgram returns [EObject current=null] : iv_ruleMigrationProgram= ruleMigrationProgram EOF ;
    public final EObject entryRuleMigrationProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationProgram = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:201:2: (iv_ruleMigrationProgram= ruleMigrationProgram EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:202:2: iv_ruleMigrationProgram= ruleMigrationProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigrationProgramRule()); 
            }
            pushFollow(FOLLOW_ruleMigrationProgram_in_entryRuleMigrationProgram351);
            iv_ruleMigrationProgram=ruleMigrationProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigrationProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationProgram361); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:209:1: ruleMigrationProgram returns [EObject current=null] : ( (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) ( (lv_typeArt_4_0= ruleArtifact ) ) ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}' ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:212:28: ( ( (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) ( (lv_typeArt_4_0= ruleArtifact ) ) ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:213:1: ( (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) ( (lv_typeArt_4_0= ruleArtifact ) ) ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:213:1: ( (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) ( (lv_typeArt_4_0= ruleArtifact ) ) ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:213:2: (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) ( (lv_typeArt_4_0= ruleArtifact ) ) ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:213:2: (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:213:4: otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';'
            	    {
            	    otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleMigrationProgram399); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_0, grammarAccess.getMigrationProgramAccess().getIncludeKeyword_0_0());
            	          
            	    }
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:217:1: ( (lv_libs_1_0= RULE_STRING ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:218:1: (lv_libs_1_0= RULE_STRING )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:218:1: (lv_libs_1_0= RULE_STRING )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:219:3: lv_libs_1_0= RULE_STRING
            	    {
            	    lv_libs_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMigrationProgram416); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_libs_1_0, grammarAccess.getMigrationProgramAccess().getLibsSTRINGTerminalRuleCall_0_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMigrationProgram433); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getMigrationProgramAccess().getSemicolonKeyword_0_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:239:3: ( (lv_migr_3_0= 'migrate' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:240:1: (lv_migr_3_0= 'migrate' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:240:1: (lv_migr_3_0= 'migrate' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:241:3: lv_migr_3_0= 'migrate'
            {
            lv_migr_3_0=(Token)match(input,16,FOLLOW_16_in_ruleMigrationProgram453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_migr_3_0, grammarAccess.getMigrationProgramAccess().getMigrMigrateKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMigrationProgramRule());
              	        }
                     		setWithLastConsumed(current, "migr", lv_migr_3_0, "migrate");
              	    
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:254:2: ( (lv_typeArt_4_0= ruleArtifact ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:255:1: (lv_typeArt_4_0= ruleArtifact )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:255:1: (lv_typeArt_4_0= ruleArtifact )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:256:3: lv_typeArt_4_0= ruleArtifact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMigrationProgramAccess().getTypeArtArtifactParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArtifact_in_ruleMigrationProgram487);
            lv_typeArt_4_0=ruleArtifact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:272:2: ( (lv_name_5_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:273:1: (lv_name_5_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:273:1: (lv_name_5_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:274:3: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMigrationProgram504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getMigrationProgramAccess().getNameSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleMigrationProgram521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMigrationProgramAccess().getColonKeyword_4());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:294:1: ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:294:2: ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:294:2: ( (otherlv_7= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:295:1: (otherlv_7= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:295:1: (otherlv_7= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:296:3: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMigrationProgramRule());
              	        }
                      
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationProgram546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_7, grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_5_0_0()); 
              	
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:310:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:310:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            {
            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleMigrationProgram559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMigrationProgramAccess().getCommaKeyword_5_1_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:314:1: ( (otherlv_9= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:315:1: (otherlv_9= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:315:1: (otherlv_9= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:316:3: otherlv_9= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMigrationProgramRule());
              	        }
                      
            }
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationProgram583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_9, grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_5_1_1_0()); 
              	
            }

            }


            }


            }


            }

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleMigrationProgram597); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMigrationProgramAccess().getWithKeyword_6());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:334:1: ( (lv_delta_11_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:335:1: (lv_delta_11_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:335:1: (lv_delta_11_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:336:3: lv_delta_11_0= RULE_STRING
            {
            lv_delta_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMigrationProgram614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_delta_11_0, grammarAccess.getMigrationProgramAccess().getDeltaSTRINGTerminalRuleCall_7_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleMigrationProgram631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getMigrationProgramAccess().getLeftCurlyBracketKeyword_8());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:356:1: ( (lv_rules_13_0= ruleRule ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:357:1: (lv_rules_13_0= ruleRule )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:357:1: (lv_rules_13_0= ruleRule )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:358:3: lv_rules_13_0= ruleRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationProgramAccess().getRulesRuleParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRule_in_ruleMigrationProgram652);
            	    lv_rules_13_0=ruleRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleMigrationProgram665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getMigrationProgramAccess().getRightCurlyBracketKeyword_10());
                  
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
    // $ANTLR end "ruleMigrationProgram"


    // $ANTLR start "entryRuleArtifact"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:386:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:387:2: (iv_ruleArtifact= ruleArtifact EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:388:2: iv_ruleArtifact= ruleArtifact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArtifactRule()); 
            }
            pushFollow(FOLLOW_ruleArtifact_in_entryRuleArtifact701);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArtifact; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifact711); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:395:1: ruleArtifact returns [EObject current=null] : ( ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) ) ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:398:28: ( ( ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:399:1: ( ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:399:1: ( ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:400:1: ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:400:1: ( (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:401:1: (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:401:1: (lv_type_0_1= 'transformation' | lv_type_0_2= 'model' | lv_type_0_3= 'tcs-model' )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:402:3: lv_type_0_1= 'transformation'
                    {
                    lv_type_0_1=(Token)match(input,20,FOLLOW_20_in_ruleArtifact755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_0_1, grammarAccess.getArtifactAccess().getTypeTransformationKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArtifactRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:414:8: lv_type_0_2= 'model'
                    {
                    lv_type_0_2=(Token)match(input,21,FOLLOW_21_in_ruleArtifact784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_0_2, grammarAccess.getArtifactAccess().getTypeModelKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArtifactRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:426:8: lv_type_0_3= 'tcs-model'
                    {
                    lv_type_0_3=(Token)match(input,22,FOLLOW_22_in_ruleArtifact813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_0_3, grammarAccess.getArtifactAccess().getTypeTcsModelKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArtifactRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_0_3, null);
                      	    
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
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleRule"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:449:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:450:2: (iv_ruleRule= ruleRule EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:451:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule864);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule874); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:458:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:461:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:462:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:462:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:462:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleRule911); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:466:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:467:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:467:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:468:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleRule945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:488:1: ( (lv_filter_3_0= ruleOpDef ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:489:1: (lv_filter_3_0= ruleOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:489:1: (lv_filter_3_0= ruleOpDef )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:490:3: lv_filter_3_0= ruleOpDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleAccess().getFilterOpDefParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOpDef_in_ruleRule966);
            lv_filter_3_0=ruleOpDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleRule978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getRightSquareBracketKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRule990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:514:1: ( (lv_rewritingRules_6_0= ruleRewritingRule ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==51||LA6_0==62||LA6_0==88) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:515:1: (lv_rewritingRules_6_0= ruleRewritingRule )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:515:1: (lv_rewritingRules_6_0= ruleRewritingRule )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:516:3: lv_rewritingRules_6_0= ruleRewritingRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRuleAccess().getRewritingRulesRewritingRuleParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRewritingRule_in_ruleRule1011);
            	    lv_rewritingRules_6_0=ruleRewritingRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleRule1024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:544:1: entryRuleOpDef returns [EObject current=null] : iv_ruleOpDef= ruleOpDef EOF ;
    public final EObject entryRuleOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:545:2: (iv_ruleOpDef= ruleOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:546:2: iv_ruleOpDef= ruleOpDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpDefRule()); 
            }
            pushFollow(FOLLOW_ruleOpDef_in_entryRuleOpDef1060);
            iv_ruleOpDef=ruleOpDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpDef1070); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:553:1: ruleOpDef returns [EObject current=null] : (this_EPackageOpDef_0= ruleEPackageOpDef | this_EClassOpDef_1= ruleEClassOpDef | this_EAttributeOpDef_2= ruleEAttributeOpDef | this_EReferenceOpDef_3= ruleEReferenceOpDef ) ;
    public final EObject ruleOpDef() throws RecognitionException {
        EObject current = null;

        EObject this_EPackageOpDef_0 = null;

        EObject this_EClassOpDef_1 = null;

        EObject this_EAttributeOpDef_2 = null;

        EObject this_EReferenceOpDef_3 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:556:28: ( (this_EPackageOpDef_0= ruleEPackageOpDef | this_EClassOpDef_1= ruleEClassOpDef | this_EAttributeOpDef_2= ruleEAttributeOpDef | this_EReferenceOpDef_3= ruleEReferenceOpDef ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:557:1: (this_EPackageOpDef_0= ruleEPackageOpDef | this_EClassOpDef_1= ruleEClassOpDef | this_EAttributeOpDef_2= ruleEAttributeOpDef | this_EReferenceOpDef_3= ruleEReferenceOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:557:1: (this_EPackageOpDef_0= ruleEPackageOpDef | this_EClassOpDef_1= ruleEClassOpDef | this_EAttributeOpDef_2= ruleEAttributeOpDef | this_EReferenceOpDef_3= ruleEReferenceOpDef )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:558:2: this_EPackageOpDef_0= ruleEPackageOpDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOpDefAccess().getEPackageOpDefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEPackageOpDef_in_ruleOpDef1120);
                    this_EPackageOpDef_0=ruleEPackageOpDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EPackageOpDef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:571:2: this_EClassOpDef_1= ruleEClassOpDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOpDefAccess().getEClassOpDefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEClassOpDef_in_ruleOpDef1150);
                    this_EClassOpDef_1=ruleEClassOpDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EClassOpDef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:584:2: this_EAttributeOpDef_2= ruleEAttributeOpDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOpDefAccess().getEAttributeOpDefParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEAttributeOpDef_in_ruleOpDef1180);
                    this_EAttributeOpDef_2=ruleEAttributeOpDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EAttributeOpDef_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:597:2: this_EReferenceOpDef_3= ruleEReferenceOpDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOpDefAccess().getEReferenceOpDefParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEReferenceOpDef_in_ruleOpDef1210);
                    this_EReferenceOpDef_3=ruleEReferenceOpDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EReferenceOpDef_3; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleOpDef"


    // $ANTLR start "entryRuleEPackageOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:616:1: entryRuleEPackageOpDef returns [EObject current=null] : iv_ruleEPackageOpDef= ruleEPackageOpDef EOF ;
    public final EObject entryRuleEPackageOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackageOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:617:2: (iv_ruleEPackageOpDef= ruleEPackageOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:618:2: iv_ruleEPackageOpDef= ruleEPackageOpDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPackageOpDefRule()); 
            }
            pushFollow(FOLLOW_ruleEPackageOpDef_in_entryRuleEPackageOpDef1245);
            iv_ruleEPackageOpDef=ruleEPackageOpDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPackageOpDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPackageOpDef1255); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:625:1: ruleEPackageOpDef returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' ) ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:628:28: ( ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:629:1: ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:629:1: ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:629:2: (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:629:2: (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:629:4: otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleEPackageOpDef1293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEPackageOpDefAccess().getPackageKeyword_0_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:633:1: ( (lv_var_1_0= rulePackage ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:634:1: (lv_var_1_0= rulePackage )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:634:1: (lv_var_1_0= rulePackage )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:635:3: lv_var_1_0= rulePackage
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEPackageOpDefAccess().getVarPackageParserRuleCall_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePackage_in_ruleEPackageOpDef1314);
            lv_var_1_0=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEPackageOpDef1326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEPackageOpDefAccess().getEqualsSignKeyword_0_2());
                  
            }

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:655:2: ( ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:655:3: ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= rulePackage ) ) otherlv_8= ':' otherlv_9= 'package' otherlv_10= ')' otherlv_11= 'where' otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )* otherlv_15= '}'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:655:3: ( ( (lv_op_3_0= 'changePackage' ) ) | ( (lv_op_4_0= 'addPackage' ) ) | ( (lv_op_5_0= 'deletePackage' ) ) )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:655:4: ( (lv_op_3_0= 'changePackage' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:655:4: ( (lv_op_3_0= 'changePackage' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:656:1: (lv_op_3_0= 'changePackage' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:656:1: (lv_op_3_0= 'changePackage' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:657:3: lv_op_3_0= 'changePackage'
                    {
                    lv_op_3_0=(Token)match(input,28,FOLLOW_28_in_ruleEPackageOpDef1347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_3_0, grammarAccess.getEPackageOpDefAccess().getOpChangePackageKeyword_1_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEPackageOpDefRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_3_0, "changePackage");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:671:6: ( (lv_op_4_0= 'addPackage' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:671:6: ( (lv_op_4_0= 'addPackage' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:672:1: (lv_op_4_0= 'addPackage' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:672:1: (lv_op_4_0= 'addPackage' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:673:3: lv_op_4_0= 'addPackage'
                    {
                    lv_op_4_0=(Token)match(input,29,FOLLOW_29_in_ruleEPackageOpDef1384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_4_0, grammarAccess.getEPackageOpDefAccess().getOpAddPackageKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEPackageOpDefRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_4_0, "addPackage");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:687:6: ( (lv_op_5_0= 'deletePackage' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:687:6: ( (lv_op_5_0= 'deletePackage' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:688:1: (lv_op_5_0= 'deletePackage' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:688:1: (lv_op_5_0= 'deletePackage' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:689:3: lv_op_5_0= 'deletePackage'
                    {
                    lv_op_5_0=(Token)match(input,30,FOLLOW_30_in_ruleEPackageOpDef1421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_5_0, grammarAccess.getEPackageOpDefAccess().getOpDeletePackageKeyword_1_0_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEPackageOpDefRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_5_0, "deletePackage");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleEPackageOpDef1447); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEPackageOpDefAccess().getLeftParenthesisKeyword_1_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:706:1: ( (lv_ref_7_0= rulePackage ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:707:1: (lv_ref_7_0= rulePackage )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:707:1: (lv_ref_7_0= rulePackage )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:708:3: lv_ref_7_0= rulePackage
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEPackageOpDefAccess().getRefPackageParserRuleCall_1_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePackage_in_ruleEPackageOpDef1468);
            lv_ref_7_0=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEPackageOpDef1480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEPackageOpDefAccess().getColonKeyword_1_3());
                  
            }
            otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleEPackageOpDef1492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getEPackageOpDefAccess().getPackageKeyword_1_4());
                  
            }
            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleEPackageOpDef1504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getEPackageOpDefAccess().getRightParenthesisKeyword_1_5());
                  
            }
            otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleEPackageOpDef1516); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getEPackageOpDefAccess().getWhereKeyword_1_6());
                  
            }
            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleEPackageOpDef1528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getEPackageOpDefAccess().getLeftCurlyBracketKeyword_1_7());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:744:1: ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_classes_14_0= ruleEClassOpDef ) ) )*
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
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:744:2: ( (lv_setters_13_0= rulesetterDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:744:2: ( (lv_setters_13_0= rulesetterDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:745:1: (lv_setters_13_0= rulesetterDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:745:1: (lv_setters_13_0= rulesetterDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:746:3: lv_setters_13_0= rulesetterDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEPackageOpDefAccess().getSettersSetterDefParserRuleCall_1_8_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulesetterDef_in_ruleEPackageOpDef1550);
            	    lv_setters_13_0=rulesetterDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;
            	case 2 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:763:6: ( (lv_classes_14_0= ruleEClassOpDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:763:6: ( (lv_classes_14_0= ruleEClassOpDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:764:1: (lv_classes_14_0= ruleEClassOpDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:764:1: (lv_classes_14_0= ruleEClassOpDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:765:3: lv_classes_14_0= ruleEClassOpDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEPackageOpDefAccess().getClassesEClassOpDefParserRuleCall_1_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEClassOpDef_in_ruleEPackageOpDef1577);
            	    lv_classes_14_0=ruleEClassOpDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleEPackageOpDef1591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getEPackageOpDefAccess().getRightCurlyBracketKeyword_1_9());
                  
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
    // $ANTLR end "ruleEPackageOpDef"


    // $ANTLR start "entryRuleEClassOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:793:1: entryRuleEClassOpDef returns [EObject current=null] : iv_ruleEClassOpDef= ruleEClassOpDef EOF ;
    public final EObject entryRuleEClassOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClassOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:794:2: (iv_ruleEClassOpDef= ruleEClassOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:795:2: iv_ruleEClassOpDef= ruleEClassOpDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEClassOpDefRule()); 
            }
            pushFollow(FOLLOW_ruleEClassOpDef_in_entryRuleEClassOpDef1628);
            iv_ruleEClassOpDef=ruleEClassOpDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEClassOpDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEClassOpDef1638); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:802:1: ruleEClassOpDef returns [EObject current=null] : ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) ) ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:805:28: ( ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:806:1: ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:806:1: ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:806:2: (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:806:2: (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:806:4: otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleEClassOpDef1676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEClassOpDefAccess().getClassKeyword_0_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:810:1: ( (lv_var_1_0= ruleClass ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:811:1: (lv_var_1_0= ruleClass )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:811:1: (lv_var_1_0= ruleClass )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:812:3: lv_var_1_0= ruleClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getVarClassParserRuleCall_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleClass_in_ruleEClassOpDef1697);
            lv_var_1_0=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEClassOpDef1709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEClassOpDefAccess().getEqualsSignKeyword_0_2());
                  
            }

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:832:2: ( ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:832:3: ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleClass ) ) otherlv_8= ':' otherlv_9= 'class' otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:832:3: ( ( (lv_op_3_0= 'changeClass' ) ) | ( (lv_op_4_0= 'addClass' ) ) | ( (lv_op_5_0= 'deleteClass' ) ) )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:832:4: ( (lv_op_3_0= 'changeClass' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:832:4: ( (lv_op_3_0= 'changeClass' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:833:1: (lv_op_3_0= 'changeClass' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:833:1: (lv_op_3_0= 'changeClass' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:834:3: lv_op_3_0= 'changeClass'
                    {
                    lv_op_3_0=(Token)match(input,35,FOLLOW_35_in_ruleEClassOpDef1730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_3_0, grammarAccess.getEClassOpDefAccess().getOpChangeClassKeyword_1_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEClassOpDefRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_3_0, "changeClass");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:848:6: ( (lv_op_4_0= 'addClass' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:848:6: ( (lv_op_4_0= 'addClass' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:849:1: (lv_op_4_0= 'addClass' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:849:1: (lv_op_4_0= 'addClass' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:850:3: lv_op_4_0= 'addClass'
                    {
                    lv_op_4_0=(Token)match(input,36,FOLLOW_36_in_ruleEClassOpDef1767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_4_0, grammarAccess.getEClassOpDefAccess().getOpAddClassKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEClassOpDefRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_4_0, "addClass");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:864:6: ( (lv_op_5_0= 'deleteClass' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:864:6: ( (lv_op_5_0= 'deleteClass' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:865:1: (lv_op_5_0= 'deleteClass' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:865:1: (lv_op_5_0= 'deleteClass' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:866:3: lv_op_5_0= 'deleteClass'
                    {
                    lv_op_5_0=(Token)match(input,37,FOLLOW_37_in_ruleEClassOpDef1804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_5_0, grammarAccess.getEClassOpDefAccess().getOpDeleteClassKeyword_1_0_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEClassOpDefRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_5_0, "deleteClass");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleEClassOpDef1830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEClassOpDefAccess().getLeftParenthesisKeyword_1_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:883:1: ( (lv_ref_7_0= ruleClass ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:884:1: (lv_ref_7_0= ruleClass )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:884:1: (lv_ref_7_0= ruleClass )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:885:3: lv_ref_7_0= ruleClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getRefClassParserRuleCall_1_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleClass_in_ruleEClassOpDef1851);
            lv_ref_7_0=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEClassOpDef1863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEClassOpDefAccess().getColonKeyword_1_3());
                  
            }
            otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleEClassOpDef1875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getEClassOpDefAccess().getClassKeyword_1_4());
                  
            }
            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleEClassOpDef1887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getEClassOpDefAccess().getRightParenthesisKeyword_1_5());
                  
            }
            otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleEClassOpDef1899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getEClassOpDefAccess().getWhereKeyword_1_6());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:917:1: (otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:917:3: otherlv_12= '{' ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )* otherlv_16= '}'
            {
            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleEClassOpDef1912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getEClassOpDefAccess().getLeftCurlyBracketKeyword_1_7_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:921:1: ( ( (lv_setters_13_0= rulesetterDef ) ) | ( (lv_attributes_14_0= ruleEAttributeOpDef ) ) | ( (lv_references_15_0= ruleEReferenceOpDef ) ) )*
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
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:921:2: ( (lv_setters_13_0= rulesetterDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:921:2: ( (lv_setters_13_0= rulesetterDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:922:1: (lv_setters_13_0= rulesetterDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:922:1: (lv_setters_13_0= rulesetterDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:923:3: lv_setters_13_0= rulesetterDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getSettersSetterDefParserRuleCall_1_7_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulesetterDef_in_ruleEClassOpDef1934);
            	    lv_setters_13_0=rulesetterDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;
            	case 2 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:940:6: ( (lv_attributes_14_0= ruleEAttributeOpDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:940:6: ( (lv_attributes_14_0= ruleEAttributeOpDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:941:1: (lv_attributes_14_0= ruleEAttributeOpDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:941:1: (lv_attributes_14_0= ruleEAttributeOpDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:942:3: lv_attributes_14_0= ruleEAttributeOpDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getAttributesEAttributeOpDefParserRuleCall_1_7_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEAttributeOpDef_in_ruleEClassOpDef1961);
            	    lv_attributes_14_0=ruleEAttributeOpDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;
            	case 3 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:959:6: ( (lv_references_15_0= ruleEReferenceOpDef ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:959:6: ( (lv_references_15_0= ruleEReferenceOpDef ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:960:1: (lv_references_15_0= ruleEReferenceOpDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:960:1: (lv_references_15_0= ruleEReferenceOpDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:961:3: lv_references_15_0= ruleEReferenceOpDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEClassOpDefAccess().getReferencesEReferenceOpDefParserRuleCall_1_7_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEReferenceOpDef_in_ruleEClassOpDef1988);
            	    lv_references_15_0=ruleEReferenceOpDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_16=(Token)match(input,13,FOLLOW_13_in_ruleEClassOpDef2002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getEClassOpDefAccess().getRightCurlyBracketKeyword_1_7_2());
                  
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
    // $ANTLR end "ruleEClassOpDef"


    // $ANTLR start "entryRuleEAttributeOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:989:1: entryRuleEAttributeOpDef returns [EObject current=null] : iv_ruleEAttributeOpDef= ruleEAttributeOpDef EOF ;
    public final EObject entryRuleEAttributeOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:990:2: (iv_ruleEAttributeOpDef= ruleEAttributeOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:991:2: iv_ruleEAttributeOpDef= ruleEAttributeOpDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEAttributeOpDefRule()); 
            }
            pushFollow(FOLLOW_ruleEAttributeOpDef_in_entryRuleEAttributeOpDef2040);
            iv_ruleEAttributeOpDef=ruleEAttributeOpDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEAttributeOpDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEAttributeOpDef2050); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:998:1: ruleEAttributeOpDef returns [EObject current=null] : ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) ) ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1001:28: ( ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1002:1: ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1002:1: ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1002:2: (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1002:2: (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1002:4: otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleEAttributeOpDef2088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEAttributeOpDefAccess().getAttributeKeyword_0_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1006:1: ( (lv_var_1_0= ruleAttribute ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1007:1: (lv_var_1_0= ruleAttribute )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1007:1: (lv_var_1_0= ruleAttribute )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1008:3: lv_var_1_0= ruleAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEAttributeOpDefAccess().getVarAttributeParserRuleCall_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAttribute_in_ruleEAttributeOpDef2109);
            lv_var_1_0=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEAttributeOpDef2121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEAttributeOpDefAccess().getEqualsSignKeyword_0_2());
                  
            }

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1028:2: ( ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1028:3: ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' ) otherlv_10= ')' otherlv_11= 'where' ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1028:3: ( ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1028:4: ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleAttribute ) ) otherlv_8= ':' otherlv_9= 'attribute'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1028:4: ( ( (lv_op_3_0= 'changeEAttribute' ) ) | ( (lv_op_4_0= 'addEAttribute' ) ) | ( (lv_op_5_0= 'deleteEAttribute' ) ) )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1028:5: ( (lv_op_3_0= 'changeEAttribute' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1028:5: ( (lv_op_3_0= 'changeEAttribute' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1029:1: (lv_op_3_0= 'changeEAttribute' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1029:1: (lv_op_3_0= 'changeEAttribute' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1030:3: lv_op_3_0= 'changeEAttribute'
                    {
                    lv_op_3_0=(Token)match(input,39,FOLLOW_39_in_ruleEAttributeOpDef2143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_3_0, grammarAccess.getEAttributeOpDefAccess().getOpChangeEAttributeKeyword_1_0_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeOpDefRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_3_0, "changeEAttribute");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1044:6: ( (lv_op_4_0= 'addEAttribute' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1044:6: ( (lv_op_4_0= 'addEAttribute' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1045:1: (lv_op_4_0= 'addEAttribute' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1045:1: (lv_op_4_0= 'addEAttribute' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1046:3: lv_op_4_0= 'addEAttribute'
                    {
                    lv_op_4_0=(Token)match(input,40,FOLLOW_40_in_ruleEAttributeOpDef2180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_4_0, grammarAccess.getEAttributeOpDefAccess().getOpAddEAttributeKeyword_1_0_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeOpDefRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_4_0, "addEAttribute");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1060:6: ( (lv_op_5_0= 'deleteEAttribute' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1060:6: ( (lv_op_5_0= 'deleteEAttribute' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1061:1: (lv_op_5_0= 'deleteEAttribute' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1061:1: (lv_op_5_0= 'deleteEAttribute' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1062:3: lv_op_5_0= 'deleteEAttribute'
                    {
                    lv_op_5_0=(Token)match(input,41,FOLLOW_41_in_ruleEAttributeOpDef2217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_5_0, grammarAccess.getEAttributeOpDefAccess().getOpDeleteEAttributeKeyword_1_0_0_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeOpDefRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_5_0, "deleteEAttribute");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleEAttributeOpDef2243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEAttributeOpDefAccess().getLeftParenthesisKeyword_1_0_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1079:1: ( (lv_ref_7_0= ruleAttribute ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1080:1: (lv_ref_7_0= ruleAttribute )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1080:1: (lv_ref_7_0= ruleAttribute )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1081:3: lv_ref_7_0= ruleAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEAttributeOpDefAccess().getRefAttributeParserRuleCall_1_0_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAttribute_in_ruleEAttributeOpDef2264);
            lv_ref_7_0=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEAttributeOpDef2276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEAttributeOpDefAccess().getColonKeyword_1_0_3());
                  
            }
            otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleEAttributeOpDef2288); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getEAttributeOpDefAccess().getAttributeKeyword_1_0_4());
                  
            }

            }

            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleEAttributeOpDef2301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getEAttributeOpDefAccess().getRightParenthesisKeyword_1_1());
                  
            }
            otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleEAttributeOpDef2313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getEAttributeOpDefAccess().getWhereKeyword_1_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1113:1: ( (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) | otherlv_15= ';' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            else if ( (LA14_0==15) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1113:2: (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1113:2: (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1113:4: otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleEAttributeOpDef2327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getEAttributeOpDefAccess().getLeftCurlyBracketKeyword_1_3_0_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1117:1: ( (lv_setters_13_0= rulesetterDef ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==46) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1118:1: (lv_setters_13_0= rulesetterDef )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1118:1: (lv_setters_13_0= rulesetterDef )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1119:3: lv_setters_13_0= rulesetterDef
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEAttributeOpDefAccess().getSettersSetterDefParserRuleCall_1_3_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulesetterDef_in_ruleEAttributeOpDef2348);
                    	    lv_setters_13_0=rulesetterDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleEAttributeOpDef2361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getEAttributeOpDefAccess().getRightCurlyBracketKeyword_1_3_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1140:7: otherlv_15= ';'
                    {
                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleEAttributeOpDef2380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getEAttributeOpDefAccess().getSemicolonKeyword_1_3_1());
                          
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
    // $ANTLR end "ruleEAttributeOpDef"


    // $ANTLR start "entryRuleEReferenceOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1152:1: entryRuleEReferenceOpDef returns [EObject current=null] : iv_ruleEReferenceOpDef= ruleEReferenceOpDef EOF ;
    public final EObject entryRuleEReferenceOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReferenceOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1153:2: (iv_ruleEReferenceOpDef= ruleEReferenceOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1154:2: iv_ruleEReferenceOpDef= ruleEReferenceOpDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEReferenceOpDefRule()); 
            }
            pushFollow(FOLLOW_ruleEReferenceOpDef_in_entryRuleEReferenceOpDef2418);
            iv_ruleEReferenceOpDef=ruleEReferenceOpDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEReferenceOpDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEReferenceOpDef2428); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1161:1: ruleEReferenceOpDef returns [EObject current=null] : ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) ) ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1164:28: ( ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1165:1: ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1165:1: ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1165:2: (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1165:2: (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1165:4: otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleEReferenceOpDef2466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEReferenceOpDefAccess().getReferenceKeyword_0_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1169:1: ( (lv_var_1_0= ruleReference ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1170:1: (lv_var_1_0= ruleReference )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1170:1: (lv_var_1_0= ruleReference )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1171:3: lv_var_1_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEReferenceOpDefAccess().getVarReferenceParserRuleCall_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleEReferenceOpDef2487);
            lv_var_1_0=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEReferenceOpDef2499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEReferenceOpDefAccess().getEqualsSignKeyword_0_2());
                  
            }

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1191:2: ( ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1191:3: ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' ) otherlv_10= ')' otherlv_11= 'where' (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1191:3: ( ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1191:4: ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) ) otherlv_6= '(' ( (lv_ref_7_0= ruleReference ) ) otherlv_8= ':' otherlv_9= 'reference'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1191:4: ( ( (lv_op_3_0= 'changeEReference' ) ) | ( (lv_op_4_0= 'addEReference' ) ) | ( (lv_op_5_0= 'deleteEReference' ) ) )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1191:5: ( (lv_op_3_0= 'changeEReference' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1191:5: ( (lv_op_3_0= 'changeEReference' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1192:1: (lv_op_3_0= 'changeEReference' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1192:1: (lv_op_3_0= 'changeEReference' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1193:3: lv_op_3_0= 'changeEReference'
                    {
                    lv_op_3_0=(Token)match(input,43,FOLLOW_43_in_ruleEReferenceOpDef2521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_3_0, grammarAccess.getEReferenceOpDefAccess().getOpChangeEReferenceKeyword_1_0_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEReferenceOpDefRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_3_0, "changeEReference");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1207:6: ( (lv_op_4_0= 'addEReference' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1207:6: ( (lv_op_4_0= 'addEReference' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1208:1: (lv_op_4_0= 'addEReference' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1208:1: (lv_op_4_0= 'addEReference' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1209:3: lv_op_4_0= 'addEReference'
                    {
                    lv_op_4_0=(Token)match(input,44,FOLLOW_44_in_ruleEReferenceOpDef2558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_4_0, grammarAccess.getEReferenceOpDefAccess().getOpAddEReferenceKeyword_1_0_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEReferenceOpDefRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_4_0, "addEReference");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1223:6: ( (lv_op_5_0= 'deleteEReference' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1223:6: ( (lv_op_5_0= 'deleteEReference' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1224:1: (lv_op_5_0= 'deleteEReference' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1224:1: (lv_op_5_0= 'deleteEReference' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1225:3: lv_op_5_0= 'deleteEReference'
                    {
                    lv_op_5_0=(Token)match(input,45,FOLLOW_45_in_ruleEReferenceOpDef2595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_5_0, grammarAccess.getEReferenceOpDefAccess().getOpDeleteEReferenceKeyword_1_0_0_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEReferenceOpDefRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_5_0, "deleteEReference");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleEReferenceOpDef2621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEReferenceOpDefAccess().getLeftParenthesisKeyword_1_0_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1242:1: ( (lv_ref_7_0= ruleReference ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1243:1: (lv_ref_7_0= ruleReference )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1243:1: (lv_ref_7_0= ruleReference )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1244:3: lv_ref_7_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEReferenceOpDefAccess().getRefReferenceParserRuleCall_1_0_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleEReferenceOpDef2642);
            lv_ref_7_0=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEReferenceOpDef2654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEReferenceOpDefAccess().getColonKeyword_1_0_3());
                  
            }
            otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleEReferenceOpDef2666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getEReferenceOpDefAccess().getReferenceKeyword_1_0_4());
                  
            }

            }

            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleEReferenceOpDef2679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getEReferenceOpDefAccess().getRightParenthesisKeyword_1_1());
                  
            }
            otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleEReferenceOpDef2691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getEReferenceOpDefAccess().getWhereKeyword_1_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1276:1: (otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1276:3: otherlv_12= '{' ( (lv_setters_13_0= rulesetterDef ) )* otherlv_14= '}'
            {
            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleEReferenceOpDef2704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getEReferenceOpDefAccess().getLeftCurlyBracketKeyword_1_3_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1280:1: ( (lv_setters_13_0= rulesetterDef ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==46) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1281:1: (lv_setters_13_0= rulesetterDef )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1281:1: (lv_setters_13_0= rulesetterDef )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1282:3: lv_setters_13_0= rulesetterDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEReferenceOpDefAccess().getSettersSetterDefParserRuleCall_1_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulesetterDef_in_ruleEReferenceOpDef2725);
            	    lv_setters_13_0=rulesetterDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleEReferenceOpDef2738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getEReferenceOpDefAccess().getRightCurlyBracketKeyword_1_3_2());
                  
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
    // $ANTLR end "ruleEReferenceOpDef"


    // $ANTLR start "entryRulesetterDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1310:1: entryRulesetterDef returns [EObject current=null] : iv_rulesetterDef= rulesetterDef EOF ;
    public final EObject entryRulesetterDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesetterDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1311:2: (iv_rulesetterDef= rulesetterDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1312:2: iv_rulesetterDef= rulesetterDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetterDefRule()); 
            }
            pushFollow(FOLLOW_rulesetterDef_in_entryRulesetterDef2776);
            iv_rulesetterDef=rulesetterDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesetterDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesetterDef2786); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1319:1: rulesetterDef returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1322:28: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1323:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1323:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1323:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_rulesetterDef2823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSetterDefAccess().getSetKeyword_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1327:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1328:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1328:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1329:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSetterDefRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesetterDef2847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getSetterDefAccess().getMetafeatureEStructuralFeatureCrossReference_1_0()); 
              	
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1343:2: ( (lv_operator_2_0= '=' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1344:1: (lv_operator_2_0= '=' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1344:1: (lv_operator_2_0= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1345:3: lv_operator_2_0= '='
            {
            lv_operator_2_0=(Token)match(input,27,FOLLOW_27_in_rulesetterDef2865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_operator_2_0, grammarAccess.getSetterDefAccess().getOperatorEqualsSignKeyword_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSetterDefRule());
              	        }
                     		setWithLastConsumed(current, "operator", lv_operator_2_0, "=");
              	    
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1358:2: ( (lv_par_3_0= ruleParameter ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1359:1: (lv_par_3_0= ruleParameter )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1359:1: (lv_par_3_0= ruleParameter )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1360:3: lv_par_3_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetterDefAccess().getParParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameter_in_rulesetterDef2899);
            lv_par_3_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1376:2: (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1376:4: otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulesetterDef2912); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getSetterDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1380:1: ( (lv_par_5_0= ruleParameter ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1381:1: (lv_par_5_0= ruleParameter )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1381:1: (lv_par_5_0= ruleParameter )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1382:3: lv_par_5_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSetterDefAccess().getParParameterParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_rulesetterDef2933);
            	    lv_par_5_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_rulesetterDef2947); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSetterDefAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "rulesetterDef"


    // $ANTLR start "entryRuleRewritingRule"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1410:1: entryRuleRewritingRule returns [EObject current=null] : iv_ruleRewritingRule= ruleRewritingRule EOF ;
    public final EObject entryRuleRewritingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewritingRule = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1411:2: (iv_ruleRewritingRule= ruleRewritingRule EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1412:2: iv_ruleRewritingRule= ruleRewritingRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRewritingRuleRule()); 
            }
            pushFollow(FOLLOW_ruleRewritingRule_in_entryRuleRewritingRule2983);
            iv_ruleRewritingRule=ruleRewritingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRewritingRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRewritingRule2993); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1419:1: ruleRewritingRule returns [EObject current=null] : ( ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1422:28: ( ( ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1423:1: ( ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1423:1: ( ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1423:2: ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )*
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1423:2: ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1423:3: ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1423:3: ( (lv_migratorsSX_0_0= ruleMigratorSX ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1424:1: (lv_migratorsSX_0_0= ruleMigratorSX )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1424:1: (lv_migratorsSX_0_0= ruleMigratorSX )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1425:3: lv_migratorsSX_0_0= ruleMigratorSX
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorsSXMigratorSXParserRuleCall_0_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMigratorSX_in_ruleRewritingRule3040);
            lv_migratorsSX_0_0=ruleMigratorSX();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleRewritingRule3052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1445:1: ( (lv_migratorDX_2_0= ruleMigratorDX ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1446:1: (lv_migratorDX_2_0= ruleMigratorDX )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1446:1: (lv_migratorDX_2_0= ruleMigratorDX )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1447:3: lv_migratorDX_2_0= ruleMigratorDX
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_0_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMigratorDX_in_ruleRewritingRule3073);
            lv_migratorDX_2_0=ruleMigratorDX();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1463:3: (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==48) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1463:5: otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) )
            	    {
            	    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleRewritingRule3087); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRewritingRuleAccess().getAmpersandKeyword_1_0());
            	          
            	    }
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1467:1: ( (lv_migratorSX_4_0= ruleMigratorSX ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1468:1: (lv_migratorSX_4_0= ruleMigratorSX )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1468:1: (lv_migratorSX_4_0= ruleMigratorSX )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1469:3: lv_migratorSX_4_0= ruleMigratorSX
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorSXMigratorSXParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMigratorSX_in_ruleRewritingRule3108);
            	    lv_migratorSX_4_0=ruleMigratorSX();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleRewritingRule3120); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_1_2());
            	          
            	    }
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1489:1: ( (lv_migratorDX_6_0= ruleMigratorDX ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1490:1: (lv_migratorDX_6_0= ruleMigratorDX )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1490:1: (lv_migratorDX_6_0= ruleMigratorDX )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1491:3: lv_migratorDX_6_0= ruleMigratorDX
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMigratorDX_in_ruleRewritingRule3141);
            	    lv_migratorDX_6_0=ruleMigratorDX();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "ruleRewritingRule"


    // $ANTLR start "entryRuleMigratorSX"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1517:1: entryRuleMigratorSX returns [EObject current=null] : iv_ruleMigratorSX= ruleMigratorSX EOF ;
    public final EObject entryRuleMigratorSX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigratorSX = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1518:2: (iv_ruleMigratorSX= ruleMigratorSX EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1519:2: iv_ruleMigratorSX= ruleMigratorSX EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigratorSXRule()); 
            }
            pushFollow(FOLLOW_ruleMigratorSX_in_entryRuleMigratorSX3181);
            iv_ruleMigratorSX=ruleMigratorSX();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigratorSX; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigratorSX3191); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1526:1: ruleMigratorSX returns [EObject current=null] : ( () ( (lv_name_1_0= ruleVariableDeclaration ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']' ) ;
    public final EObject ruleMigratorSX() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_name_1_0 = null;

        EObject lv_filterSX_6_0 = null;

        EObject lv_filterSX_8_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1529:28: ( ( () ( (lv_name_1_0= ruleVariableDeclaration ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1530:1: ( () ( (lv_name_1_0= ruleVariableDeclaration ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1530:1: ( () ( (lv_name_1_0= ruleVariableDeclaration ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1530:2: () ( (lv_name_1_0= ruleVariableDeclaration ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'where' otherlv_5= '[' ( (lv_filterSX_6_0= ruleFilterMigrator ) ) (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )* otherlv_9= ']'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1530:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1531:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMigratorSXAccess().getMigratorSXAction_0(),
                          current);
                  
            }

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1539:2: ( (lv_name_1_0= ruleVariableDeclaration ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1540:1: (lv_name_1_0= ruleVariableDeclaration )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1540:1: (lv_name_1_0= ruleVariableDeclaration )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1541:3: lv_name_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMigratorSXAccess().getNameVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleMigratorSX3249);
            lv_name_1_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMigratorSXRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"VariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleMigratorSX3261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMigratorSXAccess().getColonKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1561:1: ( (otherlv_3= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1562:1: (otherlv_3= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1562:1: (otherlv_3= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1563:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMigratorSXRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorSX3285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getMigratorSXAccess().getElementSXEClassCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleMigratorSX3297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMigratorSXAccess().getWhereKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleMigratorSX3309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMigratorSXAccess().getLeftSquareBracketKeyword_5());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1585:1: ( (lv_filterSX_6_0= ruleFilterMigrator ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1586:1: (lv_filterSX_6_0= ruleFilterMigrator )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1586:1: (lv_filterSX_6_0= ruleFilterMigrator )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1587:3: lv_filterSX_6_0= ruleFilterMigrator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorSX3330);
            lv_filterSX_6_0=ruleFilterMigrator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1603:2: (otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==48) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1603:4: otherlv_7= '&' ( (lv_filterSX_8_0= ruleFilterMigrator ) )
            	    {
            	    otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleMigratorSX3343); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMigratorSXAccess().getAmpersandKeyword_7_0());
            	          
            	    }
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1607:1: ( (lv_filterSX_8_0= ruleFilterMigrator ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1608:1: (lv_filterSX_8_0= ruleFilterMigrator )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1608:1: (lv_filterSX_8_0= ruleFilterMigrator )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1609:3: lv_filterSX_8_0= ruleFilterMigrator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorSX3364);
            	    lv_filterSX_8_0=ruleFilterMigrator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleMigratorSX3378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getMigratorSXAccess().getRightSquareBracketKeyword_8());
                  
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
    // $ANTLR end "ruleMigratorSX"


    // $ANTLR start "entryRuleMigratorDX"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1637:1: entryRuleMigratorDX returns [EObject current=null] : iv_ruleMigratorDX= ruleMigratorDX EOF ;
    public final EObject entryRuleMigratorDX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigratorDX = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1638:2: (iv_ruleMigratorDX= ruleMigratorDX EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1639:2: iv_ruleMigratorDX= ruleMigratorDX EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigratorDXRule()); 
            }
            pushFollow(FOLLOW_ruleMigratorDX_in_entryRuleMigratorDX3414);
            iv_ruleMigratorDX=ruleMigratorDX();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigratorDX; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigratorDX3424); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1646:1: ruleMigratorDX returns [EObject current=null] : ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) ) | otherlv_9= 'null' ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1649:28: ( ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) ) | otherlv_9= 'null' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1650:1: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) ) | otherlv_9= 'null' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1650:1: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) ) | otherlv_9= 'null' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==49) ) {
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
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1650:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1650:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1650:3: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1650:3: ()
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1651:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMigratorDXAccess().getMigratorDXAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1659:2: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1659:3: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']'
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1659:3: ( (lv_name_1_0= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1660:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1660:1: (lv_name_1_0= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1661:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorDX3480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getMigratorDXAccess().getNameIDTerminalRuleCall_0_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleMigratorDX3497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMigratorDXAccess().getColonKeyword_0_1_1());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1681:1: ( (otherlv_3= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1682:1: (otherlv_3= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1682:1: (otherlv_3= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1683:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMigratorDXRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorDX3521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getMigratorDXAccess().getElementDXEClassCrossReference_0_1_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleMigratorDX3533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMigratorDXAccess().getLeftSquareBracketKeyword_0_1_3());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1701:1: ( (lv_filterDX_5_0= ruleFilterMigrator ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1702:1: (lv_filterDX_5_0= ruleFilterMigrator )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1702:1: (lv_filterDX_5_0= ruleFilterMigrator )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1703:3: lv_filterDX_5_0= ruleFilterMigrator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorDX3554);
                    lv_filterDX_5_0=ruleFilterMigrator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1719:2: (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==48) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1719:4: otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) )
                    	    {
                    	    otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleMigratorDX3567); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getMigratorDXAccess().getAmpersandKeyword_0_1_5_0());
                    	          
                    	    }
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1723:1: ( (lv_filterDX_7_0= ruleFilterMigrator ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1724:1: (lv_filterDX_7_0= ruleFilterMigrator )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1724:1: (lv_filterDX_7_0= ruleFilterMigrator )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1725:3: lv_filterDX_7_0= ruleFilterMigrator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_1_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorDX3588);
                    	    lv_filterDX_7_0=ruleFilterMigrator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleMigratorDX3602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getMigratorDXAccess().getRightSquareBracketKeyword_0_1_6());
                          
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1746:7: otherlv_9= 'null'
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_49_in_ruleMigratorDX3622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getMigratorDXAccess().getNullKeyword_1());
                          
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
    // $ANTLR end "ruleMigratorDX"


    // $ANTLR start "entryRuleFilterMigrator"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1758:1: entryRuleFilterMigrator returns [EObject current=null] : iv_ruleFilterMigrator= ruleFilterMigrator EOF ;
    public final EObject entryRuleFilterMigrator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterMigrator = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1759:2: (iv_ruleFilterMigrator= ruleFilterMigrator EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1760:2: iv_ruleFilterMigrator= ruleFilterMigrator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterMigratorRule()); 
            }
            pushFollow(FOLLOW_ruleFilterMigrator_in_entryRuleFilterMigrator3658);
            iv_ruleFilterMigrator=ruleFilterMigrator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilterMigrator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterMigrator3668); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1767:1: ruleFilterMigrator returns [EObject current=null] : ( (lv_specification_0_0= ruleOclExpression ) )? ;
    public final EObject ruleFilterMigrator() throws RecognitionException {
        EObject current = null;

        EObject lv_specification_0_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1770:28: ( ( (lv_specification_0_0= ruleOclExpression ) )? )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1771:1: ( (lv_specification_0_0= ruleOclExpression ) )?
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1771:1: ( (lv_specification_0_0= ruleOclExpression ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==51||LA22_0==53||(LA22_0>=55 && LA22_0<=64)||LA22_0==66||LA22_0==68||LA22_0==70||(LA22_0>=74 && LA22_0<=78)||(LA22_0>=81 && LA22_0<=85)||(LA22_0>=90 && LA22_0<=92)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1772:1: (lv_specification_0_0= ruleOclExpression )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1772:1: (lv_specification_0_0= ruleOclExpression )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1773:3: lv_specification_0_0= ruleOclExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFilterMigratorAccess().getSpecificationOclExpressionParserRuleCall_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclExpression_in_ruleFilterMigrator3713);
                    lv_specification_0_0=ruleOclExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFilterMigratorRule());
                      	        }
                             		set(
                             			current, 
                             			"specification",
                              		lv_specification_0_0, 
                              		"OclExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleFilterMigrator"


    // $ANTLR start "entryRuleParameter"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1801:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1802:2: (iv_ruleParameter= ruleParameter EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1803:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3753);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3763); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1810:1: ruleParameter returns [EObject current=null] : (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1813:28: ( (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1814:1: (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1814:1: (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1814:3: otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleParameter3800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getPercentSignKeyword_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1818:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1819:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1819:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1820:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


    // $ANTLR start "entryRulePackage"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1844:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1845:2: (iv_rulePackage= rulePackage EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1846:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage3858);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage3868); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1853:1: rulePackage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1856:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1857:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1857:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1857:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1857:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1858:2: 
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

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1866:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1867:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1867:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1868:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage3922); if (state.failed) return current;
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


    // $ANTLR start "entryRuleClass"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1892:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1893:2: (iv_ruleClass= ruleClass EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1894:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass3963);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass3973); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1901:1: ruleClass returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1904:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1905:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1905:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1905:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1905:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1906:2: 
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

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1914:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1915:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1915:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1916:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass4027); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAttribute"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1940:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1941:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1942:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4068);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4078); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1949:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1952:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1953:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1953:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1953:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1953:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1954:2: 
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

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1962:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1963:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1963:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1964:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute4132); if (state.failed) return current;
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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1988:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1989:2: (iv_ruleReference= ruleReference EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1990:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference4173);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference4183); if (state.failed) return current;

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:1997:1: ruleReference returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2000:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2001:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2001:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2001:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2001:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2002:2: 
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

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2010:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2011:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2011:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2012:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference4237); if (state.failed) return current;
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


    // $ANTLR start "entryRuleOclFeature"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2038:1: entryRuleOclFeature returns [EObject current=null] : iv_ruleOclFeature= ruleOclFeature EOF ;
    public final EObject entryRuleOclFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclFeature = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2039:2: (iv_ruleOclFeature= ruleOclFeature EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2040:2: iv_ruleOclFeature= ruleOclFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleOclFeature_in_entryRuleOclFeature4280);
            iv_ruleOclFeature=ruleOclFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOclFeature4290); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOclFeature"


    // $ANTLR start "ruleOclFeature"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2047:1: ruleOclFeature returns [EObject current=null] : (this_OclAttribute_0= ruleOclAttribute | this_Operation_1= ruleOperation ) ;
    public final EObject ruleOclFeature() throws RecognitionException {
        EObject current = null;

        EObject this_OclAttribute_0 = null;

        EObject this_Operation_1 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2050:28: ( (this_OclAttribute_0= ruleOclAttribute | this_Operation_1= ruleOperation ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2051:1: (this_OclAttribute_0= ruleOclAttribute | this_Operation_1= ruleOperation )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2051:1: (this_OclAttribute_0= ruleOclAttribute | this_Operation_1= ruleOperation )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==17) ) {
                    alt23=1;
                }
                else if ( (LA23_1==31) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2052:2: this_OclAttribute_0= ruleOclAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclFeatureAccess().getOclAttributeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOclAttribute_in_ruleOclFeature4340);
                    this_OclAttribute_0=ruleOclAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OclAttribute_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2065:2: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclFeatureAccess().getOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleOclFeature4370);
                    this_Operation_1=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Operation_1; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleOclFeature"


    // $ANTLR start "entryRuleOclType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2084:1: entryRuleOclType returns [EObject current=null] : iv_ruleOclType= ruleOclType EOF ;
    public final EObject entryRuleOclType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclType = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2085:2: (iv_ruleOclType= ruleOclType EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2086:2: iv_ruleOclType= ruleOclType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclTypeRule()); 
            }
            pushFollow(FOLLOW_ruleOclType_in_entryRuleOclType4405);
            iv_ruleOclType=ruleOclType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOclType4415); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOclType"


    // $ANTLR start "ruleOclType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2093:1: ruleOclType returns [EObject current=null] : (this_OclType_Impl_0= ruleOclType_Impl | this_CollectionType_Impl_1= ruleCollectionType_Impl | this_StringType_2= ruleStringType | this_BooleanType_3= ruleBooleanType | this_IntegerType_4= ruleIntegerType | this_RealType_5= ruleRealType | this_BagType_6= ruleBagType | this_OrderedSetType_7= ruleOrderedSetType | this_SequenceType_8= ruleSequenceType | this_SetType_9= ruleSetType | this_OclAnyType_10= ruleOclAnyType | this_TupleType_11= ruleTupleType | this_OclModelElement_12= ruleOclModelElement | this_MapType_13= ruleMapType ) ;
    public final EObject ruleOclType() throws RecognitionException {
        EObject current = null;

        EObject this_OclType_Impl_0 = null;

        EObject this_CollectionType_Impl_1 = null;

        EObject this_StringType_2 = null;

        EObject this_BooleanType_3 = null;

        EObject this_IntegerType_4 = null;

        EObject this_RealType_5 = null;

        EObject this_BagType_6 = null;

        EObject this_OrderedSetType_7 = null;

        EObject this_SequenceType_8 = null;

        EObject this_SetType_9 = null;

        EObject this_OclAnyType_10 = null;

        EObject this_TupleType_11 = null;

        EObject this_OclModelElement_12 = null;

        EObject this_MapType_13 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2096:28: ( (this_OclType_Impl_0= ruleOclType_Impl | this_CollectionType_Impl_1= ruleCollectionType_Impl | this_StringType_2= ruleStringType | this_BooleanType_3= ruleBooleanType | this_IntegerType_4= ruleIntegerType | this_RealType_5= ruleRealType | this_BagType_6= ruleBagType | this_OrderedSetType_7= ruleOrderedSetType | this_SequenceType_8= ruleSequenceType | this_SetType_9= ruleSetType | this_OclAnyType_10= ruleOclAnyType | this_TupleType_11= ruleTupleType | this_OclModelElement_12= ruleOclModelElement | this_MapType_13= ruleMapType ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2097:1: (this_OclType_Impl_0= ruleOclType_Impl | this_CollectionType_Impl_1= ruleCollectionType_Impl | this_StringType_2= ruleStringType | this_BooleanType_3= ruleBooleanType | this_IntegerType_4= ruleIntegerType | this_RealType_5= ruleRealType | this_BagType_6= ruleBagType | this_OrderedSetType_7= ruleOrderedSetType | this_SequenceType_8= ruleSequenceType | this_SetType_9= ruleSetType | this_OclAnyType_10= ruleOclAnyType | this_TupleType_11= ruleTupleType | this_OclModelElement_12= ruleOclModelElement | this_MapType_13= ruleMapType )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2097:1: (this_OclType_Impl_0= ruleOclType_Impl | this_CollectionType_Impl_1= ruleCollectionType_Impl | this_StringType_2= ruleStringType | this_BooleanType_3= ruleBooleanType | this_IntegerType_4= ruleIntegerType | this_RealType_5= ruleRealType | this_BagType_6= ruleBagType | this_OrderedSetType_7= ruleOrderedSetType | this_SequenceType_8= ruleSequenceType | this_SetType_9= ruleSetType | this_OclAnyType_10= ruleOclAnyType | this_TupleType_11= ruleTupleType | this_OclModelElement_12= ruleOclModelElement | this_MapType_13= ruleMapType )
            int alt24=14;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt24=1;
                }
                break;
            case 74:
                {
                alt24=2;
                }
                break;
            case 51:
                {
                alt24=3;
                }
                break;
            case 75:
                {
                alt24=4;
                }
                break;
            case 76:
                {
                alt24=5;
                }
                break;
            case 77:
                {
                alt24=6;
                }
                break;
            case 78:
                {
                alt24=7;
                }
                break;
            case 81:
                {
                alt24=8;
                }
                break;
            case 82:
                {
                alt24=9;
                }
                break;
            case 83:
                {
                alt24=10;
                }
                break;
            case 84:
                {
                alt24=11;
                }
                break;
            case 85:
                {
                alt24=12;
                }
                break;
            case RULE_STRING:
                {
                alt24=13;
                }
                break;
            case 61:
                {
                alt24=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2098:2: this_OclType_Impl_0= ruleOclType_Impl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getOclType_ImplParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOclType_Impl_in_ruleOclType4465);
                    this_OclType_Impl_0=ruleOclType_Impl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OclType_Impl_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2111:2: this_CollectionType_Impl_1= ruleCollectionType_Impl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getCollectionType_ImplParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionType_Impl_in_ruleOclType4495);
                    this_CollectionType_Impl_1=ruleCollectionType_Impl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionType_Impl_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2124:2: this_StringType_2= ruleStringType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getStringTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringType_in_ruleOclType4525);
                    this_StringType_2=ruleStringType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2137:2: this_BooleanType_3= ruleBooleanType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getBooleanTypeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleOclType4555);
                    this_BooleanType_3=ruleBooleanType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanType_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2150:2: this_IntegerType_4= ruleIntegerType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getIntegerTypeParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerType_in_ruleOclType4585);
                    this_IntegerType_4=ruleIntegerType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerType_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2163:2: this_RealType_5= ruleRealType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getRealTypeParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealType_in_ruleOclType4615);
                    this_RealType_5=ruleRealType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealType_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2176:2: this_BagType_6= ruleBagType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getBagTypeParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBagType_in_ruleOclType4645);
                    this_BagType_6=ruleBagType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BagType_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2189:2: this_OrderedSetType_7= ruleOrderedSetType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getOrderedSetTypeParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrderedSetType_in_ruleOclType4675);
                    this_OrderedSetType_7=ruleOrderedSetType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OrderedSetType_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2202:2: this_SequenceType_8= ruleSequenceType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getSequenceTypeParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSequenceType_in_ruleOclType4705);
                    this_SequenceType_8=ruleSequenceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SequenceType_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2215:2: this_SetType_9= ruleSetType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getSetTypeParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetType_in_ruleOclType4735);
                    this_SetType_9=ruleSetType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SetType_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2228:2: this_OclAnyType_10= ruleOclAnyType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getOclAnyTypeParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOclAnyType_in_ruleOclType4765);
                    this_OclAnyType_10=ruleOclAnyType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OclAnyType_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2241:2: this_TupleType_11= ruleTupleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getTupleTypeParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTupleType_in_ruleOclType4795);
                    this_TupleType_11=ruleTupleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleType_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2254:2: this_OclModelElement_12= ruleOclModelElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getOclModelElementParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOclModelElement_in_ruleOclType4825);
                    this_OclModelElement_12=ruleOclModelElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OclModelElement_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2267:2: this_MapType_13= ruleMapType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclTypeAccess().getMapTypeParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMapType_in_ruleOclType4855);
                    this_MapType_13=ruleMapType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MapType_13; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleOclType"


    // $ANTLR start "entryRuleOclExpression"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2286:1: entryRuleOclExpression returns [EObject current=null] : iv_ruleOclExpression= ruleOclExpression EOF ;
    public final EObject entryRuleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclExpression = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2287:2: (iv_ruleOclExpression= ruleOclExpression EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2288:2: iv_ruleOclExpression= ruleOclExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOclExpression_in_entryRuleOclExpression4890);
            iv_ruleOclExpression=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOclExpression4900); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOclExpression"


    // $ANTLR start "ruleOclExpression"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2295:1: ruleOclExpression returns [EObject current=null] : (this_VariableExp_0= ruleVariableExp | this_SuperExp_1= ruleSuperExp | this_StringExp_2= ruleStringExp | this_BooleanExp_3= ruleBooleanExp | this_RealExp_4= ruleRealExp | this_IntegerExp_5= ruleIntegerExp | this_BagExp_6= ruleBagExp | this_OrderedSetExp_7= ruleOrderedSetExp | this_SequenceExp_8= ruleSequenceExp | this_SetExp_9= ruleSetExp | this_TupleExp_10= ruleTupleExp | this_MapExp_11= ruleMapExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_OclUndefinedExp_13= ruleOclUndefinedExp | this_OperatorCallExp_14= ruleOperatorCallExp | this_CollectionOperationCallExp_15= ruleCollectionOperationCallExp | this_IterateExp_16= ruleIterateExp | this_IteratorExp_17= ruleIteratorExp | this_LetExp_18= ruleLetExp | this_IfExp_19= ruleIfExp | this_CollectionType_Impl_20= ruleCollectionType_Impl | this_OclType_Impl_21= ruleOclType_Impl | this_StringType_22= ruleStringType | this_BooleanType_23= ruleBooleanType | this_IntegerType_24= ruleIntegerType | this_RealType_25= ruleRealType | this_BagType_26= ruleBagType | this_OrderedSetType_27= ruleOrderedSetType | this_SequenceType_28= ruleSequenceType | this_SetType_29= ruleSetType | this_OclAnyType_30= ruleOclAnyType | this_TupleType_31= ruleTupleType | this_OclModelElement_32= ruleOclModelElement | this_MapType_33= ruleMapType | (this_NavigationOrAttributeCallExp_34= ruleNavigationOrAttributeCallExp () ) ) ;
    public final EObject ruleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject this_VariableExp_0 = null;

        EObject this_SuperExp_1 = null;

        EObject this_StringExp_2 = null;

        EObject this_BooleanExp_3 = null;

        EObject this_RealExp_4 = null;

        EObject this_IntegerExp_5 = null;

        EObject this_BagExp_6 = null;

        EObject this_OrderedSetExp_7 = null;

        EObject this_SequenceExp_8 = null;

        EObject this_SetExp_9 = null;

        EObject this_TupleExp_10 = null;

        EObject this_MapExp_11 = null;

        EObject this_EnumLiteralExp_12 = null;

        EObject this_OclUndefinedExp_13 = null;

        EObject this_OperatorCallExp_14 = null;

        EObject this_CollectionOperationCallExp_15 = null;

        EObject this_IterateExp_16 = null;

        EObject this_IteratorExp_17 = null;

        EObject this_LetExp_18 = null;

        EObject this_IfExp_19 = null;

        EObject this_CollectionType_Impl_20 = null;

        EObject this_OclType_Impl_21 = null;

        EObject this_StringType_22 = null;

        EObject this_BooleanType_23 = null;

        EObject this_IntegerType_24 = null;

        EObject this_RealType_25 = null;

        EObject this_BagType_26 = null;

        EObject this_OrderedSetType_27 = null;

        EObject this_SequenceType_28 = null;

        EObject this_SetType_29 = null;

        EObject this_OclAnyType_30 = null;

        EObject this_TupleType_31 = null;

        EObject this_OclModelElement_32 = null;

        EObject this_MapType_33 = null;

        EObject this_NavigationOrAttributeCallExp_34 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2298:28: ( (this_VariableExp_0= ruleVariableExp | this_SuperExp_1= ruleSuperExp | this_StringExp_2= ruleStringExp | this_BooleanExp_3= ruleBooleanExp | this_RealExp_4= ruleRealExp | this_IntegerExp_5= ruleIntegerExp | this_BagExp_6= ruleBagExp | this_OrderedSetExp_7= ruleOrderedSetExp | this_SequenceExp_8= ruleSequenceExp | this_SetExp_9= ruleSetExp | this_TupleExp_10= ruleTupleExp | this_MapExp_11= ruleMapExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_OclUndefinedExp_13= ruleOclUndefinedExp | this_OperatorCallExp_14= ruleOperatorCallExp | this_CollectionOperationCallExp_15= ruleCollectionOperationCallExp | this_IterateExp_16= ruleIterateExp | this_IteratorExp_17= ruleIteratorExp | this_LetExp_18= ruleLetExp | this_IfExp_19= ruleIfExp | this_CollectionType_Impl_20= ruleCollectionType_Impl | this_OclType_Impl_21= ruleOclType_Impl | this_StringType_22= ruleStringType | this_BooleanType_23= ruleBooleanType | this_IntegerType_24= ruleIntegerType | this_RealType_25= ruleRealType | this_BagType_26= ruleBagType | this_OrderedSetType_27= ruleOrderedSetType | this_SequenceType_28= ruleSequenceType | this_SetType_29= ruleSetType | this_OclAnyType_30= ruleOclAnyType | this_TupleType_31= ruleTupleType | this_OclModelElement_32= ruleOclModelElement | this_MapType_33= ruleMapType | (this_NavigationOrAttributeCallExp_34= ruleNavigationOrAttributeCallExp () ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2299:1: (this_VariableExp_0= ruleVariableExp | this_SuperExp_1= ruleSuperExp | this_StringExp_2= ruleStringExp | this_BooleanExp_3= ruleBooleanExp | this_RealExp_4= ruleRealExp | this_IntegerExp_5= ruleIntegerExp | this_BagExp_6= ruleBagExp | this_OrderedSetExp_7= ruleOrderedSetExp | this_SequenceExp_8= ruleSequenceExp | this_SetExp_9= ruleSetExp | this_TupleExp_10= ruleTupleExp | this_MapExp_11= ruleMapExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_OclUndefinedExp_13= ruleOclUndefinedExp | this_OperatorCallExp_14= ruleOperatorCallExp | this_CollectionOperationCallExp_15= ruleCollectionOperationCallExp | this_IterateExp_16= ruleIterateExp | this_IteratorExp_17= ruleIteratorExp | this_LetExp_18= ruleLetExp | this_IfExp_19= ruleIfExp | this_CollectionType_Impl_20= ruleCollectionType_Impl | this_OclType_Impl_21= ruleOclType_Impl | this_StringType_22= ruleStringType | this_BooleanType_23= ruleBooleanType | this_IntegerType_24= ruleIntegerType | this_RealType_25= ruleRealType | this_BagType_26= ruleBagType | this_OrderedSetType_27= ruleOrderedSetType | this_SequenceType_28= ruleSequenceType | this_SetType_29= ruleSetType | this_OclAnyType_30= ruleOclAnyType | this_TupleType_31= ruleTupleType | this_OclModelElement_32= ruleOclModelElement | this_MapType_33= ruleMapType | (this_NavigationOrAttributeCallExp_34= ruleNavigationOrAttributeCallExp () ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2299:1: (this_VariableExp_0= ruleVariableExp | this_SuperExp_1= ruleSuperExp | this_StringExp_2= ruleStringExp | this_BooleanExp_3= ruleBooleanExp | this_RealExp_4= ruleRealExp | this_IntegerExp_5= ruleIntegerExp | this_BagExp_6= ruleBagExp | this_OrderedSetExp_7= ruleOrderedSetExp | this_SequenceExp_8= ruleSequenceExp | this_SetExp_9= ruleSetExp | this_TupleExp_10= ruleTupleExp | this_MapExp_11= ruleMapExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_OclUndefinedExp_13= ruleOclUndefinedExp | this_OperatorCallExp_14= ruleOperatorCallExp | this_CollectionOperationCallExp_15= ruleCollectionOperationCallExp | this_IterateExp_16= ruleIterateExp | this_IteratorExp_17= ruleIteratorExp | this_LetExp_18= ruleLetExp | this_IfExp_19= ruleIfExp | this_CollectionType_Impl_20= ruleCollectionType_Impl | this_OclType_Impl_21= ruleOclType_Impl | this_StringType_22= ruleStringType | this_BooleanType_23= ruleBooleanType | this_IntegerType_24= ruleIntegerType | this_RealType_25= ruleRealType | this_BagType_26= ruleBagType | this_OrderedSetType_27= ruleOrderedSetType | this_SequenceType_28= ruleSequenceType | this_SetType_29= ruleSetType | this_OclAnyType_30= ruleOclAnyType | this_TupleType_31= ruleTupleType | this_OclModelElement_32= ruleOclModelElement | this_MapType_33= ruleMapType | (this_NavigationOrAttributeCallExp_34= ruleNavigationOrAttributeCallExp () ) )
            int alt25=35;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2300:2: this_VariableExp_0= ruleVariableExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getVariableExpParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableExp_in_ruleOclExpression4950);
                    this_VariableExp_0=ruleVariableExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableExp_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2313:2: this_SuperExp_1= ruleSuperExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getSuperExpParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSuperExp_in_ruleOclExpression4980);
                    this_SuperExp_1=ruleSuperExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SuperExp_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2326:2: this_StringExp_2= ruleStringExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getStringExpParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExp_in_ruleOclExpression5010);
                    this_StringExp_2=ruleStringExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringExp_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2339:2: this_BooleanExp_3= ruleBooleanExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getBooleanExpParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExp_in_ruleOclExpression5040);
                    this_BooleanExp_3=ruleBooleanExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanExp_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2352:2: this_RealExp_4= ruleRealExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getRealExpParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealExp_in_ruleOclExpression5070);
                    this_RealExp_4=ruleRealExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealExp_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2365:2: this_IntegerExp_5= ruleIntegerExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getIntegerExpParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerExp_in_ruleOclExpression5100);
                    this_IntegerExp_5=ruleIntegerExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerExp_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2378:2: this_BagExp_6= ruleBagExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getBagExpParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBagExp_in_ruleOclExpression5130);
                    this_BagExp_6=ruleBagExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BagExp_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2391:2: this_OrderedSetExp_7= ruleOrderedSetExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getOrderedSetExpParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrderedSetExp_in_ruleOclExpression5160);
                    this_OrderedSetExp_7=ruleOrderedSetExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OrderedSetExp_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2404:2: this_SequenceExp_8= ruleSequenceExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getSequenceExpParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSequenceExp_in_ruleOclExpression5190);
                    this_SequenceExp_8=ruleSequenceExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SequenceExp_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2417:2: this_SetExp_9= ruleSetExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getSetExpParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetExp_in_ruleOclExpression5220);
                    this_SetExp_9=ruleSetExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SetExp_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2430:2: this_TupleExp_10= ruleTupleExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getTupleExpParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTupleExp_in_ruleOclExpression5250);
                    this_TupleExp_10=ruleTupleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleExp_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2443:2: this_MapExp_11= ruleMapExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getMapExpParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMapExp_in_ruleOclExpression5280);
                    this_MapExp_11=ruleMapExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MapExp_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2456:2: this_EnumLiteralExp_12= ruleEnumLiteralExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getEnumLiteralExpParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumLiteralExp_in_ruleOclExpression5310);
                    this_EnumLiteralExp_12=ruleEnumLiteralExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumLiteralExp_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2469:2: this_OclUndefinedExp_13= ruleOclUndefinedExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getOclUndefinedExpParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOclUndefinedExp_in_ruleOclExpression5340);
                    this_OclUndefinedExp_13=ruleOclUndefinedExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OclUndefinedExp_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 15 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2482:2: this_OperatorCallExp_14= ruleOperatorCallExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getOperatorCallExpParserRuleCall_14()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperatorCallExp_in_ruleOclExpression5370);
                    this_OperatorCallExp_14=ruleOperatorCallExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OperatorCallExp_14; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 16 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2495:2: this_CollectionOperationCallExp_15= ruleCollectionOperationCallExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getCollectionOperationCallExpParserRuleCall_15()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionOperationCallExp_in_ruleOclExpression5400);
                    this_CollectionOperationCallExp_15=ruleCollectionOperationCallExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionOperationCallExp_15; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 17 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2508:2: this_IterateExp_16= ruleIterateExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getIterateExpParserRuleCall_16()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIterateExp_in_ruleOclExpression5430);
                    this_IterateExp_16=ruleIterateExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IterateExp_16; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 18 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2521:2: this_IteratorExp_17= ruleIteratorExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getIteratorExpParserRuleCall_17()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIteratorExp_in_ruleOclExpression5460);
                    this_IteratorExp_17=ruleIteratorExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IteratorExp_17; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 19 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2534:2: this_LetExp_18= ruleLetExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getLetExpParserRuleCall_18()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLetExp_in_ruleOclExpression5490);
                    this_LetExp_18=ruleLetExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LetExp_18; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 20 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2547:2: this_IfExp_19= ruleIfExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getIfExpParserRuleCall_19()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfExp_in_ruleOclExpression5520);
                    this_IfExp_19=ruleIfExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfExp_19; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 21 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2560:2: this_CollectionType_Impl_20= ruleCollectionType_Impl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getCollectionType_ImplParserRuleCall_20()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionType_Impl_in_ruleOclExpression5550);
                    this_CollectionType_Impl_20=ruleCollectionType_Impl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionType_Impl_20; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 22 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2573:2: this_OclType_Impl_21= ruleOclType_Impl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getOclType_ImplParserRuleCall_21()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOclType_Impl_in_ruleOclExpression5580);
                    this_OclType_Impl_21=ruleOclType_Impl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OclType_Impl_21; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 23 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2586:2: this_StringType_22= ruleStringType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getStringTypeParserRuleCall_22()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringType_in_ruleOclExpression5610);
                    this_StringType_22=ruleStringType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringType_22; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 24 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2599:2: this_BooleanType_23= ruleBooleanType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getBooleanTypeParserRuleCall_23()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleOclExpression5640);
                    this_BooleanType_23=ruleBooleanType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanType_23; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 25 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2612:2: this_IntegerType_24= ruleIntegerType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getIntegerTypeParserRuleCall_24()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerType_in_ruleOclExpression5670);
                    this_IntegerType_24=ruleIntegerType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerType_24; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 26 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2625:2: this_RealType_25= ruleRealType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getRealTypeParserRuleCall_25()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealType_in_ruleOclExpression5700);
                    this_RealType_25=ruleRealType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealType_25; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 27 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2638:2: this_BagType_26= ruleBagType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getBagTypeParserRuleCall_26()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBagType_in_ruleOclExpression5730);
                    this_BagType_26=ruleBagType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BagType_26; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 28 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2651:2: this_OrderedSetType_27= ruleOrderedSetType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getOrderedSetTypeParserRuleCall_27()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrderedSetType_in_ruleOclExpression5760);
                    this_OrderedSetType_27=ruleOrderedSetType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OrderedSetType_27; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 29 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2664:2: this_SequenceType_28= ruleSequenceType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getSequenceTypeParserRuleCall_28()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSequenceType_in_ruleOclExpression5790);
                    this_SequenceType_28=ruleSequenceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SequenceType_28; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 30 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2677:2: this_SetType_29= ruleSetType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getSetTypeParserRuleCall_29()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetType_in_ruleOclExpression5820);
                    this_SetType_29=ruleSetType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SetType_29; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 31 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2690:2: this_OclAnyType_30= ruleOclAnyType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getOclAnyTypeParserRuleCall_30()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOclAnyType_in_ruleOclExpression5850);
                    this_OclAnyType_30=ruleOclAnyType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OclAnyType_30; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 32 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2703:2: this_TupleType_31= ruleTupleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getTupleTypeParserRuleCall_31()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTupleType_in_ruleOclExpression5880);
                    this_TupleType_31=ruleTupleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleType_31; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 33 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2716:2: this_OclModelElement_32= ruleOclModelElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getOclModelElementParserRuleCall_32()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOclModelElement_in_ruleOclExpression5910);
                    this_OclModelElement_32=ruleOclModelElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OclModelElement_32; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 34 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2729:2: this_MapType_33= ruleMapType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getMapTypeParserRuleCall_33()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMapType_in_ruleOclExpression5940);
                    this_MapType_33=ruleMapType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MapType_33; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 35 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2741:6: (this_NavigationOrAttributeCallExp_34= ruleNavigationOrAttributeCallExp () )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2741:6: (this_NavigationOrAttributeCallExp_34= ruleNavigationOrAttributeCallExp () )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2742:2: this_NavigationOrAttributeCallExp_34= ruleNavigationOrAttributeCallExp ()
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOclExpressionAccess().getNavigationOrAttributeCallExpParserRuleCall_34_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNavigationOrAttributeCallExp_in_ruleOclExpression5971);
                    this_NavigationOrAttributeCallExp_34=ruleNavigationOrAttributeCallExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NavigationOrAttributeCallExp_34; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2753:1: ()
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2754:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getOclExpressionAccess().getNavigationOrAttributeCallExpSrcAction_34_1(),
                                  current);
                          
                    }

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
    // $ANTLR end "ruleOclExpression"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2770:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2771:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2772:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration6019);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration6029); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2779:1: ruleVariableDeclaration returns [EObject current=null] : (this_VariableDeclaration_Impl_0= ruleVariableDeclaration_Impl | this_TuplePart_1= ruleTuplePart | this_Iterator_2= ruleIterator | this_OclParameter_3= ruleOclParameter ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_Impl_0 = null;

        EObject this_TuplePart_1 = null;

        EObject this_Iterator_2 = null;

        EObject this_OclParameter_3 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2782:28: ( (this_VariableDeclaration_Impl_0= ruleVariableDeclaration_Impl | this_TuplePart_1= ruleTuplePart | this_Iterator_2= ruleIterator | this_OclParameter_3= ruleOclParameter ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2783:1: (this_VariableDeclaration_Impl_0= ruleVariableDeclaration_Impl | this_TuplePart_1= ruleTuplePart | this_Iterator_2= ruleIterator | this_OclParameter_3= ruleOclParameter )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2783:1: (this_VariableDeclaration_Impl_0= ruleVariableDeclaration_Impl | this_TuplePart_1= ruleTuplePart | this_Iterator_2= ruleIterator | this_OclParameter_3= ruleOclParameter )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
                {
                alt26=2;
                }
                break;
            case 51:
                {
                int LA26_3 = input.LA(2);

                if ( (LA26_3==17) ) {
                    int LA26_5 = input.LA(3);

                    if ( (LA26_5==RULE_ID) ) {
                        alt26=3;
                    }
                    else if ( (LA26_5==RULE_STRING||LA26_5==27||LA26_5==51||LA26_5==53||LA26_5==61||(LA26_5>=74 && LA26_5<=78)||(LA26_5>=81 && LA26_5<=85)||LA26_5==89) ) {
                        alt26=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA26_3==EOF||LA26_3==67||LA26_3==69) ) {
                    alt26=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 3, input);

                    throw nvae;
                }
                }
                break;
            case 88:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2784:2: this_VariableDeclaration_Impl_0= ruleVariableDeclaration_Impl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDeclaration_ImplParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_Impl_in_ruleVariableDeclaration6079);
                    this_VariableDeclaration_Impl_0=ruleVariableDeclaration_Impl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclaration_Impl_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2797:2: this_TuplePart_1= ruleTuplePart
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTuplePartParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTuplePart_in_ruleVariableDeclaration6109);
                    this_TuplePart_1=ruleTuplePart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TuplePart_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2810:2: this_Iterator_2= ruleIterator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getIteratorParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIterator_in_ruleVariableDeclaration6139);
                    this_Iterator_2=ruleIterator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Iterator_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2823:2: this_OclParameter_3= ruleOclParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getOclParameterParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOclParameter_in_ruleVariableDeclaration6169);
                    this_OclParameter_3=ruleOclParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OclParameter_3; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleString0"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2844:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2845:2: (iv_ruleString0= ruleString0 EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2846:2: iv_ruleString0= ruleString0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getString0Rule()); 
            }
            pushFollow(FOLLOW_ruleString0_in_entryRuleString06207);
            iv_ruleString0=ruleString0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleString0.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleString06218); if (state.failed) return current;

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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2853:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'String' ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2856:28: (kw= 'String' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2858:2: kw= 'String'
            {
            kw=(Token)match(input,51,FOLLOW_51_in_ruleString06255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getString0Access().getStringKeyword()); 
                  
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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleOclContextDefinition"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2871:1: entryRuleOclContextDefinition returns [EObject current=null] : iv_ruleOclContextDefinition= ruleOclContextDefinition EOF ;
    public final EObject entryRuleOclContextDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclContextDefinition = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2872:2: (iv_ruleOclContextDefinition= ruleOclContextDefinition EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2873:2: iv_ruleOclContextDefinition= ruleOclContextDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclContextDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOclContextDefinition_in_entryRuleOclContextDefinition6294);
            iv_ruleOclContextDefinition=ruleOclContextDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclContextDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOclContextDefinition6304); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOclContextDefinition"


    // $ANTLR start "ruleOclContextDefinition"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2880:1: ruleOclContextDefinition returns [EObject current=null] : (otherlv_0= 'context' ( (lv_context__1_0= ruleOclType ) ) ) ;
    public final EObject ruleOclContextDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_context__1_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2883:28: ( (otherlv_0= 'context' ( (lv_context__1_0= ruleOclType ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2884:1: (otherlv_0= 'context' ( (lv_context__1_0= ruleOclType ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2884:1: (otherlv_0= 'context' ( (lv_context__1_0= ruleOclType ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2884:3: otherlv_0= 'context' ( (lv_context__1_0= ruleOclType ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleOclContextDefinition6341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOclContextDefinitionAccess().getContextKeyword_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2888:1: ( (lv_context__1_0= ruleOclType ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2889:1: (lv_context__1_0= ruleOclType )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2889:1: (lv_context__1_0= ruleOclType )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2890:3: lv_context__1_0= ruleOclType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOclContextDefinitionAccess().getContext_OclTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclType_in_ruleOclContextDefinition6362);
            lv_context__1_0=ruleOclType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOclContextDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"context_",
                      		lv_context__1_0, 
                      		"OclType");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleOclContextDefinition"


    // $ANTLR start "entryRuleOclAttribute"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2914:1: entryRuleOclAttribute returns [EObject current=null] : iv_ruleOclAttribute= ruleOclAttribute EOF ;
    public final EObject entryRuleOclAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclAttribute = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2915:2: (iv_ruleOclAttribute= ruleOclAttribute EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2916:2: iv_ruleOclAttribute= ruleOclAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleOclAttribute_in_entryRuleOclAttribute6398);
            iv_ruleOclAttribute=ruleOclAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOclAttribute6408); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOclAttribute"


    // $ANTLR start "ruleOclAttribute"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2923:1: ruleOclAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) ;
    public final EObject ruleOclAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2926:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2927:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2927:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2927:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2927:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2928:1: (lv_name_0_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2928:1: (lv_name_0_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2929:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOclAttribute6450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getOclAttributeAccess().getNameSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOclAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleOclAttribute6467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOclAttributeAccess().getColonKeyword_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2949:1: ( (lv_type_2_0= ruleOclType ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2950:1: (lv_type_2_0= ruleOclType )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2950:1: (lv_type_2_0= ruleOclType )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2951:3: lv_type_2_0= ruleOclType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOclAttributeAccess().getTypeOclTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclType_in_ruleOclAttribute6488);
            lv_type_2_0=ruleOclType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOclAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"OclType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleOclAttribute6500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOclAttributeAccess().getEqualsSignKeyword_3());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2971:1: ( (lv_initExpression_4_0= ruleOclExpression ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2972:1: (lv_initExpression_4_0= ruleOclExpression )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2972:1: (lv_initExpression_4_0= ruleOclExpression )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2973:3: lv_initExpression_4_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOclAttributeAccess().getInitExpressionOclExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclExpression_in_ruleOclAttribute6521);
            lv_initExpression_4_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOclAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"initExpression",
                      		lv_initExpression_4_0, 
                      		"OclExpression");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleOclAttribute"


    // $ANTLR start "entryRuleOperation"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2997:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2998:2: (iv_ruleOperation= ruleOperation EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2999:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation6557);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation6567); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3006:1: ruleOperation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '(' (otherlv_2= '{' ( (lv_parameters_3_0= ruleOclParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleOclParameter ) ) )* otherlv_6= '}' )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleOclType ) ) ( (lv_body_10_0= ruleOclExpression ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_returnType_9_0 = null;

        EObject lv_body_10_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3009:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '(' (otherlv_2= '{' ( (lv_parameters_3_0= ruleOclParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleOclParameter ) ) )* otherlv_6= '}' )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleOclType ) ) ( (lv_body_10_0= ruleOclExpression ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3010:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '(' (otherlv_2= '{' ( (lv_parameters_3_0= ruleOclParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleOclParameter ) ) )* otherlv_6= '}' )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleOclType ) ) ( (lv_body_10_0= ruleOclExpression ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3010:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '(' (otherlv_2= '{' ( (lv_parameters_3_0= ruleOclParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleOclParameter ) ) )* otherlv_6= '}' )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleOclType ) ) ( (lv_body_10_0= ruleOclExpression ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3010:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '(' (otherlv_2= '{' ( (lv_parameters_3_0= ruleOclParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleOclParameter ) ) )* otherlv_6= '}' )? otherlv_7= ')' otherlv_8= ':' ( (lv_returnType_9_0= ruleOclType ) ) ( (lv_body_10_0= ruleOclExpression ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3010:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3011:1: (lv_name_0_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3011:1: (lv_name_0_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3012:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOperation6609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getOperationAccess().getNameSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleOperation6626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3032:1: (otherlv_2= '{' ( (lv_parameters_3_0= ruleOclParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleOclParameter ) ) )* otherlv_6= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==12) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3032:3: otherlv_2= '{' ( (lv_parameters_3_0= ruleOclParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleOclParameter ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleOperation6639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3036:1: ( (lv_parameters_3_0= ruleOclParameter ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3037:1: (lv_parameters_3_0= ruleOclParameter )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3037:1: (lv_parameters_3_0= ruleOclParameter )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3038:3: lv_parameters_3_0= ruleOclParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParametersOclParameterParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclParameter_in_ruleOperation6660);
                    lv_parameters_3_0=ruleOclParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"OclParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3054:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleOclParameter ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==18) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3054:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleOclParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleOperation6673); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3058:1: ( (lv_parameters_5_0= ruleOclParameter ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3059:1: (lv_parameters_5_0= ruleOclParameter )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3059:1: (lv_parameters_5_0= ruleOclParameter )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3060:3: lv_parameters_5_0= ruleOclParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParametersOclParameterParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOclParameter_in_ruleOperation6694);
                    	    lv_parameters_5_0=ruleOclParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"OclParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleOperation6708); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleOperation6722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleOperation6734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getColonKeyword_4());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3088:1: ( (lv_returnType_9_0= ruleOclType ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3089:1: (lv_returnType_9_0= ruleOclType )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3089:1: (lv_returnType_9_0= ruleOclType )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3090:3: lv_returnType_9_0= ruleOclType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeOclTypeParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclType_in_ruleOperation6755);
            lv_returnType_9_0=ruleOclType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_9_0, 
                      		"OclType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3106:2: ( (lv_body_10_0= ruleOclExpression ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3107:1: (lv_body_10_0= ruleOclExpression )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3107:1: (lv_body_10_0= ruleOclExpression )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3108:3: lv_body_10_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getBodyOclExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclExpression_in_ruleOperation6776);
            lv_body_10_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_10_0, 
                      		"OclExpression");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleOclType_Impl"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3132:1: entryRuleOclType_Impl returns [EObject current=null] : iv_ruleOclType_Impl= ruleOclType_Impl EOF ;
    public final EObject entryRuleOclType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclType_Impl = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3133:2: (iv_ruleOclType_Impl= ruleOclType_Impl EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3134:2: iv_ruleOclType_Impl= ruleOclType_Impl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclType_ImplRule()); 
            }
            pushFollow(FOLLOW_ruleOclType_Impl_in_entryRuleOclType_Impl6812);
            iv_ruleOclType_Impl=ruleOclType_Impl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclType_Impl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOclType_Impl6822); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOclType_Impl"


    // $ANTLR start "ruleOclType_Impl"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3141:1: ruleOclType_Impl returns [EObject current=null] : (otherlv_0= 'OclType' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'type' ( (lv_type_3_0= ruleOclType ) ) )? ) ;
    public final EObject ruleOclType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3144:28: ( (otherlv_0= 'OclType' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'type' ( (lv_type_3_0= ruleOclType ) ) )? ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3145:1: (otherlv_0= 'OclType' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'type' ( (lv_type_3_0= ruleOclType ) ) )? )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3145:1: (otherlv_0= 'OclType' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'type' ( (lv_type_3_0= ruleOclType ) ) )? )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3145:3: otherlv_0= 'OclType' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'type' ( (lv_type_3_0= ruleOclType ) ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleOclType_Impl6859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOclType_ImplAccess().getOclTypeKeyword_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3149:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3150:1: (lv_name_1_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3150:1: (lv_name_1_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3151:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOclType_Impl6876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getOclType_ImplAccess().getNameSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOclType_ImplRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3167:2: (otherlv_2= 'type' ( (lv_type_3_0= ruleOclType ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==54) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3167:4: otherlv_2= 'type' ( (lv_type_3_0= ruleOclType ) )
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleOclType_Impl6894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOclType_ImplAccess().getTypeKeyword_2_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3171:1: ( (lv_type_3_0= ruleOclType ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3172:1: (lv_type_3_0= ruleOclType )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3172:1: (lv_type_3_0= ruleOclType )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3173:3: lv_type_3_0= ruleOclType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOclType_ImplAccess().getTypeOclTypeParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclType_in_ruleOclType_Impl6915);
                    lv_type_3_0=ruleOclType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOclType_ImplRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"OclType");
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
    // $ANTLR end "ruleOclType_Impl"


    // $ANTLR start "entryRuleVariableExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3197:1: entryRuleVariableExp returns [EObject current=null] : iv_ruleVariableExp= ruleVariableExp EOF ;
    public final EObject entryRuleVariableExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3198:2: (iv_ruleVariableExp= ruleVariableExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3199:2: iv_ruleVariableExp= ruleVariableExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableExpRule()); 
            }
            pushFollow(FOLLOW_ruleVariableExp_in_entryRuleVariableExp6953);
            iv_ruleVariableExp=ruleVariableExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExp6963); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableExp"


    // $ANTLR start "ruleVariableExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3206:1: ruleVariableExp returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVariableExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3209:28: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3210:1: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3210:1: ( () ( (otherlv_1= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3210:2: () ( (otherlv_1= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3210:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3211:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableExpAccess().getVariableExpAction_0(),
                          current);
                  
            }

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3219:2: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3220:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3220:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3221:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableExpRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableExp7024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getVariableExpAccess().getReferredVariableVariableDeclarationCrossReference_1_0()); 
              	
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
    // $ANTLR end "ruleVariableExp"


    // $ANTLR start "entryRuleSuperExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3243:1: entryRuleSuperExp returns [EObject current=null] : iv_ruleSuperExp= ruleSuperExp EOF ;
    public final EObject entryRuleSuperExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3244:2: (iv_ruleSuperExp= ruleSuperExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3245:2: iv_ruleSuperExp= ruleSuperExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuperExpRule()); 
            }
            pushFollow(FOLLOW_ruleSuperExp_in_entryRuleSuperExp7060);
            iv_ruleSuperExp=ruleSuperExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuperExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuperExp7070); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSuperExp"


    // $ANTLR start "ruleSuperExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3252:1: ruleSuperExp returns [EObject current=null] : ( () otherlv_1= 'super' ) ;
    public final EObject ruleSuperExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3255:28: ( ( () otherlv_1= 'super' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3256:1: ( () otherlv_1= 'super' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3256:1: ( () otherlv_1= 'super' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3256:2: () otherlv_1= 'super'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3256:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3257:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuperExpAccess().getSuperExpAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleSuperExp7119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSuperExpAccess().getSuperKeyword_1());
                  
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
    // $ANTLR end "ruleSuperExp"


    // $ANTLR start "entryRuleStringExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3277:1: entryRuleStringExp returns [EObject current=null] : iv_ruleStringExp= ruleStringExp EOF ;
    public final EObject entryRuleStringExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3278:2: (iv_ruleStringExp= ruleStringExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3279:2: iv_ruleStringExp= ruleStringExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringExpRule()); 
            }
            pushFollow(FOLLOW_ruleStringExp_in_entryRuleStringExp7155);
            iv_ruleStringExp=ruleStringExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExp7165); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringExp"


    // $ANTLR start "ruleStringExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3286:1: ruleStringExp returns [EObject current=null] : ( (lv_stringSymbol_0_0= ruleString0 ) ) ;
    public final EObject ruleStringExp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_stringSymbol_0_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3289:28: ( ( (lv_stringSymbol_0_0= ruleString0 ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3290:1: ( (lv_stringSymbol_0_0= ruleString0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3290:1: ( (lv_stringSymbol_0_0= ruleString0 ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3291:1: (lv_stringSymbol_0_0= ruleString0 )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3291:1: (lv_stringSymbol_0_0= ruleString0 )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3292:3: lv_stringSymbol_0_0= ruleString0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringExpAccess().getStringSymbolString0ParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleString0_in_ruleStringExp7210);
            lv_stringSymbol_0_0=ruleString0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringExpRule());
              	        }
                     		set(
                     			current, 
                     			"stringSymbol",
                      		lv_stringSymbol_0_0, 
                      		"String0");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleStringExp"


    // $ANTLR start "entryRuleBooleanExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3316:1: entryRuleBooleanExp returns [EObject current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final EObject entryRuleBooleanExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3317:2: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3318:2: iv_ruleBooleanExp= ruleBooleanExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExp_in_entryRuleBooleanExp7245);
            iv_ruleBooleanExp=ruleBooleanExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExp7255); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExp"


    // $ANTLR start "ruleBooleanExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3325:1: ruleBooleanExp returns [EObject current=null] : ( (lv_booleanSymbol_0_0= ruleBoolean ) ) ;
    public final EObject ruleBooleanExp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_booleanSymbol_0_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3328:28: ( ( (lv_booleanSymbol_0_0= ruleBoolean ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3329:1: ( (lv_booleanSymbol_0_0= ruleBoolean ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3329:1: ( (lv_booleanSymbol_0_0= ruleBoolean ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3330:1: (lv_booleanSymbol_0_0= ruleBoolean )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3330:1: (lv_booleanSymbol_0_0= ruleBoolean )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3331:3: lv_booleanSymbol_0_0= ruleBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanExpAccess().getBooleanSymbolBooleanParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBoolean_in_ruleBooleanExp7300);
            lv_booleanSymbol_0_0=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBooleanExpRule());
              	        }
                     		set(
                     			current, 
                     			"booleanSymbol",
                      		lv_booleanSymbol_0_0, 
                      		"Boolean");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "entryRuleRealExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3355:1: entryRuleRealExp returns [EObject current=null] : iv_ruleRealExp= ruleRealExp EOF ;
    public final EObject entryRuleRealExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3356:2: (iv_ruleRealExp= ruleRealExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3357:2: iv_ruleRealExp= ruleRealExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealExpRule()); 
            }
            pushFollow(FOLLOW_ruleRealExp_in_entryRuleRealExp7335);
            iv_ruleRealExp=ruleRealExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealExp7345); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealExp"


    // $ANTLR start "ruleRealExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3364:1: ruleRealExp returns [EObject current=null] : ( (lv_realSymbol_0_0= ruleDouble ) ) ;
    public final EObject ruleRealExp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_realSymbol_0_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3367:28: ( ( (lv_realSymbol_0_0= ruleDouble ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3368:1: ( (lv_realSymbol_0_0= ruleDouble ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3368:1: ( (lv_realSymbol_0_0= ruleDouble ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3369:1: (lv_realSymbol_0_0= ruleDouble )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3369:1: (lv_realSymbol_0_0= ruleDouble )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3370:3: lv_realSymbol_0_0= ruleDouble
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRealExpAccess().getRealSymbolDoubleParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDouble_in_ruleRealExp7390);
            lv_realSymbol_0_0=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRealExpRule());
              	        }
                     		set(
                     			current, 
                     			"realSymbol",
                      		lv_realSymbol_0_0, 
                      		"Double");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleRealExp"


    // $ANTLR start "entryRuleIntegerExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3394:1: entryRuleIntegerExp returns [EObject current=null] : iv_ruleIntegerExp= ruleIntegerExp EOF ;
    public final EObject entryRuleIntegerExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3395:2: (iv_ruleIntegerExp= ruleIntegerExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3396:2: iv_ruleIntegerExp= ruleIntegerExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerExpRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerExp_in_entryRuleIntegerExp7425);
            iv_ruleIntegerExp=ruleIntegerExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerExp7435); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerExp"


    // $ANTLR start "ruleIntegerExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3403:1: ruleIntegerExp returns [EObject current=null] : ( (lv_integerSymbol_0_0= ruleInteger ) ) ;
    public final EObject ruleIntegerExp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_integerSymbol_0_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3406:28: ( ( (lv_integerSymbol_0_0= ruleInteger ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3407:1: ( (lv_integerSymbol_0_0= ruleInteger ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3407:1: ( (lv_integerSymbol_0_0= ruleInteger ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3408:1: (lv_integerSymbol_0_0= ruleInteger )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3408:1: (lv_integerSymbol_0_0= ruleInteger )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3409:3: lv_integerSymbol_0_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerExpAccess().getIntegerSymbolIntegerParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_ruleIntegerExp7480);
            lv_integerSymbol_0_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerExpRule());
              	        }
                     		set(
                     			current, 
                     			"integerSymbol",
                      		lv_integerSymbol_0_0, 
                      		"Integer");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleIntegerExp"


    // $ANTLR start "entryRuleBagExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3433:1: entryRuleBagExp returns [EObject current=null] : iv_ruleBagExp= ruleBagExp EOF ;
    public final EObject entryRuleBagExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3434:2: (iv_ruleBagExp= ruleBagExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3435:2: iv_ruleBagExp= ruleBagExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBagExpRule()); 
            }
            pushFollow(FOLLOW_ruleBagExp_in_entryRuleBagExp7515);
            iv_ruleBagExp=ruleBagExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBagExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBagExp7525); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBagExp"


    // $ANTLR start "ruleBagExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3442:1: ruleBagExp returns [EObject current=null] : ( () otherlv_1= 'Bag' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) ;
    public final EObject ruleBagExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3445:28: ( ( () otherlv_1= 'Bag' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3446:1: ( () otherlv_1= 'Bag' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3446:1: ( () otherlv_1= 'Bag' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3446:2: () otherlv_1= 'Bag' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3446:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3447:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBagExpAccess().getBagExpAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleBagExp7574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBagExpAccess().getBagKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBagExp7586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBagExpAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3463:1: (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==12) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3463:3: otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleBagExp7599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBagExpAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3467:1: ( (lv_elements_4_0= ruleOclExpression ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3468:1: (lv_elements_4_0= ruleOclExpression )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3468:1: (lv_elements_4_0= ruleOclExpression )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3469:3: lv_elements_4_0= ruleOclExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBagExpAccess().getElementsOclExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclExpression_in_ruleBagExp7620);
                    lv_elements_4_0=ruleOclExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBagExpRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_4_0, 
                              		"OclExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3485:2: (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==18) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3485:4: otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleBagExp7633); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getBagExpAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3489:1: ( (lv_elements_6_0= ruleOclExpression ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3490:1: (lv_elements_6_0= ruleOclExpression )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3490:1: (lv_elements_6_0= ruleOclExpression )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3491:3: lv_elements_6_0= ruleOclExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBagExpAccess().getElementsOclExpressionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOclExpression_in_ruleBagExp7654);
                    	    lv_elements_6_0=ruleOclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBagExpRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_6_0, 
                    	              		"OclExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleBagExp7668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBagExpAccess().getRightCurlyBracketKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleBagExp7682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getBagExpAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleBagExp"


    // $ANTLR start "entryRuleOrderedSetExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3523:1: entryRuleOrderedSetExp returns [EObject current=null] : iv_ruleOrderedSetExp= ruleOrderedSetExp EOF ;
    public final EObject entryRuleOrderedSetExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedSetExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3524:2: (iv_ruleOrderedSetExp= ruleOrderedSetExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3525:2: iv_ruleOrderedSetExp= ruleOrderedSetExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderedSetExpRule()); 
            }
            pushFollow(FOLLOW_ruleOrderedSetExp_in_entryRuleOrderedSetExp7718);
            iv_ruleOrderedSetExp=ruleOrderedSetExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderedSetExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedSetExp7728); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrderedSetExp"


    // $ANTLR start "ruleOrderedSetExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3532:1: ruleOrderedSetExp returns [EObject current=null] : ( () otherlv_1= 'OrderedSet' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) ;
    public final EObject ruleOrderedSetExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3535:28: ( ( () otherlv_1= 'OrderedSet' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3536:1: ( () otherlv_1= 'OrderedSet' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3536:1: ( () otherlv_1= 'OrderedSet' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3536:2: () otherlv_1= 'OrderedSet' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3536:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3537:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrderedSetExpAccess().getOrderedSetExpAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleOrderedSetExp7777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOrderedSetExpAccess().getOrderedSetKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleOrderedSetExp7789); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOrderedSetExpAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3553:1: (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==12) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3553:3: otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleOrderedSetExp7802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOrderedSetExpAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3557:1: ( (lv_elements_4_0= ruleOclExpression ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3558:1: (lv_elements_4_0= ruleOclExpression )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3558:1: (lv_elements_4_0= ruleOclExpression )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3559:3: lv_elements_4_0= ruleOclExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrderedSetExpAccess().getElementsOclExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclExpression_in_ruleOrderedSetExp7823);
                    lv_elements_4_0=ruleOclExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrderedSetExpRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_4_0, 
                              		"OclExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3575:2: (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==18) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3575:4: otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleOrderedSetExp7836); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOrderedSetExpAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3579:1: ( (lv_elements_6_0= ruleOclExpression ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3580:1: (lv_elements_6_0= ruleOclExpression )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3580:1: (lv_elements_6_0= ruleOclExpression )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3581:3: lv_elements_6_0= ruleOclExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrderedSetExpAccess().getElementsOclExpressionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOclExpression_in_ruleOrderedSetExp7857);
                    	    lv_elements_6_0=ruleOclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOrderedSetExpRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_6_0, 
                    	              		"OclExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleOrderedSetExp7871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getOrderedSetExpAccess().getRightCurlyBracketKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleOrderedSetExp7885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getOrderedSetExpAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleOrderedSetExp"


    // $ANTLR start "entryRuleSequenceExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3613:1: entryRuleSequenceExp returns [EObject current=null] : iv_ruleSequenceExp= ruleSequenceExp EOF ;
    public final EObject entryRuleSequenceExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3614:2: (iv_ruleSequenceExp= ruleSequenceExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3615:2: iv_ruleSequenceExp= ruleSequenceExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceExpRule()); 
            }
            pushFollow(FOLLOW_ruleSequenceExp_in_entryRuleSequenceExp7921);
            iv_ruleSequenceExp=ruleSequenceExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequenceExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceExp7931); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSequenceExp"


    // $ANTLR start "ruleSequenceExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3622:1: ruleSequenceExp returns [EObject current=null] : ( () otherlv_1= 'Sequence' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) ;
    public final EObject ruleSequenceExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3625:28: ( ( () otherlv_1= 'Sequence' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3626:1: ( () otherlv_1= 'Sequence' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3626:1: ( () otherlv_1= 'Sequence' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3626:2: () otherlv_1= 'Sequence' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3626:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3627:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSequenceExpAccess().getSequenceExpAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleSequenceExp7980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSequenceExpAccess().getSequenceKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSequenceExp7992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSequenceExpAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3643:1: (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==12) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3643:3: otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSequenceExp8005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSequenceExpAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3647:1: ( (lv_elements_4_0= ruleOclExpression ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3648:1: (lv_elements_4_0= ruleOclExpression )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3648:1: (lv_elements_4_0= ruleOclExpression )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3649:3: lv_elements_4_0= ruleOclExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSequenceExpAccess().getElementsOclExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclExpression_in_ruleSequenceExp8026);
                    lv_elements_4_0=ruleOclExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSequenceExpRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_4_0, 
                              		"OclExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3665:2: (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==18) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3665:4: otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSequenceExp8039); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getSequenceExpAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3669:1: ( (lv_elements_6_0= ruleOclExpression ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3670:1: (lv_elements_6_0= ruleOclExpression )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3670:1: (lv_elements_6_0= ruleOclExpression )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3671:3: lv_elements_6_0= ruleOclExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSequenceExpAccess().getElementsOclExpressionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOclExpression_in_ruleSequenceExp8060);
                    	    lv_elements_6_0=ruleOclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSequenceExpRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_6_0, 
                    	              		"OclExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleSequenceExp8074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSequenceExpAccess().getRightCurlyBracketKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleSequenceExp8088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSequenceExpAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleSequenceExp"


    // $ANTLR start "entryRuleSetExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3703:1: entryRuleSetExp returns [EObject current=null] : iv_ruleSetExp= ruleSetExp EOF ;
    public final EObject entryRuleSetExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3704:2: (iv_ruleSetExp= ruleSetExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3705:2: iv_ruleSetExp= ruleSetExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetExpRule()); 
            }
            pushFollow(FOLLOW_ruleSetExp_in_entryRuleSetExp8124);
            iv_ruleSetExp=ruleSetExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetExp8134); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSetExp"


    // $ANTLR start "ruleSetExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3712:1: ruleSetExp returns [EObject current=null] : ( () otherlv_1= 'Set' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) ;
    public final EObject ruleSetExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3715:28: ( ( () otherlv_1= 'Set' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3716:1: ( () otherlv_1= 'Set' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3716:1: ( () otherlv_1= 'Set' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3716:2: () otherlv_1= 'Set' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= '}'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3716:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3717:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSetExpAccess().getSetExpAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleSetExp8183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSetExpAccess().getSetKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSetExp8195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSetExpAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3733:1: (otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==12) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3733:3: otherlv_3= '{' ( (lv_elements_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSetExp8208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSetExpAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3737:1: ( (lv_elements_4_0= ruleOclExpression ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3738:1: (lv_elements_4_0= ruleOclExpression )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3738:1: (lv_elements_4_0= ruleOclExpression )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3739:3: lv_elements_4_0= ruleOclExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSetExpAccess().getElementsOclExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclExpression_in_ruleSetExp8229);
                    lv_elements_4_0=ruleOclExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSetExpRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_4_0, 
                              		"OclExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3755:2: (otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==18) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3755:4: otherlv_5= ',' ( (lv_elements_6_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSetExp8242); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getSetExpAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3759:1: ( (lv_elements_6_0= ruleOclExpression ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3760:1: (lv_elements_6_0= ruleOclExpression )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3760:1: (lv_elements_6_0= ruleOclExpression )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3761:3: lv_elements_6_0= ruleOclExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSetExpAccess().getElementsOclExpressionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOclExpression_in_ruleSetExp8263);
                    	    lv_elements_6_0=ruleOclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSetExpRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_6_0, 
                    	              		"OclExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleSetExp8277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSetExpAccess().getRightCurlyBracketKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleSetExp8291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSetExpAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleSetExp"


    // $ANTLR start "entryRuleTupleExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3793:1: entryRuleTupleExp returns [EObject current=null] : iv_ruleTupleExp= ruleTupleExp EOF ;
    public final EObject entryRuleTupleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3794:2: (iv_ruleTupleExp= ruleTupleExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3795:2: iv_ruleTupleExp= ruleTupleExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleExpRule()); 
            }
            pushFollow(FOLLOW_ruleTupleExp_in_entryRuleTupleExp8327);
            iv_ruleTupleExp=ruleTupleExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleExp8337); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleExp"


    // $ANTLR start "ruleTupleExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3802:1: ruleTupleExp returns [EObject current=null] : ( () otherlv_1= 'Tuple' otherlv_2= '{' (otherlv_3= '{' ( (lv_tuplePart_4_0= ruleTuplePart ) ) (otherlv_5= ',' ( (lv_tuplePart_6_0= ruleTuplePart ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) ;
    public final EObject ruleTupleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_tuplePart_4_0 = null;

        EObject lv_tuplePart_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3805:28: ( ( () otherlv_1= 'Tuple' otherlv_2= '{' (otherlv_3= '{' ( (lv_tuplePart_4_0= ruleTuplePart ) ) (otherlv_5= ',' ( (lv_tuplePart_6_0= ruleTuplePart ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3806:1: ( () otherlv_1= 'Tuple' otherlv_2= '{' (otherlv_3= '{' ( (lv_tuplePart_4_0= ruleTuplePart ) ) (otherlv_5= ',' ( (lv_tuplePart_6_0= ruleTuplePart ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3806:1: ( () otherlv_1= 'Tuple' otherlv_2= '{' (otherlv_3= '{' ( (lv_tuplePart_4_0= ruleTuplePart ) ) (otherlv_5= ',' ( (lv_tuplePart_6_0= ruleTuplePart ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3806:2: () otherlv_1= 'Tuple' otherlv_2= '{' (otherlv_3= '{' ( (lv_tuplePart_4_0= ruleTuplePart ) ) (otherlv_5= ',' ( (lv_tuplePart_6_0= ruleTuplePart ) ) )* otherlv_7= '}' )? otherlv_8= '}'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3806:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3807:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTupleExpAccess().getTupleExpAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleTupleExp8386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleExpAccess().getTupleKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTupleExp8398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTupleExpAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3823:1: (otherlv_3= '{' ( (lv_tuplePart_4_0= ruleTuplePart ) ) (otherlv_5= ',' ( (lv_tuplePart_6_0= ruleTuplePart ) ) )* otherlv_7= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==12) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3823:3: otherlv_3= '{' ( (lv_tuplePart_4_0= ruleTuplePart ) ) (otherlv_5= ',' ( (lv_tuplePart_6_0= ruleTuplePart ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleTupleExp8411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTupleExpAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3827:1: ( (lv_tuplePart_4_0= ruleTuplePart ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3828:1: (lv_tuplePart_4_0= ruleTuplePart )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3828:1: (lv_tuplePart_4_0= ruleTuplePart )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3829:3: lv_tuplePart_4_0= ruleTuplePart
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleExpAccess().getTuplePartTuplePartParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuplePart_in_ruleTupleExp8432);
                    lv_tuplePart_4_0=ruleTuplePart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTupleExpRule());
                      	        }
                             		add(
                             			current, 
                             			"tuplePart",
                              		lv_tuplePart_4_0, 
                              		"TuplePart");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3845:2: (otherlv_5= ',' ( (lv_tuplePart_6_0= ruleTuplePart ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==18) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3845:4: otherlv_5= ',' ( (lv_tuplePart_6_0= ruleTuplePart ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleTupleExp8445); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getTupleExpAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3849:1: ( (lv_tuplePart_6_0= ruleTuplePart ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3850:1: (lv_tuplePart_6_0= ruleTuplePart )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3850:1: (lv_tuplePart_6_0= ruleTuplePart )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3851:3: lv_tuplePart_6_0= ruleTuplePart
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTupleExpAccess().getTuplePartTuplePartParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTuplePart_in_ruleTupleExp8466);
                    	    lv_tuplePart_6_0=ruleTuplePart();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTupleExpRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"tuplePart",
                    	              		lv_tuplePart_6_0, 
                    	              		"TuplePart");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleTupleExp8480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTupleExpAccess().getRightCurlyBracketKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleTupleExp8494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getTupleExpAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleTupleExp"


    // $ANTLR start "entryRuleMapExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3883:1: entryRuleMapExp returns [EObject current=null] : iv_ruleMapExp= ruleMapExp EOF ;
    public final EObject entryRuleMapExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3884:2: (iv_ruleMapExp= ruleMapExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3885:2: iv_ruleMapExp= ruleMapExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapExpRule()); 
            }
            pushFollow(FOLLOW_ruleMapExp_in_entryRuleMapExp8530);
            iv_ruleMapExp=ruleMapExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapExp8540); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapExp"


    // $ANTLR start "ruleMapExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3892:1: ruleMapExp returns [EObject current=null] : ( () otherlv_1= 'Map' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleMapElement ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleMapElement ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) ;
    public final EObject ruleMapExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3895:28: ( ( () otherlv_1= 'Map' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleMapElement ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleMapElement ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3896:1: ( () otherlv_1= 'Map' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleMapElement ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleMapElement ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3896:1: ( () otherlv_1= 'Map' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleMapElement ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleMapElement ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3896:2: () otherlv_1= 'Map' otherlv_2= '{' (otherlv_3= '{' ( (lv_elements_4_0= ruleMapElement ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleMapElement ) ) )* otherlv_7= '}' )? otherlv_8= '}'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3896:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3897:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMapExpAccess().getMapExpAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleMapExp8589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapExpAccess().getMapKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMapExp8601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMapExpAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3913:1: (otherlv_3= '{' ( (lv_elements_4_0= ruleMapElement ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleMapElement ) ) )* otherlv_7= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==12) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3913:3: otherlv_3= '{' ( (lv_elements_4_0= ruleMapElement ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleMapElement ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleMapExp8614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMapExpAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3917:1: ( (lv_elements_4_0= ruleMapElement ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3918:1: (lv_elements_4_0= ruleMapElement )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3918:1: (lv_elements_4_0= ruleMapElement )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3919:3: lv_elements_4_0= ruleMapElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapExpAccess().getElementsMapElementParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMapElement_in_ruleMapExp8635);
                    lv_elements_4_0=ruleMapElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMapExpRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_4_0, 
                              		"MapElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3935:2: (otherlv_5= ',' ( (lv_elements_6_0= ruleMapElement ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==18) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3935:4: otherlv_5= ',' ( (lv_elements_6_0= ruleMapElement ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleMapExp8648); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getMapExpAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3939:1: ( (lv_elements_6_0= ruleMapElement ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3940:1: (lv_elements_6_0= ruleMapElement )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3940:1: (lv_elements_6_0= ruleMapElement )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3941:3: lv_elements_6_0= ruleMapElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMapExpAccess().getElementsMapElementParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMapElement_in_ruleMapExp8669);
                    	    lv_elements_6_0=ruleMapElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMapExpRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_6_0, 
                    	              		"MapElement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleMapExp8683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMapExpAccess().getRightCurlyBracketKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleMapExp8697); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMapExpAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleMapExp"


    // $ANTLR start "entryRuleEnumLiteralExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3973:1: entryRuleEnumLiteralExp returns [EObject current=null] : iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF ;
    public final EObject entryRuleEnumLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3974:2: (iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3975:2: iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumLiteralExpRule()); 
            }
            pushFollow(FOLLOW_ruleEnumLiteralExp_in_entryRuleEnumLiteralExp8733);
            iv_ruleEnumLiteralExp=ruleEnumLiteralExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumLiteralExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteralExp8743); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumLiteralExp"


    // $ANTLR start "ruleEnumLiteralExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3982:1: ruleEnumLiteralExp returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEnumLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3985:28: ( (otherlv_0= '#' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3986:1: (otherlv_0= '#' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3986:1: (otherlv_0= '#' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3986:3: otherlv_0= '#' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleEnumLiteralExp8780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumLiteralExpAccess().getNumberSignKeyword_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3990:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3991:1: (lv_name_1_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3991:1: (lv_name_1_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:3992:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumLiteralExp8797); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEnumLiteralExpAccess().getNameSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumLiteralExpRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleEnumLiteralExp"


    // $ANTLR start "entryRuleOclUndefinedExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4016:1: entryRuleOclUndefinedExp returns [EObject current=null] : iv_ruleOclUndefinedExp= ruleOclUndefinedExp EOF ;
    public final EObject entryRuleOclUndefinedExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclUndefinedExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4017:2: (iv_ruleOclUndefinedExp= ruleOclUndefinedExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4018:2: iv_ruleOclUndefinedExp= ruleOclUndefinedExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclUndefinedExpRule()); 
            }
            pushFollow(FOLLOW_ruleOclUndefinedExp_in_entryRuleOclUndefinedExp8838);
            iv_ruleOclUndefinedExp=ruleOclUndefinedExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclUndefinedExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOclUndefinedExp8848); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOclUndefinedExp"


    // $ANTLR start "ruleOclUndefinedExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4025:1: ruleOclUndefinedExp returns [EObject current=null] : ( () otherlv_1= 'OclUndefined' ) ;
    public final EObject ruleOclUndefinedExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4028:28: ( ( () otherlv_1= 'OclUndefined' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4029:1: ( () otherlv_1= 'OclUndefined' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4029:1: ( () otherlv_1= 'OclUndefined' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4029:2: () otherlv_1= 'OclUndefined'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4029:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4030:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOclUndefinedExpAccess().getOclUndefinedExpAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleOclUndefinedExp8897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOclUndefinedExpAccess().getOclUndefinedKeyword_1());
                  
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
    // $ANTLR end "ruleOclUndefinedExp"


    // $ANTLR start "entryRuleNavigationOrAttributeCallExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4050:1: entryRuleNavigationOrAttributeCallExp returns [EObject current=null] : iv_ruleNavigationOrAttributeCallExp= ruleNavigationOrAttributeCallExp EOF ;
    public final EObject entryRuleNavigationOrAttributeCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOrAttributeCallExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4051:2: (iv_ruleNavigationOrAttributeCallExp= ruleNavigationOrAttributeCallExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4052:2: iv_ruleNavigationOrAttributeCallExp= ruleNavigationOrAttributeCallExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOrAttributeCallExpRule()); 
            }
            pushFollow(FOLLOW_ruleNavigationOrAttributeCallExp_in_entryRuleNavigationOrAttributeCallExp8933);
            iv_ruleNavigationOrAttributeCallExp=ruleNavigationOrAttributeCallExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOrAttributeCallExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationOrAttributeCallExp8943); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigationOrAttributeCallExp"


    // $ANTLR start "ruleNavigationOrAttributeCallExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4059:1: ruleNavigationOrAttributeCallExp returns [EObject current=null] : ( () otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleNavigationOrAttributeCallExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4062:28: ( ( () otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4063:1: ( () otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4063:1: ( () otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4063:2: () otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4063:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4064:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNavigationOrAttributeCallExpAccess().getNavigationOrAttributeCallExpAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleNavigationOrAttributeCallExp8992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNavigationOrAttributeCallExpAccess().getFullStopKeyword_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4076:1: ( (lv_name_2_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4077:1: (lv_name_2_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4077:1: (lv_name_2_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4078:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNavigationOrAttributeCallExp9009); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getNavigationOrAttributeCallExpAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigationOrAttributeCallExpRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
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
    // $ANTLR end "ruleNavigationOrAttributeCallExp"


    // $ANTLR start "entryRuleOperatorCallExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4104:1: entryRuleOperatorCallExp returns [EObject current=null] : iv_ruleOperatorCallExp= ruleOperatorCallExp EOF ;
    public final EObject entryRuleOperatorCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorCallExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4105:2: (iv_ruleOperatorCallExp= ruleOperatorCallExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4106:2: iv_ruleOperatorCallExp= ruleOperatorCallExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorCallExpRule()); 
            }
            pushFollow(FOLLOW_ruleOperatorCallExp_in_entryRuleOperatorCallExp9052);
            iv_ruleOperatorCallExp=ruleOperatorCallExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperatorCallExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorCallExp9062); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperatorCallExp"


    // $ANTLR start "ruleOperatorCallExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4113:1: ruleOperatorCallExp returns [EObject current=null] : ( ( (lv_operationName_0_0= ruleString0 ) ) otherlv_1= '(' (otherlv_2= 'arguments' otherlv_3= '{' ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= ')' ) ;
    public final EObject ruleOperatorCallExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_operationName_0_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4116:28: ( ( ( (lv_operationName_0_0= ruleString0 ) ) otherlv_1= '(' (otherlv_2= 'arguments' otherlv_3= '{' ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4117:1: ( ( (lv_operationName_0_0= ruleString0 ) ) otherlv_1= '(' (otherlv_2= 'arguments' otherlv_3= '{' ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4117:1: ( ( (lv_operationName_0_0= ruleString0 ) ) otherlv_1= '(' (otherlv_2= 'arguments' otherlv_3= '{' ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4117:2: ( (lv_operationName_0_0= ruleString0 ) ) otherlv_1= '(' (otherlv_2= 'arguments' otherlv_3= '{' ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )? otherlv_8= ')'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4117:2: ( (lv_operationName_0_0= ruleString0 ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4118:1: (lv_operationName_0_0= ruleString0 )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4118:1: (lv_operationName_0_0= ruleString0 )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4119:3: lv_operationName_0_0= ruleString0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorCallExpAccess().getOperationNameString0ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleString0_in_ruleOperatorCallExp9108);
            lv_operationName_0_0=ruleString0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperatorCallExpRule());
              	        }
                     		set(
                     			current, 
                     			"operationName",
                      		lv_operationName_0_0, 
                      		"String0");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleOperatorCallExp9120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperatorCallExpAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4139:1: (otherlv_2= 'arguments' otherlv_3= '{' ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* otherlv_7= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==65) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4139:3: otherlv_2= 'arguments' otherlv_3= '{' ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleOperatorCallExp9133); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOperatorCallExpAccess().getArgumentsKeyword_2_0());
                          
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleOperatorCallExp9145); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOperatorCallExpAccess().getLeftCurlyBracketKeyword_2_1());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4147:1: ( (lv_arguments_4_0= ruleOclExpression ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4148:1: (lv_arguments_4_0= ruleOclExpression )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4148:1: (lv_arguments_4_0= ruleOclExpression )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4149:3: lv_arguments_4_0= ruleOclExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperatorCallExpAccess().getArgumentsOclExpressionParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclExpression_in_ruleOperatorCallExp9166);
                    lv_arguments_4_0=ruleOclExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperatorCallExpRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_4_0, 
                              		"OclExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4165:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==18) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4165:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleOperatorCallExp9179); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperatorCallExpAccess().getCommaKeyword_2_3_0());
                    	          
                    	    }
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4169:1: ( (lv_arguments_6_0= ruleOclExpression ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4170:1: (lv_arguments_6_0= ruleOclExpression )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4170:1: (lv_arguments_6_0= ruleOclExpression )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4171:3: lv_arguments_6_0= ruleOclExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperatorCallExpAccess().getArgumentsOclExpressionParserRuleCall_2_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOclExpression_in_ruleOperatorCallExp9200);
                    	    lv_arguments_6_0=ruleOclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperatorCallExpRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_6_0, 
                    	              		"OclExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleOperatorCallExp9214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getOperatorCallExpAccess().getRightCurlyBracketKeyword_2_4());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleOperatorCallExp9228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getOperatorCallExpAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleOperatorCallExp"


    // $ANTLR start "entryRuleCollectionOperationCallExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4203:1: entryRuleCollectionOperationCallExp returns [EObject current=null] : iv_ruleCollectionOperationCallExp= ruleCollectionOperationCallExp EOF ;
    public final EObject entryRuleCollectionOperationCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionOperationCallExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4204:2: (iv_ruleCollectionOperationCallExp= ruleCollectionOperationCallExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4205:2: iv_ruleCollectionOperationCallExp= ruleCollectionOperationCallExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionOperationCallExpRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionOperationCallExp_in_entryRuleCollectionOperationCallExp9264);
            iv_ruleCollectionOperationCallExp=ruleCollectionOperationCallExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionOperationCallExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionOperationCallExp9274); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionOperationCallExp"


    // $ANTLR start "ruleCollectionOperationCallExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4212:1: ruleCollectionOperationCallExp returns [EObject current=null] : ( ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleCollectionOperationCallExp() throws RecognitionException {
        EObject current = null;

        Token lv_operationName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4215:28: ( ( ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* otherlv_5= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4216:1: ( ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* otherlv_5= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4216:1: ( ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* otherlv_5= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4216:2: ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* otherlv_5= ')'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4216:2: ( (lv_operationName_0_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4217:1: (lv_operationName_0_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4217:1: (lv_operationName_0_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4218:3: lv_operationName_0_0= RULE_ID
            {
            lv_operationName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionOperationCallExp9316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_operationName_0_0, grammarAccess.getCollectionOperationCallExpAccess().getOperationNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCollectionOperationCallExpRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"operationName",
                      		lv_operationName_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleCollectionOperationCallExp9333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionOperationCallExpAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4238:1: ( (lv_arguments_2_0= ruleOclExpression ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4239:1: (lv_arguments_2_0= ruleOclExpression )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4239:1: (lv_arguments_2_0= ruleOclExpression )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4240:3: lv_arguments_2_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionOperationCallExpAccess().getArgumentsOclExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclExpression_in_ruleCollectionOperationCallExp9354);
            lv_arguments_2_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionOperationCallExpRule());
              	        }
                     		add(
                     			current, 
                     			"arguments",
                      		lv_arguments_2_0, 
                      		"OclExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4256:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==18) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4256:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleCollectionOperationCallExp9367); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getCollectionOperationCallExpAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4260:1: ( (lv_arguments_4_0= ruleOclExpression ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4261:1: (lv_arguments_4_0= ruleOclExpression )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4261:1: (lv_arguments_4_0= ruleOclExpression )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4262:3: lv_arguments_4_0= ruleOclExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCollectionOperationCallExpAccess().getArgumentsOclExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOclExpression_in_ruleCollectionOperationCallExp9388);
            	    lv_arguments_4_0=ruleOclExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCollectionOperationCallExpRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"arguments",
            	              		lv_arguments_4_0, 
            	              		"OclExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleCollectionOperationCallExp9402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCollectionOperationCallExpAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleCollectionOperationCallExp"


    // $ANTLR start "entryRuleIterateExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4290:1: entryRuleIterateExp returns [EObject current=null] : iv_ruleIterateExp= ruleIterateExp EOF ;
    public final EObject entryRuleIterateExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterateExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4291:2: (iv_ruleIterateExp= ruleIterateExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4292:2: iv_ruleIterateExp= ruleIterateExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIterateExpRule()); 
            }
            pushFollow(FOLLOW_ruleIterateExp_in_entryRuleIterateExp9438);
            iv_ruleIterateExp=ruleIterateExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIterateExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterateExp9448); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIterateExp"


    // $ANTLR start "ruleIterateExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4299:1: ruleIterateExp returns [EObject current=null] : (otherlv_0= 'iterate' otherlv_1= '(' ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* ) otherlv_5= ';' ( (lv_result_6_0= ruleVariableDeclaration ) ) otherlv_7= '|' ( (lv_body_8_0= ruleOclExpression ) ) otherlv_9= ')' ) ;
    public final EObject ruleIterateExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_iterators_2_0 = null;

        EObject lv_iterators_4_0 = null;

        EObject lv_result_6_0 = null;

        EObject lv_body_8_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4302:28: ( (otherlv_0= 'iterate' otherlv_1= '(' ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* ) otherlv_5= ';' ( (lv_result_6_0= ruleVariableDeclaration ) ) otherlv_7= '|' ( (lv_body_8_0= ruleOclExpression ) ) otherlv_9= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4303:1: (otherlv_0= 'iterate' otherlv_1= '(' ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* ) otherlv_5= ';' ( (lv_result_6_0= ruleVariableDeclaration ) ) otherlv_7= '|' ( (lv_body_8_0= ruleOclExpression ) ) otherlv_9= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4303:1: (otherlv_0= 'iterate' otherlv_1= '(' ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* ) otherlv_5= ';' ( (lv_result_6_0= ruleVariableDeclaration ) ) otherlv_7= '|' ( (lv_body_8_0= ruleOclExpression ) ) otherlv_9= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4303:3: otherlv_0= 'iterate' otherlv_1= '(' ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* ) otherlv_5= ';' ( (lv_result_6_0= ruleVariableDeclaration ) ) otherlv_7= '|' ( (lv_body_8_0= ruleOclExpression ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleIterateExp9485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIterateExpAccess().getIterateKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleIterateExp9497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIterateExpAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4311:1: ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4311:2: ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )*
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4311:2: ( (lv_iterators_2_0= ruleIterator ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4312:1: (lv_iterators_2_0= ruleIterator )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4312:1: (lv_iterators_2_0= ruleIterator )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4313:3: lv_iterators_2_0= ruleIterator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIterateExpAccess().getIteratorsIteratorParserRuleCall_2_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIterator_in_ruleIterateExp9519);
            lv_iterators_2_0=ruleIterator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIterateExpRule());
              	        }
                     		add(
                     			current, 
                     			"iterators",
                      		lv_iterators_2_0, 
                      		"Iterator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4329:2: (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==18) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4329:4: otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleIterateExp9532); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getIterateExpAccess().getCommaKeyword_2_1_0());
            	          
            	    }
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4333:1: ( (lv_iterators_4_0= ruleIterator ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4334:1: (lv_iterators_4_0= ruleIterator )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4334:1: (lv_iterators_4_0= ruleIterator )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4335:3: lv_iterators_4_0= ruleIterator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIterateExpAccess().getIteratorsIteratorParserRuleCall_2_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIterator_in_ruleIterateExp9553);
            	    lv_iterators_4_0=ruleIterator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIterateExpRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"iterators",
            	              		lv_iterators_4_0, 
            	              		"Iterator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleIterateExp9568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIterateExpAccess().getSemicolonKeyword_3());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4355:1: ( (lv_result_6_0= ruleVariableDeclaration ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4356:1: (lv_result_6_0= ruleVariableDeclaration )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4356:1: (lv_result_6_0= ruleVariableDeclaration )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4357:3: lv_result_6_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIterateExpAccess().getResultVariableDeclarationParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleIterateExp9589);
            lv_result_6_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIterateExpRule());
              	        }
                     		set(
                     			current, 
                     			"result",
                      		lv_result_6_0, 
                      		"VariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,67,FOLLOW_67_in_ruleIterateExp9601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getIterateExpAccess().getVerticalLineKeyword_5());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4377:1: ( (lv_body_8_0= ruleOclExpression ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4378:1: (lv_body_8_0= ruleOclExpression )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4378:1: (lv_body_8_0= ruleOclExpression )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4379:3: lv_body_8_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIterateExpAccess().getBodyOclExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclExpression_in_ruleIterateExp9622);
            lv_body_8_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIterateExpRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_8_0, 
                      		"OclExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleIterateExp9634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getIterateExpAccess().getRightParenthesisKeyword_7());
                  
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
    // $ANTLR end "ruleIterateExp"


    // $ANTLR start "entryRuleIteratorExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4407:1: entryRuleIteratorExp returns [EObject current=null] : iv_ruleIteratorExp= ruleIteratorExp EOF ;
    public final EObject entryRuleIteratorExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteratorExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4408:2: (iv_ruleIteratorExp= ruleIteratorExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4409:2: iv_ruleIteratorExp= ruleIteratorExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteratorExpRule()); 
            }
            pushFollow(FOLLOW_ruleIteratorExp_in_entryRuleIteratorExp9670);
            iv_ruleIteratorExp=ruleIteratorExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIteratorExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIteratorExp9680); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIteratorExp"


    // $ANTLR start "ruleIteratorExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4416:1: ruleIteratorExp returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '(' ( ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* ) | ( (lv_body_5_0= ruleOclExpression ) ) ) otherlv_6= ')' ) ;
    public final EObject ruleIteratorExp() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_iterators_2_0 = null;

        EObject lv_iterators_4_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4419:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '(' ( ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* ) | ( (lv_body_5_0= ruleOclExpression ) ) ) otherlv_6= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4420:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '(' ( ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* ) | ( (lv_body_5_0= ruleOclExpression ) ) ) otherlv_6= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4420:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '(' ( ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* ) | ( (lv_body_5_0= ruleOclExpression ) ) ) otherlv_6= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4420:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '(' ( ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* ) | ( (lv_body_5_0= ruleOclExpression ) ) ) otherlv_6= ')'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4420:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4421:1: (lv_name_0_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4421:1: (lv_name_0_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4422:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIteratorExp9722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getIteratorExpAccess().getNameSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIteratorExpRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleIteratorExp9739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIteratorExpAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4442:1: ( ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* ) | ( (lv_body_5_0= ruleOclExpression ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==51) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred104_InternalEmig()) ) {
                    alt47=1;
                }
                else if ( (true) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_STRING)||LA47_0==53||(LA47_0>=55 && LA47_0<=64)||LA47_0==66||LA47_0==68||LA47_0==70||(LA47_0>=74 && LA47_0<=78)||(LA47_0>=81 && LA47_0<=85)||(LA47_0>=90 && LA47_0<=92)) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4442:2: ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4442:2: ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4442:3: ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )*
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4442:3: ( (lv_iterators_2_0= ruleIterator ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4443:1: (lv_iterators_2_0= ruleIterator )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4443:1: (lv_iterators_2_0= ruleIterator )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4444:3: lv_iterators_2_0= ruleIterator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteratorExpAccess().getIteratorsIteratorParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIterator_in_ruleIteratorExp9762);
                    lv_iterators_2_0=ruleIterator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIteratorExpRule());
                      	        }
                             		add(
                             			current, 
                             			"iterators",
                              		lv_iterators_2_0, 
                              		"Iterator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4460:2: (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==18) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4460:4: otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleIteratorExp9775); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getIteratorExpAccess().getCommaKeyword_2_0_1_0());
                    	          
                    	    }
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4464:1: ( (lv_iterators_4_0= ruleIterator ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4465:1: (lv_iterators_4_0= ruleIterator )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4465:1: (lv_iterators_4_0= ruleIterator )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4466:3: lv_iterators_4_0= ruleIterator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIteratorExpAccess().getIteratorsIteratorParserRuleCall_2_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIterator_in_ruleIteratorExp9796);
                    	    lv_iterators_4_0=ruleIterator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getIteratorExpRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"iterators",
                    	              		lv_iterators_4_0, 
                    	              		"Iterator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4483:6: ( (lv_body_5_0= ruleOclExpression ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4483:6: ( (lv_body_5_0= ruleOclExpression ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4484:1: (lv_body_5_0= ruleOclExpression )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4484:1: (lv_body_5_0= ruleOclExpression )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4485:3: lv_body_5_0= ruleOclExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIteratorExpAccess().getBodyOclExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclExpression_in_ruleIteratorExp9826);
                    lv_body_5_0=ruleOclExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIteratorExpRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_5_0, 
                              		"OclExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleIteratorExp9839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getIteratorExpAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleIteratorExp"


    // $ANTLR start "entryRuleLetExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4513:1: entryRuleLetExp returns [EObject current=null] : iv_ruleLetExp= ruleLetExp EOF ;
    public final EObject entryRuleLetExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4514:2: (iv_ruleLetExp= ruleLetExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4515:2: iv_ruleLetExp= ruleLetExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpRule()); 
            }
            pushFollow(FOLLOW_ruleLetExp_in_entryRuleLetExp9875);
            iv_ruleLetExp=ruleLetExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetExp9885); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetExp"


    // $ANTLR start "ruleLetExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4522:1: ruleLetExp returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) ) ;
    public final EObject ruleLetExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_in__3_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4525:28: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4526:1: (otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4526:1: (otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4526:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclaration ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleLetExp9922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLetExpAccess().getLetKeyword_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4530:1: ( (lv_variable_1_0= ruleVariableDeclaration ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4531:1: (lv_variable_1_0= ruleVariableDeclaration )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4531:1: (lv_variable_1_0= ruleVariableDeclaration )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4532:3: lv_variable_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpAccess().getVariableVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLetExp9943);
            lv_variable_1_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_1_0, 
                      		"VariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleLetExp9955); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLetExpAccess().getInKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4552:1: ( (lv_in__3_0= ruleOclExpression ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4553:1: (lv_in__3_0= ruleOclExpression )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4553:1: (lv_in__3_0= ruleOclExpression )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4554:3: lv_in__3_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpAccess().getIn_OclExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclExpression_in_ruleLetExp9976);
            lv_in__3_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpRule());
              	        }
                     		set(
                     			current, 
                     			"in_",
                      		lv_in__3_0, 
                      		"OclExpression");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleLetExp"


    // $ANTLR start "entryRuleIfExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4578:1: entryRuleIfExp returns [EObject current=null] : iv_ruleIfExp= ruleIfExp EOF ;
    public final EObject entryRuleIfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4579:2: (iv_ruleIfExp= ruleIfExp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4580:2: iv_ruleIfExp= ruleIfExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpRule()); 
            }
            pushFollow(FOLLOW_ruleIfExp_in_entryRuleIfExp10012);
            iv_ruleIfExp=ruleIfExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExp10022); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfExp"


    // $ANTLR start "ruleIfExp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4587:1: ruleIfExp returns [EObject current=null] : (otherlv_0= 'If' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) ;
    public final EObject ruleIfExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenExpression_3_0 = null;

        EObject lv_elseExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4590:28: ( (otherlv_0= 'If' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4591:1: (otherlv_0= 'If' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4591:1: (otherlv_0= 'If' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4591:3: otherlv_0= 'If' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleIfExp10059); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpAccess().getIfKeyword_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4595:1: ( (lv_condition_1_0= ruleOclExpression ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4596:1: (lv_condition_1_0= ruleOclExpression )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4596:1: (lv_condition_1_0= ruleOclExpression )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4597:3: lv_condition_1_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpAccess().getConditionOclExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclExpression_in_ruleIfExp10080);
            lv_condition_1_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"OclExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleIfExp10092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpAccess().getThenKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4617:1: ( (lv_thenExpression_3_0= ruleOclExpression ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4618:1: (lv_thenExpression_3_0= ruleOclExpression )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4618:1: (lv_thenExpression_3_0= ruleOclExpression )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4619:3: lv_thenExpression_3_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpAccess().getThenExpressionOclExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclExpression_in_ruleIfExp10113);
            lv_thenExpression_3_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpRule());
              	        }
                     		set(
                     			current, 
                     			"thenExpression",
                      		lv_thenExpression_3_0, 
                      		"OclExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleIfExp10125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfExpAccess().getElseKeyword_4());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4639:1: ( (lv_elseExpression_5_0= ruleOclExpression ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4640:1: (lv_elseExpression_5_0= ruleOclExpression )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4640:1: (lv_elseExpression_5_0= ruleOclExpression )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4641:3: lv_elseExpression_5_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpAccess().getElseExpressionOclExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclExpression_in_ruleIfExp10146);
            lv_elseExpression_5_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpRule());
              	        }
                     		set(
                     			current, 
                     			"elseExpression",
                      		lv_elseExpression_5_0, 
                      		"OclExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,73,FOLLOW_73_in_ruleIfExp10158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getIfExpAccess().getEndifKeyword_6());
                  
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
    // $ANTLR end "ruleIfExp"


    // $ANTLR start "entryRuleCollectionType_Impl"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4669:1: entryRuleCollectionType_Impl returns [EObject current=null] : iv_ruleCollectionType_Impl= ruleCollectionType_Impl EOF ;
    public final EObject entryRuleCollectionType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType_Impl = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4670:2: (iv_ruleCollectionType_Impl= ruleCollectionType_Impl EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4671:2: iv_ruleCollectionType_Impl= ruleCollectionType_Impl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionType_ImplRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionType_Impl_in_entryRuleCollectionType_Impl10194);
            iv_ruleCollectionType_Impl=ruleCollectionType_Impl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionType_Impl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionType_Impl10204); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionType_Impl"


    // $ANTLR start "ruleCollectionType_Impl"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4678:1: ruleCollectionType_Impl returns [EObject current=null] : (otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) ;
    public final EObject ruleCollectionType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4681:28: ( (otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4682:1: (otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4682:1: (otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4682:3: otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleCollectionType_Impl10241); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCollectionType_ImplAccess().getCollectionKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleCollectionType_Impl10253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionType_ImplAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4690:1: ( (lv_elementType_2_0= ruleOclType ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4691:1: (lv_elementType_2_0= ruleOclType )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4691:1: (lv_elementType_2_0= ruleOclType )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4692:3: lv_elementType_2_0= ruleOclType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionType_ImplAccess().getElementTypeOclTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclType_in_ruleCollectionType_Impl10274);
            lv_elementType_2_0=ruleOclType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionType_ImplRule());
              	        }
                     		set(
                     			current, 
                     			"elementType",
                      		lv_elementType_2_0, 
                      		"OclType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleCollectionType_Impl10286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCollectionType_ImplAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleCollectionType_Impl"


    // $ANTLR start "entryRuleStringType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4720:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4721:2: (iv_ruleStringType= ruleStringType EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4722:2: iv_ruleStringType= ruleStringType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTypeRule()); 
            }
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType10322);
            iv_ruleStringType=ruleStringType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType10332); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4729:1: ruleStringType returns [EObject current=null] : otherlv_0= 'String' ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4732:28: (otherlv_0= 'String' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4733:2: otherlv_0= 'String'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleStringType10368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringTypeAccess().getStringKeyword());
                  
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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleBooleanType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4745:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4746:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4747:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType10403);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType10413); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4754:1: ruleBooleanType returns [EObject current=null] : otherlv_0= 'Boolean' ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4757:28: (otherlv_0= 'Boolean' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4758:2: otherlv_0= 'Boolean'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleBooleanType10449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBooleanTypeAccess().getBooleanKeyword());
                  
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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleIntegerType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4770:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4771:2: (iv_ruleIntegerType= ruleIntegerType EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4772:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType10484);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType10494); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4779:1: ruleIntegerType returns [EObject current=null] : otherlv_0= 'Integer' ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4782:28: (otherlv_0= 'Integer' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4783:2: otherlv_0= 'Integer'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleIntegerType10530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntegerTypeAccess().getIntegerKeyword());
                  
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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleRealType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4795:1: entryRuleRealType returns [EObject current=null] : iv_ruleRealType= ruleRealType EOF ;
    public final EObject entryRuleRealType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealType = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4796:2: (iv_ruleRealType= ruleRealType EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4797:2: iv_ruleRealType= ruleRealType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRealType_in_entryRuleRealType10565);
            iv_ruleRealType=ruleRealType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealType10575); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealType"


    // $ANTLR start "ruleRealType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4804:1: ruleRealType returns [EObject current=null] : otherlv_0= 'Real' ;
    public final EObject ruleRealType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4807:28: (otherlv_0= 'Real' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4808:2: otherlv_0= 'Real'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleRealType10611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRealTypeAccess().getRealKeyword());
                  
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
    // $ANTLR end "ruleRealType"


    // $ANTLR start "entryRuleBagType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4820:1: entryRuleBagType returns [EObject current=null] : iv_ruleBagType= ruleBagType EOF ;
    public final EObject entryRuleBagType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagType = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4821:2: (iv_ruleBagType= ruleBagType EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4822:2: iv_ruleBagType= ruleBagType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBagTypeRule()); 
            }
            pushFollow(FOLLOW_ruleBagType_in_entryRuleBagType10646);
            iv_ruleBagType=ruleBagType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBagType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBagType10656); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBagType"


    // $ANTLR start "ruleBagType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4829:1: ruleBagType returns [EObject current=null] : (otherlv_0= 'BagType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' ) ;
    public final EObject ruleBagType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_elementType_7_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4832:28: ( (otherlv_0= 'BagType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4833:1: (otherlv_0= 'BagType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4833:1: (otherlv_0= 'BagType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4833:3: otherlv_0= 'BagType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleBagType10693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBagTypeAccess().getBagTypeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleBagType10705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBagTypeAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,79,FOLLOW_79_in_ruleBagType10717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBagTypeAccess().getNameKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4845:1: ( (lv_name_3_0= ruleString0 ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4846:1: (lv_name_3_0= ruleString0 )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4846:1: (lv_name_3_0= ruleString0 )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4847:3: lv_name_3_0= ruleString0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBagTypeAccess().getNameString0ParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleString0_in_ruleBagType10738);
            lv_name_3_0=ruleString0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBagTypeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"String0");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4863:2: (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4863:4: otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) )
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleBagType10751); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBagTypeAccess().getTypeKeyword_4_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4867:1: ( (lv_type_5_0= ruleOclType ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4868:1: (lv_type_5_0= ruleOclType )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4868:1: (lv_type_5_0= ruleOclType )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4869:3: lv_type_5_0= ruleOclType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBagTypeAccess().getTypeOclTypeParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclType_in_ruleBagType10772);
                    lv_type_5_0=ruleOclType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBagTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_5_0, 
                              		"OclType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleBagType10786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBagTypeAccess().getElementTypeKeyword_5());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4889:1: ( (lv_elementType_7_0= ruleOclType ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4890:1: (lv_elementType_7_0= ruleOclType )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4890:1: (lv_elementType_7_0= ruleOclType )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4891:3: lv_elementType_7_0= ruleOclType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBagTypeAccess().getElementTypeOclTypeParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclType_in_ruleBagType10807);
            lv_elementType_7_0=ruleOclType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBagTypeRule());
              	        }
                     		set(
                     			current, 
                     			"elementType",
                      		lv_elementType_7_0, 
                      		"OclType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleBagType10819); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getBagTypeAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleBagType"


    // $ANTLR start "entryRuleOrderedSetType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4919:1: entryRuleOrderedSetType returns [EObject current=null] : iv_ruleOrderedSetType= ruleOrderedSetType EOF ;
    public final EObject entryRuleOrderedSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedSetType = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4920:2: (iv_ruleOrderedSetType= ruleOrderedSetType EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4921:2: iv_ruleOrderedSetType= ruleOrderedSetType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderedSetTypeRule()); 
            }
            pushFollow(FOLLOW_ruleOrderedSetType_in_entryRuleOrderedSetType10855);
            iv_ruleOrderedSetType=ruleOrderedSetType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderedSetType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedSetType10865); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrderedSetType"


    // $ANTLR start "ruleOrderedSetType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4928:1: ruleOrderedSetType returns [EObject current=null] : (otherlv_0= 'OrderedSetType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' ) ;
    public final EObject ruleOrderedSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_elementType_7_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4931:28: ( (otherlv_0= 'OrderedSetType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4932:1: (otherlv_0= 'OrderedSetType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4932:1: (otherlv_0= 'OrderedSetType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4932:3: otherlv_0= 'OrderedSetType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleOrderedSetType10902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOrderedSetTypeAccess().getOrderedSetTypeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleOrderedSetType10914); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOrderedSetTypeAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,79,FOLLOW_79_in_ruleOrderedSetType10926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOrderedSetTypeAccess().getNameKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4944:1: ( (lv_name_3_0= ruleString0 ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4945:1: (lv_name_3_0= ruleString0 )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4945:1: (lv_name_3_0= ruleString0 )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4946:3: lv_name_3_0= ruleString0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderedSetTypeAccess().getNameString0ParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleString0_in_ruleOrderedSetType10947);
            lv_name_3_0=ruleString0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrderedSetTypeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"String0");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4962:2: (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==54) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4962:4: otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) )
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleOrderedSetType10960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getOrderedSetTypeAccess().getTypeKeyword_4_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4966:1: ( (lv_type_5_0= ruleOclType ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4967:1: (lv_type_5_0= ruleOclType )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4967:1: (lv_type_5_0= ruleOclType )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4968:3: lv_type_5_0= ruleOclType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrderedSetTypeAccess().getTypeOclTypeParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclType_in_ruleOrderedSetType10981);
                    lv_type_5_0=ruleOclType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrderedSetTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_5_0, 
                              		"OclType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleOrderedSetType10995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOrderedSetTypeAccess().getElementTypeKeyword_5());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4988:1: ( (lv_elementType_7_0= ruleOclType ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4989:1: (lv_elementType_7_0= ruleOclType )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4989:1: (lv_elementType_7_0= ruleOclType )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4990:3: lv_elementType_7_0= ruleOclType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderedSetTypeAccess().getElementTypeOclTypeParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclType_in_ruleOrderedSetType11016);
            lv_elementType_7_0=ruleOclType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrderedSetTypeRule());
              	        }
                     		set(
                     			current, 
                     			"elementType",
                      		lv_elementType_7_0, 
                      		"OclType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleOrderedSetType11028); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getOrderedSetTypeAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleOrderedSetType"


    // $ANTLR start "entryRuleSequenceType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5018:1: entryRuleSequenceType returns [EObject current=null] : iv_ruleSequenceType= ruleSequenceType EOF ;
    public final EObject entryRuleSequenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceType = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5019:2: (iv_ruleSequenceType= ruleSequenceType EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5020:2: iv_ruleSequenceType= ruleSequenceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceTypeRule()); 
            }
            pushFollow(FOLLOW_ruleSequenceType_in_entryRuleSequenceType11064);
            iv_ruleSequenceType=ruleSequenceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequenceType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceType11074); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSequenceType"


    // $ANTLR start "ruleSequenceType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5027:1: ruleSequenceType returns [EObject current=null] : (otherlv_0= 'SequenceType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' ) ;
    public final EObject ruleSequenceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_elementType_7_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5030:28: ( (otherlv_0= 'SequenceType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5031:1: (otherlv_0= 'SequenceType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5031:1: (otherlv_0= 'SequenceType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5031:3: otherlv_0= 'SequenceType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleSequenceType11111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSequenceTypeAccess().getSequenceTypeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleSequenceType11123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSequenceTypeAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,79,FOLLOW_79_in_ruleSequenceType11135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSequenceTypeAccess().getNameKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5043:1: ( (lv_name_3_0= ruleString0 ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5044:1: (lv_name_3_0= ruleString0 )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5044:1: (lv_name_3_0= ruleString0 )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5045:3: lv_name_3_0= ruleString0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSequenceTypeAccess().getNameString0ParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleString0_in_ruleSequenceType11156);
            lv_name_3_0=ruleString0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSequenceTypeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"String0");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5061:2: (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==54) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5061:4: otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) )
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleSequenceType11169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSequenceTypeAccess().getTypeKeyword_4_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5065:1: ( (lv_type_5_0= ruleOclType ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5066:1: (lv_type_5_0= ruleOclType )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5066:1: (lv_type_5_0= ruleOclType )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5067:3: lv_type_5_0= ruleOclType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSequenceTypeAccess().getTypeOclTypeParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclType_in_ruleSequenceType11190);
                    lv_type_5_0=ruleOclType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSequenceTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_5_0, 
                              		"OclType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleSequenceType11204); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSequenceTypeAccess().getElementTypeKeyword_5());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5087:1: ( (lv_elementType_7_0= ruleOclType ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5088:1: (lv_elementType_7_0= ruleOclType )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5088:1: (lv_elementType_7_0= ruleOclType )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5089:3: lv_elementType_7_0= ruleOclType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSequenceTypeAccess().getElementTypeOclTypeParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclType_in_ruleSequenceType11225);
            lv_elementType_7_0=ruleOclType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSequenceTypeRule());
              	        }
                     		set(
                     			current, 
                     			"elementType",
                      		lv_elementType_7_0, 
                      		"OclType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleSequenceType11237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSequenceTypeAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleSequenceType"


    // $ANTLR start "entryRuleSetType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5117:1: entryRuleSetType returns [EObject current=null] : iv_ruleSetType= ruleSetType EOF ;
    public final EObject entryRuleSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetType = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5118:2: (iv_ruleSetType= ruleSetType EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5119:2: iv_ruleSetType= ruleSetType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetTypeRule()); 
            }
            pushFollow(FOLLOW_ruleSetType_in_entryRuleSetType11273);
            iv_ruleSetType=ruleSetType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetType11283); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSetType"


    // $ANTLR start "ruleSetType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5126:1: ruleSetType returns [EObject current=null] : (otherlv_0= 'SetType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' ) ;
    public final EObject ruleSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_elementType_7_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5129:28: ( (otherlv_0= 'SetType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5130:1: (otherlv_0= 'SetType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5130:1: (otherlv_0= 'SetType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5130:3: otherlv_0= 'SetType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleString0 ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )? otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleOclType ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleSetType11320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSetTypeAccess().getSetTypeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleSetType11332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSetTypeAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,79,FOLLOW_79_in_ruleSetType11344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSetTypeAccess().getNameKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5142:1: ( (lv_name_3_0= ruleString0 ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5143:1: (lv_name_3_0= ruleString0 )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5143:1: (lv_name_3_0= ruleString0 )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5144:3: lv_name_3_0= ruleString0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetTypeAccess().getNameString0ParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleString0_in_ruleSetType11365);
            lv_name_3_0=ruleString0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSetTypeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"String0");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5160:2: (otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==54) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5160:4: otherlv_4= 'type' ( (lv_type_5_0= ruleOclType ) )
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleSetType11378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSetTypeAccess().getTypeKeyword_4_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5164:1: ( (lv_type_5_0= ruleOclType ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5165:1: (lv_type_5_0= ruleOclType )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5165:1: (lv_type_5_0= ruleOclType )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5166:3: lv_type_5_0= ruleOclType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSetTypeAccess().getTypeOclTypeParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclType_in_ruleSetType11399);
                    lv_type_5_0=ruleOclType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSetTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_5_0, 
                              		"OclType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleSetType11413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSetTypeAccess().getElementTypeKeyword_5());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5186:1: ( (lv_elementType_7_0= ruleOclType ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5187:1: (lv_elementType_7_0= ruleOclType )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5187:1: (lv_elementType_7_0= ruleOclType )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5188:3: lv_elementType_7_0= ruleOclType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetTypeAccess().getElementTypeOclTypeParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclType_in_ruleSetType11434);
            lv_elementType_7_0=ruleOclType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSetTypeRule());
              	        }
                     		set(
                     			current, 
                     			"elementType",
                      		lv_elementType_7_0, 
                      		"OclType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleSetType11446); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSetTypeAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleSetType"


    // $ANTLR start "entryRuleOclAnyType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5216:1: entryRuleOclAnyType returns [EObject current=null] : iv_ruleOclAnyType= ruleOclAnyType EOF ;
    public final EObject entryRuleOclAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclAnyType = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5217:2: (iv_ruleOclAnyType= ruleOclAnyType EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5218:2: iv_ruleOclAnyType= ruleOclAnyType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclAnyTypeRule()); 
            }
            pushFollow(FOLLOW_ruleOclAnyType_in_entryRuleOclAnyType11482);
            iv_ruleOclAnyType=ruleOclAnyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclAnyType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOclAnyType11492); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOclAnyType"


    // $ANTLR start "ruleOclAnyType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5225:1: ruleOclAnyType returns [EObject current=null] : otherlv_0= 'OclAny' ;
    public final EObject ruleOclAnyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5228:28: (otherlv_0= 'OclAny' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5229:2: otherlv_0= 'OclAny'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleOclAnyType11528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOclAnyTypeAccess().getOclAnyKeyword());
                  
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
    // $ANTLR end "ruleOclAnyType"


    // $ANTLR start "entryRuleTupleType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5241:1: entryRuleTupleType returns [EObject current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final EObject entryRuleTupleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleType = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5242:2: (iv_ruleTupleType= ruleTupleType EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5243:2: iv_ruleTupleType= ruleTupleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTupleType_in_entryRuleTupleType11563);
            iv_ruleTupleType=ruleTupleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleType11573); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleType"


    // $ANTLR start "ruleTupleType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5250:1: ruleTupleType returns [EObject current=null] : (otherlv_0= 'TupleType' otherlv_1= '( ' (otherlv_2= '{' ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* otherlv_6= '}' )? otherlv_7= ')' ) ;
    public final EObject ruleTupleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5253:28: ( (otherlv_0= 'TupleType' otherlv_1= '( ' (otherlv_2= '{' ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* otherlv_6= '}' )? otherlv_7= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5254:1: (otherlv_0= 'TupleType' otherlv_1= '( ' (otherlv_2= '{' ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* otherlv_6= '}' )? otherlv_7= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5254:1: (otherlv_0= 'TupleType' otherlv_1= '( ' (otherlv_2= '{' ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* otherlv_6= '}' )? otherlv_7= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5254:3: otherlv_0= 'TupleType' otherlv_1= '( ' (otherlv_2= '{' ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* otherlv_6= '}' )? otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleTupleType11610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleTypeAccess().getTupleTypeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,86,FOLLOW_86_in_ruleTupleType11622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleTypeAccess().getLeftParenthesisSpaceKeyword_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5262:1: (otherlv_2= '{' ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* otherlv_6= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==12) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5262:3: otherlv_2= '{' ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTupleType11635); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTupleTypeAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5266:1: ( (lv_attributes_3_0= ruleTupleTypeAttribute ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5267:1: (lv_attributes_3_0= ruleTupleTypeAttribute )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5267:1: (lv_attributes_3_0= ruleTupleTypeAttribute )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5268:3: lv_attributes_3_0= ruleTupleTypeAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleTypeAccess().getAttributesTupleTypeAttributeParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTupleTypeAttribute_in_ruleTupleType11656);
                    lv_attributes_3_0=ruleTupleTypeAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTupleTypeRule());
                      	        }
                             		add(
                             			current, 
                             			"attributes",
                              		lv_attributes_3_0, 
                              		"TupleTypeAttribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5284:2: (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==18) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5284:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleTupleType11669); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTupleTypeAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5288:1: ( (lv_attributes_5_0= ruleTupleTypeAttribute ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5289:1: (lv_attributes_5_0= ruleTupleTypeAttribute )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5289:1: (lv_attributes_5_0= ruleTupleTypeAttribute )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5290:3: lv_attributes_5_0= ruleTupleTypeAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTupleTypeAccess().getAttributesTupleTypeAttributeParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTupleTypeAttribute_in_ruleTupleType11690);
                    	    lv_attributes_5_0=ruleTupleTypeAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTupleTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_5_0, 
                    	              		"TupleTypeAttribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleTupleType11704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTupleTypeAccess().getRightCurlyBracketKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleTupleType11718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getTupleTypeAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleTupleType"


    // $ANTLR start "entryRuleOclModelElement"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5322:1: entryRuleOclModelElement returns [EObject current=null] : iv_ruleOclModelElement= ruleOclModelElement EOF ;
    public final EObject entryRuleOclModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclModelElement = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5323:2: (iv_ruleOclModelElement= ruleOclModelElement EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5324:2: iv_ruleOclModelElement= ruleOclModelElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclModelElementRule()); 
            }
            pushFollow(FOLLOW_ruleOclModelElement_in_entryRuleOclModelElement11754);
            iv_ruleOclModelElement=ruleOclModelElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclModelElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOclModelElement11764); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOclModelElement"


    // $ANTLR start "ruleOclModelElement"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5331:1: ruleOclModelElement returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '!' ( (lv_name_2_0= ruleString0 ) ) ) ;
    public final EObject ruleOclModelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5334:28: ( ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '!' ( (lv_name_2_0= ruleString0 ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5335:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '!' ( (lv_name_2_0= ruleString0 ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5335:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '!' ( (lv_name_2_0= ruleString0 ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5335:2: ( (otherlv_0= RULE_STRING ) ) otherlv_1= '!' ( (lv_name_2_0= ruleString0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5335:2: ( (otherlv_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5336:1: (otherlv_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5336:1: (otherlv_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5337:3: otherlv_0= RULE_STRING
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOclModelElementRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOclModelElement11813); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getOclModelElementAccess().getModelOclModelCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,87,FOLLOW_87_in_ruleOclModelElement11825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOclModelElementAccess().getExclamationMarkKeyword_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5355:1: ( (lv_name_2_0= ruleString0 ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5356:1: (lv_name_2_0= ruleString0 )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5356:1: (lv_name_2_0= ruleString0 )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5357:3: lv_name_2_0= ruleString0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOclModelElementAccess().getNameString0ParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleString0_in_ruleOclModelElement11846);
            lv_name_2_0=ruleString0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOclModelElementRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"String0");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleOclModelElement"


    // $ANTLR start "entryRuleMapType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5381:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5382:2: (iv_ruleMapType= ruleMapType EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5383:2: iv_ruleMapType= ruleMapType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeRule()); 
            }
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType11882);
            iv_ruleMapType=ruleMapType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType11892); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5390:1: ruleMapType returns [EObject current=null] : (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')' ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyType_2_0 = null;

        EObject lv_valueType_4_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5393:28: ( (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5394:1: (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5394:1: (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5394:3: otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleMapType11929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getMapKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleMapType11941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5402:1: ( (lv_keyType_2_0= ruleOclType ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5403:1: (lv_keyType_2_0= ruleOclType )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5403:1: (lv_keyType_2_0= ruleOclType )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5404:3: lv_keyType_2_0= ruleOclType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapTypeAccess().getKeyTypeOclTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclType_in_ruleMapType11962);
            lv_keyType_2_0=ruleOclType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
              	        }
                     		set(
                     			current, 
                     			"keyType",
                      		lv_keyType_2_0, 
                      		"OclType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleMapType11974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMapTypeAccess().getCommaKeyword_3());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5424:1: ( (lv_valueType_4_0= ruleOclType ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5425:1: (lv_valueType_4_0= ruleOclType )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5425:1: (lv_valueType_4_0= ruleOclType )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5426:3: lv_valueType_4_0= ruleOclType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapTypeAccess().getValueTypeOclTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclType_in_ruleMapType11995);
            lv_valueType_4_0=ruleOclType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
              	        }
                     		set(
                     			current, 
                     			"valueType",
                      		lv_valueType_4_0, 
                      		"OclType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleMapType12007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMapTypeAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleVariableDeclaration_Impl"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5454:1: entryRuleVariableDeclaration_Impl returns [EObject current=null] : iv_ruleVariableDeclaration_Impl= ruleVariableDeclaration_Impl EOF ;
    public final EObject entryRuleVariableDeclaration_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration_Impl = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5455:2: (iv_ruleVariableDeclaration_Impl= ruleVariableDeclaration_Impl EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5456:2: iv_ruleVariableDeclaration_Impl= ruleVariableDeclaration_Impl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclaration_ImplRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_Impl_in_entryRuleVariableDeclaration_Impl12043);
            iv_ruleVariableDeclaration_Impl=ruleVariableDeclaration_Impl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration_Impl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration_Impl12053); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDeclaration_Impl"


    // $ANTLR start "ruleVariableDeclaration_Impl"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5463:1: ruleVariableDeclaration_Impl returns [EObject current=null] : (otherlv_0= '#' ( (lv_varName_1_0= RULE_ID ) ) ( (otherlv_2= ':' otherlv_3= '(' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ')' )? ( (lv_type_8_0= ruleOclType ) )? otherlv_9= '=' ( (lv_initExpression_10_0= ruleOclExpression ) )? )? ) ;
    public final EObject ruleVariableDeclaration_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_type_8_0 = null;

        EObject lv_initExpression_10_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5466:28: ( (otherlv_0= '#' ( (lv_varName_1_0= RULE_ID ) ) ( (otherlv_2= ':' otherlv_3= '(' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ')' )? ( (lv_type_8_0= ruleOclType ) )? otherlv_9= '=' ( (lv_initExpression_10_0= ruleOclExpression ) )? )? ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5467:1: (otherlv_0= '#' ( (lv_varName_1_0= RULE_ID ) ) ( (otherlv_2= ':' otherlv_3= '(' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ')' )? ( (lv_type_8_0= ruleOclType ) )? otherlv_9= '=' ( (lv_initExpression_10_0= ruleOclExpression ) )? )? )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5467:1: (otherlv_0= '#' ( (lv_varName_1_0= RULE_ID ) ) ( (otherlv_2= ':' otherlv_3= '(' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ')' )? ( (lv_type_8_0= ruleOclType ) )? otherlv_9= '=' ( (lv_initExpression_10_0= ruleOclExpression ) )? )? )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5467:3: otherlv_0= '#' ( (lv_varName_1_0= RULE_ID ) ) ( (otherlv_2= ':' otherlv_3= '(' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ')' )? ( (lv_type_8_0= ruleOclType ) )? otherlv_9= '=' ( (lv_initExpression_10_0= ruleOclExpression ) )? )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleVariableDeclaration_Impl12090); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVariableDeclaration_ImplAccess().getNumberSignKeyword_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5471:1: ( (lv_varName_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5472:1: (lv_varName_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5472:1: (lv_varName_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5473:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration_Impl12107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_varName_1_0, grammarAccess.getVariableDeclaration_ImplAccess().getVarNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclaration_ImplRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"varName",
                      		lv_varName_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5489:2: ( (otherlv_2= ':' otherlv_3= '(' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ')' )? ( (lv_type_8_0= ruleOclType ) )? otherlv_9= '=' ( (lv_initExpression_10_0= ruleOclExpression ) )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==17) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==31) ) {
                    alt58=1;
                }
            }
            else if ( (LA58_0==RULE_STRING||LA58_0==27||LA58_0==51||LA58_0==53||LA58_0==61||(LA58_0>=74 && LA58_0<=78)||(LA58_0>=81 && LA58_0<=85)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5489:3: (otherlv_2= ':' otherlv_3= '(' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ')' )? ( (lv_type_8_0= ruleOclType ) )? otherlv_9= '=' ( (lv_initExpression_10_0= ruleOclExpression ) )?
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5489:3: (otherlv_2= ':' otherlv_3= '(' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ')' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==17) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5489:5: otherlv_2= ':' otherlv_3= '(' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ')'
                            {
                            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleVariableDeclaration_Impl12126); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getVariableDeclaration_ImplAccess().getColonKeyword_2_0_0());
                                  
                            }
                            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleVariableDeclaration_Impl12138); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getVariableDeclaration_ImplAccess().getLeftParenthesisKeyword_2_0_1());
                                  
                            }
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5497:1: ( (otherlv_4= RULE_STRING ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5498:1: (otherlv_4= RULE_STRING )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5498:1: (otherlv_4= RULE_STRING )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5499:3: otherlv_4= RULE_STRING
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getVariableDeclaration_ImplRule());
                              	        }
                                      
                            }
                            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariableDeclaration_Impl12162); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_4, grammarAccess.getVariableDeclaration_ImplAccess().getVariableExpVariableExpCrossReference_2_0_2_0()); 
                              	
                            }

                            }


                            }

                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5513:2: (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==18) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5513:4: otherlv_5= ',' ( (otherlv_6= RULE_STRING ) )
                            	    {
                            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleVariableDeclaration_Impl12175); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getVariableDeclaration_ImplAccess().getCommaKeyword_2_0_3_0());
                            	          
                            	    }
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5517:1: ( (otherlv_6= RULE_STRING ) )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5518:1: (otherlv_6= RULE_STRING )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5518:1: (otherlv_6= RULE_STRING )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5519:3: otherlv_6= RULE_STRING
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      		  /* */ 
                            	      		
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      			if (current==null) {
                            	      	            current = createModelElement(grammarAccess.getVariableDeclaration_ImplRule());
                            	      	        }
                            	              
                            	    }
                            	    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariableDeclaration_Impl12199); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      		newLeafNode(otherlv_6, grammarAccess.getVariableDeclaration_ImplAccess().getVariableExpVariableExpCrossReference_2_0_3_1_0()); 
                            	      	
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleVariableDeclaration_Impl12213); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getVariableDeclaration_ImplAccess().getRightParenthesisKeyword_2_0_4());
                                  
                            }

                            }
                            break;

                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5537:3: ( (lv_type_8_0= ruleOclType ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_STRING||LA56_0==51||LA56_0==53||LA56_0==61||(LA56_0>=74 && LA56_0<=78)||(LA56_0>=81 && LA56_0<=85)) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5538:1: (lv_type_8_0= ruleOclType )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5538:1: (lv_type_8_0= ruleOclType )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5539:3: lv_type_8_0= ruleOclType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariableDeclaration_ImplAccess().getTypeOclTypeParserRuleCall_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOclType_in_ruleVariableDeclaration_Impl12236);
                            lv_type_8_0=ruleOclType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getVariableDeclaration_ImplRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"type",
                                      		lv_type_8_0, 
                                      		"OclType");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleVariableDeclaration_Impl12249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getVariableDeclaration_ImplAccess().getEqualsSignKeyword_2_2());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5559:1: ( (lv_initExpression_10_0= ruleOclExpression ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==51||LA57_0==53||(LA57_0>=55 && LA57_0<=64)||LA57_0==66||LA57_0==68||LA57_0==70||(LA57_0>=74 && LA57_0<=78)||(LA57_0>=81 && LA57_0<=85)||(LA57_0>=90 && LA57_0<=92)) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5560:1: (lv_initExpression_10_0= ruleOclExpression )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5560:1: (lv_initExpression_10_0= ruleOclExpression )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5561:3: lv_initExpression_10_0= ruleOclExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariableDeclaration_ImplAccess().getInitExpressionOclExpressionParserRuleCall_2_3_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOclExpression_in_ruleVariableDeclaration_Impl12270);
                            lv_initExpression_10_0=ruleOclExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getVariableDeclaration_ImplRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"initExpression",
                                      		lv_initExpression_10_0, 
                                      		"OclExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

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
    // $ANTLR end "ruleVariableDeclaration_Impl"


    // $ANTLR start "entryRuleTuplePart"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5585:1: entryRuleTuplePart returns [EObject current=null] : iv_ruleTuplePart= ruleTuplePart EOF ;
    public final EObject entryRuleTuplePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePart = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5586:2: (iv_ruleTuplePart= ruleTuplePart EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5587:2: iv_ruleTuplePart= ruleTuplePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartRule()); 
            }
            pushFollow(FOLLOW_ruleTuplePart_in_entryRuleTuplePart12309);
            iv_ruleTuplePart=ruleTuplePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuplePart12319); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTuplePart"


    // $ANTLR start "ruleTuplePart"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5594:1: ruleTuplePart returns [EObject current=null] : ( ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? (otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )? ) ;
    public final EObject ruleTuplePart() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5597:28: ( ( ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? (otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )? ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5598:1: ( ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? (otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )? )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5598:1: ( ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? (otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )? )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5598:2: ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? (otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )?
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5598:2: ( (lv_varName_0_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5599:1: (lv_varName_0_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5599:1: (lv_varName_0_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5600:3: lv_varName_0_0= RULE_ID
            {
            lv_varName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTuplePart12361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_varName_0_0, grammarAccess.getTuplePartAccess().getVarNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTuplePartRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"varName",
                      		lv_varName_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5616:2: (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==17) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_STRING||LA59_1==51||LA59_1==53||LA59_1==61||(LA59_1>=74 && LA59_1<=78)||(LA59_1>=81 && LA59_1<=85)) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5616:4: otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleTuplePart12379); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTuplePartAccess().getColonKeyword_1_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5620:1: ( (lv_type_2_0= ruleOclType ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5621:1: (lv_type_2_0= ruleOclType )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5621:1: (lv_type_2_0= ruleOclType )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5622:3: lv_type_2_0= ruleOclType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTuplePartAccess().getTypeOclTypeParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclType_in_ruleTuplePart12400);
                    lv_type_2_0=ruleOclType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTuplePartRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"OclType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5638:4: (otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==27) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5638:6: otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleTuplePart12415); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTuplePartAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5642:1: ( (lv_initExpression_4_0= ruleOclExpression ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5643:1: (lv_initExpression_4_0= ruleOclExpression )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5643:1: (lv_initExpression_4_0= ruleOclExpression )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5644:3: lv_initExpression_4_0= ruleOclExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTuplePartAccess().getInitExpressionOclExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclExpression_in_ruleTuplePart12436);
                    lv_initExpression_4_0=ruleOclExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTuplePartRule());
                      	        }
                             		set(
                             			current, 
                             			"initExpression",
                              		lv_initExpression_4_0, 
                              		"OclExpression");
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
    // $ANTLR end "ruleTuplePart"


    // $ANTLR start "entryRuleIterator"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5668:1: entryRuleIterator returns [EObject current=null] : iv_ruleIterator= ruleIterator EOF ;
    public final EObject entryRuleIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterator = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5669:2: (iv_ruleIterator= ruleIterator EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5670:2: iv_ruleIterator= ruleIterator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteratorRule()); 
            }
            pushFollow(FOLLOW_ruleIterator_in_entryRuleIterator12474);
            iv_ruleIterator=ruleIterator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIterator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterator12484); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIterator"


    // $ANTLR start "ruleIterator"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5677:1: ruleIterator returns [EObject current=null] : ( (lv_varName_0_0= ruleString0 ) ) ;
    public final EObject ruleIterator() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_varName_0_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5680:28: ( ( (lv_varName_0_0= ruleString0 ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5681:1: ( (lv_varName_0_0= ruleString0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5681:1: ( (lv_varName_0_0= ruleString0 ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5682:1: (lv_varName_0_0= ruleString0 )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5682:1: (lv_varName_0_0= ruleString0 )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5683:3: lv_varName_0_0= ruleString0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIteratorAccess().getVarNameString0ParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleString0_in_ruleIterator12529);
            lv_varName_0_0=ruleString0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIteratorRule());
              	        }
                     		set(
                     			current, 
                     			"varName",
                      		lv_varName_0_0, 
                      		"String0");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleIterator"


    // $ANTLR start "entryRuleOclParameter"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5707:1: entryRuleOclParameter returns [EObject current=null] : iv_ruleOclParameter= ruleOclParameter EOF ;
    public final EObject entryRuleOclParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclParameter = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5708:2: (iv_ruleOclParameter= ruleOclParameter EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5709:2: iv_ruleOclParameter= ruleOclParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclParameterRule()); 
            }
            pushFollow(FOLLOW_ruleOclParameter_in_entryRuleOclParameter12564);
            iv_ruleOclParameter=ruleOclParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOclParameter12574); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOclParameter"


    // $ANTLR start "ruleOclParameter"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5716:1: ruleOclParameter returns [EObject current=null] : ( (otherlv_0= 'id' ( (lv_id_1_0= ruleString0 ) ) )? ( (lv_varName_2_0= ruleString0 ) ) otherlv_3= ':' (otherlv_4= 'variableExp' otherlv_5= '(' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= ')' )? ( (lv_type_10_0= ruleOclType ) )? otherlv_11= '=' ( (lv_initExpression_12_0= ruleOclExpression ) )? ) ;
    public final EObject ruleOclParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_varName_2_0 = null;

        EObject lv_type_10_0 = null;

        EObject lv_initExpression_12_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5719:28: ( ( (otherlv_0= 'id' ( (lv_id_1_0= ruleString0 ) ) )? ( (lv_varName_2_0= ruleString0 ) ) otherlv_3= ':' (otherlv_4= 'variableExp' otherlv_5= '(' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= ')' )? ( (lv_type_10_0= ruleOclType ) )? otherlv_11= '=' ( (lv_initExpression_12_0= ruleOclExpression ) )? ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5720:1: ( (otherlv_0= 'id' ( (lv_id_1_0= ruleString0 ) ) )? ( (lv_varName_2_0= ruleString0 ) ) otherlv_3= ':' (otherlv_4= 'variableExp' otherlv_5= '(' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= ')' )? ( (lv_type_10_0= ruleOclType ) )? otherlv_11= '=' ( (lv_initExpression_12_0= ruleOclExpression ) )? )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5720:1: ( (otherlv_0= 'id' ( (lv_id_1_0= ruleString0 ) ) )? ( (lv_varName_2_0= ruleString0 ) ) otherlv_3= ':' (otherlv_4= 'variableExp' otherlv_5= '(' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= ')' )? ( (lv_type_10_0= ruleOclType ) )? otherlv_11= '=' ( (lv_initExpression_12_0= ruleOclExpression ) )? )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5720:2: (otherlv_0= 'id' ( (lv_id_1_0= ruleString0 ) ) )? ( (lv_varName_2_0= ruleString0 ) ) otherlv_3= ':' (otherlv_4= 'variableExp' otherlv_5= '(' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= ')' )? ( (lv_type_10_0= ruleOclType ) )? otherlv_11= '=' ( (lv_initExpression_12_0= ruleOclExpression ) )?
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5720:2: (otherlv_0= 'id' ( (lv_id_1_0= ruleString0 ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==88) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5720:4: otherlv_0= 'id' ( (lv_id_1_0= ruleString0 ) )
                    {
                    otherlv_0=(Token)match(input,88,FOLLOW_88_in_ruleOclParameter12612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getOclParameterAccess().getIdKeyword_0_0());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5724:1: ( (lv_id_1_0= ruleString0 ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5725:1: (lv_id_1_0= ruleString0 )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5725:1: (lv_id_1_0= ruleString0 )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5726:3: lv_id_1_0= ruleString0
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOclParameterAccess().getIdString0ParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleString0_in_ruleOclParameter12633);
                    lv_id_1_0=ruleString0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOclParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"id",
                              		lv_id_1_0, 
                              		"String0");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5742:4: ( (lv_varName_2_0= ruleString0 ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5743:1: (lv_varName_2_0= ruleString0 )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5743:1: (lv_varName_2_0= ruleString0 )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5744:3: lv_varName_2_0= ruleString0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOclParameterAccess().getVarNameString0ParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleString0_in_ruleOclParameter12656);
            lv_varName_2_0=ruleString0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOclParameterRule());
              	        }
                     		set(
                     			current, 
                     			"varName",
                      		lv_varName_2_0, 
                      		"String0");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleOclParameter12668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOclParameterAccess().getColonKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5764:1: (otherlv_4= 'variableExp' otherlv_5= '(' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==89) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5764:3: otherlv_4= 'variableExp' otherlv_5= '(' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,89,FOLLOW_89_in_ruleOclParameter12681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getOclParameterAccess().getVariableExpKeyword_3_0());
                          
                    }
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleOclParameter12693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOclParameterAccess().getLeftParenthesisKeyword_3_1());
                          
                    }
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5772:1: ( (otherlv_6= RULE_STRING ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5773:1: (otherlv_6= RULE_STRING )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5773:1: (otherlv_6= RULE_STRING )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5774:3: otherlv_6= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOclParameterRule());
                      	        }
                              
                    }
                    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOclParameter12717); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_6, grammarAccess.getOclParameterAccess().getVariableExpVariableExpCrossReference_3_2_0()); 
                      	
                    }

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5788:2: (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==18) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5788:4: otherlv_7= ',' ( (otherlv_8= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleOclParameter12730); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getOclParameterAccess().getCommaKeyword_3_3_0());
                    	          
                    	    }
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5792:1: ( (otherlv_8= RULE_STRING ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5793:1: (otherlv_8= RULE_STRING )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5793:1: (otherlv_8= RULE_STRING )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5794:3: otherlv_8= RULE_STRING
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getOclParameterRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOclParameter12754); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_8, grammarAccess.getOclParameterAccess().getVariableExpVariableExpCrossReference_3_3_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleOclParameter12768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getOclParameterAccess().getRightParenthesisKeyword_3_4());
                          
                    }

                    }
                    break;

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5812:3: ( (lv_type_10_0= ruleOclType ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_STRING||LA64_0==51||LA64_0==53||LA64_0==61||(LA64_0>=74 && LA64_0<=78)||(LA64_0>=81 && LA64_0<=85)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5813:1: (lv_type_10_0= ruleOclType )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5813:1: (lv_type_10_0= ruleOclType )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5814:3: lv_type_10_0= ruleOclType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOclParameterAccess().getTypeOclTypeParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclType_in_ruleOclParameter12791);
                    lv_type_10_0=ruleOclType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOclParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_10_0, 
                              		"OclType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,27,FOLLOW_27_in_ruleOclParameter12804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getOclParameterAccess().getEqualsSignKeyword_5());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5834:1: ( (lv_initExpression_12_0= ruleOclExpression ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_STRING)||LA65_0==51||LA65_0==53||(LA65_0>=55 && LA65_0<=64)||LA65_0==66||LA65_0==68||LA65_0==70||(LA65_0>=74 && LA65_0<=78)||(LA65_0>=81 && LA65_0<=85)||(LA65_0>=90 && LA65_0<=92)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5835:1: (lv_initExpression_12_0= ruleOclExpression )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5835:1: (lv_initExpression_12_0= ruleOclExpression )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5836:3: lv_initExpression_12_0= ruleOclExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOclParameterAccess().getInitExpressionOclExpressionParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOclExpression_in_ruleOclParameter12825);
                    lv_initExpression_12_0=ruleOclExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOclParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"initExpression",
                              		lv_initExpression_12_0, 
                              		"OclExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleOclParameter"


    // $ANTLR start "entryRuleBoolean"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5860:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5861:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5862:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean12863);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean12874); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5869:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5872:28: ( (kw= 'true' | kw= 'false' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5873:1: (kw= 'true' | kw= 'false' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5873:1: (kw= 'true' | kw= 'false' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==90) ) {
                alt66=1;
            }
            else if ( (LA66_0==91) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5874:2: kw= 'true'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleBoolean12912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5881:2: kw= 'false'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleBoolean12931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                          
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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleDouble"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5894:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5895:2: (iv_ruleDouble= ruleDouble EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5896:2: iv_ruleDouble= ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble12972);
            iv_ruleDouble=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDouble.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble12983); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5903:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Double' ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5906:28: (kw= 'Double' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5908:2: kw= 'Double'
            {
            kw=(Token)match(input,92,FOLLOW_92_in_ruleDouble13020); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDoubleAccess().getDoubleKeyword()); 
                  
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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleInteger"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5921:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5922:2: (iv_ruleInteger= ruleInteger EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5923:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger13060);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger13071); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5930:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Integer' ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5933:28: (kw= 'Integer' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5935:2: kw= 'Integer'
            {
            kw=(Token)match(input,76,FOLLOW_76_in_ruleInteger13108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getIntegerAccess().getIntegerKeyword()); 
                  
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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleMapElement"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5948:1: entryRuleMapElement returns [EObject current=null] : iv_ruleMapElement= ruleMapElement EOF ;
    public final EObject entryRuleMapElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapElement = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5949:2: (iv_ruleMapElement= ruleMapElement EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5950:2: iv_ruleMapElement= ruleMapElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapElementRule()); 
            }
            pushFollow(FOLLOW_ruleMapElement_in_entryRuleMapElement13147);
            iv_ruleMapElement=ruleMapElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapElement13157); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapElement"


    // $ANTLR start "ruleMapElement"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5957:1: ruleMapElement returns [EObject current=null] : (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMapElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_key_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5960:28: ( (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5961:1: (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5961:1: (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5961:3: otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleMapElement13194); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMapElementAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5965:1: ( (lv_key_1_0= ruleOclExpression ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5966:1: (lv_key_1_0= ruleOclExpression )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5966:1: (lv_key_1_0= ruleOclExpression )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5967:3: lv_key_1_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapElementAccess().getKeyOclExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclExpression_in_ruleMapElement13215);
            lv_key_1_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapElementRule());
              	        }
                     		set(
                     			current, 
                     			"key",
                      		lv_key_1_0, 
                      		"OclExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMapElement13227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMapElementAccess().getCommaKeyword_2());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5987:1: ( (lv_value_3_0= ruleOclExpression ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5988:1: (lv_value_3_0= ruleOclExpression )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5988:1: (lv_value_3_0= ruleOclExpression )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:5989:3: lv_value_3_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapElementAccess().getValueOclExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclExpression_in_ruleMapElement13248);
            lv_value_3_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapElementRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"OclExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleMapElement13260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMapElementAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleMapElement"


    // $ANTLR start "entryRuleTupleTypeAttribute"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6017:1: entryRuleTupleTypeAttribute returns [EObject current=null] : iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF ;
    public final EObject entryRuleTupleTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeAttribute = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6018:2: (iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6019:2: iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleTupleTypeAttribute_in_entryRuleTupleTypeAttribute13296);
            iv_ruleTupleTypeAttribute=ruleTupleTypeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleTypeAttribute13306); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleTypeAttribute"


    // $ANTLR start "ruleTupleTypeAttribute"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6026:1: ruleTupleTypeAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleString0 ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) ) ;
    public final EObject ruleTupleTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6029:28: ( ( ( (lv_name_0_0= ruleString0 ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6030:1: ( ( (lv_name_0_0= ruleString0 ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6030:1: ( ( (lv_name_0_0= ruleString0 ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6030:2: ( (lv_name_0_0= ruleString0 ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6030:2: ( (lv_name_0_0= ruleString0 ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6031:1: (lv_name_0_0= ruleString0 )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6031:1: (lv_name_0_0= ruleString0 )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6032:3: lv_name_0_0= ruleString0
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleTypeAttributeAccess().getNameString0ParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleString0_in_ruleTupleTypeAttribute13352);
            lv_name_0_0=ruleString0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleTypeAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"String0");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleTupleTypeAttribute13364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleTypeAttributeAccess().getColonKeyword_1());
                  
            }
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6052:1: ( (lv_type_2_0= ruleOclType ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6053:1: (lv_type_2_0= ruleOclType )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6053:1: (lv_type_2_0= ruleOclType )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:6054:3: lv_type_2_0= ruleOclType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleTypeAttributeAccess().getTypeOclTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOclType_in_ruleTupleTypeAttribute13385);
            lv_type_2_0=ruleOclType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleTypeAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"OclType");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleTupleTypeAttribute"

    // $ANTLR start synpred49_InternalEmig
    public final void synpred49_InternalEmig_fragment() throws RecognitionException {   
        EObject this_StringExp_2 = null;


        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2326:2: (this_StringExp_2= ruleStringExp )
        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2326:2: this_StringExp_2= ruleStringExp
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleStringExp_in_synpred49_InternalEmig5010);
        this_StringExp_2=ruleStringExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalEmig

    // $ANTLR start synpred52_InternalEmig
    public final void synpred52_InternalEmig_fragment() throws RecognitionException {   
        EObject this_IntegerExp_5 = null;


        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2365:2: (this_IntegerExp_5= ruleIntegerExp )
        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2365:2: this_IntegerExp_5= ruleIntegerExp
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleIntegerExp_in_synpred52_InternalEmig5100);
        this_IntegerExp_5=ruleIntegerExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalEmig

    // $ANTLR start synpred69_InternalEmig
    public final void synpred69_InternalEmig_fragment() throws RecognitionException {   
        EObject this_StringType_22 = null;


        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2586:2: (this_StringType_22= ruleStringType )
        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2586:2: this_StringType_22= ruleStringType
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleStringType_in_synpred69_InternalEmig5610);
        this_StringType_22=ruleStringType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_InternalEmig

    // $ANTLR start synpred71_InternalEmig
    public final void synpred71_InternalEmig_fragment() throws RecognitionException {   
        EObject this_IntegerType_24 = null;


        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2612:2: (this_IntegerType_24= ruleIntegerType )
        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:2612:2: this_IntegerType_24= ruleIntegerType
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleIntegerType_in_synpred71_InternalEmig5670);
        this_IntegerType_24=ruleIntegerType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_InternalEmig

    // $ANTLR start synpred104_InternalEmig
    public final void synpred104_InternalEmig_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        EObject lv_iterators_2_0 = null;

        EObject lv_iterators_4_0 = null;


        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4442:2: ( ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* ) )
        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4442:2: ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* )
        {
        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4442:2: ( ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )* )
        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4442:3: ( (lv_iterators_2_0= ruleIterator ) ) (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )*
        {
        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4442:3: ( (lv_iterators_2_0= ruleIterator ) )
        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4443:1: (lv_iterators_2_0= ruleIterator )
        {
        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4443:1: (lv_iterators_2_0= ruleIterator )
        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4444:3: lv_iterators_2_0= ruleIterator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getIteratorExpAccess().getIteratorsIteratorParserRuleCall_2_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleIterator_in_synpred104_InternalEmig9762);
        lv_iterators_2_0=ruleIterator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4460:2: (otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) ) )*
        loop77:
        do {
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==18) ) {
                alt77=1;
            }


            switch (alt77) {
        	case 1 :
        	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4460:4: otherlv_3= ',' ( (lv_iterators_4_0= ruleIterator ) )
        	    {
        	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_synpred104_InternalEmig9775); if (state.failed) return ;
        	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4464:1: ( (lv_iterators_4_0= ruleIterator ) )
        	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4465:1: (lv_iterators_4_0= ruleIterator )
        	    {
        	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4465:1: (lv_iterators_4_0= ruleIterator )
        	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/emfmigrate/parser/antlr/internal/InternalEmig.g:4466:3: lv_iterators_4_0= ruleIterator
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getIteratorExpAccess().getIteratorsIteratorParserRuleCall_2_0_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleIterator_in_synpred104_InternalEmig9796);
        	    lv_iterators_4_0=ruleIterator();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop77;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred104_InternalEmig

    // Delegated rules

    public final boolean synpred104_InternalEmig() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_InternalEmig_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalEmig() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalEmig_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalEmig() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalEmig_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalEmig() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalEmig_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalEmig() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalEmig_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\51\uffff";
    static final String DFA25_eofS =
        "\1\uffff\1\37\47\uffff";
    static final String DFA25_minS =
        "\1\4\1\15\1\uffff\1\37\2\uffff\1\0\5\uffff\1\14\3\uffff\1\37\30"+
        "\uffff";
    static final String DFA25_maxS =
        "\1\134\1\111\1\uffff\1\37\2\uffff\1\0\5\uffff\1\37\3\uffff\1\127"+
        "\30\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\uffff\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\15\1\16\1\21\1\uffff\1\23\1\24\1\25\1\26\1\30\1\32\1\33\1\34"+
        "\1\35\1\36\1\37\1\40\1\43\1\20\1\1\1\17\1\3\1\27\1\6\1\31\1\14\1"+
        "\42\1\22\1\41";
    static final String DFA25_specialS =
        "\3\uffff\1\0\2\uffff\1\1\42\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\1\20\55\uffff\1\3\1\uffff\1\24\1\uffff\1\2\1\7\1\10\1\11"+
            "\1\12\1\13\1\14\1\15\1\16\1\35\1\uffff\1\17\1\uffff\1\21\1\uffff"+
            "\1\22\3\uffff\1\23\1\25\1\6\1\26\1\27\2\uffff\1\30\1\31\1\32"+
            "\1\33\1\34\4\uffff\2\4\1\5",
            "\1\37\3\uffff\2\37\6\uffff\1\37\5\uffff\1\36\1\37\17\uffff"+
            "\1\37\22\uffff\1\37\1\uffff\1\37\1\uffff\3\37",
            "",
            "\1\40",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\45\22\uffff\1\46",
            "",
            "",
            "",
            "\1\47\67\uffff\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "2299:1: (this_VariableExp_0= ruleVariableExp | this_SuperExp_1= ruleSuperExp | this_StringExp_2= ruleStringExp | this_BooleanExp_3= ruleBooleanExp | this_RealExp_4= ruleRealExp | this_IntegerExp_5= ruleIntegerExp | this_BagExp_6= ruleBagExp | this_OrderedSetExp_7= ruleOrderedSetExp | this_SequenceExp_8= ruleSequenceExp | this_SetExp_9= ruleSetExp | this_TupleExp_10= ruleTupleExp | this_MapExp_11= ruleMapExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_OclUndefinedExp_13= ruleOclUndefinedExp | this_OperatorCallExp_14= ruleOperatorCallExp | this_CollectionOperationCallExp_15= ruleCollectionOperationCallExp | this_IterateExp_16= ruleIterateExp | this_IteratorExp_17= ruleIteratorExp | this_LetExp_18= ruleLetExp | this_IfExp_19= ruleIfExp | this_CollectionType_Impl_20= ruleCollectionType_Impl | this_OclType_Impl_21= ruleOclType_Impl | this_StringType_22= ruleStringType | this_BooleanType_23= ruleBooleanType | this_IntegerType_24= ruleIntegerType | this_RealType_25= ruleRealType | this_BagType_26= ruleBagType | this_OrderedSetType_27= ruleOrderedSetType | this_SequenceType_28= ruleSequenceType | this_SetType_29= ruleSetType | this_OclAnyType_30= ruleOclAnyType | this_TupleType_31= ruleTupleType | this_OclModelElement_32= ruleOclModelElement | this_MapType_33= ruleMapType | (this_NavigationOrAttributeCallExp_34= ruleNavigationOrAttributeCallExp () ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_3 = input.LA(1);

                         
                        int index25_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_3==31) ) {s = 32;}

                        else if ( (synpred49_InternalEmig()) ) {s = 33;}

                        else if ( (synpred69_InternalEmig()) ) {s = 34;}

                         
                        input.seek(index25_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_6 = input.LA(1);

                         
                        int index25_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalEmig()) ) {s = 35;}

                        else if ( (synpred71_InternalEmig()) ) {s = 36;}

                         
                        input.seek(index25_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleMyModel_in_entryRuleMyModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationLibrary_in_ruleMyModel137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationProgram_in_ruleMyModel164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationLibrary_in_entryRuleMigrationLibrary200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationLibrary210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMigrationLibrary247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationLibrary264 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMigrationLibrary281 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleMigrationLibrary302 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_13_in_ruleMigrationLibrary315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationProgram_in_entryRuleMigrationProgram351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationProgram361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMigrationProgram399 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMigrationProgram416 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMigrationProgram433 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleMigrationProgram453 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_ruleArtifact_in_ruleMigrationProgram487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMigrationProgram504 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMigrationProgram521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationProgram546 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMigrationProgram559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationProgram583 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationProgram597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMigrationProgram614 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMigrationProgram631 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleMigrationProgram652 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_13_in_ruleMigrationProgram665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifact711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleArtifact755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleArtifact784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleArtifact813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleRule911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule928 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRule945 = new BitSet(new long[]{0x0000044404000000L});
    public static final BitSet FOLLOW_ruleOpDef_in_ruleRule966 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRule978 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRule990 = new BitSet(new long[]{0x4008000000002010L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleRewritingRule_in_ruleRule1011 = new BitSet(new long[]{0x4008000000002010L,0x0000000001000000L});
    public static final BitSet FOLLOW_13_in_ruleRule1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpDef_in_entryRuleOpDef1060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpDef1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageOpDef_in_ruleOpDef1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_ruleOpDef1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_ruleOpDef1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_ruleOpDef1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageOpDef_in_entryRuleEPackageOpDef1245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPackageOpDef1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEPackageOpDef1293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackage_in_ruleEPackageOpDef1314 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEPackageOpDef1326 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_28_in_ruleEPackageOpDef1347 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29_in_ruleEPackageOpDef1384 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30_in_ruleEPackageOpDef1421 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEPackageOpDef1447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackage_in_ruleEPackageOpDef1468 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEPackageOpDef1480 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEPackageOpDef1492 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEPackageOpDef1504 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEPackageOpDef1516 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEPackageOpDef1528 = new BitSet(new long[]{0x0000400400002000L});
    public static final BitSet FOLLOW_rulesetterDef_in_ruleEPackageOpDef1550 = new BitSet(new long[]{0x0000400400002000L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_ruleEPackageOpDef1577 = new BitSet(new long[]{0x0000400400002000L});
    public static final BitSet FOLLOW_13_in_ruleEPackageOpDef1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_entryRuleEClassOpDef1628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEClassOpDef1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEClassOpDef1676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleEClassOpDef1697 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEClassOpDef1709 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_35_in_ruleEClassOpDef1730 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_36_in_ruleEClassOpDef1767 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_37_in_ruleEClassOpDef1804 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEClassOpDef1830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleEClassOpDef1851 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEClassOpDef1863 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEClassOpDef1875 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEClassOpDef1887 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEClassOpDef1899 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEClassOpDef1912 = new BitSet(new long[]{0x0000444404002000L});
    public static final BitSet FOLLOW_rulesetterDef_in_ruleEClassOpDef1934 = new BitSet(new long[]{0x0000444404002000L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_ruleEClassOpDef1961 = new BitSet(new long[]{0x0000444404002000L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_ruleEClassOpDef1988 = new BitSet(new long[]{0x0000444404002000L});
    public static final BitSet FOLLOW_13_in_ruleEClassOpDef2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_entryRuleEAttributeOpDef2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEAttributeOpDef2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEAttributeOpDef2088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEAttributeOpDef2109 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEAttributeOpDef2121 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_39_in_ruleEAttributeOpDef2143 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_40_in_ruleEAttributeOpDef2180 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_41_in_ruleEAttributeOpDef2217 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEAttributeOpDef2243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEAttributeOpDef2264 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEAttributeOpDef2276 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEAttributeOpDef2288 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEAttributeOpDef2301 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEAttributeOpDef2313 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleEAttributeOpDef2327 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_rulesetterDef_in_ruleEAttributeOpDef2348 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_13_in_ruleEAttributeOpDef2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEAttributeOpDef2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_entryRuleEReferenceOpDef2418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEReferenceOpDef2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEReferenceOpDef2466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReference_in_ruleEReferenceOpDef2487 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEReferenceOpDef2499 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_43_in_ruleEReferenceOpDef2521 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_44_in_ruleEReferenceOpDef2558 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_45_in_ruleEReferenceOpDef2595 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEReferenceOpDef2621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReference_in_ruleEReferenceOpDef2642 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEReferenceOpDef2654 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleEReferenceOpDef2666 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEReferenceOpDef2679 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEReferenceOpDef2691 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEReferenceOpDef2704 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_rulesetterDef_in_ruleEReferenceOpDef2725 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_13_in_ruleEReferenceOpDef2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetterDef_in_entryRulesetterDef2776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesetterDef2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulesetterDef2823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesetterDef2847 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulesetterDef2865 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_rulesetterDef2899 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_rulesetterDef2912 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_rulesetterDef2933 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_rulesetterDef2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewritingRule_in_entryRuleRewritingRule2983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRewritingRule2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_ruleRewritingRule3040 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRewritingRule3052 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_ruleRewritingRule3073 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleRewritingRule3087 = new BitSet(new long[]{0x4008000000000010L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_ruleRewritingRule3108 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRewritingRule3120 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_ruleRewritingRule3141 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_entryRuleMigratorSX3181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigratorSX3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleMigratorSX3249 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMigratorSX3261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorSX3285 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMigratorSX3297 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMigratorSX3309 = new BitSet(new long[]{0xFFA9000002000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorSX3330 = new BitSet(new long[]{0x0001000002000000L});
    public static final BitSet FOLLOW_48_in_ruleMigratorSX3343 = new BitSet(new long[]{0xFFA9000002000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorSX3364 = new BitSet(new long[]{0x0001000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMigratorSX3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_entryRuleMigratorDX3414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigratorDX3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorDX3480 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMigratorDX3497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorDX3521 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMigratorDX3533 = new BitSet(new long[]{0xFFA9000002000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorDX3554 = new BitSet(new long[]{0x0001000002000000L});
    public static final BitSet FOLLOW_48_in_ruleMigratorDX3567 = new BitSet(new long[]{0xFFA9000002000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorDX3588 = new BitSet(new long[]{0x0001000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMigratorDX3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMigratorDX3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_entryRuleFilterMigrator3658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterMigrator3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleFilterMigrator3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleParameter3800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage3858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass3963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference4173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclFeature_in_entryRuleOclFeature4280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOclFeature4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclAttribute_in_ruleOclFeature4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleOclFeature4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclType_in_entryRuleOclType4405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOclType4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclType_Impl_in_ruleOclType4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_Impl_in_ruleOclType4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleOclType4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleOclType4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_ruleOclType4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealType_in_ruleOclType4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBagType_in_ruleOclType4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedSetType_in_ruleOclType4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceType_in_ruleOclType4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetType_in_ruleOclType4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclAnyType_in_ruleOclType4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_ruleOclType4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclModelElement_in_ruleOclType4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_ruleOclType4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclExpression_in_entryRuleOclExpression4890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOclExpression4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExp_in_ruleOclExpression4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperExp_in_ruleOclExpression4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExp_in_ruleOclExpression5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_ruleOclExpression5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealExp_in_ruleOclExpression5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExp_in_ruleOclExpression5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBagExp_in_ruleOclExpression5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedSetExp_in_ruleOclExpression5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceExp_in_ruleOclExpression5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetExp_in_ruleOclExpression5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleExp_in_ruleOclExpression5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapExp_in_ruleOclExpression5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralExp_in_ruleOclExpression5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclUndefinedExp_in_ruleOclExpression5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorCallExp_in_ruleOclExpression5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionOperationCallExp_in_ruleOclExpression5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateExp_in_ruleOclExpression5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIteratorExp_in_ruleOclExpression5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExp_in_ruleOclExpression5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_ruleOclExpression5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_Impl_in_ruleOclExpression5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclType_Impl_in_ruleOclExpression5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleOclExpression5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleOclExpression5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_ruleOclExpression5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealType_in_ruleOclExpression5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBagType_in_ruleOclExpression5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedSetType_in_ruleOclExpression5760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceType_in_ruleOclExpression5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetType_in_ruleOclExpression5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclAnyType_in_ruleOclExpression5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_ruleOclExpression5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclModelElement_in_ruleOclExpression5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_ruleOclExpression5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationOrAttributeCallExp_in_ruleOclExpression5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration6019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_Impl_in_ruleVariableDeclaration6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuplePart_in_ruleVariableDeclaration6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterator_in_ruleVariableDeclaration6139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclParameter_in_ruleVariableDeclaration6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleString0_in_entryRuleString06207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleString06218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleString06255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclContextDefinition_in_entryRuleOclContextDefinition6294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOclContextDefinition6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOclContextDefinition6341 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleOclContextDefinition6362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclAttribute_in_entryRuleOclAttribute6398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOclAttribute6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOclAttribute6450 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOclAttribute6467 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleOclAttribute6488 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOclAttribute6500 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleOclAttribute6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation6557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOperation6609 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOperation6626 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_12_in_ruleOperation6639 = new BitSet(new long[]{0x4008000000000010L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleOclParameter_in_ruleOperation6660 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleOperation6673 = new BitSet(new long[]{0x4008000000000010L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleOclParameter_in_ruleOperation6694 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleOperation6708 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOperation6722 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOperation6734 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleOperation6755 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleOperation6776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclType_Impl_in_entryRuleOclType_Impl6812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOclType_Impl6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOclType_Impl6859 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOclType_Impl6876 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOclType_Impl6894 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleOclType_Impl6915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExp_in_entryRuleVariableExp6953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExp6963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableExp7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperExp_in_entryRuleSuperExp7060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuperExp7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSuperExp7119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExp_in_entryRuleStringExp7155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExp7165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleString0_in_ruleStringExp7210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_entryRuleBooleanExp7245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExp7255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleBooleanExp7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealExp_in_entryRuleRealExp7335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealExp7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleRealExp7390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExp_in_entryRuleIntegerExp7425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerExp7435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleIntegerExp7480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBagExp_in_entryRuleBagExp7515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBagExp7525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBagExp7574 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBagExp7586 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleBagExp7599 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleBagExp7620 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleBagExp7633 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleBagExp7654 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleBagExp7668 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBagExp7682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedSetExp_in_entryRuleOrderedSetExp7718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedSetExp7728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOrderedSetExp7777 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOrderedSetExp7789 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleOrderedSetExp7802 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleOrderedSetExp7823 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleOrderedSetExp7836 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleOrderedSetExp7857 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleOrderedSetExp7871 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOrderedSetExp7885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceExp_in_entryRuleSequenceExp7921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceExp7931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSequenceExp7980 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSequenceExp7992 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleSequenceExp8005 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleSequenceExp8026 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleSequenceExp8039 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleSequenceExp8060 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleSequenceExp8074 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSequenceExp8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetExp_in_entryRuleSetExp8124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetExp8134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSetExp8183 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSetExp8195 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleSetExp8208 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleSetExp8229 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleSetExp8242 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleSetExp8263 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleSetExp8277 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSetExp8291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleExp_in_entryRuleTupleExp8327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleExp8337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTupleExp8386 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTupleExp8398 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleTupleExp8411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTuplePart_in_ruleTupleExp8432 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleTupleExp8445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTuplePart_in_ruleTupleExp8466 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleTupleExp8480 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTupleExp8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapExp_in_entryRuleMapExp8530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapExp8540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleMapExp8589 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMapExp8601 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleMapExp8614 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleMapElement_in_ruleMapExp8635 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleMapExp8648 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleMapElement_in_ruleMapExp8669 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleMapExp8683 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMapExp8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteralExp_in_entryRuleEnumLiteralExp8733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteralExp8743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleEnumLiteralExp8780 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumLiteralExp8797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclUndefinedExp_in_entryRuleOclUndefinedExp8838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOclUndefinedExp8848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOclUndefinedExp8897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationOrAttributeCallExp_in_entryRuleNavigationOrAttributeCallExp8933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOrAttributeCallExp8943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleNavigationOrAttributeCallExp8992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNavigationOrAttributeCallExp9009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorCallExp_in_entryRuleOperatorCallExp9052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorCallExp9062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleString0_in_ruleOperatorCallExp9108 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOperatorCallExp9120 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOperatorCallExp9133 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOperatorCallExp9145 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleOperatorCallExp9166 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleOperatorCallExp9179 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleOperatorCallExp9200 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleOperatorCallExp9214 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOperatorCallExp9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionOperationCallExp_in_entryRuleCollectionOperationCallExp9264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionOperationCallExp9274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionOperationCallExp9316 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCollectionOperationCallExp9333 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleCollectionOperationCallExp9354 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_18_in_ruleCollectionOperationCallExp9367 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleCollectionOperationCallExp9388 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_32_in_ruleCollectionOperationCallExp9402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateExp_in_entryRuleIterateExp9438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterateExp9448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleIterateExp9485 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleIterateExp9497 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleIterator_in_ruleIterateExp9519 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleIterateExp9532 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleIterator_in_ruleIterateExp9553 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleIterateExp9568 = new BitSet(new long[]{0x4008000000000010L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleIterateExp9589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleIterateExp9601 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleIterateExp9622 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleIterateExp9634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIteratorExp_in_entryRuleIteratorExp9670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIteratorExp9680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIteratorExp9722 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleIteratorExp9739 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleIterator_in_ruleIteratorExp9762 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_18_in_ruleIteratorExp9775 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleIterator_in_ruleIteratorExp9796 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleIteratorExp9826 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleIteratorExp9839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExp_in_entryRuleLetExp9875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetExp9885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLetExp9922 = new BitSet(new long[]{0x4008000000000010L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLetExp9943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleLetExp9955 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleLetExp9976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_entryRuleIfExp10012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExp10022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleIfExp10059 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleIfExp10080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleIfExp10092 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleIfExp10113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleIfExp10125 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleIfExp10146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleIfExp10158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_Impl_in_entryRuleCollectionType_Impl10194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionType_Impl10204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleCollectionType_Impl10241 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCollectionType_Impl10253 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleCollectionType_Impl10274 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCollectionType_Impl10286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType10322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType10332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleStringType10368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType10403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType10413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleBooleanType10449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType10484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleIntegerType10530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealType_in_entryRuleRealType10565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealType10575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleRealType10611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBagType_in_entryRuleBagType10646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBagType10656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleBagType10693 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBagType10705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleBagType10717 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleString0_in_ruleBagType10738 = new BitSet(new long[]{0x0040000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_54_in_ruleBagType10751 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleBagType10772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleBagType10786 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleBagType10807 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBagType10819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedSetType_in_entryRuleOrderedSetType10855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedSetType10865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOrderedSetType10902 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOrderedSetType10914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleOrderedSetType10926 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleString0_in_ruleOrderedSetType10947 = new BitSet(new long[]{0x0040000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_54_in_ruleOrderedSetType10960 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleOrderedSetType10981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleOrderedSetType10995 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleOrderedSetType11016 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOrderedSetType11028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceType_in_entryRuleSequenceType11064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceType11074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleSequenceType11111 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSequenceType11123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleSequenceType11135 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleString0_in_ruleSequenceType11156 = new BitSet(new long[]{0x0040000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_54_in_ruleSequenceType11169 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleSequenceType11190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSequenceType11204 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleSequenceType11225 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSequenceType11237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetType_in_entryRuleSetType11273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetType11283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleSetType11320 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSetType11332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleSetType11344 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleString0_in_ruleSetType11365 = new BitSet(new long[]{0x0040000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_54_in_ruleSetType11378 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleSetType11399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSetType11413 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleSetType11434 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSetType11446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclAnyType_in_entryRuleOclAnyType11482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOclAnyType11492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOclAnyType11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_entryRuleTupleType11563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleType11573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleTupleType11610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleTupleType11622 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_12_in_ruleTupleType11635 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleTupleTypeAttribute_in_ruleTupleType11656 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleTupleType11669 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleTupleTypeAttribute_in_ruleTupleType11690 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleTupleType11704 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTupleType11718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclModelElement_in_entryRuleOclModelElement11754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOclModelElement11764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOclModelElement11813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleOclModelElement11825 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleString0_in_ruleOclModelElement11846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType11882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType11892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleMapType11929 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMapType11941 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleMapType11962 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMapType11974 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleMapType11995 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleMapType12007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_Impl_in_entryRuleVariableDeclaration_Impl12043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration_Impl12053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleVariableDeclaration_Impl12090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration_Impl12107 = new BitSet(new long[]{0x2028000008020022L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_17_in_ruleVariableDeclaration_Impl12126 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleVariableDeclaration_Impl12138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariableDeclaration_Impl12162 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDeclaration_Impl12175 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariableDeclaration_Impl12199 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_32_in_ruleVariableDeclaration_Impl12213 = new BitSet(new long[]{0x2028000008000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleVariableDeclaration_Impl12236 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleVariableDeclaration_Impl12249 = new BitSet(new long[]{0xFFA8000000000032L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleVariableDeclaration_Impl12270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuplePart_in_entryRuleTuplePart12309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuplePart12319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTuplePart12361 = new BitSet(new long[]{0x0000000008020002L});
    public static final BitSet FOLLOW_17_in_ruleTuplePart12379 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleTuplePart12400 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleTuplePart12415 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleTuplePart12436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterator_in_entryRuleIterator12474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterator12484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleString0_in_ruleIterator12529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclParameter_in_entryRuleOclParameter12564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOclParameter12574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOclParameter12612 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleString0_in_ruleOclParameter12633 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleString0_in_ruleOclParameter12656 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOclParameter12668 = new BitSet(new long[]{0x2028000008000020L,0x00000000023E7C00L});
    public static final BitSet FOLLOW_89_in_ruleOclParameter12681 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOclParameter12693 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOclParameter12717 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_18_in_ruleOclParameter12730 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOclParameter12754 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_32_in_ruleOclParameter12768 = new BitSet(new long[]{0x2028000008000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleOclParameter12791 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOclParameter12804 = new BitSet(new long[]{0xFFA8000000000032L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleOclParameter12825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean12863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean12874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleBoolean12912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleBoolean12931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble12972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble12983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleDouble13020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger13060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger13071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleInteger13108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapElement_in_entryRuleMapElement13147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapElement13157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMapElement13194 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleMapElement13215 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMapElement13227 = new BitSet(new long[]{0xFFA8000000000030L,0x000000001C3E7C55L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleMapElement13248 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleMapElement13260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleTypeAttribute_in_entryRuleTupleTypeAttribute13296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeAttribute13306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleString0_in_ruleTupleTypeAttribute13352 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTupleTypeAttribute13364 = new BitSet(new long[]{0x2028000000000020L,0x00000000003E7C00L});
    public static final BitSet FOLLOW_ruleOclType_in_ruleTupleTypeAttribute13385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExp_in_synpred49_InternalEmig5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExp_in_synpred52_InternalEmig5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_synpred69_InternalEmig5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_synpred71_InternalEmig5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterator_in_synpred104_InternalEmig9762 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_synpred104_InternalEmig9775 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleIterator_in_synpred104_InternalEmig9796 = new BitSet(new long[]{0x0000000000040002L});

}