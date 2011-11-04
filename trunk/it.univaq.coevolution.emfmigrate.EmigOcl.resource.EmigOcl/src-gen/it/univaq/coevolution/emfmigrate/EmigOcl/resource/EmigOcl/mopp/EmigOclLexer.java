// $ANTLR ${project.version} ${buildNumber}

	package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;


import org.antlr.runtime3_3_0.*;

public class EmigOclLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
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
    public static final int TEXT=4;
    public static final int TXTOP=5;
    public static final int SYMOP=6;
    public static final int STRINGTYPE=7;
    public static final int BOOLEANTYPE=8;
    public static final int INTEGERTYPE=9;
    public static final int REALTYPE=10;
    public static final int BAGTYPE=11;
    public static final int ORDEREDSETTYPE=12;
    public static final int SEQUENCETYPE=13;
    public static final int SETTYPE=14;
    public static final int OCLANYTYPE=15;
    public static final int TUPLETYPE=16;
    public static final int MAPTYPE=17;
    public static final int STRING=18;
    public static final int FLOAT=19;
    public static final int INTEGER=20;
    public static final int COMMENT=21;
    public static final int LINEBREAK=22;
    public static final int WHITESPACE=23;

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

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:18:7: ( ',' )
            // EmigOcl.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:19:7: ( 'def' )
            // EmigOcl.g:19:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:20:7: ( ':' )
            // EmigOcl.g:20:9: ':'
            {
            match(':'); 

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
            // EmigOcl.g:21:7: ( 'context' )
            // EmigOcl.g:21:9: 'context'
            {
            match("context"); 


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
            // EmigOcl.g:22:7: ( '=' )
            // EmigOcl.g:22:9: '='
            {
            match('='); 

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
            // EmigOcl.g:23:7: ( '(' )
            // EmigOcl.g:23:9: '('
            {
            match('('); 

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
            // EmigOcl.g:24:7: ( ')' )
            // EmigOcl.g:24:9: ')'
            {
            match(')'); 

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
            // EmigOcl.g:25:7: ( '!' )
            // EmigOcl.g:25:9: '!'
            {
            match('!'); 

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
            // EmigOcl.g:26:7: ( '.' )
            // EmigOcl.g:26:9: '.'
            {
            match('.'); 

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
            // EmigOcl.g:27:7: ( '->' )
            // EmigOcl.g:27:9: '->'
            {
            match("->"); 


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
            // EmigOcl.g:28:7: ( '|' )
            // EmigOcl.g:28:9: '|'
            {
            match('|'); 

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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:30:7: ( 'super' )
            // EmigOcl.g:30:9: 'super'
            {
            match("super"); 


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
            // EmigOcl.g:31:7: ( 'true' )
            // EmigOcl.g:31:9: 'true'
            {
            match("true"); 


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
            // EmigOcl.g:32:7: ( 'false' )
            // EmigOcl.g:32:9: 'false'
            {
            match("false"); 


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
            // EmigOcl.g:33:7: ( '{' )
            // EmigOcl.g:33:9: '{'
            {
            match('{'); 

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
            // EmigOcl.g:34:7: ( '}' )
            // EmigOcl.g:34:9: '}'
            {
            match('}'); 

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
            // EmigOcl.g:35:7: ( '#' )
            // EmigOcl.g:35:9: '#'
            {
            match('#'); 

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
            // EmigOcl.g:36:7: ( 'OclUndefined' )
            // EmigOcl.g:36:9: 'OclUndefined'
            {
            match("OclUndefined"); 


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
            // EmigOcl.g:37:7: ( 'let' )
            // EmigOcl.g:37:9: 'let'
            {
            match("let"); 


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
            // EmigOcl.g:38:7: ( 'in' )
            // EmigOcl.g:38:9: 'in'
            {
            match("in"); 


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
            // EmigOcl.g:39:7: ( 'if' )
            // EmigOcl.g:39:9: 'if'
            {
            match("if"); 


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
            // EmigOcl.g:40:7: ( 'then' )
            // EmigOcl.g:40:9: 'then'
            {
            match("then"); 


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
            // EmigOcl.g:41:7: ( 'else' )
            // EmigOcl.g:41:9: 'else'
            {
            match("else"); 


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
            // EmigOcl.g:42:7: ( 'endif' )
            // EmigOcl.g:42:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "TXTOP"
    public final void mTXTOP() throws RecognitionException {
        try {
            int _type = TXTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:7970:6: ( ( ( 'not' | 'and' | 'or' | 'xor' | 'implies' | 'div' | 'mod' ) ) )
            // EmigOcl.g:7971:2: ( ( 'not' | 'and' | 'or' | 'xor' | 'implies' | 'div' | 'mod' ) )
            {
            // EmigOcl.g:7971:2: ( ( 'not' | 'and' | 'or' | 'xor' | 'implies' | 'div' | 'mod' ) )
            // EmigOcl.g:7971:3: ( 'not' | 'and' | 'or' | 'xor' | 'implies' | 'div' | 'mod' )
            {
            // EmigOcl.g:7971:3: ( 'not' | 'and' | 'or' | 'xor' | 'implies' | 'div' | 'mod' )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt1=1;
                }
                break;
            case 'a':
                {
                alt1=2;
                }
                break;
            case 'o':
                {
                alt1=3;
                }
                break;
            case 'x':
                {
                alt1=4;
                }
                break;
            case 'i':
                {
                alt1=5;
                }
                break;
            case 'd':
                {
                alt1=6;
                }
                break;
            case 'm':
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // EmigOcl.g:7971:4: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 2 :
                    // EmigOcl.g:7971:10: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 3 :
                    // EmigOcl.g:7971:16: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 4 :
                    // EmigOcl.g:7971:21: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 5 :
                    // EmigOcl.g:7971:27: 'implies'
                    {
                    match("implies"); 


                    }
                    break;
                case 6 :
                    // EmigOcl.g:7971:37: 'div'
                    {
                    match("div"); 


                    }
                    break;
                case 7 :
                    // EmigOcl.g:7971:43: 'mod'
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
    // $ANTLR end "TXTOP"

    // $ANTLR start "SYMOP"
    public final void mSYMOP() throws RecognitionException {
        try {
            int _type = SYMOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:7973:6: ( ( ( '-' | '+' | '*' | '/' | '=' | '>' | '<' | '>=' | '<=' ) ) )
            // EmigOcl.g:7974:2: ( ( '-' | '+' | '*' | '/' | '=' | '>' | '<' | '>=' | '<=' ) )
            {
            // EmigOcl.g:7974:2: ( ( '-' | '+' | '*' | '/' | '=' | '>' | '<' | '>=' | '<=' ) )
            // EmigOcl.g:7974:3: ( '-' | '+' | '*' | '/' | '=' | '>' | '<' | '>=' | '<=' )
            {
            // EmigOcl.g:7974:3: ( '-' | '+' | '*' | '/' | '=' | '>' | '<' | '>=' | '<=' )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // EmigOcl.g:7974:4: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 2 :
                    // EmigOcl.g:7974:8: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 3 :
                    // EmigOcl.g:7974:12: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 4 :
                    // EmigOcl.g:7974:16: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 5 :
                    // EmigOcl.g:7974:20: '='
                    {
                    match('='); 

                    }
                    break;
                case 6 :
                    // EmigOcl.g:7974:24: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 7 :
                    // EmigOcl.g:7974:28: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 8 :
                    // EmigOcl.g:7974:32: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 9 :
                    // EmigOcl.g:7974:37: '<='
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
    // $ANTLR end "SYMOP"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EmigOcl.g:7976:8: ( ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // EmigOcl.g:7977:2: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // EmigOcl.g:7977:2: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // EmigOcl.g:7977:3: '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("--"); 

            // EmigOcl.g:7977:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFE')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // EmigOcl.g:7977:8: ~ ( '\\n' | '\\r' | '\\uffff' )
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
            	    break loop3;
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
            // EmigOcl.g:7980:6: ( ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ ) )
            // EmigOcl.g:7981:2: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            {
            // EmigOcl.g:7981:2: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            // EmigOcl.g:7981:3: ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+
            {
            // EmigOcl.g:7981:3: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // EmigOcl.g:7981:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // EmigOcl.g:7981:7: ( ( '0' .. '9' ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // EmigOcl.g:7981:8: ( '0' .. '9' )
            	    {
            	    // EmigOcl.g:7981:8: ( '0' .. '9' )
            	    // EmigOcl.g:7981:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            match('.'); 
            // EmigOcl.g:7981:23: ( ( '0' .. '9' ) )+
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
            	    // EmigOcl.g:7981:24: ( '0' .. '9' )
            	    {
            	    // EmigOcl.g:7981:24: ( '0' .. '9' )
            	    // EmigOcl.g:7981:25: '0' .. '9'
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
            // EmigOcl.g:7983:8: ( ( ( '-' )? ( ( '0' .. '9' ) )+ ) )
            // EmigOcl.g:7984:2: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            {
            // EmigOcl.g:7984:2: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            // EmigOcl.g:7984:3: ( '-' )? ( ( '0' .. '9' ) )+
            {
            // EmigOcl.g:7984:3: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // EmigOcl.g:7984:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // EmigOcl.g:7984:7: ( ( '0' .. '9' ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // EmigOcl.g:7984:8: ( '0' .. '9' )
            	    {
            	    // EmigOcl.g:7984:8: ( '0' .. '9' )
            	    // EmigOcl.g:7984:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // EmigOcl.g:7986:11: ( ( 'String' ) )
            // EmigOcl.g:7987:2: ( 'String' )
            {
            // EmigOcl.g:7987:2: ( 'String' )
            // EmigOcl.g:7987:3: 'String'
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
            // EmigOcl.g:7989:12: ( ( 'Boolean' ) )
            // EmigOcl.g:7990:2: ( 'Boolean' )
            {
            // EmigOcl.g:7990:2: ( 'Boolean' )
            // EmigOcl.g:7990:3: 'Boolean'
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
            // EmigOcl.g:7992:12: ( ( 'Integer' ) )
            // EmigOcl.g:7993:2: ( 'Integer' )
            {
            // EmigOcl.g:7993:2: ( 'Integer' )
            // EmigOcl.g:7993:3: 'Integer'
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
            // EmigOcl.g:7995:9: ( ( 'Real' ) )
            // EmigOcl.g:7996:2: ( 'Real' )
            {
            // EmigOcl.g:7996:2: ( 'Real' )
            // EmigOcl.g:7996:3: 'Real'
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
            // EmigOcl.g:7998:8: ( 'Bag' )
            // EmigOcl.g:7999:2: 'Bag'
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
            // EmigOcl.g:8000:15: ( 'OrderedSet' )
            // EmigOcl.g:8001:2: 'OrderedSet'
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
            // EmigOcl.g:8002:13: ( 'Sequence' )
            // EmigOcl.g:8003:2: 'Sequence'
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
            // EmigOcl.g:8004:8: ( 'Set' )
            // EmigOcl.g:8005:2: 'Set'
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
            // EmigOcl.g:8006:11: ( ( 'OclAny' ) )
            // EmigOcl.g:8007:2: ( 'OclAny' )
            {
            // EmigOcl.g:8007:2: ( 'OclAny' )
            // EmigOcl.g:8007:3: 'OclAny'
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
            // EmigOcl.g:8009:10: ( 'Tuple' )
            // EmigOcl.g:8010:2: 'Tuple'
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
            // EmigOcl.g:8011:8: ( 'Map' )
            // EmigOcl.g:8012:2: 'Map'
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
            // EmigOcl.g:8013:7: ( ( '\"' ( . )* '\"' ) )
            // EmigOcl.g:8014:2: ( '\"' ( . )* '\"' )
            {
            // EmigOcl.g:8014:2: ( '\"' ( . )* '\"' )
            // EmigOcl.g:8014:3: '\"' ( . )* '\"'
            {
            match('\"'); 
            // EmigOcl.g:8014:6: ( . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\"') ) {
                    alt9=2;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // EmigOcl.g:8014:6: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\"'); 

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
            // EmigOcl.g:8016:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* ) )
            // EmigOcl.g:8017:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* )
            {
            // EmigOcl.g:8017:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* )
            // EmigOcl.g:8017:3: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // EmigOcl.g:8017:22: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
            loop10:
            do {
                int alt10=5;
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
                case '-':
                    {
                    alt10=3;
                    }
                    break;
                case '_':
                    {
                    alt10=4;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // EmigOcl.g:8017:23: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            	    // EmigOcl.g:8017:43: ( '0' .. '9' )
            	    {
            	    // EmigOcl.g:8017:43: ( '0' .. '9' )
            	    // EmigOcl.g:8017:44: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // EmigOcl.g:8017:54: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 4 :
            	    // EmigOcl.g:8017:58: '_'
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
            // EmigOcl.g:8019:10: ( ( ( '\\r\\n' | '\\'r' | '\\n' ) ) )
            // EmigOcl.g:8020:2: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            {
            // EmigOcl.g:8020:2: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            // EmigOcl.g:8020:3: ( '\\r\\n' | '\\'r' | '\\n' )
            {
            // EmigOcl.g:8020:3: ( '\\r\\n' | '\\'r' | '\\n' )
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
                    // EmigOcl.g:8020:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // EmigOcl.g:8020:11: '\\'r'
                    {
                    match("'r"); 


                    }
                    break;
                case 3 :
                    // EmigOcl.g:8020:17: '\\n'
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
            // EmigOcl.g:8023:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // EmigOcl.g:8024:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // EmigOcl.g:8024:2: ( ( ' ' | '\\t' | '\\f' ) )
            // EmigOcl.g:8024:3: ( ' ' | '\\t' | '\\f' )
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
        // EmigOcl.g:1:8: ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | TXTOP | SYMOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | TUPLETYPE | MAPTYPE | STRING | TEXT | LINEBREAK | WHITESPACE )
        int alt12=47;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // EmigOcl.g:1:10: T__24
                {
                mT__24(); 

                }
                break;
            case 2 :
                // EmigOcl.g:1:16: T__25
                {
                mT__25(); 

                }
                break;
            case 3 :
                // EmigOcl.g:1:22: T__26
                {
                mT__26(); 

                }
                break;
            case 4 :
                // EmigOcl.g:1:28: T__27
                {
                mT__27(); 

                }
                break;
            case 5 :
                // EmigOcl.g:1:34: T__28
                {
                mT__28(); 

                }
                break;
            case 6 :
                // EmigOcl.g:1:40: T__29
                {
                mT__29(); 

                }
                break;
            case 7 :
                // EmigOcl.g:1:46: T__30
                {
                mT__30(); 

                }
                break;
            case 8 :
                // EmigOcl.g:1:52: T__31
                {
                mT__31(); 

                }
                break;
            case 9 :
                // EmigOcl.g:1:58: T__32
                {
                mT__32(); 

                }
                break;
            case 10 :
                // EmigOcl.g:1:64: T__33
                {
                mT__33(); 

                }
                break;
            case 11 :
                // EmigOcl.g:1:70: T__34
                {
                mT__34(); 

                }
                break;
            case 12 :
                // EmigOcl.g:1:76: T__35
                {
                mT__35(); 

                }
                break;
            case 13 :
                // EmigOcl.g:1:82: T__36
                {
                mT__36(); 

                }
                break;
            case 14 :
                // EmigOcl.g:1:88: T__37
                {
                mT__37(); 

                }
                break;
            case 15 :
                // EmigOcl.g:1:94: T__38
                {
                mT__38(); 

                }
                break;
            case 16 :
                // EmigOcl.g:1:100: T__39
                {
                mT__39(); 

                }
                break;
            case 17 :
                // EmigOcl.g:1:106: T__40
                {
                mT__40(); 

                }
                break;
            case 18 :
                // EmigOcl.g:1:112: T__41
                {
                mT__41(); 

                }
                break;
            case 19 :
                // EmigOcl.g:1:118: T__42
                {
                mT__42(); 

                }
                break;
            case 20 :
                // EmigOcl.g:1:124: T__43
                {
                mT__43(); 

                }
                break;
            case 21 :
                // EmigOcl.g:1:130: T__44
                {
                mT__44(); 

                }
                break;
            case 22 :
                // EmigOcl.g:1:136: T__45
                {
                mT__45(); 

                }
                break;
            case 23 :
                // EmigOcl.g:1:142: T__46
                {
                mT__46(); 

                }
                break;
            case 24 :
                // EmigOcl.g:1:148: T__47
                {
                mT__47(); 

                }
                break;
            case 25 :
                // EmigOcl.g:1:154: T__48
                {
                mT__48(); 

                }
                break;
            case 26 :
                // EmigOcl.g:1:160: T__49
                {
                mT__49(); 

                }
                break;
            case 27 :
                // EmigOcl.g:1:166: T__50
                {
                mT__50(); 

                }
                break;
            case 28 :
                // EmigOcl.g:1:172: TXTOP
                {
                mTXTOP(); 

                }
                break;
            case 29 :
                // EmigOcl.g:1:178: SYMOP
                {
                mSYMOP(); 

                }
                break;
            case 30 :
                // EmigOcl.g:1:184: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 31 :
                // EmigOcl.g:1:192: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 32 :
                // EmigOcl.g:1:198: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 33 :
                // EmigOcl.g:1:206: STRINGTYPE
                {
                mSTRINGTYPE(); 

                }
                break;
            case 34 :
                // EmigOcl.g:1:217: BOOLEANTYPE
                {
                mBOOLEANTYPE(); 

                }
                break;
            case 35 :
                // EmigOcl.g:1:229: INTEGERTYPE
                {
                mINTEGERTYPE(); 

                }
                break;
            case 36 :
                // EmigOcl.g:1:241: REALTYPE
                {
                mREALTYPE(); 

                }
                break;
            case 37 :
                // EmigOcl.g:1:250: BAGTYPE
                {
                mBAGTYPE(); 

                }
                break;
            case 38 :
                // EmigOcl.g:1:258: ORDEREDSETTYPE
                {
                mORDEREDSETTYPE(); 

                }
                break;
            case 39 :
                // EmigOcl.g:1:273: SEQUENCETYPE
                {
                mSEQUENCETYPE(); 

                }
                break;
            case 40 :
                // EmigOcl.g:1:286: SETTYPE
                {
                mSETTYPE(); 

                }
                break;
            case 41 :
                // EmigOcl.g:1:294: OCLANYTYPE
                {
                mOCLANYTYPE(); 

                }
                break;
            case 42 :
                // EmigOcl.g:1:305: TUPLETYPE
                {
                mTUPLETYPE(); 

                }
                break;
            case 43 :
                // EmigOcl.g:1:315: MAPTYPE
                {
                mMAPTYPE(); 

                }
                break;
            case 44 :
                // EmigOcl.g:1:323: STRING
                {
                mSTRING(); 

                }
                break;
            case 45 :
                // EmigOcl.g:1:330: TEXT
                {
                mTEXT(); 

                }
                break;
            case 46 :
                // EmigOcl.g:1:335: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 47 :
                // EmigOcl.g:1:345: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA2_eotS =
        "\6\uffff\1\11\1\13\4\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\1\52\5\uffff\2\75\4\uffff";
    static final String DFA2_maxS =
        "\1\76\5\uffff\2\75\4\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\10\1\6\1\11\1\7";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\1\2\1\uffff\1\1\1\uffff\1\4\14\uffff\1\7\1\5\1\6",
            "",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "7974:3: ( '-' | '+' | '*' | '/' | '=' | '>' | '<' | '>=' | '<=' )";
        }
    }
    static final String DFA12_eotS =
        "\1\uffff\1\45\2\uffff\1\45\1\uffff\1\45\5\uffff\1\34\1\uffff\4\45"+
        "\3\uffff\7\45\1\uffff\1\101\6\45\4\uffff\4\45\3\uffff\1\45\1\117"+
        "\1\120\14\45\1\135\1\45\2\uffff\10\45\1\135\1\151\1\135\2\45\2\uffff"+
        "\7\45\1\164\2\45\2\135\1\uffff\1\135\2\45\1\171\1\45\1\173\3\45"+
        "\1\177\1\45\1\uffff\4\45\1\u0085\1\u0086\4\45\1\uffff\1\u008b\3"+
        "\45\1\uffff\1\45\1\uffff\1\45\1\u0091\1\45\1\uffff\4\45\1\u0097"+
        "\2\uffff\1\u0098\3\45\1\uffff\1\u009c\4\45\1\uffff\1\u00a1\1\u00a2"+
        "\3\45\2\uffff\1\45\1\u00a7\1\45\1\uffff\1\u00a9\3\45\2\uffff\1\u00ad"+
        "\1\u00ae\1\135\1\45\1\uffff\1\45\1\uffff\1\45\1\u00b2\1\u00b3\2"+
        "\uffff\2\45\1\u00b6\2\uffff\2\45\1\uffff\1\45\1\u00ba\1\45\1\uffff"+
        "\1\u00bc\1\uffff";
    static final String DFA12_eofS =
        "\u00bd\uffff";
    static final String DFA12_minS =
        "\1\11\1\157\2\uffff\1\145\1\uffff\1\157\5\uffff\1\55\1\uffff\1\146"+
        "\1\165\1\150\1\141\3\uffff\1\143\1\145\1\154\1\157\1\156\1\162\1"+
        "\157\1\uffff\1\56\1\145\1\141\1\156\1\145\1\165\1\141\4\uffff\1"+
        "\144\1\146\1\166\1\156\3\uffff\1\145\2\55\2\160\1\165\1\145\2\154"+
        "\1\144\1\164\1\163\1\144\1\164\1\144\1\55\1\162\2\uffff\1\162\1"+
        "\161\1\157\1\147\1\164\1\141\2\160\3\55\1\164\1\162\2\uffff\1\154"+
        "\2\145\1\156\1\163\1\101\1\145\1\55\1\145\1\151\2\55\1\uffff\1\55"+
        "\1\151\1\165\1\55\1\154\1\55\1\145\2\154\1\55\1\154\1\uffff\1\145"+
        "\1\141\1\151\1\162\2\55\1\145\2\156\1\162\1\uffff\1\55\1\146\1\156"+
        "\1\145\1\uffff\1\145\1\uffff\1\147\1\55\1\145\1\uffff\1\145\1\170"+
        "\1\164\1\145\1\55\2\uffff\1\55\1\144\1\171\1\145\1\uffff\1\55\1"+
        "\147\1\156\1\141\1\145\1\uffff\2\55\1\164\1\145\1\163\2\uffff\1"+
        "\145\1\55\1\144\1\uffff\1\55\1\143\1\156\1\162\2\uffff\3\55\1\146"+
        "\1\uffff\1\123\1\uffff\1\145\2\55\2\uffff\1\151\1\145\1\55\2\uffff"+
        "\1\156\1\164\1\uffff\1\145\1\55\1\144\1\uffff\1\55\1\uffff";
    static final String DFA12_maxS =
        "\1\175\1\157\2\uffff\1\151\1\uffff\1\157\5\uffff\1\76\1\uffff\1"+
        "\164\1\165\1\162\1\141\3\uffff\1\162\1\145\1\156\1\157\1\156\1\162"+
        "\1\157\1\uffff\1\71\1\164\1\157\1\156\1\145\1\165\1\141\4\uffff"+
        "\1\144\1\146\1\166\1\156\3\uffff\1\145\2\172\2\160\1\165\1\145\2"+
        "\154\1\144\1\164\1\163\1\144\1\164\1\144\1\172\1\162\2\uffff\1\162"+
        "\1\164\1\157\1\147\1\164\1\141\2\160\3\172\1\164\1\162\2\uffff\1"+
        "\154\2\145\1\156\1\163\1\125\1\145\1\172\1\145\1\151\2\172\1\uffff"+
        "\1\172\1\151\1\165\1\172\1\154\1\172\1\145\2\154\1\172\1\154\1\uffff"+
        "\1\145\1\141\1\151\1\162\2\172\1\145\2\156\1\162\1\uffff\1\172\1"+
        "\146\1\156\1\145\1\uffff\1\145\1\uffff\1\147\1\172\1\145\1\uffff"+
        "\1\145\1\170\1\164\1\145\1\172\2\uffff\1\172\1\144\1\171\1\145\1"+
        "\uffff\1\172\1\147\1\156\1\141\1\145\1\uffff\2\172\1\164\1\145\1"+
        "\163\2\uffff\1\145\1\172\1\144\1\uffff\1\172\1\143\1\156\1\162\2"+
        "\uffff\3\172\1\146\1\uffff\1\123\1\uffff\1\145\2\172\2\uffff\1\151"+
        "\1\145\1\172\2\uffff\1\156\1\164\1\uffff\1\145\1\172\1\144\1\uffff"+
        "\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\1\uffff\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\15\4\uffff\1\22\1\23\1\24\7\uffff\1\35\7\uffff\1\54\1\55\1\56"+
        "\1\57\4\uffff\1\7\1\14\1\36\21\uffff\1\37\1\40\15\uffff\1\27\1\30"+
        "\14\uffff\1\34\13\uffff\1\4\12\uffff\1\26\4\uffff\1\50\1\uffff\1"+
        "\45\3\uffff\1\53\5\uffff\1\20\1\31\4\uffff\1\32\5\uffff\1\44\5\uffff"+
        "\1\17\1\21\3\uffff\1\33\4\uffff\1\52\1\1\4\uffff\1\51\1\uffff\1"+
        "\41\3\uffff\1\6\1\16\3\uffff\1\42\1\43\2\uffff\1\47\3\uffff\1\46"+
        "\1\uffff\1\25";
    static final String DFA12_specialS =
        "\u00bd\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\47\1\46\1\uffff\1\47\1\46\22\uffff\1\47\1\12\1\44\1\24\3"+
            "\uffff\1\46\1\10\1\11\2\34\1\3\1\14\1\13\1\34\12\35\1\5\1\2"+
            "\1\34\1\7\1\34\2\uffff\1\45\1\37\6\45\1\40\3\45\1\43\1\45\1"+
            "\25\2\45\1\41\1\36\1\42\6\45\6\uffff\1\31\1\45\1\6\1\4\1\27"+
            "\1\21\2\45\1\16\2\45\1\26\1\1\1\30\1\32\3\45\1\17\1\20\3\45"+
            "\1\33\2\45\1\22\1\15\1\23",
            "\1\50",
            "",
            "",
            "\1\51\3\uffff\1\52",
            "",
            "\1\53",
            "",
            "",
            "",
            "",
            "",
            "\1\56\2\uffff\12\35\4\uffff\1\55",
            "",
            "\1\61\6\uffff\1\62\1\60\5\uffff\1\57",
            "\1\63",
            "\1\65\11\uffff\1\64",
            "\1\66",
            "",
            "",
            "",
            "\1\67\16\uffff\1\70",
            "\1\71",
            "\1\72\1\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "\1\100\1\uffff\12\35",
            "\1\103\16\uffff\1\102",
            "\1\105\15\uffff\1\104",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "",
            "\1\116",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\136",
            "",
            "",
            "\1\137",
            "\1\140\2\uffff\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45"+
            "\1\150\5\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\152",
            "\1\153",
            "",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\162\23\uffff\1\161",
            "\1\163",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\165",
            "\1\166",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\167",
            "\1\170",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\172",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "\1\u00a6",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a8",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00af",
            "",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00bb",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | TXTOP | SYMOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | TUPLETYPE | MAPTYPE | STRING | TEXT | LINEBREAK | WHITESPACE );";
        }
    }
 

}