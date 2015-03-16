// $ANTLR ${project.version} ${buildNumber}

	package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;


import org.antlr.runtime3_3_0.*;

public class EdeltaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
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
    public static final int TEXT=4;
    public static final int QUOTED_34_34=5;
    public static final int WHITESPACE=6;
    public static final int LINEBREAK=7;

    	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public EdeltaLexer() {;} 
    public EdeltaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public EdeltaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Edelta.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:16:6: ( 'datatypes' )
            // Edelta.g:16:8: 'datatypes'
            {
            match("datatypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:17:6: ( '{' )
            // Edelta.g:17:8: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:18:7: ( '}' )
            // Edelta.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:19:7: ( 'datatype' )
            // Edelta.g:19:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:20:7: ( 'module' )
            // Edelta.g:20:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:21:7: ( ';' )
            // Edelta.g:21:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:22:7: ( 'addPackage' )
            // Edelta.g:22:9: 'addPackage'
            {
            match("addPackage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:23:7: ( '(' )
            // Edelta.g:23:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:24:7: ( ')' )
            // Edelta.g:24:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:25:7: ( 'changePackage' )
            // Edelta.g:25:9: 'changePackage'
            {
            match("changePackage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:26:7: ( 'deletePackage' )
            // Edelta.g:26:9: 'deletePackage'
            {
            match("deletePackage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:27:7: ( 'package' )
            // Edelta.g:27:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:28:7: ( '=' )
            // Edelta.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:29:7: ( 'class' )
            // Edelta.g:29:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:30:7: ( 'addClass' )
            // Edelta.g:30:9: 'addClass'
            {
            match("addClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:31:7: ( 'changeClass' )
            // Edelta.g:31:9: 'changeClass'
            {
            match("changeClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:32:7: ( 'deleteClass' )
            // Edelta.g:32:9: 'deleteClass'
            {
            match("deleteClass"); 


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
            // Edelta.g:33:7: ( 'addAttribute' )
            // Edelta.g:33:9: 'addAttribute'
            {
            match("addAttribute"); 


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
            // Edelta.g:34:7: ( 'deleteAttribute' )
            // Edelta.g:34:9: 'deleteAttribute'
            {
            match("deleteAttribute"); 


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
            // Edelta.g:35:7: ( 'changeAttribute' )
            // Edelta.g:35:9: 'changeAttribute'
            {
            match("changeAttribute"); 


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
            // Edelta.g:36:7: ( 'addReference' )
            // Edelta.g:36:9: 'addReference'
            {
            match("addReference"); 


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
            // Edelta.g:37:7: ( 'deleteReference' )
            // Edelta.g:37:9: 'deleteReference'
            {
            match("deleteReference"); 


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
            // Edelta.g:38:7: ( 'changeReference' )
            // Edelta.g:38:9: 'changeReference'
            {
            match("changeReference"); 


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
            // Edelta.g:39:7: ( 'attribute' )
            // Edelta.g:39:9: 'attribute'
            {
            match("attribute"); 


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
            // Edelta.g:40:7: ( 'reference' )
            // Edelta.g:40:9: 'reference'
            {
            match("reference"); 


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
            // Edelta.g:41:7: ( 'set' )
            // Edelta.g:41:9: 'set'
            {
            match("set"); 


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
            // Edelta.g:42:7: ( '<-' )
            // Edelta.g:42:9: '<-'
            {
            match("<-"); 


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
            // Edelta.g:43:7: ( '.' )
            // Edelta.g:43:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:4247:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Edelta.g:4248:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Edelta.g:4248:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Edelta.g:4248:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Edelta.g:4248:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Edelta.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:4250:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Edelta.g:4251:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // Edelta.g:4251:2: ( ( ' ' | '\\t' | '\\f' ) )
            // Edelta.g:4251:3: ( ' ' | '\\t' | '\\f' )
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

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:4254:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Edelta.g:4255:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Edelta.g:4255:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Edelta.g:4255:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Edelta.g:4255:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='\n') ) {
                    alt2=1;
                }
                else {
                    alt2=2;}
            }
            else if ( (LA2_0=='\n') ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // Edelta.g:4255:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Edelta.g:4255:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Edelta.g:4255:20: '\\n'
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

    // $ANTLR start "QUOTED_34_34"
    public final void mQUOTED_34_34() throws RecognitionException {
        try {
            int _type = QUOTED_34_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Edelta.g:4258:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // Edelta.g:4259:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // Edelta.g:4259:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Edelta.g:4259:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Edelta.g:4259:3: ( '\"' )
            // Edelta.g:4259:4: '\"'
            {
            match('\"'); 

            }

            // Edelta.g:4259:8: (~ ( '\"' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Edelta.g:4259:9: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
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

            // Edelta.g:4259:17: ( '\"' )
            // Edelta.g:4259:18: '\"'
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
    // $ANTLR end "QUOTED_34_34"

    public void mTokens() throws RecognitionException {
        // Edelta.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 )
        int alt4=32;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // Edelta.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // Edelta.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // Edelta.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // Edelta.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // Edelta.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // Edelta.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // Edelta.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // Edelta.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // Edelta.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // Edelta.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // Edelta.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // Edelta.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // Edelta.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // Edelta.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // Edelta.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // Edelta.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // Edelta.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // Edelta.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // Edelta.g:1:116: T__26
                {
                mT__26(); 

                }
                break;
            case 20 :
                // Edelta.g:1:122: T__27
                {
                mT__27(); 

                }
                break;
            case 21 :
                // Edelta.g:1:128: T__28
                {
                mT__28(); 

                }
                break;
            case 22 :
                // Edelta.g:1:134: T__29
                {
                mT__29(); 

                }
                break;
            case 23 :
                // Edelta.g:1:140: T__30
                {
                mT__30(); 

                }
                break;
            case 24 :
                // Edelta.g:1:146: T__31
                {
                mT__31(); 

                }
                break;
            case 25 :
                // Edelta.g:1:152: T__32
                {
                mT__32(); 

                }
                break;
            case 26 :
                // Edelta.g:1:158: T__33
                {
                mT__33(); 

                }
                break;
            case 27 :
                // Edelta.g:1:164: T__34
                {
                mT__34(); 

                }
                break;
            case 28 :
                // Edelta.g:1:170: T__35
                {
                mT__35(); 

                }
                break;
            case 29 :
                // Edelta.g:1:176: TEXT
                {
                mTEXT(); 

                }
                break;
            case 30 :
                // Edelta.g:1:181: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 31 :
                // Edelta.g:1:192: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 32 :
                // Edelta.g:1:202: QUOTED_34_34
                {
                mQUOTED_34_34(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\1\20\2\uffff\1\20\1\uffff\1\20\2\uffff\2\20\1\uffff\2\20"+
        "\6\uffff\23\20\1\64\14\20\1\uffff\11\20\1\112\4\20\1\122\6\20\1"+
        "\uffff\7\20\1\uffff\11\20\1\154\1\20\1\157\5\20\1\165\7\20\1\uffff"+
        "\1\20\1\176\1\uffff\5\20\1\uffff\2\20\1\u0086\4\20\1\u008b\1\uffff"+
        "\4\20\1\u0090\2\20\1\uffff\4\20\1\uffff\1\20\1\u0098\2\20\1\uffff"+
        "\3\20\1\u009e\3\20\1\uffff\2\20\1\u00a4\1\u00a5\1\20\1\uffff\2\20"+
        "\1\u00a9\2\20\2\uffff\1\u00ac\2\20\1\uffff\2\20\1\uffff\2\20\1\u00b3"+
        "\1\u00b4\1\u00b5\1\u00b6\4\uffff";
    static final String DFA4_eofS =
        "\u00b7\uffff";
    static final String DFA4_minS =
        "\1\11\1\141\2\uffff\1\157\1\uffff\1\144\2\uffff\1\150\1\141\1\uffff"+
        "\2\145\6\uffff\1\164\1\154\2\144\1\164\2\141\1\143\1\146\1\164\1"+
        "\141\1\145\1\165\1\101\1\162\1\156\1\163\1\153\1\145\1\55\2\164"+
        "\1\154\1\141\1\154\1\164\1\145\1\151\1\147\1\163\1\141\1\162\1\uffff"+
        "\1\171\2\145\1\143\1\141\1\164\1\146\1\142\1\145\1\55\1\147\1\145"+
        "\1\160\1\101\1\55\1\153\1\163\1\162\1\145\1\165\1\101\1\uffff\1"+
        "\145\1\156\1\145\1\141\1\154\1\164\1\145\1\uffff\1\141\1\163\1\151"+
        "\1\162\1\164\1\141\1\154\1\164\1\145\1\55\1\143\1\55\1\143\1\141"+
        "\1\164\1\146\1\147\1\55\1\142\2\145\1\143\1\141\1\164\1\146\1\uffff"+
        "\1\145\1\55\1\uffff\1\153\1\163\1\162\2\145\1\uffff\1\165\1\156"+
        "\1\55\1\153\1\163\1\162\1\145\1\55\1\uffff\1\141\1\163\1\151\1\162"+
        "\1\55\1\164\1\143\1\uffff\1\141\1\163\1\151\1\162\1\uffff\1\147"+
        "\1\55\1\142\1\145\1\uffff\2\145\1\147\1\55\1\142\2\145\1\uffff\1"+
        "\165\1\156\2\55\1\145\1\uffff\1\165\1\156\1\55\1\164\1\143\2\uffff"+
        "\1\55\1\164\1\143\1\uffff\2\145\1\uffff\2\145\4\55\4\uffff";
    static final String DFA4_maxS =
        "\1\175\1\145\2\uffff\1\157\1\uffff\1\164\2\uffff\1\154\1\141\1\uffff"+
        "\2\145\6\uffff\1\164\1\154\2\144\1\164\2\141\1\143\1\146\1\164\1"+
        "\141\1\145\1\165\1\122\1\162\1\156\1\163\1\153\1\145\1\172\2\164"+
        "\1\154\1\141\1\154\1\164\1\145\1\151\1\147\1\163\1\141\1\162\1\uffff"+
        "\1\171\2\145\1\143\1\141\1\164\1\146\1\142\1\145\1\172\1\147\1\145"+
        "\1\160\1\122\1\172\1\153\1\163\1\162\1\145\1\165\1\122\1\uffff\1"+
        "\145\1\156\1\145\1\141\1\154\1\164\1\145\1\uffff\1\141\1\163\1\151"+
        "\1\162\1\164\1\141\1\154\1\164\1\145\1\172\1\143\1\172\1\143\1\141"+
        "\1\164\1\146\1\147\1\172\1\142\2\145\1\143\1\141\1\164\1\146\1\uffff"+
        "\1\145\1\172\1\uffff\1\153\1\163\1\162\2\145\1\uffff\1\165\1\156"+
        "\1\172\1\153\1\163\1\162\1\145\1\172\1\uffff\1\141\1\163\1\151\1"+
        "\162\1\172\1\164\1\143\1\uffff\1\141\1\163\1\151\1\162\1\uffff\1"+
        "\147\1\172\1\142\1\145\1\uffff\2\145\1\147\1\172\1\142\2\145\1\uffff"+
        "\1\165\1\156\2\172\1\145\1\uffff\1\165\1\156\1\172\1\164\1\143\2"+
        "\uffff\1\172\1\164\1\143\1\uffff\2\145\1\uffff\2\145\4\172\4\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\6\1\uffff\1\10\1\11\2\uffff\1\15\2\uffff"+
        "\1\33\1\34\1\35\1\36\1\37\1\40\40\uffff\1\32\25\uffff\1\16\7\uffff"+
        "\1\5\31\uffff\1\14\2\uffff\1\4\5\uffff\1\17\10\uffff\1\1\7\uffff"+
        "\1\30\4\uffff\1\31\4\uffff\1\7\7\uffff\1\21\5\uffff\1\20\5\uffff"+
        "\1\22\1\25\3\uffff\1\13\2\uffff\1\12\6\uffff\1\23\1\26\1\24\1\27";
    static final String DFA4_specialS =
        "\u00b7\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\21\1\22\1\uffff\1\21\1\22\22\uffff\1\21\1\uffff\1\23\5\uffff"+
            "\1\7\1\10\3\uffff\1\20\1\17\1\uffff\12\20\1\uffff\1\5\1\16\1"+
            "\13\3\uffff\32\20\4\uffff\1\20\1\uffff\1\6\1\20\1\11\1\1\10"+
            "\20\1\4\2\20\1\12\1\20\1\14\1\15\7\20\1\2\1\uffff\1\3",
            "\1\24\3\uffff\1\25",
            "",
            "",
            "\1\26",
            "",
            "\1\27\17\uffff\1\30",
            "",
            "",
            "\1\31\3\uffff\1\32",
            "\1\33",
            "",
            "\1\34",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\55\1\uffff\1\54\14\uffff\1\53\1\uffff\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\120\1\uffff\1\117\14\uffff\1\116\1\uffff\1\121",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\132\1\uffff\1\131\14\uffff\1\130\1\uffff\1\133",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\155",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\22\20"+
            "\1\156\7\20",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\20\2\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 );";
        }
    }
 

}