// $ANTLR ${project.version} ${buildNumber}

	package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;


import org.antlr.runtime3_3_0.*;

public class EmigLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int TEXT=4;
    public static final int PACKAGEOP=5;
    public static final int CLASSOP=6;
    public static final int ATTOP=7;
    public static final int REFOP=8;
    public static final int QUOTED_34_34_92=9;
    public static final int QUOTED_39_39_92=10;
    public static final int EQ=11;
    public static final int COLLECTIONTYPE=12;
    public static final int STRINGTYPE=13;
    public static final int BOOLEANTYPE=14;
    public static final int INTEGERTYPE=15;
    public static final int REALTYPE=16;
    public static final int BAGTYPE=17;
    public static final int ORDEREDSETTYPE=18;
    public static final int SEQUENCETYPE=19;
    public static final int SETTYPE=20;
    public static final int OCLANYTYPE=21;
    public static final int OCLTYPE=22;
    public static final int TUPLETYPE=23;
    public static final int TUPLE=24;
    public static final int MAPTYPE=25;
    public static final int LAMBDATYPE=26;
    public static final int ENVTYPE=27;
    public static final int BOOLOP=28;
    public static final int NEQ=29;
    public static final int RELOP=30;
    public static final int ADDOP=31;
    public static final int INTOP=32;
    public static final int MULOP=33;
    public static final int NOTOP=34;
    public static final int FLOAT=35;
    public static final int INTEGER=36;
    public static final int COMMENT=37;
    public static final int LINEBREAK=38;
    public static final int WHITESPACE=39;

    	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public EmigLexer() {;} 
    public EmigLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public EmigLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Emig.g"; }

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:16:7: ( 'migration' )
            // Emig.g:16:9: 'migration'
            {
            match("migration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:17:7: ( ';' )
            // Emig.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:18:7: ( 'migrate' )
            // Emig.g:18:9: 'migrate'
            {
            match("migrate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:19:7: ( 'with' )
            // Emig.g:19:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:20:7: ( 'library' )
            // Emig.g:20:9: 'library'
            {
            match("library"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:21:7: ( 'rule' )
            // Emig.g:21:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:22:7: ( '[' )
            // Emig.g:22:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:23:7: ( ']' )
            // Emig.g:23:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:24:7: ( '{' )
            // Emig.g:24:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:25:7: ( '}' )
            // Emig.g:25:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:26:7: ( 'where' )
            // Emig.g:26:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:27:7: ( 'package' )
            // Emig.g:27:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:28:7: ( 'class' )
            // Emig.g:28:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:29:7: ( 'attribute' )
            // Emig.g:29:9: 'attribute'
            {
            match("attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:30:7: ( 'reference' )
            // Emig.g:30:9: 'reference'
            {
            match("reference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:31:7: ( 'set' )
            // Emig.g:31:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:32:7: ( '<-' )
            // Emig.g:32:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:33:7: ( 'var' )
            // Emig.g:33:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:34:7: ( ',' )
            // Emig.g:34:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:35:7: ( '->' )
            // Emig.g:35:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:36:7: ( 'drop' )
            // Emig.g:36:9: 'drop'
            {
            match("drop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:37:7: ( ':' )
            // Emig.g:37:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:38:7: ( 'module' )
            // Emig.g:38:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:39:7: ( 'import' )
            // Emig.g:39:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:40:7: ( 'static' )
            // Emig.g:40:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:41:7: ( 'def' )
            // Emig.g:41:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:42:7: ( 'context' )
            // Emig.g:42:9: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:43:7: ( 'metamodel' )
            // Emig.g:43:9: 'metamodel'
            {
            match("metamodel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:44:7: ( '(' )
            // Emig.g:44:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:45:7: ( ')' )
            // Emig.g:45:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:46:7: ( '::' )
            // Emig.g:46:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:47:7: ( '.' )
            // Emig.g:47:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:48:7: ( 'iterate' )
            // Emig.g:48:9: 'iterate'
            {
            match("iterate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:49:7: ( '|' )
            // Emig.g:49:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:50:7: ( '!' )
            // Emig.g:50:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:51:7: ( 'super' )
            // Emig.g:51:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:52:7: ( 'self' )
            // Emig.g:52:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:53:7: ( 'env' )
            // Emig.g:53:9: 'env'
            {
            match("env"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:54:7: ( 'true' )
            // Emig.g:54:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:55:7: ( 'false' )
            // Emig.g:55:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:56:7: ( '#' )
            // Emig.g:56:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:57:7: ( 'OclUndefined' )
            // Emig.g:57:9: 'OclUndefined'
            {
            match("OclUndefined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:58:7: ( 'let' )
            // Emig.g:58:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:59:7: ( 'in' )
            // Emig.g:59:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:60:7: ( 'if' )
            // Emig.g:60:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:61:7: ( 'then' )
            // Emig.g:61:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:62:7: ( 'else' )
            // Emig.g:62:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:63:7: ( 'endif' )
            // Emig.g:63:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "PACKAGEOP"
    public final void mPACKAGEOP() throws RecognitionException {
        try {
            int _type = PACKAGEOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14436:10: ( ( 'addPackage' | 'changePackage' | 'deletePackage' ) )
            // Emig.g:14437:1: ( 'addPackage' | 'changePackage' | 'deletePackage' )
            {
            // Emig.g:14437:1: ( 'addPackage' | 'changePackage' | 'deletePackage' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt1=1;
                }
                break;
            case 'c':
                {
                alt1=2;
                }
                break;
            case 'd':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // Emig.g:14437:2: 'addPackage'
                    {
                    match("addPackage"); 


                    }
                    break;
                case 2 :
                    // Emig.g:14437:15: 'changePackage'
                    {
                    match("changePackage"); 


                    }
                    break;
                case 3 :
                    // Emig.g:14437:31: 'deletePackage'
                    {
                    match("deletePackage"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PACKAGEOP"

    // $ANTLR start "CLASSOP"
    public final void mCLASSOP() throws RecognitionException {
        try {
            int _type = CLASSOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14439:8: ( ( 'addClass' | 'changeClass' | 'deleteClass' ) )
            // Emig.g:14440:1: ( 'addClass' | 'changeClass' | 'deleteClass' )
            {
            // Emig.g:14440:1: ( 'addClass' | 'changeClass' | 'deleteClass' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt2=1;
                }
                break;
            case 'c':
                {
                alt2=2;
                }
                break;
            case 'd':
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
                    // Emig.g:14440:2: 'addClass'
                    {
                    match("addClass"); 


                    }
                    break;
                case 2 :
                    // Emig.g:14440:13: 'changeClass'
                    {
                    match("changeClass"); 


                    }
                    break;
                case 3 :
                    // Emig.g:14440:27: 'deleteClass'
                    {
                    match("deleteClass"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASSOP"

    // $ANTLR start "ATTOP"
    public final void mATTOP() throws RecognitionException {
        try {
            int _type = ATTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14442:6: ( ( 'addAttribute' | 'changeAttribute' | 'deleteAttribute' ) )
            // Emig.g:14443:1: ( 'addAttribute' | 'changeAttribute' | 'deleteAttribute' )
            {
            // Emig.g:14443:1: ( 'addAttribute' | 'changeAttribute' | 'deleteAttribute' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt3=1;
                }
                break;
            case 'c':
                {
                alt3=2;
                }
                break;
            case 'd':
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
                    // Emig.g:14443:2: 'addAttribute'
                    {
                    match("addAttribute"); 


                    }
                    break;
                case 2 :
                    // Emig.g:14443:17: 'changeAttribute'
                    {
                    match("changeAttribute"); 


                    }
                    break;
                case 3 :
                    // Emig.g:14443:35: 'deleteAttribute'
                    {
                    match("deleteAttribute"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATTOP"

    // $ANTLR start "REFOP"
    public final void mREFOP() throws RecognitionException {
        try {
            int _type = REFOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14445:6: ( ( 'addReference' | 'changeReference' | 'deleteReference' ) )
            // Emig.g:14446:1: ( 'addReference' | 'changeReference' | 'deleteReference' )
            {
            // Emig.g:14446:1: ( 'addReference' | 'changeReference' | 'deleteReference' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt4=1;
                }
                break;
            case 'c':
                {
                alt4=2;
                }
                break;
            case 'd':
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
                    // Emig.g:14446:2: 'addReference'
                    {
                    match("addReference"); 


                    }
                    break;
                case 2 :
                    // Emig.g:14446:17: 'changeReference'
                    {
                    match("changeReference"); 


                    }
                    break;
                case 3 :
                    // Emig.g:14446:35: 'deleteReference'
                    {
                    match("deleteReference"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFOP"

    // $ANTLR start "NOTOP"
    public final void mNOTOP() throws RecognitionException {
        try {
            int _type = NOTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14448:6: ( ( 'not' ) )
            // Emig.g:14449:1: ( 'not' )
            {
            // Emig.g:14449:1: ( 'not' )
            // Emig.g:14449:2: 'not'
            {
            match("not"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTOP"

    // $ANTLR start "BOOLOP"
    public final void mBOOLOP() throws RecognitionException {
        try {
            int _type = BOOLOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14451:7: ( ( ( 'and' | 'or' | 'xor' | 'implies' ) ) )
            // Emig.g:14452:1: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            {
            // Emig.g:14452:1: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            // Emig.g:14452:2: ( 'and' | 'or' | 'xor' | 'implies' )
            {
            // Emig.g:14452:2: ( 'and' | 'or' | 'xor' | 'implies' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt5=1;
                }
                break;
            case 'o':
                {
                alt5=2;
                }
                break;
            case 'x':
                {
                alt5=3;
                }
                break;
            case 'i':
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // Emig.g:14452:3: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 2 :
                    // Emig.g:14452:9: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 3 :
                    // Emig.g:14452:14: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 4 :
                    // Emig.g:14452:20: 'implies'
                    {
                    match("implies"); 


                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLOP"

    // $ANTLR start "INTOP"
    public final void mINTOP() throws RecognitionException {
        try {
            int _type = INTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14454:6: ( ( ( 'div' | 'mod' ) ) )
            // Emig.g:14455:1: ( ( 'div' | 'mod' ) )
            {
            // Emig.g:14455:1: ( ( 'div' | 'mod' ) )
            // Emig.g:14455:2: ( 'div' | 'mod' )
            {
            // Emig.g:14455:2: ( 'div' | 'mod' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='d') ) {
                alt6=1;
            }
            else if ( (LA6_0=='m') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // Emig.g:14455:3: 'div'
                    {
                    match("div"); 


                    }
                    break;
                case 2 :
                    // Emig.g:14455:9: 'mod'
                    {
                    match("mod"); 


                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTOP"

    // $ANTLR start "RELOP"
    public final void mRELOP() throws RecognitionException {
        try {
            int _type = RELOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14457:6: ( ( ( '>' | '<' | '>=' | '<=' ) ) )
            // Emig.g:14458:1: ( ( '>' | '<' | '>=' | '<=' ) )
            {
            // Emig.g:14458:1: ( ( '>' | '<' | '>=' | '<=' ) )
            // Emig.g:14458:2: ( '>' | '<' | '>=' | '<=' )
            {
            // Emig.g:14458:2: ( '>' | '<' | '>=' | '<=' )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='>') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='=') ) {
                    alt7=3;
                }
                else {
                    alt7=1;}
            }
            else if ( (LA7_0=='<') ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2=='=') ) {
                    alt7=4;
                }
                else {
                    alt7=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // Emig.g:14458:3: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // Emig.g:14458:7: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // Emig.g:14458:11: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // Emig.g:14458:16: '<='
                    {
                    match("<="); 


                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELOP"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14460:3: ( '=' )
            // Emig.g:14461:1: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14462:4: ( ( '<>' ) )
            // Emig.g:14463:1: ( '<>' )
            {
            // Emig.g:14463:1: ( '<>' )
            // Emig.g:14463:2: '<>'
            {
            match("<>"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "ADDOP"
    public final void mADDOP() throws RecognitionException {
        try {
            int _type = ADDOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14465:6: ( ( ( '-' | '+' ) ) )
            // Emig.g:14466:1: ( ( '-' | '+' ) )
            {
            // Emig.g:14466:1: ( ( '-' | '+' ) )
            // Emig.g:14466:2: ( '-' | '+' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADDOP"

    // $ANTLR start "MULOP"
    public final void mMULOP() throws RecognitionException {
        try {
            int _type = MULOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14468:6: ( ( ( '*' | '/' ) ) )
            // Emig.g:14469:1: ( ( '*' | '/' ) )
            {
            // Emig.g:14469:1: ( ( '*' | '/' ) )
            // Emig.g:14469:2: ( '*' | '/' )
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULOP"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14471:8: ( ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Emig.g:14472:1: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Emig.g:14472:1: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Emig.g:14472:2: '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("--"); 

            // Emig.g:14472:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Emig.g:14472:7: ~ ( '\\n' | '\\r' | '\\uffff' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14475:6: ( ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ ) )
            // Emig.g:14476:1: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            {
            // Emig.g:14476:1: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            // Emig.g:14476:2: ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+
            {
            // Emig.g:14476:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Emig.g:14476:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Emig.g:14476:6: ( ( '0' .. '9' ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Emig.g:14476:7: ( '0' .. '9' )
            	    {
            	    // Emig.g:14476:7: ( '0' .. '9' )
            	    // Emig.g:14476:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            match('.'); 
            // Emig.g:14476:22: ( ( '0' .. '9' ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Emig.g:14476:23: ( '0' .. '9' )
            	    {
            	    // Emig.g:14476:23: ( '0' .. '9' )
            	    // Emig.g:14476:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14478:8: ( ( ( '-' )? ( ( '0' .. '9' ) )+ ) )
            // Emig.g:14479:1: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            {
            // Emig.g:14479:1: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            // Emig.g:14479:2: ( '-' )? ( ( '0' .. '9' ) )+
            {
            // Emig.g:14479:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Emig.g:14479:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Emig.g:14479:6: ( ( '0' .. '9' ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Emig.g:14479:7: ( '0' .. '9' )
            	    {
            	    // Emig.g:14479:7: ( '0' .. '9' )
            	    // Emig.g:14479:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "STRINGTYPE"
    public final void mSTRINGTYPE() throws RecognitionException {
        try {
            int _type = STRINGTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14481:11: ( ( 'String' ) )
            // Emig.g:14482:1: ( 'String' )
            {
            // Emig.g:14482:1: ( 'String' )
            // Emig.g:14482:2: 'String'
            {
            match("String"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRINGTYPE"

    // $ANTLR start "BOOLEANTYPE"
    public final void mBOOLEANTYPE() throws RecognitionException {
        try {
            int _type = BOOLEANTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14484:12: ( ( 'Boolean' ) )
            // Emig.g:14485:1: ( 'Boolean' )
            {
            // Emig.g:14485:1: ( 'Boolean' )
            // Emig.g:14485:2: 'Boolean'
            {
            match("Boolean"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEANTYPE"

    // $ANTLR start "INTEGERTYPE"
    public final void mINTEGERTYPE() throws RecognitionException {
        try {
            int _type = INTEGERTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14487:12: ( ( 'Integer' ) )
            // Emig.g:14488:1: ( 'Integer' )
            {
            // Emig.g:14488:1: ( 'Integer' )
            // Emig.g:14488:2: 'Integer'
            {
            match("Integer"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGERTYPE"

    // $ANTLR start "REALTYPE"
    public final void mREALTYPE() throws RecognitionException {
        try {
            int _type = REALTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14490:9: ( ( 'Real' ) )
            // Emig.g:14491:1: ( 'Real' )
            {
            // Emig.g:14491:1: ( 'Real' )
            // Emig.g:14491:2: 'Real'
            {
            match("Real"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REALTYPE"

    // $ANTLR start "COLLECTIONTYPE"
    public final void mCOLLECTIONTYPE() throws RecognitionException {
        try {
            int _type = COLLECTIONTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14493:15: ( ( 'Collection' ) )
            // Emig.g:14494:1: ( 'Collection' )
            {
            // Emig.g:14494:1: ( 'Collection' )
            // Emig.g:14494:2: 'Collection'
            {
            match("Collection"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLLECTIONTYPE"

    // $ANTLR start "BAGTYPE"
    public final void mBAGTYPE() throws RecognitionException {
        try {
            int _type = BAGTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14496:8: ( 'Bag' )
            // Emig.g:14497:1: 'Bag'
            {
            match("Bag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAGTYPE"

    // $ANTLR start "ORDEREDSETTYPE"
    public final void mORDEREDSETTYPE() throws RecognitionException {
        try {
            int _type = ORDEREDSETTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14498:15: ( 'OrderedSet' )
            // Emig.g:14499:1: 'OrderedSet'
            {
            match("OrderedSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDEREDSETTYPE"

    // $ANTLR start "SEQUENCETYPE"
    public final void mSEQUENCETYPE() throws RecognitionException {
        try {
            int _type = SEQUENCETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14500:13: ( 'Sequence' )
            // Emig.g:14501:1: 'Sequence'
            {
            match("Sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEQUENCETYPE"

    // $ANTLR start "SETTYPE"
    public final void mSETTYPE() throws RecognitionException {
        try {
            int _type = SETTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14502:8: ( 'Set' )
            // Emig.g:14503:1: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SETTYPE"

    // $ANTLR start "OCLANYTYPE"
    public final void mOCLANYTYPE() throws RecognitionException {
        try {
            int _type = OCLANYTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14504:11: ( ( 'OclAny' ) )
            // Emig.g:14505:1: ( 'OclAny' )
            {
            // Emig.g:14505:1: ( 'OclAny' )
            // Emig.g:14505:2: 'OclAny'
            {
            match("OclAny"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OCLANYTYPE"

    // $ANTLR start "OCLTYPE"
    public final void mOCLTYPE() throws RecognitionException {
        try {
            int _type = OCLTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14507:8: ( ( 'OclType' ) )
            // Emig.g:14508:1: ( 'OclType' )
            {
            // Emig.g:14508:1: ( 'OclType' )
            // Emig.g:14508:2: 'OclType'
            {
            match("OclType"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OCLTYPE"

    // $ANTLR start "TUPLETYPE"
    public final void mTUPLETYPE() throws RecognitionException {
        try {
            int _type = TUPLETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14510:10: ( ( 'TupleType' ) )
            // Emig.g:14511:1: ( 'TupleType' )
            {
            // Emig.g:14511:1: ( 'TupleType' )
            // Emig.g:14511:2: 'TupleType'
            {
            match("TupleType"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TUPLETYPE"

    // $ANTLR start "TUPLE"
    public final void mTUPLE() throws RecognitionException {
        try {
            int _type = TUPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14513:6: ( 'Tuple' )
            // Emig.g:14514:1: 'Tuple'
            {
            match("Tuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TUPLE"

    // $ANTLR start "MAPTYPE"
    public final void mMAPTYPE() throws RecognitionException {
        try {
            int _type = MAPTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14515:8: ( 'Map' )
            // Emig.g:14516:1: 'Map'
            {
            match("Map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAPTYPE"

    // $ANTLR start "LAMBDATYPE"
    public final void mLAMBDATYPE() throws RecognitionException {
        try {
            int _type = LAMBDATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14517:11: ( ( 'Lambda' ) )
            // Emig.g:14518:1: ( 'Lambda' )
            {
            // Emig.g:14518:1: ( 'Lambda' )
            // Emig.g:14518:2: 'Lambda'
            {
            match("Lambda"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAMBDATYPE"

    // $ANTLR start "ENVTYPE"
    public final void mENVTYPE() throws RecognitionException {
        try {
            int _type = ENVTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14520:8: ( ( 'Env' ) )
            // Emig.g:14521:1: ( 'Env' )
            {
            // Emig.g:14521:1: ( 'Env' )
            // Emig.g:14521:2: 'Env'
            {
            match("Env"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENVTYPE"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14523:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* ) )
            // Emig.g:14524:1: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            {
            // Emig.g:14524:1: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            // Emig.g:14524:2: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Emig.g:14524:21: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            loop14:
            do {
                int alt14=4;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt14=1;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt14=2;
                    }
                    break;
                case '_':
                    {
                    alt14=3;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // Emig.g:14524:22: ( 'A' .. 'Z' | 'a' .. 'z' )
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // Emig.g:14524:42: ( '0' .. '9' )
            	    {
            	    // Emig.g:14524:42: ( '0' .. '9' )
            	    // Emig.g:14524:43: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Emig.g:14524:53: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14526:10: ( ( ( '\\r\\n' | '\\'r' | '\\n' ) ) )
            // Emig.g:14527:1: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            {
            // Emig.g:14527:1: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            // Emig.g:14527:2: ( '\\r\\n' | '\\'r' | '\\n' )
            {
            // Emig.g:14527:2: ( '\\r\\n' | '\\'r' | '\\n' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case '\r':
                {
                alt15=1;
                }
                break;
            case '\'':
                {
                alt15=2;
                }
                break;
            case '\n':
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
                    // Emig.g:14527:3: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Emig.g:14527:10: '\\'r'
                    {
                    match("'r"); 


                    }
                    break;
                case 3 :
                    // Emig.g:14527:16: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14530:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Emig.g:14531:1: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // Emig.g:14531:1: ( ( ' ' | '\\t' | '\\f' ) )
            // Emig.g:14531:2: ( ' ' | '\\t' | '\\f' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "QUOTED_34_34_92"
    public final void mQUOTED_34_34_92() throws RecognitionException {
        try {
            int _type = QUOTED_34_34_92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14534:16: ( ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' ) ) )
            // Emig.g:14535:1: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' ) )
            {
            // Emig.g:14535:1: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' ) )
            // Emig.g:14535:2: ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' )
            {
            // Emig.g:14535:2: ( '\"' )
            // Emig.g:14535:3: '\"'
            {
            match('\"'); 

            }

            // Emig.g:14535:7: ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )*
            loop16:
            do {
                int alt16=4;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\\') ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2=='\"') ) {
                        alt16=1;
                    }
                    else if ( (LA16_2=='\\') ) {
                        alt16=2;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                    alt16=3;
                }


                switch (alt16) {
            	case 1 :
            	    // Emig.g:14535:8: ( '\\\\' '\"' )
            	    {
            	    // Emig.g:14535:8: ( '\\\\' '\"' )
            	    // Emig.g:14535:9: '\\\\' '\"'
            	    {
            	    match('\\'); 
            	    match('\"'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Emig.g:14535:18: ( '\\\\' '\\\\' )
            	    {
            	    // Emig.g:14535:18: ( '\\\\' '\\\\' )
            	    // Emig.g:14535:19: '\\\\' '\\\\'
            	    {
            	    match('\\'); 
            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Emig.g:14535:29: ~ ( '\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // Emig.g:14535:42: ( '\"' )
            // Emig.g:14535:43: '\"'
            {
            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_34_34_92"

    // $ANTLR start "QUOTED_39_39_92"
    public final void mQUOTED_39_39_92() throws RecognitionException {
        try {
            int _type = QUOTED_39_39_92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Emig.g:14537:16: ( ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' ) ) )
            // Emig.g:14538:1: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' ) )
            {
            // Emig.g:14538:1: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' ) )
            // Emig.g:14538:2: ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' )
            {
            // Emig.g:14538:2: ( '\\'' )
            // Emig.g:14538:3: '\\''
            {
            match('\''); 

            }

            // Emig.g:14538:8: ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )*
            loop17:
            do {
                int alt17=4;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\\') ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2=='\'') ) {
                        alt17=1;
                    }
                    else if ( (LA17_2=='\\') ) {
                        alt17=2;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                    alt17=3;
                }


                switch (alt17) {
            	case 1 :
            	    // Emig.g:14538:9: ( '\\\\' '\\'' )
            	    {
            	    // Emig.g:14538:9: ( '\\\\' '\\'' )
            	    // Emig.g:14538:10: '\\\\' '\\''
            	    {
            	    match('\\'); 
            	    match('\''); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Emig.g:14538:20: ( '\\\\' '\\\\' )
            	    {
            	    // Emig.g:14538:20: ( '\\\\' '\\\\' )
            	    // Emig.g:14538:21: '\\\\' '\\\\'
            	    {
            	    match('\\'); 
            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Emig.g:14538:31: ~ ( '\\'' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // Emig.g:14538:45: ( '\\'' )
            // Emig.g:14538:46: '\\''
            {
            match('\''); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_39_39_92"

    public void mTokens() throws RecognitionException {
        // Emig.g:1:8: ( T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | PACKAGEOP | CLASSOP | ATTOP | REFOP | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | OCLTYPE | TUPLETYPE | TUPLE | MAPTYPE | LAMBDATYPE | ENVTYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 )
        int alt18=84;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // Emig.g:1:10: T__40
                {
                mT__40(); 

                }
                break;
            case 2 :
                // Emig.g:1:16: T__41
                {
                mT__41(); 

                }
                break;
            case 3 :
                // Emig.g:1:22: T__42
                {
                mT__42(); 

                }
                break;
            case 4 :
                // Emig.g:1:28: T__43
                {
                mT__43(); 

                }
                break;
            case 5 :
                // Emig.g:1:34: T__44
                {
                mT__44(); 

                }
                break;
            case 6 :
                // Emig.g:1:40: T__45
                {
                mT__45(); 

                }
                break;
            case 7 :
                // Emig.g:1:46: T__46
                {
                mT__46(); 

                }
                break;
            case 8 :
                // Emig.g:1:52: T__47
                {
                mT__47(); 

                }
                break;
            case 9 :
                // Emig.g:1:58: T__48
                {
                mT__48(); 

                }
                break;
            case 10 :
                // Emig.g:1:64: T__49
                {
                mT__49(); 

                }
                break;
            case 11 :
                // Emig.g:1:70: T__50
                {
                mT__50(); 

                }
                break;
            case 12 :
                // Emig.g:1:76: T__51
                {
                mT__51(); 

                }
                break;
            case 13 :
                // Emig.g:1:82: T__52
                {
                mT__52(); 

                }
                break;
            case 14 :
                // Emig.g:1:88: T__53
                {
                mT__53(); 

                }
                break;
            case 15 :
                // Emig.g:1:94: T__54
                {
                mT__54(); 

                }
                break;
            case 16 :
                // Emig.g:1:100: T__55
                {
                mT__55(); 

                }
                break;
            case 17 :
                // Emig.g:1:106: T__56
                {
                mT__56(); 

                }
                break;
            case 18 :
                // Emig.g:1:112: T__57
                {
                mT__57(); 

                }
                break;
            case 19 :
                // Emig.g:1:118: T__58
                {
                mT__58(); 

                }
                break;
            case 20 :
                // Emig.g:1:124: T__59
                {
                mT__59(); 

                }
                break;
            case 21 :
                // Emig.g:1:130: T__60
                {
                mT__60(); 

                }
                break;
            case 22 :
                // Emig.g:1:136: T__61
                {
                mT__61(); 

                }
                break;
            case 23 :
                // Emig.g:1:142: T__62
                {
                mT__62(); 

                }
                break;
            case 24 :
                // Emig.g:1:148: T__63
                {
                mT__63(); 

                }
                break;
            case 25 :
                // Emig.g:1:154: T__64
                {
                mT__64(); 

                }
                break;
            case 26 :
                // Emig.g:1:160: T__65
                {
                mT__65(); 

                }
                break;
            case 27 :
                // Emig.g:1:166: T__66
                {
                mT__66(); 

                }
                break;
            case 28 :
                // Emig.g:1:172: T__67
                {
                mT__67(); 

                }
                break;
            case 29 :
                // Emig.g:1:178: T__68
                {
                mT__68(); 

                }
                break;
            case 30 :
                // Emig.g:1:184: T__69
                {
                mT__69(); 

                }
                break;
            case 31 :
                // Emig.g:1:190: T__70
                {
                mT__70(); 

                }
                break;
            case 32 :
                // Emig.g:1:196: T__71
                {
                mT__71(); 

                }
                break;
            case 33 :
                // Emig.g:1:202: T__72
                {
                mT__72(); 

                }
                break;
            case 34 :
                // Emig.g:1:208: T__73
                {
                mT__73(); 

                }
                break;
            case 35 :
                // Emig.g:1:214: T__74
                {
                mT__74(); 

                }
                break;
            case 36 :
                // Emig.g:1:220: T__75
                {
                mT__75(); 

                }
                break;
            case 37 :
                // Emig.g:1:226: T__76
                {
                mT__76(); 

                }
                break;
            case 38 :
                // Emig.g:1:232: T__77
                {
                mT__77(); 

                }
                break;
            case 39 :
                // Emig.g:1:238: T__78
                {
                mT__78(); 

                }
                break;
            case 40 :
                // Emig.g:1:244: T__79
                {
                mT__79(); 

                }
                break;
            case 41 :
                // Emig.g:1:250: T__80
                {
                mT__80(); 

                }
                break;
            case 42 :
                // Emig.g:1:256: T__81
                {
                mT__81(); 

                }
                break;
            case 43 :
                // Emig.g:1:262: T__82
                {
                mT__82(); 

                }
                break;
            case 44 :
                // Emig.g:1:268: T__83
                {
                mT__83(); 

                }
                break;
            case 45 :
                // Emig.g:1:274: T__84
                {
                mT__84(); 

                }
                break;
            case 46 :
                // Emig.g:1:280: T__85
                {
                mT__85(); 

                }
                break;
            case 47 :
                // Emig.g:1:286: T__86
                {
                mT__86(); 

                }
                break;
            case 48 :
                // Emig.g:1:292: T__87
                {
                mT__87(); 

                }
                break;
            case 49 :
                // Emig.g:1:298: PACKAGEOP
                {
                mPACKAGEOP(); 

                }
                break;
            case 50 :
                // Emig.g:1:308: CLASSOP
                {
                mCLASSOP(); 

                }
                break;
            case 51 :
                // Emig.g:1:316: ATTOP
                {
                mATTOP(); 

                }
                break;
            case 52 :
                // Emig.g:1:322: REFOP
                {
                mREFOP(); 

                }
                break;
            case 53 :
                // Emig.g:1:328: NOTOP
                {
                mNOTOP(); 

                }
                break;
            case 54 :
                // Emig.g:1:334: BOOLOP
                {
                mBOOLOP(); 

                }
                break;
            case 55 :
                // Emig.g:1:341: INTOP
                {
                mINTOP(); 

                }
                break;
            case 56 :
                // Emig.g:1:347: RELOP
                {
                mRELOP(); 

                }
                break;
            case 57 :
                // Emig.g:1:353: EQ
                {
                mEQ(); 

                }
                break;
            case 58 :
                // Emig.g:1:356: NEQ
                {
                mNEQ(); 

                }
                break;
            case 59 :
                // Emig.g:1:360: ADDOP
                {
                mADDOP(); 

                }
                break;
            case 60 :
                // Emig.g:1:366: MULOP
                {
                mMULOP(); 

                }
                break;
            case 61 :
                // Emig.g:1:372: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 62 :
                // Emig.g:1:380: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 63 :
                // Emig.g:1:386: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 64 :
                // Emig.g:1:394: STRINGTYPE
                {
                mSTRINGTYPE(); 

                }
                break;
            case 65 :
                // Emig.g:1:405: BOOLEANTYPE
                {
                mBOOLEANTYPE(); 

                }
                break;
            case 66 :
                // Emig.g:1:417: INTEGERTYPE
                {
                mINTEGERTYPE(); 

                }
                break;
            case 67 :
                // Emig.g:1:429: REALTYPE
                {
                mREALTYPE(); 

                }
                break;
            case 68 :
                // Emig.g:1:438: COLLECTIONTYPE
                {
                mCOLLECTIONTYPE(); 

                }
                break;
            case 69 :
                // Emig.g:1:453: BAGTYPE
                {
                mBAGTYPE(); 

                }
                break;
            case 70 :
                // Emig.g:1:461: ORDEREDSETTYPE
                {
                mORDEREDSETTYPE(); 

                }
                break;
            case 71 :
                // Emig.g:1:476: SEQUENCETYPE
                {
                mSEQUENCETYPE(); 

                }
                break;
            case 72 :
                // Emig.g:1:489: SETTYPE
                {
                mSETTYPE(); 

                }
                break;
            case 73 :
                // Emig.g:1:497: OCLANYTYPE
                {
                mOCLANYTYPE(); 

                }
                break;
            case 74 :
                // Emig.g:1:508: OCLTYPE
                {
                mOCLTYPE(); 

                }
                break;
            case 75 :
                // Emig.g:1:516: TUPLETYPE
                {
                mTUPLETYPE(); 

                }
                break;
            case 76 :
                // Emig.g:1:526: TUPLE
                {
                mTUPLE(); 

                }
                break;
            case 77 :
                // Emig.g:1:532: MAPTYPE
                {
                mMAPTYPE(); 

                }
                break;
            case 78 :
                // Emig.g:1:540: LAMBDATYPE
                {
                mLAMBDATYPE(); 

                }
                break;
            case 79 :
                // Emig.g:1:551: ENVTYPE
                {
                mENVTYPE(); 

                }
                break;
            case 80 :
                // Emig.g:1:559: TEXT
                {
                mTEXT(); 

                }
                break;
            case 81 :
                // Emig.g:1:564: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 82 :
                // Emig.g:1:574: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 83 :
                // Emig.g:1:585: QUOTED_34_34_92
                {
                mQUOTED_34_34_92(); 

                }
                break;
            case 84 :
                // Emig.g:1:601: QUOTED_39_39_92
                {
                mQUOTED_39_39_92(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\1\60\1\uffff\3\60\4\uffff\4\60\1\42\1\60\1\uffff\1\44\1"+
        "\60\1\121\1\60\5\uffff\3\60\1\uffff\4\60\4\uffff\1\141\11\60\5\uffff"+
        "\23\60\2\uffff\1\60\2\uffff\3\60\2\uffff\2\60\1\u008a\1\u008b\10"+
        "\60\1\u0095\1\60\2\uffff\13\60\1\61\1\uffff\1\60\1\u00a5\4\60\1"+
        "\u00aa\10\60\1\u0095\1\u00b6\3\60\1\u00ba\1\60\1\u00bc\1\60\1\u00a5"+
        "\2\60\2\uffff\1\u00c1\7\60\1\u00cb\1\uffff\1\u0095\2\60\1\u00ce"+
        "\1\60\1\u00d0\4\60\1\u00d5\1\60\1\u00d7\2\60\1\uffff\1\60\1\u00db"+
        "\2\60\1\uffff\1\u00de\12\60\1\uffff\1\u00e9\2\60\1\uffff\1\u00ec"+
        "\1\uffff\4\60\1\uffff\1\60\1\u00f2\1\u00f3\1\u00f4\5\60\1\uffff"+
        "\2\60\1\uffff\1\60\1\uffff\1\60\1\u00fe\2\60\1\uffff\1\60\1\uffff"+
        "\3\60\1\uffff\1\u0105\1\60\1\uffff\2\60\1\u0109\7\60\1\uffff\1\60"+
        "\1\u0112\1\uffff\4\60\1\u0117\3\uffff\1\u0118\10\60\1\uffff\1\60"+
        "\1\u0123\2\60\1\u0127\1\60\1\uffff\3\60\1\uffff\7\60\1\u0136\1\uffff"+
        "\1\60\1\u013b\2\60\2\uffff\1\60\1\u013f\2\60\1\u0142\5\60\1\uffff"+
        "\1\u0148\1\60\1\u014a\1\uffff\1\60\1\u014c\1\60\1\u014e\1\u014f"+
        "\11\60\1\uffff\4\60\1\uffff\1\u0095\1\u015d\1\60\1\uffff\1\u015f"+
        "\1\60\1\uffff\1\60\1\u0162\1\u0163\2\60\1\uffff\1\60\1\uffff\1\60"+
        "\1\uffff\1\60\2\uffff\6\60\1\u016f\6\60\1\uffff\1\60\1\uffff\1\60"+
        "\1\u0178\2\uffff\2\60\1\u017b\1\u017c\1\u017d\4\60\1\u0182\1\60"+
        "\1\uffff\10\60\1\uffff\1\60\1\u018d\3\uffff\4\60\1\uffff\1\u0192"+
        "\7\60\1\u019a\1\u019b\1\uffff\1\60\1\u016f\2\60\1\uffff\3\60\1\u016f"+
        "\3\60\2\uffff\3\60\1\u01a8\1\u01a9\3\60\1\u01ad\1\u0192\2\60\2\uffff"+
        "\1\u0192\2\60\1\uffff\4\60\1\u01a8\1\u01a9\1\u01a8\1\u01a9";
    static final String DFA18_eofS =
        "\u01b6\uffff";
    static final String DFA18_minS =
        "\1\11\1\145\1\uffff\1\150\2\145\4\uffff\1\141\1\150\1\144\1\145"+
        "\1\55\1\141\1\uffff\1\55\1\145\1\72\1\146\5\uffff\1\154\1\150\1"+
        "\141\1\uffff\1\143\1\157\1\162\1\157\4\uffff\1\56\1\145\1\141\1"+
        "\156\1\145\1\157\1\165\2\141\1\156\2\uffff\1\0\2\uffff\1\147\1\144"+
        "\2\164\1\145\1\142\1\164\1\154\1\146\1\143\1\141\1\156\1\141\1\164"+
        "\2\144\1\154\1\141\1\160\2\uffff\1\162\2\uffff\1\157\1\146\1\166"+
        "\2\uffff\1\160\1\145\2\60\1\144\1\163\1\165\1\145\2\154\1\144\1"+
        "\164\1\60\1\162\2\uffff\1\162\1\161\1\157\1\147\1\164\1\141\1\154"+
        "\2\160\1\155\1\166\1\0\1\uffff\1\162\1\60\1\141\1\150\2\162\1\60"+
        "\2\145\1\153\1\163\1\164\1\156\1\162\1\101\2\60\1\146\1\164\1\145"+
        "\1\60\1\160\1\60\1\145\1\60\1\154\1\162\2\uffff\1\60\1\151\2\145"+
        "\1\156\1\163\1\101\1\145\1\60\1\uffff\1\60\1\151\1\165\1\60\1\154"+
        "\1\60\1\145\3\154\1\60\1\142\1\60\1\141\1\154\1\uffff\1\155\1\60"+
        "\1\145\1\141\1\uffff\1\60\1\162\1\141\1\163\1\145\1\147\1\151\1"+
        "\141\1\154\1\164\1\145\1\uffff\1\60\1\151\1\162\1\uffff\1\60\1\uffff"+
        "\1\164\1\162\1\151\1\141\1\uffff\1\146\3\60\1\145\2\156\1\171\1"+
        "\162\1\uffff\1\156\1\145\1\uffff\1\145\1\uffff\1\147\1\60\2\145"+
        "\1\uffff\1\144\1\uffff\1\164\1\145\1\157\1\uffff\1\60\1\162\1\uffff"+
        "\1\145\1\147\1\60\1\170\1\145\1\142\1\143\1\141\1\164\1\146\1\uffff"+
        "\1\143\1\60\1\uffff\1\145\1\164\1\145\1\164\1\60\3\uffff\1\60\1"+
        "\144\1\171\1\160\1\145\1\147\1\156\1\141\1\145\1\uffff\1\143\1\60"+
        "\1\141\1\145\1\60\1\144\1\uffff\1\171\1\156\1\145\1\uffff\1\164"+
        "\1\101\1\165\1\153\1\163\1\162\1\145\1\60\1\uffff\1\101\1\60\1\163"+
        "\1\145\2\uffff\1\145\1\60\1\145\1\144\1\60\1\143\1\156\1\162\1\164"+
        "\1\171\1\uffff\1\60\1\157\1\60\1\uffff\1\145\1\60\1\143\2\60\1\141"+
        "\1\154\1\164\1\145\1\164\1\141\1\163\1\151\1\162\1\uffff\1\141\1"+
        "\154\1\164\1\145\1\uffff\2\60\1\146\1\uffff\1\60\1\123\1\uffff\1"+
        "\145\2\60\1\151\1\160\1\uffff\1\156\1\uffff\1\154\1\uffff\1\145"+
        "\2\uffff\1\143\1\141\1\164\1\146\1\145\1\147\1\60\1\142\1\145\1"+
        "\143\1\141\1\164\1\146\1\uffff\1\151\1\uffff\1\145\1\60\2\uffff"+
        "\1\157\1\145\3\60\1\153\1\163\1\162\1\145\1\60\1\145\1\uffff\1\165"+
        "\1\156\1\153\1\163\1\162\1\145\1\156\1\164\1\uffff\1\156\1\60\3"+
        "\uffff\1\141\1\163\1\151\1\162\1\uffff\1\60\1\164\1\143\1\141\1"+
        "\163\1\151\1\162\1\145\2\60\1\uffff\1\147\1\60\1\142\1\145\1\uffff"+
        "\2\145\1\147\1\60\1\142\1\145\1\144\2\uffff\1\145\1\165\1\156\2"+
        "\60\1\145\1\165\1\156\2\60\1\164\1\143\2\uffff\1\60\1\164\1\143"+
        "\1\uffff\4\145\4\60";
    static final String DFA18_maxS =
        "\1\175\1\157\1\uffff\2\151\1\165\4\uffff\1\141\1\157\1\164\1\165"+
        "\1\76\1\141\1\uffff\1\76\1\162\1\72\1\164\5\uffff\1\156\1\162\1"+
        "\141\1\uffff\1\162\1\157\1\162\1\157\4\uffff\1\71\1\164\1\157\1"+
        "\156\1\145\1\157\1\165\2\141\1\156\2\uffff\1\uffff\2\uffff\1\147"+
        "\1\144\2\164\1\145\1\142\1\164\1\154\1\146\1\143\1\141\1\156\1\141"+
        "\1\164\2\144\1\164\1\141\1\160\2\uffff\1\162\2\uffff\1\157\1\154"+
        "\1\166\2\uffff\1\160\1\145\2\172\1\166\1\163\1\165\1\145\2\154\1"+
        "\144\1\164\1\172\1\162\2\uffff\1\162\1\164\1\157\1\147\1\164\1\141"+
        "\1\154\2\160\1\155\1\166\1\uffff\1\uffff\1\162\1\172\1\141\1\150"+
        "\2\162\1\172\2\145\1\153\1\163\1\164\1\156\1\162\1\122\2\172\1\146"+
        "\1\164\1\145\1\172\1\160\1\172\1\145\1\172\1\157\1\162\2\uffff\1"+
        "\172\1\151\2\145\1\156\1\163\1\125\1\145\1\172\1\uffff\1\172\1\151"+
        "\1\165\1\172\1\154\1\172\1\145\3\154\1\172\1\142\1\172\1\141\1\154"+
        "\1\uffff\1\155\1\172\1\145\1\141\1\uffff\1\172\1\162\1\141\1\163"+
        "\1\145\1\147\1\151\1\141\1\154\1\164\1\145\1\uffff\1\172\1\151\1"+
        "\162\1\uffff\1\172\1\uffff\1\164\1\162\1\151\1\141\1\uffff\1\146"+
        "\3\172\1\145\2\156\1\171\1\162\1\uffff\1\156\1\145\1\uffff\1\145"+
        "\1\uffff\1\147\1\172\2\145\1\uffff\1\144\1\uffff\1\164\1\145\1\157"+
        "\1\uffff\1\172\1\162\1\uffff\1\145\1\147\1\172\1\170\1\145\1\142"+
        "\1\143\1\141\1\164\1\146\1\uffff\1\143\1\172\1\uffff\1\145\1\164"+
        "\1\145\1\164\1\172\3\uffff\1\172\1\144\1\171\1\160\1\145\1\147\1"+
        "\156\1\141\1\145\1\uffff\1\143\1\172\1\141\1\151\1\172\1\144\1\uffff"+
        "\1\171\1\156\1\145\1\uffff\1\164\1\122\1\165\1\153\1\163\1\162\1"+
        "\145\1\172\1\uffff\1\122\1\172\1\163\1\145\2\uffff\1\145\1\172\1"+
        "\145\1\144\1\172\1\143\1\156\1\162\1\164\1\171\1\uffff\1\172\1\157"+
        "\1\172\1\uffff\1\145\1\172\1\143\2\172\1\141\1\154\1\164\1\145\1"+
        "\164\1\141\1\163\1\151\1\162\1\uffff\1\141\1\154\1\164\1\145\1\uffff"+
        "\2\172\1\146\1\uffff\1\172\1\123\1\uffff\1\145\2\172\1\151\1\160"+
        "\1\uffff\1\156\1\uffff\1\154\1\uffff\1\145\2\uffff\1\143\1\141\1"+
        "\164\1\146\1\145\1\147\1\172\1\142\1\145\1\143\1\141\1\164\1\146"+
        "\1\uffff\1\151\1\uffff\1\145\1\172\2\uffff\1\157\1\145\3\172\1\153"+
        "\1\163\1\162\1\145\1\172\1\145\1\uffff\1\165\1\156\1\153\1\163\1"+
        "\162\1\145\1\156\1\164\1\uffff\1\156\1\172\3\uffff\1\141\1\163\1"+
        "\151\1\162\1\uffff\1\172\1\164\1\143\1\141\1\163\1\151\1\162\1\145"+
        "\2\172\1\uffff\1\147\1\172\1\142\1\145\1\uffff\2\145\1\147\1\172"+
        "\1\142\1\145\1\144\2\uffff\1\145\1\165\1\156\2\172\1\145\1\165\1"+
        "\156\2\172\1\164\1\143\2\uffff\1\172\1\164\1\143\1\uffff\4\145\4"+
        "\172";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\3\uffff\1\7\1\10\1\11\1\12\6\uffff\1\23\4\uffff\1\35"+
        "\1\36\1\40\1\42\1\43\3\uffff\1\51\4\uffff\1\70\1\71\1\73\1\74\12"+
        "\uffff\1\120\1\121\1\uffff\1\122\1\123\23\uffff\1\21\1\72\1\uffff"+
        "\1\24\1\75\3\uffff\1\37\1\26\16\uffff\1\76\1\77\14\uffff\1\124\33"+
        "\uffff\1\54\1\55\11\uffff\1\66\17\uffff\1\67\4\uffff\1\53\13\uffff"+
        "\1\20\3\uffff\1\22\1\uffff\1\32\4\uffff\1\46\11\uffff\1\65\2\uffff"+
        "\1\110\1\uffff\1\105\4\uffff\1\115\1\uffff\1\117\3\uffff\1\4\2\uffff"+
        "\1\6\12\uffff\1\45\2\uffff\1\25\5\uffff\1\57\1\47\1\56\11\uffff"+
        "\1\103\6\uffff\1\13\3\uffff\1\15\10\uffff\1\44\4\uffff\1\60\1\50"+
        "\12\uffff\1\114\3\uffff\1\27\16\uffff\1\31\4\uffff\1\30\3\uffff"+
        "\1\111\2\uffff\1\100\5\uffff\1\116\1\uffff\1\3\1\uffff\1\5\1\uffff"+
        "\1\14\1\33\15\uffff\1\41\1\uffff\1\112\2\uffff\1\101\1\102\13\uffff"+
        "\1\62\10\uffff\1\107\2\uffff\1\1\1\34\1\17\4\uffff\1\16\12\uffff"+
        "\1\113\4\uffff\1\61\7\uffff\1\106\1\104\14\uffff\1\63\1\64\3\uffff"+
        "\1\52\10\uffff";
    static final String DFA18_specialS =
        "\62\uffff\1\1\72\uffff\1\0\u0148\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\63\1\61\1\uffff\1\63\1\61\22\uffff\1\63\1\31\1\64\1\35\3"+
            "\uffff\1\62\1\25\1\26\1\45\1\44\1\20\1\21\1\27\1\45\12\46\1"+
            "\23\1\2\1\16\1\43\1\42\2\uffff\1\60\1\50\1\53\1\60\1\57\3\60"+
            "\1\51\2\60\1\56\1\55\1\60\1\36\2\60\1\52\1\47\1\54\6\60\1\6"+
            "\1\uffff\1\7\3\uffff\1\14\1\60\1\13\1\22\1\32\1\34\2\60\1\24"+
            "\2\60\1\4\1\1\1\37\1\40\1\12\1\60\1\5\1\15\1\33\1\60\1\17\1"+
            "\3\1\41\2\60\1\10\1\30\1\11",
            "\1\67\3\uffff\1\65\5\uffff\1\66",
            "",
            "\1\71\1\70",
            "\1\73\3\uffff\1\72",
            "\1\75\17\uffff\1\74",
            "",
            "",
            "",
            "",
            "\1\76",
            "\1\101\3\uffff\1\77\2\uffff\1\100",
            "\1\103\11\uffff\1\104\5\uffff\1\102",
            "\1\105\16\uffff\1\106\1\107",
            "\1\110\20\uffff\1\111",
            "\1\112",
            "",
            "\1\114\2\uffff\12\46\4\uffff\1\113",
            "\1\116\3\uffff\1\117\10\uffff\1\115",
            "\1\120",
            "\1\125\6\uffff\1\122\1\124\5\uffff\1\123",
            "",
            "",
            "",
            "",
            "",
            "\1\127\1\uffff\1\126",
            "\1\131\11\uffff\1\130",
            "\1\132",
            "",
            "\1\133\16\uffff\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "",
            "",
            "",
            "\1\140\1\uffff\12\46",
            "\1\143\16\uffff\1\142",
            "\1\145\15\uffff\1\144",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "",
            "\162\156\1\155\uff8d\156",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\u0080\7\uffff\1\177",
            "\1\u0081",
            "\1\u0082",
            "",
            "",
            "\1\u0083",
            "",
            "",
            "\1\u0084",
            "\1\u0085\5\uffff\1\u0086",
            "\1\u0087",
            "",
            "",
            "\1\u0088",
            "\1\u0089",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u008d\21\uffff\1\u008c",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0096",
            "",
            "",
            "\1\u0097",
            "\1\u0098\2\uffff\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\0\156",
            "",
            "\1\u00a3",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00a4\5\60",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b4\1\uffff\1\u00b3\14\uffff\1\u00b2\1\uffff\1\u00b5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00bb",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00bd",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00bf\2\uffff\1\u00be",
            "\1\u00c0",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c8\22\uffff\1\u00c9\1\u00c7",
            "\1\u00ca",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00cc",
            "\1\u00cd",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00cf",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00d6",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "",
            "\1\u0111",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "",
            "\1\u0121",
            "\12\60\7\uffff\23\60\1\u0122\6\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0124",
            "\1\u0126\3\uffff\1\u0125",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "\1\u012c",
            "\1\u012f\1\uffff\1\u012e\14\uffff\1\u012d\1\uffff\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0139\1\uffff\1\u0138\14\uffff\1\u0137\1\uffff\1\u013a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u013c",
            "\1\u013d",
            "",
            "",
            "\1\u013e",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0140",
            "\1\u0141",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0149",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u014b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u014d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u015e",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0160",
            "",
            "\1\u0161",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0164",
            "\1\u0165",
            "",
            "\1\u0166",
            "",
            "\1\u0167",
            "",
            "\1\u0168",
            "",
            "",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "",
            "\1\u0176",
            "",
            "\1\u0177",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0179",
            "\1\u017a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0183",
            "",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "",
            "\1\u018c",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u019c",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u019d",
            "\1\u019e",
            "",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "",
            "",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01ae",
            "\1\u01af",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01b0",
            "\1\u01b1",
            "",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | PACKAGEOP | CLASSOP | ATTOP | REFOP | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | OCLTYPE | TUPLETYPE | TUPLE | MAPTYPE | LAMBDATYPE | ENVTYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_109 = input.LA(1);

                        s = -1;
                        if ( ((LA18_109>='\u0000' && LA18_109<='\uFFFF')) ) {s = 110;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_50 = input.LA(1);

                        s = -1;
                        if ( (LA18_50=='r') ) {s = 109;}

                        else if ( ((LA18_50>='\u0000' && LA18_50<='q')||(LA18_50>='s' && LA18_50<='\uFFFF')) ) {s = 110;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}