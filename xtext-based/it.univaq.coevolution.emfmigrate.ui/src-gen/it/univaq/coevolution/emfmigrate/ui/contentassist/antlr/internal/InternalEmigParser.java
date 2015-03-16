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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'transformation'", "'model'", "'tcs-model'", "';'", "'null'", "'Library'", "'{'", "'}'", "'Migration'", "':'", "'with'", "'include'", "','", "'rule'", "'['", "']'", "'package'", "'='", "'('", "')'", "'where'", "'class'", "'attribute'", "'reference'", "'set'", "'->'", "'&'", "'#'", "'.'", "'%'", "'migrate'", "'changePackage'", "'addPackage'", "'deletePackage'", "'changeClass'", "'addClass'", "'deleteClass'", "'changeEAttribute'", "'addEAttribute'", "'deleteEAttribute'", "'changeEReference'", "'addEReference'", "'deleteEReference'"
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:118:1: entryRuleMigrationProgram : ruleMigrationProgram EOF ;
    public final void entryRuleMigrationProgram() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:119:1: ( ruleMigrationProgram EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:120:1: ruleMigrationProgram EOF
            {
             before(grammarAccess.getMigrationProgramRule()); 
            pushFollow(FOLLOW_ruleMigrationProgram_in_entryRuleMigrationProgram183);
            ruleMigrationProgram();

            state._fsp--;

             after(grammarAccess.getMigrationProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationProgram190); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:127:1: ruleMigrationProgram : ( ( rule__MigrationProgram__Group__0 ) ) ;
    public final void ruleMigrationProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:131:2: ( ( ( rule__MigrationProgram__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:132:1: ( ( rule__MigrationProgram__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:132:1: ( ( rule__MigrationProgram__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:133:1: ( rule__MigrationProgram__Group__0 )
            {
             before(grammarAccess.getMigrationProgramAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:134:1: ( rule__MigrationProgram__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:134:2: rule__MigrationProgram__Group__0
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__0_in_ruleMigrationProgram216);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:146:1: entryRuleArtifact : ruleArtifact EOF ;
    public final void entryRuleArtifact() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:147:1: ( ruleArtifact EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:148:1: ruleArtifact EOF
            {
             before(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_ruleArtifact_in_entryRuleArtifact243);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getArtifactRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifact250); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:155:1: ruleArtifact : ( ( rule__Artifact__TypeAssignment ) ) ;
    public final void ruleArtifact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:159:2: ( ( ( rule__Artifact__TypeAssignment ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:160:1: ( ( rule__Artifact__TypeAssignment ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:160:1: ( ( rule__Artifact__TypeAssignment ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:161:1: ( rule__Artifact__TypeAssignment )
            {
             before(grammarAccess.getArtifactAccess().getTypeAssignment()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:162:1: ( rule__Artifact__TypeAssignment )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:162:2: rule__Artifact__TypeAssignment
            {
            pushFollow(FOLLOW_rule__Artifact__TypeAssignment_in_ruleArtifact276);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:174:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:175:1: ( ruleRule EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:176:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule303);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule310); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:183:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:187:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:188:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:188:1: ( ( rule__Rule__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:189:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:190:1: ( rule__Rule__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:190:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule336);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:202:1: entryRuleOpDef : ruleOpDef EOF ;
    public final void entryRuleOpDef() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:203:1: ( ruleOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:204:1: ruleOpDef EOF
            {
             before(grammarAccess.getOpDefRule()); 
            pushFollow(FOLLOW_ruleOpDef_in_entryRuleOpDef363);
            ruleOpDef();

            state._fsp--;

             after(grammarAccess.getOpDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpDef370); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:211:1: ruleOpDef : ( ( rule__OpDef__Alternatives ) ) ;
    public final void ruleOpDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:215:2: ( ( ( rule__OpDef__Alternatives ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:216:1: ( ( rule__OpDef__Alternatives ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:216:1: ( ( rule__OpDef__Alternatives ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:217:1: ( rule__OpDef__Alternatives )
            {
             before(grammarAccess.getOpDefAccess().getAlternatives()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:218:1: ( rule__OpDef__Alternatives )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:218:2: rule__OpDef__Alternatives
            {
            pushFollow(FOLLOW_rule__OpDef__Alternatives_in_ruleOpDef396);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:230:1: entryRuleEPackageOpDef : ruleEPackageOpDef EOF ;
    public final void entryRuleEPackageOpDef() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:231:1: ( ruleEPackageOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:232:1: ruleEPackageOpDef EOF
            {
             before(grammarAccess.getEPackageOpDefRule()); 
            pushFollow(FOLLOW_ruleEPackageOpDef_in_entryRuleEPackageOpDef423);
            ruleEPackageOpDef();

            state._fsp--;

             after(grammarAccess.getEPackageOpDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPackageOpDef430); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:239:1: ruleEPackageOpDef : ( ( rule__EPackageOpDef__Group__0 ) ) ;
    public final void ruleEPackageOpDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:243:2: ( ( ( rule__EPackageOpDef__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:244:1: ( ( rule__EPackageOpDef__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:244:1: ( ( rule__EPackageOpDef__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:245:1: ( rule__EPackageOpDef__Group__0 )
            {
             before(grammarAccess.getEPackageOpDefAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:246:1: ( rule__EPackageOpDef__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:246:2: rule__EPackageOpDef__Group__0
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group__0_in_ruleEPackageOpDef456);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:258:1: entryRuleEClassOpDef : ruleEClassOpDef EOF ;
    public final void entryRuleEClassOpDef() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:259:1: ( ruleEClassOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:260:1: ruleEClassOpDef EOF
            {
             before(grammarAccess.getEClassOpDefRule()); 
            pushFollow(FOLLOW_ruleEClassOpDef_in_entryRuleEClassOpDef483);
            ruleEClassOpDef();

            state._fsp--;

             after(grammarAccess.getEClassOpDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEClassOpDef490); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:267:1: ruleEClassOpDef : ( ( rule__EClassOpDef__Group__0 ) ) ;
    public final void ruleEClassOpDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:271:2: ( ( ( rule__EClassOpDef__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:272:1: ( ( rule__EClassOpDef__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:272:1: ( ( rule__EClassOpDef__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:273:1: ( rule__EClassOpDef__Group__0 )
            {
             before(grammarAccess.getEClassOpDefAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:274:1: ( rule__EClassOpDef__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:274:2: rule__EClassOpDef__Group__0
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group__0_in_ruleEClassOpDef516);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:286:1: entryRuleEAttributeOpDef : ruleEAttributeOpDef EOF ;
    public final void entryRuleEAttributeOpDef() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:287:1: ( ruleEAttributeOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:288:1: ruleEAttributeOpDef EOF
            {
             before(grammarAccess.getEAttributeOpDefRule()); 
            pushFollow(FOLLOW_ruleEAttributeOpDef_in_entryRuleEAttributeOpDef543);
            ruleEAttributeOpDef();

            state._fsp--;

             after(grammarAccess.getEAttributeOpDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEAttributeOpDef550); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:295:1: ruleEAttributeOpDef : ( ( rule__EAttributeOpDef__Group__0 ) ) ;
    public final void ruleEAttributeOpDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:299:2: ( ( ( rule__EAttributeOpDef__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:300:1: ( ( rule__EAttributeOpDef__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:300:1: ( ( rule__EAttributeOpDef__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:301:1: ( rule__EAttributeOpDef__Group__0 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:302:1: ( rule__EAttributeOpDef__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:302:2: rule__EAttributeOpDef__Group__0
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group__0_in_ruleEAttributeOpDef576);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:314:1: entryRuleEReferenceOpDef : ruleEReferenceOpDef EOF ;
    public final void entryRuleEReferenceOpDef() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:315:1: ( ruleEReferenceOpDef EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:316:1: ruleEReferenceOpDef EOF
            {
             before(grammarAccess.getEReferenceOpDefRule()); 
            pushFollow(FOLLOW_ruleEReferenceOpDef_in_entryRuleEReferenceOpDef603);
            ruleEReferenceOpDef();

            state._fsp--;

             after(grammarAccess.getEReferenceOpDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEReferenceOpDef610); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:323:1: ruleEReferenceOpDef : ( ( rule__EReferenceOpDef__Group__0 ) ) ;
    public final void ruleEReferenceOpDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:327:2: ( ( ( rule__EReferenceOpDef__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:328:1: ( ( rule__EReferenceOpDef__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:328:1: ( ( rule__EReferenceOpDef__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:329:1: ( rule__EReferenceOpDef__Group__0 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:330:1: ( rule__EReferenceOpDef__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:330:2: rule__EReferenceOpDef__Group__0
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group__0_in_ruleEReferenceOpDef636);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:342:1: entryRulesetterDef : rulesetterDef EOF ;
    public final void entryRulesetterDef() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:343:1: ( rulesetterDef EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:344:1: rulesetterDef EOF
            {
             before(grammarAccess.getSetterDefRule()); 
            pushFollow(FOLLOW_rulesetterDef_in_entryRulesetterDef663);
            rulesetterDef();

            state._fsp--;

             after(grammarAccess.getSetterDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesetterDef670); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:351:1: rulesetterDef : ( ( rule__SetterDef__Group__0 ) ) ;
    public final void rulesetterDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:355:2: ( ( ( rule__SetterDef__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:356:1: ( ( rule__SetterDef__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:356:1: ( ( rule__SetterDef__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:357:1: ( rule__SetterDef__Group__0 )
            {
             before(grammarAccess.getSetterDefAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:358:1: ( rule__SetterDef__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:358:2: rule__SetterDef__Group__0
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__0_in_rulesetterDef696);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:370:1: entryRuleRewritingRule : ruleRewritingRule EOF ;
    public final void entryRuleRewritingRule() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:371:1: ( ruleRewritingRule EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:372:1: ruleRewritingRule EOF
            {
             before(grammarAccess.getRewritingRuleRule()); 
            pushFollow(FOLLOW_ruleRewritingRule_in_entryRuleRewritingRule723);
            ruleRewritingRule();

            state._fsp--;

             after(grammarAccess.getRewritingRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRewritingRule730); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:379:1: ruleRewritingRule : ( ( rule__RewritingRule__Group__0 ) ) ;
    public final void ruleRewritingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:383:2: ( ( ( rule__RewritingRule__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:384:1: ( ( rule__RewritingRule__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:384:1: ( ( rule__RewritingRule__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:385:1: ( rule__RewritingRule__Group__0 )
            {
             before(grammarAccess.getRewritingRuleAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:386:1: ( rule__RewritingRule__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:386:2: rule__RewritingRule__Group__0
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group__0_in_ruleRewritingRule756);
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


    // $ANTLR start "entryRuleMigrator"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:398:1: entryRuleMigrator : ruleMigrator EOF ;
    public final void entryRuleMigrator() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:399:1: ( ruleMigrator EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:400:1: ruleMigrator EOF
            {
             before(grammarAccess.getMigratorRule()); 
            pushFollow(FOLLOW_ruleMigrator_in_entryRuleMigrator783);
            ruleMigrator();

            state._fsp--;

             after(grammarAccess.getMigratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrator790); 

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
    // $ANTLR end "entryRuleMigrator"


    // $ANTLR start "ruleMigrator"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:407:1: ruleMigrator : ( ( rule__Migrator__Alternatives ) ) ;
    public final void ruleMigrator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:411:2: ( ( ( rule__Migrator__Alternatives ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:412:1: ( ( rule__Migrator__Alternatives ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:412:1: ( ( rule__Migrator__Alternatives ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:413:1: ( rule__Migrator__Alternatives )
            {
             before(grammarAccess.getMigratorAccess().getAlternatives()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:414:1: ( rule__Migrator__Alternatives )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:414:2: rule__Migrator__Alternatives
            {
            pushFollow(FOLLOW_rule__Migrator__Alternatives_in_ruleMigrator816);
            rule__Migrator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMigratorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMigrator"


    // $ANTLR start "entryRuleMigratorSX"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:426:1: entryRuleMigratorSX : ruleMigratorSX EOF ;
    public final void entryRuleMigratorSX() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:427:1: ( ruleMigratorSX EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:428:1: ruleMigratorSX EOF
            {
             before(grammarAccess.getMigratorSXRule()); 
            pushFollow(FOLLOW_ruleMigratorSX_in_entryRuleMigratorSX843);
            ruleMigratorSX();

            state._fsp--;

             after(grammarAccess.getMigratorSXRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigratorSX850); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:435:1: ruleMigratorSX : ( ( rule__MigratorSX__Group__0 ) ) ;
    public final void ruleMigratorSX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:439:2: ( ( ( rule__MigratorSX__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:440:1: ( ( rule__MigratorSX__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:440:1: ( ( rule__MigratorSX__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:441:1: ( rule__MigratorSX__Group__0 )
            {
             before(grammarAccess.getMigratorSXAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:442:1: ( rule__MigratorSX__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:442:2: rule__MigratorSX__Group__0
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__0_in_ruleMigratorSX876);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:454:1: entryRuleMigratorDX : ruleMigratorDX EOF ;
    public final void entryRuleMigratorDX() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:455:1: ( ruleMigratorDX EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:456:1: ruleMigratorDX EOF
            {
             before(grammarAccess.getMigratorDXRule()); 
            pushFollow(FOLLOW_ruleMigratorDX_in_entryRuleMigratorDX903);
            ruleMigratorDX();

            state._fsp--;

             after(grammarAccess.getMigratorDXRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigratorDX910); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:463:1: ruleMigratorDX : ( ( rule__MigratorDX__Alternatives ) ) ;
    public final void ruleMigratorDX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:467:2: ( ( ( rule__MigratorDX__Alternatives ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:468:1: ( ( rule__MigratorDX__Alternatives ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:468:1: ( ( rule__MigratorDX__Alternatives ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:469:1: ( rule__MigratorDX__Alternatives )
            {
             before(grammarAccess.getMigratorDXAccess().getAlternatives()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:470:1: ( rule__MigratorDX__Alternatives )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:470:2: rule__MigratorDX__Alternatives
            {
            pushFollow(FOLLOW_rule__MigratorDX__Alternatives_in_ruleMigratorDX936);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:482:1: entryRuleFilterMigrator : ruleFilterMigrator EOF ;
    public final void entryRuleFilterMigrator() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:483:1: ( ruleFilterMigrator EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:484:1: ruleFilterMigrator EOF
            {
             before(grammarAccess.getFilterMigratorRule()); 
            pushFollow(FOLLOW_ruleFilterMigrator_in_entryRuleFilterMigrator963);
            ruleFilterMigrator();

            state._fsp--;

             after(grammarAccess.getFilterMigratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterMigrator970); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:491:1: ruleFilterMigrator : ( ( rule__FilterMigrator__Group__0 ) ) ;
    public final void ruleFilterMigrator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:495:2: ( ( ( rule__FilterMigrator__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:496:1: ( ( rule__FilterMigrator__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:496:1: ( ( rule__FilterMigrator__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:497:1: ( rule__FilterMigrator__Group__0 )
            {
             before(grammarAccess.getFilterMigratorAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:498:1: ( rule__FilterMigrator__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:498:2: rule__FilterMigrator__Group__0
            {
            pushFollow(FOLLOW_rule__FilterMigrator__Group__0_in_ruleFilterMigrator996);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:510:1: entryRuleDotNavigationObjSX : ruleDotNavigationObjSX EOF ;
    public final void entryRuleDotNavigationObjSX() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:511:1: ( ruleDotNavigationObjSX EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:512:1: ruleDotNavigationObjSX EOF
            {
             before(grammarAccess.getDotNavigationObjSXRule()); 
            pushFollow(FOLLOW_ruleDotNavigationObjSX_in_entryRuleDotNavigationObjSX1023);
            ruleDotNavigationObjSX();

            state._fsp--;

             after(grammarAccess.getDotNavigationObjSXRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDotNavigationObjSX1030); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:519:1: ruleDotNavigationObjSX : ( ( rule__DotNavigationObjSX__Group__0 ) ) ;
    public final void ruleDotNavigationObjSX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:523:2: ( ( ( rule__DotNavigationObjSX__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:524:1: ( ( rule__DotNavigationObjSX__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:524:1: ( ( rule__DotNavigationObjSX__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:525:1: ( rule__DotNavigationObjSX__Group__0 )
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:526:1: ( rule__DotNavigationObjSX__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:526:2: rule__DotNavigationObjSX__Group__0
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group__0_in_ruleDotNavigationObjSX1056);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:538:1: entryRuleDotNavigationObjDX : ruleDotNavigationObjDX EOF ;
    public final void entryRuleDotNavigationObjDX() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:539:1: ( ruleDotNavigationObjDX EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:540:1: ruleDotNavigationObjDX EOF
            {
             before(grammarAccess.getDotNavigationObjDXRule()); 
            pushFollow(FOLLOW_ruleDotNavigationObjDX_in_entryRuleDotNavigationObjDX1083);
            ruleDotNavigationObjDX();

            state._fsp--;

             after(grammarAccess.getDotNavigationObjDXRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDotNavigationObjDX1090); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:547:1: ruleDotNavigationObjDX : ( ( rule__DotNavigationObjDX__Group__0 ) ) ;
    public final void ruleDotNavigationObjDX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:551:2: ( ( ( rule__DotNavigationObjDX__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:552:1: ( ( rule__DotNavigationObjDX__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:552:1: ( ( rule__DotNavigationObjDX__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:553:1: ( rule__DotNavigationObjDX__Group__0 )
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:554:1: ( rule__DotNavigationObjDX__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:554:2: rule__DotNavigationObjDX__Group__0
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group__0_in_ruleDotNavigationObjDX1116);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:566:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:567:1: ( ruleParameter EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:568:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1143);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1150); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:575:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:579:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:580:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:580:1: ( ( rule__Parameter__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:581:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:582:1: ( rule__Parameter__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:582:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter1176);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:594:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:595:1: ( rulePackage EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:596:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage1203);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage1210); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:603:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:607:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:608:1: ( ( rule__Package__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:608:1: ( ( rule__Package__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:609:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:610:1: ( rule__Package__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:610:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage1236);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:622:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:623:1: ( ruleClass EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:624:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass1263);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass1270); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:631:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:635:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:636:1: ( ( rule__Class__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:636:1: ( ( rule__Class__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:637:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:638:1: ( rule__Class__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:638:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass1296);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:650:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:651:1: ( ruleAttribute EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:652:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1323);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1330); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:659:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:663:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:664:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:664:1: ( ( rule__Attribute__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:665:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:666:1: ( rule__Attribute__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:666:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1356);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:678:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:679:1: ( ruleReference EOF )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:680:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1383);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1390); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:687:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:691:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:692:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:692:1: ( ( rule__Reference__Group__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:693:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:694:1: ( rule__Reference__Group__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:694:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference1416);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:708:1: rule__MyModel__Alternatives : ( ( ( rule__MyModel__MigrationLibAssignment_0 ) ) | ( ( rule__MyModel__MigrationProgrAssignment_1 ) ) );
    public final void rule__MyModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:712:1: ( ( ( rule__MyModel__MigrationLibAssignment_0 ) ) | ( ( rule__MyModel__MigrationProgrAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:713:1: ( ( rule__MyModel__MigrationLibAssignment_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:713:1: ( ( rule__MyModel__MigrationLibAssignment_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:714:1: ( rule__MyModel__MigrationLibAssignment_0 )
                    {
                     before(grammarAccess.getMyModelAccess().getMigrationLibAssignment_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:715:1: ( rule__MyModel__MigrationLibAssignment_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:715:2: rule__MyModel__MigrationLibAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MyModel__MigrationLibAssignment_0_in_rule__MyModel__Alternatives1454);
                    rule__MyModel__MigrationLibAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMyModelAccess().getMigrationLibAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:719:6: ( ( rule__MyModel__MigrationProgrAssignment_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:719:6: ( ( rule__MyModel__MigrationProgrAssignment_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:720:1: ( rule__MyModel__MigrationProgrAssignment_1 )
                    {
                     before(grammarAccess.getMyModelAccess().getMigrationProgrAssignment_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:721:1: ( rule__MyModel__MigrationProgrAssignment_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:721:2: rule__MyModel__MigrationProgrAssignment_1
                    {
                    pushFollow(FOLLOW_rule__MyModel__MigrationProgrAssignment_1_in_rule__MyModel__Alternatives1472);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:731:1: rule__Artifact__TypeAlternatives_0 : ( ( 'transformation' ) | ( 'model' ) | ( 'tcs-model' ) );
    public final void rule__Artifact__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:735:1: ( ( 'transformation' ) | ( 'model' ) | ( 'tcs-model' ) )
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
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:736:1: ( 'transformation' )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:736:1: ( 'transformation' )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:737:1: 'transformation'
                    {
                     before(grammarAccess.getArtifactAccess().getTypeTransformationKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Artifact__TypeAlternatives_01507); 
                     after(grammarAccess.getArtifactAccess().getTypeTransformationKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:744:6: ( 'model' )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:744:6: ( 'model' )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:745:1: 'model'
                    {
                     before(grammarAccess.getArtifactAccess().getTypeModelKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Artifact__TypeAlternatives_01527); 
                     after(grammarAccess.getArtifactAccess().getTypeModelKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:752:6: ( 'tcs-model' )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:752:6: ( 'tcs-model' )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:753:1: 'tcs-model'
                    {
                     before(grammarAccess.getArtifactAccess().getTypeTcsModelKeyword_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__Artifact__TypeAlternatives_01547); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:765:1: rule__OpDef__Alternatives : ( ( ruleEPackageOpDef ) | ( ruleEClassOpDef ) | ( ruleEAttributeOpDef ) | ( ruleEReferenceOpDef ) );
    public final void rule__OpDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:769:1: ( ( ruleEPackageOpDef ) | ( ruleEClassOpDef ) | ( ruleEAttributeOpDef ) | ( ruleEReferenceOpDef ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            case 34:
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
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:770:1: ( ruleEPackageOpDef )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:770:1: ( ruleEPackageOpDef )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:771:1: ruleEPackageOpDef
                    {
                     before(grammarAccess.getOpDefAccess().getEPackageOpDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEPackageOpDef_in_rule__OpDef__Alternatives1581);
                    ruleEPackageOpDef();

                    state._fsp--;

                     after(grammarAccess.getOpDefAccess().getEPackageOpDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:776:6: ( ruleEClassOpDef )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:776:6: ( ruleEClassOpDef )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:777:1: ruleEClassOpDef
                    {
                     before(grammarAccess.getOpDefAccess().getEClassOpDefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEClassOpDef_in_rule__OpDef__Alternatives1598);
                    ruleEClassOpDef();

                    state._fsp--;

                     after(grammarAccess.getOpDefAccess().getEClassOpDefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:782:6: ( ruleEAttributeOpDef )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:782:6: ( ruleEAttributeOpDef )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:783:1: ruleEAttributeOpDef
                    {
                     before(grammarAccess.getOpDefAccess().getEAttributeOpDefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEAttributeOpDef_in_rule__OpDef__Alternatives1615);
                    ruleEAttributeOpDef();

                    state._fsp--;

                     after(grammarAccess.getOpDefAccess().getEAttributeOpDefParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:788:6: ( ruleEReferenceOpDef )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:788:6: ( ruleEReferenceOpDef )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:789:1: ruleEReferenceOpDef
                    {
                     before(grammarAccess.getOpDefAccess().getEReferenceOpDefParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEReferenceOpDef_in_rule__OpDef__Alternatives1632);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:799:1: rule__EPackageOpDef__Alternatives_1_0 : ( ( ( rule__EPackageOpDef__OpAssignment_1_0_0 ) ) | ( ( rule__EPackageOpDef__OpAssignment_1_0_1 ) ) | ( ( rule__EPackageOpDef__OpAssignment_1_0_2 ) ) );
    public final void rule__EPackageOpDef__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:803:1: ( ( ( rule__EPackageOpDef__OpAssignment_1_0_0 ) ) | ( ( rule__EPackageOpDef__OpAssignment_1_0_1 ) ) | ( ( rule__EPackageOpDef__OpAssignment_1_0_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt4=1;
                }
                break;
            case 43:
                {
                alt4=2;
                }
                break;
            case 44:
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
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:804:1: ( ( rule__EPackageOpDef__OpAssignment_1_0_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:804:1: ( ( rule__EPackageOpDef__OpAssignment_1_0_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:805:1: ( rule__EPackageOpDef__OpAssignment_1_0_0 )
                    {
                     before(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:806:1: ( rule__EPackageOpDef__OpAssignment_1_0_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:806:2: rule__EPackageOpDef__OpAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_rule__EPackageOpDef__OpAssignment_1_0_0_in_rule__EPackageOpDef__Alternatives_1_01664);
                    rule__EPackageOpDef__OpAssignment_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:810:6: ( ( rule__EPackageOpDef__OpAssignment_1_0_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:810:6: ( ( rule__EPackageOpDef__OpAssignment_1_0_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:811:1: ( rule__EPackageOpDef__OpAssignment_1_0_1 )
                    {
                     before(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:812:1: ( rule__EPackageOpDef__OpAssignment_1_0_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:812:2: rule__EPackageOpDef__OpAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_rule__EPackageOpDef__OpAssignment_1_0_1_in_rule__EPackageOpDef__Alternatives_1_01682);
                    rule__EPackageOpDef__OpAssignment_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:816:6: ( ( rule__EPackageOpDef__OpAssignment_1_0_2 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:816:6: ( ( rule__EPackageOpDef__OpAssignment_1_0_2 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:817:1: ( rule__EPackageOpDef__OpAssignment_1_0_2 )
                    {
                     before(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_2()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:818:1: ( rule__EPackageOpDef__OpAssignment_1_0_2 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:818:2: rule__EPackageOpDef__OpAssignment_1_0_2
                    {
                    pushFollow(FOLLOW_rule__EPackageOpDef__OpAssignment_1_0_2_in_rule__EPackageOpDef__Alternatives_1_01700);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:827:1: rule__EPackageOpDef__Alternatives_1_8 : ( ( ( rule__EPackageOpDef__SettersAssignment_1_8_0 ) ) | ( ( rule__EPackageOpDef__ClassesAssignment_1_8_1 ) ) );
    public final void rule__EPackageOpDef__Alternatives_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:831:1: ( ( ( rule__EPackageOpDef__SettersAssignment_1_8_0 ) ) | ( ( rule__EPackageOpDef__ClassesAssignment_1_8_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            else if ( (LA5_0==32) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:832:1: ( ( rule__EPackageOpDef__SettersAssignment_1_8_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:832:1: ( ( rule__EPackageOpDef__SettersAssignment_1_8_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:833:1: ( rule__EPackageOpDef__SettersAssignment_1_8_0 )
                    {
                     before(grammarAccess.getEPackageOpDefAccess().getSettersAssignment_1_8_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:834:1: ( rule__EPackageOpDef__SettersAssignment_1_8_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:834:2: rule__EPackageOpDef__SettersAssignment_1_8_0
                    {
                    pushFollow(FOLLOW_rule__EPackageOpDef__SettersAssignment_1_8_0_in_rule__EPackageOpDef__Alternatives_1_81733);
                    rule__EPackageOpDef__SettersAssignment_1_8_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEPackageOpDefAccess().getSettersAssignment_1_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:838:6: ( ( rule__EPackageOpDef__ClassesAssignment_1_8_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:838:6: ( ( rule__EPackageOpDef__ClassesAssignment_1_8_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:839:1: ( rule__EPackageOpDef__ClassesAssignment_1_8_1 )
                    {
                     before(grammarAccess.getEPackageOpDefAccess().getClassesAssignment_1_8_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:840:1: ( rule__EPackageOpDef__ClassesAssignment_1_8_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:840:2: rule__EPackageOpDef__ClassesAssignment_1_8_1
                    {
                    pushFollow(FOLLOW_rule__EPackageOpDef__ClassesAssignment_1_8_1_in_rule__EPackageOpDef__Alternatives_1_81751);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:849:1: rule__EClassOpDef__Alternatives_1_0 : ( ( ( rule__EClassOpDef__OpAssignment_1_0_0 ) ) | ( ( rule__EClassOpDef__OpAssignment_1_0_1 ) ) | ( ( rule__EClassOpDef__OpAssignment_1_0_2 ) ) );
    public final void rule__EClassOpDef__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:853:1: ( ( ( rule__EClassOpDef__OpAssignment_1_0_0 ) ) | ( ( rule__EClassOpDef__OpAssignment_1_0_1 ) ) | ( ( rule__EClassOpDef__OpAssignment_1_0_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt6=1;
                }
                break;
            case 46:
                {
                alt6=2;
                }
                break;
            case 47:
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
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:854:1: ( ( rule__EClassOpDef__OpAssignment_1_0_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:854:1: ( ( rule__EClassOpDef__OpAssignment_1_0_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:855:1: ( rule__EClassOpDef__OpAssignment_1_0_0 )
                    {
                     before(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:856:1: ( rule__EClassOpDef__OpAssignment_1_0_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:856:2: rule__EClassOpDef__OpAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_rule__EClassOpDef__OpAssignment_1_0_0_in_rule__EClassOpDef__Alternatives_1_01784);
                    rule__EClassOpDef__OpAssignment_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:860:6: ( ( rule__EClassOpDef__OpAssignment_1_0_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:860:6: ( ( rule__EClassOpDef__OpAssignment_1_0_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:861:1: ( rule__EClassOpDef__OpAssignment_1_0_1 )
                    {
                     before(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:862:1: ( rule__EClassOpDef__OpAssignment_1_0_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:862:2: rule__EClassOpDef__OpAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_rule__EClassOpDef__OpAssignment_1_0_1_in_rule__EClassOpDef__Alternatives_1_01802);
                    rule__EClassOpDef__OpAssignment_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:866:6: ( ( rule__EClassOpDef__OpAssignment_1_0_2 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:866:6: ( ( rule__EClassOpDef__OpAssignment_1_0_2 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:867:1: ( rule__EClassOpDef__OpAssignment_1_0_2 )
                    {
                     before(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_2()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:868:1: ( rule__EClassOpDef__OpAssignment_1_0_2 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:868:2: rule__EClassOpDef__OpAssignment_1_0_2
                    {
                    pushFollow(FOLLOW_rule__EClassOpDef__OpAssignment_1_0_2_in_rule__EClassOpDef__Alternatives_1_01820);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:877:1: rule__EClassOpDef__Alternatives_1_7_1 : ( ( ( rule__EClassOpDef__SettersAssignment_1_7_1_0 ) ) | ( ( rule__EClassOpDef__AttributesAssignment_1_7_1_1 ) ) | ( ( rule__EClassOpDef__ReferencesAssignment_1_7_1_2 ) ) );
    public final void rule__EClassOpDef__Alternatives_1_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:881:1: ( ( ( rule__EClassOpDef__SettersAssignment_1_7_1_0 ) ) | ( ( rule__EClassOpDef__AttributesAssignment_1_7_1_1 ) ) | ( ( rule__EClassOpDef__ReferencesAssignment_1_7_1_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt7=1;
                }
                break;
            case 33:
                {
                alt7=2;
                }
                break;
            case 34:
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
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:882:1: ( ( rule__EClassOpDef__SettersAssignment_1_7_1_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:882:1: ( ( rule__EClassOpDef__SettersAssignment_1_7_1_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:883:1: ( rule__EClassOpDef__SettersAssignment_1_7_1_0 )
                    {
                     before(grammarAccess.getEClassOpDefAccess().getSettersAssignment_1_7_1_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:884:1: ( rule__EClassOpDef__SettersAssignment_1_7_1_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:884:2: rule__EClassOpDef__SettersAssignment_1_7_1_0
                    {
                    pushFollow(FOLLOW_rule__EClassOpDef__SettersAssignment_1_7_1_0_in_rule__EClassOpDef__Alternatives_1_7_11853);
                    rule__EClassOpDef__SettersAssignment_1_7_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEClassOpDefAccess().getSettersAssignment_1_7_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:888:6: ( ( rule__EClassOpDef__AttributesAssignment_1_7_1_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:888:6: ( ( rule__EClassOpDef__AttributesAssignment_1_7_1_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:889:1: ( rule__EClassOpDef__AttributesAssignment_1_7_1_1 )
                    {
                     before(grammarAccess.getEClassOpDefAccess().getAttributesAssignment_1_7_1_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:890:1: ( rule__EClassOpDef__AttributesAssignment_1_7_1_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:890:2: rule__EClassOpDef__AttributesAssignment_1_7_1_1
                    {
                    pushFollow(FOLLOW_rule__EClassOpDef__AttributesAssignment_1_7_1_1_in_rule__EClassOpDef__Alternatives_1_7_11871);
                    rule__EClassOpDef__AttributesAssignment_1_7_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEClassOpDefAccess().getAttributesAssignment_1_7_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:894:6: ( ( rule__EClassOpDef__ReferencesAssignment_1_7_1_2 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:894:6: ( ( rule__EClassOpDef__ReferencesAssignment_1_7_1_2 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:895:1: ( rule__EClassOpDef__ReferencesAssignment_1_7_1_2 )
                    {
                     before(grammarAccess.getEClassOpDefAccess().getReferencesAssignment_1_7_1_2()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:896:1: ( rule__EClassOpDef__ReferencesAssignment_1_7_1_2 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:896:2: rule__EClassOpDef__ReferencesAssignment_1_7_1_2
                    {
                    pushFollow(FOLLOW_rule__EClassOpDef__ReferencesAssignment_1_7_1_2_in_rule__EClassOpDef__Alternatives_1_7_11889);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:905:1: rule__EAttributeOpDef__Alternatives_1_0_0 : ( ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_0 ) ) | ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_1 ) ) | ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_2 ) ) );
    public final void rule__EAttributeOpDef__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:909:1: ( ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_0 ) ) | ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_1 ) ) | ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt8=1;
                }
                break;
            case 49:
                {
                alt8=2;
                }
                break;
            case 50:
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
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:910:1: ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:910:1: ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:911:1: ( rule__EAttributeOpDef__OpAssignment_1_0_0_0 )
                    {
                     before(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:912:1: ( rule__EAttributeOpDef__OpAssignment_1_0_0_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:912:2: rule__EAttributeOpDef__OpAssignment_1_0_0_0
                    {
                    pushFollow(FOLLOW_rule__EAttributeOpDef__OpAssignment_1_0_0_0_in_rule__EAttributeOpDef__Alternatives_1_0_01922);
                    rule__EAttributeOpDef__OpAssignment_1_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:916:6: ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:916:6: ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:917:1: ( rule__EAttributeOpDef__OpAssignment_1_0_0_1 )
                    {
                     before(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:918:1: ( rule__EAttributeOpDef__OpAssignment_1_0_0_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:918:2: rule__EAttributeOpDef__OpAssignment_1_0_0_1
                    {
                    pushFollow(FOLLOW_rule__EAttributeOpDef__OpAssignment_1_0_0_1_in_rule__EAttributeOpDef__Alternatives_1_0_01940);
                    rule__EAttributeOpDef__OpAssignment_1_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:922:6: ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_2 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:922:6: ( ( rule__EAttributeOpDef__OpAssignment_1_0_0_2 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:923:1: ( rule__EAttributeOpDef__OpAssignment_1_0_0_2 )
                    {
                     before(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_2()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:924:1: ( rule__EAttributeOpDef__OpAssignment_1_0_0_2 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:924:2: rule__EAttributeOpDef__OpAssignment_1_0_0_2
                    {
                    pushFollow(FOLLOW_rule__EAttributeOpDef__OpAssignment_1_0_0_2_in_rule__EAttributeOpDef__Alternatives_1_0_01958);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:933:1: rule__EAttributeOpDef__Alternatives_1_3 : ( ( ( rule__EAttributeOpDef__Group_1_3_0__0 ) ) | ( ';' ) );
    public final void rule__EAttributeOpDef__Alternatives_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:937:1: ( ( ( rule__EAttributeOpDef__Group_1_3_0__0 ) ) | ( ';' ) )
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
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:938:1: ( ( rule__EAttributeOpDef__Group_1_3_0__0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:938:1: ( ( rule__EAttributeOpDef__Group_1_3_0__0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:939:1: ( rule__EAttributeOpDef__Group_1_3_0__0 )
                    {
                     before(grammarAccess.getEAttributeOpDefAccess().getGroup_1_3_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:940:1: ( rule__EAttributeOpDef__Group_1_3_0__0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:940:2: rule__EAttributeOpDef__Group_1_3_0__0
                    {
                    pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_3_0__0_in_rule__EAttributeOpDef__Alternatives_1_31991);
                    rule__EAttributeOpDef__Group_1_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEAttributeOpDefAccess().getGroup_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:944:6: ( ';' )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:944:6: ( ';' )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:945:1: ';'
                    {
                     before(grammarAccess.getEAttributeOpDefAccess().getSemicolonKeyword_1_3_1()); 
                    match(input,14,FOLLOW_14_in_rule__EAttributeOpDef__Alternatives_1_32010); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:957:1: rule__EReferenceOpDef__Alternatives_1_0_0 : ( ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_0 ) ) | ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_1 ) ) | ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_2 ) ) );
    public final void rule__EReferenceOpDef__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:961:1: ( ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_0 ) ) | ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_1 ) ) | ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_2 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt10=1;
                }
                break;
            case 52:
                {
                alt10=2;
                }
                break;
            case 53:
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
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:962:1: ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:962:1: ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:963:1: ( rule__EReferenceOpDef__OpAssignment_1_0_0_0 )
                    {
                     before(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:964:1: ( rule__EReferenceOpDef__OpAssignment_1_0_0_0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:964:2: rule__EReferenceOpDef__OpAssignment_1_0_0_0
                    {
                    pushFollow(FOLLOW_rule__EReferenceOpDef__OpAssignment_1_0_0_0_in_rule__EReferenceOpDef__Alternatives_1_0_02044);
                    rule__EReferenceOpDef__OpAssignment_1_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:968:6: ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_1 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:968:6: ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_1 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:969:1: ( rule__EReferenceOpDef__OpAssignment_1_0_0_1 )
                    {
                     before(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_1()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:970:1: ( rule__EReferenceOpDef__OpAssignment_1_0_0_1 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:970:2: rule__EReferenceOpDef__OpAssignment_1_0_0_1
                    {
                    pushFollow(FOLLOW_rule__EReferenceOpDef__OpAssignment_1_0_0_1_in_rule__EReferenceOpDef__Alternatives_1_0_02062);
                    rule__EReferenceOpDef__OpAssignment_1_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:974:6: ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_2 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:974:6: ( ( rule__EReferenceOpDef__OpAssignment_1_0_0_2 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:975:1: ( rule__EReferenceOpDef__OpAssignment_1_0_0_2 )
                    {
                     before(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_2()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:976:1: ( rule__EReferenceOpDef__OpAssignment_1_0_0_2 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:976:2: rule__EReferenceOpDef__OpAssignment_1_0_0_2
                    {
                    pushFollow(FOLLOW_rule__EReferenceOpDef__OpAssignment_1_0_0_2_in_rule__EReferenceOpDef__Alternatives_1_0_02080);
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


    // $ANTLR start "rule__Migrator__Alternatives"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:985:1: rule__Migrator__Alternatives : ( ( ruleMigratorSX ) | ( ruleMigratorDX ) );
    public final void rule__Migrator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:989:1: ( ( ruleMigratorSX ) | ( ruleMigratorDX ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==20) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==RULE_ID) ) {
                        int LA11_4 = input.LA(4);

                        if ( (LA11_4==31) ) {
                            alt11=1;
                        }
                        else if ( (LA11_4==25) ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
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
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:990:1: ( ruleMigratorSX )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:990:1: ( ruleMigratorSX )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:991:1: ruleMigratorSX
                    {
                     before(grammarAccess.getMigratorAccess().getMigratorSXParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMigratorSX_in_rule__Migrator__Alternatives2113);
                    ruleMigratorSX();

                    state._fsp--;

                     after(grammarAccess.getMigratorAccess().getMigratorSXParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:996:6: ( ruleMigratorDX )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:996:6: ( ruleMigratorDX )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:997:1: ruleMigratorDX
                    {
                     before(grammarAccess.getMigratorAccess().getMigratorDXParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMigratorDX_in_rule__Migrator__Alternatives2130);
                    ruleMigratorDX();

                    state._fsp--;

                     after(grammarAccess.getMigratorAccess().getMigratorDXParserRuleCall_1()); 

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
    // $ANTLR end "rule__Migrator__Alternatives"


    // $ANTLR start "rule__MigratorDX__Alternatives"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1007:1: rule__MigratorDX__Alternatives : ( ( ( rule__MigratorDX__Group_0__0 ) ) | ( 'null' ) );
    public final void rule__MigratorDX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1011:1: ( ( ( rule__MigratorDX__Group_0__0 ) ) | ( 'null' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1012:1: ( ( rule__MigratorDX__Group_0__0 ) )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1012:1: ( ( rule__MigratorDX__Group_0__0 ) )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1013:1: ( rule__MigratorDX__Group_0__0 )
                    {
                     before(grammarAccess.getMigratorDXAccess().getGroup_0()); 
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1014:1: ( rule__MigratorDX__Group_0__0 )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1014:2: rule__MigratorDX__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__MigratorDX__Group_0__0_in_rule__MigratorDX__Alternatives2162);
                    rule__MigratorDX__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMigratorDXAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1018:6: ( 'null' )
                    {
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1018:6: ( 'null' )
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1019:1: 'null'
                    {
                     before(grammarAccess.getMigratorDXAccess().getNullKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__MigratorDX__Alternatives2181); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1034:1: rule__MigrationLibrary__Group__0 : rule__MigrationLibrary__Group__0__Impl rule__MigrationLibrary__Group__1 ;
    public final void rule__MigrationLibrary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1038:1: ( rule__MigrationLibrary__Group__0__Impl rule__MigrationLibrary__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1039:2: rule__MigrationLibrary__Group__0__Impl rule__MigrationLibrary__Group__1
            {
            pushFollow(FOLLOW_rule__MigrationLibrary__Group__0__Impl_in_rule__MigrationLibrary__Group__02214);
            rule__MigrationLibrary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationLibrary__Group__1_in_rule__MigrationLibrary__Group__02217);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1046:1: rule__MigrationLibrary__Group__0__Impl : ( 'Library' ) ;
    public final void rule__MigrationLibrary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1050:1: ( ( 'Library' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1051:1: ( 'Library' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1051:1: ( 'Library' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1052:1: 'Library'
            {
             before(grammarAccess.getMigrationLibraryAccess().getLibraryKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__MigrationLibrary__Group__0__Impl2245); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1065:1: rule__MigrationLibrary__Group__1 : rule__MigrationLibrary__Group__1__Impl rule__MigrationLibrary__Group__2 ;
    public final void rule__MigrationLibrary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1069:1: ( rule__MigrationLibrary__Group__1__Impl rule__MigrationLibrary__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1070:2: rule__MigrationLibrary__Group__1__Impl rule__MigrationLibrary__Group__2
            {
            pushFollow(FOLLOW_rule__MigrationLibrary__Group__1__Impl_in_rule__MigrationLibrary__Group__12276);
            rule__MigrationLibrary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationLibrary__Group__2_in_rule__MigrationLibrary__Group__12279);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1077:1: rule__MigrationLibrary__Group__1__Impl : ( ( rule__MigrationLibrary__NameAssignment_1 ) ) ;
    public final void rule__MigrationLibrary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1081:1: ( ( ( rule__MigrationLibrary__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1082:1: ( ( rule__MigrationLibrary__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1082:1: ( ( rule__MigrationLibrary__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1083:1: ( rule__MigrationLibrary__NameAssignment_1 )
            {
             before(grammarAccess.getMigrationLibraryAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1084:1: ( rule__MigrationLibrary__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1084:2: rule__MigrationLibrary__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MigrationLibrary__NameAssignment_1_in_rule__MigrationLibrary__Group__1__Impl2306);
            rule__MigrationLibrary__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMigrationLibraryAccess().getNameAssignment_1()); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1094:1: rule__MigrationLibrary__Group__2 : rule__MigrationLibrary__Group__2__Impl rule__MigrationLibrary__Group__3 ;
    public final void rule__MigrationLibrary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1098:1: ( rule__MigrationLibrary__Group__2__Impl rule__MigrationLibrary__Group__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1099:2: rule__MigrationLibrary__Group__2__Impl rule__MigrationLibrary__Group__3
            {
            pushFollow(FOLLOW_rule__MigrationLibrary__Group__2__Impl_in_rule__MigrationLibrary__Group__22336);
            rule__MigrationLibrary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationLibrary__Group__3_in_rule__MigrationLibrary__Group__22339);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1106:1: rule__MigrationLibrary__Group__2__Impl : ( '{' ) ;
    public final void rule__MigrationLibrary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1110:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1111:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1111:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1112:1: '{'
            {
             before(grammarAccess.getMigrationLibraryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__MigrationLibrary__Group__2__Impl2367); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1125:1: rule__MigrationLibrary__Group__3 : rule__MigrationLibrary__Group__3__Impl rule__MigrationLibrary__Group__4 ;
    public final void rule__MigrationLibrary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1129:1: ( rule__MigrationLibrary__Group__3__Impl rule__MigrationLibrary__Group__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1130:2: rule__MigrationLibrary__Group__3__Impl rule__MigrationLibrary__Group__4
            {
            pushFollow(FOLLOW_rule__MigrationLibrary__Group__3__Impl_in_rule__MigrationLibrary__Group__32398);
            rule__MigrationLibrary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationLibrary__Group__4_in_rule__MigrationLibrary__Group__32401);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1137:1: rule__MigrationLibrary__Group__3__Impl : ( ( rule__MigrationLibrary__RulesAssignment_3 )* ) ;
    public final void rule__MigrationLibrary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1141:1: ( ( ( rule__MigrationLibrary__RulesAssignment_3 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1142:1: ( ( rule__MigrationLibrary__RulesAssignment_3 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1142:1: ( ( rule__MigrationLibrary__RulesAssignment_3 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1143:1: ( rule__MigrationLibrary__RulesAssignment_3 )*
            {
             before(grammarAccess.getMigrationLibraryAccess().getRulesAssignment_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1144:1: ( rule__MigrationLibrary__RulesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1144:2: rule__MigrationLibrary__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__MigrationLibrary__RulesAssignment_3_in_rule__MigrationLibrary__Group__3__Impl2428);
            	    rule__MigrationLibrary__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1154:1: rule__MigrationLibrary__Group__4 : rule__MigrationLibrary__Group__4__Impl ;
    public final void rule__MigrationLibrary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1158:1: ( rule__MigrationLibrary__Group__4__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1159:2: rule__MigrationLibrary__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MigrationLibrary__Group__4__Impl_in_rule__MigrationLibrary__Group__42459);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1165:1: rule__MigrationLibrary__Group__4__Impl : ( '}' ) ;
    public final void rule__MigrationLibrary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1169:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1170:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1170:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1171:1: '}'
            {
             before(grammarAccess.getMigrationLibraryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__MigrationLibrary__Group__4__Impl2487); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1195:1: rule__MigrationProgram__Group__0 : rule__MigrationProgram__Group__0__Impl rule__MigrationProgram__Group__1 ;
    public final void rule__MigrationProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1199:1: ( rule__MigrationProgram__Group__0__Impl rule__MigrationProgram__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1200:2: rule__MigrationProgram__Group__0__Impl rule__MigrationProgram__Group__1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__0__Impl_in_rule__MigrationProgram__Group__02529);
            rule__MigrationProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__1_in_rule__MigrationProgram__Group__02532);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1207:1: rule__MigrationProgram__Group__0__Impl : ( 'Migration' ) ;
    public final void rule__MigrationProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1211:1: ( ( 'Migration' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1212:1: ( 'Migration' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1212:1: ( 'Migration' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1213:1: 'Migration'
            {
             before(grammarAccess.getMigrationProgramAccess().getMigrationKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__MigrationProgram__Group__0__Impl2560); 
             after(grammarAccess.getMigrationProgramAccess().getMigrationKeyword_0()); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1226:1: rule__MigrationProgram__Group__1 : rule__MigrationProgram__Group__1__Impl rule__MigrationProgram__Group__2 ;
    public final void rule__MigrationProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1230:1: ( rule__MigrationProgram__Group__1__Impl rule__MigrationProgram__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1231:2: rule__MigrationProgram__Group__1__Impl rule__MigrationProgram__Group__2
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__1__Impl_in_rule__MigrationProgram__Group__12591);
            rule__MigrationProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__2_in_rule__MigrationProgram__Group__12594);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1238:1: rule__MigrationProgram__Group__1__Impl : ( ( rule__MigrationProgram__NameAssignment_1 ) ) ;
    public final void rule__MigrationProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1242:1: ( ( ( rule__MigrationProgram__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1243:1: ( ( rule__MigrationProgram__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1243:1: ( ( rule__MigrationProgram__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1244:1: ( rule__MigrationProgram__NameAssignment_1 )
            {
             before(grammarAccess.getMigrationProgramAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1245:1: ( rule__MigrationProgram__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1245:2: rule__MigrationProgram__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__NameAssignment_1_in_rule__MigrationProgram__Group__1__Impl2621);
            rule__MigrationProgram__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getNameAssignment_1()); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1255:1: rule__MigrationProgram__Group__2 : rule__MigrationProgram__Group__2__Impl rule__MigrationProgram__Group__3 ;
    public final void rule__MigrationProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1259:1: ( rule__MigrationProgram__Group__2__Impl rule__MigrationProgram__Group__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1260:2: rule__MigrationProgram__Group__2__Impl rule__MigrationProgram__Group__3
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__2__Impl_in_rule__MigrationProgram__Group__22651);
            rule__MigrationProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__3_in_rule__MigrationProgram__Group__22654);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1267:1: rule__MigrationProgram__Group__2__Impl : ( ';' ) ;
    public final void rule__MigrationProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1271:1: ( ( ';' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1272:1: ( ';' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1272:1: ( ';' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1273:1: ';'
            {
             before(grammarAccess.getMigrationProgramAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__MigrationProgram__Group__2__Impl2682); 
             after(grammarAccess.getMigrationProgramAccess().getSemicolonKeyword_2()); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1286:1: rule__MigrationProgram__Group__3 : rule__MigrationProgram__Group__3__Impl rule__MigrationProgram__Group__4 ;
    public final void rule__MigrationProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1290:1: ( rule__MigrationProgram__Group__3__Impl rule__MigrationProgram__Group__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1291:2: rule__MigrationProgram__Group__3__Impl rule__MigrationProgram__Group__4
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__3__Impl_in_rule__MigrationProgram__Group__32713);
            rule__MigrationProgram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__4_in_rule__MigrationProgram__Group__32716);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1298:1: rule__MigrationProgram__Group__3__Impl : ( ( rule__MigrationProgram__Group_3__0 )* ) ;
    public final void rule__MigrationProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1302:1: ( ( ( rule__MigrationProgram__Group_3__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1303:1: ( ( rule__MigrationProgram__Group_3__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1303:1: ( ( rule__MigrationProgram__Group_3__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1304:1: ( rule__MigrationProgram__Group_3__0 )*
            {
             before(grammarAccess.getMigrationProgramAccess().getGroup_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1305:1: ( rule__MigrationProgram__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1305:2: rule__MigrationProgram__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__MigrationProgram__Group_3__0_in_rule__MigrationProgram__Group__3__Impl2743);
            	    rule__MigrationProgram__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMigrationProgramAccess().getGroup_3()); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1315:1: rule__MigrationProgram__Group__4 : rule__MigrationProgram__Group__4__Impl rule__MigrationProgram__Group__5 ;
    public final void rule__MigrationProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1319:1: ( rule__MigrationProgram__Group__4__Impl rule__MigrationProgram__Group__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1320:2: rule__MigrationProgram__Group__4__Impl rule__MigrationProgram__Group__5
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__4__Impl_in_rule__MigrationProgram__Group__42774);
            rule__MigrationProgram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__5_in_rule__MigrationProgram__Group__42777);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1327:1: rule__MigrationProgram__Group__4__Impl : ( ( rule__MigrationProgram__MigrAssignment_4 ) ) ;
    public final void rule__MigrationProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1331:1: ( ( ( rule__MigrationProgram__MigrAssignment_4 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1332:1: ( ( rule__MigrationProgram__MigrAssignment_4 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1332:1: ( ( rule__MigrationProgram__MigrAssignment_4 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1333:1: ( rule__MigrationProgram__MigrAssignment_4 )
            {
             before(grammarAccess.getMigrationProgramAccess().getMigrAssignment_4()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1334:1: ( rule__MigrationProgram__MigrAssignment_4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1334:2: rule__MigrationProgram__MigrAssignment_4
            {
            pushFollow(FOLLOW_rule__MigrationProgram__MigrAssignment_4_in_rule__MigrationProgram__Group__4__Impl2804);
            rule__MigrationProgram__MigrAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getMigrAssignment_4()); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1344:1: rule__MigrationProgram__Group__5 : rule__MigrationProgram__Group__5__Impl rule__MigrationProgram__Group__6 ;
    public final void rule__MigrationProgram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1348:1: ( rule__MigrationProgram__Group__5__Impl rule__MigrationProgram__Group__6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1349:2: rule__MigrationProgram__Group__5__Impl rule__MigrationProgram__Group__6
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__5__Impl_in_rule__MigrationProgram__Group__52834);
            rule__MigrationProgram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__6_in_rule__MigrationProgram__Group__52837);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1356:1: rule__MigrationProgram__Group__5__Impl : ( ( rule__MigrationProgram__TypeArtAssignment_5 ) ) ;
    public final void rule__MigrationProgram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1360:1: ( ( ( rule__MigrationProgram__TypeArtAssignment_5 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1361:1: ( ( rule__MigrationProgram__TypeArtAssignment_5 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1361:1: ( ( rule__MigrationProgram__TypeArtAssignment_5 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1362:1: ( rule__MigrationProgram__TypeArtAssignment_5 )
            {
             before(grammarAccess.getMigrationProgramAccess().getTypeArtAssignment_5()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1363:1: ( rule__MigrationProgram__TypeArtAssignment_5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1363:2: rule__MigrationProgram__TypeArtAssignment_5
            {
            pushFollow(FOLLOW_rule__MigrationProgram__TypeArtAssignment_5_in_rule__MigrationProgram__Group__5__Impl2864);
            rule__MigrationProgram__TypeArtAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getTypeArtAssignment_5()); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1373:1: rule__MigrationProgram__Group__6 : rule__MigrationProgram__Group__6__Impl rule__MigrationProgram__Group__7 ;
    public final void rule__MigrationProgram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1377:1: ( rule__MigrationProgram__Group__6__Impl rule__MigrationProgram__Group__7 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1378:2: rule__MigrationProgram__Group__6__Impl rule__MigrationProgram__Group__7
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__6__Impl_in_rule__MigrationProgram__Group__62894);
            rule__MigrationProgram__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__7_in_rule__MigrationProgram__Group__62897);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1385:1: rule__MigrationProgram__Group__6__Impl : ( ( rule__MigrationProgram__ArtifactAssignment_6 ) ) ;
    public final void rule__MigrationProgram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1389:1: ( ( ( rule__MigrationProgram__ArtifactAssignment_6 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1390:1: ( ( rule__MigrationProgram__ArtifactAssignment_6 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1390:1: ( ( rule__MigrationProgram__ArtifactAssignment_6 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1391:1: ( rule__MigrationProgram__ArtifactAssignment_6 )
            {
             before(grammarAccess.getMigrationProgramAccess().getArtifactAssignment_6()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1392:1: ( rule__MigrationProgram__ArtifactAssignment_6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1392:2: rule__MigrationProgram__ArtifactAssignment_6
            {
            pushFollow(FOLLOW_rule__MigrationProgram__ArtifactAssignment_6_in_rule__MigrationProgram__Group__6__Impl2924);
            rule__MigrationProgram__ArtifactAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getArtifactAssignment_6()); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1402:1: rule__MigrationProgram__Group__7 : rule__MigrationProgram__Group__7__Impl rule__MigrationProgram__Group__8 ;
    public final void rule__MigrationProgram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1406:1: ( rule__MigrationProgram__Group__7__Impl rule__MigrationProgram__Group__8 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1407:2: rule__MigrationProgram__Group__7__Impl rule__MigrationProgram__Group__8
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__7__Impl_in_rule__MigrationProgram__Group__72954);
            rule__MigrationProgram__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__8_in_rule__MigrationProgram__Group__72957);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1414:1: rule__MigrationProgram__Group__7__Impl : ( ':' ) ;
    public final void rule__MigrationProgram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1418:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1419:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1419:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1420:1: ':'
            {
             before(grammarAccess.getMigrationProgramAccess().getColonKeyword_7()); 
            match(input,20,FOLLOW_20_in_rule__MigrationProgram__Group__7__Impl2985); 
             after(grammarAccess.getMigrationProgramAccess().getColonKeyword_7()); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1433:1: rule__MigrationProgram__Group__8 : rule__MigrationProgram__Group__8__Impl rule__MigrationProgram__Group__9 ;
    public final void rule__MigrationProgram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1437:1: ( rule__MigrationProgram__Group__8__Impl rule__MigrationProgram__Group__9 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1438:2: rule__MigrationProgram__Group__8__Impl rule__MigrationProgram__Group__9
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__8__Impl_in_rule__MigrationProgram__Group__83016);
            rule__MigrationProgram__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__9_in_rule__MigrationProgram__Group__83019);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1445:1: rule__MigrationProgram__Group__8__Impl : ( ( rule__MigrationProgram__Group_8__0 ) ) ;
    public final void rule__MigrationProgram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1449:1: ( ( ( rule__MigrationProgram__Group_8__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1450:1: ( ( rule__MigrationProgram__Group_8__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1450:1: ( ( rule__MigrationProgram__Group_8__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1451:1: ( rule__MigrationProgram__Group_8__0 )
            {
             before(grammarAccess.getMigrationProgramAccess().getGroup_8()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1452:1: ( rule__MigrationProgram__Group_8__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1452:2: rule__MigrationProgram__Group_8__0
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_8__0_in_rule__MigrationProgram__Group__8__Impl3046);
            rule__MigrationProgram__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getGroup_8()); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1462:1: rule__MigrationProgram__Group__9 : rule__MigrationProgram__Group__9__Impl rule__MigrationProgram__Group__10 ;
    public final void rule__MigrationProgram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1466:1: ( rule__MigrationProgram__Group__9__Impl rule__MigrationProgram__Group__10 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1467:2: rule__MigrationProgram__Group__9__Impl rule__MigrationProgram__Group__10
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__9__Impl_in_rule__MigrationProgram__Group__93076);
            rule__MigrationProgram__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__10_in_rule__MigrationProgram__Group__93079);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1474:1: rule__MigrationProgram__Group__9__Impl : ( 'with' ) ;
    public final void rule__MigrationProgram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1478:1: ( ( 'with' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1479:1: ( 'with' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1479:1: ( 'with' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1480:1: 'with'
            {
             before(grammarAccess.getMigrationProgramAccess().getWithKeyword_9()); 
            match(input,21,FOLLOW_21_in_rule__MigrationProgram__Group__9__Impl3107); 
             after(grammarAccess.getMigrationProgramAccess().getWithKeyword_9()); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1493:1: rule__MigrationProgram__Group__10 : rule__MigrationProgram__Group__10__Impl rule__MigrationProgram__Group__11 ;
    public final void rule__MigrationProgram__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1497:1: ( rule__MigrationProgram__Group__10__Impl rule__MigrationProgram__Group__11 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1498:2: rule__MigrationProgram__Group__10__Impl rule__MigrationProgram__Group__11
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__10__Impl_in_rule__MigrationProgram__Group__103138);
            rule__MigrationProgram__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__11_in_rule__MigrationProgram__Group__103141);
            rule__MigrationProgram__Group__11();

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1505:1: rule__MigrationProgram__Group__10__Impl : ( ( rule__MigrationProgram__DeltaAssignment_10 ) ) ;
    public final void rule__MigrationProgram__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1509:1: ( ( ( rule__MigrationProgram__DeltaAssignment_10 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1510:1: ( ( rule__MigrationProgram__DeltaAssignment_10 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1510:1: ( ( rule__MigrationProgram__DeltaAssignment_10 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1511:1: ( rule__MigrationProgram__DeltaAssignment_10 )
            {
             before(grammarAccess.getMigrationProgramAccess().getDeltaAssignment_10()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1512:1: ( rule__MigrationProgram__DeltaAssignment_10 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1512:2: rule__MigrationProgram__DeltaAssignment_10
            {
            pushFollow(FOLLOW_rule__MigrationProgram__DeltaAssignment_10_in_rule__MigrationProgram__Group__10__Impl3168);
            rule__MigrationProgram__DeltaAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getDeltaAssignment_10()); 

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


    // $ANTLR start "rule__MigrationProgram__Group__11"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1522:1: rule__MigrationProgram__Group__11 : rule__MigrationProgram__Group__11__Impl rule__MigrationProgram__Group__12 ;
    public final void rule__MigrationProgram__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1526:1: ( rule__MigrationProgram__Group__11__Impl rule__MigrationProgram__Group__12 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1527:2: rule__MigrationProgram__Group__11__Impl rule__MigrationProgram__Group__12
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__11__Impl_in_rule__MigrationProgram__Group__113198);
            rule__MigrationProgram__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__12_in_rule__MigrationProgram__Group__113201);
            rule__MigrationProgram__Group__12();

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
    // $ANTLR end "rule__MigrationProgram__Group__11"


    // $ANTLR start "rule__MigrationProgram__Group__11__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1534:1: rule__MigrationProgram__Group__11__Impl : ( '{' ) ;
    public final void rule__MigrationProgram__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1538:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1539:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1539:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1540:1: '{'
            {
             before(grammarAccess.getMigrationProgramAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,17,FOLLOW_17_in_rule__MigrationProgram__Group__11__Impl3229); 
             after(grammarAccess.getMigrationProgramAccess().getLeftCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__MigrationProgram__Group__11__Impl"


    // $ANTLR start "rule__MigrationProgram__Group__12"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1553:1: rule__MigrationProgram__Group__12 : rule__MigrationProgram__Group__12__Impl rule__MigrationProgram__Group__13 ;
    public final void rule__MigrationProgram__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1557:1: ( rule__MigrationProgram__Group__12__Impl rule__MigrationProgram__Group__13 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1558:2: rule__MigrationProgram__Group__12__Impl rule__MigrationProgram__Group__13
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__12__Impl_in_rule__MigrationProgram__Group__123260);
            rule__MigrationProgram__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group__13_in_rule__MigrationProgram__Group__123263);
            rule__MigrationProgram__Group__13();

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
    // $ANTLR end "rule__MigrationProgram__Group__12"


    // $ANTLR start "rule__MigrationProgram__Group__12__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1565:1: rule__MigrationProgram__Group__12__Impl : ( ( rule__MigrationProgram__RulesAssignment_12 )* ) ;
    public final void rule__MigrationProgram__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1569:1: ( ( ( rule__MigrationProgram__RulesAssignment_12 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1570:1: ( ( rule__MigrationProgram__RulesAssignment_12 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1570:1: ( ( rule__MigrationProgram__RulesAssignment_12 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1571:1: ( rule__MigrationProgram__RulesAssignment_12 )*
            {
             before(grammarAccess.getMigrationProgramAccess().getRulesAssignment_12()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1572:1: ( rule__MigrationProgram__RulesAssignment_12 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1572:2: rule__MigrationProgram__RulesAssignment_12
            	    {
            	    pushFollow(FOLLOW_rule__MigrationProgram__RulesAssignment_12_in_rule__MigrationProgram__Group__12__Impl3290);
            	    rule__MigrationProgram__RulesAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMigrationProgramAccess().getRulesAssignment_12()); 

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
    // $ANTLR end "rule__MigrationProgram__Group__12__Impl"


    // $ANTLR start "rule__MigrationProgram__Group__13"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1582:1: rule__MigrationProgram__Group__13 : rule__MigrationProgram__Group__13__Impl ;
    public final void rule__MigrationProgram__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1586:1: ( rule__MigrationProgram__Group__13__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1587:2: rule__MigrationProgram__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group__13__Impl_in_rule__MigrationProgram__Group__133321);
            rule__MigrationProgram__Group__13__Impl();

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
    // $ANTLR end "rule__MigrationProgram__Group__13"


    // $ANTLR start "rule__MigrationProgram__Group__13__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1593:1: rule__MigrationProgram__Group__13__Impl : ( '}' ) ;
    public final void rule__MigrationProgram__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1597:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1598:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1598:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1599:1: '}'
            {
             before(grammarAccess.getMigrationProgramAccess().getRightCurlyBracketKeyword_13()); 
            match(input,18,FOLLOW_18_in_rule__MigrationProgram__Group__13__Impl3349); 
             after(grammarAccess.getMigrationProgramAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__MigrationProgram__Group__13__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_3__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1640:1: rule__MigrationProgram__Group_3__0 : rule__MigrationProgram__Group_3__0__Impl rule__MigrationProgram__Group_3__1 ;
    public final void rule__MigrationProgram__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1644:1: ( rule__MigrationProgram__Group_3__0__Impl rule__MigrationProgram__Group_3__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1645:2: rule__MigrationProgram__Group_3__0__Impl rule__MigrationProgram__Group_3__1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_3__0__Impl_in_rule__MigrationProgram__Group_3__03408);
            rule__MigrationProgram__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group_3__1_in_rule__MigrationProgram__Group_3__03411);
            rule__MigrationProgram__Group_3__1();

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
    // $ANTLR end "rule__MigrationProgram__Group_3__0"


    // $ANTLR start "rule__MigrationProgram__Group_3__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1652:1: rule__MigrationProgram__Group_3__0__Impl : ( 'include' ) ;
    public final void rule__MigrationProgram__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1656:1: ( ( 'include' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1657:1: ( 'include' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1657:1: ( 'include' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1658:1: 'include'
            {
             before(grammarAccess.getMigrationProgramAccess().getIncludeKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__MigrationProgram__Group_3__0__Impl3439); 
             after(grammarAccess.getMigrationProgramAccess().getIncludeKeyword_3_0()); 

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
    // $ANTLR end "rule__MigrationProgram__Group_3__0__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_3__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1671:1: rule__MigrationProgram__Group_3__1 : rule__MigrationProgram__Group_3__1__Impl rule__MigrationProgram__Group_3__2 ;
    public final void rule__MigrationProgram__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1675:1: ( rule__MigrationProgram__Group_3__1__Impl rule__MigrationProgram__Group_3__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1676:2: rule__MigrationProgram__Group_3__1__Impl rule__MigrationProgram__Group_3__2
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_3__1__Impl_in_rule__MigrationProgram__Group_3__13470);
            rule__MigrationProgram__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group_3__2_in_rule__MigrationProgram__Group_3__13473);
            rule__MigrationProgram__Group_3__2();

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
    // $ANTLR end "rule__MigrationProgram__Group_3__1"


    // $ANTLR start "rule__MigrationProgram__Group_3__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1683:1: rule__MigrationProgram__Group_3__1__Impl : ( ( rule__MigrationProgram__LibsAssignment_3_1 ) ) ;
    public final void rule__MigrationProgram__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1687:1: ( ( ( rule__MigrationProgram__LibsAssignment_3_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1688:1: ( ( rule__MigrationProgram__LibsAssignment_3_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1688:1: ( ( rule__MigrationProgram__LibsAssignment_3_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1689:1: ( rule__MigrationProgram__LibsAssignment_3_1 )
            {
             before(grammarAccess.getMigrationProgramAccess().getLibsAssignment_3_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1690:1: ( rule__MigrationProgram__LibsAssignment_3_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1690:2: rule__MigrationProgram__LibsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__LibsAssignment_3_1_in_rule__MigrationProgram__Group_3__1__Impl3500);
            rule__MigrationProgram__LibsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getLibsAssignment_3_1()); 

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
    // $ANTLR end "rule__MigrationProgram__Group_3__1__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_3__2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1700:1: rule__MigrationProgram__Group_3__2 : rule__MigrationProgram__Group_3__2__Impl ;
    public final void rule__MigrationProgram__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1704:1: ( rule__MigrationProgram__Group_3__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1705:2: rule__MigrationProgram__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_3__2__Impl_in_rule__MigrationProgram__Group_3__23530);
            rule__MigrationProgram__Group_3__2__Impl();

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
    // $ANTLR end "rule__MigrationProgram__Group_3__2"


    // $ANTLR start "rule__MigrationProgram__Group_3__2__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1711:1: rule__MigrationProgram__Group_3__2__Impl : ( ';' ) ;
    public final void rule__MigrationProgram__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1715:1: ( ( ';' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1716:1: ( ';' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1716:1: ( ';' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1717:1: ';'
            {
             before(grammarAccess.getMigrationProgramAccess().getSemicolonKeyword_3_2()); 
            match(input,14,FOLLOW_14_in_rule__MigrationProgram__Group_3__2__Impl3558); 
             after(grammarAccess.getMigrationProgramAccess().getSemicolonKeyword_3_2()); 

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
    // $ANTLR end "rule__MigrationProgram__Group_3__2__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_8__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1736:1: rule__MigrationProgram__Group_8__0 : rule__MigrationProgram__Group_8__0__Impl rule__MigrationProgram__Group_8__1 ;
    public final void rule__MigrationProgram__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1740:1: ( rule__MigrationProgram__Group_8__0__Impl rule__MigrationProgram__Group_8__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1741:2: rule__MigrationProgram__Group_8__0__Impl rule__MigrationProgram__Group_8__1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_8__0__Impl_in_rule__MigrationProgram__Group_8__03595);
            rule__MigrationProgram__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group_8__1_in_rule__MigrationProgram__Group_8__03598);
            rule__MigrationProgram__Group_8__1();

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
    // $ANTLR end "rule__MigrationProgram__Group_8__0"


    // $ANTLR start "rule__MigrationProgram__Group_8__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1748:1: rule__MigrationProgram__Group_8__0__Impl : ( ( rule__MigrationProgram__TransformationPackageAssignment_8_0 ) ) ;
    public final void rule__MigrationProgram__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1752:1: ( ( ( rule__MigrationProgram__TransformationPackageAssignment_8_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1753:1: ( ( rule__MigrationProgram__TransformationPackageAssignment_8_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1753:1: ( ( rule__MigrationProgram__TransformationPackageAssignment_8_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1754:1: ( rule__MigrationProgram__TransformationPackageAssignment_8_0 )
            {
             before(grammarAccess.getMigrationProgramAccess().getTransformationPackageAssignment_8_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1755:1: ( rule__MigrationProgram__TransformationPackageAssignment_8_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1755:2: rule__MigrationProgram__TransformationPackageAssignment_8_0
            {
            pushFollow(FOLLOW_rule__MigrationProgram__TransformationPackageAssignment_8_0_in_rule__MigrationProgram__Group_8__0__Impl3625);
            rule__MigrationProgram__TransformationPackageAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getTransformationPackageAssignment_8_0()); 

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
    // $ANTLR end "rule__MigrationProgram__Group_8__0__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_8__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1765:1: rule__MigrationProgram__Group_8__1 : rule__MigrationProgram__Group_8__1__Impl ;
    public final void rule__MigrationProgram__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1769:1: ( rule__MigrationProgram__Group_8__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1770:2: rule__MigrationProgram__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_8__1__Impl_in_rule__MigrationProgram__Group_8__13655);
            rule__MigrationProgram__Group_8__1__Impl();

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
    // $ANTLR end "rule__MigrationProgram__Group_8__1"


    // $ANTLR start "rule__MigrationProgram__Group_8__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1776:1: rule__MigrationProgram__Group_8__1__Impl : ( ( rule__MigrationProgram__Group_8_1__0 ) ) ;
    public final void rule__MigrationProgram__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1780:1: ( ( ( rule__MigrationProgram__Group_8_1__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1781:1: ( ( rule__MigrationProgram__Group_8_1__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1781:1: ( ( rule__MigrationProgram__Group_8_1__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1782:1: ( rule__MigrationProgram__Group_8_1__0 )
            {
             before(grammarAccess.getMigrationProgramAccess().getGroup_8_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1783:1: ( rule__MigrationProgram__Group_8_1__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1783:2: rule__MigrationProgram__Group_8_1__0
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_8_1__0_in_rule__MigrationProgram__Group_8__1__Impl3682);
            rule__MigrationProgram__Group_8_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getGroup_8_1()); 

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
    // $ANTLR end "rule__MigrationProgram__Group_8__1__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_8_1__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1797:1: rule__MigrationProgram__Group_8_1__0 : rule__MigrationProgram__Group_8_1__0__Impl rule__MigrationProgram__Group_8_1__1 ;
    public final void rule__MigrationProgram__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1801:1: ( rule__MigrationProgram__Group_8_1__0__Impl rule__MigrationProgram__Group_8_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1802:2: rule__MigrationProgram__Group_8_1__0__Impl rule__MigrationProgram__Group_8_1__1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_8_1__0__Impl_in_rule__MigrationProgram__Group_8_1__03716);
            rule__MigrationProgram__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigrationProgram__Group_8_1__1_in_rule__MigrationProgram__Group_8_1__03719);
            rule__MigrationProgram__Group_8_1__1();

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
    // $ANTLR end "rule__MigrationProgram__Group_8_1__0"


    // $ANTLR start "rule__MigrationProgram__Group_8_1__0__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1809:1: rule__MigrationProgram__Group_8_1__0__Impl : ( ',' ) ;
    public final void rule__MigrationProgram__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1813:1: ( ( ',' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1814:1: ( ',' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1814:1: ( ',' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1815:1: ','
            {
             before(grammarAccess.getMigrationProgramAccess().getCommaKeyword_8_1_0()); 
            match(input,23,FOLLOW_23_in_rule__MigrationProgram__Group_8_1__0__Impl3747); 
             after(grammarAccess.getMigrationProgramAccess().getCommaKeyword_8_1_0()); 

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
    // $ANTLR end "rule__MigrationProgram__Group_8_1__0__Impl"


    // $ANTLR start "rule__MigrationProgram__Group_8_1__1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1828:1: rule__MigrationProgram__Group_8_1__1 : rule__MigrationProgram__Group_8_1__1__Impl ;
    public final void rule__MigrationProgram__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1832:1: ( rule__MigrationProgram__Group_8_1__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1833:2: rule__MigrationProgram__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MigrationProgram__Group_8_1__1__Impl_in_rule__MigrationProgram__Group_8_1__13778);
            rule__MigrationProgram__Group_8_1__1__Impl();

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
    // $ANTLR end "rule__MigrationProgram__Group_8_1__1"


    // $ANTLR start "rule__MigrationProgram__Group_8_1__1__Impl"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1839:1: rule__MigrationProgram__Group_8_1__1__Impl : ( ( rule__MigrationProgram__TransformationPackageAssignment_8_1_1 ) ) ;
    public final void rule__MigrationProgram__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1843:1: ( ( ( rule__MigrationProgram__TransformationPackageAssignment_8_1_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1844:1: ( ( rule__MigrationProgram__TransformationPackageAssignment_8_1_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1844:1: ( ( rule__MigrationProgram__TransformationPackageAssignment_8_1_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1845:1: ( rule__MigrationProgram__TransformationPackageAssignment_8_1_1 )
            {
             before(grammarAccess.getMigrationProgramAccess().getTransformationPackageAssignment_8_1_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1846:1: ( rule__MigrationProgram__TransformationPackageAssignment_8_1_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1846:2: rule__MigrationProgram__TransformationPackageAssignment_8_1_1
            {
            pushFollow(FOLLOW_rule__MigrationProgram__TransformationPackageAssignment_8_1_1_in_rule__MigrationProgram__Group_8_1__1__Impl3805);
            rule__MigrationProgram__TransformationPackageAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMigrationProgramAccess().getTransformationPackageAssignment_8_1_1()); 

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
    // $ANTLR end "rule__MigrationProgram__Group_8_1__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1860:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1864:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1865:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03839);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03842);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1872:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1876:1: ( ( 'rule' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1877:1: ( 'rule' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1877:1: ( 'rule' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1878:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Rule__Group__0__Impl3870); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1891:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1895:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1896:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13901);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__13904);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1903:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1907:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1908:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1908:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1909:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1910:1: ( rule__Rule__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1910:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl3931);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1920:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1924:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1925:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__23961);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__23964);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1932:1: rule__Rule__Group__2__Impl : ( '[' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1936:1: ( ( '[' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1937:1: ( '[' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1937:1: ( '[' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1938:1: '['
            {
             before(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Rule__Group__2__Impl3992); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1951:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1955:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1956:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__34023);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__34026);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1963:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__FilterAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1967:1: ( ( ( rule__Rule__FilterAssignment_3 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1968:1: ( ( rule__Rule__FilterAssignment_3 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1968:1: ( ( rule__Rule__FilterAssignment_3 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1969:1: ( rule__Rule__FilterAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getFilterAssignment_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1970:1: ( rule__Rule__FilterAssignment_3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1970:2: rule__Rule__FilterAssignment_3
            {
            pushFollow(FOLLOW_rule__Rule__FilterAssignment_3_in_rule__Rule__Group__3__Impl4053);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1980:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1984:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1985:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__44083);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__44086);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1992:1: rule__Rule__Group__4__Impl : ( ']' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1996:1: ( ( ']' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1997:1: ( ']' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1997:1: ( ']' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:1998:1: ']'
            {
             before(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Rule__Group__4__Impl4114); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2011:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2015:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2016:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__54145);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__54148);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2023:1: rule__Rule__Group__5__Impl : ( '{' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2027:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2028:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2028:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2029:1: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Rule__Group__5__Impl4176); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2042:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2046:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2047:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__64207);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__64210);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2054:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__RewritingRulesAssignment_6 )* ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2058:1: ( ( ( rule__Rule__RewritingRulesAssignment_6 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2059:1: ( ( rule__Rule__RewritingRulesAssignment_6 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2059:1: ( ( rule__Rule__RewritingRulesAssignment_6 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2060:1: ( rule__Rule__RewritingRulesAssignment_6 )*
            {
             before(grammarAccess.getRuleAccess().getRewritingRulesAssignment_6()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2061:1: ( rule__Rule__RewritingRulesAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2061:2: rule__Rule__RewritingRulesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Rule__RewritingRulesAssignment_6_in_rule__Rule__Group__6__Impl4237);
            	    rule__Rule__RewritingRulesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2071:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2075:1: ( rule__Rule__Group__7__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2076:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__74268);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2082:1: rule__Rule__Group__7__Impl : ( '}' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2086:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2087:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2087:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2088:1: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__Rule__Group__7__Impl4296); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2117:1: rule__EPackageOpDef__Group__0 : rule__EPackageOpDef__Group__0__Impl rule__EPackageOpDef__Group__1 ;
    public final void rule__EPackageOpDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2121:1: ( rule__EPackageOpDef__Group__0__Impl rule__EPackageOpDef__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2122:2: rule__EPackageOpDef__Group__0__Impl rule__EPackageOpDef__Group__1
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group__0__Impl_in_rule__EPackageOpDef__Group__04343);
            rule__EPackageOpDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group__1_in_rule__EPackageOpDef__Group__04346);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2129:1: rule__EPackageOpDef__Group__0__Impl : ( ( rule__EPackageOpDef__Group_0__0 ) ) ;
    public final void rule__EPackageOpDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2133:1: ( ( ( rule__EPackageOpDef__Group_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2134:1: ( ( rule__EPackageOpDef__Group_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2134:1: ( ( rule__EPackageOpDef__Group_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2135:1: ( rule__EPackageOpDef__Group_0__0 )
            {
             before(grammarAccess.getEPackageOpDefAccess().getGroup_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2136:1: ( rule__EPackageOpDef__Group_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2136:2: rule__EPackageOpDef__Group_0__0
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_0__0_in_rule__EPackageOpDef__Group__0__Impl4373);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2146:1: rule__EPackageOpDef__Group__1 : rule__EPackageOpDef__Group__1__Impl ;
    public final void rule__EPackageOpDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2150:1: ( rule__EPackageOpDef__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2151:2: rule__EPackageOpDef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group__1__Impl_in_rule__EPackageOpDef__Group__14403);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2157:1: rule__EPackageOpDef__Group__1__Impl : ( ( rule__EPackageOpDef__Group_1__0 ) ) ;
    public final void rule__EPackageOpDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2161:1: ( ( ( rule__EPackageOpDef__Group_1__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2162:1: ( ( rule__EPackageOpDef__Group_1__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2162:1: ( ( rule__EPackageOpDef__Group_1__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2163:1: ( rule__EPackageOpDef__Group_1__0 )
            {
             before(grammarAccess.getEPackageOpDefAccess().getGroup_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2164:1: ( rule__EPackageOpDef__Group_1__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2164:2: rule__EPackageOpDef__Group_1__0
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__0_in_rule__EPackageOpDef__Group__1__Impl4430);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2178:1: rule__EPackageOpDef__Group_0__0 : rule__EPackageOpDef__Group_0__0__Impl rule__EPackageOpDef__Group_0__1 ;
    public final void rule__EPackageOpDef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2182:1: ( rule__EPackageOpDef__Group_0__0__Impl rule__EPackageOpDef__Group_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2183:2: rule__EPackageOpDef__Group_0__0__Impl rule__EPackageOpDef__Group_0__1
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_0__0__Impl_in_rule__EPackageOpDef__Group_0__04464);
            rule__EPackageOpDef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_0__1_in_rule__EPackageOpDef__Group_0__04467);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2190:1: rule__EPackageOpDef__Group_0__0__Impl : ( 'package' ) ;
    public final void rule__EPackageOpDef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2194:1: ( ( 'package' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2195:1: ( 'package' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2195:1: ( 'package' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2196:1: 'package'
            {
             before(grammarAccess.getEPackageOpDefAccess().getPackageKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__EPackageOpDef__Group_0__0__Impl4495); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2209:1: rule__EPackageOpDef__Group_0__1 : rule__EPackageOpDef__Group_0__1__Impl rule__EPackageOpDef__Group_0__2 ;
    public final void rule__EPackageOpDef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2213:1: ( rule__EPackageOpDef__Group_0__1__Impl rule__EPackageOpDef__Group_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2214:2: rule__EPackageOpDef__Group_0__1__Impl rule__EPackageOpDef__Group_0__2
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_0__1__Impl_in_rule__EPackageOpDef__Group_0__14526);
            rule__EPackageOpDef__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_0__2_in_rule__EPackageOpDef__Group_0__14529);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2221:1: rule__EPackageOpDef__Group_0__1__Impl : ( ( rule__EPackageOpDef__VarAssignment_0_1 ) ) ;
    public final void rule__EPackageOpDef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2225:1: ( ( ( rule__EPackageOpDef__VarAssignment_0_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2226:1: ( ( rule__EPackageOpDef__VarAssignment_0_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2226:1: ( ( rule__EPackageOpDef__VarAssignment_0_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2227:1: ( rule__EPackageOpDef__VarAssignment_0_1 )
            {
             before(grammarAccess.getEPackageOpDefAccess().getVarAssignment_0_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2228:1: ( rule__EPackageOpDef__VarAssignment_0_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2228:2: rule__EPackageOpDef__VarAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__VarAssignment_0_1_in_rule__EPackageOpDef__Group_0__1__Impl4556);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2238:1: rule__EPackageOpDef__Group_0__2 : rule__EPackageOpDef__Group_0__2__Impl ;
    public final void rule__EPackageOpDef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2242:1: ( rule__EPackageOpDef__Group_0__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2243:2: rule__EPackageOpDef__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_0__2__Impl_in_rule__EPackageOpDef__Group_0__24586);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2249:1: rule__EPackageOpDef__Group_0__2__Impl : ( '=' ) ;
    public final void rule__EPackageOpDef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2253:1: ( ( '=' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2254:1: ( '=' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2254:1: ( '=' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2255:1: '='
            {
             before(grammarAccess.getEPackageOpDefAccess().getEqualsSignKeyword_0_2()); 
            match(input,28,FOLLOW_28_in_rule__EPackageOpDef__Group_0__2__Impl4614); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2274:1: rule__EPackageOpDef__Group_1__0 : rule__EPackageOpDef__Group_1__0__Impl rule__EPackageOpDef__Group_1__1 ;
    public final void rule__EPackageOpDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2278:1: ( rule__EPackageOpDef__Group_1__0__Impl rule__EPackageOpDef__Group_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2279:2: rule__EPackageOpDef__Group_1__0__Impl rule__EPackageOpDef__Group_1__1
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__0__Impl_in_rule__EPackageOpDef__Group_1__04651);
            rule__EPackageOpDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__1_in_rule__EPackageOpDef__Group_1__04654);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2286:1: rule__EPackageOpDef__Group_1__0__Impl : ( ( rule__EPackageOpDef__Alternatives_1_0 ) ) ;
    public final void rule__EPackageOpDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2290:1: ( ( ( rule__EPackageOpDef__Alternatives_1_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2291:1: ( ( rule__EPackageOpDef__Alternatives_1_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2291:1: ( ( rule__EPackageOpDef__Alternatives_1_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2292:1: ( rule__EPackageOpDef__Alternatives_1_0 )
            {
             before(grammarAccess.getEPackageOpDefAccess().getAlternatives_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2293:1: ( rule__EPackageOpDef__Alternatives_1_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2293:2: rule__EPackageOpDef__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Alternatives_1_0_in_rule__EPackageOpDef__Group_1__0__Impl4681);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2303:1: rule__EPackageOpDef__Group_1__1 : rule__EPackageOpDef__Group_1__1__Impl rule__EPackageOpDef__Group_1__2 ;
    public final void rule__EPackageOpDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2307:1: ( rule__EPackageOpDef__Group_1__1__Impl rule__EPackageOpDef__Group_1__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2308:2: rule__EPackageOpDef__Group_1__1__Impl rule__EPackageOpDef__Group_1__2
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__1__Impl_in_rule__EPackageOpDef__Group_1__14711);
            rule__EPackageOpDef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__2_in_rule__EPackageOpDef__Group_1__14714);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2315:1: rule__EPackageOpDef__Group_1__1__Impl : ( '(' ) ;
    public final void rule__EPackageOpDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2319:1: ( ( '(' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2320:1: ( '(' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2320:1: ( '(' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2321:1: '('
            {
             before(grammarAccess.getEPackageOpDefAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,29,FOLLOW_29_in_rule__EPackageOpDef__Group_1__1__Impl4742); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2334:1: rule__EPackageOpDef__Group_1__2 : rule__EPackageOpDef__Group_1__2__Impl rule__EPackageOpDef__Group_1__3 ;
    public final void rule__EPackageOpDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2338:1: ( rule__EPackageOpDef__Group_1__2__Impl rule__EPackageOpDef__Group_1__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2339:2: rule__EPackageOpDef__Group_1__2__Impl rule__EPackageOpDef__Group_1__3
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__2__Impl_in_rule__EPackageOpDef__Group_1__24773);
            rule__EPackageOpDef__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__3_in_rule__EPackageOpDef__Group_1__24776);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2346:1: rule__EPackageOpDef__Group_1__2__Impl : ( ( rule__EPackageOpDef__RefAssignment_1_2 ) ) ;
    public final void rule__EPackageOpDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2350:1: ( ( ( rule__EPackageOpDef__RefAssignment_1_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2351:1: ( ( rule__EPackageOpDef__RefAssignment_1_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2351:1: ( ( rule__EPackageOpDef__RefAssignment_1_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2352:1: ( rule__EPackageOpDef__RefAssignment_1_2 )
            {
             before(grammarAccess.getEPackageOpDefAccess().getRefAssignment_1_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2353:1: ( rule__EPackageOpDef__RefAssignment_1_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2353:2: rule__EPackageOpDef__RefAssignment_1_2
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__RefAssignment_1_2_in_rule__EPackageOpDef__Group_1__2__Impl4803);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2363:1: rule__EPackageOpDef__Group_1__3 : rule__EPackageOpDef__Group_1__3__Impl rule__EPackageOpDef__Group_1__4 ;
    public final void rule__EPackageOpDef__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2367:1: ( rule__EPackageOpDef__Group_1__3__Impl rule__EPackageOpDef__Group_1__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2368:2: rule__EPackageOpDef__Group_1__3__Impl rule__EPackageOpDef__Group_1__4
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__3__Impl_in_rule__EPackageOpDef__Group_1__34833);
            rule__EPackageOpDef__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__4_in_rule__EPackageOpDef__Group_1__34836);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2375:1: rule__EPackageOpDef__Group_1__3__Impl : ( ':' ) ;
    public final void rule__EPackageOpDef__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2379:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2380:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2380:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2381:1: ':'
            {
             before(grammarAccess.getEPackageOpDefAccess().getColonKeyword_1_3()); 
            match(input,20,FOLLOW_20_in_rule__EPackageOpDef__Group_1__3__Impl4864); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2394:1: rule__EPackageOpDef__Group_1__4 : rule__EPackageOpDef__Group_1__4__Impl rule__EPackageOpDef__Group_1__5 ;
    public final void rule__EPackageOpDef__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2398:1: ( rule__EPackageOpDef__Group_1__4__Impl rule__EPackageOpDef__Group_1__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2399:2: rule__EPackageOpDef__Group_1__4__Impl rule__EPackageOpDef__Group_1__5
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__4__Impl_in_rule__EPackageOpDef__Group_1__44895);
            rule__EPackageOpDef__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__5_in_rule__EPackageOpDef__Group_1__44898);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2406:1: rule__EPackageOpDef__Group_1__4__Impl : ( 'package' ) ;
    public final void rule__EPackageOpDef__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2410:1: ( ( 'package' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2411:1: ( 'package' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2411:1: ( 'package' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2412:1: 'package'
            {
             before(grammarAccess.getEPackageOpDefAccess().getPackageKeyword_1_4()); 
            match(input,27,FOLLOW_27_in_rule__EPackageOpDef__Group_1__4__Impl4926); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2425:1: rule__EPackageOpDef__Group_1__5 : rule__EPackageOpDef__Group_1__5__Impl rule__EPackageOpDef__Group_1__6 ;
    public final void rule__EPackageOpDef__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2429:1: ( rule__EPackageOpDef__Group_1__5__Impl rule__EPackageOpDef__Group_1__6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2430:2: rule__EPackageOpDef__Group_1__5__Impl rule__EPackageOpDef__Group_1__6
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__5__Impl_in_rule__EPackageOpDef__Group_1__54957);
            rule__EPackageOpDef__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__6_in_rule__EPackageOpDef__Group_1__54960);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2437:1: rule__EPackageOpDef__Group_1__5__Impl : ( ')' ) ;
    public final void rule__EPackageOpDef__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2441:1: ( ( ')' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2442:1: ( ')' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2442:1: ( ')' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2443:1: ')'
            {
             before(grammarAccess.getEPackageOpDefAccess().getRightParenthesisKeyword_1_5()); 
            match(input,30,FOLLOW_30_in_rule__EPackageOpDef__Group_1__5__Impl4988); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2456:1: rule__EPackageOpDef__Group_1__6 : rule__EPackageOpDef__Group_1__6__Impl rule__EPackageOpDef__Group_1__7 ;
    public final void rule__EPackageOpDef__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2460:1: ( rule__EPackageOpDef__Group_1__6__Impl rule__EPackageOpDef__Group_1__7 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2461:2: rule__EPackageOpDef__Group_1__6__Impl rule__EPackageOpDef__Group_1__7
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__6__Impl_in_rule__EPackageOpDef__Group_1__65019);
            rule__EPackageOpDef__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__7_in_rule__EPackageOpDef__Group_1__65022);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2468:1: rule__EPackageOpDef__Group_1__6__Impl : ( 'where' ) ;
    public final void rule__EPackageOpDef__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2472:1: ( ( 'where' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2473:1: ( 'where' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2473:1: ( 'where' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2474:1: 'where'
            {
             before(grammarAccess.getEPackageOpDefAccess().getWhereKeyword_1_6()); 
            match(input,31,FOLLOW_31_in_rule__EPackageOpDef__Group_1__6__Impl5050); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2487:1: rule__EPackageOpDef__Group_1__7 : rule__EPackageOpDef__Group_1__7__Impl rule__EPackageOpDef__Group_1__8 ;
    public final void rule__EPackageOpDef__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2491:1: ( rule__EPackageOpDef__Group_1__7__Impl rule__EPackageOpDef__Group_1__8 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2492:2: rule__EPackageOpDef__Group_1__7__Impl rule__EPackageOpDef__Group_1__8
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__7__Impl_in_rule__EPackageOpDef__Group_1__75081);
            rule__EPackageOpDef__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__8_in_rule__EPackageOpDef__Group_1__75084);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2499:1: rule__EPackageOpDef__Group_1__7__Impl : ( '{' ) ;
    public final void rule__EPackageOpDef__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2503:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2504:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2504:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2505:1: '{'
            {
             before(grammarAccess.getEPackageOpDefAccess().getLeftCurlyBracketKeyword_1_7()); 
            match(input,17,FOLLOW_17_in_rule__EPackageOpDef__Group_1__7__Impl5112); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2518:1: rule__EPackageOpDef__Group_1__8 : rule__EPackageOpDef__Group_1__8__Impl rule__EPackageOpDef__Group_1__9 ;
    public final void rule__EPackageOpDef__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2522:1: ( rule__EPackageOpDef__Group_1__8__Impl rule__EPackageOpDef__Group_1__9 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2523:2: rule__EPackageOpDef__Group_1__8__Impl rule__EPackageOpDef__Group_1__9
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__8__Impl_in_rule__EPackageOpDef__Group_1__85143);
            rule__EPackageOpDef__Group_1__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__9_in_rule__EPackageOpDef__Group_1__85146);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2530:1: rule__EPackageOpDef__Group_1__8__Impl : ( ( rule__EPackageOpDef__Alternatives_1_8 )* ) ;
    public final void rule__EPackageOpDef__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2534:1: ( ( ( rule__EPackageOpDef__Alternatives_1_8 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2535:1: ( ( rule__EPackageOpDef__Alternatives_1_8 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2535:1: ( ( rule__EPackageOpDef__Alternatives_1_8 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2536:1: ( rule__EPackageOpDef__Alternatives_1_8 )*
            {
             before(grammarAccess.getEPackageOpDefAccess().getAlternatives_1_8()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2537:1: ( rule__EPackageOpDef__Alternatives_1_8 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32||LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2537:2: rule__EPackageOpDef__Alternatives_1_8
            	    {
            	    pushFollow(FOLLOW_rule__EPackageOpDef__Alternatives_1_8_in_rule__EPackageOpDef__Group_1__8__Impl5173);
            	    rule__EPackageOpDef__Alternatives_1_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2547:1: rule__EPackageOpDef__Group_1__9 : rule__EPackageOpDef__Group_1__9__Impl ;
    public final void rule__EPackageOpDef__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2551:1: ( rule__EPackageOpDef__Group_1__9__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2552:2: rule__EPackageOpDef__Group_1__9__Impl
            {
            pushFollow(FOLLOW_rule__EPackageOpDef__Group_1__9__Impl_in_rule__EPackageOpDef__Group_1__95204);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2558:1: rule__EPackageOpDef__Group_1__9__Impl : ( '}' ) ;
    public final void rule__EPackageOpDef__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2562:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2563:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2563:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2564:1: '}'
            {
             before(grammarAccess.getEPackageOpDefAccess().getRightCurlyBracketKeyword_1_9()); 
            match(input,18,FOLLOW_18_in_rule__EPackageOpDef__Group_1__9__Impl5232); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2597:1: rule__EClassOpDef__Group__0 : rule__EClassOpDef__Group__0__Impl rule__EClassOpDef__Group__1 ;
    public final void rule__EClassOpDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2601:1: ( rule__EClassOpDef__Group__0__Impl rule__EClassOpDef__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2602:2: rule__EClassOpDef__Group__0__Impl rule__EClassOpDef__Group__1
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group__0__Impl_in_rule__EClassOpDef__Group__05283);
            rule__EClassOpDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group__1_in_rule__EClassOpDef__Group__05286);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2609:1: rule__EClassOpDef__Group__0__Impl : ( ( rule__EClassOpDef__Group_0__0 ) ) ;
    public final void rule__EClassOpDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2613:1: ( ( ( rule__EClassOpDef__Group_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2614:1: ( ( rule__EClassOpDef__Group_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2614:1: ( ( rule__EClassOpDef__Group_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2615:1: ( rule__EClassOpDef__Group_0__0 )
            {
             before(grammarAccess.getEClassOpDefAccess().getGroup_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2616:1: ( rule__EClassOpDef__Group_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2616:2: rule__EClassOpDef__Group_0__0
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_0__0_in_rule__EClassOpDef__Group__0__Impl5313);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2626:1: rule__EClassOpDef__Group__1 : rule__EClassOpDef__Group__1__Impl ;
    public final void rule__EClassOpDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2630:1: ( rule__EClassOpDef__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2631:2: rule__EClassOpDef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group__1__Impl_in_rule__EClassOpDef__Group__15343);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2637:1: rule__EClassOpDef__Group__1__Impl : ( ( rule__EClassOpDef__Group_1__0 ) ) ;
    public final void rule__EClassOpDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2641:1: ( ( ( rule__EClassOpDef__Group_1__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2642:1: ( ( rule__EClassOpDef__Group_1__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2642:1: ( ( rule__EClassOpDef__Group_1__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2643:1: ( rule__EClassOpDef__Group_1__0 )
            {
             before(grammarAccess.getEClassOpDefAccess().getGroup_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2644:1: ( rule__EClassOpDef__Group_1__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2644:2: rule__EClassOpDef__Group_1__0
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__0_in_rule__EClassOpDef__Group__1__Impl5370);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2658:1: rule__EClassOpDef__Group_0__0 : rule__EClassOpDef__Group_0__0__Impl rule__EClassOpDef__Group_0__1 ;
    public final void rule__EClassOpDef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2662:1: ( rule__EClassOpDef__Group_0__0__Impl rule__EClassOpDef__Group_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2663:2: rule__EClassOpDef__Group_0__0__Impl rule__EClassOpDef__Group_0__1
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_0__0__Impl_in_rule__EClassOpDef__Group_0__05404);
            rule__EClassOpDef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_0__1_in_rule__EClassOpDef__Group_0__05407);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2670:1: rule__EClassOpDef__Group_0__0__Impl : ( 'class' ) ;
    public final void rule__EClassOpDef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2674:1: ( ( 'class' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2675:1: ( 'class' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2675:1: ( 'class' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2676:1: 'class'
            {
             before(grammarAccess.getEClassOpDefAccess().getClassKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__EClassOpDef__Group_0__0__Impl5435); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2689:1: rule__EClassOpDef__Group_0__1 : rule__EClassOpDef__Group_0__1__Impl rule__EClassOpDef__Group_0__2 ;
    public final void rule__EClassOpDef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2693:1: ( rule__EClassOpDef__Group_0__1__Impl rule__EClassOpDef__Group_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2694:2: rule__EClassOpDef__Group_0__1__Impl rule__EClassOpDef__Group_0__2
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_0__1__Impl_in_rule__EClassOpDef__Group_0__15466);
            rule__EClassOpDef__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_0__2_in_rule__EClassOpDef__Group_0__15469);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2701:1: rule__EClassOpDef__Group_0__1__Impl : ( ( rule__EClassOpDef__VarAssignment_0_1 ) ) ;
    public final void rule__EClassOpDef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2705:1: ( ( ( rule__EClassOpDef__VarAssignment_0_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2706:1: ( ( rule__EClassOpDef__VarAssignment_0_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2706:1: ( ( rule__EClassOpDef__VarAssignment_0_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2707:1: ( rule__EClassOpDef__VarAssignment_0_1 )
            {
             before(grammarAccess.getEClassOpDefAccess().getVarAssignment_0_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2708:1: ( rule__EClassOpDef__VarAssignment_0_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2708:2: rule__EClassOpDef__VarAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EClassOpDef__VarAssignment_0_1_in_rule__EClassOpDef__Group_0__1__Impl5496);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2718:1: rule__EClassOpDef__Group_0__2 : rule__EClassOpDef__Group_0__2__Impl ;
    public final void rule__EClassOpDef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2722:1: ( rule__EClassOpDef__Group_0__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2723:2: rule__EClassOpDef__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_0__2__Impl_in_rule__EClassOpDef__Group_0__25526);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2729:1: rule__EClassOpDef__Group_0__2__Impl : ( '=' ) ;
    public final void rule__EClassOpDef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2733:1: ( ( '=' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2734:1: ( '=' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2734:1: ( '=' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2735:1: '='
            {
             before(grammarAccess.getEClassOpDefAccess().getEqualsSignKeyword_0_2()); 
            match(input,28,FOLLOW_28_in_rule__EClassOpDef__Group_0__2__Impl5554); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2754:1: rule__EClassOpDef__Group_1__0 : rule__EClassOpDef__Group_1__0__Impl rule__EClassOpDef__Group_1__1 ;
    public final void rule__EClassOpDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2758:1: ( rule__EClassOpDef__Group_1__0__Impl rule__EClassOpDef__Group_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2759:2: rule__EClassOpDef__Group_1__0__Impl rule__EClassOpDef__Group_1__1
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__0__Impl_in_rule__EClassOpDef__Group_1__05591);
            rule__EClassOpDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__1_in_rule__EClassOpDef__Group_1__05594);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2766:1: rule__EClassOpDef__Group_1__0__Impl : ( ( rule__EClassOpDef__Alternatives_1_0 ) ) ;
    public final void rule__EClassOpDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2770:1: ( ( ( rule__EClassOpDef__Alternatives_1_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2771:1: ( ( rule__EClassOpDef__Alternatives_1_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2771:1: ( ( rule__EClassOpDef__Alternatives_1_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2772:1: ( rule__EClassOpDef__Alternatives_1_0 )
            {
             before(grammarAccess.getEClassOpDefAccess().getAlternatives_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2773:1: ( rule__EClassOpDef__Alternatives_1_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2773:2: rule__EClassOpDef__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Alternatives_1_0_in_rule__EClassOpDef__Group_1__0__Impl5621);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2783:1: rule__EClassOpDef__Group_1__1 : rule__EClassOpDef__Group_1__1__Impl rule__EClassOpDef__Group_1__2 ;
    public final void rule__EClassOpDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2787:1: ( rule__EClassOpDef__Group_1__1__Impl rule__EClassOpDef__Group_1__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2788:2: rule__EClassOpDef__Group_1__1__Impl rule__EClassOpDef__Group_1__2
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__1__Impl_in_rule__EClassOpDef__Group_1__15651);
            rule__EClassOpDef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__2_in_rule__EClassOpDef__Group_1__15654);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2795:1: rule__EClassOpDef__Group_1__1__Impl : ( '(' ) ;
    public final void rule__EClassOpDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2799:1: ( ( '(' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2800:1: ( '(' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2800:1: ( '(' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2801:1: '('
            {
             before(grammarAccess.getEClassOpDefAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,29,FOLLOW_29_in_rule__EClassOpDef__Group_1__1__Impl5682); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2814:1: rule__EClassOpDef__Group_1__2 : rule__EClassOpDef__Group_1__2__Impl rule__EClassOpDef__Group_1__3 ;
    public final void rule__EClassOpDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2818:1: ( rule__EClassOpDef__Group_1__2__Impl rule__EClassOpDef__Group_1__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2819:2: rule__EClassOpDef__Group_1__2__Impl rule__EClassOpDef__Group_1__3
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__2__Impl_in_rule__EClassOpDef__Group_1__25713);
            rule__EClassOpDef__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__3_in_rule__EClassOpDef__Group_1__25716);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2826:1: rule__EClassOpDef__Group_1__2__Impl : ( ( rule__EClassOpDef__RefAssignment_1_2 ) ) ;
    public final void rule__EClassOpDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2830:1: ( ( ( rule__EClassOpDef__RefAssignment_1_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2831:1: ( ( rule__EClassOpDef__RefAssignment_1_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2831:1: ( ( rule__EClassOpDef__RefAssignment_1_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2832:1: ( rule__EClassOpDef__RefAssignment_1_2 )
            {
             before(grammarAccess.getEClassOpDefAccess().getRefAssignment_1_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2833:1: ( rule__EClassOpDef__RefAssignment_1_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2833:2: rule__EClassOpDef__RefAssignment_1_2
            {
            pushFollow(FOLLOW_rule__EClassOpDef__RefAssignment_1_2_in_rule__EClassOpDef__Group_1__2__Impl5743);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2843:1: rule__EClassOpDef__Group_1__3 : rule__EClassOpDef__Group_1__3__Impl rule__EClassOpDef__Group_1__4 ;
    public final void rule__EClassOpDef__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2847:1: ( rule__EClassOpDef__Group_1__3__Impl rule__EClassOpDef__Group_1__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2848:2: rule__EClassOpDef__Group_1__3__Impl rule__EClassOpDef__Group_1__4
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__3__Impl_in_rule__EClassOpDef__Group_1__35773);
            rule__EClassOpDef__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__4_in_rule__EClassOpDef__Group_1__35776);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2855:1: rule__EClassOpDef__Group_1__3__Impl : ( ':' ) ;
    public final void rule__EClassOpDef__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2859:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2860:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2860:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2861:1: ':'
            {
             before(grammarAccess.getEClassOpDefAccess().getColonKeyword_1_3()); 
            match(input,20,FOLLOW_20_in_rule__EClassOpDef__Group_1__3__Impl5804); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2874:1: rule__EClassOpDef__Group_1__4 : rule__EClassOpDef__Group_1__4__Impl rule__EClassOpDef__Group_1__5 ;
    public final void rule__EClassOpDef__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2878:1: ( rule__EClassOpDef__Group_1__4__Impl rule__EClassOpDef__Group_1__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2879:2: rule__EClassOpDef__Group_1__4__Impl rule__EClassOpDef__Group_1__5
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__4__Impl_in_rule__EClassOpDef__Group_1__45835);
            rule__EClassOpDef__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__5_in_rule__EClassOpDef__Group_1__45838);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2886:1: rule__EClassOpDef__Group_1__4__Impl : ( 'class' ) ;
    public final void rule__EClassOpDef__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2890:1: ( ( 'class' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2891:1: ( 'class' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2891:1: ( 'class' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2892:1: 'class'
            {
             before(grammarAccess.getEClassOpDefAccess().getClassKeyword_1_4()); 
            match(input,32,FOLLOW_32_in_rule__EClassOpDef__Group_1__4__Impl5866); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2905:1: rule__EClassOpDef__Group_1__5 : rule__EClassOpDef__Group_1__5__Impl rule__EClassOpDef__Group_1__6 ;
    public final void rule__EClassOpDef__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2909:1: ( rule__EClassOpDef__Group_1__5__Impl rule__EClassOpDef__Group_1__6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2910:2: rule__EClassOpDef__Group_1__5__Impl rule__EClassOpDef__Group_1__6
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__5__Impl_in_rule__EClassOpDef__Group_1__55897);
            rule__EClassOpDef__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__6_in_rule__EClassOpDef__Group_1__55900);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2917:1: rule__EClassOpDef__Group_1__5__Impl : ( ')' ) ;
    public final void rule__EClassOpDef__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2921:1: ( ( ')' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2922:1: ( ')' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2922:1: ( ')' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2923:1: ')'
            {
             before(grammarAccess.getEClassOpDefAccess().getRightParenthesisKeyword_1_5()); 
            match(input,30,FOLLOW_30_in_rule__EClassOpDef__Group_1__5__Impl5928); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2936:1: rule__EClassOpDef__Group_1__6 : rule__EClassOpDef__Group_1__6__Impl rule__EClassOpDef__Group_1__7 ;
    public final void rule__EClassOpDef__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2940:1: ( rule__EClassOpDef__Group_1__6__Impl rule__EClassOpDef__Group_1__7 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2941:2: rule__EClassOpDef__Group_1__6__Impl rule__EClassOpDef__Group_1__7
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__6__Impl_in_rule__EClassOpDef__Group_1__65959);
            rule__EClassOpDef__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__7_in_rule__EClassOpDef__Group_1__65962);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2948:1: rule__EClassOpDef__Group_1__6__Impl : ( 'where' ) ;
    public final void rule__EClassOpDef__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2952:1: ( ( 'where' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2953:1: ( 'where' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2953:1: ( 'where' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2954:1: 'where'
            {
             before(grammarAccess.getEClassOpDefAccess().getWhereKeyword_1_6()); 
            match(input,31,FOLLOW_31_in_rule__EClassOpDef__Group_1__6__Impl5990); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2967:1: rule__EClassOpDef__Group_1__7 : rule__EClassOpDef__Group_1__7__Impl ;
    public final void rule__EClassOpDef__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2971:1: ( rule__EClassOpDef__Group_1__7__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2972:2: rule__EClassOpDef__Group_1__7__Impl
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1__7__Impl_in_rule__EClassOpDef__Group_1__76021);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2978:1: rule__EClassOpDef__Group_1__7__Impl : ( ( rule__EClassOpDef__Group_1_7__0 ) ) ;
    public final void rule__EClassOpDef__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2982:1: ( ( ( rule__EClassOpDef__Group_1_7__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2983:1: ( ( rule__EClassOpDef__Group_1_7__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2983:1: ( ( rule__EClassOpDef__Group_1_7__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2984:1: ( rule__EClassOpDef__Group_1_7__0 )
            {
             before(grammarAccess.getEClassOpDefAccess().getGroup_1_7()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2985:1: ( rule__EClassOpDef__Group_1_7__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:2985:2: rule__EClassOpDef__Group_1_7__0
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1_7__0_in_rule__EClassOpDef__Group_1__7__Impl6048);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3011:1: rule__EClassOpDef__Group_1_7__0 : rule__EClassOpDef__Group_1_7__0__Impl rule__EClassOpDef__Group_1_7__1 ;
    public final void rule__EClassOpDef__Group_1_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3015:1: ( rule__EClassOpDef__Group_1_7__0__Impl rule__EClassOpDef__Group_1_7__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3016:2: rule__EClassOpDef__Group_1_7__0__Impl rule__EClassOpDef__Group_1_7__1
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1_7__0__Impl_in_rule__EClassOpDef__Group_1_7__06094);
            rule__EClassOpDef__Group_1_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1_7__1_in_rule__EClassOpDef__Group_1_7__06097);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3023:1: rule__EClassOpDef__Group_1_7__0__Impl : ( '{' ) ;
    public final void rule__EClassOpDef__Group_1_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3027:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3028:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3028:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3029:1: '{'
            {
             before(grammarAccess.getEClassOpDefAccess().getLeftCurlyBracketKeyword_1_7_0()); 
            match(input,17,FOLLOW_17_in_rule__EClassOpDef__Group_1_7__0__Impl6125); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3042:1: rule__EClassOpDef__Group_1_7__1 : rule__EClassOpDef__Group_1_7__1__Impl rule__EClassOpDef__Group_1_7__2 ;
    public final void rule__EClassOpDef__Group_1_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3046:1: ( rule__EClassOpDef__Group_1_7__1__Impl rule__EClassOpDef__Group_1_7__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3047:2: rule__EClassOpDef__Group_1_7__1__Impl rule__EClassOpDef__Group_1_7__2
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1_7__1__Impl_in_rule__EClassOpDef__Group_1_7__16156);
            rule__EClassOpDef__Group_1_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EClassOpDef__Group_1_7__2_in_rule__EClassOpDef__Group_1_7__16159);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3054:1: rule__EClassOpDef__Group_1_7__1__Impl : ( ( rule__EClassOpDef__Alternatives_1_7_1 )* ) ;
    public final void rule__EClassOpDef__Group_1_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3058:1: ( ( ( rule__EClassOpDef__Alternatives_1_7_1 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3059:1: ( ( rule__EClassOpDef__Alternatives_1_7_1 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3059:1: ( ( rule__EClassOpDef__Alternatives_1_7_1 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3060:1: ( rule__EClassOpDef__Alternatives_1_7_1 )*
            {
             before(grammarAccess.getEClassOpDefAccess().getAlternatives_1_7_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3061:1: ( rule__EClassOpDef__Alternatives_1_7_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=33 && LA18_0<=35)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3061:2: rule__EClassOpDef__Alternatives_1_7_1
            	    {
            	    pushFollow(FOLLOW_rule__EClassOpDef__Alternatives_1_7_1_in_rule__EClassOpDef__Group_1_7__1__Impl6186);
            	    rule__EClassOpDef__Alternatives_1_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3071:1: rule__EClassOpDef__Group_1_7__2 : rule__EClassOpDef__Group_1_7__2__Impl ;
    public final void rule__EClassOpDef__Group_1_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3075:1: ( rule__EClassOpDef__Group_1_7__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3076:2: rule__EClassOpDef__Group_1_7__2__Impl
            {
            pushFollow(FOLLOW_rule__EClassOpDef__Group_1_7__2__Impl_in_rule__EClassOpDef__Group_1_7__26217);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3082:1: rule__EClassOpDef__Group_1_7__2__Impl : ( '}' ) ;
    public final void rule__EClassOpDef__Group_1_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3086:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3087:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3087:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3088:1: '}'
            {
             before(grammarAccess.getEClassOpDefAccess().getRightCurlyBracketKeyword_1_7_2()); 
            match(input,18,FOLLOW_18_in_rule__EClassOpDef__Group_1_7__2__Impl6245); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3107:1: rule__EAttributeOpDef__Group__0 : rule__EAttributeOpDef__Group__0__Impl rule__EAttributeOpDef__Group__1 ;
    public final void rule__EAttributeOpDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3111:1: ( rule__EAttributeOpDef__Group__0__Impl rule__EAttributeOpDef__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3112:2: rule__EAttributeOpDef__Group__0__Impl rule__EAttributeOpDef__Group__1
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group__0__Impl_in_rule__EAttributeOpDef__Group__06282);
            rule__EAttributeOpDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group__1_in_rule__EAttributeOpDef__Group__06285);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3119:1: rule__EAttributeOpDef__Group__0__Impl : ( ( rule__EAttributeOpDef__Group_0__0 ) ) ;
    public final void rule__EAttributeOpDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3123:1: ( ( ( rule__EAttributeOpDef__Group_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3124:1: ( ( rule__EAttributeOpDef__Group_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3124:1: ( ( rule__EAttributeOpDef__Group_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3125:1: ( rule__EAttributeOpDef__Group_0__0 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getGroup_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3126:1: ( rule__EAttributeOpDef__Group_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3126:2: rule__EAttributeOpDef__Group_0__0
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_0__0_in_rule__EAttributeOpDef__Group__0__Impl6312);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3136:1: rule__EAttributeOpDef__Group__1 : rule__EAttributeOpDef__Group__1__Impl ;
    public final void rule__EAttributeOpDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3140:1: ( rule__EAttributeOpDef__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3141:2: rule__EAttributeOpDef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group__1__Impl_in_rule__EAttributeOpDef__Group__16342);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3147:1: rule__EAttributeOpDef__Group__1__Impl : ( ( rule__EAttributeOpDef__Group_1__0 ) ) ;
    public final void rule__EAttributeOpDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3151:1: ( ( ( rule__EAttributeOpDef__Group_1__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3152:1: ( ( rule__EAttributeOpDef__Group_1__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3152:1: ( ( rule__EAttributeOpDef__Group_1__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3153:1: ( rule__EAttributeOpDef__Group_1__0 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getGroup_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3154:1: ( rule__EAttributeOpDef__Group_1__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3154:2: rule__EAttributeOpDef__Group_1__0
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__0_in_rule__EAttributeOpDef__Group__1__Impl6369);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3168:1: rule__EAttributeOpDef__Group_0__0 : rule__EAttributeOpDef__Group_0__0__Impl rule__EAttributeOpDef__Group_0__1 ;
    public final void rule__EAttributeOpDef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3172:1: ( rule__EAttributeOpDef__Group_0__0__Impl rule__EAttributeOpDef__Group_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3173:2: rule__EAttributeOpDef__Group_0__0__Impl rule__EAttributeOpDef__Group_0__1
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_0__0__Impl_in_rule__EAttributeOpDef__Group_0__06403);
            rule__EAttributeOpDef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_0__1_in_rule__EAttributeOpDef__Group_0__06406);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3180:1: rule__EAttributeOpDef__Group_0__0__Impl : ( 'attribute' ) ;
    public final void rule__EAttributeOpDef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3184:1: ( ( 'attribute' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3185:1: ( 'attribute' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3185:1: ( 'attribute' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3186:1: 'attribute'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getAttributeKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__EAttributeOpDef__Group_0__0__Impl6434); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3199:1: rule__EAttributeOpDef__Group_0__1 : rule__EAttributeOpDef__Group_0__1__Impl rule__EAttributeOpDef__Group_0__2 ;
    public final void rule__EAttributeOpDef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3203:1: ( rule__EAttributeOpDef__Group_0__1__Impl rule__EAttributeOpDef__Group_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3204:2: rule__EAttributeOpDef__Group_0__1__Impl rule__EAttributeOpDef__Group_0__2
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_0__1__Impl_in_rule__EAttributeOpDef__Group_0__16465);
            rule__EAttributeOpDef__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_0__2_in_rule__EAttributeOpDef__Group_0__16468);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3211:1: rule__EAttributeOpDef__Group_0__1__Impl : ( ( rule__EAttributeOpDef__VarAssignment_0_1 ) ) ;
    public final void rule__EAttributeOpDef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3215:1: ( ( ( rule__EAttributeOpDef__VarAssignment_0_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3216:1: ( ( rule__EAttributeOpDef__VarAssignment_0_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3216:1: ( ( rule__EAttributeOpDef__VarAssignment_0_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3217:1: ( rule__EAttributeOpDef__VarAssignment_0_1 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getVarAssignment_0_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3218:1: ( rule__EAttributeOpDef__VarAssignment_0_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3218:2: rule__EAttributeOpDef__VarAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__VarAssignment_0_1_in_rule__EAttributeOpDef__Group_0__1__Impl6495);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3228:1: rule__EAttributeOpDef__Group_0__2 : rule__EAttributeOpDef__Group_0__2__Impl ;
    public final void rule__EAttributeOpDef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3232:1: ( rule__EAttributeOpDef__Group_0__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3233:2: rule__EAttributeOpDef__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_0__2__Impl_in_rule__EAttributeOpDef__Group_0__26525);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3239:1: rule__EAttributeOpDef__Group_0__2__Impl : ( '=' ) ;
    public final void rule__EAttributeOpDef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3243:1: ( ( '=' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3244:1: ( '=' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3244:1: ( '=' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3245:1: '='
            {
             before(grammarAccess.getEAttributeOpDefAccess().getEqualsSignKeyword_0_2()); 
            match(input,28,FOLLOW_28_in_rule__EAttributeOpDef__Group_0__2__Impl6553); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3264:1: rule__EAttributeOpDef__Group_1__0 : rule__EAttributeOpDef__Group_1__0__Impl rule__EAttributeOpDef__Group_1__1 ;
    public final void rule__EAttributeOpDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3268:1: ( rule__EAttributeOpDef__Group_1__0__Impl rule__EAttributeOpDef__Group_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3269:2: rule__EAttributeOpDef__Group_1__0__Impl rule__EAttributeOpDef__Group_1__1
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__0__Impl_in_rule__EAttributeOpDef__Group_1__06590);
            rule__EAttributeOpDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__1_in_rule__EAttributeOpDef__Group_1__06593);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3276:1: rule__EAttributeOpDef__Group_1__0__Impl : ( ( rule__EAttributeOpDef__Group_1_0__0 ) ) ;
    public final void rule__EAttributeOpDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3280:1: ( ( ( rule__EAttributeOpDef__Group_1_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3281:1: ( ( rule__EAttributeOpDef__Group_1_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3281:1: ( ( rule__EAttributeOpDef__Group_1_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3282:1: ( rule__EAttributeOpDef__Group_1_0__0 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getGroup_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3283:1: ( rule__EAttributeOpDef__Group_1_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3283:2: rule__EAttributeOpDef__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__0_in_rule__EAttributeOpDef__Group_1__0__Impl6620);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3293:1: rule__EAttributeOpDef__Group_1__1 : rule__EAttributeOpDef__Group_1__1__Impl rule__EAttributeOpDef__Group_1__2 ;
    public final void rule__EAttributeOpDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3297:1: ( rule__EAttributeOpDef__Group_1__1__Impl rule__EAttributeOpDef__Group_1__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3298:2: rule__EAttributeOpDef__Group_1__1__Impl rule__EAttributeOpDef__Group_1__2
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__1__Impl_in_rule__EAttributeOpDef__Group_1__16650);
            rule__EAttributeOpDef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__2_in_rule__EAttributeOpDef__Group_1__16653);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3305:1: rule__EAttributeOpDef__Group_1__1__Impl : ( ')' ) ;
    public final void rule__EAttributeOpDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3309:1: ( ( ')' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3310:1: ( ')' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3310:1: ( ')' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3311:1: ')'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getRightParenthesisKeyword_1_1()); 
            match(input,30,FOLLOW_30_in_rule__EAttributeOpDef__Group_1__1__Impl6681); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3324:1: rule__EAttributeOpDef__Group_1__2 : rule__EAttributeOpDef__Group_1__2__Impl rule__EAttributeOpDef__Group_1__3 ;
    public final void rule__EAttributeOpDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3328:1: ( rule__EAttributeOpDef__Group_1__2__Impl rule__EAttributeOpDef__Group_1__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3329:2: rule__EAttributeOpDef__Group_1__2__Impl rule__EAttributeOpDef__Group_1__3
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__2__Impl_in_rule__EAttributeOpDef__Group_1__26712);
            rule__EAttributeOpDef__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__3_in_rule__EAttributeOpDef__Group_1__26715);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3336:1: rule__EAttributeOpDef__Group_1__2__Impl : ( 'where' ) ;
    public final void rule__EAttributeOpDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3340:1: ( ( 'where' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3341:1: ( 'where' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3341:1: ( 'where' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3342:1: 'where'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getWhereKeyword_1_2()); 
            match(input,31,FOLLOW_31_in_rule__EAttributeOpDef__Group_1__2__Impl6743); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3355:1: rule__EAttributeOpDef__Group_1__3 : rule__EAttributeOpDef__Group_1__3__Impl ;
    public final void rule__EAttributeOpDef__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3359:1: ( rule__EAttributeOpDef__Group_1__3__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3360:2: rule__EAttributeOpDef__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1__3__Impl_in_rule__EAttributeOpDef__Group_1__36774);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3366:1: rule__EAttributeOpDef__Group_1__3__Impl : ( ( rule__EAttributeOpDef__Alternatives_1_3 ) ) ;
    public final void rule__EAttributeOpDef__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3370:1: ( ( ( rule__EAttributeOpDef__Alternatives_1_3 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3371:1: ( ( rule__EAttributeOpDef__Alternatives_1_3 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3371:1: ( ( rule__EAttributeOpDef__Alternatives_1_3 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3372:1: ( rule__EAttributeOpDef__Alternatives_1_3 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getAlternatives_1_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3373:1: ( rule__EAttributeOpDef__Alternatives_1_3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3373:2: rule__EAttributeOpDef__Alternatives_1_3
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Alternatives_1_3_in_rule__EAttributeOpDef__Group_1__3__Impl6801);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3391:1: rule__EAttributeOpDef__Group_1_0__0 : rule__EAttributeOpDef__Group_1_0__0__Impl rule__EAttributeOpDef__Group_1_0__1 ;
    public final void rule__EAttributeOpDef__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3395:1: ( rule__EAttributeOpDef__Group_1_0__0__Impl rule__EAttributeOpDef__Group_1_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3396:2: rule__EAttributeOpDef__Group_1_0__0__Impl rule__EAttributeOpDef__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__0__Impl_in_rule__EAttributeOpDef__Group_1_0__06839);
            rule__EAttributeOpDef__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__1_in_rule__EAttributeOpDef__Group_1_0__06842);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3403:1: rule__EAttributeOpDef__Group_1_0__0__Impl : ( ( rule__EAttributeOpDef__Alternatives_1_0_0 ) ) ;
    public final void rule__EAttributeOpDef__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3407:1: ( ( ( rule__EAttributeOpDef__Alternatives_1_0_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3408:1: ( ( rule__EAttributeOpDef__Alternatives_1_0_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3408:1: ( ( rule__EAttributeOpDef__Alternatives_1_0_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3409:1: ( rule__EAttributeOpDef__Alternatives_1_0_0 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getAlternatives_1_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3410:1: ( rule__EAttributeOpDef__Alternatives_1_0_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3410:2: rule__EAttributeOpDef__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Alternatives_1_0_0_in_rule__EAttributeOpDef__Group_1_0__0__Impl6869);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3420:1: rule__EAttributeOpDef__Group_1_0__1 : rule__EAttributeOpDef__Group_1_0__1__Impl rule__EAttributeOpDef__Group_1_0__2 ;
    public final void rule__EAttributeOpDef__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3424:1: ( rule__EAttributeOpDef__Group_1_0__1__Impl rule__EAttributeOpDef__Group_1_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3425:2: rule__EAttributeOpDef__Group_1_0__1__Impl rule__EAttributeOpDef__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__1__Impl_in_rule__EAttributeOpDef__Group_1_0__16899);
            rule__EAttributeOpDef__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__2_in_rule__EAttributeOpDef__Group_1_0__16902);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3432:1: rule__EAttributeOpDef__Group_1_0__1__Impl : ( '(' ) ;
    public final void rule__EAttributeOpDef__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3436:1: ( ( '(' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3437:1: ( '(' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3437:1: ( '(' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3438:1: '('
            {
             before(grammarAccess.getEAttributeOpDefAccess().getLeftParenthesisKeyword_1_0_1()); 
            match(input,29,FOLLOW_29_in_rule__EAttributeOpDef__Group_1_0__1__Impl6930); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3451:1: rule__EAttributeOpDef__Group_1_0__2 : rule__EAttributeOpDef__Group_1_0__2__Impl rule__EAttributeOpDef__Group_1_0__3 ;
    public final void rule__EAttributeOpDef__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3455:1: ( rule__EAttributeOpDef__Group_1_0__2__Impl rule__EAttributeOpDef__Group_1_0__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3456:2: rule__EAttributeOpDef__Group_1_0__2__Impl rule__EAttributeOpDef__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__2__Impl_in_rule__EAttributeOpDef__Group_1_0__26961);
            rule__EAttributeOpDef__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__3_in_rule__EAttributeOpDef__Group_1_0__26964);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3463:1: rule__EAttributeOpDef__Group_1_0__2__Impl : ( ( rule__EAttributeOpDef__RefAssignment_1_0_2 ) ) ;
    public final void rule__EAttributeOpDef__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3467:1: ( ( ( rule__EAttributeOpDef__RefAssignment_1_0_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3468:1: ( ( rule__EAttributeOpDef__RefAssignment_1_0_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3468:1: ( ( rule__EAttributeOpDef__RefAssignment_1_0_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3469:1: ( rule__EAttributeOpDef__RefAssignment_1_0_2 )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getRefAssignment_1_0_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3470:1: ( rule__EAttributeOpDef__RefAssignment_1_0_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3470:2: rule__EAttributeOpDef__RefAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__RefAssignment_1_0_2_in_rule__EAttributeOpDef__Group_1_0__2__Impl6991);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3480:1: rule__EAttributeOpDef__Group_1_0__3 : rule__EAttributeOpDef__Group_1_0__3__Impl rule__EAttributeOpDef__Group_1_0__4 ;
    public final void rule__EAttributeOpDef__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3484:1: ( rule__EAttributeOpDef__Group_1_0__3__Impl rule__EAttributeOpDef__Group_1_0__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3485:2: rule__EAttributeOpDef__Group_1_0__3__Impl rule__EAttributeOpDef__Group_1_0__4
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__3__Impl_in_rule__EAttributeOpDef__Group_1_0__37021);
            rule__EAttributeOpDef__Group_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__4_in_rule__EAttributeOpDef__Group_1_0__37024);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3492:1: rule__EAttributeOpDef__Group_1_0__3__Impl : ( ':' ) ;
    public final void rule__EAttributeOpDef__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3496:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3497:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3497:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3498:1: ':'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getColonKeyword_1_0_3()); 
            match(input,20,FOLLOW_20_in_rule__EAttributeOpDef__Group_1_0__3__Impl7052); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3511:1: rule__EAttributeOpDef__Group_1_0__4 : rule__EAttributeOpDef__Group_1_0__4__Impl ;
    public final void rule__EAttributeOpDef__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3515:1: ( rule__EAttributeOpDef__Group_1_0__4__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3516:2: rule__EAttributeOpDef__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_0__4__Impl_in_rule__EAttributeOpDef__Group_1_0__47083);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3522:1: rule__EAttributeOpDef__Group_1_0__4__Impl : ( 'attribute' ) ;
    public final void rule__EAttributeOpDef__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3526:1: ( ( 'attribute' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3527:1: ( 'attribute' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3527:1: ( 'attribute' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3528:1: 'attribute'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getAttributeKeyword_1_0_4()); 
            match(input,33,FOLLOW_33_in_rule__EAttributeOpDef__Group_1_0__4__Impl7111); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3551:1: rule__EAttributeOpDef__Group_1_3_0__0 : rule__EAttributeOpDef__Group_1_3_0__0__Impl rule__EAttributeOpDef__Group_1_3_0__1 ;
    public final void rule__EAttributeOpDef__Group_1_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3555:1: ( rule__EAttributeOpDef__Group_1_3_0__0__Impl rule__EAttributeOpDef__Group_1_3_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3556:2: rule__EAttributeOpDef__Group_1_3_0__0__Impl rule__EAttributeOpDef__Group_1_3_0__1
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_3_0__0__Impl_in_rule__EAttributeOpDef__Group_1_3_0__07152);
            rule__EAttributeOpDef__Group_1_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_3_0__1_in_rule__EAttributeOpDef__Group_1_3_0__07155);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3563:1: rule__EAttributeOpDef__Group_1_3_0__0__Impl : ( '{' ) ;
    public final void rule__EAttributeOpDef__Group_1_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3567:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3568:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3568:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3569:1: '{'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getLeftCurlyBracketKeyword_1_3_0_0()); 
            match(input,17,FOLLOW_17_in_rule__EAttributeOpDef__Group_1_3_0__0__Impl7183); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3582:1: rule__EAttributeOpDef__Group_1_3_0__1 : rule__EAttributeOpDef__Group_1_3_0__1__Impl rule__EAttributeOpDef__Group_1_3_0__2 ;
    public final void rule__EAttributeOpDef__Group_1_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3586:1: ( rule__EAttributeOpDef__Group_1_3_0__1__Impl rule__EAttributeOpDef__Group_1_3_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3587:2: rule__EAttributeOpDef__Group_1_3_0__1__Impl rule__EAttributeOpDef__Group_1_3_0__2
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_3_0__1__Impl_in_rule__EAttributeOpDef__Group_1_3_0__17214);
            rule__EAttributeOpDef__Group_1_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_3_0__2_in_rule__EAttributeOpDef__Group_1_3_0__17217);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3594:1: rule__EAttributeOpDef__Group_1_3_0__1__Impl : ( ( rule__EAttributeOpDef__SettersAssignment_1_3_0_1 )* ) ;
    public final void rule__EAttributeOpDef__Group_1_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3598:1: ( ( ( rule__EAttributeOpDef__SettersAssignment_1_3_0_1 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3599:1: ( ( rule__EAttributeOpDef__SettersAssignment_1_3_0_1 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3599:1: ( ( rule__EAttributeOpDef__SettersAssignment_1_3_0_1 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3600:1: ( rule__EAttributeOpDef__SettersAssignment_1_3_0_1 )*
            {
             before(grammarAccess.getEAttributeOpDefAccess().getSettersAssignment_1_3_0_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3601:1: ( rule__EAttributeOpDef__SettersAssignment_1_3_0_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3601:2: rule__EAttributeOpDef__SettersAssignment_1_3_0_1
            	    {
            	    pushFollow(FOLLOW_rule__EAttributeOpDef__SettersAssignment_1_3_0_1_in_rule__EAttributeOpDef__Group_1_3_0__1__Impl7244);
            	    rule__EAttributeOpDef__SettersAssignment_1_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3611:1: rule__EAttributeOpDef__Group_1_3_0__2 : rule__EAttributeOpDef__Group_1_3_0__2__Impl ;
    public final void rule__EAttributeOpDef__Group_1_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3615:1: ( rule__EAttributeOpDef__Group_1_3_0__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3616:2: rule__EAttributeOpDef__Group_1_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EAttributeOpDef__Group_1_3_0__2__Impl_in_rule__EAttributeOpDef__Group_1_3_0__27275);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3622:1: rule__EAttributeOpDef__Group_1_3_0__2__Impl : ( '}' ) ;
    public final void rule__EAttributeOpDef__Group_1_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3626:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3627:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3627:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3628:1: '}'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getRightCurlyBracketKeyword_1_3_0_2()); 
            match(input,18,FOLLOW_18_in_rule__EAttributeOpDef__Group_1_3_0__2__Impl7303); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3647:1: rule__EReferenceOpDef__Group__0 : rule__EReferenceOpDef__Group__0__Impl rule__EReferenceOpDef__Group__1 ;
    public final void rule__EReferenceOpDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3651:1: ( rule__EReferenceOpDef__Group__0__Impl rule__EReferenceOpDef__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3652:2: rule__EReferenceOpDef__Group__0__Impl rule__EReferenceOpDef__Group__1
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group__0__Impl_in_rule__EReferenceOpDef__Group__07340);
            rule__EReferenceOpDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group__1_in_rule__EReferenceOpDef__Group__07343);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3659:1: rule__EReferenceOpDef__Group__0__Impl : ( ( rule__EReferenceOpDef__Group_0__0 ) ) ;
    public final void rule__EReferenceOpDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3663:1: ( ( ( rule__EReferenceOpDef__Group_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3664:1: ( ( rule__EReferenceOpDef__Group_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3664:1: ( ( rule__EReferenceOpDef__Group_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3665:1: ( rule__EReferenceOpDef__Group_0__0 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getGroup_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3666:1: ( rule__EReferenceOpDef__Group_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3666:2: rule__EReferenceOpDef__Group_0__0
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_0__0_in_rule__EReferenceOpDef__Group__0__Impl7370);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3676:1: rule__EReferenceOpDef__Group__1 : rule__EReferenceOpDef__Group__1__Impl ;
    public final void rule__EReferenceOpDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3680:1: ( rule__EReferenceOpDef__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3681:2: rule__EReferenceOpDef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group__1__Impl_in_rule__EReferenceOpDef__Group__17400);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3687:1: rule__EReferenceOpDef__Group__1__Impl : ( ( rule__EReferenceOpDef__Group_1__0 ) ) ;
    public final void rule__EReferenceOpDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3691:1: ( ( ( rule__EReferenceOpDef__Group_1__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3692:1: ( ( rule__EReferenceOpDef__Group_1__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3692:1: ( ( rule__EReferenceOpDef__Group_1__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3693:1: ( rule__EReferenceOpDef__Group_1__0 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getGroup_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3694:1: ( rule__EReferenceOpDef__Group_1__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3694:2: rule__EReferenceOpDef__Group_1__0
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__0_in_rule__EReferenceOpDef__Group__1__Impl7427);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3708:1: rule__EReferenceOpDef__Group_0__0 : rule__EReferenceOpDef__Group_0__0__Impl rule__EReferenceOpDef__Group_0__1 ;
    public final void rule__EReferenceOpDef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3712:1: ( rule__EReferenceOpDef__Group_0__0__Impl rule__EReferenceOpDef__Group_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3713:2: rule__EReferenceOpDef__Group_0__0__Impl rule__EReferenceOpDef__Group_0__1
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_0__0__Impl_in_rule__EReferenceOpDef__Group_0__07461);
            rule__EReferenceOpDef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_0__1_in_rule__EReferenceOpDef__Group_0__07464);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3720:1: rule__EReferenceOpDef__Group_0__0__Impl : ( 'reference' ) ;
    public final void rule__EReferenceOpDef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3724:1: ( ( 'reference' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3725:1: ( 'reference' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3725:1: ( 'reference' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3726:1: 'reference'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getReferenceKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__EReferenceOpDef__Group_0__0__Impl7492); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3739:1: rule__EReferenceOpDef__Group_0__1 : rule__EReferenceOpDef__Group_0__1__Impl rule__EReferenceOpDef__Group_0__2 ;
    public final void rule__EReferenceOpDef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3743:1: ( rule__EReferenceOpDef__Group_0__1__Impl rule__EReferenceOpDef__Group_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3744:2: rule__EReferenceOpDef__Group_0__1__Impl rule__EReferenceOpDef__Group_0__2
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_0__1__Impl_in_rule__EReferenceOpDef__Group_0__17523);
            rule__EReferenceOpDef__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_0__2_in_rule__EReferenceOpDef__Group_0__17526);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3751:1: rule__EReferenceOpDef__Group_0__1__Impl : ( ( rule__EReferenceOpDef__VarAssignment_0_1 ) ) ;
    public final void rule__EReferenceOpDef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3755:1: ( ( ( rule__EReferenceOpDef__VarAssignment_0_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3756:1: ( ( rule__EReferenceOpDef__VarAssignment_0_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3756:1: ( ( rule__EReferenceOpDef__VarAssignment_0_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3757:1: ( rule__EReferenceOpDef__VarAssignment_0_1 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getVarAssignment_0_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3758:1: ( rule__EReferenceOpDef__VarAssignment_0_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3758:2: rule__EReferenceOpDef__VarAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__VarAssignment_0_1_in_rule__EReferenceOpDef__Group_0__1__Impl7553);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3768:1: rule__EReferenceOpDef__Group_0__2 : rule__EReferenceOpDef__Group_0__2__Impl ;
    public final void rule__EReferenceOpDef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3772:1: ( rule__EReferenceOpDef__Group_0__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3773:2: rule__EReferenceOpDef__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_0__2__Impl_in_rule__EReferenceOpDef__Group_0__27583);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3779:1: rule__EReferenceOpDef__Group_0__2__Impl : ( '=' ) ;
    public final void rule__EReferenceOpDef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3783:1: ( ( '=' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3784:1: ( '=' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3784:1: ( '=' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3785:1: '='
            {
             before(grammarAccess.getEReferenceOpDefAccess().getEqualsSignKeyword_0_2()); 
            match(input,28,FOLLOW_28_in_rule__EReferenceOpDef__Group_0__2__Impl7611); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3804:1: rule__EReferenceOpDef__Group_1__0 : rule__EReferenceOpDef__Group_1__0__Impl rule__EReferenceOpDef__Group_1__1 ;
    public final void rule__EReferenceOpDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3808:1: ( rule__EReferenceOpDef__Group_1__0__Impl rule__EReferenceOpDef__Group_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3809:2: rule__EReferenceOpDef__Group_1__0__Impl rule__EReferenceOpDef__Group_1__1
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__0__Impl_in_rule__EReferenceOpDef__Group_1__07648);
            rule__EReferenceOpDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__1_in_rule__EReferenceOpDef__Group_1__07651);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3816:1: rule__EReferenceOpDef__Group_1__0__Impl : ( ( rule__EReferenceOpDef__Group_1_0__0 ) ) ;
    public final void rule__EReferenceOpDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3820:1: ( ( ( rule__EReferenceOpDef__Group_1_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3821:1: ( ( rule__EReferenceOpDef__Group_1_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3821:1: ( ( rule__EReferenceOpDef__Group_1_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3822:1: ( rule__EReferenceOpDef__Group_1_0__0 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getGroup_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3823:1: ( rule__EReferenceOpDef__Group_1_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3823:2: rule__EReferenceOpDef__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__0_in_rule__EReferenceOpDef__Group_1__0__Impl7678);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3833:1: rule__EReferenceOpDef__Group_1__1 : rule__EReferenceOpDef__Group_1__1__Impl rule__EReferenceOpDef__Group_1__2 ;
    public final void rule__EReferenceOpDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3837:1: ( rule__EReferenceOpDef__Group_1__1__Impl rule__EReferenceOpDef__Group_1__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3838:2: rule__EReferenceOpDef__Group_1__1__Impl rule__EReferenceOpDef__Group_1__2
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__1__Impl_in_rule__EReferenceOpDef__Group_1__17708);
            rule__EReferenceOpDef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__2_in_rule__EReferenceOpDef__Group_1__17711);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3845:1: rule__EReferenceOpDef__Group_1__1__Impl : ( ')' ) ;
    public final void rule__EReferenceOpDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3849:1: ( ( ')' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3850:1: ( ')' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3850:1: ( ')' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3851:1: ')'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getRightParenthesisKeyword_1_1()); 
            match(input,30,FOLLOW_30_in_rule__EReferenceOpDef__Group_1__1__Impl7739); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3864:1: rule__EReferenceOpDef__Group_1__2 : rule__EReferenceOpDef__Group_1__2__Impl rule__EReferenceOpDef__Group_1__3 ;
    public final void rule__EReferenceOpDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3868:1: ( rule__EReferenceOpDef__Group_1__2__Impl rule__EReferenceOpDef__Group_1__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3869:2: rule__EReferenceOpDef__Group_1__2__Impl rule__EReferenceOpDef__Group_1__3
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__2__Impl_in_rule__EReferenceOpDef__Group_1__27770);
            rule__EReferenceOpDef__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__3_in_rule__EReferenceOpDef__Group_1__27773);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3876:1: rule__EReferenceOpDef__Group_1__2__Impl : ( 'where' ) ;
    public final void rule__EReferenceOpDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3880:1: ( ( 'where' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3881:1: ( 'where' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3881:1: ( 'where' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3882:1: 'where'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getWhereKeyword_1_2()); 
            match(input,31,FOLLOW_31_in_rule__EReferenceOpDef__Group_1__2__Impl7801); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3895:1: rule__EReferenceOpDef__Group_1__3 : rule__EReferenceOpDef__Group_1__3__Impl ;
    public final void rule__EReferenceOpDef__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3899:1: ( rule__EReferenceOpDef__Group_1__3__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3900:2: rule__EReferenceOpDef__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1__3__Impl_in_rule__EReferenceOpDef__Group_1__37832);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3906:1: rule__EReferenceOpDef__Group_1__3__Impl : ( ( rule__EReferenceOpDef__Group_1_3__0 ) ) ;
    public final void rule__EReferenceOpDef__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3910:1: ( ( ( rule__EReferenceOpDef__Group_1_3__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3911:1: ( ( rule__EReferenceOpDef__Group_1_3__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3911:1: ( ( rule__EReferenceOpDef__Group_1_3__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3912:1: ( rule__EReferenceOpDef__Group_1_3__0 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getGroup_1_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3913:1: ( rule__EReferenceOpDef__Group_1_3__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3913:2: rule__EReferenceOpDef__Group_1_3__0
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_3__0_in_rule__EReferenceOpDef__Group_1__3__Impl7859);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3931:1: rule__EReferenceOpDef__Group_1_0__0 : rule__EReferenceOpDef__Group_1_0__0__Impl rule__EReferenceOpDef__Group_1_0__1 ;
    public final void rule__EReferenceOpDef__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3935:1: ( rule__EReferenceOpDef__Group_1_0__0__Impl rule__EReferenceOpDef__Group_1_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3936:2: rule__EReferenceOpDef__Group_1_0__0__Impl rule__EReferenceOpDef__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__0__Impl_in_rule__EReferenceOpDef__Group_1_0__07897);
            rule__EReferenceOpDef__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__1_in_rule__EReferenceOpDef__Group_1_0__07900);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3943:1: rule__EReferenceOpDef__Group_1_0__0__Impl : ( ( rule__EReferenceOpDef__Alternatives_1_0_0 ) ) ;
    public final void rule__EReferenceOpDef__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3947:1: ( ( ( rule__EReferenceOpDef__Alternatives_1_0_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3948:1: ( ( rule__EReferenceOpDef__Alternatives_1_0_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3948:1: ( ( rule__EReferenceOpDef__Alternatives_1_0_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3949:1: ( rule__EReferenceOpDef__Alternatives_1_0_0 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getAlternatives_1_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3950:1: ( rule__EReferenceOpDef__Alternatives_1_0_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3950:2: rule__EReferenceOpDef__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Alternatives_1_0_0_in_rule__EReferenceOpDef__Group_1_0__0__Impl7927);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3960:1: rule__EReferenceOpDef__Group_1_0__1 : rule__EReferenceOpDef__Group_1_0__1__Impl rule__EReferenceOpDef__Group_1_0__2 ;
    public final void rule__EReferenceOpDef__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3964:1: ( rule__EReferenceOpDef__Group_1_0__1__Impl rule__EReferenceOpDef__Group_1_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3965:2: rule__EReferenceOpDef__Group_1_0__1__Impl rule__EReferenceOpDef__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__1__Impl_in_rule__EReferenceOpDef__Group_1_0__17957);
            rule__EReferenceOpDef__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__2_in_rule__EReferenceOpDef__Group_1_0__17960);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3972:1: rule__EReferenceOpDef__Group_1_0__1__Impl : ( '(' ) ;
    public final void rule__EReferenceOpDef__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3976:1: ( ( '(' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3977:1: ( '(' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3977:1: ( '(' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3978:1: '('
            {
             before(grammarAccess.getEReferenceOpDefAccess().getLeftParenthesisKeyword_1_0_1()); 
            match(input,29,FOLLOW_29_in_rule__EReferenceOpDef__Group_1_0__1__Impl7988); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3991:1: rule__EReferenceOpDef__Group_1_0__2 : rule__EReferenceOpDef__Group_1_0__2__Impl rule__EReferenceOpDef__Group_1_0__3 ;
    public final void rule__EReferenceOpDef__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3995:1: ( rule__EReferenceOpDef__Group_1_0__2__Impl rule__EReferenceOpDef__Group_1_0__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:3996:2: rule__EReferenceOpDef__Group_1_0__2__Impl rule__EReferenceOpDef__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__2__Impl_in_rule__EReferenceOpDef__Group_1_0__28019);
            rule__EReferenceOpDef__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__3_in_rule__EReferenceOpDef__Group_1_0__28022);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4003:1: rule__EReferenceOpDef__Group_1_0__2__Impl : ( ( rule__EReferenceOpDef__RefAssignment_1_0_2 ) ) ;
    public final void rule__EReferenceOpDef__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4007:1: ( ( ( rule__EReferenceOpDef__RefAssignment_1_0_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4008:1: ( ( rule__EReferenceOpDef__RefAssignment_1_0_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4008:1: ( ( rule__EReferenceOpDef__RefAssignment_1_0_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4009:1: ( rule__EReferenceOpDef__RefAssignment_1_0_2 )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getRefAssignment_1_0_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4010:1: ( rule__EReferenceOpDef__RefAssignment_1_0_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4010:2: rule__EReferenceOpDef__RefAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__RefAssignment_1_0_2_in_rule__EReferenceOpDef__Group_1_0__2__Impl8049);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4020:1: rule__EReferenceOpDef__Group_1_0__3 : rule__EReferenceOpDef__Group_1_0__3__Impl rule__EReferenceOpDef__Group_1_0__4 ;
    public final void rule__EReferenceOpDef__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4024:1: ( rule__EReferenceOpDef__Group_1_0__3__Impl rule__EReferenceOpDef__Group_1_0__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4025:2: rule__EReferenceOpDef__Group_1_0__3__Impl rule__EReferenceOpDef__Group_1_0__4
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__3__Impl_in_rule__EReferenceOpDef__Group_1_0__38079);
            rule__EReferenceOpDef__Group_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__4_in_rule__EReferenceOpDef__Group_1_0__38082);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4032:1: rule__EReferenceOpDef__Group_1_0__3__Impl : ( ':' ) ;
    public final void rule__EReferenceOpDef__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4036:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4037:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4037:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4038:1: ':'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getColonKeyword_1_0_3()); 
            match(input,20,FOLLOW_20_in_rule__EReferenceOpDef__Group_1_0__3__Impl8110); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4051:1: rule__EReferenceOpDef__Group_1_0__4 : rule__EReferenceOpDef__Group_1_0__4__Impl ;
    public final void rule__EReferenceOpDef__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4055:1: ( rule__EReferenceOpDef__Group_1_0__4__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4056:2: rule__EReferenceOpDef__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_0__4__Impl_in_rule__EReferenceOpDef__Group_1_0__48141);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4062:1: rule__EReferenceOpDef__Group_1_0__4__Impl : ( 'reference' ) ;
    public final void rule__EReferenceOpDef__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4066:1: ( ( 'reference' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4067:1: ( 'reference' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4067:1: ( 'reference' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4068:1: 'reference'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getReferenceKeyword_1_0_4()); 
            match(input,34,FOLLOW_34_in_rule__EReferenceOpDef__Group_1_0__4__Impl8169); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4091:1: rule__EReferenceOpDef__Group_1_3__0 : rule__EReferenceOpDef__Group_1_3__0__Impl rule__EReferenceOpDef__Group_1_3__1 ;
    public final void rule__EReferenceOpDef__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4095:1: ( rule__EReferenceOpDef__Group_1_3__0__Impl rule__EReferenceOpDef__Group_1_3__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4096:2: rule__EReferenceOpDef__Group_1_3__0__Impl rule__EReferenceOpDef__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_3__0__Impl_in_rule__EReferenceOpDef__Group_1_3__08210);
            rule__EReferenceOpDef__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_3__1_in_rule__EReferenceOpDef__Group_1_3__08213);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4103:1: rule__EReferenceOpDef__Group_1_3__0__Impl : ( '{' ) ;
    public final void rule__EReferenceOpDef__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4107:1: ( ( '{' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4108:1: ( '{' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4108:1: ( '{' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4109:1: '{'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getLeftCurlyBracketKeyword_1_3_0()); 
            match(input,17,FOLLOW_17_in_rule__EReferenceOpDef__Group_1_3__0__Impl8241); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4122:1: rule__EReferenceOpDef__Group_1_3__1 : rule__EReferenceOpDef__Group_1_3__1__Impl rule__EReferenceOpDef__Group_1_3__2 ;
    public final void rule__EReferenceOpDef__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4126:1: ( rule__EReferenceOpDef__Group_1_3__1__Impl rule__EReferenceOpDef__Group_1_3__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4127:2: rule__EReferenceOpDef__Group_1_3__1__Impl rule__EReferenceOpDef__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_3__1__Impl_in_rule__EReferenceOpDef__Group_1_3__18272);
            rule__EReferenceOpDef__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_3__2_in_rule__EReferenceOpDef__Group_1_3__18275);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4134:1: rule__EReferenceOpDef__Group_1_3__1__Impl : ( ( rule__EReferenceOpDef__SettersAssignment_1_3_1 )* ) ;
    public final void rule__EReferenceOpDef__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4138:1: ( ( ( rule__EReferenceOpDef__SettersAssignment_1_3_1 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4139:1: ( ( rule__EReferenceOpDef__SettersAssignment_1_3_1 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4139:1: ( ( rule__EReferenceOpDef__SettersAssignment_1_3_1 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4140:1: ( rule__EReferenceOpDef__SettersAssignment_1_3_1 )*
            {
             before(grammarAccess.getEReferenceOpDefAccess().getSettersAssignment_1_3_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4141:1: ( rule__EReferenceOpDef__SettersAssignment_1_3_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4141:2: rule__EReferenceOpDef__SettersAssignment_1_3_1
            	    {
            	    pushFollow(FOLLOW_rule__EReferenceOpDef__SettersAssignment_1_3_1_in_rule__EReferenceOpDef__Group_1_3__1__Impl8302);
            	    rule__EReferenceOpDef__SettersAssignment_1_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4151:1: rule__EReferenceOpDef__Group_1_3__2 : rule__EReferenceOpDef__Group_1_3__2__Impl ;
    public final void rule__EReferenceOpDef__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4155:1: ( rule__EReferenceOpDef__Group_1_3__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4156:2: rule__EReferenceOpDef__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_rule__EReferenceOpDef__Group_1_3__2__Impl_in_rule__EReferenceOpDef__Group_1_3__28333);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4162:1: rule__EReferenceOpDef__Group_1_3__2__Impl : ( '}' ) ;
    public final void rule__EReferenceOpDef__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4166:1: ( ( '}' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4167:1: ( '}' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4167:1: ( '}' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4168:1: '}'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getRightCurlyBracketKeyword_1_3_2()); 
            match(input,18,FOLLOW_18_in_rule__EReferenceOpDef__Group_1_3__2__Impl8361); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4187:1: rule__SetterDef__Group__0 : rule__SetterDef__Group__0__Impl rule__SetterDef__Group__1 ;
    public final void rule__SetterDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4191:1: ( rule__SetterDef__Group__0__Impl rule__SetterDef__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4192:2: rule__SetterDef__Group__0__Impl rule__SetterDef__Group__1
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__0__Impl_in_rule__SetterDef__Group__08398);
            rule__SetterDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetterDef__Group__1_in_rule__SetterDef__Group__08401);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4199:1: rule__SetterDef__Group__0__Impl : ( 'set' ) ;
    public final void rule__SetterDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4203:1: ( ( 'set' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4204:1: ( 'set' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4204:1: ( 'set' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4205:1: 'set'
            {
             before(grammarAccess.getSetterDefAccess().getSetKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__SetterDef__Group__0__Impl8429); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4218:1: rule__SetterDef__Group__1 : rule__SetterDef__Group__1__Impl rule__SetterDef__Group__2 ;
    public final void rule__SetterDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4222:1: ( rule__SetterDef__Group__1__Impl rule__SetterDef__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4223:2: rule__SetterDef__Group__1__Impl rule__SetterDef__Group__2
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__1__Impl_in_rule__SetterDef__Group__18460);
            rule__SetterDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetterDef__Group__2_in_rule__SetterDef__Group__18463);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4230:1: rule__SetterDef__Group__1__Impl : ( ( rule__SetterDef__MetafeatureAssignment_1 ) ) ;
    public final void rule__SetterDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4234:1: ( ( ( rule__SetterDef__MetafeatureAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4235:1: ( ( rule__SetterDef__MetafeatureAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4235:1: ( ( rule__SetterDef__MetafeatureAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4236:1: ( rule__SetterDef__MetafeatureAssignment_1 )
            {
             before(grammarAccess.getSetterDefAccess().getMetafeatureAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4237:1: ( rule__SetterDef__MetafeatureAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4237:2: rule__SetterDef__MetafeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__SetterDef__MetafeatureAssignment_1_in_rule__SetterDef__Group__1__Impl8490);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4247:1: rule__SetterDef__Group__2 : rule__SetterDef__Group__2__Impl rule__SetterDef__Group__3 ;
    public final void rule__SetterDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4251:1: ( rule__SetterDef__Group__2__Impl rule__SetterDef__Group__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4252:2: rule__SetterDef__Group__2__Impl rule__SetterDef__Group__3
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__2__Impl_in_rule__SetterDef__Group__28520);
            rule__SetterDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetterDef__Group__3_in_rule__SetterDef__Group__28523);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4259:1: rule__SetterDef__Group__2__Impl : ( ( rule__SetterDef__OperatorAssignment_2 ) ) ;
    public final void rule__SetterDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4263:1: ( ( ( rule__SetterDef__OperatorAssignment_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4264:1: ( ( rule__SetterDef__OperatorAssignment_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4264:1: ( ( rule__SetterDef__OperatorAssignment_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4265:1: ( rule__SetterDef__OperatorAssignment_2 )
            {
             before(grammarAccess.getSetterDefAccess().getOperatorAssignment_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4266:1: ( rule__SetterDef__OperatorAssignment_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4266:2: rule__SetterDef__OperatorAssignment_2
            {
            pushFollow(FOLLOW_rule__SetterDef__OperatorAssignment_2_in_rule__SetterDef__Group__2__Impl8550);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4276:1: rule__SetterDef__Group__3 : rule__SetterDef__Group__3__Impl rule__SetterDef__Group__4 ;
    public final void rule__SetterDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4280:1: ( rule__SetterDef__Group__3__Impl rule__SetterDef__Group__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4281:2: rule__SetterDef__Group__3__Impl rule__SetterDef__Group__4
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__3__Impl_in_rule__SetterDef__Group__38580);
            rule__SetterDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetterDef__Group__4_in_rule__SetterDef__Group__38583);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4288:1: rule__SetterDef__Group__3__Impl : ( ( rule__SetterDef__ParAssignment_3 ) ) ;
    public final void rule__SetterDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4292:1: ( ( ( rule__SetterDef__ParAssignment_3 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4293:1: ( ( rule__SetterDef__ParAssignment_3 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4293:1: ( ( rule__SetterDef__ParAssignment_3 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4294:1: ( rule__SetterDef__ParAssignment_3 )
            {
             before(grammarAccess.getSetterDefAccess().getParAssignment_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4295:1: ( rule__SetterDef__ParAssignment_3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4295:2: rule__SetterDef__ParAssignment_3
            {
            pushFollow(FOLLOW_rule__SetterDef__ParAssignment_3_in_rule__SetterDef__Group__3__Impl8610);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4305:1: rule__SetterDef__Group__4 : rule__SetterDef__Group__4__Impl rule__SetterDef__Group__5 ;
    public final void rule__SetterDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4309:1: ( rule__SetterDef__Group__4__Impl rule__SetterDef__Group__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4310:2: rule__SetterDef__Group__4__Impl rule__SetterDef__Group__5
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__4__Impl_in_rule__SetterDef__Group__48640);
            rule__SetterDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetterDef__Group__5_in_rule__SetterDef__Group__48643);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4317:1: rule__SetterDef__Group__4__Impl : ( ( rule__SetterDef__Group_4__0 )* ) ;
    public final void rule__SetterDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4321:1: ( ( ( rule__SetterDef__Group_4__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4322:1: ( ( rule__SetterDef__Group_4__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4322:1: ( ( rule__SetterDef__Group_4__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4323:1: ( rule__SetterDef__Group_4__0 )*
            {
             before(grammarAccess.getSetterDefAccess().getGroup_4()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4324:1: ( rule__SetterDef__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4324:2: rule__SetterDef__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__SetterDef__Group_4__0_in_rule__SetterDef__Group__4__Impl8670);
            	    rule__SetterDef__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4334:1: rule__SetterDef__Group__5 : rule__SetterDef__Group__5__Impl ;
    public final void rule__SetterDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4338:1: ( rule__SetterDef__Group__5__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4339:2: rule__SetterDef__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SetterDef__Group__5__Impl_in_rule__SetterDef__Group__58701);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4345:1: rule__SetterDef__Group__5__Impl : ( ';' ) ;
    public final void rule__SetterDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4349:1: ( ( ';' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4350:1: ( ';' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4350:1: ( ';' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4351:1: ';'
            {
             before(grammarAccess.getSetterDefAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__SetterDef__Group__5__Impl8729); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4376:1: rule__SetterDef__Group_4__0 : rule__SetterDef__Group_4__0__Impl rule__SetterDef__Group_4__1 ;
    public final void rule__SetterDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4380:1: ( rule__SetterDef__Group_4__0__Impl rule__SetterDef__Group_4__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4381:2: rule__SetterDef__Group_4__0__Impl rule__SetterDef__Group_4__1
            {
            pushFollow(FOLLOW_rule__SetterDef__Group_4__0__Impl_in_rule__SetterDef__Group_4__08772);
            rule__SetterDef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetterDef__Group_4__1_in_rule__SetterDef__Group_4__08775);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4388:1: rule__SetterDef__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SetterDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4392:1: ( ( ',' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4393:1: ( ',' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4393:1: ( ',' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4394:1: ','
            {
             before(grammarAccess.getSetterDefAccess().getCommaKeyword_4_0()); 
            match(input,23,FOLLOW_23_in_rule__SetterDef__Group_4__0__Impl8803); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4407:1: rule__SetterDef__Group_4__1 : rule__SetterDef__Group_4__1__Impl ;
    public final void rule__SetterDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4411:1: ( rule__SetterDef__Group_4__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4412:2: rule__SetterDef__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SetterDef__Group_4__1__Impl_in_rule__SetterDef__Group_4__18834);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4418:1: rule__SetterDef__Group_4__1__Impl : ( ( rule__SetterDef__ParAssignment_4_1 ) ) ;
    public final void rule__SetterDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4422:1: ( ( ( rule__SetterDef__ParAssignment_4_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4423:1: ( ( rule__SetterDef__ParAssignment_4_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4423:1: ( ( rule__SetterDef__ParAssignment_4_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4424:1: ( rule__SetterDef__ParAssignment_4_1 )
            {
             before(grammarAccess.getSetterDefAccess().getParAssignment_4_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4425:1: ( rule__SetterDef__ParAssignment_4_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4425:2: rule__SetterDef__ParAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SetterDef__ParAssignment_4_1_in_rule__SetterDef__Group_4__1__Impl8861);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4439:1: rule__RewritingRule__Group__0 : rule__RewritingRule__Group__0__Impl rule__RewritingRule__Group__1 ;
    public final void rule__RewritingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4443:1: ( rule__RewritingRule__Group__0__Impl rule__RewritingRule__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4444:2: rule__RewritingRule__Group__0__Impl rule__RewritingRule__Group__1
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group__0__Impl_in_rule__RewritingRule__Group__08895);
            rule__RewritingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RewritingRule__Group__1_in_rule__RewritingRule__Group__08898);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4451:1: rule__RewritingRule__Group__0__Impl : ( ( rule__RewritingRule__Group_0__0 ) ) ;
    public final void rule__RewritingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4455:1: ( ( ( rule__RewritingRule__Group_0__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4456:1: ( ( rule__RewritingRule__Group_0__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4456:1: ( ( rule__RewritingRule__Group_0__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4457:1: ( rule__RewritingRule__Group_0__0 )
            {
             before(grammarAccess.getRewritingRuleAccess().getGroup_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4458:1: ( rule__RewritingRule__Group_0__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4458:2: rule__RewritingRule__Group_0__0
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_0__0_in_rule__RewritingRule__Group__0__Impl8925);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4468:1: rule__RewritingRule__Group__1 : rule__RewritingRule__Group__1__Impl ;
    public final void rule__RewritingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4472:1: ( rule__RewritingRule__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4473:2: rule__RewritingRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group__1__Impl_in_rule__RewritingRule__Group__18955);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4479:1: rule__RewritingRule__Group__1__Impl : ( ( rule__RewritingRule__Group_1__0 )* ) ;
    public final void rule__RewritingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4483:1: ( ( ( rule__RewritingRule__Group_1__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4484:1: ( ( rule__RewritingRule__Group_1__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4484:1: ( ( rule__RewritingRule__Group_1__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4485:1: ( rule__RewritingRule__Group_1__0 )*
            {
             before(grammarAccess.getRewritingRuleAccess().getGroup_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4486:1: ( rule__RewritingRule__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4486:2: rule__RewritingRule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RewritingRule__Group_1__0_in_rule__RewritingRule__Group__1__Impl8982);
            	    rule__RewritingRule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4500:1: rule__RewritingRule__Group_0__0 : rule__RewritingRule__Group_0__0__Impl rule__RewritingRule__Group_0__1 ;
    public final void rule__RewritingRule__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4504:1: ( rule__RewritingRule__Group_0__0__Impl rule__RewritingRule__Group_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4505:2: rule__RewritingRule__Group_0__0__Impl rule__RewritingRule__Group_0__1
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_0__0__Impl_in_rule__RewritingRule__Group_0__09017);
            rule__RewritingRule__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RewritingRule__Group_0__1_in_rule__RewritingRule__Group_0__09020);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4512:1: rule__RewritingRule__Group_0__0__Impl : ( ( rule__RewritingRule__MigratorSXAssignment_0_0 ) ) ;
    public final void rule__RewritingRule__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4516:1: ( ( ( rule__RewritingRule__MigratorSXAssignment_0_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4517:1: ( ( rule__RewritingRule__MigratorSXAssignment_0_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4517:1: ( ( rule__RewritingRule__MigratorSXAssignment_0_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4518:1: ( rule__RewritingRule__MigratorSXAssignment_0_0 )
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorSXAssignment_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4519:1: ( rule__RewritingRule__MigratorSXAssignment_0_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4519:2: rule__RewritingRule__MigratorSXAssignment_0_0
            {
            pushFollow(FOLLOW_rule__RewritingRule__MigratorSXAssignment_0_0_in_rule__RewritingRule__Group_0__0__Impl9047);
            rule__RewritingRule__MigratorSXAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRewritingRuleAccess().getMigratorSXAssignment_0_0()); 

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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4529:1: rule__RewritingRule__Group_0__1 : rule__RewritingRule__Group_0__1__Impl rule__RewritingRule__Group_0__2 ;
    public final void rule__RewritingRule__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4533:1: ( rule__RewritingRule__Group_0__1__Impl rule__RewritingRule__Group_0__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4534:2: rule__RewritingRule__Group_0__1__Impl rule__RewritingRule__Group_0__2
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_0__1__Impl_in_rule__RewritingRule__Group_0__19077);
            rule__RewritingRule__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RewritingRule__Group_0__2_in_rule__RewritingRule__Group_0__19080);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4541:1: rule__RewritingRule__Group_0__1__Impl : ( '->' ) ;
    public final void rule__RewritingRule__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4545:1: ( ( '->' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4546:1: ( '->' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4546:1: ( '->' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4547:1: '->'
            {
             before(grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 
            match(input,36,FOLLOW_36_in_rule__RewritingRule__Group_0__1__Impl9108); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4560:1: rule__RewritingRule__Group_0__2 : rule__RewritingRule__Group_0__2__Impl ;
    public final void rule__RewritingRule__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4564:1: ( rule__RewritingRule__Group_0__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4565:2: rule__RewritingRule__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_0__2__Impl_in_rule__RewritingRule__Group_0__29139);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4571:1: rule__RewritingRule__Group_0__2__Impl : ( ( rule__RewritingRule__MigratorDXAssignment_0_2 ) ) ;
    public final void rule__RewritingRule__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4575:1: ( ( ( rule__RewritingRule__MigratorDXAssignment_0_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4576:1: ( ( rule__RewritingRule__MigratorDXAssignment_0_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4576:1: ( ( rule__RewritingRule__MigratorDXAssignment_0_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4577:1: ( rule__RewritingRule__MigratorDXAssignment_0_2 )
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorDXAssignment_0_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4578:1: ( rule__RewritingRule__MigratorDXAssignment_0_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4578:2: rule__RewritingRule__MigratorDXAssignment_0_2
            {
            pushFollow(FOLLOW_rule__RewritingRule__MigratorDXAssignment_0_2_in_rule__RewritingRule__Group_0__2__Impl9166);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4594:1: rule__RewritingRule__Group_1__0 : rule__RewritingRule__Group_1__0__Impl rule__RewritingRule__Group_1__1 ;
    public final void rule__RewritingRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4598:1: ( rule__RewritingRule__Group_1__0__Impl rule__RewritingRule__Group_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4599:2: rule__RewritingRule__Group_1__0__Impl rule__RewritingRule__Group_1__1
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_1__0__Impl_in_rule__RewritingRule__Group_1__09202);
            rule__RewritingRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RewritingRule__Group_1__1_in_rule__RewritingRule__Group_1__09205);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4606:1: rule__RewritingRule__Group_1__0__Impl : ( '&' ) ;
    public final void rule__RewritingRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4610:1: ( ( '&' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4611:1: ( '&' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4611:1: ( '&' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4612:1: '&'
            {
             before(grammarAccess.getRewritingRuleAccess().getAmpersandKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__RewritingRule__Group_1__0__Impl9233); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4625:1: rule__RewritingRule__Group_1__1 : rule__RewritingRule__Group_1__1__Impl rule__RewritingRule__Group_1__2 ;
    public final void rule__RewritingRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4629:1: ( rule__RewritingRule__Group_1__1__Impl rule__RewritingRule__Group_1__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4630:2: rule__RewritingRule__Group_1__1__Impl rule__RewritingRule__Group_1__2
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_1__1__Impl_in_rule__RewritingRule__Group_1__19264);
            rule__RewritingRule__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RewritingRule__Group_1__2_in_rule__RewritingRule__Group_1__19267);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4637:1: rule__RewritingRule__Group_1__1__Impl : ( ( rule__RewritingRule__MigratorSXAssignment_1_1 ) ) ;
    public final void rule__RewritingRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4641:1: ( ( ( rule__RewritingRule__MigratorSXAssignment_1_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4642:1: ( ( rule__RewritingRule__MigratorSXAssignment_1_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4642:1: ( ( rule__RewritingRule__MigratorSXAssignment_1_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4643:1: ( rule__RewritingRule__MigratorSXAssignment_1_1 )
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorSXAssignment_1_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4644:1: ( rule__RewritingRule__MigratorSXAssignment_1_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4644:2: rule__RewritingRule__MigratorSXAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RewritingRule__MigratorSXAssignment_1_1_in_rule__RewritingRule__Group_1__1__Impl9294);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4654:1: rule__RewritingRule__Group_1__2 : rule__RewritingRule__Group_1__2__Impl rule__RewritingRule__Group_1__3 ;
    public final void rule__RewritingRule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4658:1: ( rule__RewritingRule__Group_1__2__Impl rule__RewritingRule__Group_1__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4659:2: rule__RewritingRule__Group_1__2__Impl rule__RewritingRule__Group_1__3
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_1__2__Impl_in_rule__RewritingRule__Group_1__29324);
            rule__RewritingRule__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RewritingRule__Group_1__3_in_rule__RewritingRule__Group_1__29327);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4666:1: rule__RewritingRule__Group_1__2__Impl : ( '->' ) ;
    public final void rule__RewritingRule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4670:1: ( ( '->' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4671:1: ( '->' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4671:1: ( '->' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4672:1: '->'
            {
             before(grammarAccess.getRewritingRuleAccess().getHyphenMinusGreaterThanSignKeyword_1_2()); 
            match(input,36,FOLLOW_36_in_rule__RewritingRule__Group_1__2__Impl9355); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4685:1: rule__RewritingRule__Group_1__3 : rule__RewritingRule__Group_1__3__Impl ;
    public final void rule__RewritingRule__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4689:1: ( rule__RewritingRule__Group_1__3__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4690:2: rule__RewritingRule__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__RewritingRule__Group_1__3__Impl_in_rule__RewritingRule__Group_1__39386);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4696:1: rule__RewritingRule__Group_1__3__Impl : ( ( rule__RewritingRule__MigratorDXAssignment_1_3 ) ) ;
    public final void rule__RewritingRule__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4700:1: ( ( ( rule__RewritingRule__MigratorDXAssignment_1_3 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4701:1: ( ( rule__RewritingRule__MigratorDXAssignment_1_3 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4701:1: ( ( rule__RewritingRule__MigratorDXAssignment_1_3 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4702:1: ( rule__RewritingRule__MigratorDXAssignment_1_3 )
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorDXAssignment_1_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4703:1: ( rule__RewritingRule__MigratorDXAssignment_1_3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4703:2: rule__RewritingRule__MigratorDXAssignment_1_3
            {
            pushFollow(FOLLOW_rule__RewritingRule__MigratorDXAssignment_1_3_in_rule__RewritingRule__Group_1__3__Impl9413);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4721:1: rule__MigratorSX__Group__0 : rule__MigratorSX__Group__0__Impl rule__MigratorSX__Group__1 ;
    public final void rule__MigratorSX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4725:1: ( rule__MigratorSX__Group__0__Impl rule__MigratorSX__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4726:2: rule__MigratorSX__Group__0__Impl rule__MigratorSX__Group__1
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__0__Impl_in_rule__MigratorSX__Group__09451);
            rule__MigratorSX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__1_in_rule__MigratorSX__Group__09454);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4733:1: rule__MigratorSX__Group__0__Impl : ( () ) ;
    public final void rule__MigratorSX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4737:1: ( ( () ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4738:1: ( () )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4738:1: ( () )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4739:1: ()
            {
             before(grammarAccess.getMigratorSXAccess().getMigratorSXAction_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4740:1: ()
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4742:1: 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4752:1: rule__MigratorSX__Group__1 : rule__MigratorSX__Group__1__Impl rule__MigratorSX__Group__2 ;
    public final void rule__MigratorSX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4756:1: ( rule__MigratorSX__Group__1__Impl rule__MigratorSX__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4757:2: rule__MigratorSX__Group__1__Impl rule__MigratorSX__Group__2
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__1__Impl_in_rule__MigratorSX__Group__19512);
            rule__MigratorSX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__2_in_rule__MigratorSX__Group__19515);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4764:1: rule__MigratorSX__Group__1__Impl : ( ( rule__MigratorSX__NameAssignment_1 ) ) ;
    public final void rule__MigratorSX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4768:1: ( ( ( rule__MigratorSX__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4769:1: ( ( rule__MigratorSX__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4769:1: ( ( rule__MigratorSX__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4770:1: ( rule__MigratorSX__NameAssignment_1 )
            {
             before(grammarAccess.getMigratorSXAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4771:1: ( rule__MigratorSX__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4771:2: rule__MigratorSX__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MigratorSX__NameAssignment_1_in_rule__MigratorSX__Group__1__Impl9542);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4781:1: rule__MigratorSX__Group__2 : rule__MigratorSX__Group__2__Impl rule__MigratorSX__Group__3 ;
    public final void rule__MigratorSX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4785:1: ( rule__MigratorSX__Group__2__Impl rule__MigratorSX__Group__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4786:2: rule__MigratorSX__Group__2__Impl rule__MigratorSX__Group__3
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__2__Impl_in_rule__MigratorSX__Group__29572);
            rule__MigratorSX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__3_in_rule__MigratorSX__Group__29575);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4793:1: rule__MigratorSX__Group__2__Impl : ( ':' ) ;
    public final void rule__MigratorSX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4797:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4798:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4798:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4799:1: ':'
            {
             before(grammarAccess.getMigratorSXAccess().getColonKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__MigratorSX__Group__2__Impl9603); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4812:1: rule__MigratorSX__Group__3 : rule__MigratorSX__Group__3__Impl rule__MigratorSX__Group__4 ;
    public final void rule__MigratorSX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4816:1: ( rule__MigratorSX__Group__3__Impl rule__MigratorSX__Group__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4817:2: rule__MigratorSX__Group__3__Impl rule__MigratorSX__Group__4
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__3__Impl_in_rule__MigratorSX__Group__39634);
            rule__MigratorSX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__4_in_rule__MigratorSX__Group__39637);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4824:1: rule__MigratorSX__Group__3__Impl : ( ( rule__MigratorSX__ElementSXAssignment_3 ) ) ;
    public final void rule__MigratorSX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4828:1: ( ( ( rule__MigratorSX__ElementSXAssignment_3 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4829:1: ( ( rule__MigratorSX__ElementSXAssignment_3 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4829:1: ( ( rule__MigratorSX__ElementSXAssignment_3 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4830:1: ( rule__MigratorSX__ElementSXAssignment_3 )
            {
             before(grammarAccess.getMigratorSXAccess().getElementSXAssignment_3()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4831:1: ( rule__MigratorSX__ElementSXAssignment_3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4831:2: rule__MigratorSX__ElementSXAssignment_3
            {
            pushFollow(FOLLOW_rule__MigratorSX__ElementSXAssignment_3_in_rule__MigratorSX__Group__3__Impl9664);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4841:1: rule__MigratorSX__Group__4 : rule__MigratorSX__Group__4__Impl rule__MigratorSX__Group__5 ;
    public final void rule__MigratorSX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4845:1: ( rule__MigratorSX__Group__4__Impl rule__MigratorSX__Group__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4846:2: rule__MigratorSX__Group__4__Impl rule__MigratorSX__Group__5
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__4__Impl_in_rule__MigratorSX__Group__49694);
            rule__MigratorSX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__5_in_rule__MigratorSX__Group__49697);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4853:1: rule__MigratorSX__Group__4__Impl : ( 'where' ) ;
    public final void rule__MigratorSX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4857:1: ( ( 'where' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4858:1: ( 'where' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4858:1: ( 'where' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4859:1: 'where'
            {
             before(grammarAccess.getMigratorSXAccess().getWhereKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__MigratorSX__Group__4__Impl9725); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4872:1: rule__MigratorSX__Group__5 : rule__MigratorSX__Group__5__Impl rule__MigratorSX__Group__6 ;
    public final void rule__MigratorSX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4876:1: ( rule__MigratorSX__Group__5__Impl rule__MigratorSX__Group__6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4877:2: rule__MigratorSX__Group__5__Impl rule__MigratorSX__Group__6
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__5__Impl_in_rule__MigratorSX__Group__59756);
            rule__MigratorSX__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__6_in_rule__MigratorSX__Group__59759);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4884:1: rule__MigratorSX__Group__5__Impl : ( '[' ) ;
    public final void rule__MigratorSX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4888:1: ( ( '[' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4889:1: ( '[' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4889:1: ( '[' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4890:1: '['
            {
             before(grammarAccess.getMigratorSXAccess().getLeftSquareBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__MigratorSX__Group__5__Impl9787); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4903:1: rule__MigratorSX__Group__6 : rule__MigratorSX__Group__6__Impl rule__MigratorSX__Group__7 ;
    public final void rule__MigratorSX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4907:1: ( rule__MigratorSX__Group__6__Impl rule__MigratorSX__Group__7 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4908:2: rule__MigratorSX__Group__6__Impl rule__MigratorSX__Group__7
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__6__Impl_in_rule__MigratorSX__Group__69818);
            rule__MigratorSX__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__7_in_rule__MigratorSX__Group__69821);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4915:1: rule__MigratorSX__Group__6__Impl : ( ( rule__MigratorSX__FilterSXAssignment_6 ) ) ;
    public final void rule__MigratorSX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4919:1: ( ( ( rule__MigratorSX__FilterSXAssignment_6 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4920:1: ( ( rule__MigratorSX__FilterSXAssignment_6 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4920:1: ( ( rule__MigratorSX__FilterSXAssignment_6 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4921:1: ( rule__MigratorSX__FilterSXAssignment_6 )
            {
             before(grammarAccess.getMigratorSXAccess().getFilterSXAssignment_6()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4922:1: ( rule__MigratorSX__FilterSXAssignment_6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4922:2: rule__MigratorSX__FilterSXAssignment_6
            {
            pushFollow(FOLLOW_rule__MigratorSX__FilterSXAssignment_6_in_rule__MigratorSX__Group__6__Impl9848);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4932:1: rule__MigratorSX__Group__7 : rule__MigratorSX__Group__7__Impl rule__MigratorSX__Group__8 ;
    public final void rule__MigratorSX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4936:1: ( rule__MigratorSX__Group__7__Impl rule__MigratorSX__Group__8 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4937:2: rule__MigratorSX__Group__7__Impl rule__MigratorSX__Group__8
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__7__Impl_in_rule__MigratorSX__Group__79878);
            rule__MigratorSX__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group__8_in_rule__MigratorSX__Group__79881);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4944:1: rule__MigratorSX__Group__7__Impl : ( ( rule__MigratorSX__Group_7__0 )* ) ;
    public final void rule__MigratorSX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4948:1: ( ( ( rule__MigratorSX__Group_7__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4949:1: ( ( rule__MigratorSX__Group_7__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4949:1: ( ( rule__MigratorSX__Group_7__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4950:1: ( rule__MigratorSX__Group_7__0 )*
            {
             before(grammarAccess.getMigratorSXAccess().getGroup_7()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4951:1: ( rule__MigratorSX__Group_7__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4951:2: rule__MigratorSX__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__MigratorSX__Group_7__0_in_rule__MigratorSX__Group__7__Impl9908);
            	    rule__MigratorSX__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4961:1: rule__MigratorSX__Group__8 : rule__MigratorSX__Group__8__Impl ;
    public final void rule__MigratorSX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4965:1: ( rule__MigratorSX__Group__8__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4966:2: rule__MigratorSX__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group__8__Impl_in_rule__MigratorSX__Group__89939);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4972:1: rule__MigratorSX__Group__8__Impl : ( ']' ) ;
    public final void rule__MigratorSX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4976:1: ( ( ']' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4977:1: ( ']' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4977:1: ( ']' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:4978:1: ']'
            {
             before(grammarAccess.getMigratorSXAccess().getRightSquareBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__MigratorSX__Group__8__Impl9967); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5009:1: rule__MigratorSX__Group_7__0 : rule__MigratorSX__Group_7__0__Impl rule__MigratorSX__Group_7__1 ;
    public final void rule__MigratorSX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5013:1: ( rule__MigratorSX__Group_7__0__Impl rule__MigratorSX__Group_7__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5014:2: rule__MigratorSX__Group_7__0__Impl rule__MigratorSX__Group_7__1
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group_7__0__Impl_in_rule__MigratorSX__Group_7__010016);
            rule__MigratorSX__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorSX__Group_7__1_in_rule__MigratorSX__Group_7__010019);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5021:1: rule__MigratorSX__Group_7__0__Impl : ( '&' ) ;
    public final void rule__MigratorSX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5025:1: ( ( '&' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5026:1: ( '&' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5026:1: ( '&' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5027:1: '&'
            {
             before(grammarAccess.getMigratorSXAccess().getAmpersandKeyword_7_0()); 
            match(input,37,FOLLOW_37_in_rule__MigratorSX__Group_7__0__Impl10047); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5040:1: rule__MigratorSX__Group_7__1 : rule__MigratorSX__Group_7__1__Impl ;
    public final void rule__MigratorSX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5044:1: ( rule__MigratorSX__Group_7__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5045:2: rule__MigratorSX__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__MigratorSX__Group_7__1__Impl_in_rule__MigratorSX__Group_7__110078);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5051:1: rule__MigratorSX__Group_7__1__Impl : ( ( rule__MigratorSX__FilterSXAssignment_7_1 ) ) ;
    public final void rule__MigratorSX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5055:1: ( ( ( rule__MigratorSX__FilterSXAssignment_7_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5056:1: ( ( rule__MigratorSX__FilterSXAssignment_7_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5056:1: ( ( rule__MigratorSX__FilterSXAssignment_7_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5057:1: ( rule__MigratorSX__FilterSXAssignment_7_1 )
            {
             before(grammarAccess.getMigratorSXAccess().getFilterSXAssignment_7_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5058:1: ( rule__MigratorSX__FilterSXAssignment_7_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5058:2: rule__MigratorSX__FilterSXAssignment_7_1
            {
            pushFollow(FOLLOW_rule__MigratorSX__FilterSXAssignment_7_1_in_rule__MigratorSX__Group_7__1__Impl10105);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5072:1: rule__MigratorDX__Group_0__0 : rule__MigratorDX__Group_0__0__Impl rule__MigratorDX__Group_0__1 ;
    public final void rule__MigratorDX__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5076:1: ( rule__MigratorDX__Group_0__0__Impl rule__MigratorDX__Group_0__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5077:2: rule__MigratorDX__Group_0__0__Impl rule__MigratorDX__Group_0__1
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0__0__Impl_in_rule__MigratorDX__Group_0__010139);
            rule__MigratorDX__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0__1_in_rule__MigratorDX__Group_0__010142);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5084:1: rule__MigratorDX__Group_0__0__Impl : ( () ) ;
    public final void rule__MigratorDX__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5088:1: ( ( () ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5089:1: ( () )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5089:1: ( () )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5090:1: ()
            {
             before(grammarAccess.getMigratorDXAccess().getMigratorDXAction_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5091:1: ()
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5093:1: 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5103:1: rule__MigratorDX__Group_0__1 : rule__MigratorDX__Group_0__1__Impl ;
    public final void rule__MigratorDX__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5107:1: ( rule__MigratorDX__Group_0__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5108:2: rule__MigratorDX__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0__1__Impl_in_rule__MigratorDX__Group_0__110200);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5114:1: rule__MigratorDX__Group_0__1__Impl : ( ( rule__MigratorDX__Group_0_1__0 ) ) ;
    public final void rule__MigratorDX__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5118:1: ( ( ( rule__MigratorDX__Group_0_1__0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5119:1: ( ( rule__MigratorDX__Group_0_1__0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5119:1: ( ( rule__MigratorDX__Group_0_1__0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5120:1: ( rule__MigratorDX__Group_0_1__0 )
            {
             before(grammarAccess.getMigratorDXAccess().getGroup_0_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5121:1: ( rule__MigratorDX__Group_0_1__0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5121:2: rule__MigratorDX__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__0_in_rule__MigratorDX__Group_0__1__Impl10227);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5135:1: rule__MigratorDX__Group_0_1__0 : rule__MigratorDX__Group_0_1__0__Impl rule__MigratorDX__Group_0_1__1 ;
    public final void rule__MigratorDX__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5139:1: ( rule__MigratorDX__Group_0_1__0__Impl rule__MigratorDX__Group_0_1__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5140:2: rule__MigratorDX__Group_0_1__0__Impl rule__MigratorDX__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__0__Impl_in_rule__MigratorDX__Group_0_1__010261);
            rule__MigratorDX__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__1_in_rule__MigratorDX__Group_0_1__010264);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5147:1: rule__MigratorDX__Group_0_1__0__Impl : ( ( rule__MigratorDX__NameAssignment_0_1_0 ) ) ;
    public final void rule__MigratorDX__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5151:1: ( ( ( rule__MigratorDX__NameAssignment_0_1_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5152:1: ( ( rule__MigratorDX__NameAssignment_0_1_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5152:1: ( ( rule__MigratorDX__NameAssignment_0_1_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5153:1: ( rule__MigratorDX__NameAssignment_0_1_0 )
            {
             before(grammarAccess.getMigratorDXAccess().getNameAssignment_0_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5154:1: ( rule__MigratorDX__NameAssignment_0_1_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5154:2: rule__MigratorDX__NameAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__MigratorDX__NameAssignment_0_1_0_in_rule__MigratorDX__Group_0_1__0__Impl10291);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5164:1: rule__MigratorDX__Group_0_1__1 : rule__MigratorDX__Group_0_1__1__Impl rule__MigratorDX__Group_0_1__2 ;
    public final void rule__MigratorDX__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5168:1: ( rule__MigratorDX__Group_0_1__1__Impl rule__MigratorDX__Group_0_1__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5169:2: rule__MigratorDX__Group_0_1__1__Impl rule__MigratorDX__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__1__Impl_in_rule__MigratorDX__Group_0_1__110321);
            rule__MigratorDX__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__2_in_rule__MigratorDX__Group_0_1__110324);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5176:1: rule__MigratorDX__Group_0_1__1__Impl : ( ':' ) ;
    public final void rule__MigratorDX__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5180:1: ( ( ':' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5181:1: ( ':' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5181:1: ( ':' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5182:1: ':'
            {
             before(grammarAccess.getMigratorDXAccess().getColonKeyword_0_1_1()); 
            match(input,20,FOLLOW_20_in_rule__MigratorDX__Group_0_1__1__Impl10352); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5195:1: rule__MigratorDX__Group_0_1__2 : rule__MigratorDX__Group_0_1__2__Impl rule__MigratorDX__Group_0_1__3 ;
    public final void rule__MigratorDX__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5199:1: ( rule__MigratorDX__Group_0_1__2__Impl rule__MigratorDX__Group_0_1__3 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5200:2: rule__MigratorDX__Group_0_1__2__Impl rule__MigratorDX__Group_0_1__3
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__2__Impl_in_rule__MigratorDX__Group_0_1__210383);
            rule__MigratorDX__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__3_in_rule__MigratorDX__Group_0_1__210386);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5207:1: rule__MigratorDX__Group_0_1__2__Impl : ( ( rule__MigratorDX__ElementDXAssignment_0_1_2 ) ) ;
    public final void rule__MigratorDX__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5211:1: ( ( ( rule__MigratorDX__ElementDXAssignment_0_1_2 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5212:1: ( ( rule__MigratorDX__ElementDXAssignment_0_1_2 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5212:1: ( ( rule__MigratorDX__ElementDXAssignment_0_1_2 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5213:1: ( rule__MigratorDX__ElementDXAssignment_0_1_2 )
            {
             before(grammarAccess.getMigratorDXAccess().getElementDXAssignment_0_1_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5214:1: ( rule__MigratorDX__ElementDXAssignment_0_1_2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5214:2: rule__MigratorDX__ElementDXAssignment_0_1_2
            {
            pushFollow(FOLLOW_rule__MigratorDX__ElementDXAssignment_0_1_2_in_rule__MigratorDX__Group_0_1__2__Impl10413);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5224:1: rule__MigratorDX__Group_0_1__3 : rule__MigratorDX__Group_0_1__3__Impl rule__MigratorDX__Group_0_1__4 ;
    public final void rule__MigratorDX__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5228:1: ( rule__MigratorDX__Group_0_1__3__Impl rule__MigratorDX__Group_0_1__4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5229:2: rule__MigratorDX__Group_0_1__3__Impl rule__MigratorDX__Group_0_1__4
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__3__Impl_in_rule__MigratorDX__Group_0_1__310443);
            rule__MigratorDX__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__4_in_rule__MigratorDX__Group_0_1__310446);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5236:1: rule__MigratorDX__Group_0_1__3__Impl : ( '[' ) ;
    public final void rule__MigratorDX__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5240:1: ( ( '[' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5241:1: ( '[' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5241:1: ( '[' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5242:1: '['
            {
             before(grammarAccess.getMigratorDXAccess().getLeftSquareBracketKeyword_0_1_3()); 
            match(input,25,FOLLOW_25_in_rule__MigratorDX__Group_0_1__3__Impl10474); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5255:1: rule__MigratorDX__Group_0_1__4 : rule__MigratorDX__Group_0_1__4__Impl rule__MigratorDX__Group_0_1__5 ;
    public final void rule__MigratorDX__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5259:1: ( rule__MigratorDX__Group_0_1__4__Impl rule__MigratorDX__Group_0_1__5 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5260:2: rule__MigratorDX__Group_0_1__4__Impl rule__MigratorDX__Group_0_1__5
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__4__Impl_in_rule__MigratorDX__Group_0_1__410505);
            rule__MigratorDX__Group_0_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__5_in_rule__MigratorDX__Group_0_1__410508);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5267:1: rule__MigratorDX__Group_0_1__4__Impl : ( ( rule__MigratorDX__FilterDXAssignment_0_1_4 ) ) ;
    public final void rule__MigratorDX__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5271:1: ( ( ( rule__MigratorDX__FilterDXAssignment_0_1_4 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5272:1: ( ( rule__MigratorDX__FilterDXAssignment_0_1_4 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5272:1: ( ( rule__MigratorDX__FilterDXAssignment_0_1_4 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5273:1: ( rule__MigratorDX__FilterDXAssignment_0_1_4 )
            {
             before(grammarAccess.getMigratorDXAccess().getFilterDXAssignment_0_1_4()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5274:1: ( rule__MigratorDX__FilterDXAssignment_0_1_4 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5274:2: rule__MigratorDX__FilterDXAssignment_0_1_4
            {
            pushFollow(FOLLOW_rule__MigratorDX__FilterDXAssignment_0_1_4_in_rule__MigratorDX__Group_0_1__4__Impl10535);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5284:1: rule__MigratorDX__Group_0_1__5 : rule__MigratorDX__Group_0_1__5__Impl rule__MigratorDX__Group_0_1__6 ;
    public final void rule__MigratorDX__Group_0_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5288:1: ( rule__MigratorDX__Group_0_1__5__Impl rule__MigratorDX__Group_0_1__6 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5289:2: rule__MigratorDX__Group_0_1__5__Impl rule__MigratorDX__Group_0_1__6
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__5__Impl_in_rule__MigratorDX__Group_0_1__510565);
            rule__MigratorDX__Group_0_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__6_in_rule__MigratorDX__Group_0_1__510568);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5296:1: rule__MigratorDX__Group_0_1__5__Impl : ( ( rule__MigratorDX__Group_0_1_5__0 )* ) ;
    public final void rule__MigratorDX__Group_0_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5300:1: ( ( ( rule__MigratorDX__Group_0_1_5__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5301:1: ( ( rule__MigratorDX__Group_0_1_5__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5301:1: ( ( rule__MigratorDX__Group_0_1_5__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5302:1: ( rule__MigratorDX__Group_0_1_5__0 )*
            {
             before(grammarAccess.getMigratorDXAccess().getGroup_0_1_5()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5303:1: ( rule__MigratorDX__Group_0_1_5__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5303:2: rule__MigratorDX__Group_0_1_5__0
            	    {
            	    pushFollow(FOLLOW_rule__MigratorDX__Group_0_1_5__0_in_rule__MigratorDX__Group_0_1__5__Impl10595);
            	    rule__MigratorDX__Group_0_1_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5313:1: rule__MigratorDX__Group_0_1__6 : rule__MigratorDX__Group_0_1__6__Impl ;
    public final void rule__MigratorDX__Group_0_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5317:1: ( rule__MigratorDX__Group_0_1__6__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5318:2: rule__MigratorDX__Group_0_1__6__Impl
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1__6__Impl_in_rule__MigratorDX__Group_0_1__610626);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5324:1: rule__MigratorDX__Group_0_1__6__Impl : ( ']' ) ;
    public final void rule__MigratorDX__Group_0_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5328:1: ( ( ']' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5329:1: ( ']' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5329:1: ( ']' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5330:1: ']'
            {
             before(grammarAccess.getMigratorDXAccess().getRightSquareBracketKeyword_0_1_6()); 
            match(input,26,FOLLOW_26_in_rule__MigratorDX__Group_0_1__6__Impl10654); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5357:1: rule__MigratorDX__Group_0_1_5__0 : rule__MigratorDX__Group_0_1_5__0__Impl rule__MigratorDX__Group_0_1_5__1 ;
    public final void rule__MigratorDX__Group_0_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5361:1: ( rule__MigratorDX__Group_0_1_5__0__Impl rule__MigratorDX__Group_0_1_5__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5362:2: rule__MigratorDX__Group_0_1_5__0__Impl rule__MigratorDX__Group_0_1_5__1
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1_5__0__Impl_in_rule__MigratorDX__Group_0_1_5__010699);
            rule__MigratorDX__Group_0_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1_5__1_in_rule__MigratorDX__Group_0_1_5__010702);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5369:1: rule__MigratorDX__Group_0_1_5__0__Impl : ( '&' ) ;
    public final void rule__MigratorDX__Group_0_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5373:1: ( ( '&' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5374:1: ( '&' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5374:1: ( '&' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5375:1: '&'
            {
             before(grammarAccess.getMigratorDXAccess().getAmpersandKeyword_0_1_5_0()); 
            match(input,37,FOLLOW_37_in_rule__MigratorDX__Group_0_1_5__0__Impl10730); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5388:1: rule__MigratorDX__Group_0_1_5__1 : rule__MigratorDX__Group_0_1_5__1__Impl ;
    public final void rule__MigratorDX__Group_0_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5392:1: ( rule__MigratorDX__Group_0_1_5__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5393:2: rule__MigratorDX__Group_0_1_5__1__Impl
            {
            pushFollow(FOLLOW_rule__MigratorDX__Group_0_1_5__1__Impl_in_rule__MigratorDX__Group_0_1_5__110761);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5399:1: rule__MigratorDX__Group_0_1_5__1__Impl : ( ( rule__MigratorDX__FilterDXAssignment_0_1_5_1 ) ) ;
    public final void rule__MigratorDX__Group_0_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5403:1: ( ( ( rule__MigratorDX__FilterDXAssignment_0_1_5_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5404:1: ( ( rule__MigratorDX__FilterDXAssignment_0_1_5_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5404:1: ( ( rule__MigratorDX__FilterDXAssignment_0_1_5_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5405:1: ( rule__MigratorDX__FilterDXAssignment_0_1_5_1 )
            {
             before(grammarAccess.getMigratorDXAccess().getFilterDXAssignment_0_1_5_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5406:1: ( rule__MigratorDX__FilterDXAssignment_0_1_5_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5406:2: rule__MigratorDX__FilterDXAssignment_0_1_5_1
            {
            pushFollow(FOLLOW_rule__MigratorDX__FilterDXAssignment_0_1_5_1_in_rule__MigratorDX__Group_0_1_5__1__Impl10788);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5420:1: rule__FilterMigrator__Group__0 : rule__FilterMigrator__Group__0__Impl rule__FilterMigrator__Group__1 ;
    public final void rule__FilterMigrator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5424:1: ( rule__FilterMigrator__Group__0__Impl rule__FilterMigrator__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5425:2: rule__FilterMigrator__Group__0__Impl rule__FilterMigrator__Group__1
            {
            pushFollow(FOLLOW_rule__FilterMigrator__Group__0__Impl_in_rule__FilterMigrator__Group__010822);
            rule__FilterMigrator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterMigrator__Group__1_in_rule__FilterMigrator__Group__010825);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5432:1: rule__FilterMigrator__Group__0__Impl : ( ( rule__FilterMigrator__FeatureSXAssignment_0 ) ) ;
    public final void rule__FilterMigrator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5436:1: ( ( ( rule__FilterMigrator__FeatureSXAssignment_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5437:1: ( ( rule__FilterMigrator__FeatureSXAssignment_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5437:1: ( ( rule__FilterMigrator__FeatureSXAssignment_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5438:1: ( rule__FilterMigrator__FeatureSXAssignment_0 )
            {
             before(grammarAccess.getFilterMigratorAccess().getFeatureSXAssignment_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5439:1: ( rule__FilterMigrator__FeatureSXAssignment_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5439:2: rule__FilterMigrator__FeatureSXAssignment_0
            {
            pushFollow(FOLLOW_rule__FilterMigrator__FeatureSXAssignment_0_in_rule__FilterMigrator__Group__0__Impl10852);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5449:1: rule__FilterMigrator__Group__1 : rule__FilterMigrator__Group__1__Impl rule__FilterMigrator__Group__2 ;
    public final void rule__FilterMigrator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5453:1: ( rule__FilterMigrator__Group__1__Impl rule__FilterMigrator__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5454:2: rule__FilterMigrator__Group__1__Impl rule__FilterMigrator__Group__2
            {
            pushFollow(FOLLOW_rule__FilterMigrator__Group__1__Impl_in_rule__FilterMigrator__Group__110882);
            rule__FilterMigrator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterMigrator__Group__2_in_rule__FilterMigrator__Group__110885);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5461:1: rule__FilterMigrator__Group__1__Impl : ( ( rule__FilterMigrator__OpAssignment_1 ) ) ;
    public final void rule__FilterMigrator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5465:1: ( ( ( rule__FilterMigrator__OpAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5466:1: ( ( rule__FilterMigrator__OpAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5466:1: ( ( rule__FilterMigrator__OpAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5467:1: ( rule__FilterMigrator__OpAssignment_1 )
            {
             before(grammarAccess.getFilterMigratorAccess().getOpAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5468:1: ( rule__FilterMigrator__OpAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5468:2: rule__FilterMigrator__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterMigrator__OpAssignment_1_in_rule__FilterMigrator__Group__1__Impl10912);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5478:1: rule__FilterMigrator__Group__2 : rule__FilterMigrator__Group__2__Impl ;
    public final void rule__FilterMigrator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5482:1: ( rule__FilterMigrator__Group__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5483:2: rule__FilterMigrator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FilterMigrator__Group__2__Impl_in_rule__FilterMigrator__Group__210942);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5489:1: rule__FilterMigrator__Group__2__Impl : ( ( rule__FilterMigrator__ValueAssignment_2 )? ) ;
    public final void rule__FilterMigrator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5493:1: ( ( ( rule__FilterMigrator__ValueAssignment_2 )? ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5494:1: ( ( rule__FilterMigrator__ValueAssignment_2 )? )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5494:1: ( ( rule__FilterMigrator__ValueAssignment_2 )? )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5495:1: ( rule__FilterMigrator__ValueAssignment_2 )?
            {
             before(grammarAccess.getFilterMigratorAccess().getValueAssignment_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5496:1: ( rule__FilterMigrator__ValueAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5496:2: rule__FilterMigrator__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FilterMigrator__ValueAssignment_2_in_rule__FilterMigrator__Group__2__Impl10969);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5512:1: rule__DotNavigationObjSX__Group__0 : rule__DotNavigationObjSX__Group__0__Impl rule__DotNavigationObjSX__Group__1 ;
    public final void rule__DotNavigationObjSX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5516:1: ( rule__DotNavigationObjSX__Group__0__Impl rule__DotNavigationObjSX__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5517:2: rule__DotNavigationObjSX__Group__0__Impl rule__DotNavigationObjSX__Group__1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group__0__Impl_in_rule__DotNavigationObjSX__Group__011006);
            rule__DotNavigationObjSX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group__1_in_rule__DotNavigationObjSX__Group__011009);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5524:1: rule__DotNavigationObjSX__Group__0__Impl : ( '#' ) ;
    public final void rule__DotNavigationObjSX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5528:1: ( ( '#' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5529:1: ( '#' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5529:1: ( '#' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5530:1: '#'
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getNumberSignKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__DotNavigationObjSX__Group__0__Impl11037); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5543:1: rule__DotNavigationObjSX__Group__1 : rule__DotNavigationObjSX__Group__1__Impl rule__DotNavigationObjSX__Group__2 ;
    public final void rule__DotNavigationObjSX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5547:1: ( rule__DotNavigationObjSX__Group__1__Impl rule__DotNavigationObjSX__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5548:2: rule__DotNavigationObjSX__Group__1__Impl rule__DotNavigationObjSX__Group__2
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group__1__Impl_in_rule__DotNavigationObjSX__Group__111068);
            rule__DotNavigationObjSX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group__2_in_rule__DotNavigationObjSX__Group__111071);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5555:1: rule__DotNavigationObjSX__Group__1__Impl : ( ( rule__DotNavigationObjSX__ObjAssignment_1 ) ) ;
    public final void rule__DotNavigationObjSX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5559:1: ( ( ( rule__DotNavigationObjSX__ObjAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5560:1: ( ( rule__DotNavigationObjSX__ObjAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5560:1: ( ( rule__DotNavigationObjSX__ObjAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5561:1: ( rule__DotNavigationObjSX__ObjAssignment_1 )
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getObjAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5562:1: ( rule__DotNavigationObjSX__ObjAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5562:2: rule__DotNavigationObjSX__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__ObjAssignment_1_in_rule__DotNavigationObjSX__Group__1__Impl11098);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5572:1: rule__DotNavigationObjSX__Group__2 : rule__DotNavigationObjSX__Group__2__Impl ;
    public final void rule__DotNavigationObjSX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5576:1: ( rule__DotNavigationObjSX__Group__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5577:2: rule__DotNavigationObjSX__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group__2__Impl_in_rule__DotNavigationObjSX__Group__211128);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5583:1: rule__DotNavigationObjSX__Group__2__Impl : ( ( rule__DotNavigationObjSX__Group_2__0 )* ) ;
    public final void rule__DotNavigationObjSX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5587:1: ( ( ( rule__DotNavigationObjSX__Group_2__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5588:1: ( ( rule__DotNavigationObjSX__Group_2__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5588:1: ( ( rule__DotNavigationObjSX__Group_2__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5589:1: ( rule__DotNavigationObjSX__Group_2__0 )*
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getGroup_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5590:1: ( rule__DotNavigationObjSX__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==39) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5590:2: rule__DotNavigationObjSX__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__DotNavigationObjSX__Group_2__0_in_rule__DotNavigationObjSX__Group__2__Impl11155);
            	    rule__DotNavigationObjSX__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5606:1: rule__DotNavigationObjSX__Group_2__0 : rule__DotNavigationObjSX__Group_2__0__Impl rule__DotNavigationObjSX__Group_2__1 ;
    public final void rule__DotNavigationObjSX__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5610:1: ( rule__DotNavigationObjSX__Group_2__0__Impl rule__DotNavigationObjSX__Group_2__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5611:2: rule__DotNavigationObjSX__Group_2__0__Impl rule__DotNavigationObjSX__Group_2__1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group_2__0__Impl_in_rule__DotNavigationObjSX__Group_2__011192);
            rule__DotNavigationObjSX__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group_2__1_in_rule__DotNavigationObjSX__Group_2__011195);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5618:1: rule__DotNavigationObjSX__Group_2__0__Impl : ( '.' ) ;
    public final void rule__DotNavigationObjSX__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5622:1: ( ( '.' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5623:1: ( '.' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5623:1: ( '.' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5624:1: '.'
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getFullStopKeyword_2_0()); 
            match(input,39,FOLLOW_39_in_rule__DotNavigationObjSX__Group_2__0__Impl11223); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5637:1: rule__DotNavigationObjSX__Group_2__1 : rule__DotNavigationObjSX__Group_2__1__Impl ;
    public final void rule__DotNavigationObjSX__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5641:1: ( rule__DotNavigationObjSX__Group_2__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5642:2: rule__DotNavigationObjSX__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__Group_2__1__Impl_in_rule__DotNavigationObjSX__Group_2__111254);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5648:1: rule__DotNavigationObjSX__Group_2__1__Impl : ( ( rule__DotNavigationObjSX__RefAssignment_2_1 ) ) ;
    public final void rule__DotNavigationObjSX__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5652:1: ( ( ( rule__DotNavigationObjSX__RefAssignment_2_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5653:1: ( ( rule__DotNavigationObjSX__RefAssignment_2_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5653:1: ( ( rule__DotNavigationObjSX__RefAssignment_2_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5654:1: ( rule__DotNavigationObjSX__RefAssignment_2_1 )
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getRefAssignment_2_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5655:1: ( rule__DotNavigationObjSX__RefAssignment_2_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5655:2: rule__DotNavigationObjSX__RefAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjSX__RefAssignment_2_1_in_rule__DotNavigationObjSX__Group_2__1__Impl11281);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5669:1: rule__DotNavigationObjDX__Group__0 : rule__DotNavigationObjDX__Group__0__Impl rule__DotNavigationObjDX__Group__1 ;
    public final void rule__DotNavigationObjDX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5673:1: ( rule__DotNavigationObjDX__Group__0__Impl rule__DotNavigationObjDX__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5674:2: rule__DotNavigationObjDX__Group__0__Impl rule__DotNavigationObjDX__Group__1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group__0__Impl_in_rule__DotNavigationObjDX__Group__011315);
            rule__DotNavigationObjDX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group__1_in_rule__DotNavigationObjDX__Group__011318);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5681:1: rule__DotNavigationObjDX__Group__0__Impl : ( '#' ) ;
    public final void rule__DotNavigationObjDX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5685:1: ( ( '#' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5686:1: ( '#' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5686:1: ( '#' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5687:1: '#'
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getNumberSignKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__DotNavigationObjDX__Group__0__Impl11346); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5700:1: rule__DotNavigationObjDX__Group__1 : rule__DotNavigationObjDX__Group__1__Impl rule__DotNavigationObjDX__Group__2 ;
    public final void rule__DotNavigationObjDX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5704:1: ( rule__DotNavigationObjDX__Group__1__Impl rule__DotNavigationObjDX__Group__2 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5705:2: rule__DotNavigationObjDX__Group__1__Impl rule__DotNavigationObjDX__Group__2
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group__1__Impl_in_rule__DotNavigationObjDX__Group__111377);
            rule__DotNavigationObjDX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group__2_in_rule__DotNavigationObjDX__Group__111380);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5712:1: rule__DotNavigationObjDX__Group__1__Impl : ( ( rule__DotNavigationObjDX__ObjAssignment_1 ) ) ;
    public final void rule__DotNavigationObjDX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5716:1: ( ( ( rule__DotNavigationObjDX__ObjAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5717:1: ( ( rule__DotNavigationObjDX__ObjAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5717:1: ( ( rule__DotNavigationObjDX__ObjAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5718:1: ( rule__DotNavigationObjDX__ObjAssignment_1 )
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getObjAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5719:1: ( rule__DotNavigationObjDX__ObjAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5719:2: rule__DotNavigationObjDX__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__ObjAssignment_1_in_rule__DotNavigationObjDX__Group__1__Impl11407);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5729:1: rule__DotNavigationObjDX__Group__2 : rule__DotNavigationObjDX__Group__2__Impl ;
    public final void rule__DotNavigationObjDX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5733:1: ( rule__DotNavigationObjDX__Group__2__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5734:2: rule__DotNavigationObjDX__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group__2__Impl_in_rule__DotNavigationObjDX__Group__211437);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5740:1: rule__DotNavigationObjDX__Group__2__Impl : ( ( rule__DotNavigationObjDX__Group_2__0 )* ) ;
    public final void rule__DotNavigationObjDX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5744:1: ( ( ( rule__DotNavigationObjDX__Group_2__0 )* ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5745:1: ( ( rule__DotNavigationObjDX__Group_2__0 )* )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5745:1: ( ( rule__DotNavigationObjDX__Group_2__0 )* )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5746:1: ( rule__DotNavigationObjDX__Group_2__0 )*
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getGroup_2()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5747:1: ( rule__DotNavigationObjDX__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==39) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5747:2: rule__DotNavigationObjDX__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__DotNavigationObjDX__Group_2__0_in_rule__DotNavigationObjDX__Group__2__Impl11464);
            	    rule__DotNavigationObjDX__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5763:1: rule__DotNavigationObjDX__Group_2__0 : rule__DotNavigationObjDX__Group_2__0__Impl rule__DotNavigationObjDX__Group_2__1 ;
    public final void rule__DotNavigationObjDX__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5767:1: ( rule__DotNavigationObjDX__Group_2__0__Impl rule__DotNavigationObjDX__Group_2__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5768:2: rule__DotNavigationObjDX__Group_2__0__Impl rule__DotNavigationObjDX__Group_2__1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group_2__0__Impl_in_rule__DotNavigationObjDX__Group_2__011501);
            rule__DotNavigationObjDX__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group_2__1_in_rule__DotNavigationObjDX__Group_2__011504);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5775:1: rule__DotNavigationObjDX__Group_2__0__Impl : ( '.' ) ;
    public final void rule__DotNavigationObjDX__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5779:1: ( ( '.' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5780:1: ( '.' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5780:1: ( '.' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5781:1: '.'
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getFullStopKeyword_2_0()); 
            match(input,39,FOLLOW_39_in_rule__DotNavigationObjDX__Group_2__0__Impl11532); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5794:1: rule__DotNavigationObjDX__Group_2__1 : rule__DotNavigationObjDX__Group_2__1__Impl ;
    public final void rule__DotNavigationObjDX__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5798:1: ( rule__DotNavigationObjDX__Group_2__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5799:2: rule__DotNavigationObjDX__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__Group_2__1__Impl_in_rule__DotNavigationObjDX__Group_2__111563);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5805:1: rule__DotNavigationObjDX__Group_2__1__Impl : ( ( rule__DotNavigationObjDX__RefAssignment_2_1 ) ) ;
    public final void rule__DotNavigationObjDX__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5809:1: ( ( ( rule__DotNavigationObjDX__RefAssignment_2_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5810:1: ( ( rule__DotNavigationObjDX__RefAssignment_2_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5810:1: ( ( rule__DotNavigationObjDX__RefAssignment_2_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5811:1: ( rule__DotNavigationObjDX__RefAssignment_2_1 )
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getRefAssignment_2_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5812:1: ( rule__DotNavigationObjDX__RefAssignment_2_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5812:2: rule__DotNavigationObjDX__RefAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DotNavigationObjDX__RefAssignment_2_1_in_rule__DotNavigationObjDX__Group_2__1__Impl11590);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5826:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5830:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5831:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__011624);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__011627);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5838:1: rule__Parameter__Group__0__Impl : ( '%' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5842:1: ( ( '%' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5843:1: ( '%' )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5843:1: ( '%' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5844:1: '%'
            {
             before(grammarAccess.getParameterAccess().getPercentSignKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Parameter__Group__0__Impl11655); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5857:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5861:1: ( rule__Parameter__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5862:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__111686);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5868:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5872:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5873:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5873:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5874:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5875:1: ( rule__Parameter__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5875:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl11713);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5889:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5893:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5894:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__011747);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__011750);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5901:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5905:1: ( ( () ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5906:1: ( () )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5906:1: ( () )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5907:1: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5908:1: ()
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5910:1: 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5920:1: rule__Package__Group__1 : rule__Package__Group__1__Impl ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5924:1: ( rule__Package__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5925:2: rule__Package__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__111808);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5931:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5935:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5936:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5936:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5937:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5938:1: ( rule__Package__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5938:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl11835);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5952:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5956:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5957:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__011869);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__011872);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5964:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5968:1: ( ( () ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5969:1: ( () )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5969:1: ( () )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5970:1: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5971:1: ()
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5973:1: 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5983:1: rule__Class__Group__1 : rule__Class__Group__1__Impl ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5987:1: ( rule__Class__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5988:2: rule__Class__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__111930);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5994:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5998:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5999:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:5999:1: ( ( rule__Class__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6000:1: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6001:1: ( rule__Class__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6001:2: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl11957);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6015:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6019:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6020:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__011991);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__011994);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6027:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6031:1: ( ( () ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6032:1: ( () )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6032:1: ( () )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6033:1: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6034:1: ()
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6036:1: 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6046:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6050:1: ( rule__Attribute__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6051:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__112052);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6057:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6061:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6062:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6062:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6063:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6064:1: ( rule__Attribute__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6064:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl12079);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6078:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6082:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6083:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__012113);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__012116);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6090:1: rule__Reference__Group__0__Impl : ( () ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6094:1: ( ( () ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6095:1: ( () )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6095:1: ( () )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6096:1: ()
            {
             before(grammarAccess.getReferenceAccess().getReferenceAction_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6097:1: ()
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6099:1: 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6109:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6113:1: ( rule__Reference__Group__1__Impl )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6114:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__112174);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6120:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6124:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6125:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6125:1: ( ( rule__Reference__NameAssignment_1 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6126:1: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6127:1: ( rule__Reference__NameAssignment_1 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6127:2: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl12201);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6142:1: rule__MyModel__MigrationLibAssignment_0 : ( ruleMigrationLibrary ) ;
    public final void rule__MyModel__MigrationLibAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6146:1: ( ( ruleMigrationLibrary ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6147:1: ( ruleMigrationLibrary )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6147:1: ( ruleMigrationLibrary )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6148:1: ruleMigrationLibrary
            {
             before(grammarAccess.getMyModelAccess().getMigrationLibMigrationLibraryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMigrationLibrary_in_rule__MyModel__MigrationLibAssignment_012240);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6157:1: rule__MyModel__MigrationProgrAssignment_1 : ( ruleMigrationProgram ) ;
    public final void rule__MyModel__MigrationProgrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6161:1: ( ( ruleMigrationProgram ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6162:1: ( ruleMigrationProgram )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6162:1: ( ruleMigrationProgram )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6163:1: ruleMigrationProgram
            {
             before(grammarAccess.getMyModelAccess().getMigrationProgrMigrationProgramParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMigrationProgram_in_rule__MyModel__MigrationProgrAssignment_112271);
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


    // $ANTLR start "rule__MigrationLibrary__NameAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6172:1: rule__MigrationLibrary__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MigrationLibrary__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6176:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6177:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6177:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6178:1: RULE_ID
            {
             before(grammarAccess.getMigrationLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigrationLibrary__NameAssignment_112302); 
             after(grammarAccess.getMigrationLibraryAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MigrationLibrary__NameAssignment_1"


    // $ANTLR start "rule__MigrationLibrary__RulesAssignment_3"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6187:1: rule__MigrationLibrary__RulesAssignment_3 : ( ruleRule ) ;
    public final void rule__MigrationLibrary__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6191:1: ( ( ruleRule ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6192:1: ( ruleRule )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6192:1: ( ruleRule )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6193:1: ruleRule
            {
             before(grammarAccess.getMigrationLibraryAccess().getRulesRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__MigrationLibrary__RulesAssignment_312333);
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


    // $ANTLR start "rule__MigrationProgram__NameAssignment_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6206:1: rule__MigrationProgram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MigrationProgram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6210:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6211:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6211:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6212:1: RULE_ID
            {
             before(grammarAccess.getMigrationProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigrationProgram__NameAssignment_112368); 
             after(grammarAccess.getMigrationProgramAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MigrationProgram__NameAssignment_1"


    // $ANTLR start "rule__MigrationProgram__LibsAssignment_3_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6221:1: rule__MigrationProgram__LibsAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__MigrationProgram__LibsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6225:1: ( ( RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6226:1: ( RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6226:1: ( RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6227:1: RULE_STRING
            {
             before(grammarAccess.getMigrationProgramAccess().getLibsSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MigrationProgram__LibsAssignment_3_112399); 
             after(grammarAccess.getMigrationProgramAccess().getLibsSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__MigrationProgram__LibsAssignment_3_1"


    // $ANTLR start "rule__MigrationProgram__MigrAssignment_4"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6236:1: rule__MigrationProgram__MigrAssignment_4 : ( ( 'migrate' ) ) ;
    public final void rule__MigrationProgram__MigrAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6240:1: ( ( ( 'migrate' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6241:1: ( ( 'migrate' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6241:1: ( ( 'migrate' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6242:1: ( 'migrate' )
            {
             before(grammarAccess.getMigrationProgramAccess().getMigrMigrateKeyword_4_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6243:1: ( 'migrate' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6244:1: 'migrate'
            {
             before(grammarAccess.getMigrationProgramAccess().getMigrMigrateKeyword_4_0()); 
            match(input,41,FOLLOW_41_in_rule__MigrationProgram__MigrAssignment_412435); 
             after(grammarAccess.getMigrationProgramAccess().getMigrMigrateKeyword_4_0()); 

            }

             after(grammarAccess.getMigrationProgramAccess().getMigrMigrateKeyword_4_0()); 

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
    // $ANTLR end "rule__MigrationProgram__MigrAssignment_4"


    // $ANTLR start "rule__MigrationProgram__TypeArtAssignment_5"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6259:1: rule__MigrationProgram__TypeArtAssignment_5 : ( ruleArtifact ) ;
    public final void rule__MigrationProgram__TypeArtAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6263:1: ( ( ruleArtifact ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6264:1: ( ruleArtifact )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6264:1: ( ruleArtifact )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6265:1: ruleArtifact
            {
             before(grammarAccess.getMigrationProgramAccess().getTypeArtArtifactParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleArtifact_in_rule__MigrationProgram__TypeArtAssignment_512474);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getMigrationProgramAccess().getTypeArtArtifactParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__MigrationProgram__TypeArtAssignment_5"


    // $ANTLR start "rule__MigrationProgram__ArtifactAssignment_6"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6274:1: rule__MigrationProgram__ArtifactAssignment_6 : ( RULE_STRING ) ;
    public final void rule__MigrationProgram__ArtifactAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6278:1: ( ( RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6279:1: ( RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6279:1: ( RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6280:1: RULE_STRING
            {
             before(grammarAccess.getMigrationProgramAccess().getArtifactSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MigrationProgram__ArtifactAssignment_612505); 
             after(grammarAccess.getMigrationProgramAccess().getArtifactSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__MigrationProgram__ArtifactAssignment_6"


    // $ANTLR start "rule__MigrationProgram__TransformationPackageAssignment_8_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6289:1: rule__MigrationProgram__TransformationPackageAssignment_8_0 : ( ( RULE_ID ) ) ;
    public final void rule__MigrationProgram__TransformationPackageAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6293:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6294:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6294:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6295:1: ( RULE_ID )
            {
             before(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_8_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6296:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6297:1: RULE_ID
            {
             before(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageIDTerminalRuleCall_8_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigrationProgram__TransformationPackageAssignment_8_012540); 
             after(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageIDTerminalRuleCall_8_0_0_1()); 

            }

             after(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_8_0_0()); 

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
    // $ANTLR end "rule__MigrationProgram__TransformationPackageAssignment_8_0"


    // $ANTLR start "rule__MigrationProgram__TransformationPackageAssignment_8_1_1"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6308:1: rule__MigrationProgram__TransformationPackageAssignment_8_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__MigrationProgram__TransformationPackageAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6312:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6313:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6313:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6314:1: ( RULE_ID )
            {
             before(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_8_1_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6315:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6316:1: RULE_ID
            {
             before(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageIDTerminalRuleCall_8_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigrationProgram__TransformationPackageAssignment_8_1_112579); 
             after(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageIDTerminalRuleCall_8_1_1_0_1()); 

            }

             after(grammarAccess.getMigrationProgramAccess().getTransformationPackageEPackageCrossReference_8_1_1_0()); 

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
    // $ANTLR end "rule__MigrationProgram__TransformationPackageAssignment_8_1_1"


    // $ANTLR start "rule__MigrationProgram__DeltaAssignment_10"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6327:1: rule__MigrationProgram__DeltaAssignment_10 : ( RULE_STRING ) ;
    public final void rule__MigrationProgram__DeltaAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6331:1: ( ( RULE_STRING ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6332:1: ( RULE_STRING )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6332:1: ( RULE_STRING )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6333:1: RULE_STRING
            {
             before(grammarAccess.getMigrationProgramAccess().getDeltaSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MigrationProgram__DeltaAssignment_1012614); 
             after(grammarAccess.getMigrationProgramAccess().getDeltaSTRINGTerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__MigrationProgram__DeltaAssignment_10"


    // $ANTLR start "rule__MigrationProgram__RulesAssignment_12"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6342:1: rule__MigrationProgram__RulesAssignment_12 : ( ruleRule ) ;
    public final void rule__MigrationProgram__RulesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6346:1: ( ( ruleRule ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6347:1: ( ruleRule )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6347:1: ( ruleRule )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6348:1: ruleRule
            {
             before(grammarAccess.getMigrationProgramAccess().getRulesRuleParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__MigrationProgram__RulesAssignment_1212645);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getMigrationProgramAccess().getRulesRuleParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__MigrationProgram__RulesAssignment_12"


    // $ANTLR start "rule__Artifact__TypeAssignment"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6357:1: rule__Artifact__TypeAssignment : ( ( rule__Artifact__TypeAlternatives_0 ) ) ;
    public final void rule__Artifact__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6361:1: ( ( ( rule__Artifact__TypeAlternatives_0 ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6362:1: ( ( rule__Artifact__TypeAlternatives_0 ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6362:1: ( ( rule__Artifact__TypeAlternatives_0 ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6363:1: ( rule__Artifact__TypeAlternatives_0 )
            {
             before(grammarAccess.getArtifactAccess().getTypeAlternatives_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6364:1: ( rule__Artifact__TypeAlternatives_0 )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6364:2: rule__Artifact__TypeAlternatives_0
            {
            pushFollow(FOLLOW_rule__Artifact__TypeAlternatives_0_in_rule__Artifact__TypeAssignment12676);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6373:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6377:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6378:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6378:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6379:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_112709); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6388:1: rule__Rule__FilterAssignment_3 : ( ruleOpDef ) ;
    public final void rule__Rule__FilterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6392:1: ( ( ruleOpDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6393:1: ( ruleOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6393:1: ( ruleOpDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6394:1: ruleOpDef
            {
             before(grammarAccess.getRuleAccess().getFilterOpDefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOpDef_in_rule__Rule__FilterAssignment_312740);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6403:1: rule__Rule__RewritingRulesAssignment_6 : ( ruleRewritingRule ) ;
    public final void rule__Rule__RewritingRulesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6407:1: ( ( ruleRewritingRule ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6408:1: ( ruleRewritingRule )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6408:1: ( ruleRewritingRule )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6409:1: ruleRewritingRule
            {
             before(grammarAccess.getRuleAccess().getRewritingRulesRewritingRuleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRewritingRule_in_rule__Rule__RewritingRulesAssignment_612771);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6418:1: rule__EPackageOpDef__VarAssignment_0_1 : ( rulePackage ) ;
    public final void rule__EPackageOpDef__VarAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6422:1: ( ( rulePackage ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6423:1: ( rulePackage )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6423:1: ( rulePackage )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6424:1: rulePackage
            {
             before(grammarAccess.getEPackageOpDefAccess().getVarPackageParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__EPackageOpDef__VarAssignment_0_112802);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6433:1: rule__EPackageOpDef__OpAssignment_1_0_0 : ( ( 'changePackage' ) ) ;
    public final void rule__EPackageOpDef__OpAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6437:1: ( ( ( 'changePackage' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6438:1: ( ( 'changePackage' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6438:1: ( ( 'changePackage' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6439:1: ( 'changePackage' )
            {
             before(grammarAccess.getEPackageOpDefAccess().getOpChangePackageKeyword_1_0_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6440:1: ( 'changePackage' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6441:1: 'changePackage'
            {
             before(grammarAccess.getEPackageOpDefAccess().getOpChangePackageKeyword_1_0_0_0()); 
            match(input,42,FOLLOW_42_in_rule__EPackageOpDef__OpAssignment_1_0_012838); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6456:1: rule__EPackageOpDef__OpAssignment_1_0_1 : ( ( 'addPackage' ) ) ;
    public final void rule__EPackageOpDef__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6460:1: ( ( ( 'addPackage' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6461:1: ( ( 'addPackage' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6461:1: ( ( 'addPackage' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6462:1: ( 'addPackage' )
            {
             before(grammarAccess.getEPackageOpDefAccess().getOpAddPackageKeyword_1_0_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6463:1: ( 'addPackage' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6464:1: 'addPackage'
            {
             before(grammarAccess.getEPackageOpDefAccess().getOpAddPackageKeyword_1_0_1_0()); 
            match(input,43,FOLLOW_43_in_rule__EPackageOpDef__OpAssignment_1_0_112882); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6479:1: rule__EPackageOpDef__OpAssignment_1_0_2 : ( ( 'deletePackage' ) ) ;
    public final void rule__EPackageOpDef__OpAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6483:1: ( ( ( 'deletePackage' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6484:1: ( ( 'deletePackage' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6484:1: ( ( 'deletePackage' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6485:1: ( 'deletePackage' )
            {
             before(grammarAccess.getEPackageOpDefAccess().getOpDeletePackageKeyword_1_0_2_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6486:1: ( 'deletePackage' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6487:1: 'deletePackage'
            {
             before(grammarAccess.getEPackageOpDefAccess().getOpDeletePackageKeyword_1_0_2_0()); 
            match(input,44,FOLLOW_44_in_rule__EPackageOpDef__OpAssignment_1_0_212926); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6502:1: rule__EPackageOpDef__RefAssignment_1_2 : ( rulePackage ) ;
    public final void rule__EPackageOpDef__RefAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6506:1: ( ( rulePackage ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6507:1: ( rulePackage )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6507:1: ( rulePackage )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6508:1: rulePackage
            {
             before(grammarAccess.getEPackageOpDefAccess().getRefPackageParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__EPackageOpDef__RefAssignment_1_212965);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6517:1: rule__EPackageOpDef__SettersAssignment_1_8_0 : ( rulesetterDef ) ;
    public final void rule__EPackageOpDef__SettersAssignment_1_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6521:1: ( ( rulesetterDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6522:1: ( rulesetterDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6522:1: ( rulesetterDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6523:1: rulesetterDef
            {
             before(grammarAccess.getEPackageOpDefAccess().getSettersSetterDefParserRuleCall_1_8_0_0()); 
            pushFollow(FOLLOW_rulesetterDef_in_rule__EPackageOpDef__SettersAssignment_1_8_012996);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6532:1: rule__EPackageOpDef__ClassesAssignment_1_8_1 : ( ruleEClassOpDef ) ;
    public final void rule__EPackageOpDef__ClassesAssignment_1_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6536:1: ( ( ruleEClassOpDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6537:1: ( ruleEClassOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6537:1: ( ruleEClassOpDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6538:1: ruleEClassOpDef
            {
             before(grammarAccess.getEPackageOpDefAccess().getClassesEClassOpDefParserRuleCall_1_8_1_0()); 
            pushFollow(FOLLOW_ruleEClassOpDef_in_rule__EPackageOpDef__ClassesAssignment_1_8_113027);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6547:1: rule__EClassOpDef__VarAssignment_0_1 : ( ruleClass ) ;
    public final void rule__EClassOpDef__VarAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6551:1: ( ( ruleClass ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6552:1: ( ruleClass )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6552:1: ( ruleClass )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6553:1: ruleClass
            {
             before(grammarAccess.getEClassOpDefAccess().getVarClassParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__EClassOpDef__VarAssignment_0_113058);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6562:1: rule__EClassOpDef__OpAssignment_1_0_0 : ( ( 'changeClass' ) ) ;
    public final void rule__EClassOpDef__OpAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6566:1: ( ( ( 'changeClass' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6567:1: ( ( 'changeClass' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6567:1: ( ( 'changeClass' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6568:1: ( 'changeClass' )
            {
             before(grammarAccess.getEClassOpDefAccess().getOpChangeClassKeyword_1_0_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6569:1: ( 'changeClass' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6570:1: 'changeClass'
            {
             before(grammarAccess.getEClassOpDefAccess().getOpChangeClassKeyword_1_0_0_0()); 
            match(input,45,FOLLOW_45_in_rule__EClassOpDef__OpAssignment_1_0_013094); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6585:1: rule__EClassOpDef__OpAssignment_1_0_1 : ( ( 'addClass' ) ) ;
    public final void rule__EClassOpDef__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6589:1: ( ( ( 'addClass' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6590:1: ( ( 'addClass' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6590:1: ( ( 'addClass' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6591:1: ( 'addClass' )
            {
             before(grammarAccess.getEClassOpDefAccess().getOpAddClassKeyword_1_0_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6592:1: ( 'addClass' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6593:1: 'addClass'
            {
             before(grammarAccess.getEClassOpDefAccess().getOpAddClassKeyword_1_0_1_0()); 
            match(input,46,FOLLOW_46_in_rule__EClassOpDef__OpAssignment_1_0_113138); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6608:1: rule__EClassOpDef__OpAssignment_1_0_2 : ( ( 'deleteClass' ) ) ;
    public final void rule__EClassOpDef__OpAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6612:1: ( ( ( 'deleteClass' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6613:1: ( ( 'deleteClass' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6613:1: ( ( 'deleteClass' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6614:1: ( 'deleteClass' )
            {
             before(grammarAccess.getEClassOpDefAccess().getOpDeleteClassKeyword_1_0_2_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6615:1: ( 'deleteClass' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6616:1: 'deleteClass'
            {
             before(grammarAccess.getEClassOpDefAccess().getOpDeleteClassKeyword_1_0_2_0()); 
            match(input,47,FOLLOW_47_in_rule__EClassOpDef__OpAssignment_1_0_213182); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6631:1: rule__EClassOpDef__RefAssignment_1_2 : ( ruleClass ) ;
    public final void rule__EClassOpDef__RefAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6635:1: ( ( ruleClass ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6636:1: ( ruleClass )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6636:1: ( ruleClass )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6637:1: ruleClass
            {
             before(grammarAccess.getEClassOpDefAccess().getRefClassParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__EClassOpDef__RefAssignment_1_213221);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6646:1: rule__EClassOpDef__SettersAssignment_1_7_1_0 : ( rulesetterDef ) ;
    public final void rule__EClassOpDef__SettersAssignment_1_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6650:1: ( ( rulesetterDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6651:1: ( rulesetterDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6651:1: ( rulesetterDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6652:1: rulesetterDef
            {
             before(grammarAccess.getEClassOpDefAccess().getSettersSetterDefParserRuleCall_1_7_1_0_0()); 
            pushFollow(FOLLOW_rulesetterDef_in_rule__EClassOpDef__SettersAssignment_1_7_1_013252);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6661:1: rule__EClassOpDef__AttributesAssignment_1_7_1_1 : ( ruleEAttributeOpDef ) ;
    public final void rule__EClassOpDef__AttributesAssignment_1_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6665:1: ( ( ruleEAttributeOpDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6666:1: ( ruleEAttributeOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6666:1: ( ruleEAttributeOpDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6667:1: ruleEAttributeOpDef
            {
             before(grammarAccess.getEClassOpDefAccess().getAttributesEAttributeOpDefParserRuleCall_1_7_1_1_0()); 
            pushFollow(FOLLOW_ruleEAttributeOpDef_in_rule__EClassOpDef__AttributesAssignment_1_7_1_113283);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6676:1: rule__EClassOpDef__ReferencesAssignment_1_7_1_2 : ( ruleEReferenceOpDef ) ;
    public final void rule__EClassOpDef__ReferencesAssignment_1_7_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6680:1: ( ( ruleEReferenceOpDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6681:1: ( ruleEReferenceOpDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6681:1: ( ruleEReferenceOpDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6682:1: ruleEReferenceOpDef
            {
             before(grammarAccess.getEClassOpDefAccess().getReferencesEReferenceOpDefParserRuleCall_1_7_1_2_0()); 
            pushFollow(FOLLOW_ruleEReferenceOpDef_in_rule__EClassOpDef__ReferencesAssignment_1_7_1_213314);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6691:1: rule__EAttributeOpDef__VarAssignment_0_1 : ( ruleAttribute ) ;
    public final void rule__EAttributeOpDef__VarAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6695:1: ( ( ruleAttribute ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6696:1: ( ruleAttribute )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6696:1: ( ruleAttribute )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6697:1: ruleAttribute
            {
             before(grammarAccess.getEAttributeOpDefAccess().getVarAttributeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__EAttributeOpDef__VarAssignment_0_113345);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6706:1: rule__EAttributeOpDef__OpAssignment_1_0_0_0 : ( ( 'changeEAttribute' ) ) ;
    public final void rule__EAttributeOpDef__OpAssignment_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6710:1: ( ( ( 'changeEAttribute' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6711:1: ( ( 'changeEAttribute' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6711:1: ( ( 'changeEAttribute' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6712:1: ( 'changeEAttribute' )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getOpChangeEAttributeKeyword_1_0_0_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6713:1: ( 'changeEAttribute' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6714:1: 'changeEAttribute'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getOpChangeEAttributeKeyword_1_0_0_0_0()); 
            match(input,48,FOLLOW_48_in_rule__EAttributeOpDef__OpAssignment_1_0_0_013381); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6729:1: rule__EAttributeOpDef__OpAssignment_1_0_0_1 : ( ( 'addEAttribute' ) ) ;
    public final void rule__EAttributeOpDef__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6733:1: ( ( ( 'addEAttribute' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6734:1: ( ( 'addEAttribute' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6734:1: ( ( 'addEAttribute' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6735:1: ( 'addEAttribute' )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getOpAddEAttributeKeyword_1_0_0_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6736:1: ( 'addEAttribute' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6737:1: 'addEAttribute'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getOpAddEAttributeKeyword_1_0_0_1_0()); 
            match(input,49,FOLLOW_49_in_rule__EAttributeOpDef__OpAssignment_1_0_0_113425); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6752:1: rule__EAttributeOpDef__OpAssignment_1_0_0_2 : ( ( 'deleteEAttribute' ) ) ;
    public final void rule__EAttributeOpDef__OpAssignment_1_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6756:1: ( ( ( 'deleteEAttribute' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6757:1: ( ( 'deleteEAttribute' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6757:1: ( ( 'deleteEAttribute' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6758:1: ( 'deleteEAttribute' )
            {
             before(grammarAccess.getEAttributeOpDefAccess().getOpDeleteEAttributeKeyword_1_0_0_2_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6759:1: ( 'deleteEAttribute' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6760:1: 'deleteEAttribute'
            {
             before(grammarAccess.getEAttributeOpDefAccess().getOpDeleteEAttributeKeyword_1_0_0_2_0()); 
            match(input,50,FOLLOW_50_in_rule__EAttributeOpDef__OpAssignment_1_0_0_213469); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6775:1: rule__EAttributeOpDef__RefAssignment_1_0_2 : ( ruleAttribute ) ;
    public final void rule__EAttributeOpDef__RefAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6779:1: ( ( ruleAttribute ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6780:1: ( ruleAttribute )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6780:1: ( ruleAttribute )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6781:1: ruleAttribute
            {
             before(grammarAccess.getEAttributeOpDefAccess().getRefAttributeParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__EAttributeOpDef__RefAssignment_1_0_213508);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6790:1: rule__EAttributeOpDef__SettersAssignment_1_3_0_1 : ( rulesetterDef ) ;
    public final void rule__EAttributeOpDef__SettersAssignment_1_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6794:1: ( ( rulesetterDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6795:1: ( rulesetterDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6795:1: ( rulesetterDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6796:1: rulesetterDef
            {
             before(grammarAccess.getEAttributeOpDefAccess().getSettersSetterDefParserRuleCall_1_3_0_1_0()); 
            pushFollow(FOLLOW_rulesetterDef_in_rule__EAttributeOpDef__SettersAssignment_1_3_0_113539);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6805:1: rule__EReferenceOpDef__VarAssignment_0_1 : ( ruleReference ) ;
    public final void rule__EReferenceOpDef__VarAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6809:1: ( ( ruleReference ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6810:1: ( ruleReference )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6810:1: ( ruleReference )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6811:1: ruleReference
            {
             before(grammarAccess.getEReferenceOpDefAccess().getVarReferenceParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__EReferenceOpDef__VarAssignment_0_113570);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6820:1: rule__EReferenceOpDef__OpAssignment_1_0_0_0 : ( ( 'changeEReference' ) ) ;
    public final void rule__EReferenceOpDef__OpAssignment_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6824:1: ( ( ( 'changeEReference' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6825:1: ( ( 'changeEReference' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6825:1: ( ( 'changeEReference' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6826:1: ( 'changeEReference' )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getOpChangeEReferenceKeyword_1_0_0_0_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6827:1: ( 'changeEReference' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6828:1: 'changeEReference'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getOpChangeEReferenceKeyword_1_0_0_0_0()); 
            match(input,51,FOLLOW_51_in_rule__EReferenceOpDef__OpAssignment_1_0_0_013606); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6843:1: rule__EReferenceOpDef__OpAssignment_1_0_0_1 : ( ( 'addEReference' ) ) ;
    public final void rule__EReferenceOpDef__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6847:1: ( ( ( 'addEReference' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6848:1: ( ( 'addEReference' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6848:1: ( ( 'addEReference' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6849:1: ( 'addEReference' )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getOpAddEReferenceKeyword_1_0_0_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6850:1: ( 'addEReference' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6851:1: 'addEReference'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getOpAddEReferenceKeyword_1_0_0_1_0()); 
            match(input,52,FOLLOW_52_in_rule__EReferenceOpDef__OpAssignment_1_0_0_113650); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6866:1: rule__EReferenceOpDef__OpAssignment_1_0_0_2 : ( ( 'deleteEReference' ) ) ;
    public final void rule__EReferenceOpDef__OpAssignment_1_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6870:1: ( ( ( 'deleteEReference' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6871:1: ( ( 'deleteEReference' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6871:1: ( ( 'deleteEReference' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6872:1: ( 'deleteEReference' )
            {
             before(grammarAccess.getEReferenceOpDefAccess().getOpDeleteEReferenceKeyword_1_0_0_2_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6873:1: ( 'deleteEReference' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6874:1: 'deleteEReference'
            {
             before(grammarAccess.getEReferenceOpDefAccess().getOpDeleteEReferenceKeyword_1_0_0_2_0()); 
            match(input,53,FOLLOW_53_in_rule__EReferenceOpDef__OpAssignment_1_0_0_213694); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6889:1: rule__EReferenceOpDef__RefAssignment_1_0_2 : ( ruleReference ) ;
    public final void rule__EReferenceOpDef__RefAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6893:1: ( ( ruleReference ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6894:1: ( ruleReference )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6894:1: ( ruleReference )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6895:1: ruleReference
            {
             before(grammarAccess.getEReferenceOpDefAccess().getRefReferenceParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__EReferenceOpDef__RefAssignment_1_0_213733);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6904:1: rule__EReferenceOpDef__SettersAssignment_1_3_1 : ( rulesetterDef ) ;
    public final void rule__EReferenceOpDef__SettersAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6908:1: ( ( rulesetterDef ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6909:1: ( rulesetterDef )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6909:1: ( rulesetterDef )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6910:1: rulesetterDef
            {
             before(grammarAccess.getEReferenceOpDefAccess().getSettersSetterDefParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_rulesetterDef_in_rule__EReferenceOpDef__SettersAssignment_1_3_113764);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6919:1: rule__SetterDef__MetafeatureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SetterDef__MetafeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6923:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6924:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6924:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6925:1: ( RULE_ID )
            {
             before(grammarAccess.getSetterDefAccess().getMetafeatureEStructuralFeatureCrossReference_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6926:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6927:1: RULE_ID
            {
             before(grammarAccess.getSetterDefAccess().getMetafeatureEStructuralFeatureIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SetterDef__MetafeatureAssignment_113799); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6938:1: rule__SetterDef__OperatorAssignment_2 : ( ( '=' ) ) ;
    public final void rule__SetterDef__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6942:1: ( ( ( '=' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6943:1: ( ( '=' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6943:1: ( ( '=' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6944:1: ( '=' )
            {
             before(grammarAccess.getSetterDefAccess().getOperatorEqualsSignKeyword_2_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6945:1: ( '=' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6946:1: '='
            {
             before(grammarAccess.getSetterDefAccess().getOperatorEqualsSignKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__SetterDef__OperatorAssignment_213839); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6961:1: rule__SetterDef__ParAssignment_3 : ( ruleParameter ) ;
    public final void rule__SetterDef__ParAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6965:1: ( ( ruleParameter ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6966:1: ( ruleParameter )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6966:1: ( ruleParameter )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6967:1: ruleParameter
            {
             before(grammarAccess.getSetterDefAccess().getParParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__SetterDef__ParAssignment_313878);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6976:1: rule__SetterDef__ParAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__SetterDef__ParAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6980:1: ( ( ruleParameter ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6981:1: ( ruleParameter )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6981:1: ( ruleParameter )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6982:1: ruleParameter
            {
             before(grammarAccess.getSetterDefAccess().getParParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__SetterDef__ParAssignment_4_113909);
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


    // $ANTLR start "rule__RewritingRule__MigratorSXAssignment_0_0"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6991:1: rule__RewritingRule__MigratorSXAssignment_0_0 : ( ruleMigratorSX ) ;
    public final void rule__RewritingRule__MigratorSXAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6995:1: ( ( ruleMigratorSX ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6996:1: ( ruleMigratorSX )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6996:1: ( ruleMigratorSX )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:6997:1: ruleMigratorSX
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorSXMigratorSXParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleMigratorSX_in_rule__RewritingRule__MigratorSXAssignment_0_013940);
            ruleMigratorSX();

            state._fsp--;

             after(grammarAccess.getRewritingRuleAccess().getMigratorSXMigratorSXParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__RewritingRule__MigratorSXAssignment_0_0"


    // $ANTLR start "rule__RewritingRule__MigratorDXAssignment_0_2"
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7006:1: rule__RewritingRule__MigratorDXAssignment_0_2 : ( ruleMigratorDX ) ;
    public final void rule__RewritingRule__MigratorDXAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7010:1: ( ( ruleMigratorDX ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7011:1: ( ruleMigratorDX )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7011:1: ( ruleMigratorDX )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7012:1: ruleMigratorDX
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleMigratorDX_in_rule__RewritingRule__MigratorDXAssignment_0_213971);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7021:1: rule__RewritingRule__MigratorSXAssignment_1_1 : ( ruleMigratorSX ) ;
    public final void rule__RewritingRule__MigratorSXAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7025:1: ( ( ruleMigratorSX ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7026:1: ( ruleMigratorSX )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7026:1: ( ruleMigratorSX )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7027:1: ruleMigratorSX
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorSXMigratorSXParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMigratorSX_in_rule__RewritingRule__MigratorSXAssignment_1_114002);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7036:1: rule__RewritingRule__MigratorDXAssignment_1_3 : ( ruleMigratorDX ) ;
    public final void rule__RewritingRule__MigratorDXAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7040:1: ( ( ruleMigratorDX ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7041:1: ( ruleMigratorDX )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7041:1: ( ruleMigratorDX )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7042:1: ruleMigratorDX
            {
             before(grammarAccess.getRewritingRuleAccess().getMigratorDXMigratorDXParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleMigratorDX_in_rule__RewritingRule__MigratorDXAssignment_1_314033);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7051:1: rule__MigratorSX__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MigratorSX__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7055:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7056:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7056:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7057:1: RULE_ID
            {
             before(grammarAccess.getMigratorSXAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigratorSX__NameAssignment_114064); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7066:1: rule__MigratorSX__ElementSXAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MigratorSX__ElementSXAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7070:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7071:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7071:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7072:1: ( RULE_ID )
            {
             before(grammarAccess.getMigratorSXAccess().getElementSXEClassCrossReference_3_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7073:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7074:1: RULE_ID
            {
             before(grammarAccess.getMigratorSXAccess().getElementSXEClassIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigratorSX__ElementSXAssignment_314099); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7085:1: rule__MigratorSX__FilterSXAssignment_6 : ( ruleFilterMigrator ) ;
    public final void rule__MigratorSX__FilterSXAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7089:1: ( ( ruleFilterMigrator ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7090:1: ( ruleFilterMigrator )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7090:1: ( ruleFilterMigrator )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7091:1: ruleFilterMigrator
            {
             before(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleFilterMigrator_in_rule__MigratorSX__FilterSXAssignment_614134);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7100:1: rule__MigratorSX__FilterSXAssignment_7_1 : ( ruleFilterMigrator ) ;
    public final void rule__MigratorSX__FilterSXAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7104:1: ( ( ruleFilterMigrator ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7105:1: ( ruleFilterMigrator )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7105:1: ( ruleFilterMigrator )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7106:1: ruleFilterMigrator
            {
             before(grammarAccess.getMigratorSXAccess().getFilterSXFilterMigratorParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleFilterMigrator_in_rule__MigratorSX__FilterSXAssignment_7_114165);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7115:1: rule__MigratorDX__NameAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__MigratorDX__NameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7119:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7120:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7120:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7121:1: RULE_ID
            {
             before(grammarAccess.getMigratorDXAccess().getNameIDTerminalRuleCall_0_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigratorDX__NameAssignment_0_1_014196); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7130:1: rule__MigratorDX__ElementDXAssignment_0_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__MigratorDX__ElementDXAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7134:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7135:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7135:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7136:1: ( RULE_ID )
            {
             before(grammarAccess.getMigratorDXAccess().getElementDXEClassCrossReference_0_1_2_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7137:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7138:1: RULE_ID
            {
             before(grammarAccess.getMigratorDXAccess().getElementDXEClassIDTerminalRuleCall_0_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MigratorDX__ElementDXAssignment_0_1_214231); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7149:1: rule__MigratorDX__FilterDXAssignment_0_1_4 : ( ruleFilterMigrator ) ;
    public final void rule__MigratorDX__FilterDXAssignment_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7153:1: ( ( ruleFilterMigrator ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7154:1: ( ruleFilterMigrator )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7154:1: ( ruleFilterMigrator )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7155:1: ruleFilterMigrator
            {
             before(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_1_4_0()); 
            pushFollow(FOLLOW_ruleFilterMigrator_in_rule__MigratorDX__FilterDXAssignment_0_1_414266);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7164:1: rule__MigratorDX__FilterDXAssignment_0_1_5_1 : ( ruleFilterMigrator ) ;
    public final void rule__MigratorDX__FilterDXAssignment_0_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7168:1: ( ( ruleFilterMigrator ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7169:1: ( ruleFilterMigrator )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7169:1: ( ruleFilterMigrator )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7170:1: ruleFilterMigrator
            {
             before(grammarAccess.getMigratorDXAccess().getFilterDXFilterMigratorParserRuleCall_0_1_5_1_0()); 
            pushFollow(FOLLOW_ruleFilterMigrator_in_rule__MigratorDX__FilterDXAssignment_0_1_5_114297);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7179:1: rule__FilterMigrator__FeatureSXAssignment_0 : ( ruleDotNavigationObjSX ) ;
    public final void rule__FilterMigrator__FeatureSXAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7183:1: ( ( ruleDotNavigationObjSX ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7184:1: ( ruleDotNavigationObjSX )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7184:1: ( ruleDotNavigationObjSX )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7185:1: ruleDotNavigationObjSX
            {
             before(grammarAccess.getFilterMigratorAccess().getFeatureSXDotNavigationObjSXParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDotNavigationObjSX_in_rule__FilterMigrator__FeatureSXAssignment_014328);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7194:1: rule__FilterMigrator__OpAssignment_1 : ( ( '=' ) ) ;
    public final void rule__FilterMigrator__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7198:1: ( ( ( '=' ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7199:1: ( ( '=' ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7199:1: ( ( '=' ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7200:1: ( '=' )
            {
             before(grammarAccess.getFilterMigratorAccess().getOpEqualsSignKeyword_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7201:1: ( '=' )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7202:1: '='
            {
             before(grammarAccess.getFilterMigratorAccess().getOpEqualsSignKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__FilterMigrator__OpAssignment_114364); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7217:1: rule__FilterMigrator__ValueAssignment_2 : ( ruleDotNavigationObjDX ) ;
    public final void rule__FilterMigrator__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7221:1: ( ( ruleDotNavigationObjDX ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7222:1: ( ruleDotNavigationObjDX )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7222:1: ( ruleDotNavigationObjDX )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7223:1: ruleDotNavigationObjDX
            {
             before(grammarAccess.getFilterMigratorAccess().getValueDotNavigationObjDXParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDotNavigationObjDX_in_rule__FilterMigrator__ValueAssignment_214403);
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7232:1: rule__DotNavigationObjSX__ObjAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DotNavigationObjSX__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7236:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7237:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7237:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7238:1: ( RULE_ID )
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getObjEObjectCrossReference_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7239:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7240:1: RULE_ID
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getObjEObjectIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DotNavigationObjSX__ObjAssignment_114438); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7251:1: rule__DotNavigationObjSX__RefAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DotNavigationObjSX__RefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7255:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7256:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7256:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7257:1: ( RULE_ID )
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getRefEStructuralFeatureCrossReference_2_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7258:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7259:1: RULE_ID
            {
             before(grammarAccess.getDotNavigationObjSXAccess().getRefEStructuralFeatureIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DotNavigationObjSX__RefAssignment_2_114477); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7270:1: rule__DotNavigationObjDX__ObjAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DotNavigationObjDX__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7274:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7275:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7275:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7276:1: ( RULE_ID )
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getObjEObjectCrossReference_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7277:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7278:1: RULE_ID
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getObjEObjectIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DotNavigationObjDX__ObjAssignment_114516); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7289:1: rule__DotNavigationObjDX__RefAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DotNavigationObjDX__RefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7293:1: ( ( ( RULE_ID ) ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7294:1: ( ( RULE_ID ) )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7294:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7295:1: ( RULE_ID )
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getRefEStructuralFeatureCrossReference_2_1_0()); 
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7296:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7297:1: RULE_ID
            {
             before(grammarAccess.getDotNavigationObjDXAccess().getRefEStructuralFeatureIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DotNavigationObjDX__RefAssignment_2_114555); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7308:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7312:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7313:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7313:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7314:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_114590); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7323:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7327:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7328:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7328:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7329:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_114621); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7338:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7342:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7343:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7343:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7344:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_114652); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7353:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7357:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7358:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7358:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7359:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_114683); 
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
    // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7368:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7372:1: ( ( RULE_ID ) )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7373:1: ( RULE_ID )
            {
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7373:1: ( RULE_ID )
            // ../it.univaq.coevolution.emfmigrate.ui/src-gen/it/univaq/coevolution/emfmigrate/ui/contentassist/antlr/internal/InternalEmig.g:7374:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_114714); 
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
    public static final BitSet FOLLOW_ruleMigrationProgram_in_entryRuleMigrationProgram183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationProgram190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__0_in_ruleMigrationProgram216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifact250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artifact__TypeAssignment_in_ruleArtifact276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpDef_in_entryRuleOpDef363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpDef370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpDef__Alternatives_in_ruleOpDef396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageOpDef_in_entryRuleEPackageOpDef423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPackageOpDef430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group__0_in_ruleEPackageOpDef456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_entryRuleEClassOpDef483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEClassOpDef490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group__0_in_ruleEClassOpDef516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_entryRuleEAttributeOpDef543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEAttributeOpDef550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group__0_in_ruleEAttributeOpDef576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_entryRuleEReferenceOpDef603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEReferenceOpDef610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group__0_in_ruleEReferenceOpDef636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetterDef_in_entryRulesetterDef663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesetterDef670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__0_in_rulesetterDef696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewritingRule_in_entryRuleRewritingRule723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRewritingRule730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group__0_in_ruleRewritingRule756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrator_in_entryRuleMigrator783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrator790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Migrator__Alternatives_in_ruleMigrator816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_entryRuleMigratorSX843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigratorSX850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__0_in_ruleMigratorSX876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_entryRuleMigratorDX903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigratorDX910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Alternatives_in_ruleMigratorDX936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_entryRuleFilterMigrator963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterMigrator970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__Group__0_in_ruleFilterMigrator996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjSX_in_entryRuleDotNavigationObjSX1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDotNavigationObjSX1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group__0_in_ruleDotNavigationObjSX1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjDX_in_entryRuleDotNavigationObjDX1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDotNavigationObjDX1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group__0_in_ruleDotNavigationObjDX1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyModel__MigrationLibAssignment_0_in_rule__MyModel__Alternatives1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyModel__MigrationProgrAssignment_1_in_rule__MyModel__Alternatives1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Artifact__TypeAlternatives_01507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Artifact__TypeAlternatives_01527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Artifact__TypeAlternatives_01547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageOpDef_in_rule__OpDef__Alternatives1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_rule__OpDef__Alternatives1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_rule__OpDef__Alternatives1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_rule__OpDef__Alternatives1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__OpAssignment_1_0_0_in_rule__EPackageOpDef__Alternatives_1_01664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__OpAssignment_1_0_1_in_rule__EPackageOpDef__Alternatives_1_01682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__OpAssignment_1_0_2_in_rule__EPackageOpDef__Alternatives_1_01700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__SettersAssignment_1_8_0_in_rule__EPackageOpDef__Alternatives_1_81733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__ClassesAssignment_1_8_1_in_rule__EPackageOpDef__Alternatives_1_81751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__OpAssignment_1_0_0_in_rule__EClassOpDef__Alternatives_1_01784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__OpAssignment_1_0_1_in_rule__EClassOpDef__Alternatives_1_01802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__OpAssignment_1_0_2_in_rule__EClassOpDef__Alternatives_1_01820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__SettersAssignment_1_7_1_0_in_rule__EClassOpDef__Alternatives_1_7_11853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__AttributesAssignment_1_7_1_1_in_rule__EClassOpDef__Alternatives_1_7_11871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__ReferencesAssignment_1_7_1_2_in_rule__EClassOpDef__Alternatives_1_7_11889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__OpAssignment_1_0_0_0_in_rule__EAttributeOpDef__Alternatives_1_0_01922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__OpAssignment_1_0_0_1_in_rule__EAttributeOpDef__Alternatives_1_0_01940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__OpAssignment_1_0_0_2_in_rule__EAttributeOpDef__Alternatives_1_0_01958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_3_0__0_in_rule__EAttributeOpDef__Alternatives_1_31991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EAttributeOpDef__Alternatives_1_32010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__OpAssignment_1_0_0_0_in_rule__EReferenceOpDef__Alternatives_1_0_02044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__OpAssignment_1_0_0_1_in_rule__EReferenceOpDef__Alternatives_1_0_02062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__OpAssignment_1_0_0_2_in_rule__EReferenceOpDef__Alternatives_1_0_02080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_rule__Migrator__Alternatives2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_rule__Migrator__Alternatives2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0__0_in_rule__MigratorDX__Alternatives2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MigratorDX__Alternatives2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__0__Impl_in_rule__MigrationLibrary__Group__02214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__1_in_rule__MigrationLibrary__Group__02217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MigrationLibrary__Group__0__Impl2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__1__Impl_in_rule__MigrationLibrary__Group__12276 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__2_in_rule__MigrationLibrary__Group__12279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__NameAssignment_1_in_rule__MigrationLibrary__Group__1__Impl2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__2__Impl_in_rule__MigrationLibrary__Group__22336 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__3_in_rule__MigrationLibrary__Group__22339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MigrationLibrary__Group__2__Impl2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__3__Impl_in_rule__MigrationLibrary__Group__32398 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__4_in_rule__MigrationLibrary__Group__32401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__RulesAssignment_3_in_rule__MigrationLibrary__Group__3__Impl2428 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__MigrationLibrary__Group__4__Impl_in_rule__MigrationLibrary__Group__42459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MigrationLibrary__Group__4__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__0__Impl_in_rule__MigrationProgram__Group__02529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__1_in_rule__MigrationProgram__Group__02532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MigrationProgram__Group__0__Impl2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__1__Impl_in_rule__MigrationProgram__Group__12591 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__2_in_rule__MigrationProgram__Group__12594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__NameAssignment_1_in_rule__MigrationProgram__Group__1__Impl2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__2__Impl_in_rule__MigrationProgram__Group__22651 = new BitSet(new long[]{0x0000020000400000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__3_in_rule__MigrationProgram__Group__22654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MigrationProgram__Group__2__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__3__Impl_in_rule__MigrationProgram__Group__32713 = new BitSet(new long[]{0x0000020000400000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__4_in_rule__MigrationProgram__Group__32716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_3__0_in_rule__MigrationProgram__Group__3__Impl2743 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__4__Impl_in_rule__MigrationProgram__Group__42774 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__5_in_rule__MigrationProgram__Group__42777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__MigrAssignment_4_in_rule__MigrationProgram__Group__4__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__5__Impl_in_rule__MigrationProgram__Group__52834 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__6_in_rule__MigrationProgram__Group__52837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__TypeArtAssignment_5_in_rule__MigrationProgram__Group__5__Impl2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__6__Impl_in_rule__MigrationProgram__Group__62894 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__7_in_rule__MigrationProgram__Group__62897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__ArtifactAssignment_6_in_rule__MigrationProgram__Group__6__Impl2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__7__Impl_in_rule__MigrationProgram__Group__72954 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__8_in_rule__MigrationProgram__Group__72957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MigrationProgram__Group__7__Impl2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__8__Impl_in_rule__MigrationProgram__Group__83016 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__9_in_rule__MigrationProgram__Group__83019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_8__0_in_rule__MigrationProgram__Group__8__Impl3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__9__Impl_in_rule__MigrationProgram__Group__93076 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__10_in_rule__MigrationProgram__Group__93079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MigrationProgram__Group__9__Impl3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__10__Impl_in_rule__MigrationProgram__Group__103138 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__11_in_rule__MigrationProgram__Group__103141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__DeltaAssignment_10_in_rule__MigrationProgram__Group__10__Impl3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__11__Impl_in_rule__MigrationProgram__Group__113198 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__12_in_rule__MigrationProgram__Group__113201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MigrationProgram__Group__11__Impl3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__12__Impl_in_rule__MigrationProgram__Group__123260 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__13_in_rule__MigrationProgram__Group__123263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__RulesAssignment_12_in_rule__MigrationProgram__Group__12__Impl3290 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group__13__Impl_in_rule__MigrationProgram__Group__133321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MigrationProgram__Group__13__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_3__0__Impl_in_rule__MigrationProgram__Group_3__03408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_3__1_in_rule__MigrationProgram__Group_3__03411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MigrationProgram__Group_3__0__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_3__1__Impl_in_rule__MigrationProgram__Group_3__13470 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_3__2_in_rule__MigrationProgram__Group_3__13473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__LibsAssignment_3_1_in_rule__MigrationProgram__Group_3__1__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_3__2__Impl_in_rule__MigrationProgram__Group_3__23530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MigrationProgram__Group_3__2__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_8__0__Impl_in_rule__MigrationProgram__Group_8__03595 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_8__1_in_rule__MigrationProgram__Group_8__03598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__TransformationPackageAssignment_8_0_in_rule__MigrationProgram__Group_8__0__Impl3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_8__1__Impl_in_rule__MigrationProgram__Group_8__13655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_8_1__0_in_rule__MigrationProgram__Group_8__1__Impl3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_8_1__0__Impl_in_rule__MigrationProgram__Group_8_1__03716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_8_1__1_in_rule__MigrationProgram__Group_8_1__03719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MigrationProgram__Group_8_1__0__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__Group_8_1__1__Impl_in_rule__MigrationProgram__Group_8_1__13778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigrationProgram__TransformationPackageAssignment_8_1_1_in_rule__MigrationProgram__Group_8_1__1__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Rule__Group__0__Impl3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13901 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__13904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__23961 = new BitSet(new long[]{0x0000000708000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__23964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Rule__Group__2__Impl3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__34023 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__34026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__FilterAssignment_3_in_rule__Rule__Group__3__Impl4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__44083 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__44086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Rule__Group__4__Impl4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__54145 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__54148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Rule__Group__5__Impl4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__64207 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__64210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__RewritingRulesAssignment_6_in_rule__Rule__Group__6__Impl4237 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__74268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Rule__Group__7__Impl4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group__0__Impl_in_rule__EPackageOpDef__Group__04343 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group__1_in_rule__EPackageOpDef__Group__04346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_0__0_in_rule__EPackageOpDef__Group__0__Impl4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group__1__Impl_in_rule__EPackageOpDef__Group__14403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__0_in_rule__EPackageOpDef__Group__1__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_0__0__Impl_in_rule__EPackageOpDef__Group_0__04464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_0__1_in_rule__EPackageOpDef__Group_0__04467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EPackageOpDef__Group_0__0__Impl4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_0__1__Impl_in_rule__EPackageOpDef__Group_0__14526 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_0__2_in_rule__EPackageOpDef__Group_0__14529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__VarAssignment_0_1_in_rule__EPackageOpDef__Group_0__1__Impl4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_0__2__Impl_in_rule__EPackageOpDef__Group_0__24586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EPackageOpDef__Group_0__2__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__0__Impl_in_rule__EPackageOpDef__Group_1__04651 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__1_in_rule__EPackageOpDef__Group_1__04654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Alternatives_1_0_in_rule__EPackageOpDef__Group_1__0__Impl4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__1__Impl_in_rule__EPackageOpDef__Group_1__14711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__2_in_rule__EPackageOpDef__Group_1__14714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EPackageOpDef__Group_1__1__Impl4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__2__Impl_in_rule__EPackageOpDef__Group_1__24773 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__3_in_rule__EPackageOpDef__Group_1__24776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__RefAssignment_1_2_in_rule__EPackageOpDef__Group_1__2__Impl4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__3__Impl_in_rule__EPackageOpDef__Group_1__34833 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__4_in_rule__EPackageOpDef__Group_1__34836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EPackageOpDef__Group_1__3__Impl4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__4__Impl_in_rule__EPackageOpDef__Group_1__44895 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__5_in_rule__EPackageOpDef__Group_1__44898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EPackageOpDef__Group_1__4__Impl4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__5__Impl_in_rule__EPackageOpDef__Group_1__54957 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__6_in_rule__EPackageOpDef__Group_1__54960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EPackageOpDef__Group_1__5__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__6__Impl_in_rule__EPackageOpDef__Group_1__65019 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__7_in_rule__EPackageOpDef__Group_1__65022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EPackageOpDef__Group_1__6__Impl5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__7__Impl_in_rule__EPackageOpDef__Group_1__75081 = new BitSet(new long[]{0x0000000900040000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__8_in_rule__EPackageOpDef__Group_1__75084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EPackageOpDef__Group_1__7__Impl5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__8__Impl_in_rule__EPackageOpDef__Group_1__85143 = new BitSet(new long[]{0x0000000900040000L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__9_in_rule__EPackageOpDef__Group_1__85146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Alternatives_1_8_in_rule__EPackageOpDef__Group_1__8__Impl5173 = new BitSet(new long[]{0x0000000900000002L});
    public static final BitSet FOLLOW_rule__EPackageOpDef__Group_1__9__Impl_in_rule__EPackageOpDef__Group_1__95204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EPackageOpDef__Group_1__9__Impl5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group__0__Impl_in_rule__EClassOpDef__Group__05283 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group__1_in_rule__EClassOpDef__Group__05286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_0__0_in_rule__EClassOpDef__Group__0__Impl5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group__1__Impl_in_rule__EClassOpDef__Group__15343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__0_in_rule__EClassOpDef__Group__1__Impl5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_0__0__Impl_in_rule__EClassOpDef__Group_0__05404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_0__1_in_rule__EClassOpDef__Group_0__05407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EClassOpDef__Group_0__0__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_0__1__Impl_in_rule__EClassOpDef__Group_0__15466 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_0__2_in_rule__EClassOpDef__Group_0__15469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__VarAssignment_0_1_in_rule__EClassOpDef__Group_0__1__Impl5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_0__2__Impl_in_rule__EClassOpDef__Group_0__25526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EClassOpDef__Group_0__2__Impl5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__0__Impl_in_rule__EClassOpDef__Group_1__05591 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__1_in_rule__EClassOpDef__Group_1__05594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Alternatives_1_0_in_rule__EClassOpDef__Group_1__0__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__1__Impl_in_rule__EClassOpDef__Group_1__15651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__2_in_rule__EClassOpDef__Group_1__15654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EClassOpDef__Group_1__1__Impl5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__2__Impl_in_rule__EClassOpDef__Group_1__25713 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__3_in_rule__EClassOpDef__Group_1__25716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__RefAssignment_1_2_in_rule__EClassOpDef__Group_1__2__Impl5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__3__Impl_in_rule__EClassOpDef__Group_1__35773 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__4_in_rule__EClassOpDef__Group_1__35776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EClassOpDef__Group_1__3__Impl5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__4__Impl_in_rule__EClassOpDef__Group_1__45835 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__5_in_rule__EClassOpDef__Group_1__45838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EClassOpDef__Group_1__4__Impl5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__5__Impl_in_rule__EClassOpDef__Group_1__55897 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__6_in_rule__EClassOpDef__Group_1__55900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EClassOpDef__Group_1__5__Impl5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__6__Impl_in_rule__EClassOpDef__Group_1__65959 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__7_in_rule__EClassOpDef__Group_1__65962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EClassOpDef__Group_1__6__Impl5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1__7__Impl_in_rule__EClassOpDef__Group_1__76021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1_7__0_in_rule__EClassOpDef__Group_1__7__Impl6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1_7__0__Impl_in_rule__EClassOpDef__Group_1_7__06094 = new BitSet(new long[]{0x0000000F08040000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1_7__1_in_rule__EClassOpDef__Group_1_7__06097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EClassOpDef__Group_1_7__0__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1_7__1__Impl_in_rule__EClassOpDef__Group_1_7__16156 = new BitSet(new long[]{0x0000000F08040000L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1_7__2_in_rule__EClassOpDef__Group_1_7__16159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Alternatives_1_7_1_in_rule__EClassOpDef__Group_1_7__1__Impl6186 = new BitSet(new long[]{0x0000000F08000002L});
    public static final BitSet FOLLOW_rule__EClassOpDef__Group_1_7__2__Impl_in_rule__EClassOpDef__Group_1_7__26217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EClassOpDef__Group_1_7__2__Impl6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group__0__Impl_in_rule__EAttributeOpDef__Group__06282 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group__1_in_rule__EAttributeOpDef__Group__06285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_0__0_in_rule__EAttributeOpDef__Group__0__Impl6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group__1__Impl_in_rule__EAttributeOpDef__Group__16342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__0_in_rule__EAttributeOpDef__Group__1__Impl6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_0__0__Impl_in_rule__EAttributeOpDef__Group_0__06403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_0__1_in_rule__EAttributeOpDef__Group_0__06406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EAttributeOpDef__Group_0__0__Impl6434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_0__1__Impl_in_rule__EAttributeOpDef__Group_0__16465 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_0__2_in_rule__EAttributeOpDef__Group_0__16468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__VarAssignment_0_1_in_rule__EAttributeOpDef__Group_0__1__Impl6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_0__2__Impl_in_rule__EAttributeOpDef__Group_0__26525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EAttributeOpDef__Group_0__2__Impl6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__0__Impl_in_rule__EAttributeOpDef__Group_1__06590 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__1_in_rule__EAttributeOpDef__Group_1__06593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__0_in_rule__EAttributeOpDef__Group_1__0__Impl6620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__1__Impl_in_rule__EAttributeOpDef__Group_1__16650 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__2_in_rule__EAttributeOpDef__Group_1__16653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EAttributeOpDef__Group_1__1__Impl6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__2__Impl_in_rule__EAttributeOpDef__Group_1__26712 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__3_in_rule__EAttributeOpDef__Group_1__26715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EAttributeOpDef__Group_1__2__Impl6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1__3__Impl_in_rule__EAttributeOpDef__Group_1__36774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Alternatives_1_3_in_rule__EAttributeOpDef__Group_1__3__Impl6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__0__Impl_in_rule__EAttributeOpDef__Group_1_0__06839 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__1_in_rule__EAttributeOpDef__Group_1_0__06842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Alternatives_1_0_0_in_rule__EAttributeOpDef__Group_1_0__0__Impl6869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__1__Impl_in_rule__EAttributeOpDef__Group_1_0__16899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__2_in_rule__EAttributeOpDef__Group_1_0__16902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EAttributeOpDef__Group_1_0__1__Impl6930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__2__Impl_in_rule__EAttributeOpDef__Group_1_0__26961 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__3_in_rule__EAttributeOpDef__Group_1_0__26964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__RefAssignment_1_0_2_in_rule__EAttributeOpDef__Group_1_0__2__Impl6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__3__Impl_in_rule__EAttributeOpDef__Group_1_0__37021 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__4_in_rule__EAttributeOpDef__Group_1_0__37024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EAttributeOpDef__Group_1_0__3__Impl7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_0__4__Impl_in_rule__EAttributeOpDef__Group_1_0__47083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EAttributeOpDef__Group_1_0__4__Impl7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_3_0__0__Impl_in_rule__EAttributeOpDef__Group_1_3_0__07152 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_3_0__1_in_rule__EAttributeOpDef__Group_1_3_0__07155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EAttributeOpDef__Group_1_3_0__0__Impl7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_3_0__1__Impl_in_rule__EAttributeOpDef__Group_1_3_0__17214 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_3_0__2_in_rule__EAttributeOpDef__Group_1_3_0__17217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__SettersAssignment_1_3_0_1_in_rule__EAttributeOpDef__Group_1_3_0__1__Impl7244 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__EAttributeOpDef__Group_1_3_0__2__Impl_in_rule__EAttributeOpDef__Group_1_3_0__27275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EAttributeOpDef__Group_1_3_0__2__Impl7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group__0__Impl_in_rule__EReferenceOpDef__Group__07340 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group__1_in_rule__EReferenceOpDef__Group__07343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_0__0_in_rule__EReferenceOpDef__Group__0__Impl7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group__1__Impl_in_rule__EReferenceOpDef__Group__17400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__0_in_rule__EReferenceOpDef__Group__1__Impl7427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_0__0__Impl_in_rule__EReferenceOpDef__Group_0__07461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_0__1_in_rule__EReferenceOpDef__Group_0__07464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EReferenceOpDef__Group_0__0__Impl7492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_0__1__Impl_in_rule__EReferenceOpDef__Group_0__17523 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_0__2_in_rule__EReferenceOpDef__Group_0__17526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__VarAssignment_0_1_in_rule__EReferenceOpDef__Group_0__1__Impl7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_0__2__Impl_in_rule__EReferenceOpDef__Group_0__27583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EReferenceOpDef__Group_0__2__Impl7611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__0__Impl_in_rule__EReferenceOpDef__Group_1__07648 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__1_in_rule__EReferenceOpDef__Group_1__07651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__0_in_rule__EReferenceOpDef__Group_1__0__Impl7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__1__Impl_in_rule__EReferenceOpDef__Group_1__17708 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__2_in_rule__EReferenceOpDef__Group_1__17711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EReferenceOpDef__Group_1__1__Impl7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__2__Impl_in_rule__EReferenceOpDef__Group_1__27770 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__3_in_rule__EReferenceOpDef__Group_1__27773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EReferenceOpDef__Group_1__2__Impl7801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1__3__Impl_in_rule__EReferenceOpDef__Group_1__37832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_3__0_in_rule__EReferenceOpDef__Group_1__3__Impl7859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__0__Impl_in_rule__EReferenceOpDef__Group_1_0__07897 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__1_in_rule__EReferenceOpDef__Group_1_0__07900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Alternatives_1_0_0_in_rule__EReferenceOpDef__Group_1_0__0__Impl7927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__1__Impl_in_rule__EReferenceOpDef__Group_1_0__17957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__2_in_rule__EReferenceOpDef__Group_1_0__17960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EReferenceOpDef__Group_1_0__1__Impl7988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__2__Impl_in_rule__EReferenceOpDef__Group_1_0__28019 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__3_in_rule__EReferenceOpDef__Group_1_0__28022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__RefAssignment_1_0_2_in_rule__EReferenceOpDef__Group_1_0__2__Impl8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__3__Impl_in_rule__EReferenceOpDef__Group_1_0__38079 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__4_in_rule__EReferenceOpDef__Group_1_0__38082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EReferenceOpDef__Group_1_0__3__Impl8110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_0__4__Impl_in_rule__EReferenceOpDef__Group_1_0__48141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EReferenceOpDef__Group_1_0__4__Impl8169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_3__0__Impl_in_rule__EReferenceOpDef__Group_1_3__08210 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_3__1_in_rule__EReferenceOpDef__Group_1_3__08213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EReferenceOpDef__Group_1_3__0__Impl8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_3__1__Impl_in_rule__EReferenceOpDef__Group_1_3__18272 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_3__2_in_rule__EReferenceOpDef__Group_1_3__18275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__SettersAssignment_1_3_1_in_rule__EReferenceOpDef__Group_1_3__1__Impl8302 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__EReferenceOpDef__Group_1_3__2__Impl_in_rule__EReferenceOpDef__Group_1_3__28333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EReferenceOpDef__Group_1_3__2__Impl8361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__0__Impl_in_rule__SetterDef__Group__08398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__1_in_rule__SetterDef__Group__08401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SetterDef__Group__0__Impl8429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__1__Impl_in_rule__SetterDef__Group__18460 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__2_in_rule__SetterDef__Group__18463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__MetafeatureAssignment_1_in_rule__SetterDef__Group__1__Impl8490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__2__Impl_in_rule__SetterDef__Group__28520 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__3_in_rule__SetterDef__Group__28523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__OperatorAssignment_2_in_rule__SetterDef__Group__2__Impl8550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__3__Impl_in_rule__SetterDef__Group__38580 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__4_in_rule__SetterDef__Group__38583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__ParAssignment_3_in_rule__SetterDef__Group__3__Impl8610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__4__Impl_in_rule__SetterDef__Group__48640 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__5_in_rule__SetterDef__Group__48643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group_4__0_in_rule__SetterDef__Group__4__Impl8670 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group__5__Impl_in_rule__SetterDef__Group__58701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SetterDef__Group__5__Impl8729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group_4__0__Impl_in_rule__SetterDef__Group_4__08772 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SetterDef__Group_4__1_in_rule__SetterDef__Group_4__08775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SetterDef__Group_4__0__Impl8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__Group_4__1__Impl_in_rule__SetterDef__Group_4__18834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetterDef__ParAssignment_4_1_in_rule__SetterDef__Group_4__1__Impl8861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group__0__Impl_in_rule__RewritingRule__Group__08895 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group__1_in_rule__RewritingRule__Group__08898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_0__0_in_rule__RewritingRule__Group__0__Impl8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group__1__Impl_in_rule__RewritingRule__Group__18955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__0_in_rule__RewritingRule__Group__1__Impl8982 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_0__0__Impl_in_rule__RewritingRule__Group_0__09017 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_0__1_in_rule__RewritingRule__Group_0__09020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__MigratorSXAssignment_0_0_in_rule__RewritingRule__Group_0__0__Impl9047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_0__1__Impl_in_rule__RewritingRule__Group_0__19077 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_0__2_in_rule__RewritingRule__Group_0__19080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RewritingRule__Group_0__1__Impl9108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_0__2__Impl_in_rule__RewritingRule__Group_0__29139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__MigratorDXAssignment_0_2_in_rule__RewritingRule__Group_0__2__Impl9166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__0__Impl_in_rule__RewritingRule__Group_1__09202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__1_in_rule__RewritingRule__Group_1__09205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RewritingRule__Group_1__0__Impl9233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__1__Impl_in_rule__RewritingRule__Group_1__19264 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__2_in_rule__RewritingRule__Group_1__19267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__MigratorSXAssignment_1_1_in_rule__RewritingRule__Group_1__1__Impl9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__2__Impl_in_rule__RewritingRule__Group_1__29324 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__3_in_rule__RewritingRule__Group_1__29327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RewritingRule__Group_1__2__Impl9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__Group_1__3__Impl_in_rule__RewritingRule__Group_1__39386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RewritingRule__MigratorDXAssignment_1_3_in_rule__RewritingRule__Group_1__3__Impl9413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__0__Impl_in_rule__MigratorSX__Group__09451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__1_in_rule__MigratorSX__Group__09454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__1__Impl_in_rule__MigratorSX__Group__19512 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__2_in_rule__MigratorSX__Group__19515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__NameAssignment_1_in_rule__MigratorSX__Group__1__Impl9542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__2__Impl_in_rule__MigratorSX__Group__29572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__3_in_rule__MigratorSX__Group__29575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MigratorSX__Group__2__Impl9603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__3__Impl_in_rule__MigratorSX__Group__39634 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__4_in_rule__MigratorSX__Group__39637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__ElementSXAssignment_3_in_rule__MigratorSX__Group__3__Impl9664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__4__Impl_in_rule__MigratorSX__Group__49694 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__5_in_rule__MigratorSX__Group__49697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MigratorSX__Group__4__Impl9725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__5__Impl_in_rule__MigratorSX__Group__59756 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__6_in_rule__MigratorSX__Group__59759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MigratorSX__Group__5__Impl9787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__6__Impl_in_rule__MigratorSX__Group__69818 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__7_in_rule__MigratorSX__Group__69821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__FilterSXAssignment_6_in_rule__MigratorSX__Group__6__Impl9848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__7__Impl_in_rule__MigratorSX__Group__79878 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__8_in_rule__MigratorSX__Group__79881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group_7__0_in_rule__MigratorSX__Group__7__Impl9908 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group__8__Impl_in_rule__MigratorSX__Group__89939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MigratorSX__Group__8__Impl9967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group_7__0__Impl_in_rule__MigratorSX__Group_7__010016 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group_7__1_in_rule__MigratorSX__Group_7__010019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MigratorSX__Group_7__0__Impl10047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__Group_7__1__Impl_in_rule__MigratorSX__Group_7__110078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorSX__FilterSXAssignment_7_1_in_rule__MigratorSX__Group_7__1__Impl10105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0__0__Impl_in_rule__MigratorDX__Group_0__010139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0__1_in_rule__MigratorDX__Group_0__010142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0__1__Impl_in_rule__MigratorDX__Group_0__110200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__0_in_rule__MigratorDX__Group_0__1__Impl10227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__0__Impl_in_rule__MigratorDX__Group_0_1__010261 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__1_in_rule__MigratorDX__Group_0_1__010264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__NameAssignment_0_1_0_in_rule__MigratorDX__Group_0_1__0__Impl10291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__1__Impl_in_rule__MigratorDX__Group_0_1__110321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__2_in_rule__MigratorDX__Group_0_1__110324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MigratorDX__Group_0_1__1__Impl10352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__2__Impl_in_rule__MigratorDX__Group_0_1__210383 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__3_in_rule__MigratorDX__Group_0_1__210386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__ElementDXAssignment_0_1_2_in_rule__MigratorDX__Group_0_1__2__Impl10413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__3__Impl_in_rule__MigratorDX__Group_0_1__310443 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__4_in_rule__MigratorDX__Group_0_1__310446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MigratorDX__Group_0_1__3__Impl10474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__4__Impl_in_rule__MigratorDX__Group_0_1__410505 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__5_in_rule__MigratorDX__Group_0_1__410508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__FilterDXAssignment_0_1_4_in_rule__MigratorDX__Group_0_1__4__Impl10535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__5__Impl_in_rule__MigratorDX__Group_0_1__510565 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__6_in_rule__MigratorDX__Group_0_1__510568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1_5__0_in_rule__MigratorDX__Group_0_1__5__Impl10595 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1__6__Impl_in_rule__MigratorDX__Group_0_1__610626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MigratorDX__Group_0_1__6__Impl10654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1_5__0__Impl_in_rule__MigratorDX__Group_0_1_5__010699 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1_5__1_in_rule__MigratorDX__Group_0_1_5__010702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MigratorDX__Group_0_1_5__0__Impl10730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__Group_0_1_5__1__Impl_in_rule__MigratorDX__Group_0_1_5__110761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MigratorDX__FilterDXAssignment_0_1_5_1_in_rule__MigratorDX__Group_0_1_5__1__Impl10788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__Group__0__Impl_in_rule__FilterMigrator__Group__010822 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FilterMigrator__Group__1_in_rule__FilterMigrator__Group__010825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__FeatureSXAssignment_0_in_rule__FilterMigrator__Group__0__Impl10852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__Group__1__Impl_in_rule__FilterMigrator__Group__110882 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__FilterMigrator__Group__2_in_rule__FilterMigrator__Group__110885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__OpAssignment_1_in_rule__FilterMigrator__Group__1__Impl10912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__Group__2__Impl_in_rule__FilterMigrator__Group__210942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterMigrator__ValueAssignment_2_in_rule__FilterMigrator__Group__2__Impl10969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group__0__Impl_in_rule__DotNavigationObjSX__Group__011006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group__1_in_rule__DotNavigationObjSX__Group__011009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DotNavigationObjSX__Group__0__Impl11037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group__1__Impl_in_rule__DotNavigationObjSX__Group__111068 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group__2_in_rule__DotNavigationObjSX__Group__111071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__ObjAssignment_1_in_rule__DotNavigationObjSX__Group__1__Impl11098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group__2__Impl_in_rule__DotNavigationObjSX__Group__211128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group_2__0_in_rule__DotNavigationObjSX__Group__2__Impl11155 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group_2__0__Impl_in_rule__DotNavigationObjSX__Group_2__011192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group_2__1_in_rule__DotNavigationObjSX__Group_2__011195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__DotNavigationObjSX__Group_2__0__Impl11223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__Group_2__1__Impl_in_rule__DotNavigationObjSX__Group_2__111254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjSX__RefAssignment_2_1_in_rule__DotNavigationObjSX__Group_2__1__Impl11281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group__0__Impl_in_rule__DotNavigationObjDX__Group__011315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group__1_in_rule__DotNavigationObjDX__Group__011318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DotNavigationObjDX__Group__0__Impl11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group__1__Impl_in_rule__DotNavigationObjDX__Group__111377 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group__2_in_rule__DotNavigationObjDX__Group__111380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__ObjAssignment_1_in_rule__DotNavigationObjDX__Group__1__Impl11407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group__2__Impl_in_rule__DotNavigationObjDX__Group__211437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group_2__0_in_rule__DotNavigationObjDX__Group__2__Impl11464 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group_2__0__Impl_in_rule__DotNavigationObjDX__Group_2__011501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group_2__1_in_rule__DotNavigationObjDX__Group_2__011504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__DotNavigationObjDX__Group_2__0__Impl11532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__Group_2__1__Impl_in_rule__DotNavigationObjDX__Group_2__111563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotNavigationObjDX__RefAssignment_2_1_in_rule__DotNavigationObjDX__Group_2__1__Impl11590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__011624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__011627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Parameter__Group__0__Impl11655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__111686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl11713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__011747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__011750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__111808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl11835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__011869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__011872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__111930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl11957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__011991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__011994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__112052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl12079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__012113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__012116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__112174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl12201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationLibrary_in_rule__MyModel__MigrationLibAssignment_012240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationProgram_in_rule__MyModel__MigrationProgrAssignment_112271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigrationLibrary__NameAssignment_112302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__MigrationLibrary__RulesAssignment_312333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigrationProgram__NameAssignment_112368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MigrationProgram__LibsAssignment_3_112399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MigrationProgram__MigrAssignment_412435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifact_in_rule__MigrationProgram__TypeArtAssignment_512474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MigrationProgram__ArtifactAssignment_612505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigrationProgram__TransformationPackageAssignment_8_012540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigrationProgram__TransformationPackageAssignment_8_1_112579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MigrationProgram__DeltaAssignment_1012614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__MigrationProgram__RulesAssignment_1212645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artifact__TypeAlternatives_0_in_rule__Artifact__TypeAssignment12676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_112709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpDef_in_rule__Rule__FilterAssignment_312740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewritingRule_in_rule__Rule__RewritingRulesAssignment_612771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__EPackageOpDef__VarAssignment_0_112802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EPackageOpDef__OpAssignment_1_0_012838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EPackageOpDef__OpAssignment_1_0_112882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EPackageOpDef__OpAssignment_1_0_212926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__EPackageOpDef__RefAssignment_1_212965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetterDef_in_rule__EPackageOpDef__SettersAssignment_1_8_012996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassOpDef_in_rule__EPackageOpDef__ClassesAssignment_1_8_113027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__EClassOpDef__VarAssignment_0_113058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EClassOpDef__OpAssignment_1_0_013094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EClassOpDef__OpAssignment_1_0_113138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EClassOpDef__OpAssignment_1_0_213182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__EClassOpDef__RefAssignment_1_213221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetterDef_in_rule__EClassOpDef__SettersAssignment_1_7_1_013252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttributeOpDef_in_rule__EClassOpDef__AttributesAssignment_1_7_1_113283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReferenceOpDef_in_rule__EClassOpDef__ReferencesAssignment_1_7_1_213314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EAttributeOpDef__VarAssignment_0_113345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__EAttributeOpDef__OpAssignment_1_0_0_013381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__EAttributeOpDef__OpAssignment_1_0_0_113425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__EAttributeOpDef__OpAssignment_1_0_0_213469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EAttributeOpDef__RefAssignment_1_0_213508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetterDef_in_rule__EAttributeOpDef__SettersAssignment_1_3_0_113539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__EReferenceOpDef__VarAssignment_0_113570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__EReferenceOpDef__OpAssignment_1_0_0_013606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__EReferenceOpDef__OpAssignment_1_0_0_113650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__EReferenceOpDef__OpAssignment_1_0_0_213694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__EReferenceOpDef__RefAssignment_1_0_213733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesetterDef_in_rule__EReferenceOpDef__SettersAssignment_1_3_113764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SetterDef__MetafeatureAssignment_113799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SetterDef__OperatorAssignment_213839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__SetterDef__ParAssignment_313878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__SetterDef__ParAssignment_4_113909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_rule__RewritingRule__MigratorSXAssignment_0_013940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_rule__RewritingRule__MigratorDXAssignment_0_213971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorSX_in_rule__RewritingRule__MigratorSXAssignment_1_114002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigratorDX_in_rule__RewritingRule__MigratorDXAssignment_1_314033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigratorSX__NameAssignment_114064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigratorSX__ElementSXAssignment_314099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_rule__MigratorSX__FilterSXAssignment_614134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_rule__MigratorSX__FilterSXAssignment_7_114165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigratorDX__NameAssignment_0_1_014196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MigratorDX__ElementDXAssignment_0_1_214231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_rule__MigratorDX__FilterDXAssignment_0_1_414266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterMigrator_in_rule__MigratorDX__FilterDXAssignment_0_1_5_114297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjSX_in_rule__FilterMigrator__FeatureSXAssignment_014328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FilterMigrator__OpAssignment_114364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotNavigationObjDX_in_rule__FilterMigrator__ValueAssignment_214403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DotNavigationObjSX__ObjAssignment_114438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DotNavigationObjSX__RefAssignment_2_114477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DotNavigationObjDX__ObjAssignment_114516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DotNavigationObjDX__RefAssignment_2_114555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_114590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_114621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_114652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_114683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_114714 = new BitSet(new long[]{0x0000000000000002L});

}