package it.univaq.coevolution.emfmigrate.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import it.univaq.coevolution.emfmigrate.services.EmigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEmigParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'transformation'", "'model'", "'tcs-model'", "';'", "'null'", "'Library'", "'{'", "'}'", "':'", "'with'", "'include'", "','", "'rule'", "'['", "']'", "'package'", "'='", "'('", "')'", "'where'", "'class'", "'attribute'", "'reference'", "'set'", "'->'", "'&'", "'#'", "'.'", "'%'", "'migrate'", "'changePackage'", "'addPackage'", "'deletePackage'", "'changeClass'", "'addClass'", "'deleteClass'", "'changeEAttribute'", "'addEAttribute'", "'deleteEAttribute'", "'changeEReference'", "'addEReference'", "'deleteEReference'"
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
    public String getGrammarFileName() { return "../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g"; }


     
     	private EmigGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EmigGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMyModel"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:60:1: entryRuleMyModel : ruleMyModel EOF ;
    public final void entryRuleMyModel() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:61:1: ( ruleMyModel EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:62:1: ruleMyModel EOF
            {
             before(grammarAccess.getMyModelRule()); 
            pushFollow(FOLLOW_ruleMyModel_in_entryRuleMyModel61);
            ruleMyModel();

            state._fsp--;

             after(grammarAccess.getMyModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMyModel"


    // $ANTLR start "ruleMyModel"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:69:1: ruleMyModel : ( ( rule__MyModel__Alternatives ) ) ;
    public final void ruleMyModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:73:2: ( ( ( rule__MyModel__Alternatives ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:74:1: ( ( rule__MyModel__Alternatives ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:74:1: ( ( rule__MyModel__Alternatives ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:75:1: ( rule__MyModel__Alternatives )
            {
             before(grammarAccess.getMyModelAccess().getAlternatives()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:76:1: ( rule__MyModel__Alternatives )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:76:2: rule__MyModel__Alternatives
            {
            pushFollow(FOLLOW_rule__MyModel__Alternatives_in_ruleMyModel94);
            rule__MyModel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMyModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyModel"


    // $ANTLR start "entryRuleMigrationLibrary"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:88:1: entryRuleMigrationLibrary : ruleMigrationLibrary EOF ;
    public final void entryRuleMigrationLibrary() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:89:1: ( ruleMigrationLibrary EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:90:1: ruleMigrationLibrary EOF
            {
             before(grammarAccess.getMigrationLibraryRule()); 
            pushFollow(FOLLOW_ruleMigrationLibrary_in_entryRuleMigrationLibrary121);
            ruleMigrationLibrary();

            state._fsp--;

             after(grammarAccess.getMigrationLibraryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationLibrary128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMigrationLibrary"


    // $ANTLR start "ruleMigrationLibrary"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:97:1: ruleMigrationLibrary : ( ( rule__MigrationLibrary__Group__0 ) ) ;
    public final void ruleMigrationLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:101:2: ( ( ( rule__MigrationLibrary__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:102:1: ( ( rule__MigrationLibrary__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:102:1: ( ( rule__MigrationLibrary__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:103:1: ( rule__MigrationLibrary__Group__0 )
            {
             before(grammarAccess.getMigrationLibraryAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:104:1: ( rule__MigrationLibrary__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:104:2: rule__MigrationLibrary__Group__0
            {
            pushFollow(FOLLOW_rule__MigrationLibrary__Group__0_in_ruleMigrationLibrary154);
            rule__MigrationLibrary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMigrationLibraryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMigrationLibrary"


    // $ANTLR start "entryRuleMigrationProgram"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:116:1: entryRuleMigrationProgram : ruleMigrationProgram EOF ;
    public final void entryRuleMigrationProgram() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:117:1: ( ruleMigrationProgram EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:118:1: ruleMigrationProgram EOF
            {
             before(grammarAccess.getMigrationProgramRule()); 
            pushFollow(FOLLOW_ruleMigrationProgram_in_entryRuleMigrationProgram181);
            ruleMigrationProgram();

            state._fsp--;

             after(grammarAccess.getMigrationProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationProgram188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMigrationProgram"


    // $ANTLR start "ruleMigrationProgram"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:125:1: ruleMigrationProgram : ( ( rule__MigrationProgram__Group__0 ) ) ;
    public final void ruleMigrationProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:129:2: ( ( ( rule__MigrationProgram__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:130:1: ( ( rule__MigrationProgram__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:130:1: ( ( rule__MigrationProgram__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:131:1: ( rule__MigrationProgram__Group__0 )
            {
             before(grammarAccess.getMigrationProgramAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:132:1: ( rule__MigrationProgram__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:132:2: rule__MigrationProgram__Group__0
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__0_in_ruleMigrationProgram214);
            rule__MigrationProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMigrationProgram"


    // $ANTLR start "entryRuleArtifact"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:144:1: entryRuleArtifact : ruleArtifact EOF ;
    public final void entryRuleArtifact() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:145:1: ( ruleArtifact EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:146:1: ruleArtifact EOF
            {
             before(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_ruleArtifact_in_entryRuleArtifact241);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getArtifactRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifact248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:153:1: ruleArtifact : ( ( rule__Artifact__TypeAssignment ) ) ;
    public final void ruleArtifact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:157:2: ( ( ( rule__Artifact__TypeAssignment ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:158:1: ( ( rule__Artifact__TypeAssignment ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:158:1: ( ( rule__Artifact__TypeAssignment ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:159:1: ( rule__Artifact__TypeAssignment )
            {
             before(grammarAccess.getArtifactAccess().getTypeAssignment()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:160:1: ( rule__Artifact__TypeAssignment )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:160:2: rule__Artifact__TypeAssignment
            {
            pushFollow(FOLLOW_rule__Artifact__TypeAssignment_in_ruleArtifact274);
            rule__Artifact__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleRule"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:172:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:173:1: ( ruleRule EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:174:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule301);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:181:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:185:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:186:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:186:1: ( ( rule__Rule__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:187:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:188:1: ( rule__Rule__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:188:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule334);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleOpDef"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:200:1: entryRuleOpDef : ruleOpDef EOF ;
    public final void entryRuleOpDef() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:201:1: ( ruleOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:202:1: ruleOpDef EOF
            {
             before(grammarAccess.getOpDefRule()); 
            pushFollow(FOLLOW_ruleOpDef_in_entryRuleOpDef361);
            ruleOpDef();

            state._fsp--;

             after(grammarAccess.getOpDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpDef368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpDef"


    // $ANTLR start "ruleOpDef"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:209:1: ruleOpDef : ( ( rule__OpDef__Alternatives ) ) ;
    public final void ruleOpDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:213:2: ( ( ( rule__OpDef__Alternatives ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:214:1: ( ( rule__OpDef__Alternatives ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:214:1: ( ( rule__OpDef__Alternatives ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:215:1: ( rule__OpDef__Alternatives )
            {
             before(grammarAccess.getOpDefAccess().getAlternatives()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:216:1: ( rule__OpDef__Alternatives )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:216:2: rule__OpDef__Alternatives
            {
            pushFollow(FOLLOW_rule__OpDef__Alternatives_in_ruleOpDef394);
            rule__OpDef__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpDefAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpDef"


    // $ANTLR start "entryRuleEPackageOpDef"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:228:1: entryRuleEPackageOpDef : ruleEPackageOpDef EOF ;
    public final void entryRuleEPackageOpDef() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:229:1: ( ruleEPackageOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:230:1: ruleEPackageOpDef EOF
            {
             before(grammarAccess.getEPackageOpDefRule()); 
            pushFollow(FOLLOW_ruleEPackageOpDef_in_entryRuleEPackageOpDef421);
            ruleEPackageOpDef();

            state._fsp--;

             after(grammarAccess.getEPackageOpDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPackageOpDef428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEPackageOpDef"


    // $ANTLR start "ruleEPackageOpDef"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:237:1: ruleEPackageOpDef : ( ( rule__EPackageOpDef__Group__0 ) ) ;
    public final void ruleEPackageOpDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:241:2: ( ( ( rule__EPackageOpDef__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:242:1: ( ( rule__EPackageOpDef__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:242:1: ( ( rule__EPackageOpDef__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:243:1: ( rule__EPackageOpDef__Group__0 )
            {
             before(grammarAccess.getEPackageOpDefAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:244:1: ( rule__EPackageOpDef__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:244:2: rule__EPackageOpDef__Group__0
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group__0_in_ruleEPackageOpDef454);
            rule__EPackageOpDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEPackageOpDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEPackageOpDef"


    // $ANTLR start "entryRuleEClassOpDef"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:256:1: entryRuleEClassOpDef : ruleEClassOpDef EOF ;
    public final void entryRuleEClassOpDef() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:257:1: ( ruleEClassOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:258:1: ruleEClassOpDef EOF
            {
             before(grammarAccess.getEClassOpDefRule()); 
            pushFollow(FOLLOW_ruleEClassOpDef_in_entryRuleEClassOpDef481);
            ruleEClassOpDef();

            state._fsp--;

             after(grammarAccess.getEClassOpDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEClassOpDef488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEClassOpDef"


    // $ANTLR start "ruleEClassOpDef"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:265:1: ruleEClassOpDef : ( ( rule__EClassOpDef__Group__0 ) ) ;
    public final void ruleEClassOpDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:269:2: ( ( ( rule__EClassOpDef__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:270:1: ( ( rule__EClassOpDef__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:270:1: ( ( rule__EClassOpDef__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:271:1: ( rule__EClassOpDef__Group__0 )
            {
             before(grammarAccess.getEClassOpDefAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:272:1: ( rule__EClassOpDef__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:272:2: rule__EClassOpDef__Group__0
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group__0_in_ruleEClassOpDef514);
            rule__EClassOpDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEClassOpDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEClassOpDef"


    // $ANTLR start "entryRuleEAttributeOpDef"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:284:1: entryRuleEAttributeOpDef : ruleEAttributeOpDef EOF ;
    public final void entryRuleEAttributeOpDef() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:285:1: ( ruleEAttributeOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:286:1: ruleEAttributeOpDef EOF
            {
             before(grammarAccess.getEAttributeOpDefRule()); 
            pushFollow(FOLLOW_ruleEAttributeOpDef_in_entryRuleEAttributeOpDef541);
            ruleEAttributeOpDef();

            state._fsp--;

             after(grammarAccess.getEAttributeOpDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEAttributeOpDef548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEAttributeOpDef"


    // $ANTLR start "ruleEAttributeOpDef"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:293:1: ruleEAttributeOpDef : ( ( rule__EAttributeOpDef__Group__0 ) ) ;
    public final void ruleEAttributeOpDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:297:2: ( ( ( rule__EAttributeOpDef__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:298:1: ( ( rule__EAttributeOpDef__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:298:1: ( ( rule__EAttributeOpDef__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:299:1: ( rule__EAttributeOpDef__Group__0 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:300:1: ( rule__EAttributeOpDef__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:300:2: rule__EAttributeOpDef__Group__0
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group__0_in_ruleEAttributeOpDef574);
            rule__EAttributeOpDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEAttributeOpDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEAttributeOpDef"


    // $ANTLR start "entryRuleEReferenceOpDef"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:312:1: entryRuleEReferenceOpDef : ruleEReferenceOpDef EOF ;
    public final void entryRuleEReferenceOpDef() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:313:1: ( ruleEReferenceOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:314:1: ruleEReferenceOpDef EOF
            {
             before(grammarAccess.getEReferenceOpDefRule()); 
            pushFollow(FOLLOW_ruleEReferenceOpDef_in_entryRuleEReferenceOpDef601);
            ruleEReferenceOpDef();

            state._fsp--;

             after(grammarAccess.getEReferenceOpDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEReferenceOpDef608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEReferenceOpDef"


    // $ANTLR start "ruleEReferenceOpDef"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:321:1: ruleEReferenceOpDef : ( ( rule__EReferenceOpDef__Group__0 ) ) ;
    public final void ruleEReferenceOpDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:325:2: ( ( ( rule__EReferenceOpDef__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:326:1: ( ( rule__EReferenceOpDef__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:326:1: ( ( rule__EReferenceOpDef__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:327:1: ( rule__EReferenceOpDef__Group__0 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:328:1: ( rule__EReferenceOpDef__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:328:2: rule__EReferenceOpDef__Group__0
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group__0_in_ruleEReferenceOpDef634);
            rule__EReferenceOpDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEReferenceOpDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEReferenceOpDef"


    // $ANTLR start "entryRulesetterDef"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:340:1: entryRulesetterDef : rulesetterDef EOF ;
    public final void entryRulesetterDef() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:341:1: ( rulesetterDef EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:342:1: rulesetterDef EOF
            {
             before(grammarAccess.getSetterDefRule()); 
            pushFollow(FOLLOW_rulesetterDef_in_entryRulesetterDef661);
            rulesetterDef();

            state._fsp--;

             after(grammarAccess.getSetterDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesetterDef668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesetterDef"


    // $ANTLR start "rulesetterDef"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:349:1: rulesetterDef : ( ( rule__SetterDef__Group__0 ) ) ;
    public final void rulesetterDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:353:2: ( ( ( rule__SetterDef__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:354:1: ( ( rule__SetterDef__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:354:1: ( ( rule__SetterDef__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:355:1: ( rule__SetterDef__Group__0 )
            {
             before(grammarAccess.getSetterDefAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:356:1: ( rule__SetterDef__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:356:2: rule__SetterDef__Group__0
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__0_in_rulesetterDef694);
            rule__SetterDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetterDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesetterDef"


    // $ANTLR start "entryRuleRewritingRule"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:368:1: entryRuleRewritingRule : ruleRewritingRule EOF ;
    public final void entryRuleRewritingRule() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:369:1: ( ruleRewritingRule EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:370:1: ruleRewritingRule EOF
            {
             before(grammarAccess.getRewritingRuleRule()); 
            pushFollow(FOLLOW_ruleRewritingRule_in_entryRuleRewritingRule721);
            ruleRewritingRule();

            state._fsp--;

             after(grammarAccess.getRewritingRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRewritingRule728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRewritingRule"


    // $ANTLR start "ruleRewritingRule"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:377:1: ruleRewritingRule : ( ( rule__RewritingRule__Group__0 ) ) ;
    public final void ruleRewritingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:381:2: ( ( ( rule__RewritingRule__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:382:1: ( ( rule__RewritingRule__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:382:1: ( ( rule__RewritingRule__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:383:1: ( rule__RewritingRule__Group__0 )
            {
             before(grammarAccess.getRewritingRuleAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:384:1: ( rule__RewritingRule__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:384:2: rule__RewritingRule__Group__0
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group__0_in_ruleRewritingRule754);
            rule__RewritingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRewritingRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRewritingRule"


    // $ANTLR start "entryRuleMigratorSX"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:398:1: entryRuleMigratorSX : ruleMigratorSX EOF ;
    public final void entryRuleMigratorSX() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:399:1: ( ruleMigratorSX EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:400:1: ruleMigratorSX EOF
            {
             before(grammarAccess.getMigratorSXRule()); 
            pushFollow(FOLLOW_ruleMigratorSX_in_entryRuleMigratorSX783);
            ruleMigratorSX();

            state._fsp--;

             after(grammarAccess.getMigratorSXRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigratorSX790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMigratorSX"


    // $ANTLR start "ruleMigratorSX"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:407:1: ruleMigratorSX : ( ( rule__MigratorSX__Group__0 ) ) ;
    public final void ruleMigratorSX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:411:2: ( ( ( rule__MigratorSX__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:412:1: ( ( rule__MigratorSX__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:412:1: ( ( rule__MigratorSX__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:413:1: ( rule__MigratorSX__Group__0 )
            {
             before(grammarAccess.getMigratorSXAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:414:1: ( rule__MigratorSX__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:414:2: rule__MigratorSX__Group__0
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__0_in_ruleMigratorSX816);
            rule__MigratorSX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMigratorSXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMigratorSX"


    // $ANTLR start "entryRuleMigratorDX"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:426:1: entryRuleMigratorDX : ruleMigratorDX EOF ;
    public final void entryRuleMigratorDX() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:427:1: ( ruleMigratorDX EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:428:1: ruleMigratorDX EOF
            {
             before(grammarAccess.getMigratorDXRule()); 
            pushFollow(FOLLOW_ruleMigratorDX_in_entryRuleMigratorDX843);
            ruleMigratorDX();

            state._fsp--;

             after(grammarAccess.getMigratorDXRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigratorDX850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMigratorDX"


    // $ANTLR start "ruleMigratorDX"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:435:1: ruleMigratorDX : ( ( rule__MigratorDX__Alternatives ) ) ;
    public final void ruleMigratorDX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:439:2: ( ( ( rule__MigratorDX__Alternatives ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:440:1: ( ( rule__MigratorDX__Alternatives ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:440:1: ( ( rule__MigratorDX__Alternatives ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:441:1: ( rule__MigratorDX__Alternatives )
            {
             before(grammarAccess.getMigratorDXAccess().getAlternatives()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:442:1: ( rule__MigratorDX__Alternatives )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:442:2: rule__MigratorDX__Alternatives
            {
            pushFollow(FOLLOW_rule__MigratorDX__Alternatives_in_ruleMigratorDX876);
            rule__MigratorDX__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMigratorDXAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMigratorDX"


    // $ANTLR start "entryRuleFilterMigrator"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:454:1: entryRuleFilterMigrator : ruleFilterMigrator EOF ;
    public final void entryRuleFilterMigrator() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:455:1: ( ruleFilterMigrator EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:456:1: ruleFilterMigrator EOF
            {
             before(grammarAccess.getFilterMigratorRule()); 
            pushFollow(FOLLOW_ruleFilterMigrator_in_entryRuleFilterMigrator903);
            ruleFilterMigrator();

            state._fsp--;

             after(grammarAccess.getFilterMigratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterMigrator910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterMigrator"


    // $ANTLR start "ruleFilterMigrator"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:463:1: ruleFilterMigrator : ( ( rule__FilterMigrator__Group__0 ) ) ;
    public final void ruleFilterMigrator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:467:2: ( ( ( rule__FilterMigrator__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:468:1: ( ( rule__FilterMigrator__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:468:1: ( ( rule__FilterMigrator__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:469:1: ( rule__FilterMigrator__Group__0 )
            {
             before(grammarAccess.getFilterMigratorAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:470:1: ( rule__FilterMigrator__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:470:2: rule__FilterMigrator__Group__0
            {
            pushFollow(FOLLOW_rule__FilterMigrator__Group__0_in_ruleFilterMigrator936);
            rule__FilterMigrator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterMigratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterMigrator"


    // $ANTLR start "entryRuleDotNavigationObjSX"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:482:1: entryRuleDotNavigationObjSX : ruleDotNavigationObjSX EOF ;
    public final void entryRuleDotNavigationObjSX() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:483:1: ( ruleDotNavigationObjSX EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:484:1: ruleDotNavigationObjSX EOF
            {
             before(grammarAccess.getDotNavigationObjSXRule()); 
            pushFollow(FOLLOW_ruleDotNavigationObjSX_in_entryRuleDotNavigationObjSX963);
            ruleDotNavigationObjSX();

            state._fsp--;

             after(grammarAccess.getDotNavigationObjSXRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDotNavigationObjSX970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDotNavigationObjSX"


    // $ANTLR start "ruleDotNavigationObjSX"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:491:1: ruleDotNavigationObjSX : ( ( rule__DotNavigationObjSX__Group__0 ) ) ;
    public final void ruleDotNavigationObjSX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:495:2: ( ( ( rule__DotNavigationObjSX__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:496:1: ( ( rule__DotNavigationObjSX__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:496:1: ( ( rule__DotNavigationObjSX__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:497:1: ( rule__DotNavigationObjSX__Group__0 )
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:498:1: ( rule__DotNavigationObjSX__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:498:2: rule__DotNavigationObjSX__Group__0
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group__0_in_ruleDotNavigationObjSX996);
            rule__DotNavigationObjSX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDotNavigationObjSXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotNavigationObjSX"


    // $ANTLR start "entryRuleDotNavigationObjDX"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:510:1: entryRuleDotNavigationObjDX : ruleDotNavigationObjDX EOF ;
    public final void entryRuleDotNavigationObjDX() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:511:1: ( ruleDotNavigationObjDX EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:512:1: ruleDotNavigationObjDX EOF
            {
             before(grammarAccess.getDotNavigationObjDXRule()); 
            pushFollow(FOLLOW_ruleDotNavigationObjDX_in_entryRuleDotNavigationObjDX1023);
            ruleDotNavigationObjDX();

            state._fsp--;

             after(grammarAccess.getDotNavigationObjDXRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDotNavigationObjDX1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDotNavigationObjDX"


    // $ANTLR start "ruleDotNavigationObjDX"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:519:1: ruleDotNavigationObjDX : ( ( rule__DotNavigationObjDX__Group__0 ) ) ;
    public final void ruleDotNavigationObjDX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:523:2: ( ( ( rule__DotNavigationObjDX__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:524:1: ( ( rule__DotNavigationObjDX__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:524:1: ( ( rule__DotNavigationObjDX__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:525:1: ( rule__DotNavigationObjDX__Group__0 )
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:526:1: ( rule__DotNavigationObjDX__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:526:2: rule__DotNavigationObjDX__Group__0
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group__0_in_ruleDotNavigationObjDX1056);
            rule__DotNavigationObjDX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDotNavigationObjDXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotNavigationObjDX"


    // $ANTLR start "entryRuleParameter"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:538:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:539:1: ( ruleParameter EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:540:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1083);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1090); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:547:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:551:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:552:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:552:1: ( ( rule__Parameter__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:553:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:554:1: ( rule__Parameter__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:554:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter1116);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRulePackage"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:566:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:567:1: ( rulePackage EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:568:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage1143);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage1150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:575:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:579:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:580:1: ( ( rule__Package__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:580:1: ( ( rule__Package__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:581:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:582:1: ( rule__Package__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:582:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage1176);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleClass"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:594:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:595:1: ( ruleClass EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:596:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass1203);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass1210); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:603:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:607:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:608:1: ( ( rule__Class__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:608:1: ( ( rule__Class__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:609:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:610:1: ( rule__Class__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:610:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass1236);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:622:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:623:1: ( ruleAttribute EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:624:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1263);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1270); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:631:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:635:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:636:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:636:1: ( ( rule__Attribute__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:637:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:638:1: ( rule__Attribute__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:638:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1296);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:650:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:651:1: ( ruleReference EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:652:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1323);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1330); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:659:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:663:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:664:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:664:1: ( ( rule__Reference__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:665:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:666:1: ( rule__Reference__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:666:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference1356);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "rule__MyModel__Alternatives"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:680:1: rule__MyModel__Alternatives : ( ( ( rule__MyModel__MigrationLibAssignment_0 ) ) | ( ( rule__MyModel__MigrationProgrAssignment_1 ) ) );
    public final void rule__MyModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:684:1: ( ( ( rule__MyModel__MigrationLibAssignment_0 ) ) | ( ( rule__MyModel__MigrationProgrAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==21||LA1_0==40) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:685:1: ( ( rule__MyModel__MigrationLibAssignment_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:685:1: ( ( rule__MyModel__MigrationLibAssignment_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:686:1: ( rule__MyModel__MigrationLibAssignment_0 )
                    {
                     before(grammarAccess.getMyModelAccess().getMigrationLibAssignment_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:687:1: ( rule__MyModel__MigrationLibAssignment_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:687:2: rule__MyModel__MigrationLibAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MyModel__MigrationLibAssignment_0_in_rule__MyModel__Alternatives1394);
                    rule__MyModel__MigrationLibAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMyModelAccess().getMigrationLibAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:691:6: ( ( rule__MyModel__MigrationProgrAssignment_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:691:6: ( ( rule__MyModel__MigrationProgrAssignment_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:692:1: ( rule__MyModel__MigrationProgrAssignment_1 )
                    {
                     before(grammarAccess.getMyModelAccess().getMigrationProgrAssignment_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:693:1: ( rule__MyModel__MigrationProgrAssignment_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:693:2: rule__MyModel__MigrationProgrAssignment_1
                    {
                    pushFollow(FOLLOW_rule__MyModel__MigrationProgrAssignment_1_in_rule__MyModel__Alternatives1412);
                    rule__MyModel__MigrationProgrAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMyModelAccess().getMigrationProgrAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Alternatives"


    // $ANTLR start "rule__Artifact__TypeAlternatives_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:702:1: rule__Artifact__TypeAlternatives_0 : ( ( 'transformation' ) | ( 'model' ) | ( 'tcs-model' ) );
    public final void rule__Artifact__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:706:1: ( ( 'transformation' ) | ( 'model' ) | ( 'tcs-model' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:707:1: ( 'transformation' )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:707:1: ( 'transformation' )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:708:1: 'transformation'
                    {
                     before(grammarAccess.getArtifactAccess().getTypeTransformationKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Artifact__TypeAlternatives_01446); 
                     after(grammarAccess.getArtifactAccess().getTypeTransformationKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:715:6: ( 'model' )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:715:6: ( 'model' )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:716:1: 'model'
                    {
                     before(grammarAccess.getArtifactAccess().getTypeModelKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Artifact__TypeAlternatives_01466); 
                     after(grammarAccess.getArtifactAccess().getTypeModelKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:723:6: ( 'tcs-model' )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:723:6: ( 'tcs-model' )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:724:1: 'tcs-model'
                    {
                     before(grammarAccess.getArtifactAccess().getTypeTcsModelKeyword_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__Artifact__TypeAlternatives_01486); 
                     after(grammarAccess.getArtifactAccess().getTypeTcsModelKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__TypeAlternatives_0"


    // $ANTLR start "rule__OpDef__Alternatives"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:736:1: rule__OpDef__Alternatives : ( ( ruleEPackageOpDef ) | ( ruleEClassOpDef ) | ( ruleEAttributeOpDef ) | ( ruleEReferenceOpDef ) );
    public final void rule__OpDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:740:1: ( ( ruleEPackageOpDef ) | ( ruleEClassOpDef ) | ( ruleEAttributeOpDef ) | ( ruleEReferenceOpDef ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:741:1: ( ruleEPackageOpDef )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:741:1: ( ruleEPackageOpDef )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:742:1: ruleEPackageOpDef
                    {
                     before(grammarAccess.getOpDefAccess().getEPackageOpDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEPackageOpDef_in_rule__OpDef__Alternatives1520);
                    ruleEPackageOpDef();

                    state._fsp--;

                     after(grammarAccess.getOpDefAccess().getEPackageOpDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:747:6: ( ruleEClassOpDef )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:747:6: ( ruleEClassOpDef )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:748:1: ruleEClassOpDef
                    {
                     before(grammarAccess.getOpDefAccess().getEClassOpDefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEClassOpDef_in_rule__OpDef__Alternatives1537);
                    ruleEClassOpDef();

                    state._fsp--;

                     after(grammarAccess.getOpDefAccess().getEClassOpDefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:753:6: ( ruleEAttributeOpDef )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:753:6: ( ruleEAttributeOpDef )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:754:1: ruleEAttributeOpDef
                    {
                     before(grammarAccess.getOpDefAccess().getEAttributeOpDefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEAttributeOpDef_in_rule__OpDef__Alternatives1554);
                    ruleEAttributeOpDef();

                    state._fsp--;

                     after(grammarAccess.getOpDefAccess().getEAttributeOpDefParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:759:6: ( ruleEReferenceOpDef )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:759:6: ( ruleEReferenceOpDef )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:760:1: ruleEReferenceOpDef
                    {
                     before(grammarAccess.getOpDefAccess().getEReferenceOpDefParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEReferenceOpDef_in_rule__OpDef__Alternatives1571);
                    ruleEReferenceOpDef();

                    state._fsp--;

                     after(grammarAccess.getOpDefAccess().getEReferenceOpDefParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpDef__Alternatives"


    // $ANTLR start "rule__EPackageOpDef__Alternatives_1_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:770:1: rule__EPackageOpDef__Alternatives_1_0 : ( ( ( rule__EPackageOpDef__OpAssignment_1_0_0 ) ) | ( ( rule__EPackageOpDef__OpAssignment_1_0_1 ) ) | ( ( rule__EPackageOpDef__OpAssignment_1_0_2 ) ) );
    public final void rule__EPackageOpDef__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:774:1: ( ( ( rule__EPackageOpDef__OpAssignment_1_0_0 ) ) | ( ( rule__EPackageOpDef__OpAssignment_1_0_1 ) ) | ( ( rule__EPackageOpDef__OpAssignment_1_0_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt4=1;
                }
                break;
            case 42:
                {
                alt4=2;
                }
                break;
            case 43:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:775:1: ( ( rule__EPackageOpDef__OpAssignment_1_0_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:775:1: ( ( rule__EPackageOpDef__OpAssignment_1_0_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:776:1: ( rule__EPackageOpDef__OpAssignment_1_0_0 )
                    {
                     before(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:777:1: ( rule__EPackageOpDef__OpAssignment_1_0_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:777:2: rule__EPackageOpDef__OpAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_rule__EPackageOpDef__OpAssignment_1_0_0_in_rule__EPackageOpDef__Alternatives_1_01603);
                    rule__EPackageOpDef__OpAssignment_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:781:6: ( ( rule__EPackageOpDef__OpAssignment_1_0_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:781:6: ( ( rule__EPackageOpDef__OpAssignment_1_0_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:782:1: ( rule__EPackageOpDef__OpAssignment_1_0_1 )
                    {
                     before(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:783:1: ( rule__EPackageOpDef__OpAssignment_1_0_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:783:2: rule__EPackageOpDef__OpAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_rule__EPackageOpDef__OpAssignment_1_0_1_in_rule__EPackageOpDef__Alternatives_1_01621);
                    rule__EPackageOpDef__OpAssignment_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:787:6: ( ( rule__EPackageOpDef__OpAssignment_1_0_2 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:787:6: ( ( rule__EPackageOpDef__OpAssignment_1_0_2 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:788:1: ( rule__EPackageOpDef__OpAssignment_1_0_2 )
                    {
                     before(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_2()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:789:1: ( rule__EPackageOpDef__OpAssignment_1_0_2 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:789:2: rule__EPackageOpDef__OpAssignment_1_0_2
                    {
                    pushFollow(FOLLOW_rule__EPackageOpDef__OpAssignment_1_0_2_in_rule__EPackageOpDef__Alternatives_1_01639);
                    rule__EPackageOpDef__OpAssignment_1_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Alternatives_1_0"


    // $ANTLR start "rule__EPackageOpDef__Alternatives_1_8"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:798:1: rule__EPackageOpDef__Alternatives_1_8 : ( ( ( rule__EPackageOpDef__SettersAssignment_1_8_0 ) ) | ( ( rule__EPackageOpDef__ClassesAssignment_1_8_1 ) ) );
    public final void rule__EPackageOpDef__Alternatives_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:802:1: ( ( ( rule__EPackageOpDef__SettersAssignment_1_8_0 ) ) | ( ( rule__EPackageOpDef__ClassesAssignment_1_8_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:803:1: ( ( rule__EPackageOpDef__SettersAssignment_1_8_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:803:1: ( ( rule__EPackageOpDef__SettersAssignment_1_8_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:804:1: ( rule__EPackageOpDef__SettersAssignment_1_8_0 )
                    {
                     before(grammarAccess.getEPackageOpDefAccess().getSettersAssignment_1_8_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:805:1: ( rule__EPackageOpDef__SettersAssignment_1_8_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:805:2: rule__EPackageOpDef__SettersAssignment_1_8_0
                    {
                    pushFollow(FOLLOW_rule__EPackageOpDef__SettersAssignment_1_8_0_in_rule__EPackageOpDef__Alternatives_1_81672);
                    rule__EPackageOpDef__SettersAssignment_1_8_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEPackageOpDefAccess().getSettersAssignment_1_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:809:6: ( ( rule__EPackageOpDef__ClassesAssignment_1_8_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:809:6: ( ( rule__EPackageOpDef__ClassesAssignment_1_8_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:810:1: ( rule__EPackageOpDef__ClassesAssignment_1_8_1 )
                    {
                     before(grammarAccess.getEPackageOpDefAccess().getClassesAssignment_1_8_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:811:1: ( rule__EPackageOpDef__ClassesAssignment_1_8_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:811:2: rule__EPackageOpDef__ClassesAssignment_1_8_1
                    {
                    pushFollow(FOLLOW_rule__EPackageOpDef__ClassesAssignment_1_8_1_in_rule__EPackageOpDef__Alternatives_1_81690);
                    rule__EPackageOpDef__ClassesAssignment_1_8_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEPackageOpDefAccess().getClassesAssignment_1_8_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Alternatives_1_8"


    // $ANTLR start "rule__EClassOpDef__Alternatives_1_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:820:1: rule__EClassOpDef__Alternatives_1_0 : ( ( ( rule__EClassOpDef__OpAssignment_1_0_0 ) ) | ( ( rule__EClassOpDef__OpAssignment_1_0_1 ) ) | ( ( rule__EClassOpDef__OpAssignment_1_0_2 ) ) );
    public final void rule__EClassOpDef__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:824:1: ( ( ( rule__EClassOpDef__OpAssignment_1_0_0 ) ) | ( ( rule__EClassOpDef__OpAssignment_1_0_1 ) ) | ( ( rule__EClassOpDef__OpAssignment_1_0_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt6=1;
                }
                break;
            case 45:
                {
                alt6=2;
                }
                break;
            case 46:
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
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:825:1: ( ( rule__EClassOpDef__OpAssignment_1_0_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:825:1: ( ( rule__EClassOpDef__OpAssignment_1_0_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:826:1: ( rule__EClassOpDef__OpAssignment_1_0_0 )
                    {
                     before(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:827:1: ( rule__EClassOpDef__OpAssignment_1_0_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:827:2: rule__EClassOpDef__OpAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_rule__EClassOpDef__OpAssignment_1_0_0_in_rule__EClassOpDef__Alternatives_1_01723);
                    rule__EClassOpDef__OpAssignment_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:831:6: ( ( rule__EClassOpDef__OpAssignment_1_0_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:831:6: ( ( rule__EClassOpDef__OpAssignment_1_0_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:832:1: ( rule__EClassOpDef__OpAssignment_1_0_1 )
                    {
                     before(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:833:1: ( rule__EClassOpDef__OpAssignment_1_0_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:833:2: rule__EClassOpDef__OpAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_rule__EClassOpDef__OpAssignment_1_0_1_in_rule__EClassOpDef__Alternatives_1_01741);
                    rule__EClassOpDef__OpAssignment_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:837:6: ( ( rule__EClassOpDef__OpAssignment_1_0_2 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:837:6: ( ( rule__EClassOpDef__OpAssignment_1_0_2 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:838:1: ( rule__EClassOpDef__OpAssignment_1_0_2 )
                    {
                     before(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_2()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:839:1: ( rule__EClassOpDef__OpAssignment_1_0_2 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:839:2: rule__EClassOpDef__OpAssignment_1_0_2
                    {
                    pushFollow(FOLLOW_rule__EClassOpDef__OpAssignment_1_0_2_in_rule__EClassOpDef__Alternatives_1_01759);
                    rule__EClassOpDef__OpAssignment_1_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Alternatives_1_0"


    // $ANTLR start "rule__EClassOpDef__Alternatives_1_7_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:848:1: rule__EClassOpDef__Alternatives_1_7_1 : ( ( ( rule__EClassOpDef__SettersAssignment_1_7_1_0 ) ) | ( ( rule__EClassOpDef__AttributesAssignment_1_7_1_1 ) ) | ( ( rule__EClassOpDef__ReferencesAssignment_1_7_1_2 ) ) );
    public final void rule__EClassOpDef__Alternatives_1_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:852:1: ( ( ( rule__EClassOpDef__SettersAssignment_1_7_1_0 ) ) | ( ( rule__EClassOpDef__AttributesAssignment_1_7_1_1 ) ) | ( ( rule__EClassOpDef__ReferencesAssignment_1_7_1_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:853:1: ( ( rule__EClassOpDef__SettersAssignment_1_7_1_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:853:1: ( ( rule__EClassOpDef__SettersAssignment_1_7_1_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:854:1: ( rule__EClassOpDef__SettersAssignment_1_7_1_0 )
                    {
                     before(grammarAccess.getEClassOpDefAccess().getSettersAssignment_1_7_1_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:855:1: ( rule__EClassOpDef__SettersAssignment_1_7_1_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:855:2: rule__EClassOpDef__SettersAssignment_1_7_1_0
                    {
                    pushFollow(FOLLOW_rule__EClassOpDef__SettersAssignment_1_7_1_0_in_rule__EClassOpDef__Alternatives_1_7_11792);
                    rule__EClassOpDef__SettersAssignment_1_7_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEClassOpDefAccess().getSettersAssignment_1_7_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:859:6: ( ( rule__EClassOpDef__AttributesAssignment_1_7_1_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:859:6: ( ( rule__EClassOpDef__AttributesAssignment_1_7_1_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:860:1: ( rule__EClassOpDef__AttributesAssignment_1_7_1_1 )
                    {
                     before(grammarAccess.getEClassOpDefAccess().getAttributesAssignment_1_7_1_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:861:1: ( rule__EClassOpDef__AttributesAssignment_1_7_1_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:861:2: rule__EClassOpDef__AttributesAssignment_1_7_1_1
                    {
                    pushFollow(FOLLOW_rule__EClassOpDef__AttributesAssignment_1_7_1_1_in_rule__EClassOpDef__Alternatives_1_7_11810);
                    rule__EClassOpDef__AttributesAssignment_1_7_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEClassOpDefAccess().getAttributesAssignment_1_7_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:865:6: ( ( rule__EClassOpDef__ReferencesAssignment_1_7_1_2 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:865:6: ( ( rule__EClassOpDef__ReferencesAssignment_1_7_1_2 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:866:1: ( rule__EClassOpDef__ReferencesAssignment_1_7_1_2 )
                    {
                     before(grammarAccess.getEClassOpDefAccess().getReferencesAssignment_1_7_1_2()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:867:1: ( rule__EClassOpDef__ReferencesAssignment_1_7_1_2 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:867:2: rule__EClassOpDef__ReferencesAssignment_1_7_1_2
                    {
                    pushFollow(FOLLOW_rule__EClassOpDef__ReferencesAssignment_1_7_1_2_in_rule__EClassOpDef__Alternatives_1_7_11828);
                    rule__EClassOpDef__ReferencesAssignment_1_7_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEClassOpDefAccess().getReferencesAssignment_1_7_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Alternatives_1_7_1"


    // $ANTLR start "rule__EAttributeOpDef__Alternatives_1_0_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:876:1: rule__EAttributeOpDef__Alternatives_1_0_0 : ( ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_0 ) ) | ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_1 ) ) | ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_2 ) ) );
    public final void rule__EAttributeOpDef__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:880:1: ( ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_0 ) ) | ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_1 ) ) | ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt8=1;
                }
                break;
            case 48:
                {
                alt8=2;
                }
                break;
            case 49:
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
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:881:1: ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:881:1: ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:882:1: ( rule__EAttributeOpDef__OpAssignment_1_0_0_0 )
                    {
                     before(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:883:1: ( rule__EAttributeOpDef__OpAssignment_1_0_0_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:883:2: rule__EAttributeOpDef__OpAssignment_1_0_0_0
                    {
                    pushFollow(FOLLOW_rule__EAttributeOpDef__OpAssignment_1_0_0_0_in_rule__EAttributeOpDef__Alternatives_1_0_01861);
                    rule__EAttributeOpDef__OpAssignment_1_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:887:6: ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:887:6: ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:888:1: ( rule__EAttributeOpDef__OpAssignment_1_0_0_1 )
                    {
                     before(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:889:1: ( rule__EAttributeOpDef__OpAssignment_1_0_0_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:889:2: rule__EAttributeOpDef__OpAssignment_1_0_0_1
                    {
                    pushFollow(FOLLOW_rule__EAttributeOpDef__OpAssignment_1_0_0_1_in_rule__EAttributeOpDef__Alternatives_1_0_01879);
                    rule__EAttributeOpDef__OpAssignment_1_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:893:6: ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_2 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:893:6: ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_2 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:894:1: ( rule__EAttributeOpDef__OpAssignment_1_0_0_2 )
                    {
                     before(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_2()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:895:1: ( rule__EAttributeOpDef__OpAssignment_1_0_0_2 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:895:2: rule__EAttributeOpDef__OpAssignment_1_0_0_2
                    {
                    pushFollow(FOLLOW_rule__EAttributeOpDef__OpAssignment_1_0_0_2_in_rule__EAttributeOpDef__Alternatives_1_0_01897);
                    rule__EAttributeOpDef__OpAssignment_1_0_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Alternatives_1_0_0"


    // $ANTLR start "rule__EAttributeOpDef__Alternatives_1_3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:904:1: rule__EAttributeOpDef__Alternatives_1_3 : ( ( ( rule__EAttributeOpDef__Group_1_3_0__0 ) ) | ( ';' ) );
    public final void rule__EAttributeOpDef__Alternatives_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:908:1: ( ( ( rule__EAttributeOpDef__Group_1_3_0__0 ) ) | ( ';' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:909:1: ( ( rule__EAttributeOpDef__Group_1_3_0__0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:909:1: ( ( rule__EAttributeOpDef__Group_1_3_0__0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:910:1: ( rule__EAttributeOpDef__Group_1_3_0__0 )
                    {
                     before(grammarAccess.getEAttributeOpDefAccess().getGroup_1_3_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:911:1: ( rule__EAttributeOpDef__Group_1_3_0__0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:911:2: rule__EAttributeOpDef__Group_1_3_0__0
                    {
                    pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_3_0__0_in_rule__EAttributeOpDef__Alternatives_1_31930);
                    rule__EAttributeOpDef__Group_1_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEAttributeOpDefAccess().getGroup_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:915:6: ( ';' )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:915:6: ( ';' )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:916:1: ';'
                    {
                     before(grammarAccess.getEAttributeOpDefAccess().getSemicolonKeyword_1_3_1()); 
                    match(input,14,FOLLOW_14_in_rule__EAttributeOpDef__Alternatives_1_31949); 
                     after(grammarAccess.getEAttributeOpDefAccess().getSemicolonKeyword_1_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Alternatives_1_3"


    // $ANTLR start "rule__EReferenceOpDef__Alternatives_1_0_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:928:1: rule__EReferenceOpDef__Alternatives_1_0_0 : ( ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_0 ) ) | ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_1 ) ) | ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_2 ) ) );
    public final void rule__EReferenceOpDef__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:932:1: ( ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_0 ) ) | ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_1 ) ) | ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_2 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt10=1;
                }
                break;
            case 51:
                {
                alt10=2;
                }
                break;
            case 52:
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
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:933:1: ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:933:1: ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:934:1: ( rule__EReferenceOpDef__OpAssignment_1_0_0_0 )
                    {
                     before(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:935:1: ( rule__EReferenceOpDef__OpAssignment_1_0_0_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:935:2: rule__EReferenceOpDef__OpAssignment_1_0_0_0
                    {
                    pushFollow(FOLLOW_rule__EReferenceOpDef__OpAssignment_1_0_0_0_in_rule__EReferenceOpDef__Alternatives_1_0_01983);
                    rule__EReferenceOpDef__OpAssignment_1_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:939:6: ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:939:6: ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:940:1: ( rule__EReferenceOpDef__OpAssignment_1_0_0_1 )
                    {
                     before(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:941:1: ( rule__EReferenceOpDef__OpAssignment_1_0_0_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:941:2: rule__EReferenceOpDef__OpAssignment_1_0_0_1
                    {
                    pushFollow(FOLLOW_rule__EReferenceOpDef__OpAssignment_1_0_0_1_in_rule__EReferenceOpDef__Alternatives_1_0_02001);
                    rule__EReferenceOpDef__OpAssignment_1_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:945:6: ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_2 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:945:6: ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_2 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:946:1: ( rule__EReferenceOpDef__OpAssignment_1_0_0_2 )
                    {
                     before(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_2()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:947:1: ( rule__EReferenceOpDef__OpAssignment_1_0_0_2 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:947:2: rule__EReferenceOpDef__OpAssignment_1_0_0_2
                    {
                    pushFollow(FOLLOW_rule__EReferenceOpDef__OpAssignment_1_0_0_2_in_rule__EReferenceOpDef__Alternatives_1_0_02019);
                    rule__EReferenceOpDef__OpAssignment_1_0_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Alternatives_1_0_0"


    // $ANTLR start "rule__MigratorDX__Alternatives"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:957:1: rule__MigratorDX__Alternatives : ( ( ( rule__MigratorDX__Group_0__0 ) ) | ( 'null' ) );
    public final void rule__MigratorDX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:961:1: ( ( ( rule__MigratorDX__Group_0__0 ) ) | ( 'null' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:962:1: ( ( rule__MigratorDX__Group_0__0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:962:1: ( ( rule__MigratorDX__Group_0__0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:963:1: ( rule__MigratorDX__Group_0__0 )
                    {
                     before(grammarAccess.getMigratorDXAccess().getGroup_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:964:1: ( rule__MigratorDX__Group_0__0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:964:2: rule__MigratorDX__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__MigratorDX__Group_0__0_in_rule__MigratorDX__Alternatives2053);
                    rule__MigratorDX__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMigratorDXAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:968:6: ( 'null' )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:968:6: ( 'null' )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:969:1: 'null'
                    {
                     before(grammarAccess.getMigratorDXAccess().getNullKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__MigratorDX__Alternatives2072); 
                     after(grammarAccess.getMigratorDXAccess().getNullKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Alternatives"


    // $ANTLR start "rule__MigrationLibrary__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:984:1: rule__MigrationLibrary__Group__0 : rule__MigrationLibrary__Group__0__Impl rule__MigrationLibrary__Group__1 ;
    public final void rule__MigrationLibrary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:988:1: ( rule__MigrationLibrary__Group__0__Impl rule__MigrationLibrary__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:989:2: rule__MigrationLibrary__Group__0__Impl rule__MigrationLibrary__Group__1
            {
            pushFollow(FOLLOW_rule__MigrationLibrary__Group__0__Impl_in_rule__MigrationLibrary__Group__02105);
            rule__MigrationLibrary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationLibrary__Group__1_in_rule__MigrationLibrary__Group__02108);
            rule__MigrationLibrary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationLibrary__Group__0"


    // $ANTLR start "rule__MigrationLibrary__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:996:1: rule__MigrationLibrary__Group__0__Impl : ( 'Library' ) ;
    public final void rule__MigrationLibrary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1000:1: ( ( 'Library' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1001:1: ( 'Library' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1001:1: ( 'Library' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1002:1: 'Library'
            {
             before(grammarAccess.getMigrationLibraryAccess().getLibraryKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__MigrationLibrary__Group__0__Impl2136); 
             after(grammarAccess.getMigrationLibraryAccess().getLibraryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationLibrary__Group__0__Impl"


    // $ANTLR start "rule__MigrationLibrary__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1015:1: rule__MigrationLibrary__Group__1 : rule__MigrationLibrary__Group__1__Impl rule__MigrationLibrary__Group__2 ;
    public final void rule__MigrationLibrary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1019:1: ( rule__MigrationLibrary__Group__1__Impl rule__MigrationLibrary__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1020:2: rule__MigrationLibrary__Group__1__Impl rule__MigrationLibrary__Group__2
            {
            pushFollow(FOLLOW_rule__MigrationLibrary__Group__1__Impl_in_rule__MigrationLibrary__Group__12167);
            rule__MigrationLibrary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationLibrary__Group__2_in_rule__MigrationLibrary__Group__12170);
            rule__MigrationLibrary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationLibrary__Group__1"


    // $ANTLR start "rule__MigrationLibrary__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1027:1: rule__MigrationLibrary__Group__1__Impl : ( ( rule__MigrationLibrary__TitleAssignment_1 ) ) ;
    public final void rule__MigrationLibrary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1031:1: ( ( ( rule__MigrationLibrary__TitleAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1032:1: ( ( rule__MigrationLibrary__TitleAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1032:1: ( ( rule__MigrationLibrary__TitleAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1033:1: ( rule__MigrationLibrary__TitleAssignment_1 )
            {
             before(grammarAccess.getMigrationLibraryAccess().getTitleAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1034:1: ( rule__MigrationLibrary__TitleAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1034:2: rule__MigrationLibrary__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__MigrationLibrary__TitleAssignment_1_in_rule__MigrationLibrary__Group__1__Impl2197);
            rule__MigrationLibrary__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMigrationLibraryAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationLibrary__Group__1__Impl"


    // $ANTLR start "rule__MigrationLibrary__Group__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1044:1: rule__MigrationLibrary__Group__2 : rule__MigrationLibrary__Group__2__Impl rule__MigrationLibrary__Group__3 ;
    public final void rule__MigrationLibrary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1048:1: ( rule__MigrationLibrary__Group__2__Impl rule__MigrationLibrary__Group__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1049:2: rule__MigrationLibrary__Group__2__Impl rule__MigrationLibrary__Group__3
            {
            pushFollow(FOLLOW_rule__MigrationLibrary__Group__2__Impl_in_rule__MigrationLibrary__Group__22227);
            rule__MigrationLibrary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationLibrary__Group__3_in_rule__MigrationLibrary__Group__22230);
            rule__MigrationLibrary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationLibrary__Group__2"


    // $ANTLR start "rule__MigrationLibrary__Group__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1056:1: rule__MigrationLibrary__Group__2__Impl : ( '{' ) ;
    public final void rule__MigrationLibrary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1060:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1061:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1061:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1062:1: '{'
            {
             before(grammarAccess.getMigrationLibraryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__MigrationLibrary__Group__2__Impl2258); 
             after(grammarAccess.getMigrationLibraryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationLibrary__Group__2__Impl"


    // $ANTLR start "rule__MigrationLibrary__Group__3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1075:1: rule__MigrationLibrary__Group__3 : rule__MigrationLibrary__Group__3__Impl rule__MigrationLibrary__Group__4 ;
    public final void rule__MigrationLibrary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1079:1: ( rule__MigrationLibrary__Group__3__Impl rule__MigrationLibrary__Group__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1080:2: rule__MigrationLibrary__Group__3__Impl rule__MigrationLibrary__Group__4
            {
            pushFollow(FOLLOW_rule__MigrationLibrary__Group__3__Impl_in_rule__MigrationLibrary__Group__32289);
            rule__MigrationLibrary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationLibrary__Group__4_in_rule__MigrationLibrary__Group__32292);
            rule__MigrationLibrary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationLibrary__Group__3"


    // $ANTLR start "rule__MigrationLibrary__Group__3__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1087:1: rule__MigrationLibrary__Group__3__Impl : ( ( rule__MigrationLibrary__RulesAssignment_3 )* ) ;
    public final void rule__MigrationLibrary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1091:1: ( ( ( rule__MigrationLibrary__RulesAssignment_3 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1092:1: ( ( rule__MigrationLibrary__RulesAssignment_3 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1092:1: ( ( rule__MigrationLibrary__RulesAssignment_3 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1093:1: ( rule__MigrationLibrary__RulesAssignment_3 )*
            {
             before(grammarAccess.getMigrationLibraryAccess().getRulesAssignment_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1094:1: ( rule__MigrationLibrary__RulesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1094:2: rule__MigrationLibrary__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__MigrationLibrary__RulesAssignment_3_in_rule__MigrationLibrary__Group__3__Impl2319);
            	    rule__MigrationLibrary__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMigrationLibraryAccess().getRulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationLibrary__Group__3__Impl"


    // $ANTLR start "rule__MigrationLibrary__Group__4"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1104:1: rule__MigrationLibrary__Group__4 : rule__MigrationLibrary__Group__4__Impl ;
    public final void rule__MigrationLibrary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1108:1: ( rule__MigrationLibrary__Group__4__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1109:2: rule__MigrationLibrary__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MigrationLibrary__Group__4__Impl_in_rule__MigrationLibrary__Group__42350);
            rule__MigrationLibrary__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationLibrary__Group__4"


    // $ANTLR start "rule__MigrationLibrary__Group__4__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1115:1: rule__MigrationLibrary__Group__4__Impl : ( '}' ) ;
    public final void rule__MigrationLibrary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1119:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1120:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1120:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1121:1: '}'
            {
             before(grammarAccess.getMigrationLibraryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__MigrationLibrary__Group__4__Impl2378); 
             after(grammarAccess.getMigrationLibraryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationLibrary__Group__4__Impl"


    // $ANTLR start "rule__MigrationProgram__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1144:1: rule__MigrationProgram__Group__0 : rule__MigrationProgram__Group__0__Impl rule__MigrationProgram__Group__1 ;
    public final void rule__MigrationProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1148:1: ( rule__MigrationProgram__Group__0__Impl rule__MigrationProgram__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1149:2: rule__MigrationProgram__Group__0__Impl rule__MigrationProgram__Group__1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__0__Impl_in_rule__MigrationProgram__Group__02419);
            rule__MigrationProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__1_in_rule__MigrationProgram__Group__02422);
            rule__MigrationProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__0"


    // $ANTLR start "rule__MigrationProgram__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1156:1: rule__MigrationProgram__Group__0__Impl : ( ( rule__MigrationProgram__Group_0__0 )* ) ;
    public final void rule__MigrationProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1160:1: ( ( ( rule__MigrationProgram__Group_0__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1161:1: ( ( rule__MigrationProgram__Group_0__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1161:1: ( ( rule__MigrationProgram__Group_0__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1162:1: ( rule__MigrationProgram__Group_0__0 )*
            {
             before(grammarAccess.getMigrationProgramAccess().getGroup_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1163:1: ( rule__MigrationProgram__Group_0__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1163:2: rule__MigrationProgram__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__MigrationProgram__Group_0__0_in_rule__MigrationProgram__Group__0__Impl2449);
            	    rule__MigrationProgram__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMigrationProgramAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__0__Impl"


    // $ANTLR start "rule__MigrationProgram__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1173:1: rule__MigrationProgram__Group__1 : rule__MigrationProgram__Group__1__Impl rule__MigrationProgram__Group__2 ;
    public final void rule__MigrationProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1177:1: ( rule__MigrationProgram__Group__1__Impl rule__MigrationProgram__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1178:2: rule__MigrationProgram__Group__1__Impl rule__MigrationProgram__Group__2
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__1__Impl_in_rule__MigrationProgram__Group__12480);
            rule__MigrationProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__2_in_rule__MigrationProgram__Group__12483);
            rule__MigrationProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__1"


    // $ANTLR start "rule__MigrationProgram__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1185:1: rule__MigrationProgram__Group__1__Impl : ( ( rule__MigrationProgram__MigrAssignment_1 ) ) ;
    public final void rule__MigrationProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1189:1: ( ( ( rule__MigrationProgram__MigrAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1190:1: ( ( rule__MigrationProgram__MigrAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1190:1: ( ( rule__MigrationProgram__MigrAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1191:1: ( rule__MigrationProgram__MigrAssignment_1 )
            {
             before(grammarAccess.getMigrationProgramAccess().getMigrAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1192:1: ( rule__MigrationProgram__MigrAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1192:2: rule__MigrationProgram__MigrAssignment_1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__MigrAssignment_1_in_rule__MigrationProgram__Group__1__Impl2510);
            rule__MigrationProgram__MigrAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getMigrAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__1__Impl"


    // $ANTLR start "rule__MigrationProgram__Group__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1202:1: rule__MigrationProgram__Group__2 : rule__MigrationProgram__Group__2__Impl rule__MigrationProgram__Group__3 ;
    public final void rule__MigrationProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1206:1: ( rule__MigrationProgram__Group__2__Impl rule__MigrationProgram__Group__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1207:2: rule__MigrationProgram__Group__2__Impl rule__MigrationProgram__Group__3
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__2__Impl_in_rule__MigrationProgram__Group__22540);
            rule__MigrationProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__3_in_rule__MigrationProgram__Group__22543);
            rule__MigrationProgram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__2"


    // $ANTLR start "rule__MigrationProgram__Group__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1214:1: rule__MigrationProgram__Group__2__Impl : ( ( rule__MigrationProgram__TypeArtAssignment_2 ) ) ;
    public final void rule__MigrationProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1218:1: ( ( ( rule__MigrationProgram__TypeArtAssignment_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1219:1: ( ( rule__MigrationProgram__TypeArtAssignment_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1219:1: ( ( rule__MigrationProgram__TypeArtAssignment_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1220:1: ( rule__MigrationProgram__TypeArtAssignment_2 )
            {
             before(grammarAccess.getMigrationProgramAccess().getTypeArtAssignment_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1221:1: ( rule__MigrationProgram__TypeArtAssignment_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1221:2: rule__MigrationProgram__TypeArtAssignment_2
            {
            pushFollow(FOLLOW_rule__MigrationProgram__TypeArtAssignment_2_in_rule__MigrationProgram__Group__2__Impl2570);
            rule__MigrationProgram__TypeArtAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getTypeArtAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__2__Impl"


    // $ANTLR start "rule__MigrationProgram__Group__3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1231:1: rule__MigrationProgram__Group__3 : rule__MigrationProgram__Group__3__Impl rule__MigrationProgram__Group__4 ;
    public final void rule__MigrationProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1235:1: ( rule__MigrationProgram__Group__3__Impl rule__MigrationProgram__Group__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1236:2: rule__MigrationProgram__Group__3__Impl rule__MigrationProgram__Group__4
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__3__Impl_in_rule__MigrationProgram__Group__32600);
            rule__MigrationProgram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__4_in_rule__MigrationProgram__Group__32603);
            rule__MigrationProgram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__3"


    // $ANTLR start "rule__MigrationProgram__Group__3__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1243:1: rule__MigrationProgram__Group__3__Impl : ( ( rule__MigrationProgram__NameAssignment_3 ) ) ;
    public final void rule__MigrationProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1247:1: ( ( ( rule__MigrationProgram__NameAssignment_3 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1248:1: ( ( rule__MigrationProgram__NameAssignment_3 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1248:1: ( ( rule__MigrationProgram__NameAssignment_3 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1249:1: ( rule__MigrationProgram__NameAssignment_3 )
            {
             before(grammarAccess.getMigrationProgramAccess().getNameAssignment_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1250:1: ( rule__MigrationProgram__NameAssignment_3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1250:2: rule__MigrationProgram__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__MigrationProgram__NameAssignment_3_in_rule__MigrationProgram__Group__3__Impl2630);
            rule__MigrationProgram__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__3__Impl"


    // $ANTLR start "rule__MigrationProgram__Group__4"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1260:1: rule__MigrationProgram__Group__4 : rule__MigrationProgram__Group__4__Impl rule__MigrationProgram__Group__5 ;
    public final void rule__MigrationProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1264:1: ( rule__MigrationProgram__Group__4__Impl rule__MigrationProgram__Group__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1265:2: rule__MigrationProgram__Group__4__Impl rule__MigrationProgram__Group__5
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__4__Impl_in_rule__MigrationProgram__Group__42660);
            rule__MigrationProgram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__5_in_rule__MigrationProgram__Group__42663);
            rule__MigrationProgram__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__4"


    // $ANTLR start "rule__MigrationProgram__Group__4__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1272:1: rule__MigrationProgram__Group__4__Impl : ( ':' ) ;
    public final void rule__MigrationProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1276:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1277:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1277:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1278:1: ':'
            {
             before(grammarAccess.getMigrationProgramAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__MigrationProgram__Group__4__Impl2691); 
             after(grammarAccess.getMigrationProgramAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__4__Impl"


    // $ANTLR start "rule__MigrationProgram__Group__5"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1291:1: rule__MigrationProgram__Group__5 : rule__MigrationProgram__Group__5__Impl rule__MigrationProgram__Group__6 ;
    public final void rule__MigrationProgram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1295:1: ( rule__MigrationProgram__Group__5__Impl rule__MigrationProgram__Group__6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1296:2: rule__MigrationProgram__Group__5__Impl rule__MigrationProgram__Group__6
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__5__Impl_in_rule__MigrationProgram__Group__52722);
            rule__MigrationProgram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__6_in_rule__MigrationProgram__Group__52725);
            rule__MigrationProgram__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__5"


    // $ANTLR start "rule__MigrationProgram__Group__5__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1303:1: rule__MigrationProgram__Group__5__Impl : ( ( rule__MigrationProgram__Group_5__0 ) ) ;
    public final void rule__MigrationProgram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1307:1: ( ( ( rule__MigrationProgram__Group_5__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1308:1: ( ( rule__MigrationProgram__Group_5__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1308:1: ( ( rule__MigrationProgram__Group_5__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1309:1: ( rule__MigrationProgram__Group_5__0 )
            {
             before(grammarAccess.getMigrationProgramAccess().getGroup_5()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1310:1: ( rule__MigrationProgram__Group_5__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1310:2: rule__MigrationProgram__Group_5__0
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_5__0_in_rule__MigrationProgram__Group__5__Impl2752);
            rule__MigrationProgram__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__5__Impl"


    // $ANTLR start "rule__MigrationProgram__Group__6"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1320:1: rule__MigrationProgram__Group__6 : rule__MigrationProgram__Group__6__Impl rule__MigrationProgram__Group__7 ;
    public final void rule__MigrationProgram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1324:1: ( rule__MigrationProgram__Group__6__Impl rule__MigrationProgram__Group__7 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1325:2: rule__MigrationProgram__Group__6__Impl rule__MigrationProgram__Group__7
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__6__Impl_in_rule__MigrationProgram__Group__62782);
            rule__MigrationProgram__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__7_in_rule__MigrationProgram__Group__62785);
            rule__MigrationProgram__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__6"


    // $ANTLR start "rule__MigrationProgram__Group__6__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1332:1: rule__MigrationProgram__Group__6__Impl : ( 'with' ) ;
    public final void rule__MigrationProgram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1336:1: ( ( 'with' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1337:1: ( 'with' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1337:1: ( 'with' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1338:1: 'with'
            {
             before(grammarAccess.getMigrationProgramAccess().getWithKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__MigrationProgram__Group__6__Impl2813); 
             after(grammarAccess.getMigrationProgramAccess().getWithKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__6__Impl"


    // $ANTLR start "rule__MigrationProgram__Group__7"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1351:1: rule__MigrationProgram__Group__7 : rule__MigrationProgram__Group__7__Impl rule__MigrationProgram__Group__8 ;
    public final void rule__MigrationProgram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1355:1: ( rule__MigrationProgram__Group__7__Impl rule__MigrationProgram__Group__8 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1356:2: rule__MigrationProgram__Group__7__Impl rule__MigrationProgram__Group__8
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__7__Impl_in_rule__MigrationProgram__Group__72844);
            rule__MigrationProgram__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__8_in_rule__MigrationProgram__Group__72847);
            rule__MigrationProgram__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__7"


    // $ANTLR start "rule__MigrationProgram__Group__7__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1363:1: rule__MigrationProgram__Group__7__Impl : ( ( rule__MigrationProgram__DeltaAssignment_7 ) ) ;
    public final void rule__MigrationProgram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1367:1: ( ( ( rule__MigrationProgram__DeltaAssignment_7 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1368:1: ( ( rule__MigrationProgram__DeltaAssignment_7 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1368:1: ( ( rule__MigrationProgram__DeltaAssignment_7 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1369:1: ( rule__MigrationProgram__DeltaAssignment_7 )
            {
             before(grammarAccess.getMigrationProgramAccess().getDeltaAssignment_7()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1370:1: ( rule__MigrationProgram__DeltaAssignment_7 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1370:2: rule__MigrationProgram__DeltaAssignment_7
            {
            pushFollow(FOLLOW_rule__MigrationProgram__DeltaAssignment_7_in_rule__MigrationProgram__Group__7__Impl2874);
            rule__MigrationProgram__DeltaAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getDeltaAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__7__Impl"


    // $ANTLR start "rule__MigrationProgram__Group__8"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1380:1: rule__MigrationProgram__Group__8 : rule__MigrationProgram__Group__8__Impl rule__MigrationProgram__Group__9 ;
    public final void rule__MigrationProgram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1384:1: ( rule__MigrationProgram__Group__8__Impl rule__MigrationProgram__Group__9 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1385:2: rule__MigrationProgram__Group__8__Impl rule__MigrationProgram__Group__9
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__8__Impl_in_rule__MigrationProgram__Group__82904);
            rule__MigrationProgram__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__9_in_rule__MigrationProgram__Group__82907);
            rule__MigrationProgram__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__8"


    // $ANTLR start "rule__MigrationProgram__Group__8__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1392:1: rule__MigrationProgram__Group__8__Impl : ( '{' ) ;
    public final void rule__MigrationProgram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1396:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1397:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1397:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1398:1: '{'
            {
             before(grammarAccess.getMigrationProgramAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_17_in_rule__MigrationProgram__Group__8__Impl2935); 
             after(grammarAccess.getMigrationProgramAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__8__Impl"


    // $ANTLR start "rule__MigrationProgram__Group__9"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1411:1: rule__MigrationProgram__Group__9 : rule__MigrationProgram__Group__9__Impl rule__MigrationProgram__Group__10 ;
    public final void rule__MigrationProgram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1415:1: ( rule__MigrationProgram__Group__9__Impl rule__MigrationProgram__Group__10 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1416:2: rule__MigrationProgram__Group__9__Impl rule__MigrationProgram__Group__10
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__9__Impl_in_rule__MigrationProgram__Group__92966);
            rule__MigrationProgram__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__10_in_rule__MigrationProgram__Group__92969);
            rule__MigrationProgram__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__9"


    // $ANTLR start "rule__MigrationProgram__Group__9__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1423:1: rule__MigrationProgram__Group__9__Impl : ( ( rule__MigrationProgram__RulesAssignment_9 )* ) ;
    public final void rule__MigrationProgram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1427:1: ( ( ( rule__MigrationProgram__RulesAssignment_9 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1428:1: ( ( rule__MigrationProgram__RulesAssignment_9 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1428:1: ( ( rule__MigrationProgram__RulesAssignment_9 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1429:1: ( rule__MigrationProgram__RulesAssignment_9 )*
            {
             before(grammarAccess.getMigrationProgramAccess().getRulesAssignment_9()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1430:1: ( rule__MigrationProgram__RulesAssignment_9 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1430:2: rule__MigrationProgram__RulesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__MigrationProgram__RulesAssignment_9_in_rule__MigrationProgram__Group__9__Impl2996);
            	    rule__MigrationProgram__RulesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMigrationProgramAccess().getRulesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__9__Impl"


    // $ANTLR start "rule__MigrationProgram__Group__10"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1440:1: rule__MigrationProgram__Group__10 : rule__MigrationProgram__Group__10__Impl ;
    public final void rule__MigrationProgram__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1444:1: ( rule__MigrationProgram__Group__10__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1445:2: rule__MigrationProgram__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__10__Impl_in_rule__MigrationProgram__Group__103027);
            rule__MigrationProgram__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__10"


    // $ANTLR start "rule__MigrationProgram__Group__10__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1451:1: rule__MigrationProgram__Group__10__Impl : ( '}' ) ;
    public final void rule__MigrationProgram__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1455:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1456:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1456:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1457:1: '}'
            {
             before(grammarAccess.getMigrationProgramAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_18_in_rule__MigrationProgram__Group__10__Impl3055); 
             after(grammarAccess.getMigrationProgramAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group__10__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_0__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1492:1: rule__MigrationProgram__Group_0__0 : rule__MigrationProgram__Group_0__0__Impl rule__MigrationProgram__Group_0__1 ;
    public final void rule__MigrationProgram__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1496:1: ( rule__MigrationProgram__Group_0__0__Impl rule__MigrationProgram__Group_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1497:2: rule__MigrationProgram__Group_0__0__Impl rule__MigrationProgram__Group_0__1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_0__0__Impl_in_rule__MigrationProgram__Group_0__03108);
            rule__MigrationProgram__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group_0__1_in_rule__MigrationProgram__Group_0__03111);
            rule__MigrationProgram__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_0__0"


    // $ANTLR start "rule__MigrationProgram__Group_0__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1504:1: rule__MigrationProgram__Group_0__0__Impl : ( 'include' ) ;
    public final void rule__MigrationProgram__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1508:1: ( ( 'include' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1509:1: ( 'include' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1509:1: ( 'include' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1510:1: 'include'
            {
             before(grammarAccess.getMigrationProgramAccess().getIncludeKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__MigrationProgram__Group_0__0__Impl3139); 
             after(grammarAccess.getMigrationProgramAccess().getIncludeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_0__0__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_0__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1523:1: rule__MigrationProgram__Group_0__1 : rule__MigrationProgram__Group_0__1__Impl rule__MigrationProgram__Group_0__2 ;
    public final void rule__MigrationProgram__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1527:1: ( rule__MigrationProgram__Group_0__1__Impl rule__MigrationProgram__Group_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1528:2: rule__MigrationProgram__Group_0__1__Impl rule__MigrationProgram__Group_0__2
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_0__1__Impl_in_rule__MigrationProgram__Group_0__13170);
            rule__MigrationProgram__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group_0__2_in_rule__MigrationProgram__Group_0__13173);
            rule__MigrationProgram__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_0__1"


    // $ANTLR start "rule__MigrationProgram__Group_0__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1535:1: rule__MigrationProgram__Group_0__1__Impl : ( ( rule__MigrationProgram__LibsAssignment_0_1 ) ) ;
    public final void rule__MigrationProgram__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1539:1: ( ( ( rule__MigrationProgram__LibsAssignment_0_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1540:1: ( ( rule__MigrationProgram__LibsAssignment_0_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1540:1: ( ( rule__MigrationProgram__LibsAssignment_0_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1541:1: ( rule__MigrationProgram__LibsAssignment_0_1 )
            {
             before(grammarAccess.getMigrationProgramAccess().getLibsAssignment_0_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1542:1: ( rule__MigrationProgram__LibsAssignment_0_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1542:2: rule__MigrationProgram__LibsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__LibsAssignment_0_1_in_rule__MigrationProgram__Group_0__1__Impl3200);
            rule__MigrationProgram__LibsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getLibsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_0__1__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_0__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1552:1: rule__MigrationProgram__Group_0__2 : rule__MigrationProgram__Group_0__2__Impl ;
    public final void rule__MigrationProgram__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1556:1: ( rule__MigrationProgram__Group_0__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1557:2: rule__MigrationProgram__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_0__2__Impl_in_rule__MigrationProgram__Group_0__23230);
            rule__MigrationProgram__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_0__2"


    // $ANTLR start "rule__MigrationProgram__Group_0__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1563:1: rule__MigrationProgram__Group_0__2__Impl : ( ';' ) ;
    public final void rule__MigrationProgram__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1567:1: ( ( ';' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1568:1: ( ';' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1568:1: ( ';' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1569:1: ';'
            {
             before(grammarAccess.getMigrationProgramAccess().getSemicolonKeyword_0_2()); 
            match(input,14,FOLLOW_14_in_rule__MigrationProgram__Group_0__2__Impl3258); 
             after(grammarAccess.getMigrationProgramAccess().getSemicolonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_0__2__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_5__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1588:1: rule__MigrationProgram__Group_5__0 : rule__MigrationProgram__Group_5__0__Impl rule__MigrationProgram__Group_5__1 ;
    public final void rule__MigrationProgram__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1592:1: ( rule__MigrationProgram__Group_5__0__Impl rule__MigrationProgram__Group_5__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1593:2: rule__MigrationProgram__Group_5__0__Impl rule__MigrationProgram__Group_5__1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_5__0__Impl_in_rule__MigrationProgram__Group_5__03295);
            rule__MigrationProgram__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group_5__1_in_rule__MigrationProgram__Group_5__03298);
            rule__MigrationProgram__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_5__0"


    // $ANTLR start "rule__MigrationProgram__Group_5__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1600:1: rule__MigrationProgram__Group_5__0__Impl : ( ( rule__MigrationProgram__TransformationPackageAssignment_5_0 ) ) ;
    public final void rule__MigrationProgram__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1604:1: ( ( ( rule__MigrationProgram__TransformationPackageAssignment_5_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1605:1: ( ( rule__MigrationProgram__TransformationPackageAssignment_5_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1605:1: ( ( rule__MigrationProgram__TransformationPackageAssignment_5_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1606:1: ( rule__MigrationProgram__TransformationPackageAssignment_5_0 )
            {
             before(grammarAccess.getMigrationProgramAccess().getTransformationPackageAssignment_5_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1607:1: ( rule__MigrationProgram__TransformationPackageAssignment_5_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1607:2: rule__MigrationProgram__TransformationPackageAssignment_5_0
            {
            pushFollow(FOLLOW_rule__MigrationProgram__TransformationPackageAssignment_5_0_in_rule__MigrationProgram__Group_5__0__Impl3325);
            rule__MigrationProgram__TransformationPackageAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getTransformationPackageAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_5__0__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_5__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1617:1: rule__MigrationProgram__Group_5__1 : rule__MigrationProgram__Group_5__1__Impl ;
    public final void rule__MigrationProgram__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1621:1: ( rule__MigrationProgram__Group_5__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1622:2: rule__MigrationProgram__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_5__1__Impl_in_rule__MigrationProgram__Group_5__13355);
            rule__MigrationProgram__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_5__1"


    // $ANTLR start "rule__MigrationProgram__Group_5__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1628:1: rule__MigrationProgram__Group_5__1__Impl : ( ( rule__MigrationProgram__Group_5_1__0 ) ) ;
    public final void rule__MigrationProgram__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1632:1: ( ( ( rule__MigrationProgram__Group_5_1__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1633:1: ( ( rule__MigrationProgram__Group_5_1__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1633:1: ( ( rule__MigrationProgram__Group_5_1__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1634:1: ( rule__MigrationProgram__Group_5_1__0 )
            {
             before(grammarAccess.getMigrationProgramAccess().getGroup_5_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1635:1: ( rule__MigrationProgram__Group_5_1__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1635:2: rule__MigrationProgram__Group_5_1__0
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_5_1__0_in_rule__MigrationProgram__Group_5__1__Impl3382);
            rule__MigrationProgram__Group_5_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_5__1__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_5_1__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1649:1: rule__MigrationProgram__Group_5_1__0 : rule__MigrationProgram__Group_5_1__0__Impl rule__MigrationProgram__Group_5_1__1 ;
    public final void rule__MigrationProgram__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1653:1: ( rule__MigrationProgram__Group_5_1__0__Impl rule__MigrationProgram__Group_5_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1654:2: rule__MigrationProgram__Group_5_1__0__Impl rule__MigrationProgram__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_5_1__0__Impl_in_rule__MigrationProgram__Group_5_1__03416);
            rule__MigrationProgram__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group_5_1__1_in_rule__MigrationProgram__Group_5_1__03419);
            rule__MigrationProgram__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_5_1__0"


    // $ANTLR start "rule__MigrationProgram__Group_5_1__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1661:1: rule__MigrationProgram__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__MigrationProgram__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1665:1: ( ( ',' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1666:1: ( ',' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1666:1: ( ',' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1667:1: ','
            {
             before(grammarAccess.getMigrationProgramAccess().getCommaKeyword_5_1_0()); 
            match(input,22,FOLLOW_22_in_rule__MigrationProgram__Group_5_1__0__Impl3447); 
             after(grammarAccess.getMigrationProgramAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_5_1__0__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_5_1__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1680:1: rule__MigrationProgram__Group_5_1__1 : rule__MigrationProgram__Group_5_1__1__Impl ;
    public final void rule__MigrationProgram__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1684:1: ( rule__MigrationProgram__Group_5_1__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1685:2: rule__MigrationProgram__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_5_1__1__Impl_in_rule__MigrationProgram__Group_5_1__13478);
            rule__MigrationProgram__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_5_1__1"


    // $ANTLR start "rule__MigrationProgram__Group_5_1__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1691:1: rule__MigrationProgram__Group_5_1__1__Impl : ( ( rule__MigrationProgram__TransformationPackageAssignment_5_1_1 ) ) ;
    public final void rule__MigrationProgram__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1695:1: ( ( ( rule__MigrationProgram__TransformationPackageAssignment_5_1_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1696:1: ( ( rule__MigrationProgram__TransformationPackageAssignment_5_1_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1696:1: ( ( rule__MigrationProgram__TransformationPackageAssignment_5_1_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1697:1: ( rule__MigrationProgram__TransformationPackageAssignment_5_1_1 )
            {
             before(grammarAccess.getMigrationProgramAccess().getTransformationPackageAssignment_5_1_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1698:1: ( rule__MigrationProgram__TransformationPackageAssignment_5_1_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1698:2: rule__MigrationProgram__TransformationPackageAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__TransformationPackageAssignment_5_1_1_in_rule__MigrationProgram__Group_5_1__1__Impl3505);
            rule__MigrationProgram__TransformationPackageAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getTransformationPackageAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__Group_5_1__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1712:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1716:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1717:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03539);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03542);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1724:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1728:1: ( ( 'rule' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1729:1: ( 'rule' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1729:1: ( 'rule' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1730:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Rule__Group__0__Impl3570); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1743:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1747:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1748:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13601);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__13604);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1755:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1759:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1760:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1760:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1761:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1762:1: ( rule__Rule__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1762:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl3631);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1772:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1776:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1777:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__23661);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__23664);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1784:1: rule__Rule__Group__2__Impl : ( '[' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1788:1: ( ( '[' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1789:1: ( '[' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1789:1: ( '[' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1790:1: '['
            {
             before(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Rule__Group__2__Impl3692); 
             after(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1803:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1807:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1808:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__33723);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__33726);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1815:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__FilterAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1819:1: ( ( ( rule__Rule__FilterAssignment_3 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1820:1: ( ( rule__Rule__FilterAssignment_3 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1820:1: ( ( rule__Rule__FilterAssignment_3 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1821:1: ( rule__Rule__FilterAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getFilterAssignment_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1822:1: ( rule__Rule__FilterAssignment_3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1822:2: rule__Rule__FilterAssignment_3
            {
            pushFollow(FOLLOW_rule__Rule__FilterAssignment_3_in_rule__Rule__Group__3__Impl3753);
            rule__Rule__FilterAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getFilterAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1832:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1836:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1837:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__43783);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__43786);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1844:1: rule__Rule__Group__4__Impl : ( ']' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1848:1: ( ( ']' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1849:1: ( ']' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1849:1: ( ']' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1850:1: ']'
            {
             before(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Rule__Group__4__Impl3814); 
             after(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1863:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1867:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1868:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__53845);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__53848);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1875:1: rule__Rule__Group__5__Impl : ( '{' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1879:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1880:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1880:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1881:1: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Rule__Group__5__Impl3876); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1894:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1898:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1899:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__63907);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__63910);
            rule__Rule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1906:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__RewritingRulesAssignment_6 )* ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1910:1: ( ( ( rule__Rule__RewritingRulesAssignment_6 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1911:1: ( ( rule__Rule__RewritingRulesAssignment_6 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1911:1: ( ( rule__Rule__RewritingRulesAssignment_6 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1912:1: ( rule__Rule__RewritingRulesAssignment_6 )*
            {
             before(grammarAccess.getRuleAccess().getRewritingRulesAssignment_6()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1913:1: ( rule__Rule__RewritingRulesAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1913:2: rule__Rule__RewritingRulesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Rule__RewritingRulesAssignment_6_in_rule__Rule__Group__6__Impl3937);
            	    rule__Rule__RewritingRulesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getRewritingRulesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1923:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1927:1: ( rule__Rule__Group__7__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1928:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__73968);
            rule__Rule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1934:1: rule__Rule__Group__7__Impl : ( '}' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1938:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1939:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1939:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1940:1: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__Rule__Group__7__Impl3996); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1969:1: rule__EPackageOpDef__Group__0 : rule__EPackageOpDef__Group__0__Impl rule__EPackageOpDef__Group__1 ;
    public final void rule__EPackageOpDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1973:1: ( rule__EPackageOpDef__Group__0__Impl rule__EPackageOpDef__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1974:2: rule__EPackageOpDef__Group__0__Impl rule__EPackageOpDef__Group__1
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group__0__Impl_in_rule__EPackageOpDef__Group__04043);
            rule__EPackageOpDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group__1_in_rule__EPackageOpDef__Group__04046);
            rule__EPackageOpDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group__0"


    // $ANTLR start "rule__EPackageOpDef__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1981:1: rule__EPackageOpDef__Group__0__Impl : ( ( rule__EPackageOpDef__Group_0__0 ) ) ;
    public final void rule__EPackageOpDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1985:1: ( ( ( rule__EPackageOpDef__Group_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1986:1: ( ( rule__EPackageOpDef__Group_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1986:1: ( ( rule__EPackageOpDef__Group_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1987:1: ( rule__EPackageOpDef__Group_0__0 )
            {
             before(grammarAccess.getEPackageOpDefAccess().getGroup_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1988:1: ( rule__EPackageOpDef__Group_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1988:2: rule__EPackageOpDef__Group_0__0
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_0__0_in_rule__EPackageOpDef__Group__0__Impl4073);
            rule__EPackageOpDef__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getEPackageOpDefAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group__0__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1998:1: rule__EPackageOpDef__Group__1 : rule__EPackageOpDef__Group__1__Impl ;
    public final void rule__EPackageOpDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2002:1: ( rule__EPackageOpDef__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2003:2: rule__EPackageOpDef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group__1__Impl_in_rule__EPackageOpDef__Group__14103);
            rule__EPackageOpDef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group__1"


    // $ANTLR start "rule__EPackageOpDef__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2009:1: rule__EPackageOpDef__Group__1__Impl : ( ( rule__EPackageOpDef__Group_1__0 ) ) ;
    public final void rule__EPackageOpDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2013:1: ( ( ( rule__EPackageOpDef__Group_1__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2014:1: ( ( rule__EPackageOpDef__Group_1__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2014:1: ( ( rule__EPackageOpDef__Group_1__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2015:1: ( rule__EPackageOpDef__Group_1__0 )
            {
             before(grammarAccess.getEPackageOpDefAccess().getGroup_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2016:1: ( rule__EPackageOpDef__Group_1__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2016:2: rule__EPackageOpDef__Group_1__0
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__0_in_rule__EPackageOpDef__Group__1__Impl4130);
            rule__EPackageOpDef__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEPackageOpDefAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group__1__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group_0__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2030:1: rule__EPackageOpDef__Group_0__0 : rule__EPackageOpDef__Group_0__0__Impl rule__EPackageOpDef__Group_0__1 ;
    public final void rule__EPackageOpDef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2034:1: ( rule__EPackageOpDef__Group_0__0__Impl rule__EPackageOpDef__Group_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2035:2: rule__EPackageOpDef__Group_0__0__Impl rule__EPackageOpDef__Group_0__1
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_0__0__Impl_in_rule__EPackageOpDef__Group_0__04164);
            rule__EPackageOpDef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_0__1_in_rule__EPackageOpDef__Group_0__04167);
            rule__EPackageOpDef__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_0__0"


    // $ANTLR start "rule__EPackageOpDef__Group_0__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2042:1: rule__EPackageOpDef__Group_0__0__Impl : ( 'package' ) ;
    public final void rule__EPackageOpDef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2046:1: ( ( 'package' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2047:1: ( 'package' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2047:1: ( 'package' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2048:1: 'package'
            {
             before(grammarAccess.getEPackageOpDefAccess().getPackageKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__EPackageOpDef__Group_0__0__Impl4195); 
             after(grammarAccess.getEPackageOpDefAccess().getPackageKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_0__0__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group_0__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2061:1: rule__EPackageOpDef__Group_0__1 : rule__EPackageOpDef__Group_0__1__Impl rule__EPackageOpDef__Group_0__2 ;
    public final void rule__EPackageOpDef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2065:1: ( rule__EPackageOpDef__Group_0__1__Impl rule__EPackageOpDef__Group_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2066:2: rule__EPackageOpDef__Group_0__1__Impl rule__EPackageOpDef__Group_0__2
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_0__1__Impl_in_rule__EPackageOpDef__Group_0__14226);
            rule__EPackageOpDef__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_0__2_in_rule__EPackageOpDef__Group_0__14229);
            rule__EPackageOpDef__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_0__1"


    // $ANTLR start "rule__EPackageOpDef__Group_0__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2073:1: rule__EPackageOpDef__Group_0__1__Impl : ( ( rule__EPackageOpDef__VarAssignment_0_1 ) ) ;
    public final void rule__EPackageOpDef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2077:1: ( ( ( rule__EPackageOpDef__VarAssignment_0_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2078:1: ( ( rule__EPackageOpDef__VarAssignment_0_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2078:1: ( ( rule__EPackageOpDef__VarAssignment_0_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2079:1: ( rule__EPackageOpDef__VarAssignment_0_1 )
            {
             before(grammarAccess.getEPackageOpDefAccess().getVarAssignment_0_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2080:1: ( rule__EPackageOpDef__VarAssignment_0_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2080:2: rule__EPackageOpDef__VarAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__VarAssignment_0_1_in_rule__EPackageOpDef__Group_0__1__Impl4256);
            rule__EPackageOpDef__VarAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEPackageOpDefAccess().getVarAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_0__1__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group_0__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2090:1: rule__EPackageOpDef__Group_0__2 : rule__EPackageOpDef__Group_0__2__Impl ;
    public final void rule__EPackageOpDef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2094:1: ( rule__EPackageOpDef__Group_0__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2095:2: rule__EPackageOpDef__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_0__2__Impl_in_rule__EPackageOpDef__Group_0__24286);
            rule__EPackageOpDef__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_0__2"


    // $ANTLR start "rule__EPackageOpDef__Group_0__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2101:1: rule__EPackageOpDef__Group_0__2__Impl : ( '=' ) ;
    public final void rule__EPackageOpDef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2105:1: ( ( '=' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2106:1: ( '=' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2106:1: ( '=' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2107:1: '='
            {
             before(grammarAccess.getEPackageOpDefAccess().getEqualsSignKeyword_0_2()); 
            match(input,27,FOLLOW_27_in_rule__EPackageOpDef__Group_0__2__Impl4314); 
             after(grammarAccess.getEPackageOpDefAccess().getEqualsSignKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_0__2__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group_1__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2126:1: rule__EPackageOpDef__Group_1__0 : rule__EPackageOpDef__Group_1__0__Impl rule__EPackageOpDef__Group_1__1 ;
    public final void rule__EPackageOpDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2130:1: ( rule__EPackageOpDef__Group_1__0__Impl rule__EPackageOpDef__Group_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2131:2: rule__EPackageOpDef__Group_1__0__Impl rule__EPackageOpDef__Group_1__1
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__0__Impl_in_rule__EPackageOpDef__Group_1__04351);
            rule__EPackageOpDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__1_in_rule__EPackageOpDef__Group_1__04354);
            rule__EPackageOpDef__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__0"


    // $ANTLR start "rule__EPackageOpDef__Group_1__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2138:1: rule__EPackageOpDef__Group_1__0__Impl : ( ( rule__EPackageOpDef__Alternatives_1_0 ) ) ;
    public final void rule__EPackageOpDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2142:1: ( ( ( rule__EPackageOpDef__Alternatives_1_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2143:1: ( ( rule__EPackageOpDef__Alternatives_1_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2143:1: ( ( rule__EPackageOpDef__Alternatives_1_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2144:1: ( rule__EPackageOpDef__Alternatives_1_0 )
            {
             before(grammarAccess.getEPackageOpDefAccess().getAlternatives_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2145:1: ( rule__EPackageOpDef__Alternatives_1_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2145:2: rule__EPackageOpDef__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Alternatives_1_0_in_rule__EPackageOpDef__Group_1__0__Impl4381);
            rule__EPackageOpDef__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEPackageOpDefAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__0__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group_1__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2155:1: rule__EPackageOpDef__Group_1__1 : rule__EPackageOpDef__Group_1__1__Impl rule__EPackageOpDef__Group_1__2 ;
    public final void rule__EPackageOpDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2159:1: ( rule__EPackageOpDef__Group_1__1__Impl rule__EPackageOpDef__Group_1__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2160:2: rule__EPackageOpDef__Group_1__1__Impl rule__EPackageOpDef__Group_1__2
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__1__Impl_in_rule__EPackageOpDef__Group_1__14411);
            rule__EPackageOpDef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__2_in_rule__EPackageOpDef__Group_1__14414);
            rule__EPackageOpDef__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__1"


    // $ANTLR start "rule__EPackageOpDef__Group_1__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2167:1: rule__EPackageOpDef__Group_1__1__Impl : ( '(' ) ;
    public final void rule__EPackageOpDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2171:1: ( ( '(' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2172:1: ( '(' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2172:1: ( '(' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2173:1: '('
            {
             before(grammarAccess.getEPackageOpDefAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__EPackageOpDef__Group_1__1__Impl4442); 
             after(grammarAccess.getEPackageOpDefAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__1__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group_1__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2186:1: rule__EPackageOpDef__Group_1__2 : rule__EPackageOpDef__Group_1__2__Impl rule__EPackageOpDef__Group_1__3 ;
    public final void rule__EPackageOpDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2190:1: ( rule__EPackageOpDef__Group_1__2__Impl rule__EPackageOpDef__Group_1__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2191:2: rule__EPackageOpDef__Group_1__2__Impl rule__EPackageOpDef__Group_1__3
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__2__Impl_in_rule__EPackageOpDef__Group_1__24473);
            rule__EPackageOpDef__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__3_in_rule__EPackageOpDef__Group_1__24476);
            rule__EPackageOpDef__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__2"


    // $ANTLR start "rule__EPackageOpDef__Group_1__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2198:1: rule__EPackageOpDef__Group_1__2__Impl : ( ( rule__EPackageOpDef__RefAssignment_1_2 ) ) ;
    public final void rule__EPackageOpDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2202:1: ( ( ( rule__EPackageOpDef__RefAssignment_1_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2203:1: ( ( rule__EPackageOpDef__RefAssignment_1_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2203:1: ( ( rule__EPackageOpDef__RefAssignment_1_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2204:1: ( rule__EPackageOpDef__RefAssignment_1_2 )
            {
             before(grammarAccess.getEPackageOpDefAccess().getRefAssignment_1_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2205:1: ( rule__EPackageOpDef__RefAssignment_1_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2205:2: rule__EPackageOpDef__RefAssignment_1_2
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__RefAssignment_1_2_in_rule__EPackageOpDef__Group_1__2__Impl4503);
            rule__EPackageOpDef__RefAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEPackageOpDefAccess().getRefAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__2__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group_1__3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2215:1: rule__EPackageOpDef__Group_1__3 : rule__EPackageOpDef__Group_1__3__Impl rule__EPackageOpDef__Group_1__4 ;
    public final void rule__EPackageOpDef__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2219:1: ( rule__EPackageOpDef__Group_1__3__Impl rule__EPackageOpDef__Group_1__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2220:2: rule__EPackageOpDef__Group_1__3__Impl rule__EPackageOpDef__Group_1__4
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__3__Impl_in_rule__EPackageOpDef__Group_1__34533);
            rule__EPackageOpDef__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__4_in_rule__EPackageOpDef__Group_1__34536);
            rule__EPackageOpDef__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__3"


    // $ANTLR start "rule__EPackageOpDef__Group_1__3__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2227:1: rule__EPackageOpDef__Group_1__3__Impl : ( ':' ) ;
    public final void rule__EPackageOpDef__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2231:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2232:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2232:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2233:1: ':'
            {
             before(grammarAccess.getEPackageOpDefAccess().getColonKeyword_1_3()); 
            match(input,19,FOLLOW_19_in_rule__EPackageOpDef__Group_1__3__Impl4564); 
             after(grammarAccess.getEPackageOpDefAccess().getColonKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__3__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group_1__4"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2246:1: rule__EPackageOpDef__Group_1__4 : rule__EPackageOpDef__Group_1__4__Impl rule__EPackageOpDef__Group_1__5 ;
    public final void rule__EPackageOpDef__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2250:1: ( rule__EPackageOpDef__Group_1__4__Impl rule__EPackageOpDef__Group_1__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2251:2: rule__EPackageOpDef__Group_1__4__Impl rule__EPackageOpDef__Group_1__5
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__4__Impl_in_rule__EPackageOpDef__Group_1__44595);
            rule__EPackageOpDef__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__5_in_rule__EPackageOpDef__Group_1__44598);
            rule__EPackageOpDef__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__4"


    // $ANTLR start "rule__EPackageOpDef__Group_1__4__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2258:1: rule__EPackageOpDef__Group_1__4__Impl : ( 'package' ) ;
    public final void rule__EPackageOpDef__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2262:1: ( ( 'package' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2263:1: ( 'package' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2263:1: ( 'package' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2264:1: 'package'
            {
             before(grammarAccess.getEPackageOpDefAccess().getPackageKeyword_1_4()); 
            match(input,26,FOLLOW_26_in_rule__EPackageOpDef__Group_1__4__Impl4626); 
             after(grammarAccess.getEPackageOpDefAccess().getPackageKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__4__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group_1__5"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2277:1: rule__EPackageOpDef__Group_1__5 : rule__EPackageOpDef__Group_1__5__Impl rule__EPackageOpDef__Group_1__6 ;
    public final void rule__EPackageOpDef__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2281:1: ( rule__EPackageOpDef__Group_1__5__Impl rule__EPackageOpDef__Group_1__6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2282:2: rule__EPackageOpDef__Group_1__5__Impl rule__EPackageOpDef__Group_1__6
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__5__Impl_in_rule__EPackageOpDef__Group_1__54657);
            rule__EPackageOpDef__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__6_in_rule__EPackageOpDef__Group_1__54660);
            rule__EPackageOpDef__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__5"


    // $ANTLR start "rule__EPackageOpDef__Group_1__5__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2289:1: rule__EPackageOpDef__Group_1__5__Impl : ( ')' ) ;
    public final void rule__EPackageOpDef__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2293:1: ( ( ')' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2294:1: ( ')' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2294:1: ( ')' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2295:1: ')'
            {
             before(grammarAccess.getEPackageOpDefAccess().getRightParenthesisKeyword_1_5()); 
            match(input,29,FOLLOW_29_in_rule__EPackageOpDef__Group_1__5__Impl4688); 
             after(grammarAccess.getEPackageOpDefAccess().getRightParenthesisKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__5__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group_1__6"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2308:1: rule__EPackageOpDef__Group_1__6 : rule__EPackageOpDef__Group_1__6__Impl rule__EPackageOpDef__Group_1__7 ;
    public final void rule__EPackageOpDef__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2312:1: ( rule__EPackageOpDef__Group_1__6__Impl rule__EPackageOpDef__Group_1__7 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2313:2: rule__EPackageOpDef__Group_1__6__Impl rule__EPackageOpDef__Group_1__7
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__6__Impl_in_rule__EPackageOpDef__Group_1__64719);
            rule__EPackageOpDef__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__7_in_rule__EPackageOpDef__Group_1__64722);
            rule__EPackageOpDef__Group_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__6"


    // $ANTLR start "rule__EPackageOpDef__Group_1__6__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2320:1: rule__EPackageOpDef__Group_1__6__Impl : ( 'where' ) ;
    public final void rule__EPackageOpDef__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2324:1: ( ( 'where' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2325:1: ( 'where' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2325:1: ( 'where' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2326:1: 'where'
            {
             before(grammarAccess.getEPackageOpDefAccess().getWhereKeyword_1_6()); 
            match(input,30,FOLLOW_30_in_rule__EPackageOpDef__Group_1__6__Impl4750); 
             after(grammarAccess.getEPackageOpDefAccess().getWhereKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__6__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group_1__7"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2339:1: rule__EPackageOpDef__Group_1__7 : rule__EPackageOpDef__Group_1__7__Impl rule__EPackageOpDef__Group_1__8 ;
    public final void rule__EPackageOpDef__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2343:1: ( rule__EPackageOpDef__Group_1__7__Impl rule__EPackageOpDef__Group_1__8 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2344:2: rule__EPackageOpDef__Group_1__7__Impl rule__EPackageOpDef__Group_1__8
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__7__Impl_in_rule__EPackageOpDef__Group_1__74781);
            rule__EPackageOpDef__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__8_in_rule__EPackageOpDef__Group_1__74784);
            rule__EPackageOpDef__Group_1__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__7"


    // $ANTLR start "rule__EPackageOpDef__Group_1__7__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2351:1: rule__EPackageOpDef__Group_1__7__Impl : ( '{' ) ;
    public final void rule__EPackageOpDef__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2355:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2356:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2356:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2357:1: '{'
            {
             before(grammarAccess.getEPackageOpDefAccess().getLeftCurlyBracketKeyword_1_7()); 
            match(input,17,FOLLOW_17_in_rule__EPackageOpDef__Group_1__7__Impl4812); 
             after(grammarAccess.getEPackageOpDefAccess().getLeftCurlyBracketKeyword_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__7__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group_1__8"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2370:1: rule__EPackageOpDef__Group_1__8 : rule__EPackageOpDef__Group_1__8__Impl rule__EPackageOpDef__Group_1__9 ;
    public final void rule__EPackageOpDef__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2374:1: ( rule__EPackageOpDef__Group_1__8__Impl rule__EPackageOpDef__Group_1__9 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2375:2: rule__EPackageOpDef__Group_1__8__Impl rule__EPackageOpDef__Group_1__9
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__8__Impl_in_rule__EPackageOpDef__Group_1__84843);
            rule__EPackageOpDef__Group_1__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__9_in_rule__EPackageOpDef__Group_1__84846);
            rule__EPackageOpDef__Group_1__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__8"


    // $ANTLR start "rule__EPackageOpDef__Group_1__8__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2382:1: rule__EPackageOpDef__Group_1__8__Impl : ( ( rule__EPackageOpDef__Alternatives_1_8 )* ) ;
    public final void rule__EPackageOpDef__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2386:1: ( ( ( rule__EPackageOpDef__Alternatives_1_8 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2387:1: ( ( rule__EPackageOpDef__Alternatives_1_8 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2387:1: ( ( rule__EPackageOpDef__Alternatives_1_8 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2388:1: ( rule__EPackageOpDef__Alternatives_1_8 )*
            {
             before(grammarAccess.getEPackageOpDefAccess().getAlternatives_1_8()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2389:1: ( rule__EPackageOpDef__Alternatives_1_8 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31||LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2389:2: rule__EPackageOpDef__Alternatives_1_8
            	    {
            	    pushFollow(FOLLOW_rule__EPackageOpDef__Alternatives_1_8_in_rule__EPackageOpDef__Group_1__8__Impl4873);
            	    rule__EPackageOpDef__Alternatives_1_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEPackageOpDefAccess().getAlternatives_1_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__8__Impl"


    // $ANTLR start "rule__EPackageOpDef__Group_1__9"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2399:1: rule__EPackageOpDef__Group_1__9 : rule__EPackageOpDef__Group_1__9__Impl ;
    public final void rule__EPackageOpDef__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2403:1: ( rule__EPackageOpDef__Group_1__9__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2404:2: rule__EPackageOpDef__Group_1__9__Impl
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__9__Impl_in_rule__EPackageOpDef__Group_1__94904);
            rule__EPackageOpDef__Group_1__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__9"


    // $ANTLR start "rule__EPackageOpDef__Group_1__9__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2410:1: rule__EPackageOpDef__Group_1__9__Impl : ( '}' ) ;
    public final void rule__EPackageOpDef__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2414:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2415:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2415:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2416:1: '}'
            {
             before(grammarAccess.getEPackageOpDefAccess().getRightCurlyBracketKeyword_1_9()); 
            match(input,18,FOLLOW_18_in_rule__EPackageOpDef__Group_1__9__Impl4932); 
             after(grammarAccess.getEPackageOpDefAccess().getRightCurlyBracketKeyword_1_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__Group_1__9__Impl"


    // $ANTLR start "rule__EClassOpDef__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2449:1: rule__EClassOpDef__Group__0 : rule__EClassOpDef__Group__0__Impl rule__EClassOpDef__Group__1 ;
    public final void rule__EClassOpDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2453:1: ( rule__EClassOpDef__Group__0__Impl rule__EClassOpDef__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2454:2: rule__EClassOpDef__Group__0__Impl rule__EClassOpDef__Group__1
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group__0__Impl_in_rule__EClassOpDef__Group__04983);
            rule__EClassOpDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group__1_in_rule__EClassOpDef__Group__04986);
            rule__EClassOpDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group__0"


    // $ANTLR start "rule__EClassOpDef__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2461:1: rule__EClassOpDef__Group__0__Impl : ( ( rule__EClassOpDef__Group_0__0 ) ) ;
    public final void rule__EClassOpDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2465:1: ( ( ( rule__EClassOpDef__Group_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2466:1: ( ( rule__EClassOpDef__Group_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2466:1: ( ( rule__EClassOpDef__Group_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2467:1: ( rule__EClassOpDef__Group_0__0 )
            {
             before(grammarAccess.getEClassOpDefAccess().getGroup_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2468:1: ( rule__EClassOpDef__Group_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2468:2: rule__EClassOpDef__Group_0__0
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_0__0_in_rule__EClassOpDef__Group__0__Impl5013);
            rule__EClassOpDef__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getEClassOpDefAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group__0__Impl"


    // $ANTLR start "rule__EClassOpDef__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2478:1: rule__EClassOpDef__Group__1 : rule__EClassOpDef__Group__1__Impl ;
    public final void rule__EClassOpDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2482:1: ( rule__EClassOpDef__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2483:2: rule__EClassOpDef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group__1__Impl_in_rule__EClassOpDef__Group__15043);
            rule__EClassOpDef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group__1"


    // $ANTLR start "rule__EClassOpDef__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2489:1: rule__EClassOpDef__Group__1__Impl : ( ( rule__EClassOpDef__Group_1__0 ) ) ;
    public final void rule__EClassOpDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2493:1: ( ( ( rule__EClassOpDef__Group_1__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2494:1: ( ( rule__EClassOpDef__Group_1__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2494:1: ( ( rule__EClassOpDef__Group_1__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2495:1: ( rule__EClassOpDef__Group_1__0 )
            {
             before(grammarAccess.getEClassOpDefAccess().getGroup_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2496:1: ( rule__EClassOpDef__Group_1__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2496:2: rule__EClassOpDef__Group_1__0
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__0_in_rule__EClassOpDef__Group__1__Impl5070);
            rule__EClassOpDef__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEClassOpDefAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group__1__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_0__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2510:1: rule__EClassOpDef__Group_0__0 : rule__EClassOpDef__Group_0__0__Impl rule__EClassOpDef__Group_0__1 ;
    public final void rule__EClassOpDef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2514:1: ( rule__EClassOpDef__Group_0__0__Impl rule__EClassOpDef__Group_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2515:2: rule__EClassOpDef__Group_0__0__Impl rule__EClassOpDef__Group_0__1
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_0__0__Impl_in_rule__EClassOpDef__Group_0__05104);
            rule__EClassOpDef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_0__1_in_rule__EClassOpDef__Group_0__05107);
            rule__EClassOpDef__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_0__0"


    // $ANTLR start "rule__EClassOpDef__Group_0__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2522:1: rule__EClassOpDef__Group_0__0__Impl : ( 'class' ) ;
    public final void rule__EClassOpDef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2526:1: ( ( 'class' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2527:1: ( 'class' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2527:1: ( 'class' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2528:1: 'class'
            {
             before(grammarAccess.getEClassOpDefAccess().getClassKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__EClassOpDef__Group_0__0__Impl5135); 
             after(grammarAccess.getEClassOpDefAccess().getClassKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_0__0__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_0__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2541:1: rule__EClassOpDef__Group_0__1 : rule__EClassOpDef__Group_0__1__Impl rule__EClassOpDef__Group_0__2 ;
    public final void rule__EClassOpDef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2545:1: ( rule__EClassOpDef__Group_0__1__Impl rule__EClassOpDef__Group_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2546:2: rule__EClassOpDef__Group_0__1__Impl rule__EClassOpDef__Group_0__2
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_0__1__Impl_in_rule__EClassOpDef__Group_0__15166);
            rule__EClassOpDef__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_0__2_in_rule__EClassOpDef__Group_0__15169);
            rule__EClassOpDef__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_0__1"


    // $ANTLR start "rule__EClassOpDef__Group_0__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2553:1: rule__EClassOpDef__Group_0__1__Impl : ( ( rule__EClassOpDef__VarAssignment_0_1 ) ) ;
    public final void rule__EClassOpDef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2557:1: ( ( ( rule__EClassOpDef__VarAssignment_0_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2558:1: ( ( rule__EClassOpDef__VarAssignment_0_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2558:1: ( ( rule__EClassOpDef__VarAssignment_0_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2559:1: ( rule__EClassOpDef__VarAssignment_0_1 )
            {
             before(grammarAccess.getEClassOpDefAccess().getVarAssignment_0_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2560:1: ( rule__EClassOpDef__VarAssignment_0_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2560:2: rule__EClassOpDef__VarAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EClassOpDef__VarAssignment_0_1_in_rule__EClassOpDef__Group_0__1__Impl5196);
            rule__EClassOpDef__VarAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEClassOpDefAccess().getVarAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_0__1__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_0__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2570:1: rule__EClassOpDef__Group_0__2 : rule__EClassOpDef__Group_0__2__Impl ;
    public final void rule__EClassOpDef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2574:1: ( rule__EClassOpDef__Group_0__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2575:2: rule__EClassOpDef__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_0__2__Impl_in_rule__EClassOpDef__Group_0__25226);
            rule__EClassOpDef__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_0__2"


    // $ANTLR start "rule__EClassOpDef__Group_0__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2581:1: rule__EClassOpDef__Group_0__2__Impl : ( '=' ) ;
    public final void rule__EClassOpDef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2585:1: ( ( '=' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2586:1: ( '=' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2586:1: ( '=' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2587:1: '='
            {
             before(grammarAccess.getEClassOpDefAccess().getEqualsSignKeyword_0_2()); 
            match(input,27,FOLLOW_27_in_rule__EClassOpDef__Group_0__2__Impl5254); 
             after(grammarAccess.getEClassOpDefAccess().getEqualsSignKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_0__2__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_1__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2606:1: rule__EClassOpDef__Group_1__0 : rule__EClassOpDef__Group_1__0__Impl rule__EClassOpDef__Group_1__1 ;
    public final void rule__EClassOpDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2610:1: ( rule__EClassOpDef__Group_1__0__Impl rule__EClassOpDef__Group_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2611:2: rule__EClassOpDef__Group_1__0__Impl rule__EClassOpDef__Group_1__1
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__0__Impl_in_rule__EClassOpDef__Group_1__05291);
            rule__EClassOpDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__1_in_rule__EClassOpDef__Group_1__05294);
            rule__EClassOpDef__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__0"


    // $ANTLR start "rule__EClassOpDef__Group_1__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2618:1: rule__EClassOpDef__Group_1__0__Impl : ( ( rule__EClassOpDef__Alternatives_1_0 ) ) ;
    public final void rule__EClassOpDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2622:1: ( ( ( rule__EClassOpDef__Alternatives_1_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2623:1: ( ( rule__EClassOpDef__Alternatives_1_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2623:1: ( ( rule__EClassOpDef__Alternatives_1_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2624:1: ( rule__EClassOpDef__Alternatives_1_0 )
            {
             before(grammarAccess.getEClassOpDefAccess().getAlternatives_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2625:1: ( rule__EClassOpDef__Alternatives_1_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2625:2: rule__EClassOpDef__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Alternatives_1_0_in_rule__EClassOpDef__Group_1__0__Impl5321);
            rule__EClassOpDef__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEClassOpDefAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__0__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_1__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2635:1: rule__EClassOpDef__Group_1__1 : rule__EClassOpDef__Group_1__1__Impl rule__EClassOpDef__Group_1__2 ;
    public final void rule__EClassOpDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2639:1: ( rule__EClassOpDef__Group_1__1__Impl rule__EClassOpDef__Group_1__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2640:2: rule__EClassOpDef__Group_1__1__Impl rule__EClassOpDef__Group_1__2
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__1__Impl_in_rule__EClassOpDef__Group_1__15351);
            rule__EClassOpDef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__2_in_rule__EClassOpDef__Group_1__15354);
            rule__EClassOpDef__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__1"


    // $ANTLR start "rule__EClassOpDef__Group_1__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2647:1: rule__EClassOpDef__Group_1__1__Impl : ( '(' ) ;
    public final void rule__EClassOpDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2651:1: ( ( '(' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2652:1: ( '(' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2652:1: ( '(' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2653:1: '('
            {
             before(grammarAccess.getEClassOpDefAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__EClassOpDef__Group_1__1__Impl5382); 
             after(grammarAccess.getEClassOpDefAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__1__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_1__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2666:1: rule__EClassOpDef__Group_1__2 : rule__EClassOpDef__Group_1__2__Impl rule__EClassOpDef__Group_1__3 ;
    public final void rule__EClassOpDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2670:1: ( rule__EClassOpDef__Group_1__2__Impl rule__EClassOpDef__Group_1__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2671:2: rule__EClassOpDef__Group_1__2__Impl rule__EClassOpDef__Group_1__3
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__2__Impl_in_rule__EClassOpDef__Group_1__25413);
            rule__EClassOpDef__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__3_in_rule__EClassOpDef__Group_1__25416);
            rule__EClassOpDef__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__2"


    // $ANTLR start "rule__EClassOpDef__Group_1__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2678:1: rule__EClassOpDef__Group_1__2__Impl : ( ( rule__EClassOpDef__RefAssignment_1_2 ) ) ;
    public final void rule__EClassOpDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2682:1: ( ( ( rule__EClassOpDef__RefAssignment_1_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2683:1: ( ( rule__EClassOpDef__RefAssignment_1_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2683:1: ( ( rule__EClassOpDef__RefAssignment_1_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2684:1: ( rule__EClassOpDef__RefAssignment_1_2 )
            {
             before(grammarAccess.getEClassOpDefAccess().getRefAssignment_1_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2685:1: ( rule__EClassOpDef__RefAssignment_1_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2685:2: rule__EClassOpDef__RefAssignment_1_2
            {
            pushFollow(FOLLOW_rule__EClassOpDef__RefAssignment_1_2_in_rule__EClassOpDef__Group_1__2__Impl5443);
            rule__EClassOpDef__RefAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEClassOpDefAccess().getRefAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__2__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_1__3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2695:1: rule__EClassOpDef__Group_1__3 : rule__EClassOpDef__Group_1__3__Impl rule__EClassOpDef__Group_1__4 ;
    public final void rule__EClassOpDef__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2699:1: ( rule__EClassOpDef__Group_1__3__Impl rule__EClassOpDef__Group_1__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2700:2: rule__EClassOpDef__Group_1__3__Impl rule__EClassOpDef__Group_1__4
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__3__Impl_in_rule__EClassOpDef__Group_1__35473);
            rule__EClassOpDef__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__4_in_rule__EClassOpDef__Group_1__35476);
            rule__EClassOpDef__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__3"


    // $ANTLR start "rule__EClassOpDef__Group_1__3__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2707:1: rule__EClassOpDef__Group_1__3__Impl : ( ':' ) ;
    public final void rule__EClassOpDef__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2711:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2712:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2712:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2713:1: ':'
            {
             before(grammarAccess.getEClassOpDefAccess().getColonKeyword_1_3()); 
            match(input,19,FOLLOW_19_in_rule__EClassOpDef__Group_1__3__Impl5504); 
             after(grammarAccess.getEClassOpDefAccess().getColonKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__3__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_1__4"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2726:1: rule__EClassOpDef__Group_1__4 : rule__EClassOpDef__Group_1__4__Impl rule__EClassOpDef__Group_1__5 ;
    public final void rule__EClassOpDef__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2730:1: ( rule__EClassOpDef__Group_1__4__Impl rule__EClassOpDef__Group_1__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2731:2: rule__EClassOpDef__Group_1__4__Impl rule__EClassOpDef__Group_1__5
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__4__Impl_in_rule__EClassOpDef__Group_1__45535);
            rule__EClassOpDef__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__5_in_rule__EClassOpDef__Group_1__45538);
            rule__EClassOpDef__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__4"


    // $ANTLR start "rule__EClassOpDef__Group_1__4__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2738:1: rule__EClassOpDef__Group_1__4__Impl : ( 'class' ) ;
    public final void rule__EClassOpDef__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2742:1: ( ( 'class' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2743:1: ( 'class' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2743:1: ( 'class' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2744:1: 'class'
            {
             before(grammarAccess.getEClassOpDefAccess().getClassKeyword_1_4()); 
            match(input,31,FOLLOW_31_in_rule__EClassOpDef__Group_1__4__Impl5566); 
             after(grammarAccess.getEClassOpDefAccess().getClassKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__4__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_1__5"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2757:1: rule__EClassOpDef__Group_1__5 : rule__EClassOpDef__Group_1__5__Impl rule__EClassOpDef__Group_1__6 ;
    public final void rule__EClassOpDef__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2761:1: ( rule__EClassOpDef__Group_1__5__Impl rule__EClassOpDef__Group_1__6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2762:2: rule__EClassOpDef__Group_1__5__Impl rule__EClassOpDef__Group_1__6
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__5__Impl_in_rule__EClassOpDef__Group_1__55597);
            rule__EClassOpDef__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__6_in_rule__EClassOpDef__Group_1__55600);
            rule__EClassOpDef__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__5"


    // $ANTLR start "rule__EClassOpDef__Group_1__5__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2769:1: rule__EClassOpDef__Group_1__5__Impl : ( ')' ) ;
    public final void rule__EClassOpDef__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2773:1: ( ( ')' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2774:1: ( ')' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2774:1: ( ')' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2775:1: ')'
            {
             before(grammarAccess.getEClassOpDefAccess().getRightParenthesisKeyword_1_5()); 
            match(input,29,FOLLOW_29_in_rule__EClassOpDef__Group_1__5__Impl5628); 
             after(grammarAccess.getEClassOpDefAccess().getRightParenthesisKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__5__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_1__6"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2788:1: rule__EClassOpDef__Group_1__6 : rule__EClassOpDef__Group_1__6__Impl rule__EClassOpDef__Group_1__7 ;
    public final void rule__EClassOpDef__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2792:1: ( rule__EClassOpDef__Group_1__6__Impl rule__EClassOpDef__Group_1__7 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2793:2: rule__EClassOpDef__Group_1__6__Impl rule__EClassOpDef__Group_1__7
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__6__Impl_in_rule__EClassOpDef__Group_1__65659);
            rule__EClassOpDef__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__7_in_rule__EClassOpDef__Group_1__65662);
            rule__EClassOpDef__Group_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__6"


    // $ANTLR start "rule__EClassOpDef__Group_1__6__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2800:1: rule__EClassOpDef__Group_1__6__Impl : ( 'where' ) ;
    public final void rule__EClassOpDef__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2804:1: ( ( 'where' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2805:1: ( 'where' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2805:1: ( 'where' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2806:1: 'where'
            {
             before(grammarAccess.getEClassOpDefAccess().getWhereKeyword_1_6()); 
            match(input,30,FOLLOW_30_in_rule__EClassOpDef__Group_1__6__Impl5690); 
             after(grammarAccess.getEClassOpDefAccess().getWhereKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__6__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_1__7"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2819:1: rule__EClassOpDef__Group_1__7 : rule__EClassOpDef__Group_1__7__Impl ;
    public final void rule__EClassOpDef__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2823:1: ( rule__EClassOpDef__Group_1__7__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2824:2: rule__EClassOpDef__Group_1__7__Impl
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__7__Impl_in_rule__EClassOpDef__Group_1__75721);
            rule__EClassOpDef__Group_1__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__7"


    // $ANTLR start "rule__EClassOpDef__Group_1__7__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2830:1: rule__EClassOpDef__Group_1__7__Impl : ( ( rule__EClassOpDef__Group_1_7__0 ) ) ;
    public final void rule__EClassOpDef__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2834:1: ( ( ( rule__EClassOpDef__Group_1_7__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2835:1: ( ( rule__EClassOpDef__Group_1_7__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2835:1: ( ( rule__EClassOpDef__Group_1_7__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2836:1: ( rule__EClassOpDef__Group_1_7__0 )
            {
             before(grammarAccess.getEClassOpDefAccess().getGroup_1_7()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2837:1: ( rule__EClassOpDef__Group_1_7__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2837:2: rule__EClassOpDef__Group_1_7__0
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1_7__0_in_rule__EClassOpDef__Group_1__7__Impl5748);
            rule__EClassOpDef__Group_1_7__0();

            state._fsp--;


            }

             after(grammarAccess.getEClassOpDefAccess().getGroup_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1__7__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_1_7__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2863:1: rule__EClassOpDef__Group_1_7__0 : rule__EClassOpDef__Group_1_7__0__Impl rule__EClassOpDef__Group_1_7__1 ;
    public final void rule__EClassOpDef__Group_1_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2867:1: ( rule__EClassOpDef__Group_1_7__0__Impl rule__EClassOpDef__Group_1_7__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2868:2: rule__EClassOpDef__Group_1_7__0__Impl rule__EClassOpDef__Group_1_7__1
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1_7__0__Impl_in_rule__EClassOpDef__Group_1_7__05794);
            rule__EClassOpDef__Group_1_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1_7__1_in_rule__EClassOpDef__Group_1_7__05797);
            rule__EClassOpDef__Group_1_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1_7__0"


    // $ANTLR start "rule__EClassOpDef__Group_1_7__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2875:1: rule__EClassOpDef__Group_1_7__0__Impl : ( '{' ) ;
    public final void rule__EClassOpDef__Group_1_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2879:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2880:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2880:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2881:1: '{'
            {
             before(grammarAccess.getEClassOpDefAccess().getLeftCurlyBracketKeyword_1_7_0()); 
            match(input,17,FOLLOW_17_in_rule__EClassOpDef__Group_1_7__0__Impl5825); 
             after(grammarAccess.getEClassOpDefAccess().getLeftCurlyBracketKeyword_1_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1_7__0__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_1_7__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2894:1: rule__EClassOpDef__Group_1_7__1 : rule__EClassOpDef__Group_1_7__1__Impl rule__EClassOpDef__Group_1_7__2 ;
    public final void rule__EClassOpDef__Group_1_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2898:1: ( rule__EClassOpDef__Group_1_7__1__Impl rule__EClassOpDef__Group_1_7__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2899:2: rule__EClassOpDef__Group_1_7__1__Impl rule__EClassOpDef__Group_1_7__2
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1_7__1__Impl_in_rule__EClassOpDef__Group_1_7__15856);
            rule__EClassOpDef__Group_1_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1_7__2_in_rule__EClassOpDef__Group_1_7__15859);
            rule__EClassOpDef__Group_1_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1_7__1"


    // $ANTLR start "rule__EClassOpDef__Group_1_7__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2906:1: rule__EClassOpDef__Group_1_7__1__Impl : ( ( rule__EClassOpDef__Alternatives_1_7_1 )* ) ;
    public final void rule__EClassOpDef__Group_1_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2910:1: ( ( ( rule__EClassOpDef__Alternatives_1_7_1 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2911:1: ( ( rule__EClassOpDef__Alternatives_1_7_1 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2911:1: ( ( rule__EClassOpDef__Alternatives_1_7_1 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2912:1: ( rule__EClassOpDef__Alternatives_1_7_1 )*
            {
             before(grammarAccess.getEClassOpDefAccess().getAlternatives_1_7_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2913:1: ( rule__EClassOpDef__Alternatives_1_7_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=32 && LA17_0<=34)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2913:2: rule__EClassOpDef__Alternatives_1_7_1
            	    {
            	    pushFollow(FOLLOW_rule__EClassOpDef__Alternatives_1_7_1_in_rule__EClassOpDef__Group_1_7__1__Impl5886);
            	    rule__EClassOpDef__Alternatives_1_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEClassOpDefAccess().getAlternatives_1_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1_7__1__Impl"


    // $ANTLR start "rule__EClassOpDef__Group_1_7__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2923:1: rule__EClassOpDef__Group_1_7__2 : rule__EClassOpDef__Group_1_7__2__Impl ;
    public final void rule__EClassOpDef__Group_1_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2927:1: ( rule__EClassOpDef__Group_1_7__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2928:2: rule__EClassOpDef__Group_1_7__2__Impl
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1_7__2__Impl_in_rule__EClassOpDef__Group_1_7__25917);
            rule__EClassOpDef__Group_1_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1_7__2"


    // $ANTLR start "rule__EClassOpDef__Group_1_7__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2934:1: rule__EClassOpDef__Group_1_7__2__Impl : ( '}' ) ;
    public final void rule__EClassOpDef__Group_1_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2938:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2939:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2939:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2940:1: '}'
            {
             before(grammarAccess.getEClassOpDefAccess().getRightCurlyBracketKeyword_1_7_2()); 
            match(input,18,FOLLOW_18_in_rule__EClassOpDef__Group_1_7__2__Impl5945); 
             after(grammarAccess.getEClassOpDefAccess().getRightCurlyBracketKeyword_1_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__Group_1_7__2__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2959:1: rule__EAttributeOpDef__Group__0 : rule__EAttributeOpDef__Group__0__Impl rule__EAttributeOpDef__Group__1 ;
    public final void rule__EAttributeOpDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2963:1: ( rule__EAttributeOpDef__Group__0__Impl rule__EAttributeOpDef__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2964:2: rule__EAttributeOpDef__Group__0__Impl rule__EAttributeOpDef__Group__1
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group__0__Impl_in_rule__EAttributeOpDef__Group__05982);
            rule__EAttributeOpDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group__1_in_rule__EAttributeOpDef__Group__05985);
            rule__EAttributeOpDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group__0"


    // $ANTLR start "rule__EAttributeOpDef__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2971:1: rule__EAttributeOpDef__Group__0__Impl : ( ( rule__EAttributeOpDef__Group_0__0 ) ) ;
    public final void rule__EAttributeOpDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2975:1: ( ( ( rule__EAttributeOpDef__Group_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2976:1: ( ( rule__EAttributeOpDef__Group_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2976:1: ( ( rule__EAttributeOpDef__Group_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2977:1: ( rule__EAttributeOpDef__Group_0__0 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getGroup_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2978:1: ( rule__EAttributeOpDef__Group_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2978:2: rule__EAttributeOpDef__Group_0__0
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_0__0_in_rule__EAttributeOpDef__Group__0__Impl6012);
            rule__EAttributeOpDef__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getEAttributeOpDefAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group__0__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2988:1: rule__EAttributeOpDef__Group__1 : rule__EAttributeOpDef__Group__1__Impl ;
    public final void rule__EAttributeOpDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2992:1: ( rule__EAttributeOpDef__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2993:2: rule__EAttributeOpDef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group__1__Impl_in_rule__EAttributeOpDef__Group__16042);
            rule__EAttributeOpDef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group__1"


    // $ANTLR start "rule__EAttributeOpDef__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2999:1: rule__EAttributeOpDef__Group__1__Impl : ( ( rule__EAttributeOpDef__Group_1__0 ) ) ;
    public final void rule__EAttributeOpDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3003:1: ( ( ( rule__EAttributeOpDef__Group_1__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3004:1: ( ( rule__EAttributeOpDef__Group_1__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3004:1: ( ( rule__EAttributeOpDef__Group_1__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3005:1: ( rule__EAttributeOpDef__Group_1__0 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getGroup_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3006:1: ( rule__EAttributeOpDef__Group_1__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3006:2: rule__EAttributeOpDef__Group_1__0
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__0_in_rule__EAttributeOpDef__Group__1__Impl6069);
            rule__EAttributeOpDef__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEAttributeOpDefAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group__1__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_0__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3020:1: rule__EAttributeOpDef__Group_0__0 : rule__EAttributeOpDef__Group_0__0__Impl rule__EAttributeOpDef__Group_0__1 ;
    public final void rule__EAttributeOpDef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3024:1: ( rule__EAttributeOpDef__Group_0__0__Impl rule__EAttributeOpDef__Group_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3025:2: rule__EAttributeOpDef__Group_0__0__Impl rule__EAttributeOpDef__Group_0__1
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_0__0__Impl_in_rule__EAttributeOpDef__Group_0__06103);
            rule__EAttributeOpDef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_0__1_in_rule__EAttributeOpDef__Group_0__06106);
            rule__EAttributeOpDef__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_0__0"


    // $ANTLR start "rule__EAttributeOpDef__Group_0__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3032:1: rule__EAttributeOpDef__Group_0__0__Impl : ( 'attribute' ) ;
    public final void rule__EAttributeOpDef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3036:1: ( ( 'attribute' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3037:1: ( 'attribute' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3037:1: ( 'attribute' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3038:1: 'attribute'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getAttributeKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__EAttributeOpDef__Group_0__0__Impl6134); 
             after(grammarAccess.getEAttributeOpDefAccess().getAttributeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_0__0__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_0__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3051:1: rule__EAttributeOpDef__Group_0__1 : rule__EAttributeOpDef__Group_0__1__Impl rule__EAttributeOpDef__Group_0__2 ;
    public final void rule__EAttributeOpDef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3055:1: ( rule__EAttributeOpDef__Group_0__1__Impl rule__EAttributeOpDef__Group_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3056:2: rule__EAttributeOpDef__Group_0__1__Impl rule__EAttributeOpDef__Group_0__2
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_0__1__Impl_in_rule__EAttributeOpDef__Group_0__16165);
            rule__EAttributeOpDef__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_0__2_in_rule__EAttributeOpDef__Group_0__16168);
            rule__EAttributeOpDef__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_0__1"


    // $ANTLR start "rule__EAttributeOpDef__Group_0__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3063:1: rule__EAttributeOpDef__Group_0__1__Impl : ( ( rule__EAttributeOpDef__VarAssignment_0_1 ) ) ;
    public final void rule__EAttributeOpDef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3067:1: ( ( ( rule__EAttributeOpDef__VarAssignment_0_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3068:1: ( ( rule__EAttributeOpDef__VarAssignment_0_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3068:1: ( ( rule__EAttributeOpDef__VarAssignment_0_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3069:1: ( rule__EAttributeOpDef__VarAssignment_0_1 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getVarAssignment_0_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3070:1: ( rule__EAttributeOpDef__VarAssignment_0_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3070:2: rule__EAttributeOpDef__VarAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__VarAssignment_0_1_in_rule__EAttributeOpDef__Group_0__1__Impl6195);
            rule__EAttributeOpDef__VarAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEAttributeOpDefAccess().getVarAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_0__1__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_0__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3080:1: rule__EAttributeOpDef__Group_0__2 : rule__EAttributeOpDef__Group_0__2__Impl ;
    public final void rule__EAttributeOpDef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3084:1: ( rule__EAttributeOpDef__Group_0__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3085:2: rule__EAttributeOpDef__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_0__2__Impl_in_rule__EAttributeOpDef__Group_0__26225);
            rule__EAttributeOpDef__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_0__2"


    // $ANTLR start "rule__EAttributeOpDef__Group_0__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3091:1: rule__EAttributeOpDef__Group_0__2__Impl : ( '=' ) ;
    public final void rule__EAttributeOpDef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3095:1: ( ( '=' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3096:1: ( '=' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3096:1: ( '=' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3097:1: '='
            {
             before(grammarAccess.getEAttributeOpDefAccess().getEqualsSignKeyword_0_2()); 
            match(input,27,FOLLOW_27_in_rule__EAttributeOpDef__Group_0__2__Impl6253); 
             after(grammarAccess.getEAttributeOpDefAccess().getEqualsSignKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_0__2__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_1__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3116:1: rule__EAttributeOpDef__Group_1__0 : rule__EAttributeOpDef__Group_1__0__Impl rule__EAttributeOpDef__Group_1__1 ;
    public final void rule__EAttributeOpDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3120:1: ( rule__EAttributeOpDef__Group_1__0__Impl rule__EAttributeOpDef__Group_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3121:2: rule__EAttributeOpDef__Group_1__0__Impl rule__EAttributeOpDef__Group_1__1
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__0__Impl_in_rule__EAttributeOpDef__Group_1__06290);
            rule__EAttributeOpDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__1_in_rule__EAttributeOpDef__Group_1__06293);
            rule__EAttributeOpDef__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1__0"


    // $ANTLR start "rule__EAttributeOpDef__Group_1__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3128:1: rule__EAttributeOpDef__Group_1__0__Impl : ( ( rule__EAttributeOpDef__Group_1_0__0 ) ) ;
    public final void rule__EAttributeOpDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3132:1: ( ( ( rule__EAttributeOpDef__Group_1_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3133:1: ( ( rule__EAttributeOpDef__Group_1_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3133:1: ( ( rule__EAttributeOpDef__Group_1_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3134:1: ( rule__EAttributeOpDef__Group_1_0__0 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getGroup_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3135:1: ( rule__EAttributeOpDef__Group_1_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3135:2: rule__EAttributeOpDef__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__0_in_rule__EAttributeOpDef__Group_1__0__Impl6320);
            rule__EAttributeOpDef__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getEAttributeOpDefAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1__0__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_1__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3145:1: rule__EAttributeOpDef__Group_1__1 : rule__EAttributeOpDef__Group_1__1__Impl rule__EAttributeOpDef__Group_1__2 ;
    public final void rule__EAttributeOpDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3149:1: ( rule__EAttributeOpDef__Group_1__1__Impl rule__EAttributeOpDef__Group_1__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3150:2: rule__EAttributeOpDef__Group_1__1__Impl rule__EAttributeOpDef__Group_1__2
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__1__Impl_in_rule__EAttributeOpDef__Group_1__16350);
            rule__EAttributeOpDef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__2_in_rule__EAttributeOpDef__Group_1__16353);
            rule__EAttributeOpDef__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1__1"


    // $ANTLR start "rule__EAttributeOpDef__Group_1__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3157:1: rule__EAttributeOpDef__Group_1__1__Impl : ( ')' ) ;
    public final void rule__EAttributeOpDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3161:1: ( ( ')' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3162:1: ( ')' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3162:1: ( ')' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3163:1: ')'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getRightParenthesisKeyword_1_1()); 
            match(input,29,FOLLOW_29_in_rule__EAttributeOpDef__Group_1__1__Impl6381); 
             after(grammarAccess.getEAttributeOpDefAccess().getRightParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1__1__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_1__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3176:1: rule__EAttributeOpDef__Group_1__2 : rule__EAttributeOpDef__Group_1__2__Impl rule__EAttributeOpDef__Group_1__3 ;
    public final void rule__EAttributeOpDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3180:1: ( rule__EAttributeOpDef__Group_1__2__Impl rule__EAttributeOpDef__Group_1__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3181:2: rule__EAttributeOpDef__Group_1__2__Impl rule__EAttributeOpDef__Group_1__3
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__2__Impl_in_rule__EAttributeOpDef__Group_1__26412);
            rule__EAttributeOpDef__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__3_in_rule__EAttributeOpDef__Group_1__26415);
            rule__EAttributeOpDef__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1__2"


    // $ANTLR start "rule__EAttributeOpDef__Group_1__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3188:1: rule__EAttributeOpDef__Group_1__2__Impl : ( 'where' ) ;
    public final void rule__EAttributeOpDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3192:1: ( ( 'where' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3193:1: ( 'where' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3193:1: ( 'where' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3194:1: 'where'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getWhereKeyword_1_2()); 
            match(input,30,FOLLOW_30_in_rule__EAttributeOpDef__Group_1__2__Impl6443); 
             after(grammarAccess.getEAttributeOpDefAccess().getWhereKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1__2__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_1__3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3207:1: rule__EAttributeOpDef__Group_1__3 : rule__EAttributeOpDef__Group_1__3__Impl ;
    public final void rule__EAttributeOpDef__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3211:1: ( rule__EAttributeOpDef__Group_1__3__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3212:2: rule__EAttributeOpDef__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__3__Impl_in_rule__EAttributeOpDef__Group_1__36474);
            rule__EAttributeOpDef__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1__3"


    // $ANTLR start "rule__EAttributeOpDef__Group_1__3__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3218:1: rule__EAttributeOpDef__Group_1__3__Impl : ( ( rule__EAttributeOpDef__Alternatives_1_3 ) ) ;
    public final void rule__EAttributeOpDef__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3222:1: ( ( ( rule__EAttributeOpDef__Alternatives_1_3 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3223:1: ( ( rule__EAttributeOpDef__Alternatives_1_3 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3223:1: ( ( rule__EAttributeOpDef__Alternatives_1_3 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3224:1: ( rule__EAttributeOpDef__Alternatives_1_3 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getAlternatives_1_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3225:1: ( rule__EAttributeOpDef__Alternatives_1_3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3225:2: rule__EAttributeOpDef__Alternatives_1_3
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Alternatives_1_3_in_rule__EAttributeOpDef__Group_1__3__Impl6501);
            rule__EAttributeOpDef__Alternatives_1_3();

            state._fsp--;


            }

             after(grammarAccess.getEAttributeOpDefAccess().getAlternatives_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1__3__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_0__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3243:1: rule__EAttributeOpDef__Group_1_0__0 : rule__EAttributeOpDef__Group_1_0__0__Impl rule__EAttributeOpDef__Group_1_0__1 ;
    public final void rule__EAttributeOpDef__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3247:1: ( rule__EAttributeOpDef__Group_1_0__0__Impl rule__EAttributeOpDef__Group_1_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3248:2: rule__EAttributeOpDef__Group_1_0__0__Impl rule__EAttributeOpDef__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__0__Impl_in_rule__EAttributeOpDef__Group_1_0__06539);
            rule__EAttributeOpDef__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__1_in_rule__EAttributeOpDef__Group_1_0__06542);
            rule__EAttributeOpDef__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_0__0"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_0__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3255:1: rule__EAttributeOpDef__Group_1_0__0__Impl : ( ( rule__EAttributeOpDef__Alternatives_1_0_0 ) ) ;
    public final void rule__EAttributeOpDef__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3259:1: ( ( ( rule__EAttributeOpDef__Alternatives_1_0_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3260:1: ( ( rule__EAttributeOpDef__Alternatives_1_0_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3260:1: ( ( rule__EAttributeOpDef__Alternatives_1_0_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3261:1: ( rule__EAttributeOpDef__Alternatives_1_0_0 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getAlternatives_1_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3262:1: ( rule__EAttributeOpDef__Alternatives_1_0_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3262:2: rule__EAttributeOpDef__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Alternatives_1_0_0_in_rule__EAttributeOpDef__Group_1_0__0__Impl6569);
            rule__EAttributeOpDef__Alternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEAttributeOpDefAccess().getAlternatives_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_0__0__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_0__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3272:1: rule__EAttributeOpDef__Group_1_0__1 : rule__EAttributeOpDef__Group_1_0__1__Impl rule__EAttributeOpDef__Group_1_0__2 ;
    public final void rule__EAttributeOpDef__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3276:1: ( rule__EAttributeOpDef__Group_1_0__1__Impl rule__EAttributeOpDef__Group_1_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3277:2: rule__EAttributeOpDef__Group_1_0__1__Impl rule__EAttributeOpDef__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__1__Impl_in_rule__EAttributeOpDef__Group_1_0__16599);
            rule__EAttributeOpDef__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__2_in_rule__EAttributeOpDef__Group_1_0__16602);
            rule__EAttributeOpDef__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_0__1"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_0__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3284:1: rule__EAttributeOpDef__Group_1_0__1__Impl : ( '(' ) ;
    public final void rule__EAttributeOpDef__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3288:1: ( ( '(' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3289:1: ( '(' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3289:1: ( '(' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3290:1: '('
            {
             before(grammarAccess.getEAttributeOpDefAccess().getLeftParenthesisKeyword_1_0_1()); 
            match(input,28,FOLLOW_28_in_rule__EAttributeOpDef__Group_1_0__1__Impl6630); 
             after(grammarAccess.getEAttributeOpDefAccess().getLeftParenthesisKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_0__1__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_0__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3303:1: rule__EAttributeOpDef__Group_1_0__2 : rule__EAttributeOpDef__Group_1_0__2__Impl rule__EAttributeOpDef__Group_1_0__3 ;
    public final void rule__EAttributeOpDef__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3307:1: ( rule__EAttributeOpDef__Group_1_0__2__Impl rule__EAttributeOpDef__Group_1_0__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3308:2: rule__EAttributeOpDef__Group_1_0__2__Impl rule__EAttributeOpDef__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__2__Impl_in_rule__EAttributeOpDef__Group_1_0__26661);
            rule__EAttributeOpDef__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__3_in_rule__EAttributeOpDef__Group_1_0__26664);
            rule__EAttributeOpDef__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_0__2"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_0__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3315:1: rule__EAttributeOpDef__Group_1_0__2__Impl : ( ( rule__EAttributeOpDef__RefAssignment_1_0_2 ) ) ;
    public final void rule__EAttributeOpDef__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3319:1: ( ( ( rule__EAttributeOpDef__RefAssignment_1_0_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3320:1: ( ( rule__EAttributeOpDef__RefAssignment_1_0_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3320:1: ( ( rule__EAttributeOpDef__RefAssignment_1_0_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3321:1: ( rule__EAttributeOpDef__RefAssignment_1_0_2 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getRefAssignment_1_0_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3322:1: ( rule__EAttributeOpDef__RefAssignment_1_0_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3322:2: rule__EAttributeOpDef__RefAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__RefAssignment_1_0_2_in_rule__EAttributeOpDef__Group_1_0__2__Impl6691);
            rule__EAttributeOpDef__RefAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEAttributeOpDefAccess().getRefAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_0__2__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_0__3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3332:1: rule__EAttributeOpDef__Group_1_0__3 : rule__EAttributeOpDef__Group_1_0__3__Impl rule__EAttributeOpDef__Group_1_0__4 ;
    public final void rule__EAttributeOpDef__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3336:1: ( rule__EAttributeOpDef__Group_1_0__3__Impl rule__EAttributeOpDef__Group_1_0__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3337:2: rule__EAttributeOpDef__Group_1_0__3__Impl rule__EAttributeOpDef__Group_1_0__4
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__3__Impl_in_rule__EAttributeOpDef__Group_1_0__36721);
            rule__EAttributeOpDef__Group_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__4_in_rule__EAttributeOpDef__Group_1_0__36724);
            rule__EAttributeOpDef__Group_1_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_0__3"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_0__3__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3344:1: rule__EAttributeOpDef__Group_1_0__3__Impl : ( ':' ) ;
    public final void rule__EAttributeOpDef__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3348:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3349:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3349:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3350:1: ':'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getColonKeyword_1_0_3()); 
            match(input,19,FOLLOW_19_in_rule__EAttributeOpDef__Group_1_0__3__Impl6752); 
             after(grammarAccess.getEAttributeOpDefAccess().getColonKeyword_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_0__3__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_0__4"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3363:1: rule__EAttributeOpDef__Group_1_0__4 : rule__EAttributeOpDef__Group_1_0__4__Impl ;
    public final void rule__EAttributeOpDef__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3367:1: ( rule__EAttributeOpDef__Group_1_0__4__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3368:2: rule__EAttributeOpDef__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__4__Impl_in_rule__EAttributeOpDef__Group_1_0__46783);
            rule__EAttributeOpDef__Group_1_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_0__4"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_0__4__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3374:1: rule__EAttributeOpDef__Group_1_0__4__Impl : ( 'attribute' ) ;
    public final void rule__EAttributeOpDef__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3378:1: ( ( 'attribute' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3379:1: ( 'attribute' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3379:1: ( 'attribute' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3380:1: 'attribute'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getAttributeKeyword_1_0_4()); 
            match(input,32,FOLLOW_32_in_rule__EAttributeOpDef__Group_1_0__4__Impl6811); 
             after(grammarAccess.getEAttributeOpDefAccess().getAttributeKeyword_1_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_0__4__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_3_0__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3403:1: rule__EAttributeOpDef__Group_1_3_0__0 : rule__EAttributeOpDef__Group_1_3_0__0__Impl rule__EAttributeOpDef__Group_1_3_0__1 ;
    public final void rule__EAttributeOpDef__Group_1_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3407:1: ( rule__EAttributeOpDef__Group_1_3_0__0__Impl rule__EAttributeOpDef__Group_1_3_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3408:2: rule__EAttributeOpDef__Group_1_3_0__0__Impl rule__EAttributeOpDef__Group_1_3_0__1
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_3_0__0__Impl_in_rule__EAttributeOpDef__Group_1_3_0__06852);
            rule__EAttributeOpDef__Group_1_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_3_0__1_in_rule__EAttributeOpDef__Group_1_3_0__06855);
            rule__EAttributeOpDef__Group_1_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_3_0__0"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_3_0__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3415:1: rule__EAttributeOpDef__Group_1_3_0__0__Impl : ( '{' ) ;
    public final void rule__EAttributeOpDef__Group_1_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3419:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3420:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3420:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3421:1: '{'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getLeftCurlyBracketKeyword_1_3_0_0()); 
            match(input,17,FOLLOW_17_in_rule__EAttributeOpDef__Group_1_3_0__0__Impl6883); 
             after(grammarAccess.getEAttributeOpDefAccess().getLeftCurlyBracketKeyword_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_3_0__0__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_3_0__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3434:1: rule__EAttributeOpDef__Group_1_3_0__1 : rule__EAttributeOpDef__Group_1_3_0__1__Impl rule__EAttributeOpDef__Group_1_3_0__2 ;
    public final void rule__EAttributeOpDef__Group_1_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3438:1: ( rule__EAttributeOpDef__Group_1_3_0__1__Impl rule__EAttributeOpDef__Group_1_3_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3439:2: rule__EAttributeOpDef__Group_1_3_0__1__Impl rule__EAttributeOpDef__Group_1_3_0__2
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_3_0__1__Impl_in_rule__EAttributeOpDef__Group_1_3_0__16914);
            rule__EAttributeOpDef__Group_1_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_3_0__2_in_rule__EAttributeOpDef__Group_1_3_0__16917);
            rule__EAttributeOpDef__Group_1_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_3_0__1"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_3_0__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3446:1: rule__EAttributeOpDef__Group_1_3_0__1__Impl : ( ( rule__EAttributeOpDef__SettersAssignment_1_3_0_1 )* ) ;
    public final void rule__EAttributeOpDef__Group_1_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3450:1: ( ( ( rule__EAttributeOpDef__SettersAssignment_1_3_0_1 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3451:1: ( ( rule__EAttributeOpDef__SettersAssignment_1_3_0_1 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3451:1: ( ( rule__EAttributeOpDef__SettersAssignment_1_3_0_1 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3452:1: ( rule__EAttributeOpDef__SettersAssignment_1_3_0_1 )*
            {
             before(grammarAccess.getEAttributeOpDefAccess().getSettersAssignment_1_3_0_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3453:1: ( rule__EAttributeOpDef__SettersAssignment_1_3_0_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3453:2: rule__EAttributeOpDef__SettersAssignment_1_3_0_1
            	    {
            	    pushFollow(FOLLOW_rule__EAttributeOpDef__SettersAssignment_1_3_0_1_in_rule__EAttributeOpDef__Group_1_3_0__1__Impl6944);
            	    rule__EAttributeOpDef__SettersAssignment_1_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEAttributeOpDefAccess().getSettersAssignment_1_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_3_0__1__Impl"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_3_0__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3463:1: rule__EAttributeOpDef__Group_1_3_0__2 : rule__EAttributeOpDef__Group_1_3_0__2__Impl ;
    public final void rule__EAttributeOpDef__Group_1_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3467:1: ( rule__EAttributeOpDef__Group_1_3_0__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3468:2: rule__EAttributeOpDef__Group_1_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_3_0__2__Impl_in_rule__EAttributeOpDef__Group_1_3_0__26975);
            rule__EAttributeOpDef__Group_1_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_3_0__2"


    // $ANTLR start "rule__EAttributeOpDef__Group_1_3_0__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3474:1: rule__EAttributeOpDef__Group_1_3_0__2__Impl : ( '}' ) ;
    public final void rule__EAttributeOpDef__Group_1_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3478:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3479:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3479:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3480:1: '}'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getRightCurlyBracketKeyword_1_3_0_2()); 
            match(input,18,FOLLOW_18_in_rule__EAttributeOpDef__Group_1_3_0__2__Impl7003); 
             after(grammarAccess.getEAttributeOpDefAccess().getRightCurlyBracketKeyword_1_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__Group_1_3_0__2__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3499:1: rule__EReferenceOpDef__Group__0 : rule__EReferenceOpDef__Group__0__Impl rule__EReferenceOpDef__Group__1 ;
    public final void rule__EReferenceOpDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3503:1: ( rule__EReferenceOpDef__Group__0__Impl rule__EReferenceOpDef__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3504:2: rule__EReferenceOpDef__Group__0__Impl rule__EReferenceOpDef__Group__1
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group__0__Impl_in_rule__EReferenceOpDef__Group__07040);
            rule__EReferenceOpDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group__1_in_rule__EReferenceOpDef__Group__07043);
            rule__EReferenceOpDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group__0"


    // $ANTLR start "rule__EReferenceOpDef__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3511:1: rule__EReferenceOpDef__Group__0__Impl : ( ( rule__EReferenceOpDef__Group_0__0 ) ) ;
    public final void rule__EReferenceOpDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3515:1: ( ( ( rule__EReferenceOpDef__Group_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3516:1: ( ( rule__EReferenceOpDef__Group_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3516:1: ( ( rule__EReferenceOpDef__Group_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3517:1: ( rule__EReferenceOpDef__Group_0__0 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getGroup_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3518:1: ( rule__EReferenceOpDef__Group_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3518:2: rule__EReferenceOpDef__Group_0__0
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_0__0_in_rule__EReferenceOpDef__Group__0__Impl7070);
            rule__EReferenceOpDef__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getEReferenceOpDefAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group__0__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3528:1: rule__EReferenceOpDef__Group__1 : rule__EReferenceOpDef__Group__1__Impl ;
    public final void rule__EReferenceOpDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3532:1: ( rule__EReferenceOpDef__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3533:2: rule__EReferenceOpDef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group__1__Impl_in_rule__EReferenceOpDef__Group__17100);
            rule__EReferenceOpDef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group__1"


    // $ANTLR start "rule__EReferenceOpDef__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3539:1: rule__EReferenceOpDef__Group__1__Impl : ( ( rule__EReferenceOpDef__Group_1__0 ) ) ;
    public final void rule__EReferenceOpDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3543:1: ( ( ( rule__EReferenceOpDef__Group_1__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3544:1: ( ( rule__EReferenceOpDef__Group_1__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3544:1: ( ( rule__EReferenceOpDef__Group_1__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3545:1: ( rule__EReferenceOpDef__Group_1__0 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getGroup_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3546:1: ( rule__EReferenceOpDef__Group_1__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3546:2: rule__EReferenceOpDef__Group_1__0
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__0_in_rule__EReferenceOpDef__Group__1__Impl7127);
            rule__EReferenceOpDef__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEReferenceOpDefAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group__1__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_0__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3560:1: rule__EReferenceOpDef__Group_0__0 : rule__EReferenceOpDef__Group_0__0__Impl rule__EReferenceOpDef__Group_0__1 ;
    public final void rule__EReferenceOpDef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3564:1: ( rule__EReferenceOpDef__Group_0__0__Impl rule__EReferenceOpDef__Group_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3565:2: rule__EReferenceOpDef__Group_0__0__Impl rule__EReferenceOpDef__Group_0__1
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_0__0__Impl_in_rule__EReferenceOpDef__Group_0__07161);
            rule__EReferenceOpDef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_0__1_in_rule__EReferenceOpDef__Group_0__07164);
            rule__EReferenceOpDef__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_0__0"


    // $ANTLR start "rule__EReferenceOpDef__Group_0__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3572:1: rule__EReferenceOpDef__Group_0__0__Impl : ( 'reference' ) ;
    public final void rule__EReferenceOpDef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3576:1: ( ( 'reference' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3577:1: ( 'reference' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3577:1: ( 'reference' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3578:1: 'reference'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getReferenceKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__EReferenceOpDef__Group_0__0__Impl7192); 
             after(grammarAccess.getEReferenceOpDefAccess().getReferenceKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_0__0__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_0__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3591:1: rule__EReferenceOpDef__Group_0__1 : rule__EReferenceOpDef__Group_0__1__Impl rule__EReferenceOpDef__Group_0__2 ;
    public final void rule__EReferenceOpDef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3595:1: ( rule__EReferenceOpDef__Group_0__1__Impl rule__EReferenceOpDef__Group_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3596:2: rule__EReferenceOpDef__Group_0__1__Impl rule__EReferenceOpDef__Group_0__2
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_0__1__Impl_in_rule__EReferenceOpDef__Group_0__17223);
            rule__EReferenceOpDef__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_0__2_in_rule__EReferenceOpDef__Group_0__17226);
            rule__EReferenceOpDef__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_0__1"


    // $ANTLR start "rule__EReferenceOpDef__Group_0__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3603:1: rule__EReferenceOpDef__Group_0__1__Impl : ( ( rule__EReferenceOpDef__VarAssignment_0_1 ) ) ;
    public final void rule__EReferenceOpDef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3607:1: ( ( ( rule__EReferenceOpDef__VarAssignment_0_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3608:1: ( ( rule__EReferenceOpDef__VarAssignment_0_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3608:1: ( ( rule__EReferenceOpDef__VarAssignment_0_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3609:1: ( rule__EReferenceOpDef__VarAssignment_0_1 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getVarAssignment_0_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3610:1: ( rule__EReferenceOpDef__VarAssignment_0_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3610:2: rule__EReferenceOpDef__VarAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__VarAssignment_0_1_in_rule__EReferenceOpDef__Group_0__1__Impl7253);
            rule__EReferenceOpDef__VarAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEReferenceOpDefAccess().getVarAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_0__1__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_0__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3620:1: rule__EReferenceOpDef__Group_0__2 : rule__EReferenceOpDef__Group_0__2__Impl ;
    public final void rule__EReferenceOpDef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3624:1: ( rule__EReferenceOpDef__Group_0__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3625:2: rule__EReferenceOpDef__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_0__2__Impl_in_rule__EReferenceOpDef__Group_0__27283);
            rule__EReferenceOpDef__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_0__2"


    // $ANTLR start "rule__EReferenceOpDef__Group_0__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3631:1: rule__EReferenceOpDef__Group_0__2__Impl : ( '=' ) ;
    public final void rule__EReferenceOpDef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3635:1: ( ( '=' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3636:1: ( '=' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3636:1: ( '=' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3637:1: '='
            {
             before(grammarAccess.getEReferenceOpDefAccess().getEqualsSignKeyword_0_2()); 
            match(input,27,FOLLOW_27_in_rule__EReferenceOpDef__Group_0__2__Impl7311); 
             after(grammarAccess.getEReferenceOpDefAccess().getEqualsSignKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_0__2__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_1__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3656:1: rule__EReferenceOpDef__Group_1__0 : rule__EReferenceOpDef__Group_1__0__Impl rule__EReferenceOpDef__Group_1__1 ;
    public final void rule__EReferenceOpDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3660:1: ( rule__EReferenceOpDef__Group_1__0__Impl rule__EReferenceOpDef__Group_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3661:2: rule__EReferenceOpDef__Group_1__0__Impl rule__EReferenceOpDef__Group_1__1
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__0__Impl_in_rule__EReferenceOpDef__Group_1__07348);
            rule__EReferenceOpDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__1_in_rule__EReferenceOpDef__Group_1__07351);
            rule__EReferenceOpDef__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1__0"


    // $ANTLR start "rule__EReferenceOpDef__Group_1__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3668:1: rule__EReferenceOpDef__Group_1__0__Impl : ( ( rule__EReferenceOpDef__Group_1_0__0 ) ) ;
    public final void rule__EReferenceOpDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3672:1: ( ( ( rule__EReferenceOpDef__Group_1_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3673:1: ( ( rule__EReferenceOpDef__Group_1_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3673:1: ( ( rule__EReferenceOpDef__Group_1_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3674:1: ( rule__EReferenceOpDef__Group_1_0__0 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getGroup_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3675:1: ( rule__EReferenceOpDef__Group_1_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3675:2: rule__EReferenceOpDef__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__0_in_rule__EReferenceOpDef__Group_1__0__Impl7378);
            rule__EReferenceOpDef__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getEReferenceOpDefAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1__0__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_1__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3685:1: rule__EReferenceOpDef__Group_1__1 : rule__EReferenceOpDef__Group_1__1__Impl rule__EReferenceOpDef__Group_1__2 ;
    public final void rule__EReferenceOpDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3689:1: ( rule__EReferenceOpDef__Group_1__1__Impl rule__EReferenceOpDef__Group_1__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3690:2: rule__EReferenceOpDef__Group_1__1__Impl rule__EReferenceOpDef__Group_1__2
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__1__Impl_in_rule__EReferenceOpDef__Group_1__17408);
            rule__EReferenceOpDef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__2_in_rule__EReferenceOpDef__Group_1__17411);
            rule__EReferenceOpDef__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1__1"


    // $ANTLR start "rule__EReferenceOpDef__Group_1__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3697:1: rule__EReferenceOpDef__Group_1__1__Impl : ( ')' ) ;
    public final void rule__EReferenceOpDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3701:1: ( ( ')' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3702:1: ( ')' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3702:1: ( ')' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3703:1: ')'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getRightParenthesisKeyword_1_1()); 
            match(input,29,FOLLOW_29_in_rule__EReferenceOpDef__Group_1__1__Impl7439); 
             after(grammarAccess.getEReferenceOpDefAccess().getRightParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1__1__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_1__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3716:1: rule__EReferenceOpDef__Group_1__2 : rule__EReferenceOpDef__Group_1__2__Impl rule__EReferenceOpDef__Group_1__3 ;
    public final void rule__EReferenceOpDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3720:1: ( rule__EReferenceOpDef__Group_1__2__Impl rule__EReferenceOpDef__Group_1__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3721:2: rule__EReferenceOpDef__Group_1__2__Impl rule__EReferenceOpDef__Group_1__3
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__2__Impl_in_rule__EReferenceOpDef__Group_1__27470);
            rule__EReferenceOpDef__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__3_in_rule__EReferenceOpDef__Group_1__27473);
            rule__EReferenceOpDef__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1__2"


    // $ANTLR start "rule__EReferenceOpDef__Group_1__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3728:1: rule__EReferenceOpDef__Group_1__2__Impl : ( 'where' ) ;
    public final void rule__EReferenceOpDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3732:1: ( ( 'where' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3733:1: ( 'where' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3733:1: ( 'where' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3734:1: 'where'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getWhereKeyword_1_2()); 
            match(input,30,FOLLOW_30_in_rule__EReferenceOpDef__Group_1__2__Impl7501); 
             after(grammarAccess.getEReferenceOpDefAccess().getWhereKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1__2__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_1__3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3747:1: rule__EReferenceOpDef__Group_1__3 : rule__EReferenceOpDef__Group_1__3__Impl ;
    public final void rule__EReferenceOpDef__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3751:1: ( rule__EReferenceOpDef__Group_1__3__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3752:2: rule__EReferenceOpDef__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__3__Impl_in_rule__EReferenceOpDef__Group_1__37532);
            rule__EReferenceOpDef__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1__3"


    // $ANTLR start "rule__EReferenceOpDef__Group_1__3__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3758:1: rule__EReferenceOpDef__Group_1__3__Impl : ( ( rule__EReferenceOpDef__Group_1_3__0 ) ) ;
    public final void rule__EReferenceOpDef__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3762:1: ( ( ( rule__EReferenceOpDef__Group_1_3__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3763:1: ( ( rule__EReferenceOpDef__Group_1_3__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3763:1: ( ( rule__EReferenceOpDef__Group_1_3__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3764:1: ( rule__EReferenceOpDef__Group_1_3__0 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getGroup_1_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3765:1: ( rule__EReferenceOpDef__Group_1_3__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3765:2: rule__EReferenceOpDef__Group_1_3__0
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_3__0_in_rule__EReferenceOpDef__Group_1__3__Impl7559);
            rule__EReferenceOpDef__Group_1_3__0();

            state._fsp--;


            }

             after(grammarAccess.getEReferenceOpDefAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1__3__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_0__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3783:1: rule__EReferenceOpDef__Group_1_0__0 : rule__EReferenceOpDef__Group_1_0__0__Impl rule__EReferenceOpDef__Group_1_0__1 ;
    public final void rule__EReferenceOpDef__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3787:1: ( rule__EReferenceOpDef__Group_1_0__0__Impl rule__EReferenceOpDef__Group_1_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3788:2: rule__EReferenceOpDef__Group_1_0__0__Impl rule__EReferenceOpDef__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__0__Impl_in_rule__EReferenceOpDef__Group_1_0__07597);
            rule__EReferenceOpDef__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__1_in_rule__EReferenceOpDef__Group_1_0__07600);
            rule__EReferenceOpDef__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_0__0"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_0__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3795:1: rule__EReferenceOpDef__Group_1_0__0__Impl : ( ( rule__EReferenceOpDef__Alternatives_1_0_0 ) ) ;
    public final void rule__EReferenceOpDef__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3799:1: ( ( ( rule__EReferenceOpDef__Alternatives_1_0_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3800:1: ( ( rule__EReferenceOpDef__Alternatives_1_0_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3800:1: ( ( rule__EReferenceOpDef__Alternatives_1_0_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3801:1: ( rule__EReferenceOpDef__Alternatives_1_0_0 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getAlternatives_1_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3802:1: ( rule__EReferenceOpDef__Alternatives_1_0_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3802:2: rule__EReferenceOpDef__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Alternatives_1_0_0_in_rule__EReferenceOpDef__Group_1_0__0__Impl7627);
            rule__EReferenceOpDef__Alternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEReferenceOpDefAccess().getAlternatives_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_0__0__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_0__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3812:1: rule__EReferenceOpDef__Group_1_0__1 : rule__EReferenceOpDef__Group_1_0__1__Impl rule__EReferenceOpDef__Group_1_0__2 ;
    public final void rule__EReferenceOpDef__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3816:1: ( rule__EReferenceOpDef__Group_1_0__1__Impl rule__EReferenceOpDef__Group_1_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3817:2: rule__EReferenceOpDef__Group_1_0__1__Impl rule__EReferenceOpDef__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__1__Impl_in_rule__EReferenceOpDef__Group_1_0__17657);
            rule__EReferenceOpDef__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__2_in_rule__EReferenceOpDef__Group_1_0__17660);
            rule__EReferenceOpDef__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_0__1"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_0__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3824:1: rule__EReferenceOpDef__Group_1_0__1__Impl : ( '(' ) ;
    public final void rule__EReferenceOpDef__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3828:1: ( ( '(' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3829:1: ( '(' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3829:1: ( '(' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3830:1: '('
            {
             before(grammarAccess.getEReferenceOpDefAccess().getLeftParenthesisKeyword_1_0_1()); 
            match(input,28,FOLLOW_28_in_rule__EReferenceOpDef__Group_1_0__1__Impl7688); 
             after(grammarAccess.getEReferenceOpDefAccess().getLeftParenthesisKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_0__1__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_0__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3843:1: rule__EReferenceOpDef__Group_1_0__2 : rule__EReferenceOpDef__Group_1_0__2__Impl rule__EReferenceOpDef__Group_1_0__3 ;
    public final void rule__EReferenceOpDef__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3847:1: ( rule__EReferenceOpDef__Group_1_0__2__Impl rule__EReferenceOpDef__Group_1_0__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3848:2: rule__EReferenceOpDef__Group_1_0__2__Impl rule__EReferenceOpDef__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__2__Impl_in_rule__EReferenceOpDef__Group_1_0__27719);
            rule__EReferenceOpDef__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__3_in_rule__EReferenceOpDef__Group_1_0__27722);
            rule__EReferenceOpDef__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_0__2"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_0__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3855:1: rule__EReferenceOpDef__Group_1_0__2__Impl : ( ( rule__EReferenceOpDef__RefAssignment_1_0_2 ) ) ;
    public final void rule__EReferenceOpDef__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3859:1: ( ( ( rule__EReferenceOpDef__RefAssignment_1_0_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3860:1: ( ( rule__EReferenceOpDef__RefAssignment_1_0_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3860:1: ( ( rule__EReferenceOpDef__RefAssignment_1_0_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3861:1: ( rule__EReferenceOpDef__RefAssignment_1_0_2 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getRefAssignment_1_0_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3862:1: ( rule__EReferenceOpDef__RefAssignment_1_0_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3862:2: rule__EReferenceOpDef__RefAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__RefAssignment_1_0_2_in_rule__EReferenceOpDef__Group_1_0__2__Impl7749);
            rule__EReferenceOpDef__RefAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEReferenceOpDefAccess().getRefAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_0__2__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_0__3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3872:1: rule__EReferenceOpDef__Group_1_0__3 : rule__EReferenceOpDef__Group_1_0__3__Impl rule__EReferenceOpDef__Group_1_0__4 ;
    public final void rule__EReferenceOpDef__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3876:1: ( rule__EReferenceOpDef__Group_1_0__3__Impl rule__EReferenceOpDef__Group_1_0__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3877:2: rule__EReferenceOpDef__Group_1_0__3__Impl rule__EReferenceOpDef__Group_1_0__4
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__3__Impl_in_rule__EReferenceOpDef__Group_1_0__37779);
            rule__EReferenceOpDef__Group_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__4_in_rule__EReferenceOpDef__Group_1_0__37782);
            rule__EReferenceOpDef__Group_1_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_0__3"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_0__3__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3884:1: rule__EReferenceOpDef__Group_1_0__3__Impl : ( ':' ) ;
    public final void rule__EReferenceOpDef__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3888:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3889:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3889:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3890:1: ':'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getColonKeyword_1_0_3()); 
            match(input,19,FOLLOW_19_in_rule__EReferenceOpDef__Group_1_0__3__Impl7810); 
             after(grammarAccess.getEReferenceOpDefAccess().getColonKeyword_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_0__3__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_0__4"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3903:1: rule__EReferenceOpDef__Group_1_0__4 : rule__EReferenceOpDef__Group_1_0__4__Impl ;
    public final void rule__EReferenceOpDef__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3907:1: ( rule__EReferenceOpDef__Group_1_0__4__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3908:2: rule__EReferenceOpDef__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__4__Impl_in_rule__EReferenceOpDef__Group_1_0__47841);
            rule__EReferenceOpDef__Group_1_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_0__4"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_0__4__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3914:1: rule__EReferenceOpDef__Group_1_0__4__Impl : ( 'reference' ) ;
    public final void rule__EReferenceOpDef__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3918:1: ( ( 'reference' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3919:1: ( 'reference' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3919:1: ( 'reference' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3920:1: 'reference'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getReferenceKeyword_1_0_4()); 
            match(input,33,FOLLOW_33_in_rule__EReferenceOpDef__Group_1_0__4__Impl7869); 
             after(grammarAccess.getEReferenceOpDefAccess().getReferenceKeyword_1_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_0__4__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_3__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3943:1: rule__EReferenceOpDef__Group_1_3__0 : rule__EReferenceOpDef__Group_1_3__0__Impl rule__EReferenceOpDef__Group_1_3__1 ;
    public final void rule__EReferenceOpDef__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3947:1: ( rule__EReferenceOpDef__Group_1_3__0__Impl rule__EReferenceOpDef__Group_1_3__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3948:2: rule__EReferenceOpDef__Group_1_3__0__Impl rule__EReferenceOpDef__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_3__0__Impl_in_rule__EReferenceOpDef__Group_1_3__07910);
            rule__EReferenceOpDef__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_3__1_in_rule__EReferenceOpDef__Group_1_3__07913);
            rule__EReferenceOpDef__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_3__0"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_3__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3955:1: rule__EReferenceOpDef__Group_1_3__0__Impl : ( '{' ) ;
    public final void rule__EReferenceOpDef__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3959:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3960:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3960:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3961:1: '{'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getLeftCurlyBracketKeyword_1_3_0()); 
            match(input,17,FOLLOW_17_in_rule__EReferenceOpDef__Group_1_3__0__Impl7941); 
             after(grammarAccess.getEReferenceOpDefAccess().getLeftCurlyBracketKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_3__0__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_3__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3974:1: rule__EReferenceOpDef__Group_1_3__1 : rule__EReferenceOpDef__Group_1_3__1__Impl rule__EReferenceOpDef__Group_1_3__2 ;
    public final void rule__EReferenceOpDef__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3978:1: ( rule__EReferenceOpDef__Group_1_3__1__Impl rule__EReferenceOpDef__Group_1_3__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3979:2: rule__EReferenceOpDef__Group_1_3__1__Impl rule__EReferenceOpDef__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_3__1__Impl_in_rule__EReferenceOpDef__Group_1_3__17972);
            rule__EReferenceOpDef__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_3__2_in_rule__EReferenceOpDef__Group_1_3__17975);
            rule__EReferenceOpDef__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_3__1"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_3__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3986:1: rule__EReferenceOpDef__Group_1_3__1__Impl : ( ( rule__EReferenceOpDef__SettersAssignment_1_3_1 )* ) ;
    public final void rule__EReferenceOpDef__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3990:1: ( ( ( rule__EReferenceOpDef__SettersAssignment_1_3_1 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3991:1: ( ( rule__EReferenceOpDef__SettersAssignment_1_3_1 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3991:1: ( ( rule__EReferenceOpDef__SettersAssignment_1_3_1 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3992:1: ( rule__EReferenceOpDef__SettersAssignment_1_3_1 )*
            {
             before(grammarAccess.getEReferenceOpDefAccess().getSettersAssignment_1_3_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3993:1: ( rule__EReferenceOpDef__SettersAssignment_1_3_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3993:2: rule__EReferenceOpDef__SettersAssignment_1_3_1
            	    {
            	    pushFollow(FOLLOW_rule__EReferenceOpDef__SettersAssignment_1_3_1_in_rule__EReferenceOpDef__Group_1_3__1__Impl8002);
            	    rule__EReferenceOpDef__SettersAssignment_1_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEReferenceOpDefAccess().getSettersAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_3__1__Impl"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_3__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4003:1: rule__EReferenceOpDef__Group_1_3__2 : rule__EReferenceOpDef__Group_1_3__2__Impl ;
    public final void rule__EReferenceOpDef__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4007:1: ( rule__EReferenceOpDef__Group_1_3__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4008:2: rule__EReferenceOpDef__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_3__2__Impl_in_rule__EReferenceOpDef__Group_1_3__28033);
            rule__EReferenceOpDef__Group_1_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_3__2"


    // $ANTLR start "rule__EReferenceOpDef__Group_1_3__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4014:1: rule__EReferenceOpDef__Group_1_3__2__Impl : ( '}' ) ;
    public final void rule__EReferenceOpDef__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4018:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4019:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4019:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4020:1: '}'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getRightCurlyBracketKeyword_1_3_2()); 
            match(input,18,FOLLOW_18_in_rule__EReferenceOpDef__Group_1_3__2__Impl8061); 
             after(grammarAccess.getEReferenceOpDefAccess().getRightCurlyBracketKeyword_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__Group_1_3__2__Impl"


    // $ANTLR start "rule__SetterDef__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4039:1: rule__SetterDef__Group__0 : rule__SetterDef__Group__0__Impl rule__SetterDef__Group__1 ;
    public final void rule__SetterDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4043:1: ( rule__SetterDef__Group__0__Impl rule__SetterDef__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4044:2: rule__SetterDef__Group__0__Impl rule__SetterDef__Group__1
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__0__Impl_in_rule__SetterDef__Group__08098);
            rule__SetterDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetterDef__Group__1_in_rule__SetterDef__Group__08101);
            rule__SetterDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group__0"


    // $ANTLR start "rule__SetterDef__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4051:1: rule__SetterDef__Group__0__Impl : ( 'set' ) ;
    public final void rule__SetterDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4055:1: ( ( 'set' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4056:1: ( 'set' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4056:1: ( 'set' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4057:1: 'set'
            {
             before(grammarAccess.getSetterDefAccess().getSetKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__SetterDef__Group__0__Impl8129); 
             after(grammarAccess.getSetterDefAccess().getSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group__0__Impl"


    // $ANTLR start "rule__SetterDef__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4070:1: rule__SetterDef__Group__1 : rule__SetterDef__Group__1__Impl rule__SetterDef__Group__2 ;
    public final void rule__SetterDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4074:1: ( rule__SetterDef__Group__1__Impl rule__SetterDef__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4075:2: rule__SetterDef__Group__1__Impl rule__SetterDef__Group__2
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__1__Impl_in_rule__SetterDef__Group__18160);
            rule__SetterDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetterDef__Group__2_in_rule__SetterDef__Group__18163);
            rule__SetterDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group__1"


    // $ANTLR start "rule__SetterDef__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4082:1: rule__SetterDef__Group__1__Impl : ( ( rule__SetterDef__MetafeatureAssignment_1 ) ) ;
    public final void rule__SetterDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4086:1: ( ( ( rule__SetterDef__MetafeatureAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4087:1: ( ( rule__SetterDef__MetafeatureAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4087:1: ( ( rule__SetterDef__MetafeatureAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4088:1: ( rule__SetterDef__MetafeatureAssignment_1 )
            {
             before(grammarAccess.getSetterDefAccess().getMetafeatureAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4089:1: ( rule__SetterDef__MetafeatureAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4089:2: rule__SetterDef__MetafeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__SetterDef__MetafeatureAssignment_1_in_rule__SetterDef__Group__1__Impl8190);
            rule__SetterDef__MetafeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetterDefAccess().getMetafeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group__1__Impl"


    // $ANTLR start "rule__SetterDef__Group__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4099:1: rule__SetterDef__Group__2 : rule__SetterDef__Group__2__Impl rule__SetterDef__Group__3 ;
    public final void rule__SetterDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4103:1: ( rule__SetterDef__Group__2__Impl rule__SetterDef__Group__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4104:2: rule__SetterDef__Group__2__Impl rule__SetterDef__Group__3
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__2__Impl_in_rule__SetterDef__Group__28220);
            rule__SetterDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetterDef__Group__3_in_rule__SetterDef__Group__28223);
            rule__SetterDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group__2"


    // $ANTLR start "rule__SetterDef__Group__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4111:1: rule__SetterDef__Group__2__Impl : ( ( rule__SetterDef__OperatorAssignment_2 ) ) ;
    public final void rule__SetterDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4115:1: ( ( ( rule__SetterDef__OperatorAssignment_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4116:1: ( ( rule__SetterDef__OperatorAssignment_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4116:1: ( ( rule__SetterDef__OperatorAssignment_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4117:1: ( rule__SetterDef__OperatorAssignment_2 )
            {
             before(grammarAccess.getSetterDefAccess().getOperatorAssignment_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4118:1: ( rule__SetterDef__OperatorAssignment_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4118:2: rule__SetterDef__OperatorAssignment_2
            {
            pushFollow(FOLLOW_rule__SetterDef__OperatorAssignment_2_in_rule__SetterDef__Group__2__Impl8250);
            rule__SetterDef__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetterDefAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group__2__Impl"


    // $ANTLR start "rule__SetterDef__Group__3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4128:1: rule__SetterDef__Group__3 : rule__SetterDef__Group__3__Impl rule__SetterDef__Group__4 ;
    public final void rule__SetterDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4132:1: ( rule__SetterDef__Group__3__Impl rule__SetterDef__Group__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4133:2: rule__SetterDef__Group__3__Impl rule__SetterDef__Group__4
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__3__Impl_in_rule__SetterDef__Group__38280);
            rule__SetterDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetterDef__Group__4_in_rule__SetterDef__Group__38283);
            rule__SetterDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group__3"


    // $ANTLR start "rule__SetterDef__Group__3__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4140:1: rule__SetterDef__Group__3__Impl : ( ( rule__SetterDef__ParAssignment_3 ) ) ;
    public final void rule__SetterDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4144:1: ( ( ( rule__SetterDef__ParAssignment_3 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4145:1: ( ( rule__SetterDef__ParAssignment_3 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4145:1: ( ( rule__SetterDef__ParAssignment_3 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4146:1: ( rule__SetterDef__ParAssignment_3 )
            {
             before(grammarAccess.getSetterDefAccess().getParAssignment_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4147:1: ( rule__SetterDef__ParAssignment_3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4147:2: rule__SetterDef__ParAssignment_3
            {
            pushFollow(FOLLOW_rule__SetterDef__ParAssignment_3_in_rule__SetterDef__Group__3__Impl8310);
            rule__SetterDef__ParAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSetterDefAccess().getParAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group__3__Impl"


    // $ANTLR start "rule__SetterDef__Group__4"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4157:1: rule__SetterDef__Group__4 : rule__SetterDef__Group__4__Impl rule__SetterDef__Group__5 ;
    public final void rule__SetterDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4161:1: ( rule__SetterDef__Group__4__Impl rule__SetterDef__Group__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4162:2: rule__SetterDef__Group__4__Impl rule__SetterDef__Group__5
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__4__Impl_in_rule__SetterDef__Group__48340);
            rule__SetterDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetterDef__Group__5_in_rule__SetterDef__Group__48343);
            rule__SetterDef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group__4"


    // $ANTLR start "rule__SetterDef__Group__4__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4169:1: rule__SetterDef__Group__4__Impl : ( ( rule__SetterDef__Group_4__0 )* ) ;
    public final void rule__SetterDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4173:1: ( ( ( rule__SetterDef__Group_4__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4174:1: ( ( rule__SetterDef__Group_4__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4174:1: ( ( rule__SetterDef__Group_4__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4175:1: ( rule__SetterDef__Group_4__0 )*
            {
             before(grammarAccess.getSetterDefAccess().getGroup_4()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4176:1: ( rule__SetterDef__Group_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4176:2: rule__SetterDef__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__SetterDef__Group_4__0_in_rule__SetterDef__Group__4__Impl8370);
            	    rule__SetterDef__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSetterDefAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group__4__Impl"


    // $ANTLR start "rule__SetterDef__Group__5"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4186:1: rule__SetterDef__Group__5 : rule__SetterDef__Group__5__Impl ;
    public final void rule__SetterDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4190:1: ( rule__SetterDef__Group__5__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4191:2: rule__SetterDef__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__5__Impl_in_rule__SetterDef__Group__58401);
            rule__SetterDef__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group__5"


    // $ANTLR start "rule__SetterDef__Group__5__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4197:1: rule__SetterDef__Group__5__Impl : ( ';' ) ;
    public final void rule__SetterDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4201:1: ( ( ';' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4202:1: ( ';' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4202:1: ( ';' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4203:1: ';'
            {
             before(grammarAccess.getSetterDefAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__SetterDef__Group__5__Impl8429); 
             after(grammarAccess.getSetterDefAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group__5__Impl"


    // $ANTLR start "rule__SetterDef__Group_4__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4228:1: rule__SetterDef__Group_4__0 : rule__SetterDef__Group_4__0__Impl rule__SetterDef__Group_4__1 ;
    public final void rule__SetterDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4232:1: ( rule__SetterDef__Group_4__0__Impl rule__SetterDef__Group_4__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4233:2: rule__SetterDef__Group_4__0__Impl rule__SetterDef__Group_4__1
            {
            pushFollow(FOLLOW_rule__SetterDef__Group_4__0__Impl_in_rule__SetterDef__Group_4__08472);
            rule__SetterDef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetterDef__Group_4__1_in_rule__SetterDef__Group_4__08475);
            rule__SetterDef__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group_4__0"


    // $ANTLR start "rule__SetterDef__Group_4__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4240:1: rule__SetterDef__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SetterDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4244:1: ( ( ',' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4245:1: ( ',' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4245:1: ( ',' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4246:1: ','
            {
             before(grammarAccess.getSetterDefAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__SetterDef__Group_4__0__Impl8503); 
             after(grammarAccess.getSetterDefAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group_4__0__Impl"


    // $ANTLR start "rule__SetterDef__Group_4__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4259:1: rule__SetterDef__Group_4__1 : rule__SetterDef__Group_4__1__Impl ;
    public final void rule__SetterDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4263:1: ( rule__SetterDef__Group_4__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4264:2: rule__SetterDef__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SetterDef__Group_4__1__Impl_in_rule__SetterDef__Group_4__18534);
            rule__SetterDef__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group_4__1"


    // $ANTLR start "rule__SetterDef__Group_4__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4270:1: rule__SetterDef__Group_4__1__Impl : ( ( rule__SetterDef__ParAssignment_4_1 ) ) ;
    public final void rule__SetterDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4274:1: ( ( ( rule__SetterDef__ParAssignment_4_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4275:1: ( ( rule__SetterDef__ParAssignment_4_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4275:1: ( ( rule__SetterDef__ParAssignment_4_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4276:1: ( rule__SetterDef__ParAssignment_4_1 )
            {
             before(grammarAccess.getSetterDefAccess().getParAssignment_4_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4277:1: ( rule__SetterDef__ParAssignment_4_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4277:2: rule__SetterDef__ParAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SetterDef__ParAssignment_4_1_in_rule__SetterDef__Group_4__1__Impl8561);
            rule__SetterDef__ParAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSetterDefAccess().getParAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__Group_4__1__Impl"


    // $ANTLR start "rule__RewritingRule__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4291:1: rule__RewritingRule__Group__0 : rule__RewritingRule__Group__0__Impl rule__RewritingRule__Group__1 ;
    public final void rule__RewritingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4295:1: ( rule__RewritingRule__Group__0__Impl rule__RewritingRule__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4296:2: rule__RewritingRule__Group__0__Impl rule__RewritingRule__Group__1
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group__0__Impl_in_rule__RewritingRule__Group__08595);
            rule__RewritingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RewritingRule__Group__1_in_rule__RewritingRule__Group__08598);
            rule__RewritingRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group__0"


    // $ANTLR start "rule__RewritingRule__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4303:1: rule__RewritingRule__Group__0__Impl : ( ( rule__RewritingRule__Group_0__0 ) ) ;
    public final void rule__RewritingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4307:1: ( ( ( rule__RewritingRule__Group_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4308:1: ( ( rule__RewritingRule__Group_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4308:1: ( ( rule__RewritingRule__Group_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4309:1: ( rule__RewritingRule__Group_0__0 )
            {
             before(grammarAccess.getRewritingRuleAccess().getGroup_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4310:1: ( rule__RewritingRule__Group_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4310:2: rule__RewritingRule__Group_0__0
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_0__0_in_rule__RewritingRule__Group__0__Impl8625);
            rule__RewritingRule__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getRewritingRuleAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group__0__Impl"


    // $ANTLR start "rule__RewritingRule__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4320:1: rule__RewritingRule__Group__1 : rule__RewritingRule__Group__1__Impl ;
    public final void rule__RewritingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4324:1: ( rule__RewritingRule__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4325:2: rule__RewritingRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group__1__Impl_in_rule__RewritingRule__Group__18655);
            rule__RewritingRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group__1"


    // $ANTLR start "rule__RewritingRule__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4331:1: rule__RewritingRule__Group__1__Impl : ( ( rule__RewritingRule__Group_1__0 )* ) ;
    public final void rule__RewritingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4335:1: ( ( ( rule__RewritingRule__Group_1__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4336:1: ( ( rule__RewritingRule__Group_1__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4336:1: ( ( rule__RewritingRule__Group_1__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4337:1: ( rule__RewritingRule__Group_1__0 )*
            {
             before(grammarAccess.getRewritingRuleAccess().getGroup_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4338:1: ( rule__RewritingRule__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==36) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4338:2: rule__RewritingRule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RewritingRule__Group_1__0_in_rule__RewritingRule__Group__1__Impl8682);
            	    rule__RewritingRule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getRewritingRuleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group__1__Impl"


    // $ANTLR start "rule__RewritingRule__Group_0__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4352:1: rule__RewritingRule__Group_0__0 : rule__RewritingRule__Group_0__0__Impl rule__RewritingRule__Group_0__1 ;
    public final void rule__RewritingRule__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4356:1: ( rule__RewritingRule__Group_0__0__Impl rule__RewritingRule__Group_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4357:2: rule__RewritingRule__Group_0__0__Impl rule__RewritingRule__Group_0__1
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_0__0__Impl_in_rule__RewritingRule__Group_0__08717);
            rule__RewritingRule__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RewritingRule__Group_0__1_in_rule__RewritingRule__Group_0__08720);
            rule__RewritingRule__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_0__0"


    // $ANTLR start "rule__RewritingRule__Group_0__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4364:1: rule__RewritingRule__Group_0__0__Impl : ( ( rule__RewritingRule__MigratorsSXAssignment_0_0 ) ) ;
    public final void rule__RewritingRule__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4368:1: ( ( ( rule__RewritingRule__MigratorsSXAssignment_0_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4369:1: ( ( rule__RewritingRule__MigratorsSXAssignment_0_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4369:1: ( ( rule__RewritingRule__MigratorsSXAssignment_0_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4370:1: ( rule__RewritingRule__MigratorsSXAssignment_0_0 )
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorsSXAssignment_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4371:1: ( rule__RewritingRule__MigratorsSXAssignment_0_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4371:2: rule__RewritingRule__MigratorsSXAssignment_0_0
            {
            pushFollow(FOLLOW_rule__RewritingRule__MigratorsSXAssignment_0_0_in_rule__RewritingRule__Group_0__0__Impl8747);
            rule__RewritingRule__MigratorsSXAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRewritingRuleAccess().getMigratorsSXAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_0__0__Impl"


    // $ANTLR start "rule__RewritingRule__Group_0__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4381:1: rule__RewritingRule__Group_0__1 : rule__RewritingRule__Group_0__1__Impl rule__RewritingRule__Group_0__2 ;
    public final void rule__RewritingRule__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4385:1: ( rule__RewritingRule__Group_0__1__Impl rule__RewritingRule__Group_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4386:2: rule__RewritingRule__Group_0__1__Impl rule__RewritingRule__Group_0__2
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_0__1__Impl_in_rule__RewritingRule__Group_0__18777);
            rule__RewritingRule__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RewritingRule__Group_0__2_in_rule__RewritingRule__Group_0__18780);
            rule__RewritingRule__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_0__1"


    // $ANTLR start "rule__RewritingRule__Group_0__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4393:1: rule__RewritingRule__Group_0__1__Impl : ( '->' ) ;
    public final void rule__RewritingRule__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4397:1: ( ( '->' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4398:1: ( '->' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4398:1: ( '->' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4399:1: '->'
            {
             before(grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 
            match(input,35,FOLLOW_35_in_rule__RewritingRule__Group_0__1__Impl8808); 
             after(grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_0__1__Impl"


    // $ANTLR start "rule__RewritingRule__Group_0__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4412:1: rule__RewritingRule__Group_0__2 : rule__RewritingRule__Group_0__2__Impl ;
    public final void rule__RewritingRule__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4416:1: ( rule__RewritingRule__Group_0__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4417:2: rule__RewritingRule__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_0__2__Impl_in_rule__RewritingRule__Group_0__28839);
            rule__RewritingRule__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_0__2"


    // $ANTLR start "rule__RewritingRule__Group_0__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4423:1: rule__RewritingRule__Group_0__2__Impl : ( ( rule__RewritingRule__MigratorDXAssignment_0_2 ) ) ;
    public final void rule__RewritingRule__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4427:1: ( ( ( rule__RewritingRule__MigratorDXAssignment_0_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4428:1: ( ( rule__RewritingRule__MigratorDXAssignment_0_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4428:1: ( ( rule__RewritingRule__MigratorDXAssignment_0_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4429:1: ( rule__RewritingRule__MigratorDXAssignment_0_2 )
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorDXAssignment_0_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4430:1: ( rule__RewritingRule__MigratorDXAssignment_0_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4430:2: rule__RewritingRule__MigratorDXAssignment_0_2
            {
            pushFollow(FOLLOW_rule__RewritingRule__MigratorDXAssignment_0_2_in_rule__RewritingRule__Group_0__2__Impl8866);
            rule__RewritingRule__MigratorDXAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getRewritingRuleAccess().getMigratorDXAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_0__2__Impl"


    // $ANTLR start "rule__RewritingRule__Group_1__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4446:1: rule__RewritingRule__Group_1__0 : rule__RewritingRule__Group_1__0__Impl rule__RewritingRule__Group_1__1 ;
    public final void rule__RewritingRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4450:1: ( rule__RewritingRule__Group_1__0__Impl rule__RewritingRule__Group_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4451:2: rule__RewritingRule__Group_1__0__Impl rule__RewritingRule__Group_1__1
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_1__0__Impl_in_rule__RewritingRule__Group_1__08902);
            rule__RewritingRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RewritingRule__Group_1__1_in_rule__RewritingRule__Group_1__08905);
            rule__RewritingRule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_1__0"


    // $ANTLR start "rule__RewritingRule__Group_1__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4458:1: rule__RewritingRule__Group_1__0__Impl : ( '&' ) ;
    public final void rule__RewritingRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4462:1: ( ( '&' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4463:1: ( '&' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4463:1: ( '&' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4464:1: '&'
            {
             before(grammarAccess.getRewritingRuleAccess().getAmpersandKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__RewritingRule__Group_1__0__Impl8933); 
             after(grammarAccess.getRewritingRuleAccess().getAmpersandKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_1__0__Impl"


    // $ANTLR start "rule__RewritingRule__Group_1__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4477:1: rule__RewritingRule__Group_1__1 : rule__RewritingRule__Group_1__1__Impl rule__RewritingRule__Group_1__2 ;
    public final void rule__RewritingRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4481:1: ( rule__RewritingRule__Group_1__1__Impl rule__RewritingRule__Group_1__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4482:2: rule__RewritingRule__Group_1__1__Impl rule__RewritingRule__Group_1__2
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_1__1__Impl_in_rule__RewritingRule__Group_1__18964);
            rule__RewritingRule__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RewritingRule__Group_1__2_in_rule__RewritingRule__Group_1__18967);
            rule__RewritingRule__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_1__1"


    // $ANTLR start "rule__RewritingRule__Group_1__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4489:1: rule__RewritingRule__Group_1__1__Impl : ( ( rule__RewritingRule__MigratorSXAssignment_1_1 ) ) ;
    public final void rule__RewritingRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4493:1: ( ( ( rule__RewritingRule__MigratorSXAssignment_1_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4494:1: ( ( rule__RewritingRule__MigratorSXAssignment_1_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4494:1: ( ( rule__RewritingRule__MigratorSXAssignment_1_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4495:1: ( rule__RewritingRule__MigratorSXAssignment_1_1 )
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorSXAssignment_1_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4496:1: ( rule__RewritingRule__MigratorSXAssignment_1_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4496:2: rule__RewritingRule__MigratorSXAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RewritingRule__MigratorSXAssignment_1_1_in_rule__RewritingRule__Group_1__1__Impl8994);
            rule__RewritingRule__MigratorSXAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRewritingRuleAccess().getMigratorSXAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_1__1__Impl"


    // $ANTLR start "rule__RewritingRule__Group_1__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4506:1: rule__RewritingRule__Group_1__2 : rule__RewritingRule__Group_1__2__Impl rule__RewritingRule__Group_1__3 ;
    public final void rule__RewritingRule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4510:1: ( rule__RewritingRule__Group_1__2__Impl rule__RewritingRule__Group_1__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4511:2: rule__RewritingRule__Group_1__2__Impl rule__RewritingRule__Group_1__3
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_1__2__Impl_in_rule__RewritingRule__Group_1__29024);
            rule__RewritingRule__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RewritingRule__Group_1__3_in_rule__RewritingRule__Group_1__29027);
            rule__RewritingRule__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_1__2"


    // $ANTLR start "rule__RewritingRule__Group_1__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4518:1: rule__RewritingRule__Group_1__2__Impl : ( '->' ) ;
    public final void rule__RewritingRule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4522:1: ( ( '->' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4523:1: ( '->' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4523:1: ( '->' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4524:1: '->'
            {
             before(grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_1_2()); 
            match(input,35,FOLLOW_35_in_rule__RewritingRule__Group_1__2__Impl9055); 
             after(grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_1__2__Impl"


    // $ANTLR start "rule__RewritingRule__Group_1__3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4537:1: rule__RewritingRule__Group_1__3 : rule__RewritingRule__Group_1__3__Impl ;
    public final void rule__RewritingRule__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4541:1: ( rule__RewritingRule__Group_1__3__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4542:2: rule__RewritingRule__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_1__3__Impl_in_rule__RewritingRule__Group_1__39086);
            rule__RewritingRule__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_1__3"


    // $ANTLR start "rule__RewritingRule__Group_1__3__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4548:1: rule__RewritingRule__Group_1__3__Impl : ( ( rule__RewritingRule__MigratorDXAssignment_1_3 ) ) ;
    public final void rule__RewritingRule__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4552:1: ( ( ( rule__RewritingRule__MigratorDXAssignment_1_3 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4553:1: ( ( rule__RewritingRule__MigratorDXAssignment_1_3 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4553:1: ( ( rule__RewritingRule__MigratorDXAssignment_1_3 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4554:1: ( rule__RewritingRule__MigratorDXAssignment_1_3 )
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorDXAssignment_1_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4555:1: ( rule__RewritingRule__MigratorDXAssignment_1_3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4555:2: rule__RewritingRule__MigratorDXAssignment_1_3
            {
            pushFollow(FOLLOW_rule__RewritingRule__MigratorDXAssignment_1_3_in_rule__RewritingRule__Group_1__3__Impl9113);
            rule__RewritingRule__MigratorDXAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getRewritingRuleAccess().getMigratorDXAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__Group_1__3__Impl"


    // $ANTLR start "rule__MigratorSX__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4573:1: rule__MigratorSX__Group__0 : rule__MigratorSX__Group__0__Impl rule__MigratorSX__Group__1 ;
    public final void rule__MigratorSX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4577:1: ( rule__MigratorSX__Group__0__Impl rule__MigratorSX__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4578:2: rule__MigratorSX__Group__0__Impl rule__MigratorSX__Group__1
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__0__Impl_in_rule__MigratorSX__Group__09151);
            rule__MigratorSX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__1_in_rule__MigratorSX__Group__09154);
            rule__MigratorSX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__0"


    // $ANTLR start "rule__MigratorSX__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4585:1: rule__MigratorSX__Group__0__Impl : ( () ) ;
    public final void rule__MigratorSX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4589:1: ( ( () ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4590:1: ( () )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4590:1: ( () )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4591:1: ()
            {
             before(grammarAccess.getMigratorSXAccess().getMigratorSXAction_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4592:1: ()
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4594:1: 
            {
            }

             after(grammarAccess.getMigratorSXAccess().getMigratorSXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__0__Impl"


    // $ANTLR start "rule__MigratorSX__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4604:1: rule__MigratorSX__Group__1 : rule__MigratorSX__Group__1__Impl rule__MigratorSX__Group__2 ;
    public final void rule__MigratorSX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4608:1: ( rule__MigratorSX__Group__1__Impl rule__MigratorSX__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4609:2: rule__MigratorSX__Group__1__Impl rule__MigratorSX__Group__2
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__1__Impl_in_rule__MigratorSX__Group__19212);
            rule__MigratorSX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__2_in_rule__MigratorSX__Group__19215);
            rule__MigratorSX__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__1"


    // $ANTLR start "rule__MigratorSX__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4616:1: rule__MigratorSX__Group__1__Impl : ( ( rule__MigratorSX__NameAssignment_1 ) ) ;
    public final void rule__MigratorSX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4620:1: ( ( ( rule__MigratorSX__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4621:1: ( ( rule__MigratorSX__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4621:1: ( ( rule__MigratorSX__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4622:1: ( rule__MigratorSX__NameAssignment_1 )
            {
             before(grammarAccess.getMigratorSXAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4623:1: ( rule__MigratorSX__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4623:2: rule__MigratorSX__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MigratorSX__NameAssignment_1_in_rule__MigratorSX__Group__1__Impl9242);
            rule__MigratorSX__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMigratorSXAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__1__Impl"


    // $ANTLR start "rule__MigratorSX__Group__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4633:1: rule__MigratorSX__Group__2 : rule__MigratorSX__Group__2__Impl rule__MigratorSX__Group__3 ;
    public final void rule__MigratorSX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4637:1: ( rule__MigratorSX__Group__2__Impl rule__MigratorSX__Group__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4638:2: rule__MigratorSX__Group__2__Impl rule__MigratorSX__Group__3
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__2__Impl_in_rule__MigratorSX__Group__29272);
            rule__MigratorSX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__3_in_rule__MigratorSX__Group__29275);
            rule__MigratorSX__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__2"


    // $ANTLR start "rule__MigratorSX__Group__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4645:1: rule__MigratorSX__Group__2__Impl : ( ':' ) ;
    public final void rule__MigratorSX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4649:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4650:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4650:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4651:1: ':'
            {
             before(grammarAccess.getMigratorSXAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__MigratorSX__Group__2__Impl9303); 
             after(grammarAccess.getMigratorSXAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__2__Impl"


    // $ANTLR start "rule__MigratorSX__Group__3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4664:1: rule__MigratorSX__Group__3 : rule__MigratorSX__Group__3__Impl rule__MigratorSX__Group__4 ;
    public final void rule__MigratorSX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4668:1: ( rule__MigratorSX__Group__3__Impl rule__MigratorSX__Group__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4669:2: rule__MigratorSX__Group__3__Impl rule__MigratorSX__Group__4
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__3__Impl_in_rule__MigratorSX__Group__39334);
            rule__MigratorSX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__4_in_rule__MigratorSX__Group__39337);
            rule__MigratorSX__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__3"


    // $ANTLR start "rule__MigratorSX__Group__3__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4676:1: rule__MigratorSX__Group__3__Impl : ( ( rule__MigratorSX__ElementSXAssignment_3 ) ) ;
    public final void rule__MigratorSX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4680:1: ( ( ( rule__MigratorSX__ElementSXAssignment_3 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4681:1: ( ( rule__MigratorSX__ElementSXAssignment_3 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4681:1: ( ( rule__MigratorSX__ElementSXAssignment_3 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4682:1: ( rule__MigratorSX__ElementSXAssignment_3 )
            {
             before(grammarAccess.getMigratorSXAccess().getElementSXAssignment_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4683:1: ( rule__MigratorSX__ElementSXAssignment_3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4683:2: rule__MigratorSX__ElementSXAssignment_3
            {
            pushFollow(FOLLOW_rule__MigratorSX__ElementSXAssignment_3_in_rule__MigratorSX__Group__3__Impl9364);
            rule__MigratorSX__ElementSXAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMigratorSXAccess().getElementSXAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__3__Impl"


    // $ANTLR start "rule__MigratorSX__Group__4"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4693:1: rule__MigratorSX__Group__4 : rule__MigratorSX__Group__4__Impl rule__MigratorSX__Group__5 ;
    public final void rule__MigratorSX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4697:1: ( rule__MigratorSX__Group__4__Impl rule__MigratorSX__Group__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4698:2: rule__MigratorSX__Group__4__Impl rule__MigratorSX__Group__5
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__4__Impl_in_rule__MigratorSX__Group__49394);
            rule__MigratorSX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__5_in_rule__MigratorSX__Group__49397);
            rule__MigratorSX__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__4"


    // $ANTLR start "rule__MigratorSX__Group__4__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4705:1: rule__MigratorSX__Group__4__Impl : ( 'where' ) ;
    public final void rule__MigratorSX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4709:1: ( ( 'where' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4710:1: ( 'where' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4710:1: ( 'where' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4711:1: 'where'
            {
             before(grammarAccess.getMigratorSXAccess().getWhereKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__MigratorSX__Group__4__Impl9425); 
             after(grammarAccess.getMigratorSXAccess().getWhereKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__4__Impl"


    // $ANTLR start "rule__MigratorSX__Group__5"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4724:1: rule__MigratorSX__Group__5 : rule__MigratorSX__Group__5__Impl rule__MigratorSX__Group__6 ;
    public final void rule__MigratorSX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4728:1: ( rule__MigratorSX__Group__5__Impl rule__MigratorSX__Group__6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4729:2: rule__MigratorSX__Group__5__Impl rule__MigratorSX__Group__6
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__5__Impl_in_rule__MigratorSX__Group__59456);
            rule__MigratorSX__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__6_in_rule__MigratorSX__Group__59459);
            rule__MigratorSX__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__5"


    // $ANTLR start "rule__MigratorSX__Group__5__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4736:1: rule__MigratorSX__Group__5__Impl : ( '[' ) ;
    public final void rule__MigratorSX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4740:1: ( ( '[' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4741:1: ( '[' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4741:1: ( '[' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4742:1: '['
            {
             before(grammarAccess.getMigratorSXAccess().getLeftSquareBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__MigratorSX__Group__5__Impl9487); 
             after(grammarAccess.getMigratorSXAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__5__Impl"


    // $ANTLR start "rule__MigratorSX__Group__6"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4755:1: rule__MigratorSX__Group__6 : rule__MigratorSX__Group__6__Impl rule__MigratorSX__Group__7 ;
    public final void rule__MigratorSX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4759:1: ( rule__MigratorSX__Group__6__Impl rule__MigratorSX__Group__7 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4760:2: rule__MigratorSX__Group__6__Impl rule__MigratorSX__Group__7
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__6__Impl_in_rule__MigratorSX__Group__69518);
            rule__MigratorSX__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__7_in_rule__MigratorSX__Group__69521);
            rule__MigratorSX__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__6"


    // $ANTLR start "rule__MigratorSX__Group__6__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4767:1: rule__MigratorSX__Group__6__Impl : ( ( rule__MigratorSX__FilterSXAssignment_6 ) ) ;
    public final void rule__MigratorSX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4771:1: ( ( ( rule__MigratorSX__FilterSXAssignment_6 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4772:1: ( ( rule__MigratorSX__FilterSXAssignment_6 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4772:1: ( ( rule__MigratorSX__FilterSXAssignment_6 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4773:1: ( rule__MigratorSX__FilterSXAssignment_6 )
            {
             before(grammarAccess.getMigratorSXAccess().getFilterSXAssignment_6()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4774:1: ( rule__MigratorSX__FilterSXAssignment_6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4774:2: rule__MigratorSX__FilterSXAssignment_6
            {
            pushFollow(FOLLOW_rule__MigratorSX__FilterSXAssignment_6_in_rule__MigratorSX__Group__6__Impl9548);
            rule__MigratorSX__FilterSXAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMigratorSXAccess().getFilterSXAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__6__Impl"


    // $ANTLR start "rule__MigratorSX__Group__7"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4784:1: rule__MigratorSX__Group__7 : rule__MigratorSX__Group__7__Impl rule__MigratorSX__Group__8 ;
    public final void rule__MigratorSX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4788:1: ( rule__MigratorSX__Group__7__Impl rule__MigratorSX__Group__8 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4789:2: rule__MigratorSX__Group__7__Impl rule__MigratorSX__Group__8
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__7__Impl_in_rule__MigratorSX__Group__79578);
            rule__MigratorSX__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__8_in_rule__MigratorSX__Group__79581);
            rule__MigratorSX__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__7"


    // $ANTLR start "rule__MigratorSX__Group__7__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4796:1: rule__MigratorSX__Group__7__Impl : ( ( rule__MigratorSX__Group_7__0 )* ) ;
    public final void rule__MigratorSX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4800:1: ( ( ( rule__MigratorSX__Group_7__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4801:1: ( ( rule__MigratorSX__Group_7__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4801:1: ( ( rule__MigratorSX__Group_7__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4802:1: ( rule__MigratorSX__Group_7__0 )*
            {
             before(grammarAccess.getMigratorSXAccess().getGroup_7()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4803:1: ( rule__MigratorSX__Group_7__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4803:2: rule__MigratorSX__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__MigratorSX__Group_7__0_in_rule__MigratorSX__Group__7__Impl9608);
            	    rule__MigratorSX__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMigratorSXAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__7__Impl"


    // $ANTLR start "rule__MigratorSX__Group__8"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4813:1: rule__MigratorSX__Group__8 : rule__MigratorSX__Group__8__Impl ;
    public final void rule__MigratorSX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4817:1: ( rule__MigratorSX__Group__8__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4818:2: rule__MigratorSX__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__8__Impl_in_rule__MigratorSX__Group__89639);
            rule__MigratorSX__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__8"


    // $ANTLR start "rule__MigratorSX__Group__8__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4824:1: rule__MigratorSX__Group__8__Impl : ( ']' ) ;
    public final void rule__MigratorSX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4828:1: ( ( ']' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4829:1: ( ']' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4829:1: ( ']' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4830:1: ']'
            {
             before(grammarAccess.getMigratorSXAccess().getRightSquareBracketKeyword_8()); 
            match(input,25,FOLLOW_25_in_rule__MigratorSX__Group__8__Impl9667); 
             after(grammarAccess.getMigratorSXAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group__8__Impl"


    // $ANTLR start "rule__MigratorSX__Group_7__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4861:1: rule__MigratorSX__Group_7__0 : rule__MigratorSX__Group_7__0__Impl rule__MigratorSX__Group_7__1 ;
    public final void rule__MigratorSX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4865:1: ( rule__MigratorSX__Group_7__0__Impl rule__MigratorSX__Group_7__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4866:2: rule__MigratorSX__Group_7__0__Impl rule__MigratorSX__Group_7__1
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group_7__0__Impl_in_rule__MigratorSX__Group_7__09716);
            rule__MigratorSX__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group_7__1_in_rule__MigratorSX__Group_7__09719);
            rule__MigratorSX__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group_7__0"


    // $ANTLR start "rule__MigratorSX__Group_7__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4873:1: rule__MigratorSX__Group_7__0__Impl : ( '&' ) ;
    public final void rule__MigratorSX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4877:1: ( ( '&' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4878:1: ( '&' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4878:1: ( '&' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4879:1: '&'
            {
             before(grammarAccess.getMigratorSXAccess().getAmpersandKeyword_7_0()); 
            match(input,36,FOLLOW_36_in_rule__MigratorSX__Group_7__0__Impl9747); 
             after(grammarAccess.getMigratorSXAccess().getAmpersandKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group_7__0__Impl"


    // $ANTLR start "rule__MigratorSX__Group_7__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4892:1: rule__MigratorSX__Group_7__1 : rule__MigratorSX__Group_7__1__Impl ;
    public final void rule__MigratorSX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4896:1: ( rule__MigratorSX__Group_7__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4897:2: rule__MigratorSX__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group_7__1__Impl_in_rule__MigratorSX__Group_7__19778);
            rule__MigratorSX__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group_7__1"


    // $ANTLR start "rule__MigratorSX__Group_7__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4903:1: rule__MigratorSX__Group_7__1__Impl : ( ( rule__MigratorSX__FilterSXAssignment_7_1 ) ) ;
    public final void rule__MigratorSX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4907:1: ( ( ( rule__MigratorSX__FilterSXAssignment_7_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4908:1: ( ( rule__MigratorSX__FilterSXAssignment_7_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4908:1: ( ( rule__MigratorSX__FilterSXAssignment_7_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4909:1: ( rule__MigratorSX__FilterSXAssignment_7_1 )
            {
             before(grammarAccess.getMigratorSXAccess().getFilterSXAssignment_7_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4910:1: ( rule__MigratorSX__FilterSXAssignment_7_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4910:2: rule__MigratorSX__FilterSXAssignment_7_1
            {
            pushFollow(FOLLOW_rule__MigratorSX__FilterSXAssignment_7_1_in_rule__MigratorSX__Group_7__1__Impl9805);
            rule__MigratorSX__FilterSXAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMigratorSXAccess().getFilterSXAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__Group_7__1__Impl"


    // $ANTLR start "rule__MigratorDX__Group_0__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4924:1: rule__MigratorDX__Group_0__0 : rule__MigratorDX__Group_0__0__Impl rule__MigratorDX__Group_0__1 ;
    public final void rule__MigratorDX__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4928:1: ( rule__MigratorDX__Group_0__0__Impl rule__MigratorDX__Group_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4929:2: rule__MigratorDX__Group_0__0__Impl rule__MigratorDX__Group_0__1
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0__0__Impl_in_rule__MigratorDX__Group_0__09839);
            rule__MigratorDX__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0__1_in_rule__MigratorDX__Group_0__09842);
            rule__MigratorDX__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0__0"


    // $ANTLR start "rule__MigratorDX__Group_0__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4936:1: rule__MigratorDX__Group_0__0__Impl : ( () ) ;
    public final void rule__MigratorDX__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4940:1: ( ( () ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4941:1: ( () )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4941:1: ( () )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4942:1: ()
            {
             before(grammarAccess.getMigratorDXAccess().getMigratorDXAction_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4943:1: ()
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4945:1: 
            {
            }

             after(grammarAccess.getMigratorDXAccess().getMigratorDXAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0__0__Impl"


    // $ANTLR start "rule__MigratorDX__Group_0__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4955:1: rule__MigratorDX__Group_0__1 : rule__MigratorDX__Group_0__1__Impl ;
    public final void rule__MigratorDX__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4959:1: ( rule__MigratorDX__Group_0__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4960:2: rule__MigratorDX__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0__1__Impl_in_rule__MigratorDX__Group_0__19900);
            rule__MigratorDX__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0__1"


    // $ANTLR start "rule__MigratorDX__Group_0__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4966:1: rule__MigratorDX__Group_0__1__Impl : ( ( rule__MigratorDX__Group_0_1__0 ) ) ;
    public final void rule__MigratorDX__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4970:1: ( ( ( rule__MigratorDX__Group_0_1__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4971:1: ( ( rule__MigratorDX__Group_0_1__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4971:1: ( ( rule__MigratorDX__Group_0_1__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4972:1: ( rule__MigratorDX__Group_0_1__0 )
            {
             before(grammarAccess.getMigratorDXAccess().getGroup_0_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4973:1: ( rule__MigratorDX__Group_0_1__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4973:2: rule__MigratorDX__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__0_in_rule__MigratorDX__Group_0__1__Impl9927);
            rule__MigratorDX__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMigratorDXAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0__1__Impl"


    // $ANTLR start "rule__MigratorDX__Group_0_1__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4987:1: rule__MigratorDX__Group_0_1__0 : rule__MigratorDX__Group_0_1__0__Impl rule__MigratorDX__Group_0_1__1 ;
    public final void rule__MigratorDX__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4991:1: ( rule__MigratorDX__Group_0_1__0__Impl rule__MigratorDX__Group_0_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4992:2: rule__MigratorDX__Group_0_1__0__Impl rule__MigratorDX__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__0__Impl_in_rule__MigratorDX__Group_0_1__09961);
            rule__MigratorDX__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__1_in_rule__MigratorDX__Group_0_1__09964);
            rule__MigratorDX__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__0"


    // $ANTLR start "rule__MigratorDX__Group_0_1__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4999:1: rule__MigratorDX__Group_0_1__0__Impl : ( ( rule__MigratorDX__NameAssignment_0_1_0 ) ) ;
    public final void rule__MigratorDX__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5003:1: ( ( ( rule__MigratorDX__NameAssignment_0_1_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5004:1: ( ( rule__MigratorDX__NameAssignment_0_1_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5004:1: ( ( rule__MigratorDX__NameAssignment_0_1_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5005:1: ( rule__MigratorDX__NameAssignment_0_1_0 )
            {
             before(grammarAccess.getMigratorDXAccess().getNameAssignment_0_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5006:1: ( rule__MigratorDX__NameAssignment_0_1_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5006:2: rule__MigratorDX__NameAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__MigratorDX__NameAssignment_0_1_0_in_rule__MigratorDX__Group_0_1__0__Impl9991);
            rule__MigratorDX__NameAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMigratorDXAccess().getNameAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__0__Impl"


    // $ANTLR start "rule__MigratorDX__Group_0_1__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5016:1: rule__MigratorDX__Group_0_1__1 : rule__MigratorDX__Group_0_1__1__Impl rule__MigratorDX__Group_0_1__2 ;
    public final void rule__MigratorDX__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5020:1: ( rule__MigratorDX__Group_0_1__1__Impl rule__MigratorDX__Group_0_1__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5021:2: rule__MigratorDX__Group_0_1__1__Impl rule__MigratorDX__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__1__Impl_in_rule__MigratorDX__Group_0_1__110021);
            rule__MigratorDX__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__2_in_rule__MigratorDX__Group_0_1__110024);
            rule__MigratorDX__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__1"


    // $ANTLR start "rule__MigratorDX__Group_0_1__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5028:1: rule__MigratorDX__Group_0_1__1__Impl : ( ':' ) ;
    public final void rule__MigratorDX__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5032:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5033:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5033:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5034:1: ':'
            {
             before(grammarAccess.getMigratorDXAccess().getColonKeyword_0_1_1()); 
            match(input,19,FOLLOW_19_in_rule__MigratorDX__Group_0_1__1__Impl10052); 
             after(grammarAccess.getMigratorDXAccess().getColonKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__1__Impl"


    // $ANTLR start "rule__MigratorDX__Group_0_1__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5047:1: rule__MigratorDX__Group_0_1__2 : rule__MigratorDX__Group_0_1__2__Impl rule__MigratorDX__Group_0_1__3 ;
    public final void rule__MigratorDX__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5051:1: ( rule__MigratorDX__Group_0_1__2__Impl rule__MigratorDX__Group_0_1__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5052:2: rule__MigratorDX__Group_0_1__2__Impl rule__MigratorDX__Group_0_1__3
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__2__Impl_in_rule__MigratorDX__Group_0_1__210083);
            rule__MigratorDX__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__3_in_rule__MigratorDX__Group_0_1__210086);
            rule__MigratorDX__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__2"


    // $ANTLR start "rule__MigratorDX__Group_0_1__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5059:1: rule__MigratorDX__Group_0_1__2__Impl : ( ( rule__MigratorDX__ElementDXAssignment_0_1_2 ) ) ;
    public final void rule__MigratorDX__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5063:1: ( ( ( rule__MigratorDX__ElementDXAssignment_0_1_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5064:1: ( ( rule__MigratorDX__ElementDXAssignment_0_1_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5064:1: ( ( rule__MigratorDX__ElementDXAssignment_0_1_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5065:1: ( rule__MigratorDX__ElementDXAssignment_0_1_2 )
            {
             before(grammarAccess.getMigratorDXAccess().getElementDXAssignment_0_1_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5066:1: ( rule__MigratorDX__ElementDXAssignment_0_1_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5066:2: rule__MigratorDX__ElementDXAssignment_0_1_2
            {
            pushFollow(FOLLOW_rule__MigratorDX__ElementDXAssignment_0_1_2_in_rule__MigratorDX__Group_0_1__2__Impl10113);
            rule__MigratorDX__ElementDXAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMigratorDXAccess().getElementDXAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__2__Impl"


    // $ANTLR start "rule__MigratorDX__Group_0_1__3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5076:1: rule__MigratorDX__Group_0_1__3 : rule__MigratorDX__Group_0_1__3__Impl rule__MigratorDX__Group_0_1__4 ;
    public final void rule__MigratorDX__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5080:1: ( rule__MigratorDX__Group_0_1__3__Impl rule__MigratorDX__Group_0_1__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5081:2: rule__MigratorDX__Group_0_1__3__Impl rule__MigratorDX__Group_0_1__4
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__3__Impl_in_rule__MigratorDX__Group_0_1__310143);
            rule__MigratorDX__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__4_in_rule__MigratorDX__Group_0_1__310146);
            rule__MigratorDX__Group_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__3"


    // $ANTLR start "rule__MigratorDX__Group_0_1__3__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5088:1: rule__MigratorDX__Group_0_1__3__Impl : ( '[' ) ;
    public final void rule__MigratorDX__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5092:1: ( ( '[' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5093:1: ( '[' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5093:1: ( '[' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5094:1: '['
            {
             before(grammarAccess.getMigratorDXAccess().getLeftSquareBracketKeyword_0_1_3()); 
            match(input,24,FOLLOW_24_in_rule__MigratorDX__Group_0_1__3__Impl10174); 
             after(grammarAccess.getMigratorDXAccess().getLeftSquareBracketKeyword_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__3__Impl"


    // $ANTLR start "rule__MigratorDX__Group_0_1__4"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5107:1: rule__MigratorDX__Group_0_1__4 : rule__MigratorDX__Group_0_1__4__Impl rule__MigratorDX__Group_0_1__5 ;
    public final void rule__MigratorDX__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5111:1: ( rule__MigratorDX__Group_0_1__4__Impl rule__MigratorDX__Group_0_1__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5112:2: rule__MigratorDX__Group_0_1__4__Impl rule__MigratorDX__Group_0_1__5
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__4__Impl_in_rule__MigratorDX__Group_0_1__410205);
            rule__MigratorDX__Group_0_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__5_in_rule__MigratorDX__Group_0_1__410208);
            rule__MigratorDX__Group_0_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__4"


    // $ANTLR start "rule__MigratorDX__Group_0_1__4__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5119:1: rule__MigratorDX__Group_0_1__4__Impl : ( ( rule__MigratorDX__FilterDXAssignment_0_1_4 ) ) ;
    public final void rule__MigratorDX__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5123:1: ( ( ( rule__MigratorDX__FilterDXAssignment_0_1_4 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5124:1: ( ( rule__MigratorDX__FilterDXAssignment_0_1_4 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5124:1: ( ( rule__MigratorDX__FilterDXAssignment_0_1_4 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5125:1: ( rule__MigratorDX__FilterDXAssignment_0_1_4 )
            {
             before(grammarAccess.getMigratorDXAccess().getFilterDXAssignment_0_1_4()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5126:1: ( rule__MigratorDX__FilterDXAssignment_0_1_4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5126:2: rule__MigratorDX__FilterDXAssignment_0_1_4
            {
            pushFollow(FOLLOW_rule__MigratorDX__FilterDXAssignment_0_1_4_in_rule__MigratorDX__Group_0_1__4__Impl10235);
            rule__MigratorDX__FilterDXAssignment_0_1_4();

            state._fsp--;


            }

             after(grammarAccess.getMigratorDXAccess().getFilterDXAssignment_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__4__Impl"


    // $ANTLR start "rule__MigratorDX__Group_0_1__5"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5136:1: rule__MigratorDX__Group_0_1__5 : rule__MigratorDX__Group_0_1__5__Impl rule__MigratorDX__Group_0_1__6 ;
    public final void rule__MigratorDX__Group_0_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5140:1: ( rule__MigratorDX__Group_0_1__5__Impl rule__MigratorDX__Group_0_1__6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5141:2: rule__MigratorDX__Group_0_1__5__Impl rule__MigratorDX__Group_0_1__6
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__5__Impl_in_rule__MigratorDX__Group_0_1__510265);
            rule__MigratorDX__Group_0_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__6_in_rule__MigratorDX__Group_0_1__510268);
            rule__MigratorDX__Group_0_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__5"


    // $ANTLR start "rule__MigratorDX__Group_0_1__5__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5148:1: rule__MigratorDX__Group_0_1__5__Impl : ( ( rule__MigratorDX__Group_0_1_5__0 )* ) ;
    public final void rule__MigratorDX__Group_0_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5152:1: ( ( ( rule__MigratorDX__Group_0_1_5__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5153:1: ( ( rule__MigratorDX__Group_0_1_5__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5153:1: ( ( rule__MigratorDX__Group_0_1_5__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5154:1: ( rule__MigratorDX__Group_0_1_5__0 )*
            {
             before(grammarAccess.getMigratorDXAccess().getGroup_0_1_5()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5155:1: ( rule__MigratorDX__Group_0_1_5__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5155:2: rule__MigratorDX__Group_0_1_5__0
            	    {
            	    pushFollow(FOLLOW_rule__MigratorDX__Group_0_1_5__0_in_rule__MigratorDX__Group_0_1__5__Impl10295);
            	    rule__MigratorDX__Group_0_1_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMigratorDXAccess().getGroup_0_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__5__Impl"


    // $ANTLR start "rule__MigratorDX__Group_0_1__6"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5165:1: rule__MigratorDX__Group_0_1__6 : rule__MigratorDX__Group_0_1__6__Impl ;
    public final void rule__MigratorDX__Group_0_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5169:1: ( rule__MigratorDX__Group_0_1__6__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5170:2: rule__MigratorDX__Group_0_1__6__Impl
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__6__Impl_in_rule__MigratorDX__Group_0_1__610326);
            rule__MigratorDX__Group_0_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__6"


    // $ANTLR start "rule__MigratorDX__Group_0_1__6__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5176:1: rule__MigratorDX__Group_0_1__6__Impl : ( ']' ) ;
    public final void rule__MigratorDX__Group_0_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5180:1: ( ( ']' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5181:1: ( ']' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5181:1: ( ']' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5182:1: ']'
            {
             before(grammarAccess.getMigratorDXAccess().getRightSquareBracketKeyword_0_1_6()); 
            match(input,25,FOLLOW_25_in_rule__MigratorDX__Group_0_1__6__Impl10354); 
             after(grammarAccess.getMigratorDXAccess().getRightSquareBracketKeyword_0_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1__6__Impl"


    // $ANTLR start "rule__MigratorDX__Group_0_1_5__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5209:1: rule__MigratorDX__Group_0_1_5__0 : rule__MigratorDX__Group_0_1_5__0__Impl rule__MigratorDX__Group_0_1_5__1 ;
    public final void rule__MigratorDX__Group_0_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5213:1: ( rule__MigratorDX__Group_0_1_5__0__Impl rule__MigratorDX__Group_0_1_5__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5214:2: rule__MigratorDX__Group_0_1_5__0__Impl rule__MigratorDX__Group_0_1_5__1
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1_5__0__Impl_in_rule__MigratorDX__Group_0_1_5__010399);
            rule__MigratorDX__Group_0_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1_5__1_in_rule__MigratorDX__Group_0_1_5__010402);
            rule__MigratorDX__Group_0_1_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1_5__0"


    // $ANTLR start "rule__MigratorDX__Group_0_1_5__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5221:1: rule__MigratorDX__Group_0_1_5__0__Impl : ( '&' ) ;
    public final void rule__MigratorDX__Group_0_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5225:1: ( ( '&' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5226:1: ( '&' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5226:1: ( '&' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5227:1: '&'
            {
             before(grammarAccess.getMigratorDXAccess().getAmpersandKeyword_0_1_5_0()); 
            match(input,36,FOLLOW_36_in_rule__MigratorDX__Group_0_1_5__0__Impl10430); 
             after(grammarAccess.getMigratorDXAccess().getAmpersandKeyword_0_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1_5__0__Impl"


    // $ANTLR start "rule__MigratorDX__Group_0_1_5__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5240:1: rule__MigratorDX__Group_0_1_5__1 : rule__MigratorDX__Group_0_1_5__1__Impl ;
    public final void rule__MigratorDX__Group_0_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5244:1: ( rule__MigratorDX__Group_0_1_5__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5245:2: rule__MigratorDX__Group_0_1_5__1__Impl
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1_5__1__Impl_in_rule__MigratorDX__Group_0_1_5__110461);
            rule__MigratorDX__Group_0_1_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1_5__1"


    // $ANTLR start "rule__MigratorDX__Group_0_1_5__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5251:1: rule__MigratorDX__Group_0_1_5__1__Impl : ( ( rule__MigratorDX__FilterDXAssignment_0_1_5_1 ) ) ;
    public final void rule__MigratorDX__Group_0_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5255:1: ( ( ( rule__MigratorDX__FilterDXAssignment_0_1_5_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5256:1: ( ( rule__MigratorDX__FilterDXAssignment_0_1_5_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5256:1: ( ( rule__MigratorDX__FilterDXAssignment_0_1_5_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5257:1: ( rule__MigratorDX__FilterDXAssignment_0_1_5_1 )
            {
             before(grammarAccess.getMigratorDXAccess().getFilterDXAssignment_0_1_5_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5258:1: ( rule__MigratorDX__FilterDXAssignment_0_1_5_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5258:2: rule__MigratorDX__FilterDXAssignment_0_1_5_1
            {
            pushFollow(FOLLOW_rule__MigratorDX__FilterDXAssignment_0_1_5_1_in_rule__MigratorDX__Group_0_1_5__1__Impl10488);
            rule__MigratorDX__FilterDXAssignment_0_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMigratorDXAccess().getFilterDXAssignment_0_1_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__Group_0_1_5__1__Impl"


    // $ANTLR start "rule__FilterMigrator__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5272:1: rule__FilterMigrator__Group__0 : rule__FilterMigrator__Group__0__Impl rule__FilterMigrator__Group__1 ;
    public final void rule__FilterMigrator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5276:1: ( rule__FilterMigrator__Group__0__Impl rule__FilterMigrator__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5277:2: rule__FilterMigrator__Group__0__Impl rule__FilterMigrator__Group__1
            {
            pushFollow(FOLLOW_rule__FilterMigrator__Group__0__Impl_in_rule__FilterMigrator__Group__010522);
            rule__FilterMigrator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterMigrator__Group__1_in_rule__FilterMigrator__Group__010525);
            rule__FilterMigrator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterMigrator__Group__0"


    // $ANTLR start "rule__FilterMigrator__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5284:1: rule__FilterMigrator__Group__0__Impl : ( ( rule__FilterMigrator__FeatureSXAssignment_0 ) ) ;
    public final void rule__FilterMigrator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5288:1: ( ( ( rule__FilterMigrator__FeatureSXAssignment_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5289:1: ( ( rule__FilterMigrator__FeatureSXAssignment_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5289:1: ( ( rule__FilterMigrator__FeatureSXAssignment_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5290:1: ( rule__FilterMigrator__FeatureSXAssignment_0 )
            {
             before(grammarAccess.getFilterMigratorAccess().getFeatureSXAssignment_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5291:1: ( rule__FilterMigrator__FeatureSXAssignment_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5291:2: rule__FilterMigrator__FeatureSXAssignment_0
            {
            pushFollow(FOLLOW_rule__FilterMigrator__FeatureSXAssignment_0_in_rule__FilterMigrator__Group__0__Impl10552);
            rule__FilterMigrator__FeatureSXAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFilterMigratorAccess().getFeatureSXAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterMigrator__Group__0__Impl"


    // $ANTLR start "rule__FilterMigrator__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5301:1: rule__FilterMigrator__Group__1 : rule__FilterMigrator__Group__1__Impl rule__FilterMigrator__Group__2 ;
    public final void rule__FilterMigrator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5305:1: ( rule__FilterMigrator__Group__1__Impl rule__FilterMigrator__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5306:2: rule__FilterMigrator__Group__1__Impl rule__FilterMigrator__Group__2
            {
            pushFollow(FOLLOW_rule__FilterMigrator__Group__1__Impl_in_rule__FilterMigrator__Group__110582);
            rule__FilterMigrator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterMigrator__Group__2_in_rule__FilterMigrator__Group__110585);
            rule__FilterMigrator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterMigrator__Group__1"


    // $ANTLR start "rule__FilterMigrator__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5313:1: rule__FilterMigrator__Group__1__Impl : ( ( rule__FilterMigrator__OpAssignment_1 ) ) ;
    public final void rule__FilterMigrator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5317:1: ( ( ( rule__FilterMigrator__OpAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5318:1: ( ( rule__FilterMigrator__OpAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5318:1: ( ( rule__FilterMigrator__OpAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5319:1: ( rule__FilterMigrator__OpAssignment_1 )
            {
             before(grammarAccess.getFilterMigratorAccess().getOpAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5320:1: ( rule__FilterMigrator__OpAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5320:2: rule__FilterMigrator__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterMigrator__OpAssignment_1_in_rule__FilterMigrator__Group__1__Impl10612);
            rule__FilterMigrator__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterMigratorAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterMigrator__Group__1__Impl"


    // $ANTLR start "rule__FilterMigrator__Group__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5330:1: rule__FilterMigrator__Group__2 : rule__FilterMigrator__Group__2__Impl ;
    public final void rule__FilterMigrator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5334:1: ( rule__FilterMigrator__Group__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5335:2: rule__FilterMigrator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FilterMigrator__Group__2__Impl_in_rule__FilterMigrator__Group__210642);
            rule__FilterMigrator__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterMigrator__Group__2"


    // $ANTLR start "rule__FilterMigrator__Group__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5341:1: rule__FilterMigrator__Group__2__Impl : ( ( rule__FilterMigrator__ValueAssignment_2 )? ) ;
    public final void rule__FilterMigrator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5345:1: ( ( ( rule__FilterMigrator__ValueAssignment_2 )? ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5346:1: ( ( rule__FilterMigrator__ValueAssignment_2 )? )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5346:1: ( ( rule__FilterMigrator__ValueAssignment_2 )? )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5347:1: ( rule__FilterMigrator__ValueAssignment_2 )?
            {
             before(grammarAccess.getFilterMigratorAccess().getValueAssignment_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5348:1: ( rule__FilterMigrator__ValueAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5348:2: rule__FilterMigrator__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FilterMigrator__ValueAssignment_2_in_rule__FilterMigrator__Group__2__Impl10669);
                    rule__FilterMigrator__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterMigratorAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterMigrator__Group__2__Impl"


    // $ANTLR start "rule__DotNavigationObjSX__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5364:1: rule__DotNavigationObjSX__Group__0 : rule__DotNavigationObjSX__Group__0__Impl rule__DotNavigationObjSX__Group__1 ;
    public final void rule__DotNavigationObjSX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5368:1: ( rule__DotNavigationObjSX__Group__0__Impl rule__DotNavigationObjSX__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5369:2: rule__DotNavigationObjSX__Group__0__Impl rule__DotNavigationObjSX__Group__1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group__0__Impl_in_rule__DotNavigationObjSX__Group__010706);
            rule__DotNavigationObjSX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group__1_in_rule__DotNavigationObjSX__Group__010709);
            rule__DotNavigationObjSX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjSX__Group__0"


    // $ANTLR start "rule__DotNavigationObjSX__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5376:1: rule__DotNavigationObjSX__Group__0__Impl : ( '#' ) ;
    public final void rule__DotNavigationObjSX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5380:1: ( ( '#' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5381:1: ( '#' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5381:1: ( '#' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5382:1: '#'
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getNumberSignKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__DotNavigationObjSX__Group__0__Impl10737); 
             after(grammarAccess.getDotNavigationObjSXAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjSX__Group__0__Impl"


    // $ANTLR start "rule__DotNavigationObjSX__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5395:1: rule__DotNavigationObjSX__Group__1 : rule__DotNavigationObjSX__Group__1__Impl rule__DotNavigationObjSX__Group__2 ;
    public final void rule__DotNavigationObjSX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5399:1: ( rule__DotNavigationObjSX__Group__1__Impl rule__DotNavigationObjSX__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5400:2: rule__DotNavigationObjSX__Group__1__Impl rule__DotNavigationObjSX__Group__2
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group__1__Impl_in_rule__DotNavigationObjSX__Group__110768);
            rule__DotNavigationObjSX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group__2_in_rule__DotNavigationObjSX__Group__110771);
            rule__DotNavigationObjSX__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjSX__Group__1"


    // $ANTLR start "rule__DotNavigationObjSX__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5407:1: rule__DotNavigationObjSX__Group__1__Impl : ( ( rule__DotNavigationObjSX__ObjAssignment_1 ) ) ;
    public final void rule__DotNavigationObjSX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5411:1: ( ( ( rule__DotNavigationObjSX__ObjAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5412:1: ( ( rule__DotNavigationObjSX__ObjAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5412:1: ( ( rule__DotNavigationObjSX__ObjAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5413:1: ( rule__DotNavigationObjSX__ObjAssignment_1 )
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getObjAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5414:1: ( rule__DotNavigationObjSX__ObjAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5414:2: rule__DotNavigationObjSX__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__ObjAssignment_1_in_rule__DotNavigationObjSX__Group__1__Impl10798);
            rule__DotNavigationObjSX__ObjAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDotNavigationObjSXAccess().getObjAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjSX__Group__1__Impl"


    // $ANTLR start "rule__DotNavigationObjSX__Group__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5424:1: rule__DotNavigationObjSX__Group__2 : rule__DotNavigationObjSX__Group__2__Impl ;
    public final void rule__DotNavigationObjSX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5428:1: ( rule__DotNavigationObjSX__Group__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5429:2: rule__DotNavigationObjSX__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group__2__Impl_in_rule__DotNavigationObjSX__Group__210828);
            rule__DotNavigationObjSX__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjSX__Group__2"


    // $ANTLR start "rule__DotNavigationObjSX__Group__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5435:1: rule__DotNavigationObjSX__Group__2__Impl : ( ( rule__DotNavigationObjSX__Group_2__0 )* ) ;
    public final void rule__DotNavigationObjSX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5439:1: ( ( ( rule__DotNavigationObjSX__Group_2__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5440:1: ( ( rule__DotNavigationObjSX__Group_2__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5440:1: ( ( rule__DotNavigationObjSX__Group_2__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5441:1: ( rule__DotNavigationObjSX__Group_2__0 )*
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getGroup_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5442:1: ( rule__DotNavigationObjSX__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5442:2: rule__DotNavigationObjSX__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__DotNavigationObjSX__Group_2__0_in_rule__DotNavigationObjSX__Group__2__Impl10855);
            	    rule__DotNavigationObjSX__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getDotNavigationObjSXAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjSX__Group__2__Impl"


    // $ANTLR start "rule__DotNavigationObjSX__Group_2__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5458:1: rule__DotNavigationObjSX__Group_2__0 : rule__DotNavigationObjSX__Group_2__0__Impl rule__DotNavigationObjSX__Group_2__1 ;
    public final void rule__DotNavigationObjSX__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5462:1: ( rule__DotNavigationObjSX__Group_2__0__Impl rule__DotNavigationObjSX__Group_2__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5463:2: rule__DotNavigationObjSX__Group_2__0__Impl rule__DotNavigationObjSX__Group_2__1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group_2__0__Impl_in_rule__DotNavigationObjSX__Group_2__010892);
            rule__DotNavigationObjSX__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group_2__1_in_rule__DotNavigationObjSX__Group_2__010895);
            rule__DotNavigationObjSX__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjSX__Group_2__0"


    // $ANTLR start "rule__DotNavigationObjSX__Group_2__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5470:1: rule__DotNavigationObjSX__Group_2__0__Impl : ( '.' ) ;
    public final void rule__DotNavigationObjSX__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5474:1: ( ( '.' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5475:1: ( '.' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5475:1: ( '.' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5476:1: '.'
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getFullStopKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__DotNavigationObjSX__Group_2__0__Impl10923); 
             after(grammarAccess.getDotNavigationObjSXAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjSX__Group_2__0__Impl"


    // $ANTLR start "rule__DotNavigationObjSX__Group_2__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5489:1: rule__DotNavigationObjSX__Group_2__1 : rule__DotNavigationObjSX__Group_2__1__Impl ;
    public final void rule__DotNavigationObjSX__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5493:1: ( rule__DotNavigationObjSX__Group_2__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5494:2: rule__DotNavigationObjSX__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group_2__1__Impl_in_rule__DotNavigationObjSX__Group_2__110954);
            rule__DotNavigationObjSX__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjSX__Group_2__1"


    // $ANTLR start "rule__DotNavigationObjSX__Group_2__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5500:1: rule__DotNavigationObjSX__Group_2__1__Impl : ( ( rule__DotNavigationObjSX__RefAssignment_2_1 ) ) ;
    public final void rule__DotNavigationObjSX__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5504:1: ( ( ( rule__DotNavigationObjSX__RefAssignment_2_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5505:1: ( ( rule__DotNavigationObjSX__RefAssignment_2_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5505:1: ( ( rule__DotNavigationObjSX__RefAssignment_2_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5506:1: ( rule__DotNavigationObjSX__RefAssignment_2_1 )
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getRefAssignment_2_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5507:1: ( rule__DotNavigationObjSX__RefAssignment_2_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5507:2: rule__DotNavigationObjSX__RefAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__RefAssignment_2_1_in_rule__DotNavigationObjSX__Group_2__1__Impl10981);
            rule__DotNavigationObjSX__RefAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDotNavigationObjSXAccess().getRefAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjSX__Group_2__1__Impl"


    // $ANTLR start "rule__DotNavigationObjDX__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5521:1: rule__DotNavigationObjDX__Group__0 : rule__DotNavigationObjDX__Group__0__Impl rule__DotNavigationObjDX__Group__1 ;
    public final void rule__DotNavigationObjDX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5525:1: ( rule__DotNavigationObjDX__Group__0__Impl rule__DotNavigationObjDX__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5526:2: rule__DotNavigationObjDX__Group__0__Impl rule__DotNavigationObjDX__Group__1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group__0__Impl_in_rule__DotNavigationObjDX__Group__011015);
            rule__DotNavigationObjDX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group__1_in_rule__DotNavigationObjDX__Group__011018);
            rule__DotNavigationObjDX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjDX__Group__0"


    // $ANTLR start "rule__DotNavigationObjDX__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5533:1: rule__DotNavigationObjDX__Group__0__Impl : ( '#' ) ;
    public final void rule__DotNavigationObjDX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5537:1: ( ( '#' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5538:1: ( '#' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5538:1: ( '#' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5539:1: '#'
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getNumberSignKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__DotNavigationObjDX__Group__0__Impl11046); 
             after(grammarAccess.getDotNavigationObjDXAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjDX__Group__0__Impl"


    // $ANTLR start "rule__DotNavigationObjDX__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5552:1: rule__DotNavigationObjDX__Group__1 : rule__DotNavigationObjDX__Group__1__Impl rule__DotNavigationObjDX__Group__2 ;
    public final void rule__DotNavigationObjDX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5556:1: ( rule__DotNavigationObjDX__Group__1__Impl rule__DotNavigationObjDX__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5557:2: rule__DotNavigationObjDX__Group__1__Impl rule__DotNavigationObjDX__Group__2
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group__1__Impl_in_rule__DotNavigationObjDX__Group__111077);
            rule__DotNavigationObjDX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group__2_in_rule__DotNavigationObjDX__Group__111080);
            rule__DotNavigationObjDX__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjDX__Group__1"


    // $ANTLR start "rule__DotNavigationObjDX__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5564:1: rule__DotNavigationObjDX__Group__1__Impl : ( ( rule__DotNavigationObjDX__ObjAssignment_1 ) ) ;
    public final void rule__DotNavigationObjDX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5568:1: ( ( ( rule__DotNavigationObjDX__ObjAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5569:1: ( ( rule__DotNavigationObjDX__ObjAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5569:1: ( ( rule__DotNavigationObjDX__ObjAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5570:1: ( rule__DotNavigationObjDX__ObjAssignment_1 )
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getObjAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5571:1: ( rule__DotNavigationObjDX__ObjAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5571:2: rule__DotNavigationObjDX__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__ObjAssignment_1_in_rule__DotNavigationObjDX__Group__1__Impl11107);
            rule__DotNavigationObjDX__ObjAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDotNavigationObjDXAccess().getObjAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjDX__Group__1__Impl"


    // $ANTLR start "rule__DotNavigationObjDX__Group__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5581:1: rule__DotNavigationObjDX__Group__2 : rule__DotNavigationObjDX__Group__2__Impl ;
    public final void rule__DotNavigationObjDX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5585:1: ( rule__DotNavigationObjDX__Group__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5586:2: rule__DotNavigationObjDX__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group__2__Impl_in_rule__DotNavigationObjDX__Group__211137);
            rule__DotNavigationObjDX__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjDX__Group__2"


    // $ANTLR start "rule__DotNavigationObjDX__Group__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5592:1: rule__DotNavigationObjDX__Group__2__Impl : ( ( rule__DotNavigationObjDX__Group_2__0 )* ) ;
    public final void rule__DotNavigationObjDX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5596:1: ( ( ( rule__DotNavigationObjDX__Group_2__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5597:1: ( ( rule__DotNavigationObjDX__Group_2__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5597:1: ( ( rule__DotNavigationObjDX__Group_2__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5598:1: ( rule__DotNavigationObjDX__Group_2__0 )*
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getGroup_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5599:1: ( rule__DotNavigationObjDX__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==38) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5599:2: rule__DotNavigationObjDX__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__DotNavigationObjDX__Group_2__0_in_rule__DotNavigationObjDX__Group__2__Impl11164);
            	    rule__DotNavigationObjDX__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDotNavigationObjDXAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjDX__Group__2__Impl"


    // $ANTLR start "rule__DotNavigationObjDX__Group_2__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5615:1: rule__DotNavigationObjDX__Group_2__0 : rule__DotNavigationObjDX__Group_2__0__Impl rule__DotNavigationObjDX__Group_2__1 ;
    public final void rule__DotNavigationObjDX__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5619:1: ( rule__DotNavigationObjDX__Group_2__0__Impl rule__DotNavigationObjDX__Group_2__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5620:2: rule__DotNavigationObjDX__Group_2__0__Impl rule__DotNavigationObjDX__Group_2__1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group_2__0__Impl_in_rule__DotNavigationObjDX__Group_2__011201);
            rule__DotNavigationObjDX__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group_2__1_in_rule__DotNavigationObjDX__Group_2__011204);
            rule__DotNavigationObjDX__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjDX__Group_2__0"


    // $ANTLR start "rule__DotNavigationObjDX__Group_2__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5627:1: rule__DotNavigationObjDX__Group_2__0__Impl : ( '.' ) ;
    public final void rule__DotNavigationObjDX__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5631:1: ( ( '.' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5632:1: ( '.' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5632:1: ( '.' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5633:1: '.'
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getFullStopKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__DotNavigationObjDX__Group_2__0__Impl11232); 
             after(grammarAccess.getDotNavigationObjDXAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjDX__Group_2__0__Impl"


    // $ANTLR start "rule__DotNavigationObjDX__Group_2__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5646:1: rule__DotNavigationObjDX__Group_2__1 : rule__DotNavigationObjDX__Group_2__1__Impl ;
    public final void rule__DotNavigationObjDX__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5650:1: ( rule__DotNavigationObjDX__Group_2__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5651:2: rule__DotNavigationObjDX__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group_2__1__Impl_in_rule__DotNavigationObjDX__Group_2__111263);
            rule__DotNavigationObjDX__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjDX__Group_2__1"


    // $ANTLR start "rule__DotNavigationObjDX__Group_2__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5657:1: rule__DotNavigationObjDX__Group_2__1__Impl : ( ( rule__DotNavigationObjDX__RefAssignment_2_1 ) ) ;
    public final void rule__DotNavigationObjDX__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5661:1: ( ( ( rule__DotNavigationObjDX__RefAssignment_2_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5662:1: ( ( rule__DotNavigationObjDX__RefAssignment_2_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5662:1: ( ( rule__DotNavigationObjDX__RefAssignment_2_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5663:1: ( rule__DotNavigationObjDX__RefAssignment_2_1 )
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getRefAssignment_2_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5664:1: ( rule__DotNavigationObjDX__RefAssignment_2_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5664:2: rule__DotNavigationObjDX__RefAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__RefAssignment_2_1_in_rule__DotNavigationObjDX__Group_2__1__Impl11290);
            rule__DotNavigationObjDX__RefAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDotNavigationObjDXAccess().getRefAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjDX__Group_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5678:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5682:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5683:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__011324);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__011327);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5690:1: rule__Parameter__Group__0__Impl : ( '%' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5694:1: ( ( '%' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5695:1: ( '%' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5695:1: ( '%' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5696:1: '%'
            {
             before(grammarAccess.getParameterAccess().getPercentSignKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Parameter__Group__0__Impl11355); 
             after(grammarAccess.getParameterAccess().getPercentSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5709:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5713:1: ( rule__Parameter__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5714:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__111386);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5720:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5724:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5725:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5725:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5726:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5727:1: ( rule__Parameter__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5727:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl11413);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5741:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5745:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5746:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__011447);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__011450);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5753:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5757:1: ( ( () ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5758:1: ( () )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5758:1: ( () )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5759:1: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5760:1: ()
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5762:1: 
            {
            }

             after(grammarAccess.getPackageAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5772:1: rule__Package__Group__1 : rule__Package__Group__1__Impl ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5776:1: ( rule__Package__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5777:2: rule__Package__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__111508);
            rule__Package__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5783:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5787:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5788:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5788:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5789:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5790:1: ( rule__Package__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5790:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl11535);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5804:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5808:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5809:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__011569);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__011572);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5816:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5820:1: ( ( () ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5821:1: ( () )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5821:1: ( () )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5822:1: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5823:1: ()
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5825:1: 
            {
            }

             after(grammarAccess.getClassAccess().getClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5835:1: rule__Class__Group__1 : rule__Class__Group__1__Impl ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5839:1: ( rule__Class__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5840:2: rule__Class__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__111630);
            rule__Class__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5846:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5850:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5851:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5851:1: ( ( rule__Class__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5852:1: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5853:1: ( rule__Class__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5853:2: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl11657);
            rule__Class__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5867:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5871:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5872:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__011691);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__011694);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5879:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5883:1: ( ( () ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5884:1: ( () )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5884:1: ( () )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5885:1: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5886:1: ()
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5888:1: 
            {
            }

             after(grammarAccess.getAttributeAccess().getAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5898:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5902:1: ( rule__Attribute__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5903:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__111752);
            rule__Attribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5909:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5913:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5914:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5914:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5915:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5916:1: ( rule__Attribute__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5916:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl11779);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5930:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5934:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5935:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__011813);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__011816);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5942:1: rule__Reference__Group__0__Impl : ( () ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5946:1: ( ( () ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5947:1: ( () )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5947:1: ( () )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5948:1: ()
            {
             before(grammarAccess.getReferenceAccess().getReferenceAction_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5949:1: ()
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5951:1: 
            {
            }

             after(grammarAccess.getReferenceAccess().getReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5961:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5965:1: ( rule__Reference__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5966:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__111874);
            rule__Reference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5972:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5976:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5977:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5977:1: ( ( rule__Reference__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5978:1: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5979:1: ( rule__Reference__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5979:2: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl11901);
            rule__Reference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__MyModel__MigrationLibAssignment_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5994:1: rule__MyModel__MigrationLibAssignment_0 : ( ruleMigrationLibrary ) ;
    public final void rule__MyModel__MigrationLibAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5998:1: ( ( ruleMigrationLibrary ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5999:1: ( ruleMigrationLibrary )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5999:1: ( ruleMigrationLibrary )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6000:1: ruleMigrationLibrary
            {
             before(grammarAccess.getMyModelAccess().getMigrationLibMigrationLibraryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMigrationLibrary_in_rule__MyModel__MigrationLibAssignment_011940);
            ruleMigrationLibrary();

            state._fsp--;

             after(grammarAccess.getMyModelAccess().getMigrationLibMigrationLibraryParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__MigrationLibAssignment_0"


    // $ANTLR start "rule__MyModel__MigrationProgrAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6009:1: rule__MyModel__MigrationProgrAssignment_1 : ( ruleMigrationProgram ) ;
    public final void rule__MyModel__MigrationProgrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6013:1: ( ( ruleMigrationProgram ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6014:1: ( ruleMigrationProgram )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6014:1: ( ruleMigrationProgram )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6015:1: ruleMigrationProgram
            {
             before(grammarAccess.getMyModelAccess().getMigrationProgrMigrationProgramParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMigrationProgram_in_rule__MyModel__MigrationProgrAssignment_111971);
            ruleMigrationProgram();

            state._fsp--;

             after(grammarAccess.getMyModelAccess().getMigrationProgrMigrationProgramParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__MigrationProgrAssignment_1"


    // $ANTLR start "rule__MigrationLibrary__TitleAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6024:1: rule__MigrationLibrary__TitleAssignment_1 : ( RULE_ID ) ;
    public final void rule__MigrationLibrary__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6028:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6029:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6029:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6030:1: RULE_ID
            {
             before(grammarAccess.getMigrationLibraryAccess().getTitleIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigrationLibrary__TitleAssignment_112002); 
             after(grammarAccess.getMigrationLibraryAccess().getTitleIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationLibrary__TitleAssignment_1"


    // $ANTLR start "rule__MigrationLibrary__RulesAssignment_3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6039:1: rule__MigrationLibrary__RulesAssignment_3 : ( ruleRule ) ;
    public final void rule__MigrationLibrary__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6043:1: ( ( ruleRule ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6044:1: ( ruleRule )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6044:1: ( ruleRule )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6045:1: ruleRule
            {
             before(grammarAccess.getMigrationLibraryAccess().getRulesRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__MigrationLibrary__RulesAssignment_312033);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getMigrationLibraryAccess().getRulesRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationLibrary__RulesAssignment_3"


    // $ANTLR start "rule__MigrationProgram__LibsAssignment_0_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6054:1: rule__MigrationProgram__LibsAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__MigrationProgram__LibsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6058:1: ( ( RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6059:1: ( RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6059:1: ( RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6060:1: RULE_STRING
            {
             before(grammarAccess.getMigrationProgramAccess().getLibsSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MigrationProgram__LibsAssignment_0_112064); 
             after(grammarAccess.getMigrationProgramAccess().getLibsSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__LibsAssignment_0_1"


    // $ANTLR start "rule__MigrationProgram__MigrAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6069:1: rule__MigrationProgram__MigrAssignment_1 : ( ( 'migrate' ) ) ;
    public final void rule__MigrationProgram__MigrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6073:1: ( ( ( 'migrate' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6074:1: ( ( 'migrate' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6074:1: ( ( 'migrate' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6075:1: ( 'migrate' )
            {
             before(grammarAccess.getMigrationProgramAccess().getMigrMigrateKeyword_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6076:1: ( 'migrate' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6077:1: 'migrate'
            {
             before(grammarAccess.getMigrationProgramAccess().getMigrMigrateKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__MigrationProgram__MigrAssignment_112100); 
             after(grammarAccess.getMigrationProgramAccess().getMigrMigrateKeyword_1_0()); 

            }

             after(grammarAccess.getMigrationProgramAccess().getMigrMigrateKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__MigrAssignment_1"


    // $ANTLR start "rule__MigrationProgram__TypeArtAssignment_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6092:1: rule__MigrationProgram__TypeArtAssignment_2 : ( ruleArtifact ) ;
    public final void rule__MigrationProgram__TypeArtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6096:1: ( ( ruleArtifact ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6097:1: ( ruleArtifact )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6097:1: ( ruleArtifact )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6098:1: ruleArtifact
            {
             before(grammarAccess.getMigrationProgramAccess().getTypeArtArtifactParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArtifact_in_rule__MigrationProgram__TypeArtAssignment_212139);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getMigrationProgramAccess().getTypeArtArtifactParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__TypeArtAssignment_2"


    // $ANTLR start "rule__MigrationProgram__NameAssignment_3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6107:1: rule__MigrationProgram__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MigrationProgram__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6111:1: ( ( RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6112:1: ( RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6112:1: ( RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6113:1: RULE_STRING
            {
             before(grammarAccess.getMigrationProgramAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MigrationProgram__NameAssignment_312170); 
             after(grammarAccess.getMigrationProgramAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__NameAssignment_3"


    // $ANTLR start "rule__MigrationProgram__TransformationPackageAssignment_5_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6122:1: rule__MigrationProgram__TransformationPackageAssignment_5_0 : ( ( RULE_ID ) ) ;
    public final void rule__MigrationProgram__TransformationPackageAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6126:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6127:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6127:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6128:1: ( RULE_ID )
            {
             before(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_5_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6129:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6130:1: RULE_ID
            {
             before(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageIDTerminalRuleCall_5_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigrationProgram__TransformationPackageAssignment_5_012205); 
             after(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageIDTerminalRuleCall_5_0_0_1()); 

            }

             after(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__TransformationPackageAssignment_5_0"


    // $ANTLR start "rule__MigrationProgram__TransformationPackageAssignment_5_1_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6141:1: rule__MigrationProgram__TransformationPackageAssignment_5_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__MigrationProgram__TransformationPackageAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6145:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6146:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6146:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6147:1: ( RULE_ID )
            {
             before(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_5_1_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6148:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6149:1: RULE_ID
            {
             before(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageIDTerminalRuleCall_5_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigrationProgram__TransformationPackageAssignment_5_1_112244); 
             after(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageIDTerminalRuleCall_5_1_1_0_1()); 

            }

             after(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__TransformationPackageAssignment_5_1_1"


    // $ANTLR start "rule__MigrationProgram__DeltaAssignment_7"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6160:1: rule__MigrationProgram__DeltaAssignment_7 : ( RULE_STRING ) ;
    public final void rule__MigrationProgram__DeltaAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6164:1: ( ( RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6165:1: ( RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6165:1: ( RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6166:1: RULE_STRING
            {
             before(grammarAccess.getMigrationProgramAccess().getDeltaSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MigrationProgram__DeltaAssignment_712279); 
             after(grammarAccess.getMigrationProgramAccess().getDeltaSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__DeltaAssignment_7"


    // $ANTLR start "rule__MigrationProgram__RulesAssignment_9"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6175:1: rule__MigrationProgram__RulesAssignment_9 : ( ruleRule ) ;
    public final void rule__MigrationProgram__RulesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6179:1: ( ( ruleRule ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6180:1: ( ruleRule )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6180:1: ( ruleRule )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6181:1: ruleRule
            {
             before(grammarAccess.getMigrationProgramAccess().getRulesRuleParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__MigrationProgram__RulesAssignment_912310);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getMigrationProgramAccess().getRulesRuleParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigrationProgram__RulesAssignment_9"


    // $ANTLR start "rule__Artifact__TypeAssignment"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6190:1: rule__Artifact__TypeAssignment : ( ( rule__Artifact__TypeAlternatives_0 ) ) ;
    public final void rule__Artifact__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6194:1: ( ( ( rule__Artifact__TypeAlternatives_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6195:1: ( ( rule__Artifact__TypeAlternatives_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6195:1: ( ( rule__Artifact__TypeAlternatives_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6196:1: ( rule__Artifact__TypeAlternatives_0 )
            {
             before(grammarAccess.getArtifactAccess().getTypeAlternatives_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6197:1: ( rule__Artifact__TypeAlternatives_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6197:2: rule__Artifact__TypeAlternatives_0
            {
            pushFollow(FOLLOW_rule__Artifact__TypeAlternatives_0_in_rule__Artifact__TypeAssignment12341);
            rule__Artifact__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__TypeAssignment"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6206:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6210:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6211:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6211:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6212:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_112374); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__FilterAssignment_3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6221:1: rule__Rule__FilterAssignment_3 : ( ruleOpDef ) ;
    public final void rule__Rule__FilterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6225:1: ( ( ruleOpDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6226:1: ( ruleOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6226:1: ( ruleOpDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6227:1: ruleOpDef
            {
             before(grammarAccess.getRuleAccess().getFilterOpDefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOpDef_in_rule__Rule__FilterAssignment_312405);
            ruleOpDef();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getFilterOpDefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__FilterAssignment_3"


    // $ANTLR start "rule__Rule__RewritingRulesAssignment_6"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6236:1: rule__Rule__RewritingRulesAssignment_6 : ( ruleRewritingRule ) ;
    public final void rule__Rule__RewritingRulesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6240:1: ( ( ruleRewritingRule ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6241:1: ( ruleRewritingRule )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6241:1: ( ruleRewritingRule )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6242:1: ruleRewritingRule
            {
             before(grammarAccess.getRuleAccess().getRewritingRulesRewritingRuleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRewritingRule_in_rule__Rule__RewritingRulesAssignment_612436);
            ruleRewritingRule();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRewritingRulesRewritingRuleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__RewritingRulesAssignment_6"


    // $ANTLR start "rule__EPackageOpDef__VarAssignment_0_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6251:1: rule__EPackageOpDef__VarAssignment_0_1 : ( rulePackage ) ;
    public final void rule__EPackageOpDef__VarAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6255:1: ( ( rulePackage ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6256:1: ( rulePackage )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6256:1: ( rulePackage )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6257:1: rulePackage
            {
             before(grammarAccess.getEPackageOpDefAccess().getVarPackageParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__EPackageOpDef__VarAssignment_0_112467);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getEPackageOpDefAccess().getVarPackageParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__VarAssignment_0_1"


    // $ANTLR start "rule__EPackageOpDef__OpAssignment_1_0_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6266:1: rule__EPackageOpDef__OpAssignment_1_0_0 : ( ( 'changePackage' ) ) ;
    public final void rule__EPackageOpDef__OpAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6270:1: ( ( ( 'changePackage' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6271:1: ( ( 'changePackage' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6271:1: ( ( 'changePackage' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6272:1: ( 'changePackage' )
            {
             before(grammarAccess.getEPackageOpDefAccess().getOpChangePackageKeyword_1_0_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6273:1: ( 'changePackage' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6274:1: 'changePackage'
            {
             before(grammarAccess.getEPackageOpDefAccess().getOpChangePackageKeyword_1_0_0_0()); 
            match(input,41,FOLLOW_41_in_rule__EPackageOpDef__OpAssignment_1_0_012503); 
             after(grammarAccess.getEPackageOpDefAccess().getOpChangePackageKeyword_1_0_0_0()); 

            }

             after(grammarAccess.getEPackageOpDefAccess().getOpChangePackageKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__OpAssignment_1_0_0"


    // $ANTLR start "rule__EPackageOpDef__OpAssignment_1_0_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6289:1: rule__EPackageOpDef__OpAssignment_1_0_1 : ( ( 'addPackage' ) ) ;
    public final void rule__EPackageOpDef__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6293:1: ( ( ( 'addPackage' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6294:1: ( ( 'addPackage' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6294:1: ( ( 'addPackage' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6295:1: ( 'addPackage' )
            {
             before(grammarAccess.getEPackageOpDefAccess().getOpAddPackageKeyword_1_0_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6296:1: ( 'addPackage' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6297:1: 'addPackage'
            {
             before(grammarAccess.getEPackageOpDefAccess().getOpAddPackageKeyword_1_0_1_0()); 
            match(input,42,FOLLOW_42_in_rule__EPackageOpDef__OpAssignment_1_0_112547); 
             after(grammarAccess.getEPackageOpDefAccess().getOpAddPackageKeyword_1_0_1_0()); 

            }

             after(grammarAccess.getEPackageOpDefAccess().getOpAddPackageKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__OpAssignment_1_0_1"


    // $ANTLR start "rule__EPackageOpDef__OpAssignment_1_0_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6312:1: rule__EPackageOpDef__OpAssignment_1_0_2 : ( ( 'deletePackage' ) ) ;
    public final void rule__EPackageOpDef__OpAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6316:1: ( ( ( 'deletePackage' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6317:1: ( ( 'deletePackage' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6317:1: ( ( 'deletePackage' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6318:1: ( 'deletePackage' )
            {
             before(grammarAccess.getEPackageOpDefAccess().getOpDeletePackageKeyword_1_0_2_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6319:1: ( 'deletePackage' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6320:1: 'deletePackage'
            {
             before(grammarAccess.getEPackageOpDefAccess().getOpDeletePackageKeyword_1_0_2_0()); 
            match(input,43,FOLLOW_43_in_rule__EPackageOpDef__OpAssignment_1_0_212591); 
             after(grammarAccess.getEPackageOpDefAccess().getOpDeletePackageKeyword_1_0_2_0()); 

            }

             after(grammarAccess.getEPackageOpDefAccess().getOpDeletePackageKeyword_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__OpAssignment_1_0_2"


    // $ANTLR start "rule__EPackageOpDef__RefAssignment_1_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6335:1: rule__EPackageOpDef__RefAssignment_1_2 : ( rulePackage ) ;
    public final void rule__EPackageOpDef__RefAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6339:1: ( ( rulePackage ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6340:1: ( rulePackage )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6340:1: ( rulePackage )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6341:1: rulePackage
            {
             before(grammarAccess.getEPackageOpDefAccess().getRefPackageParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__EPackageOpDef__RefAssignment_1_212630);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getEPackageOpDefAccess().getRefPackageParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__RefAssignment_1_2"


    // $ANTLR start "rule__EPackageOpDef__SettersAssignment_1_8_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6350:1: rule__EPackageOpDef__SettersAssignment_1_8_0 : ( rulesetterDef ) ;
    public final void rule__EPackageOpDef__SettersAssignment_1_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6354:1: ( ( rulesetterDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6355:1: ( rulesetterDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6355:1: ( rulesetterDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6356:1: rulesetterDef
            {
             before(grammarAccess.getEPackageOpDefAccess().getSettersSetterDefParserRuleCall_1_8_0_0()); 
            pushFollow(FOLLOW_rulesetterDef_in_rule__EPackageOpDef__SettersAssignment_1_8_012661);
            rulesetterDef();

            state._fsp--;

             after(grammarAccess.getEPackageOpDefAccess().getSettersSetterDefParserRuleCall_1_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__SettersAssignment_1_8_0"


    // $ANTLR start "rule__EPackageOpDef__ClassesAssignment_1_8_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6365:1: rule__EPackageOpDef__ClassesAssignment_1_8_1 : ( ruleEClassOpDef ) ;
    public final void rule__EPackageOpDef__ClassesAssignment_1_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6369:1: ( ( ruleEClassOpDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6370:1: ( ruleEClassOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6370:1: ( ruleEClassOpDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6371:1: ruleEClassOpDef
            {
             before(grammarAccess.getEPackageOpDefAccess().getClassesEClassOpDefParserRuleCall_1_8_1_0()); 
            pushFollow(FOLLOW_ruleEClassOpDef_in_rule__EPackageOpDef__ClassesAssignment_1_8_112692);
            ruleEClassOpDef();

            state._fsp--;

             after(grammarAccess.getEPackageOpDefAccess().getClassesEClassOpDefParserRuleCall_1_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageOpDef__ClassesAssignment_1_8_1"


    // $ANTLR start "rule__EClassOpDef__VarAssignment_0_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6380:1: rule__EClassOpDef__VarAssignment_0_1 : ( ruleClass ) ;
    public final void rule__EClassOpDef__VarAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6384:1: ( ( ruleClass ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6385:1: ( ruleClass )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6385:1: ( ruleClass )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6386:1: ruleClass
            {
             before(grammarAccess.getEClassOpDefAccess().getVarClassParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__EClassOpDef__VarAssignment_0_112723);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getEClassOpDefAccess().getVarClassParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__VarAssignment_0_1"


    // $ANTLR start "rule__EClassOpDef__OpAssignment_1_0_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6395:1: rule__EClassOpDef__OpAssignment_1_0_0 : ( ( 'changeClass' ) ) ;
    public final void rule__EClassOpDef__OpAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6399:1: ( ( ( 'changeClass' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6400:1: ( ( 'changeClass' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6400:1: ( ( 'changeClass' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6401:1: ( 'changeClass' )
            {
             before(grammarAccess.getEClassOpDefAccess().getOpChangeClassKeyword_1_0_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6402:1: ( 'changeClass' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6403:1: 'changeClass'
            {
             before(grammarAccess.getEClassOpDefAccess().getOpChangeClassKeyword_1_0_0_0()); 
            match(input,44,FOLLOW_44_in_rule__EClassOpDef__OpAssignment_1_0_012759); 
             after(grammarAccess.getEClassOpDefAccess().getOpChangeClassKeyword_1_0_0_0()); 

            }

             after(grammarAccess.getEClassOpDefAccess().getOpChangeClassKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__OpAssignment_1_0_0"


    // $ANTLR start "rule__EClassOpDef__OpAssignment_1_0_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6418:1: rule__EClassOpDef__OpAssignment_1_0_1 : ( ( 'addClass' ) ) ;
    public final void rule__EClassOpDef__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6422:1: ( ( ( 'addClass' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6423:1: ( ( 'addClass' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6423:1: ( ( 'addClass' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6424:1: ( 'addClass' )
            {
             before(grammarAccess.getEClassOpDefAccess().getOpAddClassKeyword_1_0_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6425:1: ( 'addClass' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6426:1: 'addClass'
            {
             before(grammarAccess.getEClassOpDefAccess().getOpAddClassKeyword_1_0_1_0()); 
            match(input,45,FOLLOW_45_in_rule__EClassOpDef__OpAssignment_1_0_112803); 
             after(grammarAccess.getEClassOpDefAccess().getOpAddClassKeyword_1_0_1_0()); 

            }

             after(grammarAccess.getEClassOpDefAccess().getOpAddClassKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__OpAssignment_1_0_1"


    // $ANTLR start "rule__EClassOpDef__OpAssignment_1_0_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6441:1: rule__EClassOpDef__OpAssignment_1_0_2 : ( ( 'deleteClass' ) ) ;
    public final void rule__EClassOpDef__OpAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6445:1: ( ( ( 'deleteClass' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6446:1: ( ( 'deleteClass' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6446:1: ( ( 'deleteClass' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6447:1: ( 'deleteClass' )
            {
             before(grammarAccess.getEClassOpDefAccess().getOpDeleteClassKeyword_1_0_2_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6448:1: ( 'deleteClass' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6449:1: 'deleteClass'
            {
             before(grammarAccess.getEClassOpDefAccess().getOpDeleteClassKeyword_1_0_2_0()); 
            match(input,46,FOLLOW_46_in_rule__EClassOpDef__OpAssignment_1_0_212847); 
             after(grammarAccess.getEClassOpDefAccess().getOpDeleteClassKeyword_1_0_2_0()); 

            }

             after(grammarAccess.getEClassOpDefAccess().getOpDeleteClassKeyword_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__OpAssignment_1_0_2"


    // $ANTLR start "rule__EClassOpDef__RefAssignment_1_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6464:1: rule__EClassOpDef__RefAssignment_1_2 : ( ruleClass ) ;
    public final void rule__EClassOpDef__RefAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6468:1: ( ( ruleClass ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6469:1: ( ruleClass )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6469:1: ( ruleClass )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6470:1: ruleClass
            {
             before(grammarAccess.getEClassOpDefAccess().getRefClassParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__EClassOpDef__RefAssignment_1_212886);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getEClassOpDefAccess().getRefClassParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__RefAssignment_1_2"


    // $ANTLR start "rule__EClassOpDef__SettersAssignment_1_7_1_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6479:1: rule__EClassOpDef__SettersAssignment_1_7_1_0 : ( rulesetterDef ) ;
    public final void rule__EClassOpDef__SettersAssignment_1_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6483:1: ( ( rulesetterDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6484:1: ( rulesetterDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6484:1: ( rulesetterDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6485:1: rulesetterDef
            {
             before(grammarAccess.getEClassOpDefAccess().getSettersSetterDefParserRuleCall_1_7_1_0_0()); 
            pushFollow(FOLLOW_rulesetterDef_in_rule__EClassOpDef__SettersAssignment_1_7_1_012917);
            rulesetterDef();

            state._fsp--;

             after(grammarAccess.getEClassOpDefAccess().getSettersSetterDefParserRuleCall_1_7_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__SettersAssignment_1_7_1_0"


    // $ANTLR start "rule__EClassOpDef__AttributesAssignment_1_7_1_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6494:1: rule__EClassOpDef__AttributesAssignment_1_7_1_1 : ( ruleEAttributeOpDef ) ;
    public final void rule__EClassOpDef__AttributesAssignment_1_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6498:1: ( ( ruleEAttributeOpDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6499:1: ( ruleEAttributeOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6499:1: ( ruleEAttributeOpDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6500:1: ruleEAttributeOpDef
            {
             before(grammarAccess.getEClassOpDefAccess().getAttributesEAttributeOpDefParserRuleCall_1_7_1_1_0()); 
            pushFollow(FOLLOW_ruleEAttributeOpDef_in_rule__EClassOpDef__AttributesAssignment_1_7_1_112948);
            ruleEAttributeOpDef();

            state._fsp--;

             after(grammarAccess.getEClassOpDefAccess().getAttributesEAttributeOpDefParserRuleCall_1_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__AttributesAssignment_1_7_1_1"


    // $ANTLR start "rule__EClassOpDef__ReferencesAssignment_1_7_1_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6509:1: rule__EClassOpDef__ReferencesAssignment_1_7_1_2 : ( ruleEReferenceOpDef ) ;
    public final void rule__EClassOpDef__ReferencesAssignment_1_7_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6513:1: ( ( ruleEReferenceOpDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6514:1: ( ruleEReferenceOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6514:1: ( ruleEReferenceOpDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6515:1: ruleEReferenceOpDef
            {
             before(grammarAccess.getEClassOpDefAccess().getReferencesEReferenceOpDefParserRuleCall_1_7_1_2_0()); 
            pushFollow(FOLLOW_ruleEReferenceOpDef_in_rule__EClassOpDef__ReferencesAssignment_1_7_1_212979);
            ruleEReferenceOpDef();

            state._fsp--;

             after(grammarAccess.getEClassOpDefAccess().getReferencesEReferenceOpDefParserRuleCall_1_7_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EClassOpDef__ReferencesAssignment_1_7_1_2"


    // $ANTLR start "rule__EAttributeOpDef__VarAssignment_0_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6524:1: rule__EAttributeOpDef__VarAssignment_0_1 : ( ruleAttribute ) ;
    public final void rule__EAttributeOpDef__VarAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6528:1: ( ( ruleAttribute ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6529:1: ( ruleAttribute )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6529:1: ( ruleAttribute )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6530:1: ruleAttribute
            {
             before(grammarAccess.getEAttributeOpDefAccess().getVarAttributeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__EAttributeOpDef__VarAssignment_0_113010);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEAttributeOpDefAccess().getVarAttributeParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__VarAssignment_0_1"


    // $ANTLR start "rule__EAttributeOpDef__OpAssignment_1_0_0_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6539:1: rule__EAttributeOpDef__OpAssignment_1_0_0_0 : ( ( 'changeEAttribute' ) ) ;
    public final void rule__EAttributeOpDef__OpAssignment_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6543:1: ( ( ( 'changeEAttribute' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6544:1: ( ( 'changeEAttribute' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6544:1: ( ( 'changeEAttribute' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6545:1: ( 'changeEAttribute' )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getOpChangeEAttributeKeyword_1_0_0_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6546:1: ( 'changeEAttribute' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6547:1: 'changeEAttribute'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getOpChangeEAttributeKeyword_1_0_0_0_0()); 
            match(input,47,FOLLOW_47_in_rule__EAttributeOpDef__OpAssignment_1_0_0_013046); 
             after(grammarAccess.getEAttributeOpDefAccess().getOpChangeEAttributeKeyword_1_0_0_0_0()); 

            }

             after(grammarAccess.getEAttributeOpDefAccess().getOpChangeEAttributeKeyword_1_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__OpAssignment_1_0_0_0"


    // $ANTLR start "rule__EAttributeOpDef__OpAssignment_1_0_0_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6562:1: rule__EAttributeOpDef__OpAssignment_1_0_0_1 : ( ( 'addEAttribute' ) ) ;
    public final void rule__EAttributeOpDef__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6566:1: ( ( ( 'addEAttribute' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6567:1: ( ( 'addEAttribute' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6567:1: ( ( 'addEAttribute' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6568:1: ( 'addEAttribute' )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getOpAddEAttributeKeyword_1_0_0_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6569:1: ( 'addEAttribute' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6570:1: 'addEAttribute'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getOpAddEAttributeKeyword_1_0_0_1_0()); 
            match(input,48,FOLLOW_48_in_rule__EAttributeOpDef__OpAssignment_1_0_0_113090); 
             after(grammarAccess.getEAttributeOpDefAccess().getOpAddEAttributeKeyword_1_0_0_1_0()); 

            }

             after(grammarAccess.getEAttributeOpDefAccess().getOpAddEAttributeKeyword_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__EAttributeOpDef__OpAssignment_1_0_0_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6585:1: rule__EAttributeOpDef__OpAssignment_1_0_0_2 : ( ( 'deleteEAttribute' ) ) ;
    public final void rule__EAttributeOpDef__OpAssignment_1_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6589:1: ( ( ( 'deleteEAttribute' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6590:1: ( ( 'deleteEAttribute' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6590:1: ( ( 'deleteEAttribute' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6591:1: ( 'deleteEAttribute' )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getOpDeleteEAttributeKeyword_1_0_0_2_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6592:1: ( 'deleteEAttribute' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6593:1: 'deleteEAttribute'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getOpDeleteEAttributeKeyword_1_0_0_2_0()); 
            match(input,49,FOLLOW_49_in_rule__EAttributeOpDef__OpAssignment_1_0_0_213134); 
             after(grammarAccess.getEAttributeOpDefAccess().getOpDeleteEAttributeKeyword_1_0_0_2_0()); 

            }

             after(grammarAccess.getEAttributeOpDefAccess().getOpDeleteEAttributeKeyword_1_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__OpAssignment_1_0_0_2"


    // $ANTLR start "rule__EAttributeOpDef__RefAssignment_1_0_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6608:1: rule__EAttributeOpDef__RefAssignment_1_0_2 : ( ruleAttribute ) ;
    public final void rule__EAttributeOpDef__RefAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6612:1: ( ( ruleAttribute ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6613:1: ( ruleAttribute )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6613:1: ( ruleAttribute )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6614:1: ruleAttribute
            {
             before(grammarAccess.getEAttributeOpDefAccess().getRefAttributeParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__EAttributeOpDef__RefAssignment_1_0_213173);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEAttributeOpDefAccess().getRefAttributeParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__RefAssignment_1_0_2"


    // $ANTLR start "rule__EAttributeOpDef__SettersAssignment_1_3_0_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6623:1: rule__EAttributeOpDef__SettersAssignment_1_3_0_1 : ( rulesetterDef ) ;
    public final void rule__EAttributeOpDef__SettersAssignment_1_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6627:1: ( ( rulesetterDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6628:1: ( rulesetterDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6628:1: ( rulesetterDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6629:1: rulesetterDef
            {
             before(grammarAccess.getEAttributeOpDefAccess().getSettersSetterDefParserRuleCall_1_3_0_1_0()); 
            pushFollow(FOLLOW_rulesetterDef_in_rule__EAttributeOpDef__SettersAssignment_1_3_0_113204);
            rulesetterDef();

            state._fsp--;

             after(grammarAccess.getEAttributeOpDefAccess().getSettersSetterDefParserRuleCall_1_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttributeOpDef__SettersAssignment_1_3_0_1"


    // $ANTLR start "rule__EReferenceOpDef__VarAssignment_0_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6638:1: rule__EReferenceOpDef__VarAssignment_0_1 : ( ruleReference ) ;
    public final void rule__EReferenceOpDef__VarAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6642:1: ( ( ruleReference ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6643:1: ( ruleReference )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6643:1: ( ruleReference )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6644:1: ruleReference
            {
             before(grammarAccess.getEReferenceOpDefAccess().getVarReferenceParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__EReferenceOpDef__VarAssignment_0_113235);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getEReferenceOpDefAccess().getVarReferenceParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__VarAssignment_0_1"


    // $ANTLR start "rule__EReferenceOpDef__OpAssignment_1_0_0_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6653:1: rule__EReferenceOpDef__OpAssignment_1_0_0_0 : ( ( 'changeEReference' ) ) ;
    public final void rule__EReferenceOpDef__OpAssignment_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6657:1: ( ( ( 'changeEReference' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6658:1: ( ( 'changeEReference' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6658:1: ( ( 'changeEReference' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6659:1: ( 'changeEReference' )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getOpChangeEReferenceKeyword_1_0_0_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6660:1: ( 'changeEReference' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6661:1: 'changeEReference'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getOpChangeEReferenceKeyword_1_0_0_0_0()); 
            match(input,50,FOLLOW_50_in_rule__EReferenceOpDef__OpAssignment_1_0_0_013271); 
             after(grammarAccess.getEReferenceOpDefAccess().getOpChangeEReferenceKeyword_1_0_0_0_0()); 

            }

             after(grammarAccess.getEReferenceOpDefAccess().getOpChangeEReferenceKeyword_1_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__OpAssignment_1_0_0_0"


    // $ANTLR start "rule__EReferenceOpDef__OpAssignment_1_0_0_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6676:1: rule__EReferenceOpDef__OpAssignment_1_0_0_1 : ( ( 'addEReference' ) ) ;
    public final void rule__EReferenceOpDef__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6680:1: ( ( ( 'addEReference' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6681:1: ( ( 'addEReference' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6681:1: ( ( 'addEReference' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6682:1: ( 'addEReference' )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getOpAddEReferenceKeyword_1_0_0_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6683:1: ( 'addEReference' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6684:1: 'addEReference'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getOpAddEReferenceKeyword_1_0_0_1_0()); 
            match(input,51,FOLLOW_51_in_rule__EReferenceOpDef__OpAssignment_1_0_0_113315); 
             after(grammarAccess.getEReferenceOpDefAccess().getOpAddEReferenceKeyword_1_0_0_1_0()); 

            }

             after(grammarAccess.getEReferenceOpDefAccess().getOpAddEReferenceKeyword_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__EReferenceOpDef__OpAssignment_1_0_0_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6699:1: rule__EReferenceOpDef__OpAssignment_1_0_0_2 : ( ( 'deleteEReference' ) ) ;
    public final void rule__EReferenceOpDef__OpAssignment_1_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6703:1: ( ( ( 'deleteEReference' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6704:1: ( ( 'deleteEReference' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6704:1: ( ( 'deleteEReference' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6705:1: ( 'deleteEReference' )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getOpDeleteEReferenceKeyword_1_0_0_2_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6706:1: ( 'deleteEReference' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6707:1: 'deleteEReference'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getOpDeleteEReferenceKeyword_1_0_0_2_0()); 
            match(input,52,FOLLOW_52_in_rule__EReferenceOpDef__OpAssignment_1_0_0_213359); 
             after(grammarAccess.getEReferenceOpDefAccess().getOpDeleteEReferenceKeyword_1_0_0_2_0()); 

            }

             after(grammarAccess.getEReferenceOpDefAccess().getOpDeleteEReferenceKeyword_1_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__OpAssignment_1_0_0_2"


    // $ANTLR start "rule__EReferenceOpDef__RefAssignment_1_0_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6722:1: rule__EReferenceOpDef__RefAssignment_1_0_2 : ( ruleReference ) ;
    public final void rule__EReferenceOpDef__RefAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6726:1: ( ( ruleReference ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6727:1: ( ruleReference )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6727:1: ( ruleReference )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6728:1: ruleReference
            {
             before(grammarAccess.getEReferenceOpDefAccess().getRefReferenceParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__EReferenceOpDef__RefAssignment_1_0_213398);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getEReferenceOpDefAccess().getRefReferenceParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__RefAssignment_1_0_2"


    // $ANTLR start "rule__EReferenceOpDef__SettersAssignment_1_3_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6737:1: rule__EReferenceOpDef__SettersAssignment_1_3_1 : ( rulesetterDef ) ;
    public final void rule__EReferenceOpDef__SettersAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6741:1: ( ( rulesetterDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6742:1: ( rulesetterDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6742:1: ( rulesetterDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6743:1: rulesetterDef
            {
             before(grammarAccess.getEReferenceOpDefAccess().getSettersSetterDefParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_rulesetterDef_in_rule__EReferenceOpDef__SettersAssignment_1_3_113429);
            rulesetterDef();

            state._fsp--;

             after(grammarAccess.getEReferenceOpDefAccess().getSettersSetterDefParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EReferenceOpDef__SettersAssignment_1_3_1"


    // $ANTLR start "rule__SetterDef__MetafeatureAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6752:1: rule__SetterDef__MetafeatureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SetterDef__MetafeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6756:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6757:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6757:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6758:1: ( RULE_ID )
            {
             before(grammarAccess.getSetterDefAccess().getMetafeatureEStructuralFeatureCrossReference_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6759:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6760:1: RULE_ID
            {
             before(grammarAccess.getSetterDefAccess().getMetafeatureEStructuralFeatureIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SetterDef__MetafeatureAssignment_113464); 
             after(grammarAccess.getSetterDefAccess().getMetafeatureEStructuralFeatureIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSetterDefAccess().getMetafeatureEStructuralFeatureCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__MetafeatureAssignment_1"


    // $ANTLR start "rule__SetterDef__OperatorAssignment_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6771:1: rule__SetterDef__OperatorAssignment_2 : ( ( '=' ) ) ;
    public final void rule__SetterDef__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6775:1: ( ( ( '=' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6776:1: ( ( '=' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6776:1: ( ( '=' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6777:1: ( '=' )
            {
             before(grammarAccess.getSetterDefAccess().getOperatorEqualsSignKeyword_2_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6778:1: ( '=' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6779:1: '='
            {
             before(grammarAccess.getSetterDefAccess().getOperatorEqualsSignKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__SetterDef__OperatorAssignment_213504); 
             after(grammarAccess.getSetterDefAccess().getOperatorEqualsSignKeyword_2_0()); 

            }

             after(grammarAccess.getSetterDefAccess().getOperatorEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__OperatorAssignment_2"


    // $ANTLR start "rule__SetterDef__ParAssignment_3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6794:1: rule__SetterDef__ParAssignment_3 : ( ruleParameter ) ;
    public final void rule__SetterDef__ParAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6798:1: ( ( ruleParameter ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6799:1: ( ruleParameter )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6799:1: ( ruleParameter )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6800:1: ruleParameter
            {
             before(grammarAccess.getSetterDefAccess().getParParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__SetterDef__ParAssignment_313543);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSetterDefAccess().getParParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__ParAssignment_3"


    // $ANTLR start "rule__SetterDef__ParAssignment_4_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6809:1: rule__SetterDef__ParAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__SetterDef__ParAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6813:1: ( ( ruleParameter ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6814:1: ( ruleParameter )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6814:1: ( ruleParameter )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6815:1: ruleParameter
            {
             before(grammarAccess.getSetterDefAccess().getParParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__SetterDef__ParAssignment_4_113574);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSetterDefAccess().getParParameterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetterDef__ParAssignment_4_1"


    // $ANTLR start "rule__RewritingRule__MigratorsSXAssignment_0_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6824:1: rule__RewritingRule__MigratorsSXAssignment_0_0 : ( ruleMigratorSX ) ;
    public final void rule__RewritingRule__MigratorsSXAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6828:1: ( ( ruleMigratorSX ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6829:1: ( ruleMigratorSX )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6829:1: ( ruleMigratorSX )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6830:1: ruleMigratorSX
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorsSXMigratorSXParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleMigratorSX_in_rule__RewritingRule__MigratorsSXAssignment_0_013605);
            ruleMigratorSX();

            state._fsp--;

             after(grammarAccess.getRewritingRuleAccess().getMigratorsSXMigratorSXParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__MigratorsSXAssignment_0_0"


    // $ANTLR start "rule__RewritingRule__MigratorDXAssignment_0_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6839:1: rule__RewritingRule__MigratorDXAssignment_0_2 : ( ruleMigratorDX ) ;
    public final void rule__RewritingRule__MigratorDXAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6843:1: ( ( ruleMigratorDX ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6844:1: ( ruleMigratorDX )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6844:1: ( ruleMigratorDX )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6845:1: ruleMigratorDX
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleMigratorDX_in_rule__RewritingRule__MigratorDXAssignment_0_213636);
            ruleMigratorDX();

            state._fsp--;

             after(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__MigratorDXAssignment_0_2"


    // $ANTLR start "rule__RewritingRule__MigratorSXAssignment_1_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6854:1: rule__RewritingRule__MigratorSXAssignment_1_1 : ( ruleMigratorSX ) ;
    public final void rule__RewritingRule__MigratorSXAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6858:1: ( ( ruleMigratorSX ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6859:1: ( ruleMigratorSX )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6859:1: ( ruleMigratorSX )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6860:1: ruleMigratorSX
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorSXMigratorSXParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMigratorSX_in_rule__RewritingRule__MigratorSXAssignment_1_113667);
            ruleMigratorSX();

            state._fsp--;

             after(grammarAccess.getRewritingRuleAccess().getMigratorSXMigratorSXParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__MigratorSXAssignment_1_1"


    // $ANTLR start "rule__RewritingRule__MigratorDXAssignment_1_3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6869:1: rule__RewritingRule__MigratorDXAssignment_1_3 : ( ruleMigratorDX ) ;
    public final void rule__RewritingRule__MigratorDXAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6873:1: ( ( ruleMigratorDX ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6874:1: ( ruleMigratorDX )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6874:1: ( ruleMigratorDX )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6875:1: ruleMigratorDX
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleMigratorDX_in_rule__RewritingRule__MigratorDXAssignment_1_313698);
            ruleMigratorDX();

            state._fsp--;

             after(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewritingRule__MigratorDXAssignment_1_3"


    // $ANTLR start "rule__MigratorSX__NameAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6884:1: rule__MigratorSX__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MigratorSX__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6888:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6889:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6889:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6890:1: RULE_ID
            {
             before(grammarAccess.getMigratorSXAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigratorSX__NameAssignment_113729); 
             after(grammarAccess.getMigratorSXAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__NameAssignment_1"


    // $ANTLR start "rule__MigratorSX__ElementSXAssignment_3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6899:1: rule__MigratorSX__ElementSXAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MigratorSX__ElementSXAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6903:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6904:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6904:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6905:1: ( RULE_ID )
            {
             before(grammarAccess.getMigratorSXAccess().getElementSXEClassCrossReference_3_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6906:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6907:1: RULE_ID
            {
             before(grammarAccess.getMigratorSXAccess().getElementSXEClassIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigratorSX__ElementSXAssignment_313764); 
             after(grammarAccess.getMigratorSXAccess().getElementSXEClassIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMigratorSXAccess().getElementSXEClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__ElementSXAssignment_3"


    // $ANTLR start "rule__MigratorSX__FilterSXAssignment_6"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6918:1: rule__MigratorSX__FilterSXAssignment_6 : ( ruleFilterMigrator ) ;
    public final void rule__MigratorSX__FilterSXAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6922:1: ( ( ruleFilterMigrator ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6923:1: ( ruleFilterMigrator )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6923:1: ( ruleFilterMigrator )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6924:1: ruleFilterMigrator
            {
             before(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleFilterMigrator_in_rule__MigratorSX__FilterSXAssignment_613799);
            ruleFilterMigrator();

            state._fsp--;

             after(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__FilterSXAssignment_6"


    // $ANTLR start "rule__MigratorSX__FilterSXAssignment_7_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6933:1: rule__MigratorSX__FilterSXAssignment_7_1 : ( ruleFilterMigrator ) ;
    public final void rule__MigratorSX__FilterSXAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6937:1: ( ( ruleFilterMigrator ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6938:1: ( ruleFilterMigrator )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6938:1: ( ruleFilterMigrator )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6939:1: ruleFilterMigrator
            {
             before(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleFilterMigrator_in_rule__MigratorSX__FilterSXAssignment_7_113830);
            ruleFilterMigrator();

            state._fsp--;

             after(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorSX__FilterSXAssignment_7_1"


    // $ANTLR start "rule__MigratorDX__NameAssignment_0_1_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6948:1: rule__MigratorDX__NameAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__MigratorDX__NameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6952:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6953:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6953:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6954:1: RULE_ID
            {
             before(grammarAccess.getMigratorDXAccess().getNameIDTerminalRuleCall_0_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigratorDX__NameAssignment_0_1_013861); 
             after(grammarAccess.getMigratorDXAccess().getNameIDTerminalRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__NameAssignment_0_1_0"


    // $ANTLR start "rule__MigratorDX__ElementDXAssignment_0_1_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6963:1: rule__MigratorDX__ElementDXAssignment_0_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__MigratorDX__ElementDXAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6967:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6968:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6968:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6969:1: ( RULE_ID )
            {
             before(grammarAccess.getMigratorDXAccess().getElementDXEClassCrossReference_0_1_2_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6970:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6971:1: RULE_ID
            {
             before(grammarAccess.getMigratorDXAccess().getElementDXEClassIDTerminalRuleCall_0_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigratorDX__ElementDXAssignment_0_1_213896); 
             after(grammarAccess.getMigratorDXAccess().getElementDXEClassIDTerminalRuleCall_0_1_2_0_1()); 

            }

             after(grammarAccess.getMigratorDXAccess().getElementDXEClassCrossReference_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__ElementDXAssignment_0_1_2"


    // $ANTLR start "rule__MigratorDX__FilterDXAssignment_0_1_4"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6982:1: rule__MigratorDX__FilterDXAssignment_0_1_4 : ( ruleFilterMigrator ) ;
    public final void rule__MigratorDX__FilterDXAssignment_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6986:1: ( ( ruleFilterMigrator ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6987:1: ( ruleFilterMigrator )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6987:1: ( ruleFilterMigrator )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6988:1: ruleFilterMigrator
            {
             before(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_1_4_0()); 
            pushFollow(FOLLOW_ruleFilterMigrator_in_rule__MigratorDX__FilterDXAssignment_0_1_413931);
            ruleFilterMigrator();

            state._fsp--;

             after(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__FilterDXAssignment_0_1_4"


    // $ANTLR start "rule__MigratorDX__FilterDXAssignment_0_1_5_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6997:1: rule__MigratorDX__FilterDXAssignment_0_1_5_1 : ( ruleFilterMigrator ) ;
    public final void rule__MigratorDX__FilterDXAssignment_0_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7001:1: ( ( ruleFilterMigrator ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7002:1: ( ruleFilterMigrator )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7002:1: ( ruleFilterMigrator )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7003:1: ruleFilterMigrator
            {
             before(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_1_5_1_0()); 
            pushFollow(FOLLOW_ruleFilterMigrator_in_rule__MigratorDX__FilterDXAssignment_0_1_5_113962);
            ruleFilterMigrator();

            state._fsp--;

             after(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_1_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MigratorDX__FilterDXAssignment_0_1_5_1"


    // $ANTLR start "rule__FilterMigrator__FeatureSXAssignment_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7012:1: rule__FilterMigrator__FeatureSXAssignment_0 : ( ruleDotNavigationObjSX ) ;
    public final void rule__FilterMigrator__FeatureSXAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7016:1: ( ( ruleDotNavigationObjSX ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7017:1: ( ruleDotNavigationObjSX )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7017:1: ( ruleDotNavigationObjSX )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7018:1: ruleDotNavigationObjSX
            {
             before(grammarAccess.getFilterMigratorAccess().getFeatureSXDotNavigationObjSXParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDotNavigationObjSX_in_rule__FilterMigrator__FeatureSXAssignment_013993);
            ruleDotNavigationObjSX();

            state._fsp--;

             after(grammarAccess.getFilterMigratorAccess().getFeatureSXDotNavigationObjSXParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterMigrator__FeatureSXAssignment_0"


    // $ANTLR start "rule__FilterMigrator__OpAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7027:1: rule__FilterMigrator__OpAssignment_1 : ( ( '=' ) ) ;
    public final void rule__FilterMigrator__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7031:1: ( ( ( '=' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7032:1: ( ( '=' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7032:1: ( ( '=' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7033:1: ( '=' )
            {
             before(grammarAccess.getFilterMigratorAccess().getOpEqualsSignKeyword_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7034:1: ( '=' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7035:1: '='
            {
             before(grammarAccess.getFilterMigratorAccess().getOpEqualsSignKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__FilterMigrator__OpAssignment_114029); 
             after(grammarAccess.getFilterMigratorAccess().getOpEqualsSignKeyword_1_0()); 

            }

             after(grammarAccess.getFilterMigratorAccess().getOpEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterMigrator__OpAssignment_1"


    // $ANTLR start "rule__FilterMigrator__ValueAssignment_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7050:1: rule__FilterMigrator__ValueAssignment_2 : ( ruleDotNavigationObjDX ) ;
    public final void rule__FilterMigrator__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7054:1: ( ( ruleDotNavigationObjDX ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7055:1: ( ruleDotNavigationObjDX )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7055:1: ( ruleDotNavigationObjDX )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7056:1: ruleDotNavigationObjDX
            {
             before(grammarAccess.getFilterMigratorAccess().getValueDotNavigationObjDXParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDotNavigationObjDX_in_rule__FilterMigrator__ValueAssignment_214068);
            ruleDotNavigationObjDX();

            state._fsp--;

             after(grammarAccess.getFilterMigratorAccess().getValueDotNavigationObjDXParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterMigrator__ValueAssignment_2"


    // $ANTLR start "rule__DotNavigationObjSX__ObjAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7065:1: rule__DotNavigationObjSX__ObjAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DotNavigationObjSX__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7069:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7070:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7070:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7071:1: ( RULE_ID )
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getObjEObjectCrossReference_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7072:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7073:1: RULE_ID
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getObjEObjectIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DotNavigationObjSX__ObjAssignment_114103); 
             after(grammarAccess.getDotNavigationObjSXAccess().getObjEObjectIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDotNavigationObjSXAccess().getObjEObjectCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjSX__ObjAssignment_1"


    // $ANTLR start "rule__DotNavigationObjSX__RefAssignment_2_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7084:1: rule__DotNavigationObjSX__RefAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DotNavigationObjSX__RefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7088:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7089:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7089:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7090:1: ( RULE_ID )
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getRefEStructuralFeatureCrossReference_2_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7091:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7092:1: RULE_ID
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getRefEStructuralFeatureIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DotNavigationObjSX__RefAssignment_2_114142); 
             after(grammarAccess.getDotNavigationObjSXAccess().getRefEStructuralFeatureIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDotNavigationObjSXAccess().getRefEStructuralFeatureCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjSX__RefAssignment_2_1"


    // $ANTLR start "rule__DotNavigationObjDX__ObjAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7103:1: rule__DotNavigationObjDX__ObjAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DotNavigationObjDX__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7107:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7108:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7108:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7109:1: ( RULE_ID )
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getObjEObjectCrossReference_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7110:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7111:1: RULE_ID
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getObjEObjectIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DotNavigationObjDX__ObjAssignment_114181); 
             after(grammarAccess.getDotNavigationObjDXAccess().getObjEObjectIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDotNavigationObjDXAccess().getObjEObjectCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjDX__ObjAssignment_1"


    // $ANTLR start "rule__DotNavigationObjDX__RefAssignment_2_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7122:1: rule__DotNavigationObjDX__RefAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DotNavigationObjDX__RefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7126:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7127:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7127:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7128:1: ( RULE_ID )
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getRefEStructuralFeatureCrossReference_2_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7129:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7130:1: RULE_ID
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getRefEStructuralFeatureIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DotNavigationObjDX__RefAssignment_2_114220); 
             after(grammarAccess.getDotNavigationObjDXAccess().getRefEStructuralFeatureIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDotNavigationObjDXAccess().getRefEStructuralFeatureCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNavigationObjDX__RefAssignment_2_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7141:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7145:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7146:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7146:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7147:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_114255); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7156:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7160:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7161:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7161:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7162:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_114286); 
             after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7171:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7175:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7176:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7176:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7177:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_114317); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7186:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7190:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7191:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7191:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7192:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_114348); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7201:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7205:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7206:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7206:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7207:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_114379); 
             after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMyModel_in_entryRuleMyModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyModel__Alternatives_in_ruleMyModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationLibrary_in_entryRuleMigrationLibrary121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationLibrary128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__0_in_ruleMigrationLibrary154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationProgram_in_entryRuleMigrationProgram181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationProgram188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__0_in_ruleMigrationProgram214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifact248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artifact__TypeAssignment_in_ruleArtifact274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpDef_in_entryRuleOpDef361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpDef368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpDef__Alternatives_in_ruleOpDef394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageOpDef_in_entryRuleEPackageOpDef421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPackageOpDef428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group__0_in_ruleEPackageOpDef454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_entryRuleEClassOpDef481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEClassOpDef488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group__0_in_ruleEClassOpDef514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_entryRuleEAttributeOpDef541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEAttributeOpDef548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group__0_in_ruleEAttributeOpDef574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_entryRuleEReferenceOpDef601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEReferenceOpDef608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group__0_in_ruleEReferenceOpDef634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetterDef_in_entryRulesetterDef661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesetterDef668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__0_in_rulesetterDef694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewritingRule_in_entryRuleRewritingRule721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRewritingRule728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group__0_in_ruleRewritingRule754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_entryRuleMigratorSX783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigratorSX790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__0_in_ruleMigratorSX816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_entryRuleMigratorDX843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigratorDX850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Alternatives_in_ruleMigratorDX876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_entryRuleFilterMigrator903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterMigrator910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__Group__0_in_ruleFilterMigrator936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjSX_in_entryRuleDotNavigationObjSX963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDotNavigationObjSX970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group__0_in_ruleDotNavigationObjSX996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjDX_in_entryRuleDotNavigationObjDX1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDotNavigationObjDX1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group__0_in_ruleDotNavigationObjDX1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyModel__MigrationLibAssignment_0_in_rule__MyModel__Alternatives1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyModel__MigrationProgrAssignment_1_in_rule__MyModel__Alternatives1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Artifact__TypeAlternatives_01446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Artifact__TypeAlternatives_01466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Artifact__TypeAlternatives_01486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageOpDef_in_rule__OpDef__Alternatives1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_rule__OpDef__Alternatives1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_rule__OpDef__Alternatives1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_rule__OpDef__Alternatives1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__OpAssignment_1_0_0_in_rule__EPackageOpDef__Alternatives_1_01603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__OpAssignment_1_0_1_in_rule__EPackageOpDef__Alternatives_1_01621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__OpAssignment_1_0_2_in_rule__EPackageOpDef__Alternatives_1_01639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__SettersAssignment_1_8_0_in_rule__EPackageOpDef__Alternatives_1_81672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__ClassesAssignment_1_8_1_in_rule__EPackageOpDef__Alternatives_1_81690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__OpAssignment_1_0_0_in_rule__EClassOpDef__Alternatives_1_01723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__OpAssignment_1_0_1_in_rule__EClassOpDef__Alternatives_1_01741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__OpAssignment_1_0_2_in_rule__EClassOpDef__Alternatives_1_01759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__SettersAssignment_1_7_1_0_in_rule__EClassOpDef__Alternatives_1_7_11792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__AttributesAssignment_1_7_1_1_in_rule__EClassOpDef__Alternatives_1_7_11810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__ReferencesAssignment_1_7_1_2_in_rule__EClassOpDef__Alternatives_1_7_11828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__OpAssignment_1_0_0_0_in_rule__EAttributeOpDef__Alternatives_1_0_01861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__OpAssignment_1_0_0_1_in_rule__EAttributeOpDef__Alternatives_1_0_01879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__OpAssignment_1_0_0_2_in_rule__EAttributeOpDef__Alternatives_1_0_01897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_3_0__0_in_rule__EAttributeOpDef__Alternatives_1_31930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EAttributeOpDef__Alternatives_1_31949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__OpAssignment_1_0_0_0_in_rule__EReferenceOpDef__Alternatives_1_0_01983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__OpAssignment_1_0_0_1_in_rule__EReferenceOpDef__Alternatives_1_0_02001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__OpAssignment_1_0_0_2_in_rule__EReferenceOpDef__Alternatives_1_0_02019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0__0_in_rule__MigratorDX__Alternatives2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MigratorDX__Alternatives2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__0__Impl_in_rule__MigrationLibrary__Group__02105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__1_in_rule__MigrationLibrary__Group__02108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MigrationLibrary__Group__0__Impl2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__1__Impl_in_rule__MigrationLibrary__Group__12167 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__2_in_rule__MigrationLibrary__Group__12170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__TitleAssignment_1_in_rule__MigrationLibrary__Group__1__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__2__Impl_in_rule__MigrationLibrary__Group__22227 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__3_in_rule__MigrationLibrary__Group__22230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MigrationLibrary__Group__2__Impl2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__3__Impl_in_rule__MigrationLibrary__Group__32289 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__4_in_rule__MigrationLibrary__Group__32292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__RulesAssignment_3_in_rule__MigrationLibrary__Group__3__Impl2319 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__4__Impl_in_rule__MigrationLibrary__Group__42350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MigrationLibrary__Group__4__Impl2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__0__Impl_in_rule__MigrationProgram__Group__02419 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__1_in_rule__MigrationProgram__Group__02422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_0__0_in_rule__MigrationProgram__Group__0__Impl2449 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__1__Impl_in_rule__MigrationProgram__Group__12480 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__2_in_rule__MigrationProgram__Group__12483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__MigrAssignment_1_in_rule__MigrationProgram__Group__1__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__2__Impl_in_rule__MigrationProgram__Group__22540 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__3_in_rule__MigrationProgram__Group__22543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__TypeArtAssignment_2_in_rule__MigrationProgram__Group__2__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__3__Impl_in_rule__MigrationProgram__Group__32600 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__4_in_rule__MigrationProgram__Group__32603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__NameAssignment_3_in_rule__MigrationProgram__Group__3__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__4__Impl_in_rule__MigrationProgram__Group__42660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__5_in_rule__MigrationProgram__Group__42663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MigrationProgram__Group__4__Impl2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__5__Impl_in_rule__MigrationProgram__Group__52722 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__6_in_rule__MigrationProgram__Group__52725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_5__0_in_rule__MigrationProgram__Group__5__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__6__Impl_in_rule__MigrationProgram__Group__62782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__7_in_rule__MigrationProgram__Group__62785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MigrationProgram__Group__6__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__7__Impl_in_rule__MigrationProgram__Group__72844 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__8_in_rule__MigrationProgram__Group__72847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__DeltaAssignment_7_in_rule__MigrationProgram__Group__7__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__8__Impl_in_rule__MigrationProgram__Group__82904 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__9_in_rule__MigrationProgram__Group__82907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MigrationProgram__Group__8__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__9__Impl_in_rule__MigrationProgram__Group__92966 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__10_in_rule__MigrationProgram__Group__92969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__RulesAssignment_9_in_rule__MigrationProgram__Group__9__Impl2996 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__10__Impl_in_rule__MigrationProgram__Group__103027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MigrationProgram__Group__10__Impl3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_0__0__Impl_in_rule__MigrationProgram__Group_0__03108 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_0__1_in_rule__MigrationProgram__Group_0__03111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MigrationProgram__Group_0__0__Impl3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_0__1__Impl_in_rule__MigrationProgram__Group_0__13170 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_0__2_in_rule__MigrationProgram__Group_0__13173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__LibsAssignment_0_1_in_rule__MigrationProgram__Group_0__1__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_0__2__Impl_in_rule__MigrationProgram__Group_0__23230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MigrationProgram__Group_0__2__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_5__0__Impl_in_rule__MigrationProgram__Group_5__03295 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_5__1_in_rule__MigrationProgram__Group_5__03298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__TransformationPackageAssignment_5_0_in_rule__MigrationProgram__Group_5__0__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_5__1__Impl_in_rule__MigrationProgram__Group_5__13355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_5_1__0_in_rule__MigrationProgram__Group_5__1__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_5_1__0__Impl_in_rule__MigrationProgram__Group_5_1__03416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_5_1__1_in_rule__MigrationProgram__Group_5_1__03419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MigrationProgram__Group_5_1__0__Impl3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_5_1__1__Impl_in_rule__MigrationProgram__Group_5_1__13478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__TransformationPackageAssignment_5_1_1_in_rule__MigrationProgram__Group_5_1__1__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Rule__Group__0__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13601 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__13604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__23661 = new BitSet(new long[]{0x0000000384000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__23664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Rule__Group__2__Impl3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__33723 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__33726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__FilterAssignment_3_in_rule__Rule__Group__3__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__43783 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__43786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Rule__Group__4__Impl3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__53845 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__53848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Rule__Group__5__Impl3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__63907 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__63910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__RewritingRulesAssignment_6_in_rule__Rule__Group__6__Impl3937 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__73968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Rule__Group__7__Impl3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group__0__Impl_in_rule__EPackageOpDef__Group__04043 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group__1_in_rule__EPackageOpDef__Group__04046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_0__0_in_rule__EPackageOpDef__Group__0__Impl4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group__1__Impl_in_rule__EPackageOpDef__Group__14103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__0_in_rule__EPackageOpDef__Group__1__Impl4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_0__0__Impl_in_rule__EPackageOpDef__Group_0__04164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_0__1_in_rule__EPackageOpDef__Group_0__04167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EPackageOpDef__Group_0__0__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_0__1__Impl_in_rule__EPackageOpDef__Group_0__14226 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_0__2_in_rule__EPackageOpDef__Group_0__14229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__VarAssignment_0_1_in_rule__EPackageOpDef__Group_0__1__Impl4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_0__2__Impl_in_rule__EPackageOpDef__Group_0__24286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EPackageOpDef__Group_0__2__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__0__Impl_in_rule__EPackageOpDef__Group_1__04351 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__1_in_rule__EPackageOpDef__Group_1__04354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Alternatives_1_0_in_rule__EPackageOpDef__Group_1__0__Impl4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__1__Impl_in_rule__EPackageOpDef__Group_1__14411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__2_in_rule__EPackageOpDef__Group_1__14414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EPackageOpDef__Group_1__1__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__2__Impl_in_rule__EPackageOpDef__Group_1__24473 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__3_in_rule__EPackageOpDef__Group_1__24476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__RefAssignment_1_2_in_rule__EPackageOpDef__Group_1__2__Impl4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__3__Impl_in_rule__EPackageOpDef__Group_1__34533 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__4_in_rule__EPackageOpDef__Group_1__34536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EPackageOpDef__Group_1__3__Impl4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__4__Impl_in_rule__EPackageOpDef__Group_1__44595 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__5_in_rule__EPackageOpDef__Group_1__44598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EPackageOpDef__Group_1__4__Impl4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__5__Impl_in_rule__EPackageOpDef__Group_1__54657 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__6_in_rule__EPackageOpDef__Group_1__54660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EPackageOpDef__Group_1__5__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__6__Impl_in_rule__EPackageOpDef__Group_1__64719 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__7_in_rule__EPackageOpDef__Group_1__64722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EPackageOpDef__Group_1__6__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__7__Impl_in_rule__EPackageOpDef__Group_1__74781 = new BitSet(new long[]{0x0000000480040000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__8_in_rule__EPackageOpDef__Group_1__74784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EPackageOpDef__Group_1__7__Impl4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__8__Impl_in_rule__EPackageOpDef__Group_1__84843 = new BitSet(new long[]{0x0000000480040000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__9_in_rule__EPackageOpDef__Group_1__84846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Alternatives_1_8_in_rule__EPackageOpDef__Group_1__8__Impl4873 = new BitSet(new long[]{0x0000000480000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__9__Impl_in_rule__EPackageOpDef__Group_1__94904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EPackageOpDef__Group_1__9__Impl4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group__0__Impl_in_rule__EClassOpDef__Group__04983 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group__1_in_rule__EClassOpDef__Group__04986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_0__0_in_rule__EClassOpDef__Group__0__Impl5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group__1__Impl_in_rule__EClassOpDef__Group__15043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__0_in_rule__EClassOpDef__Group__1__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_0__0__Impl_in_rule__EClassOpDef__Group_0__05104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_0__1_in_rule__EClassOpDef__Group_0__05107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EClassOpDef__Group_0__0__Impl5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_0__1__Impl_in_rule__EClassOpDef__Group_0__15166 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_0__2_in_rule__EClassOpDef__Group_0__15169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__VarAssignment_0_1_in_rule__EClassOpDef__Group_0__1__Impl5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_0__2__Impl_in_rule__EClassOpDef__Group_0__25226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EClassOpDef__Group_0__2__Impl5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__0__Impl_in_rule__EClassOpDef__Group_1__05291 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__1_in_rule__EClassOpDef__Group_1__05294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Alternatives_1_0_in_rule__EClassOpDef__Group_1__0__Impl5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__1__Impl_in_rule__EClassOpDef__Group_1__15351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__2_in_rule__EClassOpDef__Group_1__15354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EClassOpDef__Group_1__1__Impl5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__2__Impl_in_rule__EClassOpDef__Group_1__25413 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__3_in_rule__EClassOpDef__Group_1__25416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__RefAssignment_1_2_in_rule__EClassOpDef__Group_1__2__Impl5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__3__Impl_in_rule__EClassOpDef__Group_1__35473 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__4_in_rule__EClassOpDef__Group_1__35476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EClassOpDef__Group_1__3__Impl5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__4__Impl_in_rule__EClassOpDef__Group_1__45535 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__5_in_rule__EClassOpDef__Group_1__45538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EClassOpDef__Group_1__4__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__5__Impl_in_rule__EClassOpDef__Group_1__55597 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__6_in_rule__EClassOpDef__Group_1__55600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EClassOpDef__Group_1__5__Impl5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__6__Impl_in_rule__EClassOpDef__Group_1__65659 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__7_in_rule__EClassOpDef__Group_1__65662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EClassOpDef__Group_1__6__Impl5690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__7__Impl_in_rule__EClassOpDef__Group_1__75721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1_7__0_in_rule__EClassOpDef__Group_1__7__Impl5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1_7__0__Impl_in_rule__EClassOpDef__Group_1_7__05794 = new BitSet(new long[]{0x0000000784040000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1_7__1_in_rule__EClassOpDef__Group_1_7__05797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EClassOpDef__Group_1_7__0__Impl5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1_7__1__Impl_in_rule__EClassOpDef__Group_1_7__15856 = new BitSet(new long[]{0x0000000784040000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1_7__2_in_rule__EClassOpDef__Group_1_7__15859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Alternatives_1_7_1_in_rule__EClassOpDef__Group_1_7__1__Impl5886 = new BitSet(new long[]{0x0000000784000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1_7__2__Impl_in_rule__EClassOpDef__Group_1_7__25917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EClassOpDef__Group_1_7__2__Impl5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group__0__Impl_in_rule__EAttributeOpDef__Group__05982 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group__1_in_rule__EAttributeOpDef__Group__05985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_0__0_in_rule__EAttributeOpDef__Group__0__Impl6012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group__1__Impl_in_rule__EAttributeOpDef__Group__16042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__0_in_rule__EAttributeOpDef__Group__1__Impl6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_0__0__Impl_in_rule__EAttributeOpDef__Group_0__06103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_0__1_in_rule__EAttributeOpDef__Group_0__06106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EAttributeOpDef__Group_0__0__Impl6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_0__1__Impl_in_rule__EAttributeOpDef__Group_0__16165 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_0__2_in_rule__EAttributeOpDef__Group_0__16168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__VarAssignment_0_1_in_rule__EAttributeOpDef__Group_0__1__Impl6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_0__2__Impl_in_rule__EAttributeOpDef__Group_0__26225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EAttributeOpDef__Group_0__2__Impl6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__0__Impl_in_rule__EAttributeOpDef__Group_1__06290 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__1_in_rule__EAttributeOpDef__Group_1__06293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__0_in_rule__EAttributeOpDef__Group_1__0__Impl6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__1__Impl_in_rule__EAttributeOpDef__Group_1__16350 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__2_in_rule__EAttributeOpDef__Group_1__16353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EAttributeOpDef__Group_1__1__Impl6381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__2__Impl_in_rule__EAttributeOpDef__Group_1__26412 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__3_in_rule__EAttributeOpDef__Group_1__26415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EAttributeOpDef__Group_1__2__Impl6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__3__Impl_in_rule__EAttributeOpDef__Group_1__36474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Alternatives_1_3_in_rule__EAttributeOpDef__Group_1__3__Impl6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__0__Impl_in_rule__EAttributeOpDef__Group_1_0__06539 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__1_in_rule__EAttributeOpDef__Group_1_0__06542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Alternatives_1_0_0_in_rule__EAttributeOpDef__Group_1_0__0__Impl6569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__1__Impl_in_rule__EAttributeOpDef__Group_1_0__16599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__2_in_rule__EAttributeOpDef__Group_1_0__16602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EAttributeOpDef__Group_1_0__1__Impl6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__2__Impl_in_rule__EAttributeOpDef__Group_1_0__26661 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__3_in_rule__EAttributeOpDef__Group_1_0__26664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__RefAssignment_1_0_2_in_rule__EAttributeOpDef__Group_1_0__2__Impl6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__3__Impl_in_rule__EAttributeOpDef__Group_1_0__36721 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__4_in_rule__EAttributeOpDef__Group_1_0__36724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EAttributeOpDef__Group_1_0__3__Impl6752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__4__Impl_in_rule__EAttributeOpDef__Group_1_0__46783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EAttributeOpDef__Group_1_0__4__Impl6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_3_0__0__Impl_in_rule__EAttributeOpDef__Group_1_3_0__06852 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_3_0__1_in_rule__EAttributeOpDef__Group_1_3_0__06855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EAttributeOpDef__Group_1_3_0__0__Impl6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_3_0__1__Impl_in_rule__EAttributeOpDef__Group_1_3_0__16914 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_3_0__2_in_rule__EAttributeOpDef__Group_1_3_0__16917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__SettersAssignment_1_3_0_1_in_rule__EAttributeOpDef__Group_1_3_0__1__Impl6944 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_3_0__2__Impl_in_rule__EAttributeOpDef__Group_1_3_0__26975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EAttributeOpDef__Group_1_3_0__2__Impl7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group__0__Impl_in_rule__EReferenceOpDef__Group__07040 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group__1_in_rule__EReferenceOpDef__Group__07043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_0__0_in_rule__EReferenceOpDef__Group__0__Impl7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group__1__Impl_in_rule__EReferenceOpDef__Group__17100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__0_in_rule__EReferenceOpDef__Group__1__Impl7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_0__0__Impl_in_rule__EReferenceOpDef__Group_0__07161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_0__1_in_rule__EReferenceOpDef__Group_0__07164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EReferenceOpDef__Group_0__0__Impl7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_0__1__Impl_in_rule__EReferenceOpDef__Group_0__17223 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_0__2_in_rule__EReferenceOpDef__Group_0__17226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__VarAssignment_0_1_in_rule__EReferenceOpDef__Group_0__1__Impl7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_0__2__Impl_in_rule__EReferenceOpDef__Group_0__27283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EReferenceOpDef__Group_0__2__Impl7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__0__Impl_in_rule__EReferenceOpDef__Group_1__07348 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__1_in_rule__EReferenceOpDef__Group_1__07351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__0_in_rule__EReferenceOpDef__Group_1__0__Impl7378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__1__Impl_in_rule__EReferenceOpDef__Group_1__17408 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__2_in_rule__EReferenceOpDef__Group_1__17411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EReferenceOpDef__Group_1__1__Impl7439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__2__Impl_in_rule__EReferenceOpDef__Group_1__27470 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__3_in_rule__EReferenceOpDef__Group_1__27473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EReferenceOpDef__Group_1__2__Impl7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__3__Impl_in_rule__EReferenceOpDef__Group_1__37532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_3__0_in_rule__EReferenceOpDef__Group_1__3__Impl7559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__0__Impl_in_rule__EReferenceOpDef__Group_1_0__07597 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__1_in_rule__EReferenceOpDef__Group_1_0__07600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Alternatives_1_0_0_in_rule__EReferenceOpDef__Group_1_0__0__Impl7627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__1__Impl_in_rule__EReferenceOpDef__Group_1_0__17657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__2_in_rule__EReferenceOpDef__Group_1_0__17660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EReferenceOpDef__Group_1_0__1__Impl7688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__2__Impl_in_rule__EReferenceOpDef__Group_1_0__27719 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__3_in_rule__EReferenceOpDef__Group_1_0__27722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__RefAssignment_1_0_2_in_rule__EReferenceOpDef__Group_1_0__2__Impl7749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__3__Impl_in_rule__EReferenceOpDef__Group_1_0__37779 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__4_in_rule__EReferenceOpDef__Group_1_0__37782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EReferenceOpDef__Group_1_0__3__Impl7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__4__Impl_in_rule__EReferenceOpDef__Group_1_0__47841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EReferenceOpDef__Group_1_0__4__Impl7869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_3__0__Impl_in_rule__EReferenceOpDef__Group_1_3__07910 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_3__1_in_rule__EReferenceOpDef__Group_1_3__07913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EReferenceOpDef__Group_1_3__0__Impl7941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_3__1__Impl_in_rule__EReferenceOpDef__Group_1_3__17972 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_3__2_in_rule__EReferenceOpDef__Group_1_3__17975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__SettersAssignment_1_3_1_in_rule__EReferenceOpDef__Group_1_3__1__Impl8002 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_3__2__Impl_in_rule__EReferenceOpDef__Group_1_3__28033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EReferenceOpDef__Group_1_3__2__Impl8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__0__Impl_in_rule__SetterDef__Group__08098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__1_in_rule__SetterDef__Group__08101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SetterDef__Group__0__Impl8129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__1__Impl_in_rule__SetterDef__Group__18160 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__2_in_rule__SetterDef__Group__18163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__MetafeatureAssignment_1_in_rule__SetterDef__Group__1__Impl8190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__2__Impl_in_rule__SetterDef__Group__28220 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__3_in_rule__SetterDef__Group__28223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__OperatorAssignment_2_in_rule__SetterDef__Group__2__Impl8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__3__Impl_in_rule__SetterDef__Group__38280 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__4_in_rule__SetterDef__Group__38283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__ParAssignment_3_in_rule__SetterDef__Group__3__Impl8310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__4__Impl_in_rule__SetterDef__Group__48340 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__5_in_rule__SetterDef__Group__48343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group_4__0_in_rule__SetterDef__Group__4__Impl8370 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__5__Impl_in_rule__SetterDef__Group__58401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SetterDef__Group__5__Impl8429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group_4__0__Impl_in_rule__SetterDef__Group_4__08472 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__SetterDef__Group_4__1_in_rule__SetterDef__Group_4__08475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SetterDef__Group_4__0__Impl8503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group_4__1__Impl_in_rule__SetterDef__Group_4__18534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__ParAssignment_4_1_in_rule__SetterDef__Group_4__1__Impl8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group__0__Impl_in_rule__RewritingRule__Group__08595 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group__1_in_rule__RewritingRule__Group__08598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_0__0_in_rule__RewritingRule__Group__0__Impl8625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group__1__Impl_in_rule__RewritingRule__Group__18655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__0_in_rule__RewritingRule__Group__1__Impl8682 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_0__0__Impl_in_rule__RewritingRule__Group_0__08717 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_0__1_in_rule__RewritingRule__Group_0__08720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__MigratorsSXAssignment_0_0_in_rule__RewritingRule__Group_0__0__Impl8747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_0__1__Impl_in_rule__RewritingRule__Group_0__18777 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_0__2_in_rule__RewritingRule__Group_0__18780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RewritingRule__Group_0__1__Impl8808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_0__2__Impl_in_rule__RewritingRule__Group_0__28839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__MigratorDXAssignment_0_2_in_rule__RewritingRule__Group_0__2__Impl8866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__0__Impl_in_rule__RewritingRule__Group_1__08902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__1_in_rule__RewritingRule__Group_1__08905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RewritingRule__Group_1__0__Impl8933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__1__Impl_in_rule__RewritingRule__Group_1__18964 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__2_in_rule__RewritingRule__Group_1__18967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__MigratorSXAssignment_1_1_in_rule__RewritingRule__Group_1__1__Impl8994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__2__Impl_in_rule__RewritingRule__Group_1__29024 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__3_in_rule__RewritingRule__Group_1__29027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RewritingRule__Group_1__2__Impl9055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__3__Impl_in_rule__RewritingRule__Group_1__39086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__MigratorDXAssignment_1_3_in_rule__RewritingRule__Group_1__3__Impl9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__0__Impl_in_rule__MigratorSX__Group__09151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__1_in_rule__MigratorSX__Group__09154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__1__Impl_in_rule__MigratorSX__Group__19212 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__2_in_rule__MigratorSX__Group__19215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__NameAssignment_1_in_rule__MigratorSX__Group__1__Impl9242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__2__Impl_in_rule__MigratorSX__Group__29272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__3_in_rule__MigratorSX__Group__29275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MigratorSX__Group__2__Impl9303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__3__Impl_in_rule__MigratorSX__Group__39334 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__4_in_rule__MigratorSX__Group__39337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__ElementSXAssignment_3_in_rule__MigratorSX__Group__3__Impl9364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__4__Impl_in_rule__MigratorSX__Group__49394 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__5_in_rule__MigratorSX__Group__49397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MigratorSX__Group__4__Impl9425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__5__Impl_in_rule__MigratorSX__Group__59456 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__6_in_rule__MigratorSX__Group__59459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MigratorSX__Group__5__Impl9487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__6__Impl_in_rule__MigratorSX__Group__69518 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__7_in_rule__MigratorSX__Group__69521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__FilterSXAssignment_6_in_rule__MigratorSX__Group__6__Impl9548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__7__Impl_in_rule__MigratorSX__Group__79578 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__8_in_rule__MigratorSX__Group__79581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group_7__0_in_rule__MigratorSX__Group__7__Impl9608 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__8__Impl_in_rule__MigratorSX__Group__89639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MigratorSX__Group__8__Impl9667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group_7__0__Impl_in_rule__MigratorSX__Group_7__09716 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group_7__1_in_rule__MigratorSX__Group_7__09719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__MigratorSX__Group_7__0__Impl9747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group_7__1__Impl_in_rule__MigratorSX__Group_7__19778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__FilterSXAssignment_7_1_in_rule__MigratorSX__Group_7__1__Impl9805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0__0__Impl_in_rule__MigratorDX__Group_0__09839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0__1_in_rule__MigratorDX__Group_0__09842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0__1__Impl_in_rule__MigratorDX__Group_0__19900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__0_in_rule__MigratorDX__Group_0__1__Impl9927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__0__Impl_in_rule__MigratorDX__Group_0_1__09961 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__1_in_rule__MigratorDX__Group_0_1__09964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__NameAssignment_0_1_0_in_rule__MigratorDX__Group_0_1__0__Impl9991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__1__Impl_in_rule__MigratorDX__Group_0_1__110021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__2_in_rule__MigratorDX__Group_0_1__110024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MigratorDX__Group_0_1__1__Impl10052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__2__Impl_in_rule__MigratorDX__Group_0_1__210083 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__3_in_rule__MigratorDX__Group_0_1__210086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__ElementDXAssignment_0_1_2_in_rule__MigratorDX__Group_0_1__2__Impl10113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__3__Impl_in_rule__MigratorDX__Group_0_1__310143 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__4_in_rule__MigratorDX__Group_0_1__310146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MigratorDX__Group_0_1__3__Impl10174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__4__Impl_in_rule__MigratorDX__Group_0_1__410205 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__5_in_rule__MigratorDX__Group_0_1__410208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__FilterDXAssignment_0_1_4_in_rule__MigratorDX__Group_0_1__4__Impl10235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__5__Impl_in_rule__MigratorDX__Group_0_1__510265 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__6_in_rule__MigratorDX__Group_0_1__510268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1_5__0_in_rule__MigratorDX__Group_0_1__5__Impl10295 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__6__Impl_in_rule__MigratorDX__Group_0_1__610326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MigratorDX__Group_0_1__6__Impl10354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1_5__0__Impl_in_rule__MigratorDX__Group_0_1_5__010399 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1_5__1_in_rule__MigratorDX__Group_0_1_5__010402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__MigratorDX__Group_0_1_5__0__Impl10430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1_5__1__Impl_in_rule__MigratorDX__Group_0_1_5__110461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__FilterDXAssignment_0_1_5_1_in_rule__MigratorDX__Group_0_1_5__1__Impl10488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__Group__0__Impl_in_rule__FilterMigrator__Group__010522 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__FilterMigrator__Group__1_in_rule__FilterMigrator__Group__010525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__FeatureSXAssignment_0_in_rule__FilterMigrator__Group__0__Impl10552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__Group__1__Impl_in_rule__FilterMigrator__Group__110582 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__FilterMigrator__Group__2_in_rule__FilterMigrator__Group__110585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__OpAssignment_1_in_rule__FilterMigrator__Group__1__Impl10612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__Group__2__Impl_in_rule__FilterMigrator__Group__210642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__ValueAssignment_2_in_rule__FilterMigrator__Group__2__Impl10669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group__0__Impl_in_rule__DotNavigationObjSX__Group__010706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group__1_in_rule__DotNavigationObjSX__Group__010709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__DotNavigationObjSX__Group__0__Impl10737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group__1__Impl_in_rule__DotNavigationObjSX__Group__110768 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group__2_in_rule__DotNavigationObjSX__Group__110771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__ObjAssignment_1_in_rule__DotNavigationObjSX__Group__1__Impl10798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group__2__Impl_in_rule__DotNavigationObjSX__Group__210828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group_2__0_in_rule__DotNavigationObjSX__Group__2__Impl10855 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group_2__0__Impl_in_rule__DotNavigationObjSX__Group_2__010892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group_2__1_in_rule__DotNavigationObjSX__Group_2__010895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DotNavigationObjSX__Group_2__0__Impl10923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group_2__1__Impl_in_rule__DotNavigationObjSX__Group_2__110954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__RefAssignment_2_1_in_rule__DotNavigationObjSX__Group_2__1__Impl10981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group__0__Impl_in_rule__DotNavigationObjDX__Group__011015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group__1_in_rule__DotNavigationObjDX__Group__011018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__DotNavigationObjDX__Group__0__Impl11046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group__1__Impl_in_rule__DotNavigationObjDX__Group__111077 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group__2_in_rule__DotNavigationObjDX__Group__111080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__ObjAssignment_1_in_rule__DotNavigationObjDX__Group__1__Impl11107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group__2__Impl_in_rule__DotNavigationObjDX__Group__211137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group_2__0_in_rule__DotNavigationObjDX__Group__2__Impl11164 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group_2__0__Impl_in_rule__DotNavigationObjDX__Group_2__011201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group_2__1_in_rule__DotNavigationObjDX__Group_2__011204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DotNavigationObjDX__Group_2__0__Impl11232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group_2__1__Impl_in_rule__DotNavigationObjDX__Group_2__111263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__RefAssignment_2_1_in_rule__DotNavigationObjDX__Group_2__1__Impl11290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__011324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__011327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Parameter__Group__0__Impl11355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__111386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl11413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__011447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__011450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__111508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl11535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__011569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__011572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__111630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl11657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__011691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__011694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__111752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl11779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__011813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__011816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__111874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl11901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationLibrary_in_rule__MyModel__MigrationLibAssignment_011940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationProgram_in_rule__MyModel__MigrationProgrAssignment_111971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigrationLibrary__TitleAssignment_112002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__MigrationLibrary__RulesAssignment_312033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MigrationProgram__LibsAssignment_0_112064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MigrationProgram__MigrAssignment_112100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifact_in_rule__MigrationProgram__TypeArtAssignment_212139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MigrationProgram__NameAssignment_312170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigrationProgram__TransformationPackageAssignment_5_012205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigrationProgram__TransformationPackageAssignment_5_1_112244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MigrationProgram__DeltaAssignment_712279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__MigrationProgram__RulesAssignment_912310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artifact__TypeAlternatives_0_in_rule__Artifact__TypeAssignment12341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_112374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpDef_in_rule__Rule__FilterAssignment_312405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewritingRule_in_rule__Rule__RewritingRulesAssignment_612436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__EPackageOpDef__VarAssignment_0_112467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EPackageOpDef__OpAssignment_1_0_012503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EPackageOpDef__OpAssignment_1_0_112547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EPackageOpDef__OpAssignment_1_0_212591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__EPackageOpDef__RefAssignment_1_212630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetterDef_in_rule__EPackageOpDef__SettersAssignment_1_8_012661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_rule__EPackageOpDef__ClassesAssignment_1_8_112692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__EClassOpDef__VarAssignment_0_112723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EClassOpDef__OpAssignment_1_0_012759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EClassOpDef__OpAssignment_1_0_112803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EClassOpDef__OpAssignment_1_0_212847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__EClassOpDef__RefAssignment_1_212886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetterDef_in_rule__EClassOpDef__SettersAssignment_1_7_1_012917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_rule__EClassOpDef__AttributesAssignment_1_7_1_112948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_rule__EClassOpDef__ReferencesAssignment_1_7_1_212979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EAttributeOpDef__VarAssignment_0_113010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EAttributeOpDef__OpAssignment_1_0_0_013046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__EAttributeOpDef__OpAssignment_1_0_0_113090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__EAttributeOpDef__OpAssignment_1_0_0_213134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EAttributeOpDef__RefAssignment_1_0_213173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetterDef_in_rule__EAttributeOpDef__SettersAssignment_1_3_0_113204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__EReferenceOpDef__VarAssignment_0_113235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__EReferenceOpDef__OpAssignment_1_0_0_013271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__EReferenceOpDef__OpAssignment_1_0_0_113315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__EReferenceOpDef__OpAssignment_1_0_0_213359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__EReferenceOpDef__RefAssignment_1_0_213398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetterDef_in_rule__EReferenceOpDef__SettersAssignment_1_3_113429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SetterDef__MetafeatureAssignment_113464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SetterDef__OperatorAssignment_213504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__SetterDef__ParAssignment_313543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__SetterDef__ParAssignment_4_113574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_rule__RewritingRule__MigratorsSXAssignment_0_013605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_rule__RewritingRule__MigratorDXAssignment_0_213636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_rule__RewritingRule__MigratorSXAssignment_1_113667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_rule__RewritingRule__MigratorDXAssignment_1_313698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigratorSX__NameAssignment_113729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigratorSX__ElementSXAssignment_313764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_rule__MigratorSX__FilterSXAssignment_613799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_rule__MigratorSX__FilterSXAssignment_7_113830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigratorDX__NameAssignment_0_1_013861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigratorDX__ElementDXAssignment_0_1_213896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_rule__MigratorDX__FilterDXAssignment_0_1_413931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_rule__MigratorDX__FilterDXAssignment_0_1_5_113962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjSX_in_rule__FilterMigrator__FeatureSXAssignment_013993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FilterMigrator__OpAssignment_114029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjDX_in_rule__FilterMigrator__ValueAssignment_214068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DotNavigationObjSX__ObjAssignment_114103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DotNavigationObjSX__RefAssignment_2_114142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DotNavigationObjDX__ObjAssignment_114181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DotNavigationObjDX__RefAssignment_2_114220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_114255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_114286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_114317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_114348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_114379 = new BitSet(new long[]{0x0000000000000002L});

}