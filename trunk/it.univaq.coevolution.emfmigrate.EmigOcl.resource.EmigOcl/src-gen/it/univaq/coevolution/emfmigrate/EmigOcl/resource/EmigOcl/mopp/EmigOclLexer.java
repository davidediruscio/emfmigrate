// $ANTLR ${project.version} ${buildNumber}

	package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;


import org.antlr.runtime3_3_0.*;

public class EmigOclLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__28=28;
    public static final int T__29=29;
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
    public static final int TEXT=4;
    public static final int STRINGTYPE=5;
    public static final int BOOLEANTYPE=6;
    public static final int INTEGERTYPE=7;
    public static final int REALTYPE=8;
    public static final int BAGTYPE=9;
    public static final int ORDEREDSETTYPE=10;
    public static final int SEQUENCETYPE=11;
    public static final int SETTYPE=12;
    public static final int OCLANYTYPE=13;
    public static final int TUPLETYPE=14;
    public static final int MAPTYPE=15;
    public static final int BOOLOP=16;
    public static final int RELOP=17;
    public static final int ADDOP=18;
    public static final int INTOP=19;
    public static final int MULOP=20;
    public static final int NOTOP=21;
    public static final int STRING=22;
    public static final int FLOAT=23;
    public static final int INTEGER=24;
    public static final int COMMENT=25;
    public static final int LINEBREAK=26;
    public static final int WHITESPACE=27;

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

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:20:7: ( 'def' )
            // EmigOcl.g:20:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:21:7: ( ':' )
            // EmigOcl.g:21:9: ':'
            {
            match(':'); 

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
            // EmigOcl.g:22:7: ( 'context' )
            // EmigOcl.g:22:9: 'context'
            {
            match("context"); 


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
            // EmigOcl.g:23:7: ( '=' )
            // EmigOcl.g:23:9: '='
            {
            match('='); 

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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:26:7: ( '!' )
            // EmigOcl.g:26:9: '!'
            {
            match('!'); 

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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:29:7: ( '|' )
            // EmigOcl.g:29:9: '|'
            {
            match('|'); 

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
            // EmigOcl.g:30:7: ( 'iterate' )
            // EmigOcl.g:30:9: 'iterate'
            {
            match("iterate"); 


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
            // EmigOcl.g:31:7: ( 'super' )
            // EmigOcl.g:31:9: 'super'
            {
            match("super"); 


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
            // EmigOcl.g:32:7: ( 'self' )
            // EmigOcl.g:32:9: 'self'
            {
            match("self"); 


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
            // EmigOcl.g:33:7: ( 'true' )
            // EmigOcl.g:33:9: 'true'
            {
            match("true"); 


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
            // EmigOcl.g:34:7: ( 'false' )
            // EmigOcl.g:34:9: 'false'
            {
            match("false"); 


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
            // EmigOcl.g:35:7: ( '{' )
            // EmigOcl.g:35:9: '{'
            {
            match('{'); 

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
            // EmigOcl.g:36:7: ( '}' )
            // EmigOcl.g:36:9: '}'
            {
            match('}'); 

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
            // EmigOcl.g:37:7: ( '#' )
            // EmigOcl.g:37:9: '#'
            {
            match('#'); 

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
            // EmigOcl.g:38:7: ( 'OclUndefined' )
            // EmigOcl.g:38:9: 'OclUndefined'
            {
            match("OclUndefined"); 


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
            // EmigOcl.g:39:7: ( 'let' )
            // EmigOcl.g:39:9: 'let'
            {
            match("let"); 


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
            // EmigOcl.g:40:7: ( 'in' )
            // EmigOcl.g:40:9: 'in'
            {
            match("in"); 


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
            // EmigOcl.g:41:7: ( 'if' )
            // EmigOcl.g:41:9: 'if'
            {
            match("if"); 


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
            // EmigOcl.g:42:7: ( 'then' )
            // EmigOcl.g:42:9: 'then'
            {
            match("then"); 


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
            // EmigOcl.g:43:7: ( 'else' )
            // EmigOcl.g:43:9: 'else'
            {
            match("else"); 


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
            // EmigOcl.g:44:7: ( 'endif' )
            // EmigOcl.g:44:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "NOTOP"
    public final void mNOTOP() throws RecognitionException {
        try {
            int _type = NOTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:7818:6: ( ( 'not' ) )
            // EmigOcl.g:7819:1: ( 'not' )
            {
            // EmigOcl.g:7819:1: ( 'not' )
            // EmigOcl.g:7819:2: 'not'
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
            // EmigOcl.g:7821:7: ( ( ( 'and' | 'or' | 'xor' | 'implies' ) ) )
            // EmigOcl.g:7822:1: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            {
            // EmigOcl.g:7822:1: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            // EmigOcl.g:7822:2: ( 'and' | 'or' | 'xor' | 'implies' )
            {
            // EmigOcl.g:7822:2: ( 'and' | 'or' | 'xor' | 'implies' )
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
                    // EmigOcl.g:7822:3: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 2 :
                    // EmigOcl.g:7822:9: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 3 :
                    // EmigOcl.g:7822:14: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 4 :
                    // EmigOcl.g:7822:20: 'implies'
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
            // EmigOcl.g:7824:6: ( ( ( 'div' | 'mod' ) ) )
            // EmigOcl.g:7825:1: ( ( 'div' | 'mod' ) )
            {
            // EmigOcl.g:7825:1: ( ( 'div' | 'mod' ) )
            // EmigOcl.g:7825:2: ( 'div' | 'mod' )
            {
            // EmigOcl.g:7825:2: ( 'div' | 'mod' )
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
                    // EmigOcl.g:7825:3: 'div'
                    {
                    match("div"); 


                    }
                    break;
                case 2 :
                    // EmigOcl.g:7825:9: 'mod'
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
            // EmigOcl.g:7827:6: ( ( ( '=' | '>' | '<' | '>=' | '<=' ) ) )
            // EmigOcl.g:7828:1: ( ( '=' | '>' | '<' | '>=' | '<=' ) )
            {
            // EmigOcl.g:7828:1: ( ( '=' | '>' | '<' | '>=' | '<=' ) )
            // EmigOcl.g:7828:2: ( '=' | '>' | '<' | '>=' | '<=' )
            {
            // EmigOcl.g:7828:2: ( '=' | '>' | '<' | '>=' | '<=' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt3=1;
                }
                break;
            case '>':
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='=') ) {
                    alt3=4;
                }
                else {
                    alt3=2;}
                }
                break;
            case '<':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='=') ) {
                    alt3=5;
                }
                else {
                    alt3=3;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // EmigOcl.g:7828:3: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // EmigOcl.g:7828:7: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // EmigOcl.g:7828:11: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // EmigOcl.g:7828:15: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // EmigOcl.g:7828:20: '<='
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

    // $ANTLR start "ADDOP"
    public final void mADDOP() throws RecognitionException {
        try {
            int _type = ADDOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:7830:6: ( ( ( '-' | '+' ) ) )
            // EmigOcl.g:7831:1: ( ( '-' | '+' ) )
            {
            // EmigOcl.g:7831:1: ( ( '-' | '+' ) )
            // EmigOcl.g:7831:2: ( '-' | '+' )
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
            // EmigOcl.g:7833:6: ( ( ( '*' | '/' ) ) )
            // EmigOcl.g:7834:1: ( ( '*' | '/' ) )
            {
            // EmigOcl.g:7834:1: ( ( '*' | '/' ) )
            // EmigOcl.g:7834:2: ( '*' | '/' )
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
            // EmigOcl.g:7836:8: ( ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // EmigOcl.g:7837:1: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // EmigOcl.g:7837:1: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // EmigOcl.g:7837:2: '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("--"); 

            // EmigOcl.g:7837:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // EmigOcl.g:7837:7: ~ ( '\\n' | '\\r' | '\\uffff' )
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
            // EmigOcl.g:7840:6: ( ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ ) )
            // EmigOcl.g:7841:1: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            {
            // EmigOcl.g:7841:1: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            // EmigOcl.g:7841:2: ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+
            {
            // EmigOcl.g:7841:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // EmigOcl.g:7841:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // EmigOcl.g:7841:6: ( ( '0' .. '9' ) )+
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
            	    // EmigOcl.g:7841:7: ( '0' .. '9' )
            	    {
            	    // EmigOcl.g:7841:7: ( '0' .. '9' )
            	    // EmigOcl.g:7841:8: '0' .. '9'
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
            // EmigOcl.g:7841:22: ( ( '0' .. '9' ) )+
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
            	    // EmigOcl.g:7841:23: ( '0' .. '9' )
            	    {
            	    // EmigOcl.g:7841:23: ( '0' .. '9' )
            	    // EmigOcl.g:7841:24: '0' .. '9'
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
            // EmigOcl.g:7843:8: ( ( ( '-' )? ( ( '0' .. '9' ) )+ ) )
            // EmigOcl.g:7844:1: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            {
            // EmigOcl.g:7844:1: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            // EmigOcl.g:7844:2: ( '-' )? ( ( '0' .. '9' ) )+
            {
            // EmigOcl.g:7844:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // EmigOcl.g:7844:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // EmigOcl.g:7844:6: ( ( '0' .. '9' ) )+
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
            	    // EmigOcl.g:7844:7: ( '0' .. '9' )
            	    {
            	    // EmigOcl.g:7844:7: ( '0' .. '9' )
            	    // EmigOcl.g:7844:8: '0' .. '9'
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
            // EmigOcl.g:7846:11: ( ( 'String' ) )
            // EmigOcl.g:7847:1: ( 'String' )
            {
            // EmigOcl.g:7847:1: ( 'String' )
            // EmigOcl.g:7847:2: 'String'
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
            // EmigOcl.g:7849:12: ( ( 'Boolean' ) )
            // EmigOcl.g:7850:1: ( 'Boolean' )
            {
            // EmigOcl.g:7850:1: ( 'Boolean' )
            // EmigOcl.g:7850:2: 'Boolean'
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
            // EmigOcl.g:7852:12: ( ( 'Integer' ) )
            // EmigOcl.g:7853:1: ( 'Integer' )
            {
            // EmigOcl.g:7853:1: ( 'Integer' )
            // EmigOcl.g:7853:2: 'Integer'
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
            // EmigOcl.g:7855:9: ( ( 'Real' ) )
            // EmigOcl.g:7856:1: ( 'Real' )
            {
            // EmigOcl.g:7856:1: ( 'Real' )
            // EmigOcl.g:7856:2: 'Real'
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

    // $ANTLR start "BAGTYPE"
    public final void mBAGTYPE() throws RecognitionException {
        try {
            int _type = BAGTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:7858:8: ( 'Bag' )
            // EmigOcl.g:7859:1: 'Bag'
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
            // EmigOcl.g:7860:15: ( 'OrderedSet' )
            // EmigOcl.g:7861:1: 'OrderedSet'
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
            // EmigOcl.g:7862:13: ( 'Sequence' )
            // EmigOcl.g:7863:1: 'Sequence'
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
            // EmigOcl.g:7864:8: ( 'Set' )
            // EmigOcl.g:7865:1: 'Set'
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
            // EmigOcl.g:7866:11: ( ( 'OclAny' ) )
            // EmigOcl.g:7867:1: ( 'OclAny' )
            {
            // EmigOcl.g:7867:1: ( 'OclAny' )
            // EmigOcl.g:7867:2: 'OclAny'
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
            // EmigOcl.g:7869:10: ( 'Tuple' )
            // EmigOcl.g:7870:1: 'Tuple'
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
            // EmigOcl.g:7871:8: ( 'Map' )
            // EmigOcl.g:7872:1: 'Map'
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:7873:7: ( ( '\\'' ( . )* '\\'' ) )
            // EmigOcl.g:7874:1: ( '\\'' ( . )* '\\'' )
            {
            // EmigOcl.g:7874:1: ( '\\'' ( . )* '\\'' )
            // EmigOcl.g:7874:2: '\\'' ( . )* '\\''
            {
            match('\''); 
            // EmigOcl.g:7874:6: ( . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\'') ) {
                    alt10=2;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // EmigOcl.g:7874:6: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('\''); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:7876:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* ) )
            // EmigOcl.g:7877:1: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* )
            {
            // EmigOcl.g:7877:1: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* )
            // EmigOcl.g:7877:2: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // EmigOcl.g:7877:21: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
            loop11:
            do {
                int alt11=5;
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
                    alt11=1;
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
                    alt11=2;
                    }
                    break;
                case '-':
                    {
                    alt11=3;
                    }
                    break;
                case '_':
                    {
                    alt11=4;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // EmigOcl.g:7877:22: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            	    // EmigOcl.g:7877:42: ( '0' .. '9' )
            	    {
            	    // EmigOcl.g:7877:42: ( '0' .. '9' )
            	    // EmigOcl.g:7877:43: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // EmigOcl.g:7877:53: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 4 :
            	    // EmigOcl.g:7877:57: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // EmigOcl.g:7879:10: ( ( ( '\\r\\n' | '\\'r' | '\\n' ) ) )
            // EmigOcl.g:7880:1: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            {
            // EmigOcl.g:7880:1: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            // EmigOcl.g:7880:2: ( '\\r\\n' | '\\'r' | '\\n' )
            {
            // EmigOcl.g:7880:2: ( '\\r\\n' | '\\'r' | '\\n' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case '\r':
                {
                alt12=1;
                }
                break;
            case '\'':
                {
                alt12=2;
                }
                break;
            case '\n':
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
                    // EmigOcl.g:7880:3: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // EmigOcl.g:7880:10: '\\'r'
                    {
                    match("'r"); 


                    }
                    break;
                case 3 :
                    // EmigOcl.g:7880:16: '\\n'
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
            // EmigOcl.g:7883:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // EmigOcl.g:7884:1: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // EmigOcl.g:7884:1: ( ( ' ' | '\\t' | '\\f' ) )
            // EmigOcl.g:7884:2: ( ' ' | '\\t' | '\\f' )
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

    public void mTokens() throws RecognitionException {
        // EmigOcl.g:1:8: ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | NOTOP | BOOLOP | INTOP | RELOP | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | TUPLETYPE | MAPTYPE | STRING | TEXT | LINEBREAK | WHITESPACE )
        int alt13=53;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // EmigOcl.g:1:10: T__28
                {
                mT__28(); 

                }
                break;
            case 2 :
                // EmigOcl.g:1:16: T__29
                {
                mT__29(); 

                }
                break;
            case 3 :
                // EmigOcl.g:1:22: T__30
                {
                mT__30(); 

                }
                break;
            case 4 :
                // EmigOcl.g:1:28: T__31
                {
                mT__31(); 

                }
                break;
            case 5 :
                // EmigOcl.g:1:34: T__32
                {
                mT__32(); 

                }
                break;
            case 6 :
                // EmigOcl.g:1:40: T__33
                {
                mT__33(); 

                }
                break;
            case 7 :
                // EmigOcl.g:1:46: T__34
                {
                mT__34(); 

                }
                break;
            case 8 :
                // EmigOcl.g:1:52: T__35
                {
                mT__35(); 

                }
                break;
            case 9 :
                // EmigOcl.g:1:58: T__36
                {
                mT__36(); 

                }
                break;
            case 10 :
                // EmigOcl.g:1:64: T__37
                {
                mT__37(); 

                }
                break;
            case 11 :
                // EmigOcl.g:1:70: T__38
                {
                mT__38(); 

                }
                break;
            case 12 :
                // EmigOcl.g:1:76: T__39
                {
                mT__39(); 

                }
                break;
            case 13 :
                // EmigOcl.g:1:82: T__40
                {
                mT__40(); 

                }
                break;
            case 14 :
                // EmigOcl.g:1:88: T__41
                {
                mT__41(); 

                }
                break;
            case 15 :
                // EmigOcl.g:1:94: T__42
                {
                mT__42(); 

                }
                break;
            case 16 :
                // EmigOcl.g:1:100: T__43
                {
                mT__43(); 

                }
                break;
            case 17 :
                // EmigOcl.g:1:106: T__44
                {
                mT__44(); 

                }
                break;
            case 18 :
                // EmigOcl.g:1:112: T__45
                {
                mT__45(); 

                }
                break;
            case 19 :
                // EmigOcl.g:1:118: T__46
                {
                mT__46(); 

                }
                break;
            case 20 :
                // EmigOcl.g:1:124: T__47
                {
                mT__47(); 

                }
                break;
            case 21 :
                // EmigOcl.g:1:130: T__48
                {
                mT__48(); 

                }
                break;
            case 22 :
                // EmigOcl.g:1:136: T__49
                {
                mT__49(); 

                }
                break;
            case 23 :
                // EmigOcl.g:1:142: T__50
                {
                mT__50(); 

                }
                break;
            case 24 :
                // EmigOcl.g:1:148: T__51
                {
                mT__51(); 

                }
                break;
            case 25 :
                // EmigOcl.g:1:154: T__52
                {
                mT__52(); 

                }
                break;
            case 26 :
                // EmigOcl.g:1:160: T__53
                {
                mT__53(); 

                }
                break;
            case 27 :
                // EmigOcl.g:1:166: T__54
                {
                mT__54(); 

                }
                break;
            case 28 :
                // EmigOcl.g:1:172: T__55
                {
                mT__55(); 

                }
                break;
            case 29 :
                // EmigOcl.g:1:178: T__56
                {
                mT__56(); 

                }
                break;
            case 30 :
                // EmigOcl.g:1:184: NOTOP
                {
                mNOTOP(); 

                }
                break;
            case 31 :
                // EmigOcl.g:1:190: BOOLOP
                {
                mBOOLOP(); 

                }
                break;
            case 32 :
                // EmigOcl.g:1:197: INTOP
                {
                mINTOP(); 

                }
                break;
            case 33 :
                // EmigOcl.g:1:203: RELOP
                {
                mRELOP(); 

                }
                break;
            case 34 :
                // EmigOcl.g:1:209: ADDOP
                {
                mADDOP(); 

                }
                break;
            case 35 :
                // EmigOcl.g:1:215: MULOP
                {
                mMULOP(); 

                }
                break;
            case 36 :
                // EmigOcl.g:1:221: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 37 :
                // EmigOcl.g:1:229: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 38 :
                // EmigOcl.g:1:235: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 39 :
                // EmigOcl.g:1:243: STRINGTYPE
                {
                mSTRINGTYPE(); 

                }
                break;
            case 40 :
                // EmigOcl.g:1:254: BOOLEANTYPE
                {
                mBOOLEANTYPE(); 

                }
                break;
            case 41 :
                // EmigOcl.g:1:266: INTEGERTYPE
                {
                mINTEGERTYPE(); 

                }
                break;
            case 42 :
                // EmigOcl.g:1:278: REALTYPE
                {
                mREALTYPE(); 

                }
                break;
            case 43 :
                // EmigOcl.g:1:287: BAGTYPE
                {
                mBAGTYPE(); 

                }
                break;
            case 44 :
                // EmigOcl.g:1:295: ORDEREDSETTYPE
                {
                mORDEREDSETTYPE(); 

                }
                break;
            case 45 :
                // EmigOcl.g:1:310: SEQUENCETYPE
                {
                mSEQUENCETYPE(); 

                }
                break;
            case 46 :
                // EmigOcl.g:1:323: SETTYPE
                {
                mSETTYPE(); 

                }
                break;
            case 47 :
                // EmigOcl.g:1:331: OCLANYTYPE
                {
                mOCLANYTYPE(); 

                }
                break;
            case 48 :
                // EmigOcl.g:1:342: TUPLETYPE
                {
                mTUPLETYPE(); 

                }
                break;
            case 49 :
                // EmigOcl.g:1:352: MAPTYPE
                {
                mMAPTYPE(); 

                }
                break;
            case 50 :
                // EmigOcl.g:1:360: STRING
                {
                mSTRING(); 

                }
                break;
            case 51 :
                // EmigOcl.g:1:367: TEXT
                {
                mTEXT(); 

                }
                break;
            case 52 :
                // EmigOcl.g:1:372: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 53 :
                // EmigOcl.g:1:382: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\47\2\uffff\1\47\1\uffff\1\47\5\uffff\1\35\1\uffff\4\47"+
        "\3\uffff\7\47\3\uffff\1\104\6\47\4\uffff\4\47\3\uffff\1\47\1\124"+
        "\1\125\15\47\1\143\1\47\2\uffff\10\47\1\50\1\uffff\1\160\1\161\1"+
        "\160\2\47\2\uffff\10\47\1\175\2\47\1\u0080\1\143\1\uffff\1\143\2"+
        "\47\1\u0083\1\47\1\u0085\3\47\1\u0089\2\47\2\uffff\4\47\1\u0090"+
        "\1\u0091\1\u0092\4\47\1\uffff\1\u0097\1\47\1\uffff\2\47\1\uffff"+
        "\1\47\1\uffff\1\47\1\u009d\1\47\1\uffff\5\47\1\u00a4\3\uffff\1\u00a5"+
        "\3\47\1\uffff\1\u00a9\4\47\1\uffff\1\u00ae\1\u00af\1\u00b0\3\47"+
        "\2\uffff\1\47\1\u00b5\1\47\1\uffff\1\u00b7\3\47\3\uffff\1\u00bb"+
        "\1\u00bc\1\143\1\47\1\uffff\1\47\1\uffff\1\47\1\u00c0\1\u00c1\2"+
        "\uffff\2\47\1\u00c4\2\uffff\2\47\1\uffff\1\47\1\u00c8\1\47\1\uffff"+
        "\1\u00ca\1\uffff";
    static final String DFA13_eofS =
        "\u00cb\uffff";
    static final String DFA13_minS =
        "\1\11\1\157\2\uffff\1\145\1\uffff\1\157\5\uffff\1\55\1\uffff\1\146"+
        "\1\145\1\150\1\141\3\uffff\1\143\1\145\1\154\1\157\1\156\1\162\1"+
        "\157\3\uffff\1\56\1\145\1\141\1\156\1\145\1\165\1\141\1\0\3\uffff"+
        "\1\144\1\146\1\166\1\156\3\uffff\1\145\2\55\2\160\1\154\1\165\1"+
        "\145\2\154\1\144\1\164\1\163\1\144\1\164\1\144\1\55\1\162\2\uffff"+
        "\1\162\1\161\1\157\1\147\1\164\1\141\2\160\1\0\1\uffff\3\55\1\164"+
        "\1\162\2\uffff\1\154\1\145\1\146\1\145\1\156\1\163\1\101\1\145\1"+
        "\55\1\145\1\151\2\55\1\uffff\1\55\1\151\1\165\1\55\1\154\1\55\1"+
        "\145\2\154\1\55\2\154\2\uffff\1\145\1\141\1\151\1\162\3\55\1\145"+
        "\2\156\1\162\1\uffff\1\55\1\146\1\uffff\1\156\1\145\1\uffff\1\145"+
        "\1\uffff\1\147\1\55\1\145\1\uffff\1\145\1\163\1\170\1\164\1\145"+
        "\1\55\3\uffff\1\55\1\144\1\171\1\145\1\uffff\1\55\1\147\1\156\1"+
        "\141\1\145\1\uffff\3\55\1\164\1\145\1\163\2\uffff\1\145\1\55\1\144"+
        "\1\uffff\1\55\1\143\1\156\1\162\3\uffff\3\55\1\146\1\uffff\1\123"+
        "\1\uffff\1\145\2\55\2\uffff\1\151\1\145\1\55\2\uffff\1\156\1\164"+
        "\1\uffff\1\145\1\55\1\144\1\uffff\1\55\1\uffff";
    static final String DFA13_maxS =
        "\1\175\1\157\2\uffff\1\151\1\uffff\1\157\5\uffff\1\76\1\uffff\1"+
        "\164\1\165\1\162\1\141\3\uffff\1\162\1\145\1\156\1\157\1\156\1\162"+
        "\1\157\3\uffff\1\71\1\164\1\157\1\156\1\145\1\165\1\141\1\uffff"+
        "\3\uffff\1\144\1\146\1\166\1\156\3\uffff\1\145\2\172\2\160\1\154"+
        "\1\165\1\145\2\154\1\144\1\164\1\163\1\144\1\164\1\144\1\172\1\162"+
        "\2\uffff\1\162\1\164\1\157\1\147\1\164\1\141\2\160\1\uffff\1\uffff"+
        "\3\172\1\164\1\162\2\uffff\1\154\1\145\1\146\1\145\1\156\1\163\1"+
        "\125\1\145\1\172\1\145\1\151\2\172\1\uffff\1\172\1\151\1\165\1\172"+
        "\1\154\1\172\1\145\2\154\1\172\2\154\2\uffff\1\145\1\141\1\151\1"+
        "\162\3\172\1\145\2\156\1\162\1\uffff\1\172\1\146\1\uffff\1\156\1"+
        "\145\1\uffff\1\145\1\uffff\1\147\1\172\1\145\1\uffff\1\145\1\163"+
        "\1\170\1\164\1\145\1\172\3\uffff\1\172\1\144\1\171\1\145\1\uffff"+
        "\1\172\1\147\1\156\1\141\1\145\1\uffff\3\172\1\164\1\145\1\163\2"+
        "\uffff\1\145\1\172\1\144\1\uffff\1\172\1\143\1\156\1\162\3\uffff"+
        "\3\172\1\146\1\uffff\1\123\1\uffff\1\145\2\172\2\uffff\1\151\1\145"+
        "\1\172\2\uffff\1\156\1\164\1\uffff\1\145\1\172\1\144\1\uffff\1\172"+
        "\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\4\1\uffff\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14\1"+
        "\uffff\1\16\4\uffff\1\24\1\25\1\26\7\uffff\1\41\1\42\1\43\10\uffff"+
        "\1\63\1\64\1\65\4\uffff\1\10\1\15\1\44\22\uffff\1\45\1\46\11\uffff"+
        "\1\62\5\uffff\1\31\1\32\15\uffff\1\37\14\uffff\1\40\1\5\13\uffff"+
        "\1\30\2\uffff\1\36\2\uffff\1\56\1\uffff\1\53\3\uffff\1\61\6\uffff"+
        "\1\21\1\22\1\33\4\uffff\1\34\5\uffff\1\52\6\uffff\1\20\1\23\3\uffff"+
        "\1\35\4\uffff\1\60\1\1\1\3\4\uffff\1\57\1\uffff\1\47\3\uffff\1\7"+
        "\1\17\3\uffff\1\50\1\51\2\uffff\1\55\3\uffff\1\54\1\uffff\1\27";
    static final String DFA13_specialS =
        "\46\uffff\1\1\46\uffff\1\0\175\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\51\1\50\1\uffff\1\51\1\50\22\uffff\1\51\1\12\1\uffff\1\24"+
            "\3\uffff\1\46\1\10\1\11\1\36\1\35\1\3\1\14\1\13\1\36\12\37\1"+
            "\5\1\2\1\34\1\7\1\34\2\uffff\1\47\1\41\6\47\1\42\3\47\1\45\1"+
            "\47\1\25\2\47\1\43\1\40\1\44\6\47\6\uffff\1\31\1\47\1\6\1\4"+
            "\1\27\1\21\2\47\1\16\2\47\1\26\1\1\1\30\1\32\3\47\1\17\1\20"+
            "\3\47\1\33\2\47\1\22\1\15\1\23",
            "\1\52",
            "",
            "",
            "\1\53\3\uffff\1\54",
            "",
            "\1\55",
            "",
            "",
            "",
            "",
            "",
            "\1\60\2\uffff\12\37\4\uffff\1\57",
            "",
            "\1\63\6\uffff\1\64\1\62\5\uffff\1\61",
            "\1\66\17\uffff\1\65",
            "\1\70\11\uffff\1\67",
            "\1\71",
            "",
            "",
            "",
            "\1\72\16\uffff\1\73",
            "\1\74",
            "\1\75\1\uffff\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "\1\103\1\uffff\12\37",
            "\1\106\16\uffff\1\105",
            "\1\110\15\uffff\1\107",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\162\116\1\115\uff8d\116",
            "",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "\1\123",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\144",
            "",
            "",
            "\1\145",
            "\1\146\2\uffff\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\0\116",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\157\17\47\1\156\5\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\162",
            "\1\163",
            "",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\173\23\uffff\1\172",
            "\1\174",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\176",
            "\1\177",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0081",
            "\1\u0082",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0084",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "\1\u00b4",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b6",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00bd",
            "",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00c9",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | NOTOP | BOOLOP | INTOP | RELOP | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | TUPLETYPE | MAPTYPE | STRING | TEXT | LINEBREAK | WHITESPACE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_77 = input.LA(1);

                        s = -1;
                        if ( ((LA13_77>='\u0000' && LA13_77<='\uFFFF')) ) {s = 78;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( (LA13_38=='r') ) {s = 77;}

                        else if ( ((LA13_38>='\u0000' && LA13_38<='q')||(LA13_38>='s' && LA13_38<='\uFFFF')) ) {s = 78;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}