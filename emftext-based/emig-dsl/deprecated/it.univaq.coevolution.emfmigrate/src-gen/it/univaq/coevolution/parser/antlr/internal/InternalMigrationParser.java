package it.univaq.coevolution.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.univaq.coevolution.services.MigrationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMigrationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Library'", "'{'", "'}'", "'set'", "':='", "','", "';'", "'STRING'", "'changePackage('", "')'", "'addPackage('", "'deletePackage('", "'package'", "'='", "':package'", "'changeClass('", "'addClass('", "'deleteClass('", "':class'", "'changeAttribute('", "':attribute'", "'addAttribute'", "'('", "'deleteAttribute('", "'renameAttribute('", "':string'", "'moveAttribute('", "'changeReference('", "':reference'", "'addReference('", "'deleteReference('", "'moveReference('", "'class'", "'.'", "'attribute'", "'setLowerBound('", "':int'", "'setUpperBound('", "'setType('", "':classifier'", "'setOpposite('", "'setOwner('", "'setName('", "');'", "'reference'", "'true'", "'false'", "'-'", "'def change'", "':'", "'Reference'", "'Attribute'", "'Class'", "'Package'", "'Int'", "'String'", "'Bool'", "'include'", "'migrate'", "'transformation'", "'with'", "'rule'", "'['", "']'", "'->'", "'&'", "'<'", "'>'", "'null'", "'#'", "'<>'", "'contains:'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalMigrationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMigrationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMigrationParser.tokenNames; }
    public String getGrammarFileName() { return "../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g"; }



     	private MigrationGrammarAccess grammarAccess;
     	
        public InternalMigrationParser(TokenStream input, MigrationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MigrationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_packages_0_0= rulePackageOp ) )* | (otherlv_1= 'Library' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operators_4_0= ruleComplexOperator ) )* otherlv_5= '}' ) | ( (lv_MigrationProgr_6_0= ruleMigrationProgram ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_packages_0_0 = null;

        EObject lv_operators_4_0 = null;

        EObject lv_MigrationProgr_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:79:28: ( ( ( (lv_packages_0_0= rulePackageOp ) )* | (otherlv_1= 'Library' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operators_4_0= ruleComplexOperator ) )* otherlv_5= '}' ) | ( (lv_MigrationProgr_6_0= ruleMigrationProgram ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:80:1: ( ( (lv_packages_0_0= rulePackageOp ) )* | (otherlv_1= 'Library' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operators_4_0= ruleComplexOperator ) )* otherlv_5= '}' ) | ( (lv_MigrationProgr_6_0= ruleMigrationProgram ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:80:1: ( ( (lv_packages_0_0= rulePackageOp ) )* | (otherlv_1= 'Library' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operators_4_0= ruleComplexOperator ) )* otherlv_5= '}' ) | ( (lv_MigrationProgr_6_0= ruleMigrationProgram ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case EOF:
            case 23:
                {
                alt3=1;
                }
                break;
            case 11:
                {
                alt3=2;
                }
                break;
            case 68:
            case 69:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:80:2: ( (lv_packages_0_0= rulePackageOp ) )*
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:80:2: ( (lv_packages_0_0= rulePackageOp ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==23) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:81:1: (lv_packages_0_0= rulePackageOp )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:81:1: (lv_packages_0_0= rulePackageOp )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:82:3: lv_packages_0_0= rulePackageOp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageOpParserRuleCall_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePackageOp_in_ruleModel131);
                    	    lv_packages_0_0=rulePackageOp();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"packages",
                    	            		lv_packages_0_0, 
                    	            		"PackageOp");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:99:6: (otherlv_1= 'Library' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operators_4_0= ruleComplexOperator ) )* otherlv_5= '}' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:99:6: (otherlv_1= 'Library' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operators_4_0= ruleComplexOperator ) )* otherlv_5= '}' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:99:8: otherlv_1= 'Library' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operators_4_0= ruleComplexOperator ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModel151); 

                        	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLibraryKeyword_1_0());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:103:1: ( (lv_title_2_0= RULE_STRING ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:104:1: (lv_title_2_0= RULE_STRING )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:104:1: (lv_title_2_0= RULE_STRING )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:105:3: lv_title_2_0= RULE_STRING
                    {
                    lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel168); 

                    			newLeafNode(lv_title_2_0, grammarAccess.getModelAccess().getTitleSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"title",
                            		lv_title_2_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleModel185); 

                        	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1_2());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:125:1: ( (lv_operators_4_0= ruleComplexOperator ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==59) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:126:1: (lv_operators_4_0= ruleComplexOperator )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:126:1: (lv_operators_4_0= ruleComplexOperator )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:127:3: lv_operators_4_0= ruleComplexOperator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getOperatorsComplexOperatorParserRuleCall_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleComplexOperator_in_ruleModel206);
                    	    lv_operators_4_0=ruleComplexOperator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operators",
                    	            		lv_operators_4_0, 
                    	            		"ComplexOperator");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleModel219); 

                        	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:148:6: ( (lv_MigrationProgr_6_0= ruleMigrationProgram ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:148:6: ( (lv_MigrationProgr_6_0= ruleMigrationProgram ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:149:1: (lv_MigrationProgr_6_0= ruleMigrationProgram )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:149:1: (lv_MigrationProgr_6_0= ruleMigrationProgram )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:150:3: lv_MigrationProgr_6_0= ruleMigrationProgram
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getMigrationProgrMigrationProgramParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMigrationProgram_in_ruleModel247);
                    lv_MigrationProgr_6_0=ruleMigrationProgram();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"MigrationProgr",
                            		lv_MigrationProgr_6_0, 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulepackageSetters"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:174:1: entryRulepackageSetters returns [EObject current=null] : iv_rulepackageSetters= rulepackageSetters EOF ;
    public final EObject entryRulepackageSetters() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepackageSetters = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:175:2: (iv_rulepackageSetters= rulepackageSetters EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:176:2: iv_rulepackageSetters= rulepackageSetters EOF
            {
             newCompositeNode(grammarAccess.getPackageSettersRule()); 
            pushFollow(FOLLOW_rulepackageSetters_in_entryRulepackageSetters283);
            iv_rulepackageSetters=rulepackageSetters();

            state._fsp--;

             current =iv_rulepackageSetters; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepackageSetters293); 

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
    // $ANTLR end "entryRulepackageSetters"


    // $ANTLR start "rulepackageSetters"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:183:1: rulepackageSetters returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';' ) ;
    public final EObject rulepackageSetters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:186:28: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:187:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:187:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:187:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulepackageSetters330); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageSettersAccess().getSetKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:191:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:192:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:192:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:193:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageSettersRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepackageSetters350); 

            		newLeafNode(otherlv_1, grammarAccess.getPackageSettersAccess().getMetafeatureEStructuralFeatureCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulepackageSetters362); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageSettersAccess().getColonEqualsSignKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:208:1: ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:208:2: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:208:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:209:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:209:1: (lv_value_3_0= RULE_STRING )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:210:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulepackageSetters380); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getPackageSettersAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPackageSettersRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:227:6: ( (otherlv_4= RULE_ID ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:227:6: ( (otherlv_4= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:228:1: (otherlv_4= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:228:1: (otherlv_4= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:229:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPackageSettersRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepackageSetters411); 

                    		newLeafNode(otherlv_4, grammarAccess.getPackageSettersAccess().getValueRefEObjectCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:240:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:240:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_rulepackageSetters425); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPackageSettersAccess().getCommaKeyword_4_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:244:1: ( (otherlv_6= RULE_ID ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:245:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:245:1: (otherlv_6= RULE_ID )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:246:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPackageSettersRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepackageSetters445); 

            	    		newLeafNode(otherlv_6, grammarAccess.getPackageSettersAccess().getValueRefEObjectCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_rulepackageSetters459); 

                	newLeafNode(otherlv_7, grammarAccess.getPackageSettersAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "rulepackageSetters"


    // $ANTLR start "entryRulepackageSetters_def"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:269:1: entryRulepackageSetters_def returns [EObject current=null] : iv_rulepackageSetters_def= rulepackageSetters_def EOF ;
    public final EObject entryRulepackageSetters_def() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepackageSetters_def = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:270:2: (iv_rulepackageSetters_def= rulepackageSetters_def EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:271:2: iv_rulepackageSetters_def= rulepackageSetters_def EOF
            {
             newCompositeNode(grammarAccess.getPackageSetters_defRule()); 
            pushFollow(FOLLOW_rulepackageSetters_def_in_entryRulepackageSetters_def495);
            iv_rulepackageSetters_def=rulepackageSetters_def();

            state._fsp--;

             current =iv_rulepackageSetters_def; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepackageSetters_def505); 

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
    // $ANTLR end "entryRulepackageSetters_def"


    // $ANTLR start "rulepackageSetters_def"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:278:1: rulepackageSetters_def returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'STRING' ( (lv_par_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject rulepackageSetters_def() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_par_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:281:28: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'STRING' ( (lv_par_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:282:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'STRING' ( (lv_par_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:282:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'STRING' ( (lv_par_4_0= RULE_ID ) ) otherlv_5= ';' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:282:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'STRING' ( (lv_par_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulepackageSetters_def542); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageSetters_defAccess().getSetKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:286:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:287:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:287:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:288:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageSetters_defRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepackageSetters_def562); 

            		newLeafNode(otherlv_1, grammarAccess.getPackageSetters_defAccess().getMetafeatureEStructuralFeatureCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulepackageSetters_def574); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageSetters_defAccess().getColonEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulepackageSetters_def586); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageSetters_defAccess().getSTRINGKeyword_3());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:307:1: ( (lv_par_4_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:308:1: (lv_par_4_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:308:1: (lv_par_4_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:309:3: lv_par_4_0= RULE_ID
            {
            lv_par_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepackageSetters_def603); 

            			newLeafNode(lv_par_4_0, grammarAccess.getPackageSetters_defAccess().getParIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageSetters_defRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"par",
                    		lv_par_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_rulepackageSetters_def620); 

                	newLeafNode(otherlv_5, grammarAccess.getPackageSetters_defAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "rulepackageSetters_def"


    // $ANTLR start "entryRuleCHANGEPACKAGE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:345:1: entryRuleCHANGEPACKAGE returns [EObject current=null] : iv_ruleCHANGEPACKAGE= ruleCHANGEPACKAGE EOF ;
    public final EObject entryRuleCHANGEPACKAGE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHANGEPACKAGE = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:346:2: (iv_ruleCHANGEPACKAGE= ruleCHANGEPACKAGE EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:347:2: iv_ruleCHANGEPACKAGE= ruleCHANGEPACKAGE EOF
            {
             newCompositeNode(grammarAccess.getCHANGEPACKAGERule()); 
            pushFollow(FOLLOW_ruleCHANGEPACKAGE_in_entryRuleCHANGEPACKAGE664);
            iv_ruleCHANGEPACKAGE=ruleCHANGEPACKAGE();

            state._fsp--;

             current =iv_ruleCHANGEPACKAGE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCHANGEPACKAGE674); 

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
    // $ANTLR end "entryRuleCHANGEPACKAGE"


    // $ANTLR start "ruleCHANGEPACKAGE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:354:1: ruleCHANGEPACKAGE returns [EObject current=null] : ( ( (lv_op_0_0= 'changePackage(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleCHANGEPACKAGE() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:357:28: ( ( ( (lv_op_0_0= 'changePackage(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:358:1: ( ( (lv_op_0_0= 'changePackage(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:358:1: ( ( (lv_op_0_0= 'changePackage(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:358:2: ( (lv_op_0_0= 'changePackage(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:358:2: ( (lv_op_0_0= 'changePackage(' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:359:1: (lv_op_0_0= 'changePackage(' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:359:1: (lv_op_0_0= 'changePackage(' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:360:3: lv_op_0_0= 'changePackage('
            {
            lv_op_0_0=(Token)match(input,19,FOLLOW_19_in_ruleCHANGEPACKAGE717); 

                    newLeafNode(lv_op_0_0, grammarAccess.getCHANGEPACKAGEAccess().getOpChangePackageKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCHANGEPACKAGERule());
            	        }
                   		setWithLastConsumed(current, "op", lv_op_0_0, "changePackage(");
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:373:2: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:374:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:374:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:375:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCHANGEPACKAGERule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCHANGEPACKAGE750); 

            		newLeafNode(otherlv_1, grammarAccess.getCHANGEPACKAGEAccess().getRefEPackageCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCHANGEPACKAGE762); 

                	newLeafNode(otherlv_2, grammarAccess.getCHANGEPACKAGEAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleCHANGEPACKAGE"


    // $ANTLR start "entryRuleADDPACKAGE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:398:1: entryRuleADDPACKAGE returns [EObject current=null] : iv_ruleADDPACKAGE= ruleADDPACKAGE EOF ;
    public final EObject entryRuleADDPACKAGE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADDPACKAGE = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:399:2: (iv_ruleADDPACKAGE= ruleADDPACKAGE EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:400:2: iv_ruleADDPACKAGE= ruleADDPACKAGE EOF
            {
             newCompositeNode(grammarAccess.getADDPACKAGERule()); 
            pushFollow(FOLLOW_ruleADDPACKAGE_in_entryRuleADDPACKAGE798);
            iv_ruleADDPACKAGE=ruleADDPACKAGE();

            state._fsp--;

             current =iv_ruleADDPACKAGE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleADDPACKAGE808); 

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
    // $ANTLR end "entryRuleADDPACKAGE"


    // $ANTLR start "ruleADDPACKAGE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:407:1: ruleADDPACKAGE returns [EObject current=null] : ( ( (lv_op_0_0= 'addPackage(' ) ) ( (lv_new_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleADDPACKAGE() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token lv_new_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:410:28: ( ( ( (lv_op_0_0= 'addPackage(' ) ) ( (lv_new_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:411:1: ( ( (lv_op_0_0= 'addPackage(' ) ) ( (lv_new_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:411:1: ( ( (lv_op_0_0= 'addPackage(' ) ) ( (lv_new_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:411:2: ( (lv_op_0_0= 'addPackage(' ) ) ( (lv_new_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:411:2: ( (lv_op_0_0= 'addPackage(' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:412:1: (lv_op_0_0= 'addPackage(' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:412:1: (lv_op_0_0= 'addPackage(' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:413:3: lv_op_0_0= 'addPackage('
            {
            lv_op_0_0=(Token)match(input,21,FOLLOW_21_in_ruleADDPACKAGE851); 

                    newLeafNode(lv_op_0_0, grammarAccess.getADDPACKAGEAccess().getOpAddPackageKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getADDPACKAGERule());
            	        }
                   		setWithLastConsumed(current, "op", lv_op_0_0, "addPackage(");
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:426:2: ( (lv_new_1_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:427:1: (lv_new_1_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:427:1: (lv_new_1_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:428:3: lv_new_1_0= RULE_STRING
            {
            lv_new_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleADDPACKAGE881); 

            			newLeafNode(lv_new_1_0, grammarAccess.getADDPACKAGEAccess().getNewSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getADDPACKAGERule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"new",
                    		lv_new_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleADDPACKAGE898); 

                	newLeafNode(otherlv_2, grammarAccess.getADDPACKAGEAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleADDPACKAGE"


    // $ANTLR start "entryRuleDELETEPACKAGE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:456:1: entryRuleDELETEPACKAGE returns [EObject current=null] : iv_ruleDELETEPACKAGE= ruleDELETEPACKAGE EOF ;
    public final EObject entryRuleDELETEPACKAGE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDELETEPACKAGE = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:457:2: (iv_ruleDELETEPACKAGE= ruleDELETEPACKAGE EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:458:2: iv_ruleDELETEPACKAGE= ruleDELETEPACKAGE EOF
            {
             newCompositeNode(grammarAccess.getDELETEPACKAGERule()); 
            pushFollow(FOLLOW_ruleDELETEPACKAGE_in_entryRuleDELETEPACKAGE934);
            iv_ruleDELETEPACKAGE=ruleDELETEPACKAGE();

            state._fsp--;

             current =iv_ruleDELETEPACKAGE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDELETEPACKAGE944); 

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
    // $ANTLR end "entryRuleDELETEPACKAGE"


    // $ANTLR start "ruleDELETEPACKAGE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:465:1: ruleDELETEPACKAGE returns [EObject current=null] : ( ( (lv_op_0_0= 'deletePackage(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleDELETEPACKAGE() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:468:28: ( ( ( (lv_op_0_0= 'deletePackage(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:469:1: ( ( (lv_op_0_0= 'deletePackage(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:469:1: ( ( (lv_op_0_0= 'deletePackage(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:469:2: ( (lv_op_0_0= 'deletePackage(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:469:2: ( (lv_op_0_0= 'deletePackage(' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:470:1: (lv_op_0_0= 'deletePackage(' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:470:1: (lv_op_0_0= 'deletePackage(' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:471:3: lv_op_0_0= 'deletePackage('
            {
            lv_op_0_0=(Token)match(input,22,FOLLOW_22_in_ruleDELETEPACKAGE987); 

                    newLeafNode(lv_op_0_0, grammarAccess.getDELETEPACKAGEAccess().getOpDeletePackageKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDELETEPACKAGERule());
            	        }
                   		setWithLastConsumed(current, "op", lv_op_0_0, "deletePackage(");
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:484:2: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:485:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:485:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:486:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDELETEPACKAGERule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDELETEPACKAGE1020); 

            		newLeafNode(otherlv_1, grammarAccess.getDELETEPACKAGEAccess().getRefEPackageCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleDELETEPACKAGE1032); 

                	newLeafNode(otherlv_2, grammarAccess.getDELETEPACKAGEAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleDELETEPACKAGE"


    // $ANTLR start "entryRulePackageOp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:509:1: entryRulePackageOp returns [EObject current=null] : iv_rulePackageOp= rulePackageOp EOF ;
    public final EObject entryRulePackageOp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageOp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:510:2: (iv_rulePackageOp= rulePackageOp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:511:2: iv_rulePackageOp= rulePackageOp EOF
            {
             newCompositeNode(grammarAccess.getPackageOpRule()); 
            pushFollow(FOLLOW_rulePackageOp_in_entryRulePackageOp1068);
            iv_rulePackageOp=rulePackageOp();

            state._fsp--;

             current =iv_rulePackageOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageOp1078); 

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
    // $ANTLR end "entryRulePackageOp"


    // $ANTLR start "rulePackageOp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:518:1: rulePackageOp returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGEPACKAGE ) ) | ( (lv_op_4_0= ruleADDPACKAGE ) ) | ( (lv_op_5_0= ruleDELETEPACKAGE ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )* otherlv_9= '}' ) | otherlv_10= ';' ) ) | ( (lv_complex_11_0= ruleCallOperator ) ) ) ) ;
    public final EObject rulePackageOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_var_1_0 = null;

        EObject lv_op_3_0 = null;

        EObject lv_op_4_0 = null;

        EObject lv_op_5_0 = null;

        EObject lv_setters_7_0 = null;

        EObject lv_classes_8_0 = null;

        EObject lv_complex_11_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:521:28: ( ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGEPACKAGE ) ) | ( (lv_op_4_0= ruleADDPACKAGE ) ) | ( (lv_op_5_0= ruleDELETEPACKAGE ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )* otherlv_9= '}' ) | otherlv_10= ';' ) ) | ( (lv_complex_11_0= ruleCallOperator ) ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:522:1: ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGEPACKAGE ) ) | ( (lv_op_4_0= ruleADDPACKAGE ) ) | ( (lv_op_5_0= ruleDELETEPACKAGE ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )* otherlv_9= '}' ) | otherlv_10= ';' ) ) | ( (lv_complex_11_0= ruleCallOperator ) ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:522:1: ( (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGEPACKAGE ) ) | ( (lv_op_4_0= ruleADDPACKAGE ) ) | ( (lv_op_5_0= ruleDELETEPACKAGE ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )* otherlv_9= '}' ) | otherlv_10= ';' ) ) | ( (lv_complex_11_0= ruleCallOperator ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:522:2: (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGEPACKAGE ) ) | ( (lv_op_4_0= ruleADDPACKAGE ) ) | ( (lv_op_5_0= ruleDELETEPACKAGE ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )* otherlv_9= '}' ) | otherlv_10= ';' ) ) | ( (lv_complex_11_0= ruleCallOperator ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:522:2: (otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:522:4: otherlv_0= 'package' ( (lv_var_1_0= rulePackage ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_rulePackageOp1116); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageOpAccess().getPackageKeyword_0_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:526:1: ( (lv_var_1_0= rulePackage ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:527:1: (lv_var_1_0= rulePackage )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:527:1: (lv_var_1_0= rulePackage )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:528:3: lv_var_1_0= rulePackage
            {
             
            	        newCompositeNode(grammarAccess.getPackageOpAccess().getVarPackageParserRuleCall_0_1_0()); 
            	    
            pushFollow(FOLLOW_rulePackage_in_rulePackageOp1137);
            lv_var_1_0=rulePackage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageOpRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_1_0, 
                    		"Package");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_rulePackageOp1149); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageOpAccess().getEqualsSignKeyword_0_2());
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:548:2: ( ( ( ( (lv_op_3_0= ruleCHANGEPACKAGE ) ) | ( (lv_op_4_0= ruleADDPACKAGE ) ) | ( (lv_op_5_0= ruleDELETEPACKAGE ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )* otherlv_9= '}' ) | otherlv_10= ';' ) ) | ( (lv_complex_11_0= ruleCallOperator ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19||(LA9_0>=21 && LA9_0<=22)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:548:3: ( ( ( (lv_op_3_0= ruleCHANGEPACKAGE ) ) | ( (lv_op_4_0= ruleADDPACKAGE ) ) | ( (lv_op_5_0= ruleDELETEPACKAGE ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )* otherlv_9= '}' ) | otherlv_10= ';' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:548:3: ( ( ( (lv_op_3_0= ruleCHANGEPACKAGE ) ) | ( (lv_op_4_0= ruleADDPACKAGE ) ) | ( (lv_op_5_0= ruleDELETEPACKAGE ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )* otherlv_9= '}' ) | otherlv_10= ';' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:548:4: ( ( (lv_op_3_0= ruleCHANGEPACKAGE ) ) | ( (lv_op_4_0= ruleADDPACKAGE ) ) | ( (lv_op_5_0= ruleDELETEPACKAGE ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )* otherlv_9= '}' ) | otherlv_10= ';' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:548:4: ( ( (lv_op_3_0= ruleCHANGEPACKAGE ) ) | ( (lv_op_4_0= ruleADDPACKAGE ) ) | ( (lv_op_5_0= ruleDELETEPACKAGE ) ) )
                    int alt6=3;
                    switch ( input.LA(1) ) {
                    case 19:
                        {
                        alt6=1;
                        }
                        break;
                    case 21:
                        {
                        alt6=2;
                        }
                        break;
                    case 22:
                        {
                        alt6=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:548:5: ( (lv_op_3_0= ruleCHANGEPACKAGE ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:548:5: ( (lv_op_3_0= ruleCHANGEPACKAGE ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:549:1: (lv_op_3_0= ruleCHANGEPACKAGE )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:549:1: (lv_op_3_0= ruleCHANGEPACKAGE )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:550:3: lv_op_3_0= ruleCHANGEPACKAGE
                            {
                             
                            	        newCompositeNode(grammarAccess.getPackageOpAccess().getOpCHANGEPACKAGEParserRuleCall_1_0_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleCHANGEPACKAGE_in_rulePackageOp1174);
                            lv_op_3_0=ruleCHANGEPACKAGE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPackageOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_3_0, 
                                    		"CHANGEPACKAGE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:567:6: ( (lv_op_4_0= ruleADDPACKAGE ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:567:6: ( (lv_op_4_0= ruleADDPACKAGE ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:568:1: (lv_op_4_0= ruleADDPACKAGE )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:568:1: (lv_op_4_0= ruleADDPACKAGE )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:569:3: lv_op_4_0= ruleADDPACKAGE
                            {
                             
                            	        newCompositeNode(grammarAccess.getPackageOpAccess().getOpADDPACKAGEParserRuleCall_1_0_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleADDPACKAGE_in_rulePackageOp1201);
                            lv_op_4_0=ruleADDPACKAGE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPackageOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_4_0, 
                                    		"ADDPACKAGE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:586:6: ( (lv_op_5_0= ruleDELETEPACKAGE ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:586:6: ( (lv_op_5_0= ruleDELETEPACKAGE ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:587:1: (lv_op_5_0= ruleDELETEPACKAGE )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:587:1: (lv_op_5_0= ruleDELETEPACKAGE )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:588:3: lv_op_5_0= ruleDELETEPACKAGE
                            {
                             
                            	        newCompositeNode(grammarAccess.getPackageOpAccess().getOpDELETEPACKAGEParserRuleCall_1_0_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDELETEPACKAGE_in_rulePackageOp1228);
                            lv_op_5_0=ruleDELETEPACKAGE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPackageOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_5_0, 
                                    		"DELETEPACKAGE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:604:3: ( (otherlv_6= '{' ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )* otherlv_9= '}' ) | otherlv_10= ';' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==12) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==17) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:604:4: (otherlv_6= '{' ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )* otherlv_9= '}' )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:604:4: (otherlv_6= '{' ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )* otherlv_9= '}' )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:604:6: otherlv_6= '{' ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )* otherlv_9= '}'
                            {
                            otherlv_6=(Token)match(input,12,FOLLOW_12_in_rulePackageOp1243); 

                                	newLeafNode(otherlv_6, grammarAccess.getPackageOpAccess().getLeftCurlyBracketKeyword_1_0_1_0_0());
                                
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:608:1: ( ( (lv_setters_7_0= rulepackageSetters ) ) | ( (lv_classes_8_0= ruleClassOp ) ) )*
                            loop7:
                            do {
                                int alt7=3;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==14) ) {
                                    alt7=1;
                                }
                                else if ( (LA7_0==43) ) {
                                    alt7=2;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:608:2: ( (lv_setters_7_0= rulepackageSetters ) )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:608:2: ( (lv_setters_7_0= rulepackageSetters ) )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:609:1: (lv_setters_7_0= rulepackageSetters )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:609:1: (lv_setters_7_0= rulepackageSetters )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:610:3: lv_setters_7_0= rulepackageSetters
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPackageOpAccess().getSettersPackageSettersParserRuleCall_1_0_1_0_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_rulepackageSetters_in_rulePackageOp1265);
                            	    lv_setters_7_0=rulepackageSetters();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getPackageOpRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"setters",
                            	            		lv_setters_7_0, 
                            	            		"packageSetters");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 2 :
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:627:6: ( (lv_classes_8_0= ruleClassOp ) )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:627:6: ( (lv_classes_8_0= ruleClassOp ) )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:628:1: (lv_classes_8_0= ruleClassOp )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:628:1: (lv_classes_8_0= ruleClassOp )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:629:3: lv_classes_8_0= ruleClassOp
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPackageOpAccess().getClassesClassOpParserRuleCall_1_0_1_0_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleClassOp_in_rulePackageOp1292);
                            	    lv_classes_8_0=ruleClassOp();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getPackageOpRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"classes",
                            	            		lv_classes_8_0, 
                            	            		"ClassOp");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);

                            otherlv_9=(Token)match(input,13,FOLLOW_13_in_rulePackageOp1306); 

                                	newLeafNode(otherlv_9, grammarAccess.getPackageOpAccess().getRightCurlyBracketKeyword_1_0_1_0_2());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:650:7: otherlv_10= ';'
                            {
                            otherlv_10=(Token)match(input,17,FOLLOW_17_in_rulePackageOp1325); 

                                	newLeafNode(otherlv_10, grammarAccess.getPackageOpAccess().getSemicolonKeyword_1_0_1_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:655:6: ( (lv_complex_11_0= ruleCallOperator ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:655:6: ( (lv_complex_11_0= ruleCallOperator ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:656:1: (lv_complex_11_0= ruleCallOperator )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:656:1: (lv_complex_11_0= ruleCallOperator )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:657:3: lv_complex_11_0= ruleCallOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageOpAccess().getComplexCallOperatorParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCallOperator_in_rulePackageOp1354);
                    lv_complex_11_0=ruleCallOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageOpRule());
                    	        }
                           		add(
                           			current, 
                           			"complex",
                            		lv_complex_11_0, 
                            		"CallOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "rulePackageOp"


    // $ANTLR start "entryRuleOpDef"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:681:1: entryRuleOpDef returns [EObject current=null] : iv_ruleOpDef= ruleOpDef EOF ;
    public final EObject entryRuleOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpDef = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:682:2: (iv_ruleOpDef= ruleOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:683:2: iv_ruleOpDef= ruleOpDef EOF
            {
             newCompositeNode(grammarAccess.getOpDefRule()); 
            pushFollow(FOLLOW_ruleOpDef_in_entryRuleOpDef1391);
            iv_ruleOpDef=ruleOpDef();

            state._fsp--;

             current =iv_ruleOpDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpDef1401); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:690:1: ruleOpDef returns [EObject current=null] : ( ( ( ( ( (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' ) ) ) ( ( (lv_ref_1_0= rulePackage ) ) otherlv_2= ':package' otherlv_3= ')' ) ( (otherlv_4= '{' ( (lv_settersdef_5_0= rulepackageSetters_def ) )* otherlv_6= '}' ) | otherlv_7= ';' ) ) | ( (lv_complex_8_0= ruleComplexOperator ) ) ) | ( ( ( (lv_opdef_9_1= 'changeClass(' | lv_opdef_9_2= 'addClass(' | lv_opdef_9_3= 'deleteClass(' ) ) ) ( (lv_ref_10_0= ruleClass ) ) otherlv_11= ':class' otherlv_12= ')' ( (otherlv_13= '{' ( (lv_settersdef_14_0= ruleclassSetters_def ) )* otherlv_15= '}' ) | otherlv_16= ';' ) ) | ( ( ( ( (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' ) | (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' ) | (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' ) | (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' ) | (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' ) ) otherlv_39= ')' ) | ( ( (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' ) | (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' ) | (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' ) | (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' ) ) otherlv_55= ')' ) ) (otherlv_56= ';' | (otherlv_57= '{' ( (lv_FeatureSettersdef_58_0= rulefeatureSetters_def ) )* otherlv_59= '}' ) ) ) ) ;
    public final EObject ruleOpDef() throws RecognitionException {
        EObject current = null;

        Token lv_opdef_0_1=null;
        Token lv_opdef_0_2=null;
        Token lv_opdef_0_3=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_opdef_9_1=null;
        Token lv_opdef_9_2=null;
        Token lv_opdef_9_3=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token lv_string_31_0=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        EObject lv_ref_1_0 = null;

        EObject lv_settersdef_5_0 = null;

        EObject lv_complex_8_0 = null;

        EObject lv_ref_10_0 = null;

        EObject lv_settersdef_14_0 = null;

        EObject lv_ref_18_0 = null;

        EObject lv_ref_22_0 = null;

        EObject lv_ref_25_0 = null;

        EObject lv_ref_28_0 = null;

        EObject lv_ref_34_0 = null;

        EObject lv_dst_37_0 = null;

        EObject lv_ref_41_0 = null;

        EObject lv_ref_44_0 = null;

        EObject lv_ref_47_0 = null;

        EObject lv_ref_50_0 = null;

        EObject lv_dst_53_0 = null;

        EObject lv_FeatureSettersdef_58_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:693:28: ( ( ( ( ( ( (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' ) ) ) ( ( (lv_ref_1_0= rulePackage ) ) otherlv_2= ':package' otherlv_3= ')' ) ( (otherlv_4= '{' ( (lv_settersdef_5_0= rulepackageSetters_def ) )* otherlv_6= '}' ) | otherlv_7= ';' ) ) | ( (lv_complex_8_0= ruleComplexOperator ) ) ) | ( ( ( (lv_opdef_9_1= 'changeClass(' | lv_opdef_9_2= 'addClass(' | lv_opdef_9_3= 'deleteClass(' ) ) ) ( (lv_ref_10_0= ruleClass ) ) otherlv_11= ':class' otherlv_12= ')' ( (otherlv_13= '{' ( (lv_settersdef_14_0= ruleclassSetters_def ) )* otherlv_15= '}' ) | otherlv_16= ';' ) ) | ( ( ( ( (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' ) | (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' ) | (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' ) | (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' ) | (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' ) ) otherlv_39= ')' ) | ( ( (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' ) | (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' ) | (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' ) | (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' ) ) otherlv_55= ')' ) ) (otherlv_56= ';' | (otherlv_57= '{' ( (lv_FeatureSettersdef_58_0= rulefeatureSetters_def ) )* otherlv_59= '}' ) ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:694:1: ( ( ( ( ( (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' ) ) ) ( ( (lv_ref_1_0= rulePackage ) ) otherlv_2= ':package' otherlv_3= ')' ) ( (otherlv_4= '{' ( (lv_settersdef_5_0= rulepackageSetters_def ) )* otherlv_6= '}' ) | otherlv_7= ';' ) ) | ( (lv_complex_8_0= ruleComplexOperator ) ) ) | ( ( ( (lv_opdef_9_1= 'changeClass(' | lv_opdef_9_2= 'addClass(' | lv_opdef_9_3= 'deleteClass(' ) ) ) ( (lv_ref_10_0= ruleClass ) ) otherlv_11= ':class' otherlv_12= ')' ( (otherlv_13= '{' ( (lv_settersdef_14_0= ruleclassSetters_def ) )* otherlv_15= '}' ) | otherlv_16= ';' ) ) | ( ( ( ( (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' ) | (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' ) | (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' ) | (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' ) | (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' ) ) otherlv_39= ')' ) | ( ( (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' ) | (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' ) | (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' ) | (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' ) ) otherlv_55= ')' ) ) (otherlv_56= ';' | (otherlv_57= '{' ( (lv_FeatureSettersdef_58_0= rulefeatureSetters_def ) )* otherlv_59= '}' ) ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:694:1: ( ( ( ( ( (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' ) ) ) ( ( (lv_ref_1_0= rulePackage ) ) otherlv_2= ':package' otherlv_3= ')' ) ( (otherlv_4= '{' ( (lv_settersdef_5_0= rulepackageSetters_def ) )* otherlv_6= '}' ) | otherlv_7= ';' ) ) | ( (lv_complex_8_0= ruleComplexOperator ) ) ) | ( ( ( (lv_opdef_9_1= 'changeClass(' | lv_opdef_9_2= 'addClass(' | lv_opdef_9_3= 'deleteClass(' ) ) ) ( (lv_ref_10_0= ruleClass ) ) otherlv_11= ':class' otherlv_12= ')' ( (otherlv_13= '{' ( (lv_settersdef_14_0= ruleclassSetters_def ) )* otherlv_15= '}' ) | otherlv_16= ';' ) ) | ( ( ( ( (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' ) | (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' ) | (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' ) | (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' ) | (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' ) ) otherlv_39= ')' ) | ( ( (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' ) | (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' ) | (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' ) | (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' ) ) otherlv_55= ')' ) ) (otherlv_56= ';' | (otherlv_57= '{' ( (lv_FeatureSettersdef_58_0= rulefeatureSetters_def ) )* otherlv_59= '}' ) ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 19:
            case 21:
            case 22:
            case 59:
                {
                alt22=1;
                }
                break;
            case 26:
            case 27:
            case 28:
                {
                alt22=2;
                }
                break;
            case 30:
            case 32:
            case 34:
            case 35:
            case 37:
            case 38:
            case 40:
            case 41:
            case 42:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:694:2: ( ( ( ( (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' ) ) ) ( ( (lv_ref_1_0= rulePackage ) ) otherlv_2= ':package' otherlv_3= ')' ) ( (otherlv_4= '{' ( (lv_settersdef_5_0= rulepackageSetters_def ) )* otherlv_6= '}' ) | otherlv_7= ';' ) ) | ( (lv_complex_8_0= ruleComplexOperator ) ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:694:2: ( ( ( ( (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' ) ) ) ( ( (lv_ref_1_0= rulePackage ) ) otherlv_2= ':package' otherlv_3= ')' ) ( (otherlv_4= '{' ( (lv_settersdef_5_0= rulepackageSetters_def ) )* otherlv_6= '}' ) | otherlv_7= ';' ) ) | ( (lv_complex_8_0= ruleComplexOperator ) ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==19||(LA13_0>=21 && LA13_0<=22)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==59) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:694:3: ( ( ( (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' ) ) ) ( ( (lv_ref_1_0= rulePackage ) ) otherlv_2= ':package' otherlv_3= ')' ) ( (otherlv_4= '{' ( (lv_settersdef_5_0= rulepackageSetters_def ) )* otherlv_6= '}' ) | otherlv_7= ';' ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:694:3: ( ( ( (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' ) ) ) ( ( (lv_ref_1_0= rulePackage ) ) otherlv_2= ':package' otherlv_3= ')' ) ( (otherlv_4= '{' ( (lv_settersdef_5_0= rulepackageSetters_def ) )* otherlv_6= '}' ) | otherlv_7= ';' ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:694:4: ( ( (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' ) ) ) ( ( (lv_ref_1_0= rulePackage ) ) otherlv_2= ':package' otherlv_3= ')' ) ( (otherlv_4= '{' ( (lv_settersdef_5_0= rulepackageSetters_def ) )* otherlv_6= '}' ) | otherlv_7= ';' )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:694:4: ( ( (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' ) ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:695:1: ( (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:695:1: ( (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:696:1: (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:696:1: (lv_opdef_0_1= 'changePackage(' | lv_opdef_0_2= 'addPackage(' | lv_opdef_0_3= 'deletePackage(' )
                            int alt10=3;
                            switch ( input.LA(1) ) {
                            case 19:
                                {
                                alt10=1;
                                }
                                break;
                            case 21:
                                {
                                alt10=2;
                                }
                                break;
                            case 22:
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
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:697:3: lv_opdef_0_1= 'changePackage('
                                    {
                                    lv_opdef_0_1=(Token)match(input,19,FOLLOW_19_in_ruleOpDef1448); 

                                            newLeafNode(lv_opdef_0_1, grammarAccess.getOpDefAccess().getOpdefChangePackageKeyword_0_0_0_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getOpDefRule());
                                    	        }
                                           		setWithLastConsumed(current, "opdef", lv_opdef_0_1, null);
                                    	    

                                    }
                                    break;
                                case 2 :
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:709:8: lv_opdef_0_2= 'addPackage('
                                    {
                                    lv_opdef_0_2=(Token)match(input,21,FOLLOW_21_in_ruleOpDef1477); 

                                            newLeafNode(lv_opdef_0_2, grammarAccess.getOpDefAccess().getOpdefAddPackageKeyword_0_0_0_0_1());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getOpDefRule());
                                    	        }
                                           		setWithLastConsumed(current, "opdef", lv_opdef_0_2, null);
                                    	    

                                    }
                                    break;
                                case 3 :
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:721:8: lv_opdef_0_3= 'deletePackage('
                                    {
                                    lv_opdef_0_3=(Token)match(input,22,FOLLOW_22_in_ruleOpDef1506); 

                                            newLeafNode(lv_opdef_0_3, grammarAccess.getOpDefAccess().getOpdefDeletePackageKeyword_0_0_0_0_2());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getOpDefRule());
                                    	        }
                                           		setWithLastConsumed(current, "opdef", lv_opdef_0_3, null);
                                    	    

                                    }
                                    break;

                            }


                            }


                            }

                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:736:2: ( ( (lv_ref_1_0= rulePackage ) ) otherlv_2= ':package' otherlv_3= ')' )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:736:3: ( (lv_ref_1_0= rulePackage ) ) otherlv_2= ':package' otherlv_3= ')'
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:736:3: ( (lv_ref_1_0= rulePackage ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:737:1: (lv_ref_1_0= rulePackage )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:737:1: (lv_ref_1_0= rulePackage )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:738:3: lv_ref_1_0= rulePackage
                            {
                             
                            	        newCompositeNode(grammarAccess.getOpDefAccess().getRefPackageParserRuleCall_0_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_rulePackage_in_ruleOpDef1544);
                            lv_ref_1_0=rulePackage();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"ref",
                                    		lv_ref_1_0, 
                                    		"Package");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleOpDef1556); 

                                	newLeafNode(otherlv_2, grammarAccess.getOpDefAccess().getPackageKeyword_0_0_1_1());
                                
                            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleOpDef1568); 

                                	newLeafNode(otherlv_3, grammarAccess.getOpDefAccess().getRightParenthesisKeyword_0_0_1_2());
                                

                            }

                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:762:2: ( (otherlv_4= '{' ( (lv_settersdef_5_0= rulepackageSetters_def ) )* otherlv_6= '}' ) | otherlv_7= ';' )
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==12) ) {
                                alt12=1;
                            }
                            else if ( (LA12_0==17) ) {
                                alt12=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 0, input);

                                throw nvae;
                            }
                            switch (alt12) {
                                case 1 :
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:762:3: (otherlv_4= '{' ( (lv_settersdef_5_0= rulepackageSetters_def ) )* otherlv_6= '}' )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:762:3: (otherlv_4= '{' ( (lv_settersdef_5_0= rulepackageSetters_def ) )* otherlv_6= '}' )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:762:5: otherlv_4= '{' ( (lv_settersdef_5_0= rulepackageSetters_def ) )* otherlv_6= '}'
                                    {
                                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleOpDef1583); 

                                        	newLeafNode(otherlv_4, grammarAccess.getOpDefAccess().getLeftCurlyBracketKeyword_0_0_2_0_0());
                                        
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:766:1: ( (lv_settersdef_5_0= rulepackageSetters_def ) )*
                                    loop11:
                                    do {
                                        int alt11=2;
                                        int LA11_0 = input.LA(1);

                                        if ( (LA11_0==14) ) {
                                            alt11=1;
                                        }


                                        switch (alt11) {
                                    	case 1 :
                                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:767:1: (lv_settersdef_5_0= rulepackageSetters_def )
                                    	    {
                                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:767:1: (lv_settersdef_5_0= rulepackageSetters_def )
                                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:768:3: lv_settersdef_5_0= rulepackageSetters_def
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getOpDefAccess().getSettersdefPackageSetters_defParserRuleCall_0_0_2_0_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_rulepackageSetters_def_in_ruleOpDef1604);
                                    	    lv_settersdef_5_0=rulepackageSetters_def();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"settersdef",
                                    	            		lv_settersdef_5_0, 
                                    	            		"packageSetters_def");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop11;
                                        }
                                    } while (true);

                                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleOpDef1617); 

                                        	newLeafNode(otherlv_6, grammarAccess.getOpDefAccess().getRightCurlyBracketKeyword_0_0_2_0_2());
                                        

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:789:7: otherlv_7= ';'
                                    {
                                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleOpDef1636); 

                                        	newLeafNode(otherlv_7, grammarAccess.getOpDefAccess().getSemicolonKeyword_0_0_2_1());
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:794:6: ( (lv_complex_8_0= ruleComplexOperator ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:794:6: ( (lv_complex_8_0= ruleComplexOperator ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:795:1: (lv_complex_8_0= ruleComplexOperator )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:795:1: (lv_complex_8_0= ruleComplexOperator )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:796:3: lv_complex_8_0= ruleComplexOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getOpDefAccess().getComplexComplexOperatorParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleComplexOperator_in_ruleOpDef1665);
                            lv_complex_8_0=ruleComplexOperator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getOpDefRule());
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
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:813:6: ( ( ( (lv_opdef_9_1= 'changeClass(' | lv_opdef_9_2= 'addClass(' | lv_opdef_9_3= 'deleteClass(' ) ) ) ( (lv_ref_10_0= ruleClass ) ) otherlv_11= ':class' otherlv_12= ')' ( (otherlv_13= '{' ( (lv_settersdef_14_0= ruleclassSetters_def ) )* otherlv_15= '}' ) | otherlv_16= ';' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:813:6: ( ( ( (lv_opdef_9_1= 'changeClass(' | lv_opdef_9_2= 'addClass(' | lv_opdef_9_3= 'deleteClass(' ) ) ) ( (lv_ref_10_0= ruleClass ) ) otherlv_11= ':class' otherlv_12= ')' ( (otherlv_13= '{' ( (lv_settersdef_14_0= ruleclassSetters_def ) )* otherlv_15= '}' ) | otherlv_16= ';' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:813:7: ( ( (lv_opdef_9_1= 'changeClass(' | lv_opdef_9_2= 'addClass(' | lv_opdef_9_3= 'deleteClass(' ) ) ) ( (lv_ref_10_0= ruleClass ) ) otherlv_11= ':class' otherlv_12= ')' ( (otherlv_13= '{' ( (lv_settersdef_14_0= ruleclassSetters_def ) )* otherlv_15= '}' ) | otherlv_16= ';' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:813:7: ( ( (lv_opdef_9_1= 'changeClass(' | lv_opdef_9_2= 'addClass(' | lv_opdef_9_3= 'deleteClass(' ) ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:814:1: ( (lv_opdef_9_1= 'changeClass(' | lv_opdef_9_2= 'addClass(' | lv_opdef_9_3= 'deleteClass(' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:814:1: ( (lv_opdef_9_1= 'changeClass(' | lv_opdef_9_2= 'addClass(' | lv_opdef_9_3= 'deleteClass(' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:815:1: (lv_opdef_9_1= 'changeClass(' | lv_opdef_9_2= 'addClass(' | lv_opdef_9_3= 'deleteClass(' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:815:1: (lv_opdef_9_1= 'changeClass(' | lv_opdef_9_2= 'addClass(' | lv_opdef_9_3= 'deleteClass(' )
                    int alt14=3;
                    switch ( input.LA(1) ) {
                    case 26:
                        {
                        alt14=1;
                        }
                        break;
                    case 27:
                        {
                        alt14=2;
                        }
                        break;
                    case 28:
                        {
                        alt14=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:816:3: lv_opdef_9_1= 'changeClass('
                            {
                            lv_opdef_9_1=(Token)match(input,26,FOLLOW_26_in_ruleOpDef1693); 

                                    newLeafNode(lv_opdef_9_1, grammarAccess.getOpDefAccess().getOpdefChangeClassKeyword_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOpDefRule());
                            	        }
                                   		setWithLastConsumed(current, "opdef", lv_opdef_9_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:828:8: lv_opdef_9_2= 'addClass('
                            {
                            lv_opdef_9_2=(Token)match(input,27,FOLLOW_27_in_ruleOpDef1722); 

                                    newLeafNode(lv_opdef_9_2, grammarAccess.getOpDefAccess().getOpdefAddClassKeyword_1_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOpDefRule());
                            	        }
                                   		setWithLastConsumed(current, "opdef", lv_opdef_9_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:840:8: lv_opdef_9_3= 'deleteClass('
                            {
                            lv_opdef_9_3=(Token)match(input,28,FOLLOW_28_in_ruleOpDef1751); 

                                    newLeafNode(lv_opdef_9_3, grammarAccess.getOpDefAccess().getOpdefDeleteClassKeyword_1_0_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOpDefRule());
                            	        }
                                   		setWithLastConsumed(current, "opdef", lv_opdef_9_3, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:855:2: ( (lv_ref_10_0= ruleClass ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:856:1: (lv_ref_10_0= ruleClass )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:856:1: (lv_ref_10_0= ruleClass )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:857:3: lv_ref_10_0= ruleClass
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpDefAccess().getRefClassParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClass_in_ruleOpDef1788);
                    lv_ref_10_0=ruleClass();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                    	        }
                           		set(
                           			current, 
                           			"ref",
                            		lv_ref_10_0, 
                            		"Class");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleOpDef1800); 

                        	newLeafNode(otherlv_11, grammarAccess.getOpDefAccess().getClassKeyword_1_2());
                        
                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleOpDef1812); 

                        	newLeafNode(otherlv_12, grammarAccess.getOpDefAccess().getRightParenthesisKeyword_1_3());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:881:1: ( (otherlv_13= '{' ( (lv_settersdef_14_0= ruleclassSetters_def ) )* otherlv_15= '}' ) | otherlv_16= ';' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==12) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==17) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:881:2: (otherlv_13= '{' ( (lv_settersdef_14_0= ruleclassSetters_def ) )* otherlv_15= '}' )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:881:2: (otherlv_13= '{' ( (lv_settersdef_14_0= ruleclassSetters_def ) )* otherlv_15= '}' )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:881:4: otherlv_13= '{' ( (lv_settersdef_14_0= ruleclassSetters_def ) )* otherlv_15= '}'
                            {
                            otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleOpDef1826); 

                                	newLeafNode(otherlv_13, grammarAccess.getOpDefAccess().getLeftCurlyBracketKeyword_1_4_0_0());
                                
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:885:1: ( (lv_settersdef_14_0= ruleclassSetters_def ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==14) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:886:1: (lv_settersdef_14_0= ruleclassSetters_def )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:886:1: (lv_settersdef_14_0= ruleclassSetters_def )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:887:3: lv_settersdef_14_0= ruleclassSetters_def
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getOpDefAccess().getSettersdefClassSetters_defParserRuleCall_1_4_0_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleclassSetters_def_in_ruleOpDef1847);
                            	    lv_settersdef_14_0=ruleclassSetters_def();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"settersdef",
                            	            		lv_settersdef_14_0, 
                            	            		"classSetters_def");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);

                            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleOpDef1860); 

                                	newLeafNode(otherlv_15, grammarAccess.getOpDefAccess().getRightCurlyBracketKeyword_1_4_0_2());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:908:7: otherlv_16= ';'
                            {
                            otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleOpDef1879); 

                                	newLeafNode(otherlv_16, grammarAccess.getOpDefAccess().getSemicolonKeyword_1_4_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:913:6: ( ( ( ( (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' ) | (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' ) | (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' ) | (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' ) | (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' ) ) otherlv_39= ')' ) | ( ( (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' ) | (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' ) | (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' ) | (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' ) ) otherlv_55= ')' ) ) (otherlv_56= ';' | (otherlv_57= '{' ( (lv_FeatureSettersdef_58_0= rulefeatureSetters_def ) )* otherlv_59= '}' ) ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:913:6: ( ( ( ( (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' ) | (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' ) | (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' ) | (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' ) | (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' ) ) otherlv_39= ')' ) | ( ( (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' ) | (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' ) | (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' ) | (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' ) ) otherlv_55= ')' ) ) (otherlv_56= ';' | (otherlv_57= '{' ( (lv_FeatureSettersdef_58_0= rulefeatureSetters_def ) )* otherlv_59= '}' ) ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:913:7: ( ( ( (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' ) | (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' ) | (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' ) | (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' ) | (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' ) ) otherlv_39= ')' ) | ( ( (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' ) | (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' ) | (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' ) | (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' ) ) otherlv_55= ')' ) ) (otherlv_56= ';' | (otherlv_57= '{' ( (lv_FeatureSettersdef_58_0= rulefeatureSetters_def ) )* otherlv_59= '}' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:913:7: ( ( ( (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' ) | (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' ) | (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' ) | (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' ) | (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' ) ) otherlv_39= ')' ) | ( ( (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' ) | (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' ) | (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' ) | (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' ) ) otherlv_55= ')' ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==30||LA19_0==32||(LA19_0>=34 && LA19_0<=35)||LA19_0==37) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==38||(LA19_0>=40 && LA19_0<=42)) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:913:8: ( ( (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' ) | (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' ) | (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' ) | (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' ) | (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' ) ) otherlv_39= ')' )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:913:8: ( ( (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' ) | (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' ) | (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' ) | (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' ) | (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' ) ) otherlv_39= ')' )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:913:9: ( (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' ) | (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' ) | (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' ) | (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' ) | (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' ) ) otherlv_39= ')'
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:913:9: ( (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' ) | (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' ) | (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' ) | (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' ) | (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' ) )
                            int alt17=5;
                            switch ( input.LA(1) ) {
                            case 30:
                                {
                                alt17=1;
                                }
                                break;
                            case 32:
                                {
                                alt17=2;
                                }
                                break;
                            case 34:
                                {
                                alt17=3;
                                }
                                break;
                            case 35:
                                {
                                alt17=4;
                                }
                                break;
                            case 37:
                                {
                                alt17=5;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 0, input);

                                throw nvae;
                            }

                            switch (alt17) {
                                case 1 :
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:913:10: (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:913:10: (otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute' )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:913:12: otherlv_17= 'changeAttribute(' ( (lv_ref_18_0= ruleAttribute ) ) otherlv_19= ':attribute'
                                    {
                                    otherlv_17=(Token)match(input,30,FOLLOW_30_in_ruleOpDef1904); 

                                        	newLeafNode(otherlv_17, grammarAccess.getOpDefAccess().getChangeAttributeKeyword_2_0_0_0_0_0());
                                        
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:917:1: ( (lv_ref_18_0= ruleAttribute ) )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:918:1: (lv_ref_18_0= ruleAttribute )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:918:1: (lv_ref_18_0= ruleAttribute )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:919:3: lv_ref_18_0= ruleAttribute
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getOpDefAccess().getRefAttributeParserRuleCall_2_0_0_0_0_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleAttribute_in_ruleOpDef1925);
                                    lv_ref_18_0=ruleAttribute();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"ref",
                                            		lv_ref_18_0, 
                                            		"Attribute");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    otherlv_19=(Token)match(input,31,FOLLOW_31_in_ruleOpDef1937); 

                                        	newLeafNode(otherlv_19, grammarAccess.getOpDefAccess().getAttributeKeyword_2_0_0_0_0_2());
                                        

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:940:6: (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:940:6: (otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute' )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:940:8: otherlv_20= 'addAttribute' otherlv_21= '(' ( (lv_ref_22_0= ruleAttribute ) ) otherlv_23= ':attribute'
                                    {
                                    otherlv_20=(Token)match(input,32,FOLLOW_32_in_ruleOpDef1957); 

                                        	newLeafNode(otherlv_20, grammarAccess.getOpDefAccess().getAddAttributeKeyword_2_0_0_0_1_0());
                                        
                                    otherlv_21=(Token)match(input,33,FOLLOW_33_in_ruleOpDef1969); 

                                        	newLeafNode(otherlv_21, grammarAccess.getOpDefAccess().getLeftParenthesisKeyword_2_0_0_0_1_1());
                                        
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:948:1: ( (lv_ref_22_0= ruleAttribute ) )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:949:1: (lv_ref_22_0= ruleAttribute )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:949:1: (lv_ref_22_0= ruleAttribute )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:950:3: lv_ref_22_0= ruleAttribute
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getOpDefAccess().getRefAttributeParserRuleCall_2_0_0_0_1_2_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleAttribute_in_ruleOpDef1990);
                                    lv_ref_22_0=ruleAttribute();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"ref",
                                            		lv_ref_22_0, 
                                            		"Attribute");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    otherlv_23=(Token)match(input,31,FOLLOW_31_in_ruleOpDef2002); 

                                        	newLeafNode(otherlv_23, grammarAccess.getOpDefAccess().getAttributeKeyword_2_0_0_0_1_3());
                                        

                                    }


                                    }
                                    break;
                                case 3 :
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:971:6: (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:971:6: (otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute' )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:971:8: otherlv_24= 'deleteAttribute(' ( (lv_ref_25_0= ruleAttribute ) ) otherlv_26= ':attribute'
                                    {
                                    otherlv_24=(Token)match(input,34,FOLLOW_34_in_ruleOpDef2022); 

                                        	newLeafNode(otherlv_24, grammarAccess.getOpDefAccess().getDeleteAttributeKeyword_2_0_0_0_2_0());
                                        
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:975:1: ( (lv_ref_25_0= ruleAttribute ) )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:976:1: (lv_ref_25_0= ruleAttribute )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:976:1: (lv_ref_25_0= ruleAttribute )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:977:3: lv_ref_25_0= ruleAttribute
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getOpDefAccess().getRefAttributeParserRuleCall_2_0_0_0_2_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleAttribute_in_ruleOpDef2043);
                                    lv_ref_25_0=ruleAttribute();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"ref",
                                            		lv_ref_25_0, 
                                            		"Attribute");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    otherlv_26=(Token)match(input,31,FOLLOW_31_in_ruleOpDef2055); 

                                        	newLeafNode(otherlv_26, grammarAccess.getOpDefAccess().getAttributeKeyword_2_0_0_0_2_2());
                                        

                                    }


                                    }
                                    break;
                                case 4 :
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:998:6: (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:998:6: (otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string' )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:998:8: otherlv_27= 'renameAttribute(' ( (lv_ref_28_0= ruleAttribute ) ) otherlv_29= ':attribute' otherlv_30= ',' ( (lv_string_31_0= RULE_STRING ) ) otherlv_32= ':string'
                                    {
                                    otherlv_27=(Token)match(input,35,FOLLOW_35_in_ruleOpDef2075); 

                                        	newLeafNode(otherlv_27, grammarAccess.getOpDefAccess().getRenameAttributeKeyword_2_0_0_0_3_0());
                                        
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1002:1: ( (lv_ref_28_0= ruleAttribute ) )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1003:1: (lv_ref_28_0= ruleAttribute )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1003:1: (lv_ref_28_0= ruleAttribute )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1004:3: lv_ref_28_0= ruleAttribute
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getOpDefAccess().getRefAttributeParserRuleCall_2_0_0_0_3_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleAttribute_in_ruleOpDef2096);
                                    lv_ref_28_0=ruleAttribute();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"ref",
                                            		lv_ref_28_0, 
                                            		"Attribute");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    otherlv_29=(Token)match(input,31,FOLLOW_31_in_ruleOpDef2108); 

                                        	newLeafNode(otherlv_29, grammarAccess.getOpDefAccess().getAttributeKeyword_2_0_0_0_3_2());
                                        
                                    otherlv_30=(Token)match(input,16,FOLLOW_16_in_ruleOpDef2120); 

                                        	newLeafNode(otherlv_30, grammarAccess.getOpDefAccess().getCommaKeyword_2_0_0_0_3_3());
                                        
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1028:1: ( (lv_string_31_0= RULE_STRING ) )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1029:1: (lv_string_31_0= RULE_STRING )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1029:1: (lv_string_31_0= RULE_STRING )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1030:3: lv_string_31_0= RULE_STRING
                                    {
                                    lv_string_31_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOpDef2137); 

                                    			newLeafNode(lv_string_31_0, grammarAccess.getOpDefAccess().getStringSTRINGTerminalRuleCall_2_0_0_0_3_4_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getOpDefRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"string",
                                            		lv_string_31_0, 
                                            		"STRING");
                                    	    

                                    }


                                    }

                                    otherlv_32=(Token)match(input,36,FOLLOW_36_in_ruleOpDef2154); 

                                        	newLeafNode(otherlv_32, grammarAccess.getOpDefAccess().getStringKeyword_2_0_0_0_3_5());
                                        

                                    }


                                    }
                                    break;
                                case 5 :
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1051:6: (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1051:6: (otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class' )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1051:8: otherlv_33= 'moveAttribute(' ( (lv_ref_34_0= ruleAttribute ) ) otherlv_35= ':attribute' otherlv_36= ',' ( (lv_dst_37_0= ruleClass ) ) otherlv_38= ':class'
                                    {
                                    otherlv_33=(Token)match(input,37,FOLLOW_37_in_ruleOpDef2174); 

                                        	newLeafNode(otherlv_33, grammarAccess.getOpDefAccess().getMoveAttributeKeyword_2_0_0_0_4_0());
                                        
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1055:1: ( (lv_ref_34_0= ruleAttribute ) )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1056:1: (lv_ref_34_0= ruleAttribute )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1056:1: (lv_ref_34_0= ruleAttribute )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1057:3: lv_ref_34_0= ruleAttribute
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getOpDefAccess().getRefAttributeParserRuleCall_2_0_0_0_4_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleAttribute_in_ruleOpDef2195);
                                    lv_ref_34_0=ruleAttribute();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"ref",
                                            		lv_ref_34_0, 
                                            		"Attribute");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    otherlv_35=(Token)match(input,31,FOLLOW_31_in_ruleOpDef2207); 

                                        	newLeafNode(otherlv_35, grammarAccess.getOpDefAccess().getAttributeKeyword_2_0_0_0_4_2());
                                        
                                    otherlv_36=(Token)match(input,16,FOLLOW_16_in_ruleOpDef2219); 

                                        	newLeafNode(otherlv_36, grammarAccess.getOpDefAccess().getCommaKeyword_2_0_0_0_4_3());
                                        
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1081:1: ( (lv_dst_37_0= ruleClass ) )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1082:1: (lv_dst_37_0= ruleClass )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1082:1: (lv_dst_37_0= ruleClass )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1083:3: lv_dst_37_0= ruleClass
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getOpDefAccess().getDstClassParserRuleCall_2_0_0_0_4_4_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleClass_in_ruleOpDef2240);
                                    lv_dst_37_0=ruleClass();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"dst",
                                            		lv_dst_37_0, 
                                            		"Class");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    otherlv_38=(Token)match(input,29,FOLLOW_29_in_ruleOpDef2252); 

                                        	newLeafNode(otherlv_38, grammarAccess.getOpDefAccess().getClassKeyword_2_0_0_0_4_5());
                                        

                                    }


                                    }
                                    break;

                            }

                            otherlv_39=(Token)match(input,20,FOLLOW_20_in_ruleOpDef2266); 

                                	newLeafNode(otherlv_39, grammarAccess.getOpDefAccess().getRightParenthesisKeyword_2_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1108:6: ( ( (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' ) | (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' ) | (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' ) | (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' ) ) otherlv_55= ')' )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1108:6: ( ( (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' ) | (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' ) | (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' ) | (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' ) ) otherlv_55= ')' )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1108:7: ( (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' ) | (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' ) | (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' ) | (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' ) ) otherlv_55= ')'
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1108:7: ( (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' ) | (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' ) | (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' ) | (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' ) )
                            int alt18=4;
                            switch ( input.LA(1) ) {
                            case 38:
                                {
                                alt18=1;
                                }
                                break;
                            case 40:
                                {
                                alt18=2;
                                }
                                break;
                            case 41:
                                {
                                alt18=3;
                                }
                                break;
                            case 42:
                                {
                                alt18=4;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 0, input);

                                throw nvae;
                            }

                            switch (alt18) {
                                case 1 :
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1108:8: (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1108:8: (otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference' )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1108:10: otherlv_40= 'changeReference(' ( (lv_ref_41_0= ruleReference ) ) otherlv_42= ':reference'
                                    {
                                    otherlv_40=(Token)match(input,38,FOLLOW_38_in_ruleOpDef2288); 

                                        	newLeafNode(otherlv_40, grammarAccess.getOpDefAccess().getChangeReferenceKeyword_2_0_1_0_0_0());
                                        
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1112:1: ( (lv_ref_41_0= ruleReference ) )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1113:1: (lv_ref_41_0= ruleReference )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1113:1: (lv_ref_41_0= ruleReference )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1114:3: lv_ref_41_0= ruleReference
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getOpDefAccess().getRefReferenceParserRuleCall_2_0_1_0_0_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleReference_in_ruleOpDef2309);
                                    lv_ref_41_0=ruleReference();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"ref",
                                            		lv_ref_41_0, 
                                            		"Reference");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    otherlv_42=(Token)match(input,39,FOLLOW_39_in_ruleOpDef2321); 

                                        	newLeafNode(otherlv_42, grammarAccess.getOpDefAccess().getReferenceKeyword_2_0_1_0_0_2());
                                        

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1135:6: (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1135:6: (otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference' )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1135:8: otherlv_43= 'addReference(' ( (lv_ref_44_0= ruleReference ) ) otherlv_45= ':reference'
                                    {
                                    otherlv_43=(Token)match(input,40,FOLLOW_40_in_ruleOpDef2341); 

                                        	newLeafNode(otherlv_43, grammarAccess.getOpDefAccess().getAddReferenceKeyword_2_0_1_0_1_0());
                                        
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1139:1: ( (lv_ref_44_0= ruleReference ) )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1140:1: (lv_ref_44_0= ruleReference )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1140:1: (lv_ref_44_0= ruleReference )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1141:3: lv_ref_44_0= ruleReference
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getOpDefAccess().getRefReferenceParserRuleCall_2_0_1_0_1_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleReference_in_ruleOpDef2362);
                                    lv_ref_44_0=ruleReference();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"ref",
                                            		lv_ref_44_0, 
                                            		"Reference");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    otherlv_45=(Token)match(input,39,FOLLOW_39_in_ruleOpDef2374); 

                                        	newLeafNode(otherlv_45, grammarAccess.getOpDefAccess().getReferenceKeyword_2_0_1_0_1_2());
                                        

                                    }


                                    }
                                    break;
                                case 3 :
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1162:6: (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1162:6: (otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference' )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1162:8: otherlv_46= 'deleteReference(' ( (lv_ref_47_0= ruleReference ) ) otherlv_48= ':reference'
                                    {
                                    otherlv_46=(Token)match(input,41,FOLLOW_41_in_ruleOpDef2394); 

                                        	newLeafNode(otherlv_46, grammarAccess.getOpDefAccess().getDeleteReferenceKeyword_2_0_1_0_2_0());
                                        
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1166:1: ( (lv_ref_47_0= ruleReference ) )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1167:1: (lv_ref_47_0= ruleReference )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1167:1: (lv_ref_47_0= ruleReference )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1168:3: lv_ref_47_0= ruleReference
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getOpDefAccess().getRefReferenceParserRuleCall_2_0_1_0_2_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleReference_in_ruleOpDef2415);
                                    lv_ref_47_0=ruleReference();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"ref",
                                            		lv_ref_47_0, 
                                            		"Reference");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    otherlv_48=(Token)match(input,39,FOLLOW_39_in_ruleOpDef2427); 

                                        	newLeafNode(otherlv_48, grammarAccess.getOpDefAccess().getReferenceKeyword_2_0_1_0_2_2());
                                        

                                    }


                                    }
                                    break;
                                case 4 :
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1189:6: (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1189:6: (otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class' )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1189:8: otherlv_49= 'moveReference(' ( (lv_ref_50_0= ruleReference ) ) otherlv_51= ':reference' otherlv_52= ',' ( (lv_dst_53_0= ruleClass ) ) otherlv_54= ':class'
                                    {
                                    otherlv_49=(Token)match(input,42,FOLLOW_42_in_ruleOpDef2447); 

                                        	newLeafNode(otherlv_49, grammarAccess.getOpDefAccess().getMoveReferenceKeyword_2_0_1_0_3_0());
                                        
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1193:1: ( (lv_ref_50_0= ruleReference ) )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1194:1: (lv_ref_50_0= ruleReference )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1194:1: (lv_ref_50_0= ruleReference )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1195:3: lv_ref_50_0= ruleReference
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getOpDefAccess().getRefReferenceParserRuleCall_2_0_1_0_3_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleReference_in_ruleOpDef2468);
                                    lv_ref_50_0=ruleReference();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"ref",
                                            		lv_ref_50_0, 
                                            		"Reference");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    otherlv_51=(Token)match(input,39,FOLLOW_39_in_ruleOpDef2480); 

                                        	newLeafNode(otherlv_51, grammarAccess.getOpDefAccess().getReferenceKeyword_2_0_1_0_3_2());
                                        
                                    otherlv_52=(Token)match(input,16,FOLLOW_16_in_ruleOpDef2492); 

                                        	newLeafNode(otherlv_52, grammarAccess.getOpDefAccess().getCommaKeyword_2_0_1_0_3_3());
                                        
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1219:1: ( (lv_dst_53_0= ruleClass ) )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1220:1: (lv_dst_53_0= ruleClass )
                                    {
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1220:1: (lv_dst_53_0= ruleClass )
                                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1221:3: lv_dst_53_0= ruleClass
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getOpDefAccess().getDstClassParserRuleCall_2_0_1_0_3_4_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleClass_in_ruleOpDef2513);
                                    lv_dst_53_0=ruleClass();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"dst",
                                            		lv_dst_53_0, 
                                            		"Class");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    otherlv_54=(Token)match(input,29,FOLLOW_29_in_ruleOpDef2525); 

                                        	newLeafNode(otherlv_54, grammarAccess.getOpDefAccess().getClassKeyword_2_0_1_0_3_5());
                                        

                                    }


                                    }
                                    break;

                            }

                            otherlv_55=(Token)match(input,20,FOLLOW_20_in_ruleOpDef2539); 

                                	newLeafNode(otherlv_55, grammarAccess.getOpDefAccess().getRightParenthesisKeyword_2_0_1_1());
                                

                            }


                            }
                            break;

                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1245:3: (otherlv_56= ';' | (otherlv_57= '{' ( (lv_FeatureSettersdef_58_0= rulefeatureSetters_def ) )* otherlv_59= '}' ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==17) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==12) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1245:5: otherlv_56= ';'
                            {
                            otherlv_56=(Token)match(input,17,FOLLOW_17_in_ruleOpDef2554); 

                                	newLeafNode(otherlv_56, grammarAccess.getOpDefAccess().getSemicolonKeyword_2_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1250:6: (otherlv_57= '{' ( (lv_FeatureSettersdef_58_0= rulefeatureSetters_def ) )* otherlv_59= '}' )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1250:6: (otherlv_57= '{' ( (lv_FeatureSettersdef_58_0= rulefeatureSetters_def ) )* otherlv_59= '}' )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1250:8: otherlv_57= '{' ( (lv_FeatureSettersdef_58_0= rulefeatureSetters_def ) )* otherlv_59= '}'
                            {
                            otherlv_57=(Token)match(input,12,FOLLOW_12_in_ruleOpDef2573); 

                                	newLeafNode(otherlv_57, grammarAccess.getOpDefAccess().getLeftCurlyBracketKeyword_2_1_1_0());
                                
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1254:1: ( (lv_FeatureSettersdef_58_0= rulefeatureSetters_def ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==46||(LA20_0>=48 && LA20_0<=49)||(LA20_0>=51 && LA20_0<=53)) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1255:1: (lv_FeatureSettersdef_58_0= rulefeatureSetters_def )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1255:1: (lv_FeatureSettersdef_58_0= rulefeatureSetters_def )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1256:3: lv_FeatureSettersdef_58_0= rulefeatureSetters_def
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getOpDefAccess().getFeatureSettersdefFeatureSetters_defParserRuleCall_2_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_rulefeatureSetters_def_in_ruleOpDef2594);
                            	    lv_FeatureSettersdef_58_0=rulefeatureSetters_def();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getOpDefRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"FeatureSettersdef",
                            	            		lv_FeatureSettersdef_58_0, 
                            	            		"featureSetters_def");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);

                            otherlv_59=(Token)match(input,13,FOLLOW_13_in_ruleOpDef2607); 

                                	newLeafNode(otherlv_59, grammarAccess.getOpDefAccess().getRightCurlyBracketKeyword_2_1_1_2());
                                

                            }


                            }
                            break;

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
    // $ANTLR end "ruleOpDef"


    // $ANTLR start "entryRulePackage"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1284:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1285:2: (iv_rulePackage= rulePackage EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1286:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage2646);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage2656); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1293:1: rulePackage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1296:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1297:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1297:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1297:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1297:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1298:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPackageAccess().getPackageAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1303:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1304:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1304:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1305:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage2707); 

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


    // $ANTLR start "entryRuleCHANGECLASS"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1329:1: entryRuleCHANGECLASS returns [EObject current=null] : iv_ruleCHANGECLASS= ruleCHANGECLASS EOF ;
    public final EObject entryRuleCHANGECLASS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHANGECLASS = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1330:2: (iv_ruleCHANGECLASS= ruleCHANGECLASS EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1331:2: iv_ruleCHANGECLASS= ruleCHANGECLASS EOF
            {
             newCompositeNode(grammarAccess.getCHANGECLASSRule()); 
            pushFollow(FOLLOW_ruleCHANGECLASS_in_entryRuleCHANGECLASS2748);
            iv_ruleCHANGECLASS=ruleCHANGECLASS();

            state._fsp--;

             current =iv_ruleCHANGECLASS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCHANGECLASS2758); 

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
    // $ANTLR end "entryRuleCHANGECLASS"


    // $ANTLR start "ruleCHANGECLASS"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1338:1: ruleCHANGECLASS returns [EObject current=null] : ( ( (lv_op_0_0= 'changeClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleCHANGECLASS() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1341:28: ( ( ( (lv_op_0_0= 'changeClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1342:1: ( ( (lv_op_0_0= 'changeClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1342:1: ( ( (lv_op_0_0= 'changeClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1342:2: ( (lv_op_0_0= 'changeClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1342:2: ( (lv_op_0_0= 'changeClass(' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1343:1: (lv_op_0_0= 'changeClass(' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1343:1: (lv_op_0_0= 'changeClass(' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1344:3: lv_op_0_0= 'changeClass('
            {
            lv_op_0_0=(Token)match(input,26,FOLLOW_26_in_ruleCHANGECLASS2801); 

                    newLeafNode(lv_op_0_0, grammarAccess.getCHANGECLASSAccess().getOpChangeClassKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCHANGECLASSRule());
            	        }
                   		setWithLastConsumed(current, "op", lv_op_0_0, "changeClass(");
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1357:2: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1358:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1358:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1359:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCHANGECLASSRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCHANGECLASS2834); 

            		newLeafNode(otherlv_1, grammarAccess.getCHANGECLASSAccess().getRefEClassCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCHANGECLASS2846); 

                	newLeafNode(otherlv_2, grammarAccess.getCHANGECLASSAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleCHANGECLASS"


    // $ANTLR start "entryRuleADDCLASS"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1382:1: entryRuleADDCLASS returns [EObject current=null] : iv_ruleADDCLASS= ruleADDCLASS EOF ;
    public final EObject entryRuleADDCLASS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADDCLASS = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1383:2: (iv_ruleADDCLASS= ruleADDCLASS EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1384:2: iv_ruleADDCLASS= ruleADDCLASS EOF
            {
             newCompositeNode(grammarAccess.getADDCLASSRule()); 
            pushFollow(FOLLOW_ruleADDCLASS_in_entryRuleADDCLASS2882);
            iv_ruleADDCLASS=ruleADDCLASS();

            state._fsp--;

             current =iv_ruleADDCLASS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleADDCLASS2892); 

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
    // $ANTLR end "entryRuleADDCLASS"


    // $ANTLR start "ruleADDCLASS"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1391:1: ruleADDCLASS returns [EObject current=null] : ( ( (lv_op_0_0= 'addClass(' ) ) ( (lv_new_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleADDCLASS() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token lv_new_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1394:28: ( ( ( (lv_op_0_0= 'addClass(' ) ) ( (lv_new_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1395:1: ( ( (lv_op_0_0= 'addClass(' ) ) ( (lv_new_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1395:1: ( ( (lv_op_0_0= 'addClass(' ) ) ( (lv_new_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1395:2: ( (lv_op_0_0= 'addClass(' ) ) ( (lv_new_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1395:2: ( (lv_op_0_0= 'addClass(' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1396:1: (lv_op_0_0= 'addClass(' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1396:1: (lv_op_0_0= 'addClass(' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1397:3: lv_op_0_0= 'addClass('
            {
            lv_op_0_0=(Token)match(input,27,FOLLOW_27_in_ruleADDCLASS2935); 

                    newLeafNode(lv_op_0_0, grammarAccess.getADDCLASSAccess().getOpAddClassKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getADDCLASSRule());
            	        }
                   		setWithLastConsumed(current, "op", lv_op_0_0, "addClass(");
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1410:2: ( (lv_new_1_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1411:1: (lv_new_1_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1411:1: (lv_new_1_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1412:3: lv_new_1_0= RULE_STRING
            {
            lv_new_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleADDCLASS2965); 

            			newLeafNode(lv_new_1_0, grammarAccess.getADDCLASSAccess().getNewSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getADDCLASSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"new",
                    		lv_new_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleADDCLASS2982); 

                	newLeafNode(otherlv_2, grammarAccess.getADDCLASSAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleADDCLASS"


    // $ANTLR start "entryRuleDELETECLASS"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1440:1: entryRuleDELETECLASS returns [EObject current=null] : iv_ruleDELETECLASS= ruleDELETECLASS EOF ;
    public final EObject entryRuleDELETECLASS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDELETECLASS = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1441:2: (iv_ruleDELETECLASS= ruleDELETECLASS EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1442:2: iv_ruleDELETECLASS= ruleDELETECLASS EOF
            {
             newCompositeNode(grammarAccess.getDELETECLASSRule()); 
            pushFollow(FOLLOW_ruleDELETECLASS_in_entryRuleDELETECLASS3018);
            iv_ruleDELETECLASS=ruleDELETECLASS();

            state._fsp--;

             current =iv_ruleDELETECLASS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDELETECLASS3028); 

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
    // $ANTLR end "entryRuleDELETECLASS"


    // $ANTLR start "ruleDELETECLASS"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1449:1: ruleDELETECLASS returns [EObject current=null] : ( ( (lv_op_0_0= 'deleteClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleDELETECLASS() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1452:28: ( ( ( (lv_op_0_0= 'deleteClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1453:1: ( ( (lv_op_0_0= 'deleteClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1453:1: ( ( (lv_op_0_0= 'deleteClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1453:2: ( (lv_op_0_0= 'deleteClass(' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1453:2: ( (lv_op_0_0= 'deleteClass(' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1454:1: (lv_op_0_0= 'deleteClass(' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1454:1: (lv_op_0_0= 'deleteClass(' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1455:3: lv_op_0_0= 'deleteClass('
            {
            lv_op_0_0=(Token)match(input,28,FOLLOW_28_in_ruleDELETECLASS3071); 

                    newLeafNode(lv_op_0_0, grammarAccess.getDELETECLASSAccess().getOpDeleteClassKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDELETECLASSRule());
            	        }
                   		setWithLastConsumed(current, "op", lv_op_0_0, "deleteClass(");
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1468:2: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1469:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1469:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1470:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDELETECLASSRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDELETECLASS3104); 

            		newLeafNode(otherlv_1, grammarAccess.getDELETECLASSAccess().getRefEClassCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleDELETECLASS3116); 

                	newLeafNode(otherlv_2, grammarAccess.getDELETECLASSAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleDELETECLASS"


    // $ANTLR start "entryRuleclassSetter"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1493:1: entryRuleclassSetter returns [EObject current=null] : iv_ruleclassSetter= ruleclassSetter EOF ;
    public final EObject entryRuleclassSetter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleclassSetter = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1494:2: (iv_ruleclassSetter= ruleclassSetter EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1495:2: iv_ruleclassSetter= ruleclassSetter EOF
            {
             newCompositeNode(grammarAccess.getClassSetterRule()); 
            pushFollow(FOLLOW_ruleclassSetter_in_entryRuleclassSetter3152);
            iv_ruleclassSetter=ruleclassSetter();

            state._fsp--;

             current =iv_ruleclassSetter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclassSetter3162); 

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
    // $ANTLR end "entryRuleclassSetter"


    // $ANTLR start "ruleclassSetter"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1502:1: ruleclassSetter returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';' ) ;
    public final EObject ruleclassSetter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1505:28: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1506:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1506:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1506:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleclassSetter3199); 

                	newLeafNode(otherlv_0, grammarAccess.getClassSetterAccess().getSetKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1510:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1511:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1511:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1512:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassSetterRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleclassSetter3219); 

            		newLeafNode(otherlv_1, grammarAccess.getClassSetterAccess().getMetafeatureEStructuralFeatureCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleclassSetter3231); 

                	newLeafNode(otherlv_2, grammarAccess.getClassSetterAccess().getColonEqualsSignKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1527:1: ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1527:2: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1527:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1528:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1528:1: (lv_value_3_0= RULE_STRING )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1529:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleclassSetter3249); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getClassSetterAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassSetterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1546:6: ( (otherlv_4= RULE_ID ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1546:6: ( (otherlv_4= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1547:1: (otherlv_4= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1547:1: (otherlv_4= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1548:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassSetterRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleclassSetter3280); 

                    		newLeafNode(otherlv_4, grammarAccess.getClassSetterAccess().getValueRefEObjectCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1559:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1559:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleclassSetter3294); 

            	        	newLeafNode(otherlv_5, grammarAccess.getClassSetterAccess().getCommaKeyword_4_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1563:1: ( (otherlv_6= RULE_ID ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1564:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1564:1: (otherlv_6= RULE_ID )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1565:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getClassSetterRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleclassSetter3314); 

            	    		newLeafNode(otherlv_6, grammarAccess.getClassSetterAccess().getValueRefEObjectCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleclassSetter3328); 

                	newLeafNode(otherlv_7, grammarAccess.getClassSetterAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleclassSetter"


    // $ANTLR start "entryRuleclassSetters_def"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1588:1: entryRuleclassSetters_def returns [EObject current=null] : iv_ruleclassSetters_def= ruleclassSetters_def EOF ;
    public final EObject entryRuleclassSetters_def() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleclassSetters_def = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1589:2: (iv_ruleclassSetters_def= ruleclassSetters_def EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1590:2: iv_ruleclassSetters_def= ruleclassSetters_def EOF
            {
             newCompositeNode(grammarAccess.getClassSetters_defRule()); 
            pushFollow(FOLLOW_ruleclassSetters_def_in_entryRuleclassSetters_def3364);
            iv_ruleclassSetters_def=ruleclassSetters_def();

            state._fsp--;

             current =iv_ruleclassSetters_def; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclassSetters_def3374); 

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
    // $ANTLR end "entryRuleclassSetters_def"


    // $ANTLR start "ruleclassSetters_def"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1597:1: ruleclassSetters_def returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleclassSetters_def() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_par_3_0 = null;

        EObject lv_par_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1600:28: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1601:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1601:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1601:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_par_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleclassSetters_def3411); 

                	newLeafNode(otherlv_0, grammarAccess.getClassSetters_defAccess().getSetKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1605:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1606:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1606:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1607:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassSetters_defRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleclassSetters_def3431); 

            		newLeafNode(otherlv_1, grammarAccess.getClassSetters_defAccess().getMetafeatureEStructuralFeatureCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleclassSetters_def3443); 

                	newLeafNode(otherlv_2, grammarAccess.getClassSetters_defAccess().getColonEqualsSignKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1622:1: ( (lv_par_3_0= ruleParameter ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1623:1: (lv_par_3_0= ruleParameter )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1623:1: (lv_par_3_0= ruleParameter )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1624:3: lv_par_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getClassSetters_defAccess().getParParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleclassSetters_def3464);
            lv_par_3_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassSetters_defRule());
            	        }
                   		add(
                   			current, 
                   			"par",
                    		lv_par_3_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1640:2: (otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1640:4: otherlv_4= ',' ( (lv_par_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleclassSetters_def3477); 

            	        	newLeafNode(otherlv_4, grammarAccess.getClassSetters_defAccess().getCommaKeyword_4_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1644:1: ( (lv_par_5_0= ruleParameter ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1645:1: (lv_par_5_0= ruleParameter )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1645:1: (lv_par_5_0= ruleParameter )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1646:3: lv_par_5_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassSetters_defAccess().getParParameterParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleclassSetters_def3498);
            	    lv_par_5_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassSetters_defRule());
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
            	    break loop25;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleclassSetters_def3512); 

                	newLeafNode(otherlv_6, grammarAccess.getClassSetters_defAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleclassSetters_def"


    // $ANTLR start "entryRuleClassOp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1674:1: entryRuleClassOp returns [EObject current=null] : iv_ruleClassOp= ruleClassOp EOF ;
    public final EObject entryRuleClassOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassOp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1675:2: (iv_ruleClassOp= ruleClassOp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1676:2: iv_ruleClassOp= ruleClassOp EOF
            {
             newCompositeNode(grammarAccess.getClassOpRule()); 
            pushFollow(FOLLOW_ruleClassOp_in_entryRuleClassOp3548);
            iv_ruleClassOp=ruleClassOp();

            state._fsp--;

             current =iv_ruleClassOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOp3558); 

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
    // $ANTLR end "entryRuleClassOp"


    // $ANTLR start "ruleClassOp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1683:1: ruleClassOp returns [EObject current=null] : ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGECLASS ) ) | ( (lv_op_4_0= ruleADDCLASS ) ) | ( (lv_op_5_0= ruleDELETECLASS ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )* otherlv_10= '}' ) | otherlv_11= ';' ) ) | ( (lv_complex_12_0= ruleCallOperator ) ) ) ) ;
    public final EObject ruleClassOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_var_1_0 = null;

        EObject lv_op_3_0 = null;

        EObject lv_op_4_0 = null;

        EObject lv_op_5_0 = null;

        EObject lv_setters_7_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_references_9_0 = null;

        EObject lv_complex_12_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1686:28: ( ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGECLASS ) ) | ( (lv_op_4_0= ruleADDCLASS ) ) | ( (lv_op_5_0= ruleDELETECLASS ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )* otherlv_10= '}' ) | otherlv_11= ';' ) ) | ( (lv_complex_12_0= ruleCallOperator ) ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1687:1: ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGECLASS ) ) | ( (lv_op_4_0= ruleADDCLASS ) ) | ( (lv_op_5_0= ruleDELETECLASS ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )* otherlv_10= '}' ) | otherlv_11= ';' ) ) | ( (lv_complex_12_0= ruleCallOperator ) ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1687:1: ( (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGECLASS ) ) | ( (lv_op_4_0= ruleADDCLASS ) ) | ( (lv_op_5_0= ruleDELETECLASS ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )* otherlv_10= '}' ) | otherlv_11= ';' ) ) | ( (lv_complex_12_0= ruleCallOperator ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1687:2: (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGECLASS ) ) | ( (lv_op_4_0= ruleADDCLASS ) ) | ( (lv_op_5_0= ruleDELETECLASS ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )* otherlv_10= '}' ) | otherlv_11= ';' ) ) | ( (lv_complex_12_0= ruleCallOperator ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1687:2: (otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1687:4: otherlv_0= 'class' ( (lv_var_1_0= ruleClass ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleClassOp3596); 

                	newLeafNode(otherlv_0, grammarAccess.getClassOpAccess().getClassKeyword_0_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1691:1: ( (lv_var_1_0= ruleClass ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1692:1: (lv_var_1_0= ruleClass )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1692:1: (lv_var_1_0= ruleClass )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1693:3: lv_var_1_0= ruleClass
            {
             
            	        newCompositeNode(grammarAccess.getClassOpAccess().getVarClassParserRuleCall_0_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClass_in_ruleClassOp3617);
            lv_var_1_0=ruleClass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassOpRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_1_0, 
                    		"Class");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleClassOp3629); 

                	newLeafNode(otherlv_2, grammarAccess.getClassOpAccess().getEqualsSignKeyword_0_2());
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1713:2: ( ( ( ( (lv_op_3_0= ruleCHANGECLASS ) ) | ( (lv_op_4_0= ruleADDCLASS ) ) | ( (lv_op_5_0= ruleDELETECLASS ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )* otherlv_10= '}' ) | otherlv_11= ';' ) ) | ( (lv_complex_12_0= ruleCallOperator ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=26 && LA29_0<=28)) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1713:3: ( ( ( (lv_op_3_0= ruleCHANGECLASS ) ) | ( (lv_op_4_0= ruleADDCLASS ) ) | ( (lv_op_5_0= ruleDELETECLASS ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )* otherlv_10= '}' ) | otherlv_11= ';' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1713:3: ( ( ( (lv_op_3_0= ruleCHANGECLASS ) ) | ( (lv_op_4_0= ruleADDCLASS ) ) | ( (lv_op_5_0= ruleDELETECLASS ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )* otherlv_10= '}' ) | otherlv_11= ';' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1713:4: ( ( (lv_op_3_0= ruleCHANGECLASS ) ) | ( (lv_op_4_0= ruleADDCLASS ) ) | ( (lv_op_5_0= ruleDELETECLASS ) ) ) ( (otherlv_6= '{' ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )* otherlv_10= '}' ) | otherlv_11= ';' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1713:4: ( ( (lv_op_3_0= ruleCHANGECLASS ) ) | ( (lv_op_4_0= ruleADDCLASS ) ) | ( (lv_op_5_0= ruleDELETECLASS ) ) )
                    int alt26=3;
                    switch ( input.LA(1) ) {
                    case 26:
                        {
                        alt26=1;
                        }
                        break;
                    case 27:
                        {
                        alt26=2;
                        }
                        break;
                    case 28:
                        {
                        alt26=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1713:5: ( (lv_op_3_0= ruleCHANGECLASS ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1713:5: ( (lv_op_3_0= ruleCHANGECLASS ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1714:1: (lv_op_3_0= ruleCHANGECLASS )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1714:1: (lv_op_3_0= ruleCHANGECLASS )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1715:3: lv_op_3_0= ruleCHANGECLASS
                            {
                             
                            	        newCompositeNode(grammarAccess.getClassOpAccess().getOpCHANGECLASSParserRuleCall_1_0_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleCHANGECLASS_in_ruleClassOp3654);
                            lv_op_3_0=ruleCHANGECLASS();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClassOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_3_0, 
                                    		"CHANGECLASS");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1732:6: ( (lv_op_4_0= ruleADDCLASS ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1732:6: ( (lv_op_4_0= ruleADDCLASS ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1733:1: (lv_op_4_0= ruleADDCLASS )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1733:1: (lv_op_4_0= ruleADDCLASS )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1734:3: lv_op_4_0= ruleADDCLASS
                            {
                             
                            	        newCompositeNode(grammarAccess.getClassOpAccess().getOpADDCLASSParserRuleCall_1_0_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleADDCLASS_in_ruleClassOp3681);
                            lv_op_4_0=ruleADDCLASS();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClassOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_4_0, 
                                    		"ADDCLASS");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1751:6: ( (lv_op_5_0= ruleDELETECLASS ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1751:6: ( (lv_op_5_0= ruleDELETECLASS ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1752:1: (lv_op_5_0= ruleDELETECLASS )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1752:1: (lv_op_5_0= ruleDELETECLASS )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1753:3: lv_op_5_0= ruleDELETECLASS
                            {
                             
                            	        newCompositeNode(grammarAccess.getClassOpAccess().getOpDELETECLASSParserRuleCall_1_0_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDELETECLASS_in_ruleClassOp3708);
                            lv_op_5_0=ruleDELETECLASS();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClassOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_5_0, 
                                    		"DELETECLASS");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1769:3: ( (otherlv_6= '{' ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )* otherlv_10= '}' ) | otherlv_11= ';' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==12) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==17) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1769:4: (otherlv_6= '{' ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )* otherlv_10= '}' )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1769:4: (otherlv_6= '{' ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )* otherlv_10= '}' )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1769:6: otherlv_6= '{' ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )* otherlv_10= '}'
                            {
                            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleClassOp3723); 

                                	newLeafNode(otherlv_6, grammarAccess.getClassOpAccess().getLeftCurlyBracketKeyword_1_0_1_0_0());
                                
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1773:1: ( ( (lv_setters_7_0= ruleclassSetter ) ) | ( (lv_attributes_8_0= ruleAttributeOp ) ) | ( (lv_references_9_0= ruleReferenceOp ) ) )*
                            loop27:
                            do {
                                int alt27=4;
                                switch ( input.LA(1) ) {
                                case 14:
                                    {
                                    alt27=1;
                                    }
                                    break;
                                case 45:
                                    {
                                    alt27=2;
                                    }
                                    break;
                                case 55:
                                    {
                                    alt27=3;
                                    }
                                    break;

                                }

                                switch (alt27) {
                            	case 1 :
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1773:2: ( (lv_setters_7_0= ruleclassSetter ) )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1773:2: ( (lv_setters_7_0= ruleclassSetter ) )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1774:1: (lv_setters_7_0= ruleclassSetter )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1774:1: (lv_setters_7_0= ruleclassSetter )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1775:3: lv_setters_7_0= ruleclassSetter
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getClassOpAccess().getSettersClassSetterParserRuleCall_1_0_1_0_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleclassSetter_in_ruleClassOp3745);
                            	    lv_setters_7_0=ruleclassSetter();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getClassOpRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"setters",
                            	            		lv_setters_7_0, 
                            	            		"classSetter");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 2 :
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1792:6: ( (lv_attributes_8_0= ruleAttributeOp ) )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1792:6: ( (lv_attributes_8_0= ruleAttributeOp ) )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1793:1: (lv_attributes_8_0= ruleAttributeOp )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1793:1: (lv_attributes_8_0= ruleAttributeOp )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1794:3: lv_attributes_8_0= ruleAttributeOp
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getClassOpAccess().getAttributesAttributeOpParserRuleCall_1_0_1_0_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleAttributeOp_in_ruleClassOp3772);
                            	    lv_attributes_8_0=ruleAttributeOp();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getClassOpRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"attributes",
                            	            		lv_attributes_8_0, 
                            	            		"AttributeOp");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 3 :
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1811:6: ( (lv_references_9_0= ruleReferenceOp ) )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1811:6: ( (lv_references_9_0= ruleReferenceOp ) )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1812:1: (lv_references_9_0= ruleReferenceOp )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1812:1: (lv_references_9_0= ruleReferenceOp )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1813:3: lv_references_9_0= ruleReferenceOp
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getClassOpAccess().getReferencesReferenceOpParserRuleCall_1_0_1_0_1_2_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleReferenceOp_in_ruleClassOp3799);
                            	    lv_references_9_0=ruleReferenceOp();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getClassOpRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"references",
                            	            		lv_references_9_0, 
                            	            		"ReferenceOp");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleClassOp3813); 

                                	newLeafNode(otherlv_10, grammarAccess.getClassOpAccess().getRightCurlyBracketKeyword_1_0_1_0_2());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1834:7: otherlv_11= ';'
                            {
                            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleClassOp3832); 

                                	newLeafNode(otherlv_11, grammarAccess.getClassOpAccess().getSemicolonKeyword_1_0_1_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1839:6: ( (lv_complex_12_0= ruleCallOperator ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1839:6: ( (lv_complex_12_0= ruleCallOperator ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1840:1: (lv_complex_12_0= ruleCallOperator )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1840:1: (lv_complex_12_0= ruleCallOperator )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1841:3: lv_complex_12_0= ruleCallOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassOpAccess().getComplexCallOperatorParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCallOperator_in_ruleClassOp3861);
                    lv_complex_12_0=ruleCallOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassOpRule());
                    	        }
                           		add(
                           			current, 
                           			"complex",
                            		lv_complex_12_0, 
                            		"CallOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleClassOp"


    // $ANTLR start "entryRuleClass"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1865:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1866:2: (iv_ruleClass= ruleClass EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1867:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass3898);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass3908); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1874:1: ruleClass returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1877:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1878:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1878:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1878:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1878:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1879:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClassAccess().getClassAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1884:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1885:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1885:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1886:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass3959); 

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


    // $ANTLR start "entryRuleClassifier"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1910:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1911:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1912:2: iv_ruleClassifier= ruleClassifier EOF
            {
             newCompositeNode(grammarAccess.getClassifierRule()); 
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier4000);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;

             current =iv_ruleClassifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier4010); 

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
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1919:1: ruleClassifier returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1922:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1923:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1923:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1923:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1923:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1924:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClassifierAccess().getClassifierAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1929:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1930:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1930:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1931:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier4061); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassifierAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassifierRule());
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
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleCHANGEATTRIBUTE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1957:1: entryRuleCHANGEATTRIBUTE returns [EObject current=null] : iv_ruleCHANGEATTRIBUTE= ruleCHANGEATTRIBUTE EOF ;
    public final EObject entryRuleCHANGEATTRIBUTE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHANGEATTRIBUTE = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1958:2: (iv_ruleCHANGEATTRIBUTE= ruleCHANGEATTRIBUTE EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1959:2: iv_ruleCHANGEATTRIBUTE= ruleCHANGEATTRIBUTE EOF
            {
             newCompositeNode(grammarAccess.getCHANGEATTRIBUTERule()); 
            pushFollow(FOLLOW_ruleCHANGEATTRIBUTE_in_entryRuleCHANGEATTRIBUTE4104);
            iv_ruleCHANGEATTRIBUTE=ruleCHANGEATTRIBUTE();

            state._fsp--;

             current =iv_ruleCHANGEATTRIBUTE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCHANGEATTRIBUTE4114); 

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
    // $ANTLR end "entryRuleCHANGEATTRIBUTE"


    // $ANTLR start "ruleCHANGEATTRIBUTE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1966:1: ruleCHANGEATTRIBUTE returns [EObject current=null] : (otherlv_0= 'changeAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleCHANGEATTRIBUTE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1969:28: ( (otherlv_0= 'changeAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1970:1: (otherlv_0= 'changeAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1970:1: (otherlv_0= 'changeAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1970:3: otherlv_0= 'changeAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleCHANGEATTRIBUTE4151); 

                	newLeafNode(otherlv_0, grammarAccess.getCHANGEATTRIBUTEAccess().getChangeAttributeKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1974:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1975:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1975:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1976:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCHANGEATTRIBUTERule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCHANGEATTRIBUTE4171); 

            		newLeafNode(otherlv_1, grammarAccess.getCHANGEATTRIBUTEAccess().getRefAttrEAttributeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCHANGEATTRIBUTE4183); 

                	newLeafNode(otherlv_2, grammarAccess.getCHANGEATTRIBUTEAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleCHANGEATTRIBUTE"


    // $ANTLR start "entryRuleADDATTRIBUTE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:1999:1: entryRuleADDATTRIBUTE returns [EObject current=null] : iv_ruleADDATTRIBUTE= ruleADDATTRIBUTE EOF ;
    public final EObject entryRuleADDATTRIBUTE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADDATTRIBUTE = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2000:2: (iv_ruleADDATTRIBUTE= ruleADDATTRIBUTE EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2001:2: iv_ruleADDATTRIBUTE= ruleADDATTRIBUTE EOF
            {
             newCompositeNode(grammarAccess.getADDATTRIBUTERule()); 
            pushFollow(FOLLOW_ruleADDATTRIBUTE_in_entryRuleADDATTRIBUTE4219);
            iv_ruleADDATTRIBUTE=ruleADDATTRIBUTE();

            state._fsp--;

             current =iv_ruleADDATTRIBUTE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleADDATTRIBUTE4229); 

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
    // $ANTLR end "entryRuleADDATTRIBUTE"


    // $ANTLR start "ruleADDATTRIBUTE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2008:1: ruleADDATTRIBUTE returns [EObject current=null] : (otherlv_0= 'addAttribute' otherlv_1= '(' ( (lv_new_2_0= ruleEString ) ) otherlv_3= ')' ) ;
    public final EObject ruleADDATTRIBUTE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_new_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2011:28: ( (otherlv_0= 'addAttribute' otherlv_1= '(' ( (lv_new_2_0= ruleEString ) ) otherlv_3= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2012:1: (otherlv_0= 'addAttribute' otherlv_1= '(' ( (lv_new_2_0= ruleEString ) ) otherlv_3= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2012:1: (otherlv_0= 'addAttribute' otherlv_1= '(' ( (lv_new_2_0= ruleEString ) ) otherlv_3= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2012:3: otherlv_0= 'addAttribute' otherlv_1= '(' ( (lv_new_2_0= ruleEString ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleADDATTRIBUTE4266); 

                	newLeafNode(otherlv_0, grammarAccess.getADDATTRIBUTEAccess().getAddAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleADDATTRIBUTE4278); 

                	newLeafNode(otherlv_1, grammarAccess.getADDATTRIBUTEAccess().getLeftParenthesisKeyword_1());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2020:1: ( (lv_new_2_0= ruleEString ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2021:1: (lv_new_2_0= ruleEString )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2021:1: (lv_new_2_0= ruleEString )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2022:3: lv_new_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getADDATTRIBUTEAccess().getNewEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleADDATTRIBUTE4299);
            lv_new_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getADDATTRIBUTERule());
            	        }
                   		set(
                   			current, 
                   			"new",
                    		lv_new_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleADDATTRIBUTE4311); 

                	newLeafNode(otherlv_3, grammarAccess.getADDATTRIBUTEAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleADDATTRIBUTE"


    // $ANTLR start "entryRuleDELETEATTRIBUTE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2050:1: entryRuleDELETEATTRIBUTE returns [EObject current=null] : iv_ruleDELETEATTRIBUTE= ruleDELETEATTRIBUTE EOF ;
    public final EObject entryRuleDELETEATTRIBUTE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDELETEATTRIBUTE = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2051:2: (iv_ruleDELETEATTRIBUTE= ruleDELETEATTRIBUTE EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2052:2: iv_ruleDELETEATTRIBUTE= ruleDELETEATTRIBUTE EOF
            {
             newCompositeNode(grammarAccess.getDELETEATTRIBUTERule()); 
            pushFollow(FOLLOW_ruleDELETEATTRIBUTE_in_entryRuleDELETEATTRIBUTE4347);
            iv_ruleDELETEATTRIBUTE=ruleDELETEATTRIBUTE();

            state._fsp--;

             current =iv_ruleDELETEATTRIBUTE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDELETEATTRIBUTE4357); 

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
    // $ANTLR end "entryRuleDELETEATTRIBUTE"


    // $ANTLR start "ruleDELETEATTRIBUTE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2059:1: ruleDELETEATTRIBUTE returns [EObject current=null] : (otherlv_0= 'deleteAttribute(' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDELETEATTRIBUTE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2062:28: ( (otherlv_0= 'deleteAttribute(' ( (otherlv_1= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2063:1: (otherlv_0= 'deleteAttribute(' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2063:1: (otherlv_0= 'deleteAttribute(' ( (otherlv_1= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2063:3: otherlv_0= 'deleteAttribute(' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleDELETEATTRIBUTE4394); 

                	newLeafNode(otherlv_0, grammarAccess.getDELETEATTRIBUTEAccess().getDeleteAttributeKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2067:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2068:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2068:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2069:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDELETEATTRIBUTERule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDELETEATTRIBUTE4414); 

            		newLeafNode(otherlv_1, grammarAccess.getDELETEATTRIBUTEAccess().getRefAttrEAttributeCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleDELETEATTRIBUTE"


    // $ANTLR start "entryRuleRENAMEATTRIBUTE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2088:1: entryRuleRENAMEATTRIBUTE returns [EObject current=null] : iv_ruleRENAMEATTRIBUTE= ruleRENAMEATTRIBUTE EOF ;
    public final EObject entryRuleRENAMEATTRIBUTE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRENAMEATTRIBUTE = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2089:2: (iv_ruleRENAMEATTRIBUTE= ruleRENAMEATTRIBUTE EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2090:2: iv_ruleRENAMEATTRIBUTE= ruleRENAMEATTRIBUTE EOF
            {
             newCompositeNode(grammarAccess.getRENAMEATTRIBUTERule()); 
            pushFollow(FOLLOW_ruleRENAMEATTRIBUTE_in_entryRuleRENAMEATTRIBUTE4450);
            iv_ruleRENAMEATTRIBUTE=ruleRENAMEATTRIBUTE();

            state._fsp--;

             current =iv_ruleRENAMEATTRIBUTE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRENAMEATTRIBUTE4460); 

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
    // $ANTLR end "entryRuleRENAMEATTRIBUTE"


    // $ANTLR start "ruleRENAMEATTRIBUTE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2097:1: ruleRENAMEATTRIBUTE returns [EObject current=null] : (otherlv_0= 'renameAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_newName_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleRENAMEATTRIBUTE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_newName_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2100:28: ( (otherlv_0= 'renameAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_newName_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2101:1: (otherlv_0= 'renameAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_newName_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2101:1: (otherlv_0= 'renameAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_newName_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2101:3: otherlv_0= 'renameAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_newName_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleRENAMEATTRIBUTE4497); 

                	newLeafNode(otherlv_0, grammarAccess.getRENAMEATTRIBUTEAccess().getRenameAttributeKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2105:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2106:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2106:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2107:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRENAMEATTRIBUTERule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRENAMEATTRIBUTE4517); 

            		newLeafNode(otherlv_1, grammarAccess.getRENAMEATTRIBUTEAccess().getRefAttrEAttributeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRENAMEATTRIBUTE4529); 

                	newLeafNode(otherlv_2, grammarAccess.getRENAMEATTRIBUTEAccess().getCommaKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2122:1: ( (lv_newName_3_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2123:1: (lv_newName_3_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2123:1: (lv_newName_3_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2124:3: lv_newName_3_0= RULE_STRING
            {
            lv_newName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRENAMEATTRIBUTE4546); 

            			newLeafNode(lv_newName_3_0, grammarAccess.getRENAMEATTRIBUTEAccess().getNewNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRENAMEATTRIBUTERule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"newName",
                    		lv_newName_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleRENAMEATTRIBUTE4563); 

                	newLeafNode(otherlv_4, grammarAccess.getRENAMEATTRIBUTEAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleRENAMEATTRIBUTE"


    // $ANTLR start "entryRuleMOVEATTRIBUTE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2152:1: entryRuleMOVEATTRIBUTE returns [EObject current=null] : iv_ruleMOVEATTRIBUTE= ruleMOVEATTRIBUTE EOF ;
    public final EObject entryRuleMOVEATTRIBUTE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOVEATTRIBUTE = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2153:2: (iv_ruleMOVEATTRIBUTE= ruleMOVEATTRIBUTE EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2154:2: iv_ruleMOVEATTRIBUTE= ruleMOVEATTRIBUTE EOF
            {
             newCompositeNode(grammarAccess.getMOVEATTRIBUTERule()); 
            pushFollow(FOLLOW_ruleMOVEATTRIBUTE_in_entryRuleMOVEATTRIBUTE4599);
            iv_ruleMOVEATTRIBUTE=ruleMOVEATTRIBUTE();

            state._fsp--;

             current =iv_ruleMOVEATTRIBUTE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMOVEATTRIBUTE4609); 

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
    // $ANTLR end "entryRuleMOVEATTRIBUTE"


    // $ANTLR start "ruleMOVEATTRIBUTE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2161:1: ruleMOVEATTRIBUTE returns [EObject current=null] : (otherlv_0= 'moveAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleMOVEATTRIBUTE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2164:28: ( (otherlv_0= 'moveAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2165:1: (otherlv_0= 'moveAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2165:1: (otherlv_0= 'moveAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2165:3: otherlv_0= 'moveAttribute(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleMOVEATTRIBUTE4646); 

                	newLeafNode(otherlv_0, grammarAccess.getMOVEATTRIBUTEAccess().getMoveAttributeKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2169:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2170:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2170:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2171:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMOVEATTRIBUTERule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMOVEATTRIBUTE4666); 

            		newLeafNode(otherlv_1, grammarAccess.getMOVEATTRIBUTEAccess().getRefAttrEAttributeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleMOVEATTRIBUTE4678); 

                	newLeafNode(otherlv_2, grammarAccess.getMOVEATTRIBUTEAccess().getCommaKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2186:1: ( (otherlv_3= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2187:1: (otherlv_3= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2187:1: (otherlv_3= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2188:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMOVEATTRIBUTERule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMOVEATTRIBUTE4698); 

            		newLeafNode(otherlv_3, grammarAccess.getMOVEATTRIBUTEAccess().getDstEClassCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleMOVEATTRIBUTE4710); 

                	newLeafNode(otherlv_4, grammarAccess.getMOVEATTRIBUTEAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleMOVEATTRIBUTE"


    // $ANTLR start "entryRuleFeatureSetters"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2211:1: entryRuleFeatureSetters returns [EObject current=null] : iv_ruleFeatureSetters= ruleFeatureSetters EOF ;
    public final EObject entryRuleFeatureSetters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureSetters = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2212:2: (iv_ruleFeatureSetters= ruleFeatureSetters EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2213:2: iv_ruleFeatureSetters= ruleFeatureSetters EOF
            {
             newCompositeNode(grammarAccess.getFeatureSettersRule()); 
            pushFollow(FOLLOW_ruleFeatureSetters_in_entryRuleFeatureSetters4746);
            iv_ruleFeatureSetters=ruleFeatureSetters();

            state._fsp--;

             current =iv_ruleFeatureSetters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureSetters4756); 

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
    // $ANTLR end "entryRuleFeatureSetters"


    // $ANTLR start "ruleFeatureSetters"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2220:1: ruleFeatureSetters returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_valueEString_3_0= RULE_STRING ) ) | ( (lv_valueEInt_4_0= ruleEInt ) ) | ( (lv_valueEBool_5_0= ruleEBoolean ) ) | ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )? ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) ;
    public final EObject ruleFeatureSetters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_valueEString_3_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_valueEInt_4_0 = null;

        AntlrDatatypeRuleToken lv_valueEBool_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2223:28: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_valueEString_3_0= RULE_STRING ) ) | ( (lv_valueEInt_4_0= ruleEInt ) ) | ( (lv_valueEBool_5_0= ruleEBoolean ) ) | ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )? ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2224:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_valueEString_3_0= RULE_STRING ) ) | ( (lv_valueEInt_4_0= ruleEInt ) ) | ( (lv_valueEBool_5_0= ruleEBoolean ) ) | ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )? ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2224:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_valueEString_3_0= RULE_STRING ) ) | ( (lv_valueEInt_4_0= ruleEInt ) ) | ( (lv_valueEBool_5_0= ruleEBoolean ) ) | ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )? ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2224:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_valueEString_3_0= RULE_STRING ) ) | ( (lv_valueEInt_4_0= ruleEInt ) ) | ( (lv_valueEBool_5_0= ruleEBoolean ) ) | ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )? ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleFeatureSetters4793); 

                	newLeafNode(otherlv_0, grammarAccess.getFeatureSettersAccess().getSetKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2228:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2229:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2229:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2230:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureSettersRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureSetters4813); 

            		newLeafNode(otherlv_1, grammarAccess.getFeatureSettersAccess().getMetafeatureEStructuralFeatureCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleFeatureSetters4825); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureSettersAccess().getColonEqualsSignKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2245:1: ( ( (lv_valueEString_3_0= RULE_STRING ) ) | ( (lv_valueEInt_4_0= ruleEInt ) ) | ( (lv_valueEBool_5_0= ruleEBoolean ) ) | ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )? ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt31=1;
                }
                break;
            case RULE_INT:
            case 58:
                {
                alt31=2;
                }
                break;
            case 56:
            case 57:
                {
                alt31=3;
                }
                break;
            case RULE_ID:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2245:2: ( (lv_valueEString_3_0= RULE_STRING ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2245:2: ( (lv_valueEString_3_0= RULE_STRING ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2246:1: (lv_valueEString_3_0= RULE_STRING )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2246:1: (lv_valueEString_3_0= RULE_STRING )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2247:3: lv_valueEString_3_0= RULE_STRING
                    {
                    lv_valueEString_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureSetters4843); 

                    			newLeafNode(lv_valueEString_3_0, grammarAccess.getFeatureSettersAccess().getValueEStringSTRINGTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureSettersRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueEString",
                            		lv_valueEString_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2264:6: ( (lv_valueEInt_4_0= ruleEInt ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2264:6: ( (lv_valueEInt_4_0= ruleEInt ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2265:1: (lv_valueEInt_4_0= ruleEInt )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2265:1: (lv_valueEInt_4_0= ruleEInt )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2266:3: lv_valueEInt_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureSettersAccess().getValueEIntEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEInt_in_ruleFeatureSetters4875);
                    lv_valueEInt_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureSettersRule());
                    	        }
                           		set(
                           			current, 
                           			"valueEInt",
                            		lv_valueEInt_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2283:6: ( (lv_valueEBool_5_0= ruleEBoolean ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2283:6: ( (lv_valueEBool_5_0= ruleEBoolean ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2284:1: (lv_valueEBool_5_0= ruleEBoolean )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2284:1: (lv_valueEBool_5_0= ruleEBoolean )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2285:3: lv_valueEBool_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureSettersAccess().getValueEBoolEBooleanParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEBoolean_in_ruleFeatureSetters4902);
                    lv_valueEBool_5_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureSettersRule());
                    	        }
                           		set(
                           			current, 
                           			"valueEBool",
                            		lv_valueEBool_5_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2302:6: ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )? )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2302:6: ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )? )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2302:7: ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )?
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2302:7: ( (otherlv_6= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2303:1: (otherlv_6= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2303:1: (otherlv_6= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2304:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureSettersRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureSetters4929); 

                    		newLeafNode(otherlv_6, grammarAccess.getFeatureSettersAccess().getValueRefEObjectCrossReference_3_3_0_0()); 
                    	

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2315:2: (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==44) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2315:4: otherlv_7= '.' ( (otherlv_8= RULE_ID ) )
                            {
                            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleFeatureSetters4942); 

                                	newLeafNode(otherlv_7, grammarAccess.getFeatureSettersAccess().getFullStopKeyword_3_3_1_0());
                                
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2319:1: ( (otherlv_8= RULE_ID ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2320:1: (otherlv_8= RULE_ID )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2320:1: (otherlv_8= RULE_ID )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2321:3: otherlv_8= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFeatureSettersRule());
                            	        }
                                    
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureSetters4962); 

                            		newLeafNode(otherlv_8, grammarAccess.getFeatureSettersAccess().getValueFeatureEStructuralFeatureCrossReference_3_3_1_1_0()); 
                            	

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2332:6: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==16) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2332:8: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleFeatureSetters4979); 

            	        	newLeafNode(otherlv_9, grammarAccess.getFeatureSettersAccess().getCommaKeyword_4_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2336:1: ( (otherlv_10= RULE_ID ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2337:1: (otherlv_10= RULE_ID )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2337:1: (otherlv_10= RULE_ID )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2338:3: otherlv_10= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFeatureSettersRule());
            	    	        }
            	            
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureSetters4999); 

            	    		newLeafNode(otherlv_10, grammarAccess.getFeatureSettersAccess().getValueRefEObjectCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleFeatureSetters5013); 

                	newLeafNode(otherlv_11, grammarAccess.getFeatureSettersAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleFeatureSetters"


    // $ANTLR start "entryRuleAttributeOp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2361:1: entryRuleAttributeOp returns [EObject current=null] : iv_ruleAttributeOp= ruleAttributeOp EOF ;
    public final EObject entryRuleAttributeOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeOp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2362:2: (iv_ruleAttributeOp= ruleAttributeOp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2363:2: iv_ruleAttributeOp= ruleAttributeOp EOF
            {
             newCompositeNode(grammarAccess.getAttributeOpRule()); 
            pushFollow(FOLLOW_ruleAttributeOp_in_entryRuleAttributeOp5049);
            iv_ruleAttributeOp=ruleAttributeOp();

            state._fsp--;

             current =iv_ruleAttributeOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeOp5059); 

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
    // $ANTLR end "entryRuleAttributeOp"


    // $ANTLR start "ruleAttributeOp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2370:1: ruleAttributeOp returns [EObject current=null] : ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGEATTRIBUTE ) ) | ( (lv_op_4_0= ruleADDATTRIBUTE ) ) | ( (lv_op_5_0= ruleDELETEATTRIBUTE ) ) | ( (lv_op_6_0= ruleRENAMEATTRIBUTE ) ) | ( (lv_op_7_0= ruleMOVEATTRIBUTE ) ) ) ( (otherlv_8= '{' ( (lv_setters_9_0= ruleFeatureSetters ) )* otherlv_10= '}' ) | otherlv_11= ';' ) ) | ( (lv_complex_12_0= ruleCallOperator ) ) ) ) ;
    public final EObject ruleAttributeOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_var_1_0 = null;

        EObject lv_op_3_0 = null;

        EObject lv_op_4_0 = null;

        EObject lv_op_5_0 = null;

        EObject lv_op_6_0 = null;

        EObject lv_op_7_0 = null;

        EObject lv_setters_9_0 = null;

        EObject lv_complex_12_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2373:28: ( ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGEATTRIBUTE ) ) | ( (lv_op_4_0= ruleADDATTRIBUTE ) ) | ( (lv_op_5_0= ruleDELETEATTRIBUTE ) ) | ( (lv_op_6_0= ruleRENAMEATTRIBUTE ) ) | ( (lv_op_7_0= ruleMOVEATTRIBUTE ) ) ) ( (otherlv_8= '{' ( (lv_setters_9_0= ruleFeatureSetters ) )* otherlv_10= '}' ) | otherlv_11= ';' ) ) | ( (lv_complex_12_0= ruleCallOperator ) ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2374:1: ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGEATTRIBUTE ) ) | ( (lv_op_4_0= ruleADDATTRIBUTE ) ) | ( (lv_op_5_0= ruleDELETEATTRIBUTE ) ) | ( (lv_op_6_0= ruleRENAMEATTRIBUTE ) ) | ( (lv_op_7_0= ruleMOVEATTRIBUTE ) ) ) ( (otherlv_8= '{' ( (lv_setters_9_0= ruleFeatureSetters ) )* otherlv_10= '}' ) | otherlv_11= ';' ) ) | ( (lv_complex_12_0= ruleCallOperator ) ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2374:1: ( (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGEATTRIBUTE ) ) | ( (lv_op_4_0= ruleADDATTRIBUTE ) ) | ( (lv_op_5_0= ruleDELETEATTRIBUTE ) ) | ( (lv_op_6_0= ruleRENAMEATTRIBUTE ) ) | ( (lv_op_7_0= ruleMOVEATTRIBUTE ) ) ) ( (otherlv_8= '{' ( (lv_setters_9_0= ruleFeatureSetters ) )* otherlv_10= '}' ) | otherlv_11= ';' ) ) | ( (lv_complex_12_0= ruleCallOperator ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2374:2: (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' ) ( ( ( ( (lv_op_3_0= ruleCHANGEATTRIBUTE ) ) | ( (lv_op_4_0= ruleADDATTRIBUTE ) ) | ( (lv_op_5_0= ruleDELETEATTRIBUTE ) ) | ( (lv_op_6_0= ruleRENAMEATTRIBUTE ) ) | ( (lv_op_7_0= ruleMOVEATTRIBUTE ) ) ) ( (otherlv_8= '{' ( (lv_setters_9_0= ruleFeatureSetters ) )* otherlv_10= '}' ) | otherlv_11= ';' ) ) | ( (lv_complex_12_0= ruleCallOperator ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2374:2: (otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2374:4: otherlv_0= 'attribute' ( (lv_var_1_0= ruleAttribute ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleAttributeOp5097); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeOpAccess().getAttributeKeyword_0_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2378:1: ( (lv_var_1_0= ruleAttribute ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2379:1: (lv_var_1_0= ruleAttribute )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2379:1: (lv_var_1_0= ruleAttribute )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2380:3: lv_var_1_0= ruleAttribute
            {
             
            	        newCompositeNode(grammarAccess.getAttributeOpAccess().getVarAttributeParserRuleCall_0_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttribute_in_ruleAttributeOp5118);
            lv_var_1_0=ruleAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeOpRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_1_0, 
                    		"Attribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAttributeOp5130); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeOpAccess().getEqualsSignKeyword_0_2());
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2400:2: ( ( ( ( (lv_op_3_0= ruleCHANGEATTRIBUTE ) ) | ( (lv_op_4_0= ruleADDATTRIBUTE ) ) | ( (lv_op_5_0= ruleDELETEATTRIBUTE ) ) | ( (lv_op_6_0= ruleRENAMEATTRIBUTE ) ) | ( (lv_op_7_0= ruleMOVEATTRIBUTE ) ) ) ( (otherlv_8= '{' ( (lv_setters_9_0= ruleFeatureSetters ) )* otherlv_10= '}' ) | otherlv_11= ';' ) ) | ( (lv_complex_12_0= ruleCallOperator ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30||LA36_0==32||(LA36_0>=34 && LA36_0<=35)||LA36_0==37) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2400:3: ( ( ( (lv_op_3_0= ruleCHANGEATTRIBUTE ) ) | ( (lv_op_4_0= ruleADDATTRIBUTE ) ) | ( (lv_op_5_0= ruleDELETEATTRIBUTE ) ) | ( (lv_op_6_0= ruleRENAMEATTRIBUTE ) ) | ( (lv_op_7_0= ruleMOVEATTRIBUTE ) ) ) ( (otherlv_8= '{' ( (lv_setters_9_0= ruleFeatureSetters ) )* otherlv_10= '}' ) | otherlv_11= ';' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2400:3: ( ( ( (lv_op_3_0= ruleCHANGEATTRIBUTE ) ) | ( (lv_op_4_0= ruleADDATTRIBUTE ) ) | ( (lv_op_5_0= ruleDELETEATTRIBUTE ) ) | ( (lv_op_6_0= ruleRENAMEATTRIBUTE ) ) | ( (lv_op_7_0= ruleMOVEATTRIBUTE ) ) ) ( (otherlv_8= '{' ( (lv_setters_9_0= ruleFeatureSetters ) )* otherlv_10= '}' ) | otherlv_11= ';' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2400:4: ( ( (lv_op_3_0= ruleCHANGEATTRIBUTE ) ) | ( (lv_op_4_0= ruleADDATTRIBUTE ) ) | ( (lv_op_5_0= ruleDELETEATTRIBUTE ) ) | ( (lv_op_6_0= ruleRENAMEATTRIBUTE ) ) | ( (lv_op_7_0= ruleMOVEATTRIBUTE ) ) ) ( (otherlv_8= '{' ( (lv_setters_9_0= ruleFeatureSetters ) )* otherlv_10= '}' ) | otherlv_11= ';' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2400:4: ( ( (lv_op_3_0= ruleCHANGEATTRIBUTE ) ) | ( (lv_op_4_0= ruleADDATTRIBUTE ) ) | ( (lv_op_5_0= ruleDELETEATTRIBUTE ) ) | ( (lv_op_6_0= ruleRENAMEATTRIBUTE ) ) | ( (lv_op_7_0= ruleMOVEATTRIBUTE ) ) )
                    int alt33=5;
                    switch ( input.LA(1) ) {
                    case 30:
                        {
                        alt33=1;
                        }
                        break;
                    case 32:
                        {
                        alt33=2;
                        }
                        break;
                    case 34:
                        {
                        alt33=3;
                        }
                        break;
                    case 35:
                        {
                        alt33=4;
                        }
                        break;
                    case 37:
                        {
                        alt33=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }

                    switch (alt33) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2400:5: ( (lv_op_3_0= ruleCHANGEATTRIBUTE ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2400:5: ( (lv_op_3_0= ruleCHANGEATTRIBUTE ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2401:1: (lv_op_3_0= ruleCHANGEATTRIBUTE )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2401:1: (lv_op_3_0= ruleCHANGEATTRIBUTE )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2402:3: lv_op_3_0= ruleCHANGEATTRIBUTE
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeOpAccess().getOpCHANGEATTRIBUTEParserRuleCall_1_0_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleCHANGEATTRIBUTE_in_ruleAttributeOp5155);
                            lv_op_3_0=ruleCHANGEATTRIBUTE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAttributeOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_3_0, 
                                    		"CHANGEATTRIBUTE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2419:6: ( (lv_op_4_0= ruleADDATTRIBUTE ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2419:6: ( (lv_op_4_0= ruleADDATTRIBUTE ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2420:1: (lv_op_4_0= ruleADDATTRIBUTE )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2420:1: (lv_op_4_0= ruleADDATTRIBUTE )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2421:3: lv_op_4_0= ruleADDATTRIBUTE
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeOpAccess().getOpADDATTRIBUTEParserRuleCall_1_0_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleADDATTRIBUTE_in_ruleAttributeOp5182);
                            lv_op_4_0=ruleADDATTRIBUTE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAttributeOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_4_0, 
                                    		"ADDATTRIBUTE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2438:6: ( (lv_op_5_0= ruleDELETEATTRIBUTE ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2438:6: ( (lv_op_5_0= ruleDELETEATTRIBUTE ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2439:1: (lv_op_5_0= ruleDELETEATTRIBUTE )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2439:1: (lv_op_5_0= ruleDELETEATTRIBUTE )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2440:3: lv_op_5_0= ruleDELETEATTRIBUTE
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeOpAccess().getOpDELETEATTRIBUTEParserRuleCall_1_0_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDELETEATTRIBUTE_in_ruleAttributeOp5209);
                            lv_op_5_0=ruleDELETEATTRIBUTE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAttributeOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_5_0, 
                                    		"DELETEATTRIBUTE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2457:6: ( (lv_op_6_0= ruleRENAMEATTRIBUTE ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2457:6: ( (lv_op_6_0= ruleRENAMEATTRIBUTE ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2458:1: (lv_op_6_0= ruleRENAMEATTRIBUTE )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2458:1: (lv_op_6_0= ruleRENAMEATTRIBUTE )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2459:3: lv_op_6_0= ruleRENAMEATTRIBUTE
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeOpAccess().getOpRENAMEATTRIBUTEParserRuleCall_1_0_0_3_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRENAMEATTRIBUTE_in_ruleAttributeOp5236);
                            lv_op_6_0=ruleRENAMEATTRIBUTE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAttributeOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_6_0, 
                                    		"RENAMEATTRIBUTE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2476:6: ( (lv_op_7_0= ruleMOVEATTRIBUTE ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2476:6: ( (lv_op_7_0= ruleMOVEATTRIBUTE ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2477:1: (lv_op_7_0= ruleMOVEATTRIBUTE )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2477:1: (lv_op_7_0= ruleMOVEATTRIBUTE )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2478:3: lv_op_7_0= ruleMOVEATTRIBUTE
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeOpAccess().getOpMOVEATTRIBUTEParserRuleCall_1_0_0_4_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMOVEATTRIBUTE_in_ruleAttributeOp5263);
                            lv_op_7_0=ruleMOVEATTRIBUTE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAttributeOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_7_0, 
                                    		"MOVEATTRIBUTE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2494:3: ( (otherlv_8= '{' ( (lv_setters_9_0= ruleFeatureSetters ) )* otherlv_10= '}' ) | otherlv_11= ';' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==12) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==17) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2494:4: (otherlv_8= '{' ( (lv_setters_9_0= ruleFeatureSetters ) )* otherlv_10= '}' )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2494:4: (otherlv_8= '{' ( (lv_setters_9_0= ruleFeatureSetters ) )* otherlv_10= '}' )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2494:6: otherlv_8= '{' ( (lv_setters_9_0= ruleFeatureSetters ) )* otherlv_10= '}'
                            {
                            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleAttributeOp5278); 

                                	newLeafNode(otherlv_8, grammarAccess.getAttributeOpAccess().getLeftCurlyBracketKeyword_1_0_1_0_0());
                                
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2498:1: ( (lv_setters_9_0= ruleFeatureSetters ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==14) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2499:1: (lv_setters_9_0= ruleFeatureSetters )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2499:1: (lv_setters_9_0= ruleFeatureSetters )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2500:3: lv_setters_9_0= ruleFeatureSetters
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getAttributeOpAccess().getSettersFeatureSettersParserRuleCall_1_0_1_0_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleFeatureSetters_in_ruleAttributeOp5299);
                            	    lv_setters_9_0=ruleFeatureSetters();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getAttributeOpRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"setters",
                            	            		lv_setters_9_0, 
                            	            		"FeatureSetters");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleAttributeOp5312); 

                                	newLeafNode(otherlv_10, grammarAccess.getAttributeOpAccess().getRightCurlyBracketKeyword_1_0_1_0_2());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2521:7: otherlv_11= ';'
                            {
                            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleAttributeOp5331); 

                                	newLeafNode(otherlv_11, grammarAccess.getAttributeOpAccess().getSemicolonKeyword_1_0_1_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2526:6: ( (lv_complex_12_0= ruleCallOperator ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2526:6: ( (lv_complex_12_0= ruleCallOperator ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2527:1: (lv_complex_12_0= ruleCallOperator )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2527:1: (lv_complex_12_0= ruleCallOperator )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2528:3: lv_complex_12_0= ruleCallOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeOpAccess().getComplexCallOperatorParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCallOperator_in_ruleAttributeOp5360);
                    lv_complex_12_0=ruleCallOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeOpRule());
                    	        }
                           		add(
                           			current, 
                           			"complex",
                            		lv_complex_12_0, 
                            		"CallOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleAttributeOp"


    // $ANTLR start "entryRuleAttribute"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2552:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2553:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2554:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute5397);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute5407); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2561:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2564:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2565:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2565:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2565:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2565:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2566:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeAccess().getAttributeAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2571:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2572:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2572:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2573:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute5458); 

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


    // $ANTLR start "entryRuleCHANGEREFERENCE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2597:1: entryRuleCHANGEREFERENCE returns [EObject current=null] : iv_ruleCHANGEREFERENCE= ruleCHANGEREFERENCE EOF ;
    public final EObject entryRuleCHANGEREFERENCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHANGEREFERENCE = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2598:2: (iv_ruleCHANGEREFERENCE= ruleCHANGEREFERENCE EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2599:2: iv_ruleCHANGEREFERENCE= ruleCHANGEREFERENCE EOF
            {
             newCompositeNode(grammarAccess.getCHANGEREFERENCERule()); 
            pushFollow(FOLLOW_ruleCHANGEREFERENCE_in_entryRuleCHANGEREFERENCE5499);
            iv_ruleCHANGEREFERENCE=ruleCHANGEREFERENCE();

            state._fsp--;

             current =iv_ruleCHANGEREFERENCE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCHANGEREFERENCE5509); 

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
    // $ANTLR end "entryRuleCHANGEREFERENCE"


    // $ANTLR start "ruleCHANGEREFERENCE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2606:1: ruleCHANGEREFERENCE returns [EObject current=null] : (otherlv_0= 'changeReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleCHANGEREFERENCE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2609:28: ( (otherlv_0= 'changeReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2610:1: (otherlv_0= 'changeReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2610:1: (otherlv_0= 'changeReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2610:3: otherlv_0= 'changeReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleCHANGEREFERENCE5546); 

                	newLeafNode(otherlv_0, grammarAccess.getCHANGEREFERENCEAccess().getChangeReferenceKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2614:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2615:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2615:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2616:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCHANGEREFERENCERule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCHANGEREFERENCE5566); 

            		newLeafNode(otherlv_1, grammarAccess.getCHANGEREFERENCEAccess().getRefRefEReferenceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCHANGEREFERENCE5578); 

                	newLeafNode(otherlv_2, grammarAccess.getCHANGEREFERENCEAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleCHANGEREFERENCE"


    // $ANTLR start "entryRuleADDREFERENCE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2639:1: entryRuleADDREFERENCE returns [EObject current=null] : iv_ruleADDREFERENCE= ruleADDREFERENCE EOF ;
    public final EObject entryRuleADDREFERENCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADDREFERENCE = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2640:2: (iv_ruleADDREFERENCE= ruleADDREFERENCE EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2641:2: iv_ruleADDREFERENCE= ruleADDREFERENCE EOF
            {
             newCompositeNode(grammarAccess.getADDREFERENCERule()); 
            pushFollow(FOLLOW_ruleADDREFERENCE_in_entryRuleADDREFERENCE5614);
            iv_ruleADDREFERENCE=ruleADDREFERENCE();

            state._fsp--;

             current =iv_ruleADDREFERENCE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleADDREFERENCE5624); 

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
    // $ANTLR end "entryRuleADDREFERENCE"


    // $ANTLR start "ruleADDREFERENCE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2648:1: ruleADDREFERENCE returns [EObject current=null] : (otherlv_0= 'addReference(' ( (lv_new_1_0= ruleEString ) ) otherlv_2= ')' ) ;
    public final EObject ruleADDREFERENCE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_new_1_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2651:28: ( (otherlv_0= 'addReference(' ( (lv_new_1_0= ruleEString ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2652:1: (otherlv_0= 'addReference(' ( (lv_new_1_0= ruleEString ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2652:1: (otherlv_0= 'addReference(' ( (lv_new_1_0= ruleEString ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2652:3: otherlv_0= 'addReference(' ( (lv_new_1_0= ruleEString ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleADDREFERENCE5661); 

                	newLeafNode(otherlv_0, grammarAccess.getADDREFERENCEAccess().getAddReferenceKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2656:1: ( (lv_new_1_0= ruleEString ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2657:1: (lv_new_1_0= ruleEString )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2657:1: (lv_new_1_0= ruleEString )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2658:3: lv_new_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getADDREFERENCEAccess().getNewEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleADDREFERENCE5682);
            lv_new_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getADDREFERENCERule());
            	        }
                   		set(
                   			current, 
                   			"new",
                    		lv_new_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleADDREFERENCE5694); 

                	newLeafNode(otherlv_2, grammarAccess.getADDREFERENCEAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleADDREFERENCE"


    // $ANTLR start "entryRuleDELETEREFERENCE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2686:1: entryRuleDELETEREFERENCE returns [EObject current=null] : iv_ruleDELETEREFERENCE= ruleDELETEREFERENCE EOF ;
    public final EObject entryRuleDELETEREFERENCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDELETEREFERENCE = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2687:2: (iv_ruleDELETEREFERENCE= ruleDELETEREFERENCE EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2688:2: iv_ruleDELETEREFERENCE= ruleDELETEREFERENCE EOF
            {
             newCompositeNode(grammarAccess.getDELETEREFERENCERule()); 
            pushFollow(FOLLOW_ruleDELETEREFERENCE_in_entryRuleDELETEREFERENCE5730);
            iv_ruleDELETEREFERENCE=ruleDELETEREFERENCE();

            state._fsp--;

             current =iv_ruleDELETEREFERENCE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDELETEREFERENCE5740); 

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
    // $ANTLR end "entryRuleDELETEREFERENCE"


    // $ANTLR start "ruleDELETEREFERENCE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2695:1: ruleDELETEREFERENCE returns [EObject current=null] : (otherlv_0= 'deleteReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleDELETEREFERENCE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2698:28: ( (otherlv_0= 'deleteReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2699:1: (otherlv_0= 'deleteReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2699:1: (otherlv_0= 'deleteReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2699:3: otherlv_0= 'deleteReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleDELETEREFERENCE5777); 

                	newLeafNode(otherlv_0, grammarAccess.getDELETEREFERENCEAccess().getDeleteReferenceKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2703:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2704:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2704:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2705:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDELETEREFERENCERule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDELETEREFERENCE5797); 

            		newLeafNode(otherlv_1, grammarAccess.getDELETEREFERENCEAccess().getRefRefEReferenceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleDELETEREFERENCE5809); 

                	newLeafNode(otherlv_2, grammarAccess.getDELETEREFERENCEAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleDELETEREFERENCE"


    // $ANTLR start "entryRuleMOVEREFERENCE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2728:1: entryRuleMOVEREFERENCE returns [EObject current=null] : iv_ruleMOVEREFERENCE= ruleMOVEREFERENCE EOF ;
    public final EObject entryRuleMOVEREFERENCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOVEREFERENCE = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2729:2: (iv_ruleMOVEREFERENCE= ruleMOVEREFERENCE EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2730:2: iv_ruleMOVEREFERENCE= ruleMOVEREFERENCE EOF
            {
             newCompositeNode(grammarAccess.getMOVEREFERENCERule()); 
            pushFollow(FOLLOW_ruleMOVEREFERENCE_in_entryRuleMOVEREFERENCE5845);
            iv_ruleMOVEREFERENCE=ruleMOVEREFERENCE();

            state._fsp--;

             current =iv_ruleMOVEREFERENCE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMOVEREFERENCE5855); 

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
    // $ANTLR end "entryRuleMOVEREFERENCE"


    // $ANTLR start "ruleMOVEREFERENCE"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2737:1: ruleMOVEREFERENCE returns [EObject current=null] : (otherlv_0= 'moveReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleMOVEREFERENCE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2740:28: ( (otherlv_0= 'moveReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2741:1: (otherlv_0= 'moveReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2741:1: (otherlv_0= 'moveReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2741:3: otherlv_0= 'moveReference(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleMOVEREFERENCE5892); 

                	newLeafNode(otherlv_0, grammarAccess.getMOVEREFERENCEAccess().getMoveReferenceKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2745:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2746:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2746:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2747:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMOVEREFERENCERule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMOVEREFERENCE5912); 

            		newLeafNode(otherlv_1, grammarAccess.getMOVEREFERENCEAccess().getRefRefEReferenceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleMOVEREFERENCE5924); 

                	newLeafNode(otherlv_2, grammarAccess.getMOVEREFERENCEAccess().getCommaKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2762:1: ( (otherlv_3= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2763:1: (otherlv_3= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2763:1: (otherlv_3= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2764:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMOVEREFERENCERule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMOVEREFERENCE5944); 

            		newLeafNode(otherlv_3, grammarAccess.getMOVEREFERENCEAccess().getDstEClassCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleMOVEREFERENCE5956); 

                	newLeafNode(otherlv_4, grammarAccess.getMOVEREFERENCEAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleMOVEREFERENCE"


    // $ANTLR start "entryRulefeatureSetters_def"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2787:1: entryRulefeatureSetters_def returns [EObject current=null] : iv_rulefeatureSetters_def= rulefeatureSetters_def EOF ;
    public final EObject entryRulefeatureSetters_def() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefeatureSetters_def = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2788:2: (iv_rulefeatureSetters_def= rulefeatureSetters_def EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2789:2: iv_rulefeatureSetters_def= rulefeatureSetters_def EOF
            {
             newCompositeNode(grammarAccess.getFeatureSetters_defRule()); 
            pushFollow(FOLLOW_rulefeatureSetters_def_in_entryRulefeatureSetters_def5992);
            iv_rulefeatureSetters_def=rulefeatureSetters_def();

            state._fsp--;

             current =iv_rulefeatureSetters_def; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefeatureSetters_def6002); 

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
    // $ANTLR end "entryRulefeatureSetters_def"


    // $ANTLR start "rulefeatureSetters_def"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2796:1: rulefeatureSetters_def returns [EObject current=null] : ( ( (otherlv_0= 'setLowerBound(' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ':int' ) | (otherlv_3= 'setUpperBound(' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= ':int' ) | (otherlv_6= 'setType(' ( (lv_eType_7_0= ruleClassifier ) ) otherlv_8= ':classifier' ) | (otherlv_9= 'setOpposite(' ( (lv_opposite_10_0= ruleReference ) ) otherlv_11= ':reference' ) | (otherlv_12= 'setOwner(' ( (lv_opposite_13_0= ruleClass ) ) otherlv_14= ':class' ) | (otherlv_15= 'setName(' ( (lv_name_16_0= ruleEString ) ) otherlv_17= ':string' ) ) otherlv_18= ');' ) ;
    public final EObject rulefeatureSetters_def() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_4_0 = null;

        EObject lv_eType_7_0 = null;

        EObject lv_opposite_10_0 = null;

        EObject lv_opposite_13_0 = null;

        AntlrDatatypeRuleToken lv_name_16_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2799:28: ( ( ( (otherlv_0= 'setLowerBound(' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ':int' ) | (otherlv_3= 'setUpperBound(' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= ':int' ) | (otherlv_6= 'setType(' ( (lv_eType_7_0= ruleClassifier ) ) otherlv_8= ':classifier' ) | (otherlv_9= 'setOpposite(' ( (lv_opposite_10_0= ruleReference ) ) otherlv_11= ':reference' ) | (otherlv_12= 'setOwner(' ( (lv_opposite_13_0= ruleClass ) ) otherlv_14= ':class' ) | (otherlv_15= 'setName(' ( (lv_name_16_0= ruleEString ) ) otherlv_17= ':string' ) ) otherlv_18= ');' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2800:1: ( ( (otherlv_0= 'setLowerBound(' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ':int' ) | (otherlv_3= 'setUpperBound(' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= ':int' ) | (otherlv_6= 'setType(' ( (lv_eType_7_0= ruleClassifier ) ) otherlv_8= ':classifier' ) | (otherlv_9= 'setOpposite(' ( (lv_opposite_10_0= ruleReference ) ) otherlv_11= ':reference' ) | (otherlv_12= 'setOwner(' ( (lv_opposite_13_0= ruleClass ) ) otherlv_14= ':class' ) | (otherlv_15= 'setName(' ( (lv_name_16_0= ruleEString ) ) otherlv_17= ':string' ) ) otherlv_18= ');' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2800:1: ( ( (otherlv_0= 'setLowerBound(' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ':int' ) | (otherlv_3= 'setUpperBound(' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= ':int' ) | (otherlv_6= 'setType(' ( (lv_eType_7_0= ruleClassifier ) ) otherlv_8= ':classifier' ) | (otherlv_9= 'setOpposite(' ( (lv_opposite_10_0= ruleReference ) ) otherlv_11= ':reference' ) | (otherlv_12= 'setOwner(' ( (lv_opposite_13_0= ruleClass ) ) otherlv_14= ':class' ) | (otherlv_15= 'setName(' ( (lv_name_16_0= ruleEString ) ) otherlv_17= ':string' ) ) otherlv_18= ');' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2800:2: ( (otherlv_0= 'setLowerBound(' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ':int' ) | (otherlv_3= 'setUpperBound(' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= ':int' ) | (otherlv_6= 'setType(' ( (lv_eType_7_0= ruleClassifier ) ) otherlv_8= ':classifier' ) | (otherlv_9= 'setOpposite(' ( (lv_opposite_10_0= ruleReference ) ) otherlv_11= ':reference' ) | (otherlv_12= 'setOwner(' ( (lv_opposite_13_0= ruleClass ) ) otherlv_14= ':class' ) | (otherlv_15= 'setName(' ( (lv_name_16_0= ruleEString ) ) otherlv_17= ':string' ) ) otherlv_18= ');'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2800:2: ( (otherlv_0= 'setLowerBound(' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ':int' ) | (otherlv_3= 'setUpperBound(' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= ':int' ) | (otherlv_6= 'setType(' ( (lv_eType_7_0= ruleClassifier ) ) otherlv_8= ':classifier' ) | (otherlv_9= 'setOpposite(' ( (lv_opposite_10_0= ruleReference ) ) otherlv_11= ':reference' ) | (otherlv_12= 'setOwner(' ( (lv_opposite_13_0= ruleClass ) ) otherlv_14= ':class' ) | (otherlv_15= 'setName(' ( (lv_name_16_0= ruleEString ) ) otherlv_17= ':string' ) )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt37=1;
                }
                break;
            case 48:
                {
                alt37=2;
                }
                break;
            case 49:
                {
                alt37=3;
                }
                break;
            case 51:
                {
                alt37=4;
                }
                break;
            case 52:
                {
                alt37=5;
                }
                break;
            case 53:
                {
                alt37=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2800:3: (otherlv_0= 'setLowerBound(' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ':int' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2800:3: (otherlv_0= 'setLowerBound(' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ':int' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2800:5: otherlv_0= 'setLowerBound(' ( (lv_lowerBound_1_0= ruleEInt ) ) otherlv_2= ':int'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_46_in_rulefeatureSetters_def6041); 

                        	newLeafNode(otherlv_0, grammarAccess.getFeatureSetters_defAccess().getSetLowerBoundKeyword_0_0_0());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2804:1: ( (lv_lowerBound_1_0= ruleEInt ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2805:1: (lv_lowerBound_1_0= ruleEInt )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2805:1: (lv_lowerBound_1_0= ruleEInt )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2806:3: lv_lowerBound_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureSetters_defAccess().getLowerBoundEIntParserRuleCall_0_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEInt_in_rulefeatureSetters_def6062);
                    lv_lowerBound_1_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureSetters_defRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_1_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_rulefeatureSetters_def6074); 

                        	newLeafNode(otherlv_2, grammarAccess.getFeatureSetters_defAccess().getIntKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2827:6: (otherlv_3= 'setUpperBound(' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= ':int' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2827:6: (otherlv_3= 'setUpperBound(' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= ':int' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2827:8: otherlv_3= 'setUpperBound(' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= ':int'
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_48_in_rulefeatureSetters_def6094); 

                        	newLeafNode(otherlv_3, grammarAccess.getFeatureSetters_defAccess().getSetUpperBoundKeyword_0_1_0());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2831:1: ( (lv_lowerBound_4_0= ruleEInt ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2832:1: (lv_lowerBound_4_0= ruleEInt )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2832:1: (lv_lowerBound_4_0= ruleEInt )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2833:3: lv_lowerBound_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureSetters_defAccess().getLowerBoundEIntParserRuleCall_0_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEInt_in_rulefeatureSetters_def6115);
                    lv_lowerBound_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureSetters_defRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,47,FOLLOW_47_in_rulefeatureSetters_def6127); 

                        	newLeafNode(otherlv_5, grammarAccess.getFeatureSetters_defAccess().getIntKeyword_0_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2854:6: (otherlv_6= 'setType(' ( (lv_eType_7_0= ruleClassifier ) ) otherlv_8= ':classifier' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2854:6: (otherlv_6= 'setType(' ( (lv_eType_7_0= ruleClassifier ) ) otherlv_8= ':classifier' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2854:8: otherlv_6= 'setType(' ( (lv_eType_7_0= ruleClassifier ) ) otherlv_8= ':classifier'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_49_in_rulefeatureSetters_def6147); 

                        	newLeafNode(otherlv_6, grammarAccess.getFeatureSetters_defAccess().getSetTypeKeyword_0_2_0());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2858:1: ( (lv_eType_7_0= ruleClassifier ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2859:1: (lv_eType_7_0= ruleClassifier )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2859:1: (lv_eType_7_0= ruleClassifier )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2860:3: lv_eType_7_0= ruleClassifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureSetters_defAccess().getETypeClassifierParserRuleCall_0_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClassifier_in_rulefeatureSetters_def6168);
                    lv_eType_7_0=ruleClassifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureSetters_defRule());
                    	        }
                           		set(
                           			current, 
                           			"eType",
                            		lv_eType_7_0, 
                            		"Classifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,50,FOLLOW_50_in_rulefeatureSetters_def6180); 

                        	newLeafNode(otherlv_8, grammarAccess.getFeatureSetters_defAccess().getClassifierKeyword_0_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2881:6: (otherlv_9= 'setOpposite(' ( (lv_opposite_10_0= ruleReference ) ) otherlv_11= ':reference' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2881:6: (otherlv_9= 'setOpposite(' ( (lv_opposite_10_0= ruleReference ) ) otherlv_11= ':reference' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2881:8: otherlv_9= 'setOpposite(' ( (lv_opposite_10_0= ruleReference ) ) otherlv_11= ':reference'
                    {
                    otherlv_9=(Token)match(input,51,FOLLOW_51_in_rulefeatureSetters_def6200); 

                        	newLeafNode(otherlv_9, grammarAccess.getFeatureSetters_defAccess().getSetOppositeKeyword_0_3_0());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2885:1: ( (lv_opposite_10_0= ruleReference ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2886:1: (lv_opposite_10_0= ruleReference )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2886:1: (lv_opposite_10_0= ruleReference )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2887:3: lv_opposite_10_0= ruleReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureSetters_defAccess().getOppositeReferenceParserRuleCall_0_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReference_in_rulefeatureSetters_def6221);
                    lv_opposite_10_0=ruleReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureSetters_defRule());
                    	        }
                           		set(
                           			current, 
                           			"opposite",
                            		lv_opposite_10_0, 
                            		"Reference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,39,FOLLOW_39_in_rulefeatureSetters_def6233); 

                        	newLeafNode(otherlv_11, grammarAccess.getFeatureSetters_defAccess().getReferenceKeyword_0_3_2());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2908:6: (otherlv_12= 'setOwner(' ( (lv_opposite_13_0= ruleClass ) ) otherlv_14= ':class' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2908:6: (otherlv_12= 'setOwner(' ( (lv_opposite_13_0= ruleClass ) ) otherlv_14= ':class' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2908:8: otherlv_12= 'setOwner(' ( (lv_opposite_13_0= ruleClass ) ) otherlv_14= ':class'
                    {
                    otherlv_12=(Token)match(input,52,FOLLOW_52_in_rulefeatureSetters_def6253); 

                        	newLeafNode(otherlv_12, grammarAccess.getFeatureSetters_defAccess().getSetOwnerKeyword_0_4_0());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2912:1: ( (lv_opposite_13_0= ruleClass ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2913:1: (lv_opposite_13_0= ruleClass )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2913:1: (lv_opposite_13_0= ruleClass )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2914:3: lv_opposite_13_0= ruleClass
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureSetters_defAccess().getOppositeClassParserRuleCall_0_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClass_in_rulefeatureSetters_def6274);
                    lv_opposite_13_0=ruleClass();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureSetters_defRule());
                    	        }
                           		set(
                           			current, 
                           			"opposite",
                            		lv_opposite_13_0, 
                            		"Class");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,29,FOLLOW_29_in_rulefeatureSetters_def6286); 

                        	newLeafNode(otherlv_14, grammarAccess.getFeatureSetters_defAccess().getClassKeyword_0_4_2());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2935:6: (otherlv_15= 'setName(' ( (lv_name_16_0= ruleEString ) ) otherlv_17= ':string' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2935:6: (otherlv_15= 'setName(' ( (lv_name_16_0= ruleEString ) ) otherlv_17= ':string' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2935:8: otherlv_15= 'setName(' ( (lv_name_16_0= ruleEString ) ) otherlv_17= ':string'
                    {
                    otherlv_15=(Token)match(input,53,FOLLOW_53_in_rulefeatureSetters_def6306); 

                        	newLeafNode(otherlv_15, grammarAccess.getFeatureSetters_defAccess().getSetNameKeyword_0_5_0());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2939:1: ( (lv_name_16_0= ruleEString ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2940:1: (lv_name_16_0= ruleEString )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2940:1: (lv_name_16_0= ruleEString )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2941:3: lv_name_16_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureSetters_defAccess().getNameEStringParserRuleCall_0_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_rulefeatureSetters_def6327);
                    lv_name_16_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureSetters_defRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_16_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,36,FOLLOW_36_in_rulefeatureSetters_def6339); 

                        	newLeafNode(otherlv_17, grammarAccess.getFeatureSetters_defAccess().getStringKeyword_0_5_2());
                        

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,54,FOLLOW_54_in_rulefeatureSetters_def6353); 

                	newLeafNode(otherlv_18, grammarAccess.getFeatureSetters_defAccess().getRightParenthesisSemicolonKeyword_1());
                

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
    // $ANTLR end "rulefeatureSetters_def"


    // $ANTLR start "entryRuleReferenceOp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2973:1: entryRuleReferenceOp returns [EObject current=null] : iv_ruleReferenceOp= ruleReferenceOp EOF ;
    public final EObject entryRuleReferenceOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceOp = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2974:2: (iv_ruleReferenceOp= ruleReferenceOp EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2975:2: iv_ruleReferenceOp= ruleReferenceOp EOF
            {
             newCompositeNode(grammarAccess.getReferenceOpRule()); 
            pushFollow(FOLLOW_ruleReferenceOp_in_entryRuleReferenceOp6389);
            iv_ruleReferenceOp=ruleReferenceOp();

            state._fsp--;

             current =iv_ruleReferenceOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceOp6399); 

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
    // $ANTLR end "entryRuleReferenceOp"


    // $ANTLR start "ruleReferenceOp"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2982:1: ruleReferenceOp returns [EObject current=null] : ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE ) ) | ( (lv_op_4_0= ruleADDREFERENCE ) ) | ( (lv_op_5_0= ruleDELETEREFERENCE ) ) | ( (lv_op_6_0= ruleMOVEREFERENCE ) ) ) ( (otherlv_7= '{' ( (lv_setters_8_0= ruleFeatureSetters ) )* otherlv_9= '}' ) | otherlv_10= ';' ) ) | ( (lv_complex_11_0= ruleCallOperator ) ) ) ) ;
    public final EObject ruleReferenceOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_var_1_0 = null;

        EObject lv_CHANGE_op_3_0 = null;

        EObject lv_op_4_0 = null;

        EObject lv_op_5_0 = null;

        EObject lv_op_6_0 = null;

        EObject lv_setters_8_0 = null;

        EObject lv_complex_11_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2985:28: ( ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE ) ) | ( (lv_op_4_0= ruleADDREFERENCE ) ) | ( (lv_op_5_0= ruleDELETEREFERENCE ) ) | ( (lv_op_6_0= ruleMOVEREFERENCE ) ) ) ( (otherlv_7= '{' ( (lv_setters_8_0= ruleFeatureSetters ) )* otherlv_9= '}' ) | otherlv_10= ';' ) ) | ( (lv_complex_11_0= ruleCallOperator ) ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2986:1: ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE ) ) | ( (lv_op_4_0= ruleADDREFERENCE ) ) | ( (lv_op_5_0= ruleDELETEREFERENCE ) ) | ( (lv_op_6_0= ruleMOVEREFERENCE ) ) ) ( (otherlv_7= '{' ( (lv_setters_8_0= ruleFeatureSetters ) )* otherlv_9= '}' ) | otherlv_10= ';' ) ) | ( (lv_complex_11_0= ruleCallOperator ) ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2986:1: ( (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE ) ) | ( (lv_op_4_0= ruleADDREFERENCE ) ) | ( (lv_op_5_0= ruleDELETEREFERENCE ) ) | ( (lv_op_6_0= ruleMOVEREFERENCE ) ) ) ( (otherlv_7= '{' ( (lv_setters_8_0= ruleFeatureSetters ) )* otherlv_9= '}' ) | otherlv_10= ';' ) ) | ( (lv_complex_11_0= ruleCallOperator ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2986:2: (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' ) ( ( ( ( (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE ) ) | ( (lv_op_4_0= ruleADDREFERENCE ) ) | ( (lv_op_5_0= ruleDELETEREFERENCE ) ) | ( (lv_op_6_0= ruleMOVEREFERENCE ) ) ) ( (otherlv_7= '{' ( (lv_setters_8_0= ruleFeatureSetters ) )* otherlv_9= '}' ) | otherlv_10= ';' ) ) | ( (lv_complex_11_0= ruleCallOperator ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2986:2: (otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '=' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2986:4: otherlv_0= 'reference' ( (lv_var_1_0= ruleReference ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleReferenceOp6437); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceOpAccess().getReferenceKeyword_0_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2990:1: ( (lv_var_1_0= ruleReference ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2991:1: (lv_var_1_0= ruleReference )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2991:1: (lv_var_1_0= ruleReference )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:2992:3: lv_var_1_0= ruleReference
            {
             
            	        newCompositeNode(grammarAccess.getReferenceOpAccess().getVarReferenceParserRuleCall_0_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReference_in_ruleReferenceOp6458);
            lv_var_1_0=ruleReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReferenceOpRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_1_0, 
                    		"Reference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleReferenceOp6470); 

                	newLeafNode(otherlv_2, grammarAccess.getReferenceOpAccess().getEqualsSignKeyword_0_2());
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3012:2: ( ( ( ( (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE ) ) | ( (lv_op_4_0= ruleADDREFERENCE ) ) | ( (lv_op_5_0= ruleDELETEREFERENCE ) ) | ( (lv_op_6_0= ruleMOVEREFERENCE ) ) ) ( (otherlv_7= '{' ( (lv_setters_8_0= ruleFeatureSetters ) )* otherlv_9= '}' ) | otherlv_10= ';' ) ) | ( (lv_complex_11_0= ruleCallOperator ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==38||(LA41_0>=40 && LA41_0<=42)) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3012:3: ( ( ( (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE ) ) | ( (lv_op_4_0= ruleADDREFERENCE ) ) | ( (lv_op_5_0= ruleDELETEREFERENCE ) ) | ( (lv_op_6_0= ruleMOVEREFERENCE ) ) ) ( (otherlv_7= '{' ( (lv_setters_8_0= ruleFeatureSetters ) )* otherlv_9= '}' ) | otherlv_10= ';' ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3012:3: ( ( ( (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE ) ) | ( (lv_op_4_0= ruleADDREFERENCE ) ) | ( (lv_op_5_0= ruleDELETEREFERENCE ) ) | ( (lv_op_6_0= ruleMOVEREFERENCE ) ) ) ( (otherlv_7= '{' ( (lv_setters_8_0= ruleFeatureSetters ) )* otherlv_9= '}' ) | otherlv_10= ';' ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3012:4: ( ( (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE ) ) | ( (lv_op_4_0= ruleADDREFERENCE ) ) | ( (lv_op_5_0= ruleDELETEREFERENCE ) ) | ( (lv_op_6_0= ruleMOVEREFERENCE ) ) ) ( (otherlv_7= '{' ( (lv_setters_8_0= ruleFeatureSetters ) )* otherlv_9= '}' ) | otherlv_10= ';' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3012:4: ( ( (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE ) ) | ( (lv_op_4_0= ruleADDREFERENCE ) ) | ( (lv_op_5_0= ruleDELETEREFERENCE ) ) | ( (lv_op_6_0= ruleMOVEREFERENCE ) ) )
                    int alt38=4;
                    switch ( input.LA(1) ) {
                    case 38:
                        {
                        alt38=1;
                        }
                        break;
                    case 40:
                        {
                        alt38=2;
                        }
                        break;
                    case 41:
                        {
                        alt38=3;
                        }
                        break;
                    case 42:
                        {
                        alt38=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }

                    switch (alt38) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3012:5: ( (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3012:5: ( (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3013:1: (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3013:1: (lv_CHANGE_op_3_0= ruleCHANGEREFERENCE )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3014:3: lv_CHANGE_op_3_0= ruleCHANGEREFERENCE
                            {
                             
                            	        newCompositeNode(grammarAccess.getReferenceOpAccess().getCHANGE_opCHANGEREFERENCEParserRuleCall_1_0_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleCHANGEREFERENCE_in_ruleReferenceOp6495);
                            lv_CHANGE_op_3_0=ruleCHANGEREFERENCE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getReferenceOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"CHANGE_op",
                                    		lv_CHANGE_op_3_0, 
                                    		"CHANGEREFERENCE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3031:6: ( (lv_op_4_0= ruleADDREFERENCE ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3031:6: ( (lv_op_4_0= ruleADDREFERENCE ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3032:1: (lv_op_4_0= ruleADDREFERENCE )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3032:1: (lv_op_4_0= ruleADDREFERENCE )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3033:3: lv_op_4_0= ruleADDREFERENCE
                            {
                             
                            	        newCompositeNode(grammarAccess.getReferenceOpAccess().getOpADDREFERENCEParserRuleCall_1_0_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleADDREFERENCE_in_ruleReferenceOp6522);
                            lv_op_4_0=ruleADDREFERENCE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getReferenceOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_4_0, 
                                    		"ADDREFERENCE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3050:6: ( (lv_op_5_0= ruleDELETEREFERENCE ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3050:6: ( (lv_op_5_0= ruleDELETEREFERENCE ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3051:1: (lv_op_5_0= ruleDELETEREFERENCE )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3051:1: (lv_op_5_0= ruleDELETEREFERENCE )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3052:3: lv_op_5_0= ruleDELETEREFERENCE
                            {
                             
                            	        newCompositeNode(grammarAccess.getReferenceOpAccess().getOpDELETEREFERENCEParserRuleCall_1_0_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDELETEREFERENCE_in_ruleReferenceOp6549);
                            lv_op_5_0=ruleDELETEREFERENCE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getReferenceOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_5_0, 
                                    		"DELETEREFERENCE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3069:6: ( (lv_op_6_0= ruleMOVEREFERENCE ) )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3069:6: ( (lv_op_6_0= ruleMOVEREFERENCE ) )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3070:1: (lv_op_6_0= ruleMOVEREFERENCE )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3070:1: (lv_op_6_0= ruleMOVEREFERENCE )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3071:3: lv_op_6_0= ruleMOVEREFERENCE
                            {
                             
                            	        newCompositeNode(grammarAccess.getReferenceOpAccess().getOpMOVEREFERENCEParserRuleCall_1_0_0_3_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMOVEREFERENCE_in_ruleReferenceOp6576);
                            lv_op_6_0=ruleMOVEREFERENCE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getReferenceOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_6_0, 
                                    		"MOVEREFERENCE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3087:3: ( (otherlv_7= '{' ( (lv_setters_8_0= ruleFeatureSetters ) )* otherlv_9= '}' ) | otherlv_10= ';' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==12) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==17) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3087:4: (otherlv_7= '{' ( (lv_setters_8_0= ruleFeatureSetters ) )* otherlv_9= '}' )
                            {
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3087:4: (otherlv_7= '{' ( (lv_setters_8_0= ruleFeatureSetters ) )* otherlv_9= '}' )
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3087:6: otherlv_7= '{' ( (lv_setters_8_0= ruleFeatureSetters ) )* otherlv_9= '}'
                            {
                            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleReferenceOp6591); 

                                	newLeafNode(otherlv_7, grammarAccess.getReferenceOpAccess().getLeftCurlyBracketKeyword_1_0_1_0_0());
                                
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3091:1: ( (lv_setters_8_0= ruleFeatureSetters ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==14) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3092:1: (lv_setters_8_0= ruleFeatureSetters )
                            	    {
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3092:1: (lv_setters_8_0= ruleFeatureSetters )
                            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3093:3: lv_setters_8_0= ruleFeatureSetters
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getReferenceOpAccess().getSettersFeatureSettersParserRuleCall_1_0_1_0_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleFeatureSetters_in_ruleReferenceOp6612);
                            	    lv_setters_8_0=ruleFeatureSetters();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getReferenceOpRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"setters",
                            	            		lv_setters_8_0, 
                            	            		"FeatureSetters");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);

                            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleReferenceOp6625); 

                                	newLeafNode(otherlv_9, grammarAccess.getReferenceOpAccess().getRightCurlyBracketKeyword_1_0_1_0_2());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3114:7: otherlv_10= ';'
                            {
                            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleReferenceOp6644); 

                                	newLeafNode(otherlv_10, grammarAccess.getReferenceOpAccess().getSemicolonKeyword_1_0_1_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3119:6: ( (lv_complex_11_0= ruleCallOperator ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3119:6: ( (lv_complex_11_0= ruleCallOperator ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3120:1: (lv_complex_11_0= ruleCallOperator )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3120:1: (lv_complex_11_0= ruleCallOperator )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3121:3: lv_complex_11_0= ruleCallOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceOpAccess().getComplexCallOperatorParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCallOperator_in_ruleReferenceOp6673);
                    lv_complex_11_0=ruleCallOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferenceOpRule());
                    	        }
                           		add(
                           			current, 
                           			"complex",
                            		lv_complex_11_0, 
                            		"CallOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleReferenceOp"


    // $ANTLR start "entryRuleReference"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3145:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3146:2: (iv_ruleReference= ruleReference EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3147:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference6710);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference6720); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3154:1: ruleReference returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3157:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3158:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3158:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3158:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3158:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3159:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferenceAccess().getReferenceAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3164:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3165:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3165:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3166:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference6771); 

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


    // $ANTLR start "entryRuleEString"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3190:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3191:2: (iv_ruleEString= ruleEString EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3192:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString6813);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString6824); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3199:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3202:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3203:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3203:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3203:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString6864); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3211:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString6890); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3226:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3227:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3228:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean6936);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean6947); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3235:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3238:28: ( (kw= 'true' | kw= 'false' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3239:1: (kw= 'true' | kw= 'false' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3239:1: (kw= 'true' | kw= 'false' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            else if ( (LA43_0==57) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3240:2: kw= 'true'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleEBoolean6985); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3247:2: kw= 'false'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleEBoolean7004); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3260:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3261:2: (iv_ruleEInt= ruleEInt EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3262:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt7045);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt7056); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3269:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3272:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3273:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3273:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3273:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3273:2: (kw= '-' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==58) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3274:2: kw= '-'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleEInt7095); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEInt7112); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleComplexOperator"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3294:1: entryRuleComplexOperator returns [EObject current=null] : iv_ruleComplexOperator= ruleComplexOperator EOF ;
    public final EObject entryRuleComplexOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexOperator = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3295:2: (iv_ruleComplexOperator= ruleComplexOperator EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3296:2: iv_ruleComplexOperator= ruleComplexOperator EOF
            {
             newCompositeNode(grammarAccess.getComplexOperatorRule()); 
            pushFollow(FOLLOW_ruleComplexOperator_in_entryRuleComplexOperator7157);
            iv_ruleComplexOperator=ruleComplexOperator();

            state._fsp--;

             current =iv_ruleComplexOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexOperator7167); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3303:1: ruleComplexOperator returns [EObject current=null] : (otherlv_0= 'def change' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_classOperations_8_0= ruleClassOp ) ) | ( (lv_attributeOperations_9_0= ruleAttributeOp ) ) | ( (lv_referenceOperations_10_0= ruleReferenceOp ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleComplexOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_classOperations_8_0 = null;

        EObject lv_attributeOperations_9_0 = null;

        EObject lv_referenceOperations_10_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3306:28: ( (otherlv_0= 'def change' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_classOperations_8_0= ruleClassOp ) ) | ( (lv_attributeOperations_9_0= ruleAttributeOp ) ) | ( (lv_referenceOperations_10_0= ruleReferenceOp ) ) )* otherlv_11= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3307:1: (otherlv_0= 'def change' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_classOperations_8_0= ruleClassOp ) ) | ( (lv_attributeOperations_9_0= ruleAttributeOp ) ) | ( (lv_referenceOperations_10_0= ruleReferenceOp ) ) )* otherlv_11= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3307:1: (otherlv_0= 'def change' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_classOperations_8_0= ruleClassOp ) ) | ( (lv_attributeOperations_9_0= ruleAttributeOp ) ) | ( (lv_referenceOperations_10_0= ruleReferenceOp ) ) )* otherlv_11= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3307:3: otherlv_0= 'def change' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_classOperations_8_0= ruleClassOp ) ) | ( (lv_attributeOperations_9_0= ruleAttributeOp ) ) | ( (lv_referenceOperations_10_0= ruleReferenceOp ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleComplexOperator7204); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexOperatorAccess().getDefChangeKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3311:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3312:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3312:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3313:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexOperator7221); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComplexOperatorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3329:2: (otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3329:4: otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleComplexOperator7239); 

                	newLeafNode(otherlv_2, grammarAccess.getComplexOperatorAccess().getLeftParenthesisKeyword_2_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3333:1: ( (lv_params_3_0= ruleParameter ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3334:1: (lv_params_3_0= ruleParameter )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3334:1: (lv_params_3_0= ruleParameter )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3335:3: lv_params_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getComplexOperatorAccess().getParamsParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleComplexOperator7260);
                    lv_params_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComplexOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3351:3: (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==16) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3351:5: otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleComplexOperator7274); 

            	        	newLeafNode(otherlv_4, grammarAccess.getComplexOperatorAccess().getCommaKeyword_2_2_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3355:1: ( (lv_params_5_0= ruleParameter ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3356:1: (lv_params_5_0= ruleParameter )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3356:1: (lv_params_5_0= ruleParameter )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3357:3: lv_params_5_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexOperatorAccess().getParamsParameterParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleComplexOperator7295);
            	    lv_params_5_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexOperatorRule());
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
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleComplexOperator7309); 

                	newLeafNode(otherlv_6, grammarAccess.getComplexOperatorAccess().getRightParenthesisKeyword_2_3());
                

            }

            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleComplexOperator7322); 

                	newLeafNode(otherlv_7, grammarAccess.getComplexOperatorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3381:1: ( ( (lv_classOperations_8_0= ruleClassOp ) ) | ( (lv_attributeOperations_9_0= ruleAttributeOp ) ) | ( (lv_referenceOperations_10_0= ruleReferenceOp ) ) )*
            loop47:
            do {
                int alt47=4;
                switch ( input.LA(1) ) {
                case 43:
                    {
                    alt47=1;
                    }
                    break;
                case 45:
                    {
                    alt47=2;
                    }
                    break;
                case 55:
                    {
                    alt47=3;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3381:2: ( (lv_classOperations_8_0= ruleClassOp ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3381:2: ( (lv_classOperations_8_0= ruleClassOp ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3382:1: (lv_classOperations_8_0= ruleClassOp )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3382:1: (lv_classOperations_8_0= ruleClassOp )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3383:3: lv_classOperations_8_0= ruleClassOp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexOperatorAccess().getClassOperationsClassOpParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassOp_in_ruleComplexOperator7344);
            	    lv_classOperations_8_0=ruleClassOp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classOperations",
            	            		lv_classOperations_8_0, 
            	            		"ClassOp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3400:6: ( (lv_attributeOperations_9_0= ruleAttributeOp ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3400:6: ( (lv_attributeOperations_9_0= ruleAttributeOp ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3401:1: (lv_attributeOperations_9_0= ruleAttributeOp )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3401:1: (lv_attributeOperations_9_0= ruleAttributeOp )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3402:3: lv_attributeOperations_9_0= ruleAttributeOp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexOperatorAccess().getAttributeOperationsAttributeOpParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeOp_in_ruleComplexOperator7371);
            	    lv_attributeOperations_9_0=ruleAttributeOp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributeOperations",
            	            		lv_attributeOperations_9_0, 
            	            		"AttributeOp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3419:6: ( (lv_referenceOperations_10_0= ruleReferenceOp ) )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3419:6: ( (lv_referenceOperations_10_0= ruleReferenceOp ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3420:1: (lv_referenceOperations_10_0= ruleReferenceOp )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3420:1: (lv_referenceOperations_10_0= ruleReferenceOp )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3421:3: lv_referenceOperations_10_0= ruleReferenceOp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexOperatorAccess().getReferenceOperationsReferenceOpParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleReferenceOp_in_ruleComplexOperator7398);
            	    lv_referenceOperations_10_0=ruleReferenceOp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"referenceOperations",
            	            		lv_referenceOperations_10_0, 
            	            		"ReferenceOp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleComplexOperator7412); 

                	newLeafNode(otherlv_11, grammarAccess.getComplexOperatorAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleComplexOperator"


    // $ANTLR start "entryRuleParameter"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3449:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3450:2: (iv_ruleParameter= ruleParameter EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3451:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter7448);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter7458); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3458:1: ruleParameter returns [EObject current=null] : (this_EReferencePar_0= ruleEReferencePar | this_EAttributePar_1= ruleEAttributePar | this_EClassPar_2= ruleEClassPar | this_EPackagePar_3= ruleEPackagePar | this_EStringPar_4= ruleEStringPar | this_EBoolPar_5= ruleEBoolPar | this_EIntPar_6= ruleEIntPar ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_EReferencePar_0 = null;

        EObject this_EAttributePar_1 = null;

        EObject this_EClassPar_2 = null;

        EObject this_EPackagePar_3 = null;

        EObject this_EStringPar_4 = null;

        EObject this_EBoolPar_5 = null;

        EObject this_EIntPar_6 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3461:28: ( (this_EReferencePar_0= ruleEReferencePar | this_EAttributePar_1= ruleEAttributePar | this_EClassPar_2= ruleEClassPar | this_EPackagePar_3= ruleEPackagePar | this_EStringPar_4= ruleEStringPar | this_EBoolPar_5= ruleEBoolPar | this_EIntPar_6= ruleEIntPar ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3462:1: (this_EReferencePar_0= ruleEReferencePar | this_EAttributePar_1= ruleEAttributePar | this_EClassPar_2= ruleEClassPar | this_EPackagePar_3= ruleEPackagePar | this_EStringPar_4= ruleEStringPar | this_EBoolPar_5= ruleEBoolPar | this_EIntPar_6= ruleEIntPar )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3462:1: (this_EReferencePar_0= ruleEReferencePar | this_EAttributePar_1= ruleEAttributePar | this_EClassPar_2= ruleEClassPar | this_EPackagePar_3= ruleEPackagePar | this_EStringPar_4= ruleEStringPar | this_EBoolPar_5= ruleEBoolPar | this_EIntPar_6= ruleEIntPar )
            int alt48=7;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3463:5: this_EReferencePar_0= ruleEReferencePar
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getEReferenceParParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEReferencePar_in_ruleParameter7505);
                    this_EReferencePar_0=ruleEReferencePar();

                    state._fsp--;

                     
                            current = this_EReferencePar_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3473:5: this_EAttributePar_1= ruleEAttributePar
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getEAttributeParParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEAttributePar_in_ruleParameter7532);
                    this_EAttributePar_1=ruleEAttributePar();

                    state._fsp--;

                     
                            current = this_EAttributePar_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3483:5: this_EClassPar_2= ruleEClassPar
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getEClassParParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEClassPar_in_ruleParameter7559);
                    this_EClassPar_2=ruleEClassPar();

                    state._fsp--;

                     
                            current = this_EClassPar_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3493:5: this_EPackagePar_3= ruleEPackagePar
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getEPackageParParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEPackagePar_in_ruleParameter7586);
                    this_EPackagePar_3=ruleEPackagePar();

                    state._fsp--;

                     
                            current = this_EPackagePar_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3503:5: this_EStringPar_4= ruleEStringPar
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getEStringParParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEStringPar_in_ruleParameter7613);
                    this_EStringPar_4=ruleEStringPar();

                    state._fsp--;

                     
                            current = this_EStringPar_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3513:5: this_EBoolPar_5= ruleEBoolPar
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getEBoolParParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEBoolPar_in_ruleParameter7640);
                    this_EBoolPar_5=ruleEBoolPar();

                    state._fsp--;

                     
                            current = this_EBoolPar_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3523:5: this_EIntPar_6= ruleEIntPar
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getEIntParParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleEIntPar_in_ruleParameter7667);
                    this_EIntPar_6=ruleEIntPar();

                    state._fsp--;

                     
                            current = this_EIntPar_6; 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEReferencePar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3539:1: entryRuleEReferencePar returns [EObject current=null] : iv_ruleEReferencePar= ruleEReferencePar EOF ;
    public final EObject entryRuleEReferencePar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReferencePar = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3540:2: (iv_ruleEReferencePar= ruleEReferencePar EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3541:2: iv_ruleEReferencePar= ruleEReferencePar EOF
            {
             newCompositeNode(grammarAccess.getEReferenceParRule()); 
            pushFollow(FOLLOW_ruleEReferencePar_in_entryRuleEReferencePar7702);
            iv_ruleEReferencePar=ruleEReferencePar();

            state._fsp--;

             current =iv_ruleEReferencePar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEReferencePar7712); 

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
    // $ANTLR end "entryRuleEReferencePar"


    // $ANTLR start "ruleEReferencePar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3548:1: ruleEReferencePar returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Reference' ) ;
    public final EObject ruleEReferencePar() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3551:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Reference' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3552:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Reference' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3552:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Reference' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3552:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Reference'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3552:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3553:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEReferenceParAccess().getEReferenceParAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3558:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3559:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3559:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3560:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEReferencePar7763); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEReferenceParAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEReferenceParRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleEReferencePar7780); 

                	newLeafNode(otherlv_2, grammarAccess.getEReferenceParAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleEReferencePar7792); 

                	newLeafNode(otherlv_3, grammarAccess.getEReferenceParAccess().getReferenceKeyword_3());
                

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
    // $ANTLR end "ruleEReferencePar"


    // $ANTLR start "entryRuleEAttributePar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3592:1: entryRuleEAttributePar returns [EObject current=null] : iv_ruleEAttributePar= ruleEAttributePar EOF ;
    public final EObject entryRuleEAttributePar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributePar = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3593:2: (iv_ruleEAttributePar= ruleEAttributePar EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3594:2: iv_ruleEAttributePar= ruleEAttributePar EOF
            {
             newCompositeNode(grammarAccess.getEAttributeParRule()); 
            pushFollow(FOLLOW_ruleEAttributePar_in_entryRuleEAttributePar7828);
            iv_ruleEAttributePar=ruleEAttributePar();

            state._fsp--;

             current =iv_ruleEAttributePar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEAttributePar7838); 

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
    // $ANTLR end "entryRuleEAttributePar"


    // $ANTLR start "ruleEAttributePar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3601:1: ruleEAttributePar returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Attribute' ) ;
    public final EObject ruleEAttributePar() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3604:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Attribute' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3605:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Attribute' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3605:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Attribute' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3605:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Attribute'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3605:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3606:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEAttributeParAccess().getEAttributeParAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3611:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3612:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3612:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3613:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttributePar7889); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEAttributeParAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEAttributeParRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleEAttributePar7906); 

                	newLeafNode(otherlv_2, grammarAccess.getEAttributeParAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleEAttributePar7918); 

                	newLeafNode(otherlv_3, grammarAccess.getEAttributeParAccess().getAttributeKeyword_3());
                

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
    // $ANTLR end "ruleEAttributePar"


    // $ANTLR start "entryRuleEClassPar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3645:1: entryRuleEClassPar returns [EObject current=null] : iv_ruleEClassPar= ruleEClassPar EOF ;
    public final EObject entryRuleEClassPar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClassPar = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3646:2: (iv_ruleEClassPar= ruleEClassPar EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3647:2: iv_ruleEClassPar= ruleEClassPar EOF
            {
             newCompositeNode(grammarAccess.getEClassParRule()); 
            pushFollow(FOLLOW_ruleEClassPar_in_entryRuleEClassPar7954);
            iv_ruleEClassPar=ruleEClassPar();

            state._fsp--;

             current =iv_ruleEClassPar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEClassPar7964); 

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
    // $ANTLR end "entryRuleEClassPar"


    // $ANTLR start "ruleEClassPar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3654:1: ruleEClassPar returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Class' ) ;
    public final EObject ruleEClassPar() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3657:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Class' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3658:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Class' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3658:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Class' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3658:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Class'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3658:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3659:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEClassParAccess().getEClassParAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3664:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3665:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3665:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3666:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEClassPar8015); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEClassParAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEClassParRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleEClassPar8032); 

                	newLeafNode(otherlv_2, grammarAccess.getEClassParAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleEClassPar8044); 

                	newLeafNode(otherlv_3, grammarAccess.getEClassParAccess().getClassKeyword_3());
                

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
    // $ANTLR end "ruleEClassPar"


    // $ANTLR start "entryRuleEPackagePar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3698:1: entryRuleEPackagePar returns [EObject current=null] : iv_ruleEPackagePar= ruleEPackagePar EOF ;
    public final EObject entryRuleEPackagePar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackagePar = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3699:2: (iv_ruleEPackagePar= ruleEPackagePar EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3700:2: iv_ruleEPackagePar= ruleEPackagePar EOF
            {
             newCompositeNode(grammarAccess.getEPackageParRule()); 
            pushFollow(FOLLOW_ruleEPackagePar_in_entryRuleEPackagePar8080);
            iv_ruleEPackagePar=ruleEPackagePar();

            state._fsp--;

             current =iv_ruleEPackagePar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPackagePar8090); 

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
    // $ANTLR end "entryRuleEPackagePar"


    // $ANTLR start "ruleEPackagePar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3707:1: ruleEPackagePar returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Package' ) ;
    public final EObject ruleEPackagePar() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3710:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Package' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3711:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Package' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3711:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Package' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3711:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Package'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3711:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3712:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEPackageParAccess().getEPackageParAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3717:2: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3718:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3718:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3719:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEPackagePar8141); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEPackageParAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEPackageParRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleEPackagePar8158); 

                	newLeafNode(otherlv_2, grammarAccess.getEPackageParAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,64,FOLLOW_64_in_ruleEPackagePar8170); 

                	newLeafNode(otherlv_3, grammarAccess.getEPackageParAccess().getPackageKeyword_3());
                

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
    // $ANTLR end "ruleEPackagePar"


    // $ANTLR start "entryRuleEIntPar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3751:1: entryRuleEIntPar returns [EObject current=null] : iv_ruleEIntPar= ruleEIntPar EOF ;
    public final EObject entryRuleEIntPar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIntPar = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3752:2: (iv_ruleEIntPar= ruleEIntPar EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3753:2: iv_ruleEIntPar= ruleEIntPar EOF
            {
             newCompositeNode(grammarAccess.getEIntParRule()); 
            pushFollow(FOLLOW_ruleEIntPar_in_entryRuleEIntPar8206);
            iv_ruleEIntPar=ruleEIntPar();

            state._fsp--;

             current =iv_ruleEIntPar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntPar8216); 

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
    // $ANTLR end "entryRuleEIntPar"


    // $ANTLR start "ruleEIntPar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3760:1: ruleEIntPar returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Int' ) ;
    public final EObject ruleEIntPar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3763:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Int' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3764:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Int' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3764:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Int' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3764:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Int'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3764:2: ( (lv_name_0_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3765:1: (lv_name_0_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3765:1: (lv_name_0_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3766:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEIntPar8258); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEIntParAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEIntParRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleEIntPar8275); 

                	newLeafNode(otherlv_1, grammarAccess.getEIntParAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleEIntPar8287); 

                	newLeafNode(otherlv_2, grammarAccess.getEIntParAccess().getIntKeyword_2());
                

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
    // $ANTLR end "ruleEIntPar"


    // $ANTLR start "entryRuleEStringPar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3798:1: entryRuleEStringPar returns [EObject current=null] : iv_ruleEStringPar= ruleEStringPar EOF ;
    public final EObject entryRuleEStringPar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringPar = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3799:2: (iv_ruleEStringPar= ruleEStringPar EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3800:2: iv_ruleEStringPar= ruleEStringPar EOF
            {
             newCompositeNode(grammarAccess.getEStringParRule()); 
            pushFollow(FOLLOW_ruleEStringPar_in_entryRuleEStringPar8323);
            iv_ruleEStringPar=ruleEStringPar();

            state._fsp--;

             current =iv_ruleEStringPar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringPar8333); 

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
    // $ANTLR end "entryRuleEStringPar"


    // $ANTLR start "ruleEStringPar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3807:1: ruleEStringPar returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'String' ) ;
    public final EObject ruleEStringPar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3810:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'String' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3811:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'String' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3811:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'String' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3811:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'String'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3811:2: ( (lv_name_0_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3812:1: (lv_name_0_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3812:1: (lv_name_0_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3813:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEStringPar8375); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEStringParAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEStringParRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleEStringPar8392); 

                	newLeafNode(otherlv_1, grammarAccess.getEStringParAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleEStringPar8404); 

                	newLeafNode(otherlv_2, grammarAccess.getEStringParAccess().getStringKeyword_2());
                

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
    // $ANTLR end "ruleEStringPar"


    // $ANTLR start "entryRuleEBoolPar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3845:1: entryRuleEBoolPar returns [EObject current=null] : iv_ruleEBoolPar= ruleEBoolPar EOF ;
    public final EObject entryRuleEBoolPar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBoolPar = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3846:2: (iv_ruleEBoolPar= ruleEBoolPar EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3847:2: iv_ruleEBoolPar= ruleEBoolPar EOF
            {
             newCompositeNode(grammarAccess.getEBoolParRule()); 
            pushFollow(FOLLOW_ruleEBoolPar_in_entryRuleEBoolPar8440);
            iv_ruleEBoolPar=ruleEBoolPar();

            state._fsp--;

             current =iv_ruleEBoolPar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolPar8450); 

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
    // $ANTLR end "entryRuleEBoolPar"


    // $ANTLR start "ruleEBoolPar"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3854:1: ruleEBoolPar returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Bool' ) ;
    public final EObject ruleEBoolPar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3857:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Bool' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3858:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Bool' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3858:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Bool' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3858:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Bool'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3858:2: ( (lv_name_0_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3859:1: (lv_name_0_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3859:1: (lv_name_0_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3860:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEBoolPar8492); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEBoolParAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEBoolParRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleEBoolPar8509); 

                	newLeafNode(otherlv_1, grammarAccess.getEBoolParAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleEBoolPar8521); 

                	newLeafNode(otherlv_2, grammarAccess.getEBoolParAccess().getBoolKeyword_2());
                

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
    // $ANTLR end "ruleEBoolPar"


    // $ANTLR start "entryRuleCallOperator"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3892:1: entryRuleCallOperator returns [EObject current=null] : iv_ruleCallOperator= ruleCallOperator EOF ;
    public final EObject entryRuleCallOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallOperator = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3893:2: (iv_ruleCallOperator= ruleCallOperator EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3894:2: iv_ruleCallOperator= ruleCallOperator EOF
            {
             newCompositeNode(grammarAccess.getCallOperatorRule()); 
            pushFollow(FOLLOW_ruleCallOperator_in_entryRuleCallOperator8557);
            iv_ruleCallOperator=ruleCallOperator();

            state._fsp--;

             current =iv_ruleCallOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallOperator8567); 

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
    // $ANTLR end "entryRuleCallOperator"


    // $ANTLR start "ruleCallOperator"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3901:1: ruleCallOperator returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* otherlv_5= ');' ) ;
    public final EObject ruleCallOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3904:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* otherlv_5= ');' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3905:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* otherlv_5= ');' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3905:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* otherlv_5= ');' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3905:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )? (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* otherlv_5= ');'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3905:2: ( (otherlv_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3906:1: (otherlv_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3906:1: (otherlv_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3907:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCallOperatorRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCallOperator8612); 

            		newLeafNode(otherlv_0, grammarAccess.getCallOperatorAccess().getFunComplexOperatorCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleCallOperator8624); 

                	newLeafNode(otherlv_1, grammarAccess.getCallOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3922:1: ( (lv_args_2_0= ruleArgument ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_INT)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3923:1: (lv_args_2_0= ruleArgument )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3923:1: (lv_args_2_0= ruleArgument )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3924:3: lv_args_2_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getCallOperatorAccess().getArgsArgumentParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleCallOperator8645);
                    lv_args_2_0=ruleArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCallOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"args",
                            		lv_args_2_0, 
                            		"Argument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3940:3: (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==16) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3940:5: otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleCallOperator8659); 

            	        	newLeafNode(otherlv_3, grammarAccess.getCallOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3944:1: ( (lv_args_4_0= ruleArgument ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3945:1: (lv_args_4_0= ruleArgument )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3945:1: (lv_args_4_0= ruleArgument )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3946:3: lv_args_4_0= ruleArgument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCallOperatorAccess().getArgsArgumentParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArgument_in_ruleCallOperator8680);
            	    lv_args_4_0=ruleArgument();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCallOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"args",
            	            		lv_args_4_0, 
            	            		"Argument");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_5=(Token)match(input,54,FOLLOW_54_in_ruleCallOperator8694); 

                	newLeafNode(otherlv_5, grammarAccess.getCallOperatorAccess().getRightParenthesisSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleCallOperator"


    // $ANTLR start "entryRuleArgument"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3974:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3975:2: (iv_ruleArgument= ruleArgument EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3976:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument8730);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument8740); 

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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3983:1: ruleArgument returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | this_STRING_2= RULE_STRING | this_INT_3= RULE_INT ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_STRING_2=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3986:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | this_STRING_2= RULE_STRING | this_INT_3= RULE_INT ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3987:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | this_STRING_2= RULE_STRING | this_INT_3= RULE_INT )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3987:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | this_STRING_2= RULE_STRING | this_INT_3= RULE_INT )
            int alt51=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt51=1;
                }
                break;
            case RULE_STRING:
                {
                alt51=2;
                }
                break;
            case RULE_INT:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3987:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3987:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3987:3: () ( (otherlv_1= RULE_ID ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3987:3: ()
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3988:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getArgumentAccess().getArgumentAction_0_0(),
                                current);
                        

                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3993:2: ( (otherlv_1= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3994:1: (otherlv_1= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3994:1: (otherlv_1= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:3995:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument8795); 

                    		newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getArgEObjectCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4007:6: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument8813); 
                     
                        newLeafNode(this_STRING_2, grammarAccess.getArgumentAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4012:6: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArgument8829); 
                     
                        newLeafNode(this_INT_3, grammarAccess.getArgumentAccess().getINTTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleMigrationProgram"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4024:1: entryRuleMigrationProgram returns [EObject current=null] : iv_ruleMigrationProgram= ruleMigrationProgram EOF ;
    public final EObject entryRuleMigrationProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationProgram = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4025:2: (iv_ruleMigrationProgram= ruleMigrationProgram EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4026:2: iv_ruleMigrationProgram= ruleMigrationProgram EOF
            {
             newCompositeNode(grammarAccess.getMigrationProgramRule()); 
            pushFollow(FOLLOW_ruleMigrationProgram_in_entryRuleMigrationProgram8864);
            iv_ruleMigrationProgram=ruleMigrationProgram();

            state._fsp--;

             current =iv_ruleMigrationProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationProgram8874); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4033:1: ruleMigrationProgram returns [EObject current=null] : ( (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) otherlv_4= 'transformation' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}' ) ;
    public final EObject ruleMigrationProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_libs_1_0=null;
        Token otherlv_2=null;
        Token lv_migr_3_0=null;
        Token otherlv_4=null;
        Token lv_path_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_delta_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_rules_13_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4036:28: ( ( (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) otherlv_4= 'transformation' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4037:1: ( (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) otherlv_4= 'transformation' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4037:1: ( (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) otherlv_4= 'transformation' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4037:2: (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )* ( (lv_migr_3_0= 'migrate' ) ) otherlv_4= 'transformation' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= 'with' ( (lv_delta_11_0= RULE_STRING ) ) otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) )* otherlv_14= '}'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4037:2: (otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';' )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==68) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4037:4: otherlv_0= 'include' ( (lv_libs_1_0= RULE_STRING ) ) otherlv_2= ';'
            	    {
            	    otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleMigrationProgram8912); 

            	        	newLeafNode(otherlv_0, grammarAccess.getMigrationProgramAccess().getIncludeKeyword_0_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4041:1: ( (lv_libs_1_0= RULE_STRING ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4042:1: (lv_libs_1_0= RULE_STRING )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4042:1: (lv_libs_1_0= RULE_STRING )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4043:3: lv_libs_1_0= RULE_STRING
            	    {
            	    lv_libs_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMigrationProgram8929); 

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

            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleMigrationProgram8946); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMigrationProgramAccess().getSemicolonKeyword_0_2());
            	        

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4063:3: ( (lv_migr_3_0= 'migrate' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4064:1: (lv_migr_3_0= 'migrate' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4064:1: (lv_migr_3_0= 'migrate' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4065:3: lv_migr_3_0= 'migrate'
            {
            lv_migr_3_0=(Token)match(input,69,FOLLOW_69_in_ruleMigrationProgram8966); 

                    newLeafNode(lv_migr_3_0, grammarAccess.getMigrationProgramAccess().getMigrMigrateKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                   		setWithLastConsumed(current, "migr", lv_migr_3_0, "migrate");
            	    

            }


            }

            otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleMigrationProgram8991); 

                	newLeafNode(otherlv_4, grammarAccess.getMigrationProgramAccess().getTransformationKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4082:1: ( (lv_path_5_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4083:1: (lv_path_5_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4083:1: (lv_path_5_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4084:3: lv_path_5_0= RULE_STRING
            {
            lv_path_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMigrationProgram9008); 

            			newLeafNode(lv_path_5_0, grammarAccess.getMigrationProgramAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"path",
                    		lv_path_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleMigrationProgram9025); 

                	newLeafNode(otherlv_6, grammarAccess.getMigrationProgramAccess().getColonKeyword_4());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4104:1: ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4104:2: ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4104:2: ( (otherlv_7= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4105:1: (otherlv_7= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4105:1: (otherlv_7= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4106:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationProgram9046); 

            		newLeafNode(otherlv_7, grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_5_0_0()); 
            	

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4117:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4117:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            {
            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleMigrationProgram9059); 

                	newLeafNode(otherlv_8, grammarAccess.getMigrationProgramAccess().getCommaKeyword_5_1_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4121:1: ( (otherlv_9= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4122:1: (otherlv_9= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4122:1: (otherlv_9= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4123:3: otherlv_9= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMigrationProgramRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationProgram9079); 

            		newLeafNode(otherlv_9, grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_5_1_1_0()); 
            	

            }


            }


            }


            }

            otherlv_10=(Token)match(input,71,FOLLOW_71_in_ruleMigrationProgram9093); 

                	newLeafNode(otherlv_10, grammarAccess.getMigrationProgramAccess().getWithKeyword_6());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4138:1: ( (lv_delta_11_0= RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4139:1: (lv_delta_11_0= RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4139:1: (lv_delta_11_0= RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4140:3: lv_delta_11_0= RULE_STRING
            {
            lv_delta_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMigrationProgram9110); 

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

            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleMigrationProgram9127); 

                	newLeafNode(otherlv_12, grammarAccess.getMigrationProgramAccess().getLeftCurlyBracketKeyword_8());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4160:1: ( (lv_rules_13_0= ruleRule ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==72) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4161:1: (lv_rules_13_0= ruleRule )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4161:1: (lv_rules_13_0= ruleRule )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4162:3: lv_rules_13_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMigrationProgramAccess().getRulesRuleParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleMigrationProgram9148);
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
            	    break loop53;
                }
            } while (true);

            otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleMigrationProgram9161); 

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


    // $ANTLR start "entryRuleRule"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4190:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4191:2: (iv_ruleRule= ruleRule EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4192:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule9197);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule9207); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4199:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' ) ;
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
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4202:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4203:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4203:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4203:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_filter_3_0= ruleOpDef ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_rewritingRules_6_0= ruleRewritingRule ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleRule9244); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4207:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4208:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4208:1: (lv_name_1_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4209:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule9261); 

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

            otherlv_2=(Token)match(input,73,FOLLOW_73_in_ruleRule9278); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_2());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4229:1: ( (lv_filter_3_0= ruleOpDef ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4230:1: (lv_filter_3_0= ruleOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4230:1: (lv_filter_3_0= ruleOpDef )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4231:3: lv_filter_3_0= ruleOpDef
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getFilterOpDefParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleOpDef_in_ruleRule9299);
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

            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleRule9311); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getRightSquareBracketKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRule9323); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_5());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4255:1: ( (lv_rewritingRules_6_0= ruleRewritingRule ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==77) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4256:1: (lv_rewritingRules_6_0= ruleRewritingRule )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4256:1: (lv_rewritingRules_6_0= ruleRewritingRule )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4257:3: lv_rewritingRules_6_0= ruleRewritingRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getRewritingRulesRewritingRuleParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRewritingRule_in_ruleRule9344);
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
            	    break loop54;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleRule9357); 

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


    // $ANTLR start "entryRuleRewritingRule"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4285:1: entryRuleRewritingRule returns [EObject current=null] : iv_ruleRewritingRule= ruleRewritingRule EOF ;
    public final EObject entryRuleRewritingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewritingRule = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4286:2: (iv_ruleRewritingRule= ruleRewritingRule EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4287:2: iv_ruleRewritingRule= ruleRewritingRule EOF
            {
             newCompositeNode(grammarAccess.getRewritingRuleRule()); 
            pushFollow(FOLLOW_ruleRewritingRule_in_entryRuleRewritingRule9393);
            iv_ruleRewritingRule=ruleRewritingRule();

            state._fsp--;

             current =iv_ruleRewritingRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRewritingRule9403); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4294:1: ruleRewritingRule returns [EObject current=null] : ( ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* otherlv_7= ';' ) ;
    public final EObject ruleRewritingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_migratorsSX_0_0 = null;

        EObject lv_migratorDX_2_0 = null;

        EObject lv_migratorSX_4_0 = null;

        EObject lv_migratorDX_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4297:28: ( ( ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* otherlv_7= ';' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4298:1: ( ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* otherlv_7= ';' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4298:1: ( ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* otherlv_7= ';' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4298:2: ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) ) (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )* otherlv_7= ';'
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4298:2: ( ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4298:3: ( (lv_migratorsSX_0_0= ruleMigratorSX ) ) otherlv_1= '->' ( (lv_migratorDX_2_0= ruleMigratorDX ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4298:3: ( (lv_migratorsSX_0_0= ruleMigratorSX ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4299:1: (lv_migratorsSX_0_0= ruleMigratorSX )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4299:1: (lv_migratorsSX_0_0= ruleMigratorSX )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4300:3: lv_migratorsSX_0_0= ruleMigratorSX
            {
             
            	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorsSXMigratorSXParserRuleCall_0_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMigratorSX_in_ruleRewritingRule9450);
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

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleRewritingRule9462); 

                	newLeafNode(otherlv_1, grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4320:1: ( (lv_migratorDX_2_0= ruleMigratorDX ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4321:1: (lv_migratorDX_2_0= ruleMigratorDX )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4321:1: (lv_migratorDX_2_0= ruleMigratorDX )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4322:3: lv_migratorDX_2_0= ruleMigratorDX
            {
             
            	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_0_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMigratorDX_in_ruleRewritingRule9483);
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

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4338:3: (otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==76) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4338:5: otherlv_3= '&' ( (lv_migratorSX_4_0= ruleMigratorSX ) ) otherlv_5= '->' ( (lv_migratorDX_6_0= ruleMigratorDX ) )
            	    {
            	    otherlv_3=(Token)match(input,76,FOLLOW_76_in_ruleRewritingRule9497); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRewritingRuleAccess().getAmpersandKeyword_1_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4342:1: ( (lv_migratorSX_4_0= ruleMigratorSX ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4343:1: (lv_migratorSX_4_0= ruleMigratorSX )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4343:1: (lv_migratorSX_4_0= ruleMigratorSX )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4344:3: lv_migratorSX_4_0= ruleMigratorSX
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorSXMigratorSXParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMigratorSX_in_ruleRewritingRule9518);
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

            	    otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleRewritingRule9530); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_1_2());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4364:1: ( (lv_migratorDX_6_0= ruleMigratorDX ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4365:1: (lv_migratorDX_6_0= ruleMigratorDX )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4365:1: (lv_migratorDX_6_0= ruleMigratorDX )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4366:3: lv_migratorDX_6_0= ruleMigratorDX
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMigratorDX_in_ruleRewritingRule9551);
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
            	    break loop55;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleRewritingRule9565); 

                	newLeafNode(otherlv_7, grammarAccess.getRewritingRuleAccess().getSemicolonKeyword_2());
                

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4394:1: entryRuleMigratorSX returns [EObject current=null] : iv_ruleMigratorSX= ruleMigratorSX EOF ;
    public final EObject entryRuleMigratorSX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigratorSX = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4395:2: (iv_ruleMigratorSX= ruleMigratorSX EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4396:2: iv_ruleMigratorSX= ruleMigratorSX EOF
            {
             newCompositeNode(grammarAccess.getMigratorSXRule()); 
            pushFollow(FOLLOW_ruleMigratorSX_in_entryRuleMigratorSX9601);
            iv_ruleMigratorSX=ruleMigratorSX();

            state._fsp--;

             current =iv_ruleMigratorSX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigratorSX9611); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4403:1: ruleMigratorSX returns [EObject current=null] : (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '>' otherlv_4= '[' ( (lv_filterSX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterSX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) ;
    public final EObject ruleMigratorSX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_filterSX_5_0 = null;

        EObject lv_filterSX_7_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4406:28: ( (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '>' otherlv_4= '[' ( (lv_filterSX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterSX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4407:1: (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '>' otherlv_4= '[' ( (lv_filterSX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterSX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4407:1: (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '>' otherlv_4= '[' ( (lv_filterSX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterSX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4407:3: otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '>' otherlv_4= '[' ( (lv_filterSX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterSX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleMigratorSX9648); 

                	newLeafNode(otherlv_0, grammarAccess.getMigratorSXAccess().getLessThanSignKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4411:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4412:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4412:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4413:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMigratorSXRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorSX9668); 

            		newLeafNode(otherlv_1, grammarAccess.getMigratorSXAccess().getElementSXEClassCrossReference_1_0()); 
            	

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4424:2: ( (lv_name_2_0= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4425:1: (lv_name_2_0= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4425:1: (lv_name_2_0= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4426:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorSX9685); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMigratorSXAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMigratorSXRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,78,FOLLOW_78_in_ruleMigratorSX9702); 

                	newLeafNode(otherlv_3, grammarAccess.getMigratorSXAccess().getGreaterThanSignKeyword_3());
                
            otherlv_4=(Token)match(input,73,FOLLOW_73_in_ruleMigratorSX9714); 

                	newLeafNode(otherlv_4, grammarAccess.getMigratorSXAccess().getLeftSquareBracketKeyword_4());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4450:1: ( (lv_filterSX_5_0= ruleFilterMigrator ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4451:1: (lv_filterSX_5_0= ruleFilterMigrator )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4451:1: (lv_filterSX_5_0= ruleFilterMigrator )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4452:3: lv_filterSX_5_0= ruleFilterMigrator
            {
             
            	        newCompositeNode(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorSX9735);
            lv_filterSX_5_0=ruleFilterMigrator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMigratorSXRule());
            	        }
                   		add(
                   			current, 
                   			"filterSX",
                    		lv_filterSX_5_0, 
                    		"FilterMigrator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4468:2: (otherlv_6= '&' ( (lv_filterSX_7_0= ruleFilterMigrator ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==76) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4468:4: otherlv_6= '&' ( (lv_filterSX_7_0= ruleFilterMigrator ) )
            	    {
            	    otherlv_6=(Token)match(input,76,FOLLOW_76_in_ruleMigratorSX9748); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMigratorSXAccess().getAmpersandKeyword_6_0());
            	        
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4472:1: ( (lv_filterSX_7_0= ruleFilterMigrator ) )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4473:1: (lv_filterSX_7_0= ruleFilterMigrator )
            	    {
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4473:1: (lv_filterSX_7_0= ruleFilterMigrator )
            	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4474:3: lv_filterSX_7_0= ruleFilterMigrator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorSX9769);
            	    lv_filterSX_7_0=ruleFilterMigrator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMigratorSXRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"filterSX",
            	            		lv_filterSX_7_0, 
            	            		"FilterMigrator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_8=(Token)match(input,74,FOLLOW_74_in_ruleMigratorSX9783); 

                	newLeafNode(otherlv_8, grammarAccess.getMigratorSXAccess().getRightSquareBracketKeyword_7());
                

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4502:1: entryRuleMigratorDX returns [EObject current=null] : iv_ruleMigratorDX= ruleMigratorDX EOF ;
    public final EObject entryRuleMigratorDX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigratorDX = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4503:2: (iv_ruleMigratorDX= ruleMigratorDX EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4504:2: iv_ruleMigratorDX= ruleMigratorDX EOF
            {
             newCompositeNode(grammarAccess.getMigratorDXRule()); 
            pushFollow(FOLLOW_ruleMigratorDX_in_entryRuleMigratorDX9819);
            iv_ruleMigratorDX=ruleMigratorDX();

            state._fsp--;

             current =iv_ruleMigratorDX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigratorDX9829); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4511:1: ruleMigratorDX returns [EObject current=null] : ( (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '>' otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) | otherlv_9= 'null' ) ;
    public final EObject ruleMigratorDX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_filterDX_5_0 = null;

        EObject lv_filterDX_7_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4514:28: ( ( (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '>' otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) | otherlv_9= 'null' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4515:1: ( (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '>' otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) | otherlv_9= 'null' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4515:1: ( (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '>' otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' ) | otherlv_9= 'null' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==77) ) {
                alt58=1;
            }
            else if ( (LA58_0==79) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4515:2: (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '>' otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4515:2: (otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '>' otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']' )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4515:4: otherlv_0= '<' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '>' otherlv_4= '[' ( (lv_filterDX_5_0= ruleFilterMigrator ) ) (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )* otherlv_8= ']'
                    {
                    otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleMigratorDX9867); 

                        	newLeafNode(otherlv_0, grammarAccess.getMigratorDXAccess().getLessThanSignKeyword_0_0());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4519:1: ( (otherlv_1= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4520:1: (otherlv_1= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4520:1: (otherlv_1= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4521:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMigratorDXRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorDX9887); 

                    		newLeafNode(otherlv_1, grammarAccess.getMigratorDXAccess().getElementDXEClassCrossReference_0_1_0()); 
                    	

                    }


                    }

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4532:2: ( (lv_name_2_0= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4533:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4533:1: (lv_name_2_0= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4534:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigratorDX9904); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getMigratorDXAccess().getNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMigratorDXRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,78,FOLLOW_78_in_ruleMigratorDX9921); 

                        	newLeafNode(otherlv_3, grammarAccess.getMigratorDXAccess().getGreaterThanSignKeyword_0_3());
                        
                    otherlv_4=(Token)match(input,73,FOLLOW_73_in_ruleMigratorDX9933); 

                        	newLeafNode(otherlv_4, grammarAccess.getMigratorDXAccess().getLeftSquareBracketKeyword_0_4());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4558:1: ( (lv_filterDX_5_0= ruleFilterMigrator ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4559:1: (lv_filterDX_5_0= ruleFilterMigrator )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4559:1: (lv_filterDX_5_0= ruleFilterMigrator )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4560:3: lv_filterDX_5_0= ruleFilterMigrator
                    {
                     
                    	        newCompositeNode(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorDX9954);
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

                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4576:2: (otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==76) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4576:4: otherlv_6= '&' ( (lv_filterDX_7_0= ruleFilterMigrator ) )
                    	    {
                    	    otherlv_6=(Token)match(input,76,FOLLOW_76_in_ruleMigratorDX9967); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getMigratorDXAccess().getAmpersandKeyword_0_6_0());
                    	        
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4580:1: ( (lv_filterDX_7_0= ruleFilterMigrator ) )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4581:1: (lv_filterDX_7_0= ruleFilterMigrator )
                    	    {
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4581:1: (lv_filterDX_7_0= ruleFilterMigrator )
                    	    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4582:3: lv_filterDX_7_0= ruleFilterMigrator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFilterMigrator_in_ruleMigratorDX9988);
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
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,74,FOLLOW_74_in_ruleMigratorDX10002); 

                        	newLeafNode(otherlv_8, grammarAccess.getMigratorDXAccess().getRightSquareBracketKeyword_0_7());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4603:7: otherlv_9= 'null'
                    {
                    otherlv_9=(Token)match(input,79,FOLLOW_79_in_ruleMigratorDX10021); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4615:1: entryRuleFilterMigrator returns [EObject current=null] : iv_ruleFilterMigrator= ruleFilterMigrator EOF ;
    public final EObject entryRuleFilterMigrator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterMigrator = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4616:2: (iv_ruleFilterMigrator= ruleFilterMigrator EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4617:2: iv_ruleFilterMigrator= ruleFilterMigrator EOF
            {
             newCompositeNode(grammarAccess.getFilterMigratorRule()); 
            pushFollow(FOLLOW_ruleFilterMigrator_in_entryRuleFilterMigrator10057);
            iv_ruleFilterMigrator=ruleFilterMigrator();

            state._fsp--;

             current =iv_ruleFilterMigrator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterMigrator10067); 

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
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4624:1: ruleFilterMigrator returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? ( (lv_op_4_0= rulefilterOperation ) ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )? ) ;
    public final EObject ruleFilterMigrator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_op_4_0 = null;


         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4627:28: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? ( (lv_op_4_0= rulefilterOperation ) ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )? ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4628:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? ( (lv_op_4_0= rulefilterOperation ) ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )? )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4628:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? ( (lv_op_4_0= rulefilterOperation ) ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )? )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4628:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? ( (lv_op_4_0= rulefilterOperation ) ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleFilterMigrator10104); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterMigratorAccess().getNumberSignKeyword_0());
                
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4632:1: ( (otherlv_1= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4633:1: (otherlv_1= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4633:1: (otherlv_1= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4634:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterMigratorRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilterMigrator10124); 

            		newLeafNode(otherlv_1, grammarAccess.getFilterMigratorAccess().getFeatureEStructuralFeatureCrossReference_1_0()); 
            	

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4645:2: (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==44) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4645:4: otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleFilterMigrator10137); 

                        	newLeafNode(otherlv_2, grammarAccess.getFilterMigratorAccess().getFullStopKeyword_2_0());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4649:1: ( (otherlv_3= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4650:1: (otherlv_3= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4650:1: (otherlv_3= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4651:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFilterMigratorRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilterMigrator10157); 

                    		newLeafNode(otherlv_3, grammarAccess.getFilterMigratorAccess().getInternalFeatureEStructuralFeatureCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4662:4: ( (lv_op_4_0= rulefilterOperation ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4663:1: (lv_op_4_0= rulefilterOperation )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4663:1: (lv_op_4_0= rulefilterOperation )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4664:3: lv_op_4_0= rulefilterOperation
            {
             
            	        newCompositeNode(grammarAccess.getFilterMigratorAccess().getOpFilterOperationParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulefilterOperation_in_ruleFilterMigrator10180);
            lv_op_4_0=rulefilterOperation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterMigratorRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_4_0, 
                    		"filterOperation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4680:2: ( (otherlv_5= RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4681:1: (otherlv_5= RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4681:1: (otherlv_5= RULE_ID )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4682:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterMigratorRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilterMigrator10200); 

            		newLeafNode(otherlv_5, grammarAccess.getFilterMigratorAccess().getDxobjEObjectCrossReference_4_0()); 
            	

            }


            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4693:2: (otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==44) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4693:4: otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleFilterMigrator10213); 

                        	newLeafNode(otherlv_6, grammarAccess.getFilterMigratorAccess().getFullStopKeyword_5_0());
                        
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4697:1: ( (otherlv_7= RULE_ID ) )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4698:1: (otherlv_7= RULE_ID )
                    {
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4698:1: (otherlv_7= RULE_ID )
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4699:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFilterMigratorRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilterMigrator10233); 

                    		newLeafNode(otherlv_7, grammarAccess.getFilterMigratorAccess().getDxgettersEStructuralFeatureCrossReference_5_1_0()); 
                    	

                    }


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


    // $ANTLR start "entryRulefilterOperation"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4718:1: entryRulefilterOperation returns [EObject current=null] : iv_rulefilterOperation= rulefilterOperation EOF ;
    public final EObject entryRulefilterOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefilterOperation = null;


        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4719:2: (iv_rulefilterOperation= rulefilterOperation EOF )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4720:2: iv_rulefilterOperation= rulefilterOperation EOF
            {
             newCompositeNode(grammarAccess.getFilterOperationRule()); 
            pushFollow(FOLLOW_rulefilterOperation_in_entryRulefilterOperation10271);
            iv_rulefilterOperation=rulefilterOperation();

            state._fsp--;

             current =iv_rulefilterOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefilterOperation10281); 

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
    // $ANTLR end "entryRulefilterOperation"


    // $ANTLR start "rulefilterOperation"
    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4727:1: rulefilterOperation returns [EObject current=null] : ( () ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' | lv_operator_1_3= ':=' | lv_operator_1_4= 'contains:' ) ) ) ) ;
    public final EObject rulefilterOperation() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        Token lv_operator_1_3=null;
        Token lv_operator_1_4=null;

         enterRule(); 
            
        try {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4730:28: ( ( () ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' | lv_operator_1_3= ':=' | lv_operator_1_4= 'contains:' ) ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4731:1: ( () ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' | lv_operator_1_3= ':=' | lv_operator_1_4= 'contains:' ) ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4731:1: ( () ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' | lv_operator_1_3= ':=' | lv_operator_1_4= 'contains:' ) ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4731:2: () ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' | lv_operator_1_3= ':=' | lv_operator_1_4= 'contains:' ) ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4731:2: ()
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4732:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFilterOperationAccess().getSTRINGAction_0(),
                        current);
                

            }

            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4737:2: ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' | lv_operator_1_3= ':=' | lv_operator_1_4= 'contains:' ) ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4738:1: ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' | lv_operator_1_3= ':=' | lv_operator_1_4= 'contains:' ) )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4738:1: ( (lv_operator_1_1= '=' | lv_operator_1_2= '<>' | lv_operator_1_3= ':=' | lv_operator_1_4= 'contains:' ) )
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4739:1: (lv_operator_1_1= '=' | lv_operator_1_2= '<>' | lv_operator_1_3= ':=' | lv_operator_1_4= 'contains:' )
            {
            // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4739:1: (lv_operator_1_1= '=' | lv_operator_1_2= '<>' | lv_operator_1_3= ':=' | lv_operator_1_4= 'contains:' )
            int alt61=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt61=1;
                }
                break;
            case 81:
                {
                alt61=2;
                }
                break;
            case 15:
                {
                alt61=3;
                }
                break;
            case 82:
                {
                alt61=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4740:3: lv_operator_1_1= '='
                    {
                    lv_operator_1_1=(Token)match(input,24,FOLLOW_24_in_rulefilterOperation10335); 

                            newLeafNode(lv_operator_1_1, grammarAccess.getFilterOperationAccess().getOperatorEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFilterOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4752:8: lv_operator_1_2= '<>'
                    {
                    lv_operator_1_2=(Token)match(input,81,FOLLOW_81_in_rulefilterOperation10364); 

                            newLeafNode(lv_operator_1_2, grammarAccess.getFilterOperationAccess().getOperatorLessThanSignGreaterThanSignKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFilterOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4764:8: lv_operator_1_3= ':='
                    {
                    lv_operator_1_3=(Token)match(input,15,FOLLOW_15_in_rulefilterOperation10393); 

                            newLeafNode(lv_operator_1_3, grammarAccess.getFilterOperationAccess().getOperatorColonEqualsSignKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFilterOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../it.univaq.coevolution.emfmigrate/src-gen/it/univaq/coevolution/parser/antlr/internal/InternalMigration.g:4776:8: lv_operator_1_4= 'contains:'
                    {
                    lv_operator_1_4=(Token)match(input,82,FOLLOW_82_in_rulefilterOperation10422); 

                            newLeafNode(lv_operator_1_4, grammarAccess.getFilterOperationAccess().getOperatorContainsKeyword_1_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFilterOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_1_4, null);
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "rulefilterOperation"

    // Delegated rules


    protected DFA48 dfa48 = new DFA48(this);
    static final String DFA48_eotS =
        "\12\uffff";
    static final String DFA48_eofS =
        "\12\uffff";
    static final String DFA48_minS =
        "\1\5\1\74\1\75\7\uffff";
    static final String DFA48_maxS =
        "\1\5\1\74\1\103\7\uffff";
    static final String DFA48_acceptS =
        "\3\uffff\1\1\1\4\1\7\1\2\1\3\1\5\1\6";
    static final String DFA48_specialS =
        "\12\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\6\1\7\1\4\1\5\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "3462:1: (this_EReferencePar_0= ruleEReferencePar | this_EAttributePar_1= ruleEAttributePar | this_EClassPar_2= ruleEClassPar | this_EPackagePar_3= ruleEPackagePar | this_EStringPar_4= ruleEStringPar | this_EBoolPar_5= ruleEBoolPar | this_EIntPar_6= ruleEIntPar )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageOp_in_ruleModel131 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_11_in_ruleModel151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel168 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel185 = new BitSet(new long[]{0x0800000000002000L});
    public static final BitSet FOLLOW_ruleComplexOperator_in_ruleModel206 = new BitSet(new long[]{0x0800000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationProgram_in_ruleModel247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepackageSetters_in_entryRulepackageSetters283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepackageSetters293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulepackageSetters330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepackageSetters350 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulepackageSetters362 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulepackageSetters380 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepackageSetters411 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_rulepackageSetters425 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepackageSetters445 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_rulepackageSetters459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepackageSetters_def_in_entryRulepackageSetters_def495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepackageSetters_def505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulepackageSetters_def542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepackageSetters_def562 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulepackageSetters_def574 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulepackageSetters_def586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepackageSetters_def603 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulepackageSetters_def620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCHANGEPACKAGE_in_entryRuleCHANGEPACKAGE664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCHANGEPACKAGE674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCHANGEPACKAGE717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCHANGEPACKAGE750 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCHANGEPACKAGE762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleADDPACKAGE_in_entryRuleADDPACKAGE798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleADDPACKAGE808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleADDPACKAGE851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleADDPACKAGE881 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleADDPACKAGE898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDELETEPACKAGE_in_entryRuleDELETEPACKAGE934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDELETEPACKAGE944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDELETEPACKAGE987 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDELETEPACKAGE1020 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDELETEPACKAGE1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageOp_in_entryRulePackageOp1068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageOp1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePackageOp1116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePackage_in_rulePackageOp1137 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePackageOp1149 = new BitSet(new long[]{0x0000000000680020L});
    public static final BitSet FOLLOW_ruleCHANGEPACKAGE_in_rulePackageOp1174 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleADDPACKAGE_in_rulePackageOp1201 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleDELETEPACKAGE_in_rulePackageOp1228 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_rulePackageOp1243 = new BitSet(new long[]{0x0000080000006000L});
    public static final BitSet FOLLOW_rulepackageSetters_in_rulePackageOp1265 = new BitSet(new long[]{0x0000080000006000L});
    public static final BitSet FOLLOW_ruleClassOp_in_rulePackageOp1292 = new BitSet(new long[]{0x0000080000006000L});
    public static final BitSet FOLLOW_13_in_rulePackageOp1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePackageOp1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_rulePackageOp1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpDef_in_entryRuleOpDef1391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpDef1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpDef1448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21_in_ruleOpDef1477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22_in_ruleOpDef1506 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePackage_in_ruleOpDef1544 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpDef1556 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOpDef1568 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_ruleOpDef1583 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rulepackageSetters_def_in_ruleOpDef1604 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleOpDef1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpDef1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexOperator_in_ruleOpDef1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpDef1693 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27_in_ruleOpDef1722 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28_in_ruleOpDef1751 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_in_ruleOpDef1788 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOpDef1800 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOpDef1812 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_ruleOpDef1826 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleclassSetters_def_in_ruleOpDef1847 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleOpDef1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpDef1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpDef1904 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleOpDef1925 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOpDef1937 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_32_in_ruleOpDef1957 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOpDef1969 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleOpDef1990 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOpDef2002 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_34_in_ruleOpDef2022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleOpDef2043 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOpDef2055 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_35_in_ruleOpDef2075 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleOpDef2096 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOpDef2108 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOpDef2120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOpDef2137 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleOpDef2154 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_37_in_ruleOpDef2174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleOpDef2195 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOpDef2207 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOpDef2219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_in_ruleOpDef2240 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOpDef2252 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOpDef2266 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_38_in_ruleOpDef2288 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleOpDef2309 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleOpDef2321 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_40_in_ruleOpDef2341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleOpDef2362 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleOpDef2374 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_41_in_ruleOpDef2394 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleOpDef2415 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleOpDef2427 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_42_in_ruleOpDef2447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleOpDef2468 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleOpDef2480 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOpDef2492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_in_ruleOpDef2513 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOpDef2525 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOpDef2539 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_17_in_ruleOpDef2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleOpDef2573 = new BitSet(new long[]{0x003B400000002000L});
    public static final BitSet FOLLOW_rulefeatureSetters_def_in_ruleOpDef2594 = new BitSet(new long[]{0x003B400000002000L});
    public static final BitSet FOLLOW_13_in_ruleOpDef2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage2646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCHANGECLASS_in_entryRuleCHANGECLASS2748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCHANGECLASS2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCHANGECLASS2801 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCHANGECLASS2834 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCHANGECLASS2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleADDCLASS_in_entryRuleADDCLASS2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleADDCLASS2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleADDCLASS2935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleADDCLASS2965 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleADDCLASS2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDELETECLASS_in_entryRuleDELETECLASS3018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDELETECLASS3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDELETECLASS3071 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDELETECLASS3104 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDELETECLASS3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassSetter_in_entryRuleclassSetter3152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclassSetter3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleclassSetter3199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleclassSetter3219 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleclassSetter3231 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleclassSetter3249 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleclassSetter3280 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleclassSetter3294 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleclassSetter3314 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleclassSetter3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassSetters_def_in_entryRuleclassSetters_def3364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclassSetters_def3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleclassSetters_def3411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleclassSetters_def3431 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleclassSetters_def3443 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleclassSetters_def3464 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleclassSetters_def3477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleclassSetters_def3498 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleclassSetters_def3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOp_in_entryRuleClassOp3548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOp3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleClassOp3596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_in_ruleClassOp3617 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleClassOp3629 = new BitSet(new long[]{0x000000001C680020L});
    public static final BitSet FOLLOW_ruleCHANGECLASS_in_ruleClassOp3654 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleADDCLASS_in_ruleClassOp3681 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleDELETECLASS_in_ruleClassOp3708 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_ruleClassOp3723 = new BitSet(new long[]{0x0080200000006000L});
    public static final BitSet FOLLOW_ruleclassSetter_in_ruleClassOp3745 = new BitSet(new long[]{0x0080200000006000L});
    public static final BitSet FOLLOW_ruleAttributeOp_in_ruleClassOp3772 = new BitSet(new long[]{0x0080200000006000L});
    public static final BitSet FOLLOW_ruleReferenceOp_in_ruleClassOp3799 = new BitSet(new long[]{0x0080200000006000L});
    public static final BitSet FOLLOW_13_in_ruleClassOp3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleClassOp3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_ruleClassOp3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass3898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier4000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCHANGEATTRIBUTE_in_entryRuleCHANGEATTRIBUTE4104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCHANGEATTRIBUTE4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCHANGEATTRIBUTE4151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCHANGEATTRIBUTE4171 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCHANGEATTRIBUTE4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleADDATTRIBUTE_in_entryRuleADDATTRIBUTE4219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleADDATTRIBUTE4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleADDATTRIBUTE4266 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleADDATTRIBUTE4278 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleADDATTRIBUTE4299 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleADDATTRIBUTE4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDELETEATTRIBUTE_in_entryRuleDELETEATTRIBUTE4347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDELETEATTRIBUTE4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDELETEATTRIBUTE4394 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDELETEATTRIBUTE4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRENAMEATTRIBUTE_in_entryRuleRENAMEATTRIBUTE4450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRENAMEATTRIBUTE4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRENAMEATTRIBUTE4497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRENAMEATTRIBUTE4517 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRENAMEATTRIBUTE4529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRENAMEATTRIBUTE4546 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRENAMEATTRIBUTE4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMOVEATTRIBUTE_in_entryRuleMOVEATTRIBUTE4599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMOVEATTRIBUTE4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMOVEATTRIBUTE4646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMOVEATTRIBUTE4666 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMOVEATTRIBUTE4678 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMOVEATTRIBUTE4698 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMOVEATTRIBUTE4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureSetters_in_entryRuleFeatureSetters4746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureSetters4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFeatureSetters4793 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureSetters4813 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFeatureSetters4825 = new BitSet(new long[]{0x0700000000000070L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureSetters4843 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleFeatureSetters4875 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleFeatureSetters4902 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureSetters4929 = new BitSet(new long[]{0x0000100000030000L});
    public static final BitSet FOLLOW_44_in_ruleFeatureSetters4942 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureSetters4962 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleFeatureSetters4979 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureSetters4999 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleFeatureSetters5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOp_in_entryRuleAttributeOp5049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeOp5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAttributeOp5097 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributeOp5118 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAttributeOp5130 = new BitSet(new long[]{0x0000002D40680020L});
    public static final BitSet FOLLOW_ruleCHANGEATTRIBUTE_in_ruleAttributeOp5155 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleADDATTRIBUTE_in_ruleAttributeOp5182 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleDELETEATTRIBUTE_in_ruleAttributeOp5209 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleRENAMEATTRIBUTE_in_ruleAttributeOp5236 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleMOVEATTRIBUTE_in_ruleAttributeOp5263 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_ruleAttributeOp5278 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleFeatureSetters_in_ruleAttributeOp5299 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleAttributeOp5312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAttributeOp5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_ruleAttributeOp5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute5397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute5407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCHANGEREFERENCE_in_entryRuleCHANGEREFERENCE5499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCHANGEREFERENCE5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCHANGEREFERENCE5546 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCHANGEREFERENCE5566 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCHANGEREFERENCE5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleADDREFERENCE_in_entryRuleADDREFERENCE5614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleADDREFERENCE5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleADDREFERENCE5661 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleADDREFERENCE5682 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleADDREFERENCE5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDELETEREFERENCE_in_entryRuleDELETEREFERENCE5730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDELETEREFERENCE5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDELETEREFERENCE5777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDELETEREFERENCE5797 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDELETEREFERENCE5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMOVEREFERENCE_in_entryRuleMOVEREFERENCE5845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMOVEREFERENCE5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleMOVEREFERENCE5892 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMOVEREFERENCE5912 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMOVEREFERENCE5924 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMOVEREFERENCE5944 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMOVEREFERENCE5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefeatureSetters_def_in_entryRulefeatureSetters_def5992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefeatureSetters_def6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulefeatureSetters_def6041 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_rulefeatureSetters_def6062 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_rulefeatureSetters_def6074 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_48_in_rulefeatureSetters_def6094 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_ruleEInt_in_rulefeatureSetters_def6115 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_rulefeatureSetters_def6127 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_49_in_rulefeatureSetters_def6147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClassifier_in_rulefeatureSetters_def6168 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_rulefeatureSetters_def6180 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51_in_rulefeatureSetters_def6200 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReference_in_rulefeatureSetters_def6221 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulefeatureSetters_def6233 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_52_in_rulefeatureSetters_def6253 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_in_rulefeatureSetters_def6274 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulefeatureSetters_def6286 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_53_in_rulefeatureSetters_def6306 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_rulefeatureSetters_def6327 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulefeatureSetters_def6339 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulefeatureSetters_def6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceOp_in_entryRuleReferenceOp6389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceOp6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleReferenceOp6437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleReferenceOp6458 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleReferenceOp6470 = new BitSet(new long[]{0x0000074000680020L});
    public static final BitSet FOLLOW_ruleCHANGEREFERENCE_in_ruleReferenceOp6495 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleADDREFERENCE_in_ruleReferenceOp6522 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleDELETEREFERENCE_in_ruleReferenceOp6549 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleMOVEREFERENCE_in_ruleReferenceOp6576 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_ruleReferenceOp6591 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleFeatureSetters_in_ruleReferenceOp6612 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleReferenceOp6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleReferenceOp6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_ruleReferenceOp6673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference6710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean6936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEBoolean6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEBoolean7004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt7045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt7056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleEInt7095 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEInt7112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexOperator_in_entryRuleComplexOperator7157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexOperator7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleComplexOperator7204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexOperator7221 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleComplexOperator7239 = new BitSet(new long[]{0x0000000000110020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleComplexOperator7260 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16_in_ruleComplexOperator7274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleComplexOperator7295 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleComplexOperator7309 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComplexOperator7322 = new BitSet(new long[]{0x0080280000006000L});
    public static final BitSet FOLLOW_ruleClassOp_in_ruleComplexOperator7344 = new BitSet(new long[]{0x0080280000006000L});
    public static final BitSet FOLLOW_ruleAttributeOp_in_ruleComplexOperator7371 = new BitSet(new long[]{0x0080280000006000L});
    public static final BitSet FOLLOW_ruleReferenceOp_in_ruleComplexOperator7398 = new BitSet(new long[]{0x0080280000006000L});
    public static final BitSet FOLLOW_13_in_ruleComplexOperator7412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter7448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter7458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferencePar_in_ruleParameter7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributePar_in_ruleParameter7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassPar_in_ruleParameter7559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackagePar_in_ruleParameter7586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringPar_in_ruleParameter7613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolPar_in_ruleParameter7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntPar_in_ruleParameter7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferencePar_in_entryRuleEReferencePar7702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEReferencePar7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEReferencePar7763 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleEReferencePar7780 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleEReferencePar7792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributePar_in_entryRuleEAttributePar7828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEAttributePar7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttributePar7889 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleEAttributePar7906 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleEAttributePar7918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassPar_in_entryRuleEClassPar7954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEClassPar7964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEClassPar8015 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleEClassPar8032 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleEClassPar8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackagePar_in_entryRuleEPackagePar8080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPackagePar8090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEPackagePar8141 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleEPackagePar8158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleEPackagePar8170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntPar_in_entryRuleEIntPar8206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntPar8216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEIntPar8258 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleEIntPar8275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleEIntPar8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringPar_in_entryRuleEStringPar8323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringPar8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEStringPar8375 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleEStringPar8392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleEStringPar8404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolPar_in_entryRuleEBoolPar8440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolPar8450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEBoolPar8492 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleEBoolPar8509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleEBoolPar8521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_entryRuleCallOperator8557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallOperator8567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCallOperator8612 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCallOperator8624 = new BitSet(new long[]{0x0040000000010070L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCallOperator8645 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCallOperator8659 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleCallOperator8680 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_54_in_ruleCallOperator8694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument8730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument8740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument8795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument8813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArgument8829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationProgram_in_entryRuleMigrationProgram8864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationProgram8874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleMigrationProgram8912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMigrationProgram8929 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMigrationProgram8946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_69_in_ruleMigrationProgram8966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleMigrationProgram8991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMigrationProgram9008 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleMigrationProgram9025 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationProgram9046 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMigrationProgram9059 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationProgram9079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleMigrationProgram9093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMigrationProgram9110 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMigrationProgram9127 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleRule_in_ruleMigrationProgram9148 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_13_in_ruleMigrationProgram9161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule9197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule9207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleRule9244 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule9261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleRule9278 = new BitSet(new long[]{0x0800076D5C680000L});
    public static final BitSet FOLLOW_ruleOpDef_in_ruleRule9299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleRule9311 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRule9323 = new BitSet(new long[]{0x0000000000002000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleRewritingRule_in_ruleRule9344 = new BitSet(new long[]{0x0000000000002000L,0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRule9357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewritingRule_in_entryRuleRewritingRule9393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRewritingRule9403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_ruleRewritingRule9450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleRewritingRule9462 = new BitSet(new long[]{0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_ruleRewritingRule9483 = new BitSet(new long[]{0x0000000000020000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRewritingRule9497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_ruleRewritingRule9518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleRewritingRule9530 = new BitSet(new long[]{0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_ruleRewritingRule9551 = new BitSet(new long[]{0x0000000000020000L,0x0000000000001000L});
    public static final BitSet FOLLOW_17_in_ruleRewritingRule9565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_entryRuleMigratorSX9601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigratorSX9611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleMigratorSX9648 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorSX9668 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorSX9685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleMigratorSX9702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleMigratorSX9714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorSX9735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001400L});
    public static final BitSet FOLLOW_76_in_ruleMigratorSX9748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorSX9769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001400L});
    public static final BitSet FOLLOW_74_in_ruleMigratorSX9783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_entryRuleMigratorDX9819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigratorDX9829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleMigratorDX9867 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorDX9887 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigratorDX9904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleMigratorDX9921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleMigratorDX9933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorDX9954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001400L});
    public static final BitSet FOLLOW_76_in_ruleMigratorDX9967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_ruleMigratorDX9988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001400L});
    public static final BitSet FOLLOW_74_in_ruleMigratorDX10002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleMigratorDX10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_entryRuleFilterMigrator10057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterMigrator10067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleFilterMigrator10104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilterMigrator10124 = new BitSet(new long[]{0x0000100001008000L,0x0000000000060000L});
    public static final BitSet FOLLOW_44_in_ruleFilterMigrator10137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilterMigrator10157 = new BitSet(new long[]{0x0000100001008000L,0x0000000000060000L});
    public static final BitSet FOLLOW_rulefilterOperation_in_ruleFilterMigrator10180 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilterMigrator10200 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleFilterMigrator10213 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilterMigrator10233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefilterOperation_in_entryRulefilterOperation10271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefilterOperation10281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulefilterOperation10335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rulefilterOperation10364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulefilterOperation10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rulefilterOperation10422 = new BitSet(new long[]{0x0000000000000002L});

}