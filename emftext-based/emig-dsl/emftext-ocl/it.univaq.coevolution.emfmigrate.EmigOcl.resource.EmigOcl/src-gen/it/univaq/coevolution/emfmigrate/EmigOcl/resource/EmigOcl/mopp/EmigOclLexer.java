// $ANTLR ${project.version} ${buildNumber}

	package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;


import org.antlr.runtime3_3_0.*;

public class EmigOclLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
    public static final int TEXT=4;
    public static final int QUOTED_34_34_92=5;
    public static final int EQ=6;
    public static final int COLLECTIONTYPE=7;
    public static final int STRINGTYPE=8;
    public static final int BOOLEANTYPE=9;
    public static final int INTEGERTYPE=10;
    public static final int REALTYPE=11;
    public static final int BAGTYPE=12;
    public static final int ORDEREDSETTYPE=13;
    public static final int SEQUENCETYPE=14;
    public static final int SETTYPE=15;
    public static final int OCLANYTYPE=16;
    public static final int TUPLETYPE=17;
    public static final int MAPTYPE=18;
    public static final int LAMBDATYPE=19;
    public static final int BOOLOP=20;
    public static final int NEQ=21;
    public static final int RELOP=22;
    public static final int ADDOP=23;
    public static final int INTOP=24;
    public static final int MULOP=25;
    public static final int NOTOP=26;
    public static final int QUOTED_39_39_92=27;
    public static final int FLOAT=28;
    public static final int INTEGER=29;
    public static final int COMMENT=30;
    public static final int LINEBREAK=31;
    public static final int WHITESPACE=32;

    	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public EmigOclLexer() {;} 
    public EmigOclLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public EmigOclLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "EmigOcl.g"; }

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:16:7: ( 'module' )
            // EmigOcl.g:16:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:17:7: ( ';' )
            // EmigOcl.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:18:7: ( 'models' )
            // EmigOcl.g:18:9: 'models'
            {
            match("models"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:19:7: ( ',' )
            // EmigOcl.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:20:7: ( 'static' )
            // EmigOcl.g:20:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:21:7: ( 'def' )
            // EmigOcl.g:21:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:22:7: ( ':' )
            // EmigOcl.g:22:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:23:7: ( 'context' )
            // EmigOcl.g:23:9: 'context'
            {
            match("context"); 


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
            // EmigOcl.g:24:7: ( '(' )
            // EmigOcl.g:24:9: '('
            {
            match('('); 

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
            // EmigOcl.g:25:7: ( ')' )
            // EmigOcl.g:25:9: ')'
            {
            match(')'); 

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
            // EmigOcl.g:26:7: ( '::' )
            // EmigOcl.g:26:9: '::'
            {
            match("::"); 


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
            // EmigOcl.g:27:7: ( '.' )
            // EmigOcl.g:27:9: '.'
            {
            match('.'); 

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
            // EmigOcl.g:28:7: ( '->' )
            // EmigOcl.g:28:9: '->'
            {
            match("->"); 


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
            // EmigOcl.g:29:7: ( 'iterate' )
            // EmigOcl.g:29:9: 'iterate'
            {
            match("iterate"); 


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
            // EmigOcl.g:30:7: ( '|' )
            // EmigOcl.g:30:9: '|'
            {
            match('|'); 

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
            // EmigOcl.g:31:7: ( '!' )
            // EmigOcl.g:31:9: '!'
            {
            match('!'); 

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
            // EmigOcl.g:32:7: ( 'super' )
            // EmigOcl.g:32:9: 'super'
            {
            match("super"); 


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
            // EmigOcl.g:33:7: ( 'self' )
            // EmigOcl.g:33:9: 'self'
            {
            match("self"); 


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
            // EmigOcl.g:34:7: ( 'true' )
            // EmigOcl.g:34:9: 'true'
            {
            match("true"); 


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
            // EmigOcl.g:35:7: ( 'false' )
            // EmigOcl.g:35:9: 'false'
            {
            match("false"); 


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
            // EmigOcl.g:36:7: ( '{' )
            // EmigOcl.g:36:9: '{'
            {
            match('{'); 

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
            // EmigOcl.g:37:7: ( '}' )
            // EmigOcl.g:37:9: '}'
            {
            match('}'); 

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
            // EmigOcl.g:38:7: ( '#' )
            // EmigOcl.g:38:9: '#'
            {
            match('#'); 

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
            // EmigOcl.g:39:7: ( 'OclUndefined' )
            // EmigOcl.g:39:9: 'OclUndefined'
            {
            match("OclUndefined"); 


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
            // EmigOcl.g:40:7: ( 'let' )
            // EmigOcl.g:40:9: 'let'
            {
            match("let"); 


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
            // EmigOcl.g:41:7: ( 'in' )
            // EmigOcl.g:41:9: 'in'
            {
            match("in"); 


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
            // EmigOcl.g:42:7: ( 'if' )
            // EmigOcl.g:42:9: 'if'
            {
            match("if"); 


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
            // EmigOcl.g:43:7: ( 'then' )
            // EmigOcl.g:43:9: 'then'
            {
            match("then"); 


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
            // EmigOcl.g:44:7: ( 'else' )
            // EmigOcl.g:44:9: 'else'
            {
            match("else"); 


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
            // EmigOcl.g:45:7: ( 'endif' )
            // EmigOcl.g:45:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "NOTOP"
    public final void mNOTOP() throws RecognitionException {
        try {
            int _type = NOTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:10922:6: ( ( 'not' ) )
            // EmigOcl.g:10923:1: ( 'not' )
            {
            // EmigOcl.g:10923:1: ( 'not' )
            // EmigOcl.g:10923:2: 'not'
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
            // EmigOcl.g:10925:7: ( ( ( 'and' | 'or' | 'xor' | 'implies' ) ) )
            // EmigOcl.g:10926:1: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            {
            // EmigOcl.g:10926:1: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            // EmigOcl.g:10926:2: ( 'and' | 'or' | 'xor' | 'implies' )
            {
            // EmigOcl.g:10926:2: ( 'and' | 'or' | 'xor' | 'implies' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt1=1;
                }
                break;
            case 'o':
                {
                alt1=2;
                }
                break;
            case 'x':
                {
                alt1=3;
                }
                break;
            case 'i':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // EmigOcl.g:10926:3: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 2 :
                    // EmigOcl.g:10926:9: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 3 :
                    // EmigOcl.g:10926:14: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 4 :
                    // EmigOcl.g:10926:20: 'implies'
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
            // EmigOcl.g:10928:6: ( ( ( 'div' | 'mod' ) ) )
            // EmigOcl.g:10929:1: ( ( 'div' | 'mod' ) )
            {
            // EmigOcl.g:10929:1: ( ( 'div' | 'mod' ) )
            // EmigOcl.g:10929:2: ( 'div' | 'mod' )
            {
            // EmigOcl.g:10929:2: ( 'div' | 'mod' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='d') ) {
                alt2=1;
            }
            else if ( (LA2_0=='m') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // EmigOcl.g:10929:3: 'div'
                    {
                    match("div"); 


                    }
                    break;
                case 2 :
                    // EmigOcl.g:10929:9: 'mod'
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
            // EmigOcl.g:10931:6: ( ( ( '>' | '<' | '>=' | '<=' ) ) )
            // EmigOcl.g:10932:1: ( ( '>' | '<' | '>=' | '<=' ) )
            {
            // EmigOcl.g:10932:1: ( ( '>' | '<' | '>=' | '<=' ) )
            // EmigOcl.g:10932:2: ( '>' | '<' | '>=' | '<=' )
            {
            // EmigOcl.g:10932:2: ( '>' | '<' | '>=' | '<=' )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='>') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='=') ) {
                    alt3=3;
                }
                else {
                    alt3=1;}
            }
            else if ( (LA3_0=='<') ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='=') ) {
                    alt3=4;
                }
                else {
                    alt3=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // EmigOcl.g:10932:3: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // EmigOcl.g:10932:7: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // EmigOcl.g:10932:11: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // EmigOcl.g:10932:16: '<='
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
            // EmigOcl.g:10934:3: ( ( '=' ) )
            // EmigOcl.g:10935:1: ( '=' )
            {
            // EmigOcl.g:10935:1: ( '=' )
            // EmigOcl.g:10935:2: '='
            {
            match('='); 

            }


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
            // EmigOcl.g:10937:4: ( ( '<>' ) )
            // EmigOcl.g:10938:1: ( '<>' )
            {
            // EmigOcl.g:10938:1: ( '<>' )
            // EmigOcl.g:10938:2: '<>'
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
            // EmigOcl.g:10940:6: ( ( ( '-' | '+' ) ) )
            // EmigOcl.g:10941:1: ( ( '-' | '+' ) )
            {
            // EmigOcl.g:10941:1: ( ( '-' | '+' ) )
            // EmigOcl.g:10941:2: ( '-' | '+' )
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
            // EmigOcl.g:10943:6: ( ( ( '*' | '/' ) ) )
            // EmigOcl.g:10944:1: ( ( '*' | '/' ) )
            {
            // EmigOcl.g:10944:1: ( ( '*' | '/' ) )
            // EmigOcl.g:10944:2: ( '*' | '/' )
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
            // EmigOcl.g:10946:8: ( ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // EmigOcl.g:10947:1: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // EmigOcl.g:10947:1: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // EmigOcl.g:10947:2: '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("--"); 

            // EmigOcl.g:10947:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // EmigOcl.g:10947:7: ~ ( '\\n' | '\\r' | '\\uffff' )
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
            	    break loop4;
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
            // EmigOcl.g:10950:6: ( ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ ) )
            // EmigOcl.g:10951:1: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            {
            // EmigOcl.g:10951:1: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            // EmigOcl.g:10951:2: ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+
            {
            // EmigOcl.g:10951:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // EmigOcl.g:10951:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // EmigOcl.g:10951:6: ( ( '0' .. '9' ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // EmigOcl.g:10951:7: ( '0' .. '9' )
            	    {
            	    // EmigOcl.g:10951:7: ( '0' .. '9' )
            	    // EmigOcl.g:10951:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match('.'); 
            // EmigOcl.g:10951:22: ( ( '0' .. '9' ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // EmigOcl.g:10951:23: ( '0' .. '9' )
            	    {
            	    // EmigOcl.g:10951:23: ( '0' .. '9' )
            	    // EmigOcl.g:10951:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // EmigOcl.g:10953:8: ( ( ( '-' )? ( ( '0' .. '9' ) )+ ) )
            // EmigOcl.g:10954:1: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            {
            // EmigOcl.g:10954:1: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            // EmigOcl.g:10954:2: ( '-' )? ( ( '0' .. '9' ) )+
            {
            // EmigOcl.g:10954:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // EmigOcl.g:10954:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // EmigOcl.g:10954:6: ( ( '0' .. '9' ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // EmigOcl.g:10954:7: ( '0' .. '9' )
            	    {
            	    // EmigOcl.g:10954:7: ( '0' .. '9' )
            	    // EmigOcl.g:10954:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // EmigOcl.g:10956:11: ( ( 'String' ) )
            // EmigOcl.g:10957:1: ( 'String' )
            {
            // EmigOcl.g:10957:1: ( 'String' )
            // EmigOcl.g:10957:2: 'String'
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
            // EmigOcl.g:10959:12: ( ( 'Boolean' ) )
            // EmigOcl.g:10960:1: ( 'Boolean' )
            {
            // EmigOcl.g:10960:1: ( 'Boolean' )
            // EmigOcl.g:10960:2: 'Boolean'
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
            // EmigOcl.g:10962:12: ( ( 'Integer' ) )
            // EmigOcl.g:10963:1: ( 'Integer' )
            {
            // EmigOcl.g:10963:1: ( 'Integer' )
            // EmigOcl.g:10963:2: 'Integer'
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
            // EmigOcl.g:10965:9: ( ( 'Real' ) )
            // EmigOcl.g:10966:1: ( 'Real' )
            {
            // EmigOcl.g:10966:1: ( 'Real' )
            // EmigOcl.g:10966:2: 'Real'
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
            // EmigOcl.g:10968:15: ( ( 'Collection' ) )
            // EmigOcl.g:10969:1: ( 'Collection' )
            {
            // EmigOcl.g:10969:1: ( 'Collection' )
            // EmigOcl.g:10969:2: 'Collection'
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
            // EmigOcl.g:10971:8: ( 'Bag' )
            // EmigOcl.g:10972:1: 'Bag'
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
            // EmigOcl.g:10973:15: ( 'OrderedSet' )
            // EmigOcl.g:10974:1: 'OrderedSet'
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
            // EmigOcl.g:10975:13: ( 'Sequence' )
            // EmigOcl.g:10976:1: 'Sequence'
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
            // EmigOcl.g:10977:8: ( 'Set' )
            // EmigOcl.g:10978:1: 'Set'
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
            // EmigOcl.g:10979:11: ( ( 'OclAny' ) )
            // EmigOcl.g:10980:1: ( 'OclAny' )
            {
            // EmigOcl.g:10980:1: ( 'OclAny' )
            // EmigOcl.g:10980:2: 'OclAny'
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

    // $ANTLR start "TUPLETYPE"
    public final void mTUPLETYPE() throws RecognitionException {
        try {
            int _type = TUPLETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:10982:10: ( 'Tuple' )
            // EmigOcl.g:10983:1: 'Tuple'
            {
            match("Tuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TUPLETYPE"

    // $ANTLR start "MAPTYPE"
    public final void mMAPTYPE() throws RecognitionException {
        try {
            int _type = MAPTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:10984:8: ( 'Map' )
            // EmigOcl.g:10985:1: 'Map'
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
            // EmigOcl.g:10986:11: ( ( 'Lambda' ) )
            // EmigOcl.g:10987:1: ( 'Lambda' )
            {
            // EmigOcl.g:10987:1: ( 'Lambda' )
            // EmigOcl.g:10987:2: 'Lambda'
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

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:10989:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* ) )
            // EmigOcl.g:10990:1: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            {
            // EmigOcl.g:10990:1: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            // EmigOcl.g:10990:2: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // EmigOcl.g:10990:21: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            loop10:
            do {
                int alt10=4;
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
                    alt10=1;
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
                    alt10=2;
                    }
                    break;
                case '_':
                    {
                    alt10=3;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // EmigOcl.g:10990:22: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            	    // EmigOcl.g:10990:42: ( '0' .. '9' )
            	    {
            	    // EmigOcl.g:10990:42: ( '0' .. '9' )
            	    // EmigOcl.g:10990:43: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // EmigOcl.g:10990:53: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // EmigOcl.g:10992:10: ( ( ( '\\r\\n' | '\\'r' | '\\n' ) ) )
            // EmigOcl.g:10993:1: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            {
            // EmigOcl.g:10993:1: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            // EmigOcl.g:10993:2: ( '\\r\\n' | '\\'r' | '\\n' )
            {
            // EmigOcl.g:10993:2: ( '\\r\\n' | '\\'r' | '\\n' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case '\r':
                {
                alt11=1;
                }
                break;
            case '\'':
                {
                alt11=2;
                }
                break;
            case '\n':
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // EmigOcl.g:10993:3: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // EmigOcl.g:10993:10: '\\'r'
                    {
                    match("'r"); 


                    }
                    break;
                case 3 :
                    // EmigOcl.g:10993:16: '\\n'
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
            // EmigOcl.g:10996:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // EmigOcl.g:10997:1: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // EmigOcl.g:10997:1: ( ( ' ' | '\\t' | '\\f' ) )
            // EmigOcl.g:10997:2: ( ' ' | '\\t' | '\\f' )
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
            // EmigOcl.g:11000:16: ( ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' ) ) )
            // EmigOcl.g:11001:1: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' ) )
            {
            // EmigOcl.g:11001:1: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' ) )
            // EmigOcl.g:11001:2: ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* ( '\"' )
            {
            // EmigOcl.g:11001:2: ( '\"' )
            // EmigOcl.g:11001:3: '\"'
            {
            match('\"'); 

            }

            // EmigOcl.g:11001:7: ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )*
            loop12:
            do {
                int alt12=4;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\\') ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2=='\"') ) {
                        alt12=1;
                    }
                    else if ( (LA12_2=='\\') ) {
                        alt12=2;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                    alt12=3;
                }


                switch (alt12) {
            	case 1 :
            	    // EmigOcl.g:11001:8: ( '\\\\' '\"' )
            	    {
            	    // EmigOcl.g:11001:8: ( '\\\\' '\"' )
            	    // EmigOcl.g:11001:9: '\\\\' '\"'
            	    {
            	    match('\\'); 
            	    match('\"'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // EmigOcl.g:11001:18: ( '\\\\' '\\\\' )
            	    {
            	    // EmigOcl.g:11001:18: ( '\\\\' '\\\\' )
            	    // EmigOcl.g:11001:19: '\\\\' '\\\\'
            	    {
            	    match('\\'); 
            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // EmigOcl.g:11001:29: ~ ( '\"' | '\\\\' )
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
            	    break loop12;
                }
            } while (true);

            // EmigOcl.g:11001:42: ( '\"' )
            // EmigOcl.g:11001:43: '\"'
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
            // EmigOcl.g:11003:16: ( ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' ) ) )
            // EmigOcl.g:11004:1: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' ) )
            {
            // EmigOcl.g:11004:1: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' ) )
            // EmigOcl.g:11004:2: ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )* ( '\\'' )
            {
            // EmigOcl.g:11004:2: ( '\\'' )
            // EmigOcl.g:11004:3: '\\''
            {
            match('\''); 

            }

            // EmigOcl.g:11004:8: ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | ~ ( '\\'' | '\\\\' ) )*
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\\') ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2=='\'') ) {
                        alt13=1;
                    }
                    else if ( (LA13_2=='\\') ) {
                        alt13=2;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                    alt13=3;
                }


                switch (alt13) {
            	case 1 :
            	    // EmigOcl.g:11004:9: ( '\\\\' '\\'' )
            	    {
            	    // EmigOcl.g:11004:9: ( '\\\\' '\\'' )
            	    // EmigOcl.g:11004:10: '\\\\' '\\''
            	    {
            	    match('\\'); 
            	    match('\''); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // EmigOcl.g:11004:20: ( '\\\\' '\\\\' )
            	    {
            	    // EmigOcl.g:11004:20: ( '\\\\' '\\\\' )
            	    // EmigOcl.g:11004:21: '\\\\' '\\\\'
            	    {
            	    match('\\'); 
            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // EmigOcl.g:11004:31: ~ ( '\\'' | '\\\\' )
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
            	    break loop13;
                }
            } while (true);

            // EmigOcl.g:11004:45: ( '\\'' )
            // EmigOcl.g:11004:46: '\\''
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
        // EmigOcl.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | TUPLETYPE | MAPTYPE | LAMBDATYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 )
        int alt14=59;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // EmigOcl.g:1:10: T__33
                {
                mT__33(); 

                }
                break;
            case 2 :
                // EmigOcl.g:1:16: T__34
                {
                mT__34(); 

                }
                break;
            case 3 :
                // EmigOcl.g:1:22: T__35
                {
                mT__35(); 

                }
                break;
            case 4 :
                // EmigOcl.g:1:28: T__36
                {
                mT__36(); 

                }
                break;
            case 5 :
                // EmigOcl.g:1:34: T__37
                {
                mT__37(); 

                }
                break;
            case 6 :
                // EmigOcl.g:1:40: T__38
                {
                mT__38(); 

                }
                break;
            case 7 :
                // EmigOcl.g:1:46: T__39
                {
                mT__39(); 

                }
                break;
            case 8 :
                // EmigOcl.g:1:52: T__40
                {
                mT__40(); 

                }
                break;
            case 9 :
                // EmigOcl.g:1:58: T__41
                {
                mT__41(); 

                }
                break;
            case 10 :
                // EmigOcl.g:1:64: T__42
                {
                mT__42(); 

                }
                break;
            case 11 :
                // EmigOcl.g:1:70: T__43
                {
                mT__43(); 

                }
                break;
            case 12 :
                // EmigOcl.g:1:76: T__44
                {
                mT__44(); 

                }
                break;
            case 13 :
                // EmigOcl.g:1:82: T__45
                {
                mT__45(); 

                }
                break;
            case 14 :
                // EmigOcl.g:1:88: T__46
                {
                mT__46(); 

                }
                break;
            case 15 :
                // EmigOcl.g:1:94: T__47
                {
                mT__47(); 

                }
                break;
            case 16 :
                // EmigOcl.g:1:100: T__48
                {
                mT__48(); 

                }
                break;
            case 17 :
                // EmigOcl.g:1:106: T__49
                {
                mT__49(); 

                }
                break;
            case 18 :
                // EmigOcl.g:1:112: T__50
                {
                mT__50(); 

                }
                break;
            case 19 :
                // EmigOcl.g:1:118: T__51
                {
                mT__51(); 

                }
                break;
            case 20 :
                // EmigOcl.g:1:124: T__52
                {
                mT__52(); 

                }
                break;
            case 21 :
                // EmigOcl.g:1:130: T__53
                {
                mT__53(); 

                }
                break;
            case 22 :
                // EmigOcl.g:1:136: T__54
                {
                mT__54(); 

                }
                break;
            case 23 :
                // EmigOcl.g:1:142: T__55
                {
                mT__55(); 

                }
                break;
            case 24 :
                // EmigOcl.g:1:148: T__56
                {
                mT__56(); 

                }
                break;
            case 25 :
                // EmigOcl.g:1:154: T__57
                {
                mT__57(); 

                }
                break;
            case 26 :
                // EmigOcl.g:1:160: T__58
                {
                mT__58(); 

                }
                break;
            case 27 :
                // EmigOcl.g:1:166: T__59
                {
                mT__59(); 

                }
                break;
            case 28 :
                // EmigOcl.g:1:172: T__60
                {
                mT__60(); 

                }
                break;
            case 29 :
                // EmigOcl.g:1:178: T__61
                {
                mT__61(); 

                }
                break;
            case 30 :
                // EmigOcl.g:1:184: T__62
                {
                mT__62(); 

                }
                break;
            case 31 :
                // EmigOcl.g:1:190: NOTOP
                {
                mNOTOP(); 

                }
                break;
            case 32 :
                // EmigOcl.g:1:196: BOOLOP
                {
                mBOOLOP(); 

                }
                break;
            case 33 :
                // EmigOcl.g:1:203: INTOP
                {
                mINTOP(); 

                }
                break;
            case 34 :
                // EmigOcl.g:1:209: RELOP
                {
                mRELOP(); 

                }
                break;
            case 35 :
                // EmigOcl.g:1:215: EQ
                {
                mEQ(); 

                }
                break;
            case 36 :
                // EmigOcl.g:1:218: NEQ
                {
                mNEQ(); 

                }
                break;
            case 37 :
                // EmigOcl.g:1:222: ADDOP
                {
                mADDOP(); 

                }
                break;
            case 38 :
                // EmigOcl.g:1:228: MULOP
                {
                mMULOP(); 

                }
                break;
            case 39 :
                // EmigOcl.g:1:234: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 40 :
                // EmigOcl.g:1:242: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 41 :
                // EmigOcl.g:1:248: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 42 :
                // EmigOcl.g:1:256: STRINGTYPE
                {
                mSTRINGTYPE(); 

                }
                break;
            case 43 :
                // EmigOcl.g:1:267: BOOLEANTYPE
                {
                mBOOLEANTYPE(); 

                }
                break;
            case 44 :
                // EmigOcl.g:1:279: INTEGERTYPE
                {
                mINTEGERTYPE(); 

                }
                break;
            case 45 :
                // EmigOcl.g:1:291: REALTYPE
                {
                mREALTYPE(); 

                }
                break;
            case 46 :
                // EmigOcl.g:1:300: COLLECTIONTYPE
                {
                mCOLLECTIONTYPE(); 

                }
                break;
            case 47 :
                // EmigOcl.g:1:315: BAGTYPE
                {
                mBAGTYPE(); 

                }
                break;
            case 48 :
                // EmigOcl.g:1:323: ORDEREDSETTYPE
                {
                mORDEREDSETTYPE(); 

                }
                break;
            case 49 :
                // EmigOcl.g:1:338: SEQUENCETYPE
                {
                mSEQUENCETYPE(); 

                }
                break;
            case 50 :
                // EmigOcl.g:1:351: SETTYPE
                {
                mSETTYPE(); 

                }
                break;
            case 51 :
                // EmigOcl.g:1:359: OCLANYTYPE
                {
                mOCLANYTYPE(); 

                }
                break;
            case 52 :
                // EmigOcl.g:1:370: TUPLETYPE
                {
                mTUPLETYPE(); 

                }
                break;
            case 53 :
                // EmigOcl.g:1:380: MAPTYPE
                {
                mMAPTYPE(); 

                }
                break;
            case 54 :
                // EmigOcl.g:1:388: LAMBDATYPE
                {
                mLAMBDATYPE(); 

                }
                break;
            case 55 :
                // EmigOcl.g:1:399: TEXT
                {
                mTEXT(); 

                }
                break;
            case 56 :
                // EmigOcl.g:1:404: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 57 :
                // EmigOcl.g:1:414: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 58 :
                // EmigOcl.g:1:425: QUOTED_34_34_92
                {
                mQUOTED_34_34_92(); 

                }
                break;
            case 59 :
                // EmigOcl.g:1:441: QUOTED_39_39_92
                {
                mQUOTED_39_39_92(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\51\2\uffff\2\51\1\65\1\51\3\uffff\1\36\1\51\2\uffff\2"+
        "\51\3\uffff\7\51\1\uffff\1\33\3\uffff\1\113\10\51\5\uffff\6\51\2"+
        "\uffff\1\51\2\uffff\1\51\1\140\1\141\13\51\1\155\1\51\3\uffff\12"+
        "\51\1\52\1\uffff\1\174\3\51\1\u0080\1\174\2\51\2\uffff\6\51\1\u008a"+
        "\2\51\1\u008d\1\155\1\uffff\1\155\2\51\1\u0090\1\51\1\u0092\4\51"+
        "\1\u0097\3\51\1\uffff\2\51\1\u009d\1\uffff\3\51\1\u00a1\1\u00a2"+
        "\4\51\1\uffff\1\u00a7\1\51\1\uffff\2\51\1\uffff\1\51\1\uffff\1\51"+
        "\1\u00ad\2\51\1\uffff\4\51\1\u00b4\1\uffff\3\51\2\uffff\1\u00b8"+
        "\3\51\1\uffff\1\u00bc\4\51\1\uffff\1\51\1\u00c2\1\51\1\u00c4\1\u00c5"+
        "\1\u00c6\1\uffff\3\51\1\uffff\1\51\1\u00cb\1\51\1\uffff\1\u00cd"+
        "\4\51\1\uffff\1\u00d2\3\uffff\1\u00d3\1\u00d4\1\155\1\51\1\uffff"+
        "\1\51\1\uffff\1\51\1\u00d8\1\u00d9\1\51\3\uffff\2\51\1\u00dd\2\uffff"+
        "\3\51\1\uffff\2\51\1\u00e3\1\u00e4\1\51\2\uffff\1\u00e6\1\uffff";
    static final String DFA14_eofS =
        "\u00e7\uffff";
    static final String DFA14_minS =
        "\1\11\1\157\2\uffff\2\145\1\72\1\157\3\uffff\1\55\1\146\2\uffff"+
        "\1\150\1\141\3\uffff\1\143\1\145\1\154\1\157\1\156\1\162\1\157\1"+
        "\uffff\1\76\3\uffff\1\56\1\145\1\141\1\156\1\145\1\157\1\165\2\141"+
        "\2\uffff\1\0\2\uffff\1\144\1\141\1\160\1\154\1\146\1\166\2\uffff"+
        "\1\156\2\uffff\1\145\2\60\1\160\1\165\1\145\2\154\1\144\1\164\1"+
        "\163\1\144\1\164\1\144\1\60\1\162\3\uffff\1\162\1\161\1\157\1\147"+
        "\1\164\1\141\1\154\2\160\1\155\1\0\1\uffff\1\60\1\164\1\145\1\146"+
        "\2\60\1\164\1\162\2\uffff\1\154\1\145\1\156\1\163\1\101\1\145\1"+
        "\60\1\145\1\151\2\60\1\uffff\1\60\1\151\1\165\1\60\1\154\1\60\1"+
        "\145\3\154\1\60\1\142\2\154\1\uffff\1\151\1\162\1\60\1\uffff\1\145"+
        "\1\141\1\151\2\60\1\145\2\156\1\162\1\uffff\1\60\1\146\1\uffff\1"+
        "\156\1\145\1\uffff\1\145\1\uffff\1\147\1\60\2\145\1\uffff\1\144"+
        "\1\145\1\163\1\143\1\60\1\uffff\1\170\1\164\1\145\2\uffff\1\60\1"+
        "\144\1\171\1\145\1\uffff\1\60\1\147\1\156\1\141\1\145\1\uffff\1"+
        "\143\1\60\1\141\3\60\1\uffff\1\164\1\145\1\163\1\uffff\1\145\1\60"+
        "\1\144\1\uffff\1\60\1\143\1\156\1\162\1\164\1\uffff\1\60\3\uffff"+
        "\3\60\1\146\1\uffff\1\123\1\uffff\1\145\2\60\1\151\3\uffff\1\151"+
        "\1\145\1\60\2\uffff\1\157\1\156\1\164\1\uffff\1\156\1\145\2\60\1"+
        "\144\2\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\175\1\157\2\uffff\1\165\1\151\1\72\1\157\3\uffff\1\76\1\164\2"+
        "\uffff\1\162\1\141\3\uffff\1\162\1\145\1\156\1\157\1\156\1\162\1"+
        "\157\1\uffff\1\76\3\uffff\1\71\1\164\1\157\1\156\1\145\1\157\1\165"+
        "\2\141\2\uffff\1\uffff\2\uffff\1\144\1\141\1\160\1\154\1\146\1\166"+
        "\2\uffff\1\156\2\uffff\1\145\2\172\1\160\1\165\1\145\2\154\1\144"+
        "\1\164\1\163\1\144\1\164\1\144\1\172\1\162\3\uffff\1\162\1\164\1"+
        "\157\1\147\1\164\1\141\1\154\2\160\1\155\1\uffff\1\uffff\1\172\1"+
        "\164\1\145\1\146\2\172\1\164\1\162\2\uffff\1\154\1\145\1\156\1\163"+
        "\1\125\1\145\1\172\1\145\1\151\2\172\1\uffff\1\172\1\151\1\165\1"+
        "\172\1\154\1\172\1\145\3\154\1\172\1\142\2\154\1\uffff\1\151\1\162"+
        "\1\172\1\uffff\1\145\1\141\1\151\2\172\1\145\2\156\1\162\1\uffff"+
        "\1\172\1\146\1\uffff\1\156\1\145\1\uffff\1\145\1\uffff\1\147\1\172"+
        "\2\145\1\uffff\1\144\1\145\1\163\1\143\1\172\1\uffff\1\170\1\164"+
        "\1\145\2\uffff\1\172\1\144\1\171\1\145\1\uffff\1\172\1\147\1\156"+
        "\1\141\1\145\1\uffff\1\143\1\172\1\141\3\172\1\uffff\1\164\1\145"+
        "\1\163\1\uffff\1\145\1\172\1\144\1\uffff\1\172\1\143\1\156\1\162"+
        "\1\164\1\uffff\1\172\3\uffff\3\172\1\146\1\uffff\1\123\1\uffff\1"+
        "\145\2\172\1\151\3\uffff\1\151\1\145\1\172\2\uffff\1\157\1\156\1"+
        "\164\1\uffff\1\156\1\145\2\172\1\144\2\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\4\4\uffff\1\11\1\12\1\14\2\uffff\1\17\1\20\2\uffff"+
        "\1\25\1\26\1\27\7\uffff\1\42\1\uffff\1\43\1\45\1\46\11\uffff\1\67"+
        "\1\70\1\uffff\1\71\1\72\6\uffff\1\13\1\7\1\uffff\1\15\1\47\20\uffff"+
        "\1\44\1\50\1\51\13\uffff\1\73\10\uffff\1\32\1\33\13\uffff\1\40\16"+
        "\uffff\1\41\3\uffff\1\6\11\uffff\1\31\2\uffff\1\37\2\uffff\1\62"+
        "\1\uffff\1\57\4\uffff\1\65\5\uffff\1\22\3\uffff\1\23\1\34\4\uffff"+
        "\1\35\5\uffff\1\55\6\uffff\1\21\3\uffff\1\24\3\uffff\1\36\5\uffff"+
        "\1\64\1\uffff\1\1\1\3\1\5\4\uffff\1\63\1\uffff\1\52\4\uffff\1\66"+
        "\1\10\1\16\3\uffff\1\53\1\54\3\uffff\1\61\5\uffff\1\60\1\56\1\uffff"+
        "\1\30";
    static final String DFA14_specialS =
        "\53\uffff\1\0\52\uffff\1\1\u0090\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\54\1\52\1\uffff\1\54\1\52\22\uffff\1\54\1\16\1\55\1\23\3"+
            "\uffff\1\53\1\10\1\11\1\37\1\36\1\3\1\13\1\12\1\37\12\40\1\6"+
            "\1\2\1\34\1\35\1\33\2\uffff\1\51\1\42\1\45\5\51\1\43\2\51\1"+
            "\50\1\47\1\51\1\24\2\51\1\44\1\41\1\46\6\51\6\uffff\1\30\1\51"+
            "\1\7\1\5\1\26\1\20\2\51\1\14\2\51\1\25\1\1\1\27\1\31\3\51\1"+
            "\4\1\17\3\51\1\32\2\51\1\21\1\15\1\22",
            "\1\56",
            "",
            "",
            "\1\61\16\uffff\1\57\1\60",
            "\1\62\3\uffff\1\63",
            "\1\64",
            "\1\66",
            "",
            "",
            "",
            "\1\70\2\uffff\12\40\4\uffff\1\67",
            "\1\73\6\uffff\1\74\1\72\5\uffff\1\71",
            "",
            "",
            "\1\76\11\uffff\1\75",
            "\1\77",
            "",
            "",
            "",
            "\1\100\16\uffff\1\101",
            "\1\102",
            "\1\103\1\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "",
            "",
            "",
            "\1\112\1\uffff\12\40",
            "\1\115\16\uffff\1\114",
            "\1\117\15\uffff\1\116",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\162\127\1\126\uff8d\127",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "\1\136",
            "",
            "",
            "\1\137",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\156",
            "",
            "",
            "",
            "\1\157",
            "\1\160\2\uffff\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\0\127",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\4\51\1\173\17\51"+
            "\1\172\5\51",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0081",
            "\1\u0082",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0088\23\uffff\1\u0087",
            "\1\u0089",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008b",
            "\1\u008c",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008e",
            "\1\u008f",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0091",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00cc",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00da",
            "",
            "",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00e5",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | TUPLETYPE | MAPTYPE | LAMBDATYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_43 = input.LA(1);

                        s = -1;
                        if ( (LA14_43=='r') ) {s = 86;}

                        else if ( ((LA14_43>='\u0000' && LA14_43<='q')||(LA14_43>='s' && LA14_43<='\uFFFF')) ) {s = 87;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_86 = input.LA(1);

                        s = -1;
                        if ( ((LA14_86>='\u0000' && LA14_86<='\uFFFF')) ) {s = 87;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}