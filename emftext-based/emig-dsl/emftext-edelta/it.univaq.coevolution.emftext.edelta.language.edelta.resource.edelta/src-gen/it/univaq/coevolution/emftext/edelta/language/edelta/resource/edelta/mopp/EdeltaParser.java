// $ANTLR ${project.version} ${buildNumber}

	package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class EdeltaParser extends EdeltaANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "QUOTED_34_34", "WHITESPACE", "LINEBREAK", "'datatypes'", "'{'", "'}'", "'datatype'", "'module'", "';'", "'addPackage'", "'('", "')'", "'changePackage'", "'deletePackage'", "'package'", "'='", "'class'", "'addClass'", "'changeClass'", "'deleteClass'", "'addAttribute'", "'deleteAttribute'", "'changeAttribute'", "'addReference'", "'deleteReference'", "'changeReference'", "'attribute'", "'reference'", "'set'", "'<-'", "'.'"
    };
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

    // delegates
    // delegators


        public EdeltaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public EdeltaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[77+1];
             
             
        }
        

    public String[] getTokenNames() { return EdeltaParser.tokenNames; }
    public String getGrammarFileName() { return "Edelta.g"; }


    	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolverFactory tokenResolverFactory = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal> expectedElements = new java.util.ArrayList<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	protected java.util.Stack<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaCommand<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource>() {
    			public boolean execute(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaProblem() {
    					public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity getSeverity() {
    						return it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity.ERROR;
    					}
    					public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType getType() {
    						return it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal expectedElement = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal(terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaCommand<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource>() {
    			public boolean execute(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource resource) {
    				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_3_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaCommand<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource>() {
    			public boolean execute(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource resource) {
    				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaCommand<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		postParseCommands.add(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaCommand<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource>() {
    			public boolean execute(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource resource) {
    				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new EdeltaParser(new org.antlr.runtime3_3_0.CommonTokenStream(new EdeltaLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new EdeltaParser(new org.antlr.runtime3_3_0.CommonTokenStream(new EdeltaLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public EdeltaParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((EdeltaLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((EdeltaLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.Model.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.DataType.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.Module.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.addPackage.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.changePackage.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.Package.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.Class.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.addClass.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.changeClass.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.addReference.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.changeReference.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.Attribute.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.Reference.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.Setter.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue();
    			}
    			if (type.getInstanceClass() == it.univaq.coevolution.emftext.edelta.language.edelta.Parameter.class) {
    				return parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter();
    			}
    		}
    		throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_3_0.IntStream arg0, org.antlr.runtime3_3_0.RecognitionException arg1, int arg2, org.antlr.runtime3_3_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaCommand<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource>>();
    		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaParseResult parseResult = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_3_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_3_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
    		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_3_0.Lexer lexer = (org.antlr.runtime3_3_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaCommand<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal>();
    		java.util.List<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal> newFollowSet = new java.util.ArrayList<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 177;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_3_0.CommonToken nextToken = (org.antlr.runtime3_3_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaPair<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaPair<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
    							it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaExpectedElement newFollower = newFollowerPair.getLeft();
    							it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal newFollowTerminal = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_3_0.CommonToken tokenAtIndex = (org.antlr.runtime3_3_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_3_0.IntStream input, int ttype, org.antlr.runtime3_3_0.BitSet follow) throws org.antlr.runtime3_3_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_3_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
    			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_3_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_3_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
    			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
    			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
    			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_3_0.CommonToken) {
    			final org.antlr.runtime3_3_0.CommonToken ct = (org.antlr.runtime3_3_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_3_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
    			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
    			org.antlr.runtime3_3_0.EarlyExitException eee = (org.antlr.runtime3_3_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
    			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
    			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedRangeException) {
    			org.antlr.runtime3_3_0.MismatchedRangeException mre = (org.antlr.runtime3_3_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
    			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	protected void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			this.incompleteObjects.pop();
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	



    // $ANTLR start "start"
    // Edelta.g:526:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        it.univaq.coevolution.emftext.edelta.language.edelta.Model c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Edelta.g:527:1: ( (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model ) EOF )
            // Edelta.g:528:2: (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_0, 0, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_0);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // Edelta.g:533:2: (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model )
            // Edelta.g:534:3: c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model
            {
            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model_in_start82);
            c0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		retrieveLayoutInformation(element, null, null, false);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "start"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model"
    // Edelta.g:542:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model returns [it.univaq.coevolution.emftext.edelta.language.edelta.Model element = null] : (a0_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module ) a1= 'datatypes' a2= '{' ( ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType ) ) )* a4= '}' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package ) ) )* ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.Model parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.Model element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model_StartIndex = input.index();
        Token a1=null;
        Token a2=null;
        Token a4=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Module a0_0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.DataType a3_0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.Package a5_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Edelta.g:545:1: ( (a0_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module ) a1= 'datatypes' a2= '{' ( ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType ) ) )* a4= '}' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package ) ) )* )
            // Edelta.g:546:2: (a0_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module ) a1= 'datatypes' a2= '{' ( ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType ) ) )* a4= '}' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package ) ) )*
            {
            // Edelta.g:546:2: (a0_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module )
            // Edelta.g:547:3: a0_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module
            {
            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model119);
            a0_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
              			}
              			if (element == null) {
              				element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModel();
              				incompleteObjects.push(element);
              			}
              			if (a0_0 != null) {
              				if (a0_0 != null) {
              					Object value = a0_0;
              					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODEL__MODULE), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_0_0_0_0, a0_0, true);
              				copyLocalizationInfos(a0_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_1, 1);
              	
            }
            a1=(Token)match(input,8,FOLLOW_8_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model137); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_0_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_2, 2);
              	
            }
            a2=(Token)match(input,9,FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model151); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_0_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_3, 3, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_1);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_4, 3);
              	
            }
            // Edelta.g:601:2: ( ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Edelta.g:602:3: ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType ) )
            	    {
            	    // Edelta.g:602:3: ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType ) )
            	    // Edelta.g:603:4: (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType )
            	    {
            	    // Edelta.g:603:4: (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType )
            	    // Edelta.g:604:5: a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType
            	    {
            	    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model180);
            	    a3_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModel();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a3_0 != null) {
            	      						if (a3_0 != null) {
            	      							Object value = a3_0;
            	      							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODEL__DATATYPES, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_0_0_0_6_0_0_0, a3_0, true);
            	      						copyLocalizationInfos(a3_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_3, 4, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_1);
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_4, 4);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_3, 5, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_1);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_4, 5);
              	
            }
            a4=(Token)match(input,10,FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model221); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_0_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 6, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
              	
            }
            // Edelta.g:652:2: ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Edelta.g:653:3: ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package ) )
            	    {
            	    // Edelta.g:653:3: ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package ) )
            	    // Edelta.g:654:4: (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package )
            	    {
            	    // Edelta.g:654:4: (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package )
            	    // Edelta.g:655:5: a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package
            	    {
            	    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model250);
            	    a5_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModel();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a5_0 != null) {
            	      						if (a5_0 != null) {
            	      							Object value = a5_0;
            	      							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODEL__PACKAGEOPERATIONS, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_0_0_0_8_0_0_0, a5_0, true);
            	      						copyLocalizationInfos(a5_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 7, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 8, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType"
    // Edelta.g:689:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType returns [it.univaq.coevolution.emftext.edelta.language.edelta.DataType element = null] : a0= 'datatype' (a1= TEXT ) ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.DataType parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.DataType element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Edelta.g:692:1: (a0= 'datatype' (a1= TEXT ) )
            // Edelta.g:693:2: a0= 'datatype' (a1= TEXT )
            {
            a0=(Token)match(input,11,FOLLOW_11_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType306); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createDataType();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_1_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_6, 9);
              	
            }
            // Edelta.g:707:2: (a1= TEXT )
            // Edelta.g:708:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType324); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
              			}
              			if (element == null) {
              				element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createDataType();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DATA_TYPE__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DATA_TYPE__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_1_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_3, 10, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_1);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_4, 10);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module"
    // Edelta.g:746:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module returns [it.univaq.coevolution.emftext.edelta.language.edelta.Module element = null] : a0= 'module' (a1= TEXT ) a2= ';' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.Module parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.Module element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Edelta.g:749:1: (a0= 'module' (a1= TEXT ) a2= ';' )
            // Edelta.g:750:2: a0= 'module' (a1= TEXT ) a2= ';'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module360); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModule();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_2_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_7, 11);
              	
            }
            // Edelta.g:764:2: (a1= TEXT )
            // Edelta.g:765:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module378); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
              			}
              			if (element == null) {
              				element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModule();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODULE__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODULE__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_2_0_0_1, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_8, 12);
              	
            }
            a2=(Token)match(input,13,FOLLOW_13_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module399); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModule();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_2_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_1, 13);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage"
    // Edelta.g:816:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage returns [it.univaq.coevolution.emftext.edelta.language.edelta.addPackage element = null] : a0= 'addPackage' a1= '(' ( (a2= QUOTED_34_34 ) ) a3= ')' a4= '{' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) ) )* a7= '}' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.addPackage parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.addPackage element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a7=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Setter a5_0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.Class a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Edelta.g:819:1: (a0= 'addPackage' a1= '(' ( (a2= QUOTED_34_34 ) ) a3= ')' a4= '{' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) ) )* a7= '}' )
            // Edelta.g:820:2: a0= 'addPackage' a1= '(' ( (a2= QUOTED_34_34 ) ) a3= ')' a4= '{' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) ) )* a7= '}'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage428); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddPackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_3_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_10, 14);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage442); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddPackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_3_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_11, 15);
              	
            }
            // Edelta.g:848:2: ( (a2= QUOTED_34_34 ) )
            // Edelta.g:849:3: (a2= QUOTED_34_34 )
            {
            // Edelta.g:849:3: (a2= QUOTED_34_34 )
            // Edelta.g:850:4: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage465); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              				if (terminateParsing) {
              					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
              				}
              				if (element == null) {
              					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddPackage();
              					incompleteObjects.push(element);
              				}
              				if (a2 != null) {
              					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              					tokenResolver.setOptions(getOptions());
              					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
              					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_PACKAGE__NAME), result);
              					Object resolvedObject = result.getResolvedToken();
              					if (resolvedObject == null) {
              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              					}
              					java.lang.String resolved = (java.lang.String) resolvedObject;
              					if (resolved != null) {
              						Object value = resolved;
              						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_PACKAGE__NAME), value);
              						completedElement(value, false);
              					}
              					collectHiddenTokens(element);
              					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_3_0_0_3_0_0_0, resolved, true);
              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              				}
              			
            }

            }

            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_12, 16);
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_12, 17);
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage499); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddPackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_3_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_13, 18);
              	
            }
            a4=(Token)match(input,9,FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage513); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddPackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_3_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 19, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 19, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 19);
              	
            }
            // Edelta.g:921:2: ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21||LA4_0==33) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Edelta.g:922:3: ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) )
            	    {
            	    // Edelta.g:922:3: ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==33) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==21) ) {
            	        alt3=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // Edelta.g:923:4: (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	            {
            	            // Edelta.g:923:4: (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	            // Edelta.g:924:5: a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter
            	            {
            	            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage542);
            	            a5_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddPackage();
            	              						incompleteObjects.push(element);
            	              					}
            	              					if (a5_0 != null) {
            	              						if (a5_0 != null) {
            	              							Object value = a5_0;
            	              							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_PACKAGE__SETTER, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_3_0_0_6_0_0_1, a5_0, true);
            	              						copyLocalizationInfos(a5_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 20, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 20, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 20);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Edelta.g:952:8: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class )
            	            {
            	            // Edelta.g:952:8: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class )
            	            // Edelta.g:953:5: a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class
            	            {
            	            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage584);
            	            a6_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddPackage();
            	              						incompleteObjects.push(element);
            	              					}
            	              					if (a6_0 != null) {
            	              						if (a6_0 != null) {
            	              							Object value = a6_0;
            	              							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_PACKAGE__CLASSESOPERATIONS, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_3_0_0_6_0_1_1, a6_0, true);
            	              						copyLocalizationInfos(a6_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 21, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 21, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 21);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 22, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 22, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 22);
              	
            }
            a7=(Token)match(input,10,FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage625); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddPackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_3_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 23, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage"
    // Edelta.g:1005:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage returns [it.univaq.coevolution.emftext.edelta.language.edelta.changePackage element = null] : a0= 'changePackage' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) ) )* a8= '}' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.changePackage parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.changePackage element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a8=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Setter a6_0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.Class a7_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Edelta.g:1008:1: (a0= 'changePackage' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) ) )* a8= '}' )
            // Edelta.g:1009:2: a0= 'changePackage' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) ) )* a8= '}'
            {
            a0=(Token)match(input,17,FOLLOW_17_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage654); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_18, 24);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage668); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_19, 25);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_20, 25);
              	
            }
            // Edelta.g:1038:2: ( (a2= QUOTED_34_34 ) | (a3= TEXT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==QUOTED_34_34) ) {
                alt5=1;
            }
            else if ( (LA5_0==TEXT) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Edelta.g:1039:3: (a2= QUOTED_34_34 )
                    {
                    // Edelta.g:1039:3: (a2= QUOTED_34_34 )
                    // Edelta.g:1040:4: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage691); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__EXT), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__EXT), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_3_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_21, 26);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:1076:6: (a3= TEXT )
                    {
                    // Edelta.g:1076:6: (a3= TEXT )
                    // Edelta.g:1077:4: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage729); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__REF), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      					}
                      					String resolved = (String) resolvedObject;
                      					it.univaq.coevolution.emftext.edelta.language.edelta.Package proxy = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createPackage();
                      					collectHiddenTokens(element);
                      					registerContextDependentProxy(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaContextDependentURIFragmentFactory<it.univaq.coevolution.emftext.edelta.language.edelta.changePackage, it.univaq.coevolution.emftext.edelta.language.edelta.Package>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getchangePackageRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__REF), resolved, proxy);
                      					if (proxy != null) {
                      						Object value = proxy;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__REF), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_3_0_1_0, proxy, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_21, 27);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_21, 28);
              	
            }
            a4=(Token)match(input,16,FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage763); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_22, 29);
              	
            }
            a5=(Token)match(input,9,FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage777); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 30, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 30, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 30);
              	
            }
            // Edelta.g:1152:2: ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21||LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Edelta.g:1153:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) )
            	    {
            	    // Edelta.g:1153:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==33) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==21) ) {
            	        alt6=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // Edelta.g:1154:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	            {
            	            // Edelta.g:1154:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	            // Edelta.g:1155:5: a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter
            	            {
            	            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage806);
            	            a6_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
            	              						incompleteObjects.push(element);
            	              					}
            	              					if (a6_0 != null) {
            	              						if (a6_0 != null) {
            	              							Object value = a6_0;
            	              							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__SETTER, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_6_0_0_1, a6_0, true);
            	              						copyLocalizationInfos(a6_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 31, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 31, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 31);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Edelta.g:1183:8: (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class )
            	            {
            	            // Edelta.g:1183:8: (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class )
            	            // Edelta.g:1184:5: a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class
            	            {
            	            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage848);
            	            a7_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
            	              						incompleteObjects.push(element);
            	              					}
            	              					if (a7_0 != null) {
            	              						if (a7_0 != null) {
            	              							Object value = a7_0;
            	              							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__CLASSESOPERATIONS, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_6_0_1_1, a7_0, true);
            	              						copyLocalizationInfos(a7_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 32, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 32, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 32);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 33, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 33, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 33);
              	
            }
            a8=(Token)match(input,10,FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage889); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 34, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage"
    // Edelta.g:1236:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage returns [it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage element = null] : a0= 'deletePackage' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) ) )* a8= '}' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a8=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Setter a6_0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.Class a7_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Edelta.g:1239:1: (a0= 'deletePackage' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) ) )* a8= '}' )
            // Edelta.g:1240:2: a0= 'deletePackage' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) ) )* a8= '}'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage918); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_25, 35);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage932); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_26, 36);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_27, 36);
              	
            }
            // Edelta.g:1269:2: ( (a2= QUOTED_34_34 ) | (a3= TEXT ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==QUOTED_34_34) ) {
                alt8=1;
            }
            else if ( (LA8_0==TEXT) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // Edelta.g:1270:3: (a2= QUOTED_34_34 )
                    {
                    // Edelta.g:1270:3: (a2= QUOTED_34_34 )
                    // Edelta.g:1271:4: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage955); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__EXT), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__EXT), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_3_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_28, 37);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:1307:6: (a3= TEXT )
                    {
                    // Edelta.g:1307:6: (a3= TEXT )
                    // Edelta.g:1308:4: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage993); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__REF), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      					}
                      					String resolved = (String) resolvedObject;
                      					it.univaq.coevolution.emftext.edelta.language.edelta.Package proxy = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createPackage();
                      					collectHiddenTokens(element);
                      					registerContextDependentProxy(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaContextDependentURIFragmentFactory<it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage, it.univaq.coevolution.emftext.edelta.language.edelta.Package>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getdeletePackageRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__REF), resolved, proxy);
                      					if (proxy != null) {
                      						Object value = proxy;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__REF), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_3_0_1_0, proxy, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_28, 38);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_28, 39);
              	
            }
            a4=(Token)match(input,16,FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage1027); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_29, 40);
              	
            }
            a5=(Token)match(input,9,FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage1041); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 41, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 41, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 41);
              	
            }
            // Edelta.g:1383:2: ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21||LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Edelta.g:1384:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) )
            	    {
            	    // Edelta.g:1384:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==33) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==21) ) {
            	        alt9=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // Edelta.g:1385:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	            {
            	            // Edelta.g:1385:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	            // Edelta.g:1386:5: a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter
            	            {
            	            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage1070);
            	            a6_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
            	              						incompleteObjects.push(element);
            	              					}
            	              					if (a6_0 != null) {
            	              						if (a6_0 != null) {
            	              							Object value = a6_0;
            	              							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__SETTER, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_6_0_0_1, a6_0, true);
            	              						copyLocalizationInfos(a6_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 42, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 42, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 42);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Edelta.g:1414:8: (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class )
            	            {
            	            // Edelta.g:1414:8: (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class )
            	            // Edelta.g:1415:5: a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class
            	            {
            	            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage1112);
            	            a7_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
            	              						incompleteObjects.push(element);
            	              					}
            	              					if (a7_0 != null) {
            	              						if (a7_0 != null) {
            	              							Object value = a7_0;
            	              							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__CLASSESOPERATIONS, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_6_0_1_1, a7_0, true);
            	              						copyLocalizationInfos(a7_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 43, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 43, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 43);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 44, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 44, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 44);
              	
            }
            a8=(Token)match(input,10,FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage1153); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 45, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package"
    // Edelta.g:1467:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package returns [it.univaq.coevolution.emftext.edelta.language.edelta.Package element = null] : a0= 'package' (a1= TEXT ) ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation ) ) ) )? ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.Package parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.Package element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Edelta.g:1470:1: (a0= 'package' (a1= TEXT ) ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation ) ) ) )? )
            // Edelta.g:1471:2: a0= 'package' (a1= TEXT ) ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation ) ) ) )?
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package1182); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createPackage();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_6_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_31, 46);
              	
            }
            // Edelta.g:1485:2: (a1= TEXT )
            // Edelta.g:1486:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package1200); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
              			}
              			if (element == null) {
              				element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createPackage();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PACKAGE__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PACKAGE__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_6_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_32, 47);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 47, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
              	
            }
            // Edelta.g:1522:2: ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation ) ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Edelta.g:1523:3: (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation ) ) )
                    {
                    // Edelta.g:1523:3: (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation ) ) )
                    // Edelta.g:1524:4: a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation ) )
                    {
                    a2=(Token)match(input,20,FOLLOW_20_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package1230); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createPackage();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_6_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_9, 48, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_5);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_17, 48, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_5);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_24, 48, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_5);
                      			
                    }
                    // Edelta.g:1540:4: ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation ) )
                    // Edelta.g:1541:5: (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation )
                    {
                    // Edelta.g:1541:5: (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation )
                    // Edelta.g:1542:6: a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package1263);
                    a3_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      						if (terminateParsing) {
                      							throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      						}
                      						if (element == null) {
                      							element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createPackage();
                      							incompleteObjects.push(element);
                      						}
                      						if (a3_0 != null) {
                      							if (a3_0 != null) {
                      								Object value = a3_0;
                      								element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PACKAGE__PACKAGE_OP), value);
                      								completedElement(value, true);
                      							}
                      							collectHiddenTokens(element);
                      							retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_6_0_0_3_0_0_1_0_0_0, a3_0, true);
                      							copyLocalizationInfos(a3_0, element);
                      						}
                      					
                    }

                    }

                    if ( state.backtracking==0 ) {

                      					// expected elements (follow set)
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 49, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 50, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 51, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class"
    // Edelta.g:1582:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class returns [it.univaq.coevolution.emftext.edelta.language.edelta.Class element = null] : a0= 'class' (a1= TEXT ) ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation ) ) ) )? ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.Class parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.Class element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Edelta.g:1585:1: (a0= 'class' (a1= TEXT ) ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation ) ) ) )? )
            // Edelta.g:1586:2: a0= 'class' (a1= TEXT ) ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation ) ) ) )?
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class1337); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_7_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_33, 52);
              	
            }
            // Edelta.g:1600:2: (a1= TEXT )
            // Edelta.g:1601:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class1355); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
              			}
              			if (element == null) {
              				element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createClass();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CLASS__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CLASS__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_7_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_34, 53);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 53, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 53, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 53);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 53);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 53);
              	
            }
            // Edelta.g:1641:2: ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation ) ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Edelta.g:1642:3: (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation ) ) )
                    {
                    // Edelta.g:1642:3: (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation ) ) )
                    // Edelta.g:1643:4: a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation ) )
                    {
                    a2=(Token)match(input,20,FOLLOW_20_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class1385); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createClass();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_7_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_35, 54, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_6);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_36, 54, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_6);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_37, 54, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_6);
                      			
                    }
                    // Edelta.g:1659:4: ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation ) )
                    // Edelta.g:1660:5: (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation )
                    {
                    // Edelta.g:1660:5: (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation )
                    // Edelta.g:1661:6: a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class1418);
                    a3_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      						if (terminateParsing) {
                      							throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      						}
                      						if (element == null) {
                      							element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createClass();
                      							incompleteObjects.push(element);
                      						}
                      						if (a3_0 != null) {
                      							if (a3_0 != null) {
                      								Object value = a3_0;
                      								element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CLASS__CLASS_OP), value);
                      								completedElement(value, true);
                      							}
                      							collectHiddenTokens(element);
                      							retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_7_0_0_3_0_0_1_0_0_0, a3_0, true);
                      							copyLocalizationInfos(a3_0, element);
                      						}
                      					
                    }

                    }

                    if ( state.backtracking==0 ) {

                      					// expected elements (follow set)
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 55, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 55, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 55);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 55);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 55);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 56, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 56, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 56);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 56);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 56);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 57, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 57, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 57);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 57);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 57);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass"
    // Edelta.g:1713:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass returns [it.univaq.coevolution.emftext.edelta.language.edelta.addClass element = null] : a0= 'addClass' a1= '(' ( (a2= QUOTED_34_34 ) ) a3= ')' a4= '{' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) ) )* a7= '}' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.addClass parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.addClass element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a7=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Setter a5_0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.Feature a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Edelta.g:1716:1: (a0= 'addClass' a1= '(' ( (a2= QUOTED_34_34 ) ) a3= ')' a4= '{' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) ) )* a7= '}' )
            // Edelta.g:1717:2: a0= 'addClass' a1= '(' ( (a2= QUOTED_34_34 ) ) a3= ')' a4= '{' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) ) )* a7= '}'
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1492); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_8_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_38, 58);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1506); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_8_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_39, 59);
              	
            }
            // Edelta.g:1745:2: ( (a2= QUOTED_34_34 ) )
            // Edelta.g:1746:3: (a2= QUOTED_34_34 )
            {
            // Edelta.g:1746:3: (a2= QUOTED_34_34 )
            // Edelta.g:1747:4: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1529); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              				if (terminateParsing) {
              					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
              				}
              				if (element == null) {
              					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddClass();
              					incompleteObjects.push(element);
              				}
              				if (a2 != null) {
              					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              					tokenResolver.setOptions(getOptions());
              					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
              					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_CLASS__NAME), result);
              					Object resolvedObject = result.getResolvedToken();
              					if (resolvedObject == null) {
              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              					}
              					java.lang.String resolved = (java.lang.String) resolvedObject;
              					if (resolved != null) {
              						Object value = resolved;
              						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_CLASS__NAME), value);
              						completedElement(value, false);
              					}
              					collectHiddenTokens(element);
              					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_8_0_0_3_0_0_0, resolved, true);
              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              				}
              			
            }

            }

            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_40, 60);
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_40, 61);
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1563); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_8_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_41, 62);
              	
            }
            a4=(Token)match(input,9,FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1577); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_8_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 63, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 63, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 63, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 63);
              	
            }
            // Edelta.g:1819:2: ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=31 && LA14_0<=33)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Edelta.g:1820:3: ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) )
            	    {
            	    // Edelta.g:1820:3: ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==33) ) {
            	        alt13=1;
            	    }
            	    else if ( ((LA13_0>=31 && LA13_0<=32)) ) {
            	        alt13=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // Edelta.g:1821:4: (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	            {
            	            // Edelta.g:1821:4: (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	            // Edelta.g:1822:5: a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter
            	            {
            	            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1606);
            	            a5_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddClass();
            	              						incompleteObjects.push(element);
            	              					}
            	              					if (a5_0 != null) {
            	              						if (a5_0 != null) {
            	              							Object value = a5_0;
            	              							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_CLASS__SETTER, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_8_0_0_6_0_0_1, a5_0, true);
            	              						copyLocalizationInfos(a5_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 64, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 64, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 64, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 64);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Edelta.g:1851:8: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature )
            	            {
            	            // Edelta.g:1851:8: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature )
            	            // Edelta.g:1852:5: a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature
            	            {
            	            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1648);
            	            a6_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddClass();
            	              						incompleteObjects.push(element);
            	              					}
            	              					if (a6_0 != null) {
            	              						if (a6_0 != null) {
            	              							Object value = a6_0;
            	              							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_CLASS__FEATURESOPERATIONS, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_8_0_0_6_0_1_1, a6_0, true);
            	              						copyLocalizationInfos(a6_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 65, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 65, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 65, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 65);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 66, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 66, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 66, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 66);
              	
            }
            a7=(Token)match(input,10,FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1689); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_8_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 67, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 67, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 67);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 67);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 67);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass"
    // Edelta.g:1910:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass returns [it.univaq.coevolution.emftext.edelta.language.edelta.changeClass element = null] : a0= 'changeClass' a1= '(' ( (a2= TEXT ) | (a3= QUOTED_34_34 ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) ) )* a8= '}' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.changeClass parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.changeClass element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a8=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Setter a6_0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.Feature a7_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Edelta.g:1913:1: (a0= 'changeClass' a1= '(' ( (a2= TEXT ) | (a3= QUOTED_34_34 ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) ) )* a8= '}' )
            // Edelta.g:1914:2: a0= 'changeClass' a1= '(' ( (a2= TEXT ) | (a3= QUOTED_34_34 ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) ) )* a8= '}'
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1718); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_45, 68);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1732); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_46, 69);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_47, 69);
              	
            }
            // Edelta.g:1943:2: ( (a2= TEXT ) | (a3= QUOTED_34_34 ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==TEXT) ) {
                alt15=1;
            }
            else if ( (LA15_0==QUOTED_34_34) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // Edelta.g:1944:3: (a2= TEXT )
                    {
                    // Edelta.g:1944:3: (a2= TEXT )
                    // Edelta.g:1945:4: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1755); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__EXT), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__EXT), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_3_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_48, 70);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:1981:6: (a3= QUOTED_34_34 )
                    {
                    // Edelta.g:1981:6: (a3= QUOTED_34_34 )
                    // Edelta.g:1982:4: a3= QUOTED_34_34
                    {
                    a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1793); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__REF), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      					}
                      					String resolved = (String) resolvedObject;
                      					it.univaq.coevolution.emftext.edelta.language.edelta.Class proxy = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createClass();
                      					collectHiddenTokens(element);
                      					registerContextDependentProxy(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaContextDependentURIFragmentFactory<it.univaq.coevolution.emftext.edelta.language.edelta.changeClass, it.univaq.coevolution.emftext.edelta.language.edelta.Class>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getchangeClassRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__REF), resolved, proxy);
                      					if (proxy != null) {
                      						Object value = proxy;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__REF), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_3_0_1_0, proxy, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_48, 71);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_48, 72);
              	
            }
            a4=(Token)match(input,16,FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1827); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_49, 73);
              	
            }
            a5=(Token)match(input,9,FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1841); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 74, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 74, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 74, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 74);
              	
            }
            // Edelta.g:2058:2: ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=31 && LA17_0<=33)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Edelta.g:2059:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) )
            	    {
            	    // Edelta.g:2059:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==33) ) {
            	        alt16=1;
            	    }
            	    else if ( ((LA16_0>=31 && LA16_0<=32)) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // Edelta.g:2060:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	            {
            	            // Edelta.g:2060:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	            // Edelta.g:2061:5: a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter
            	            {
            	            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1870);
            	            a6_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
            	              						incompleteObjects.push(element);
            	              					}
            	              					if (a6_0 != null) {
            	              						if (a6_0 != null) {
            	              							Object value = a6_0;
            	              							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__SETTER, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_6_0_0_1, a6_0, true);
            	              						copyLocalizationInfos(a6_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 75, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 75, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 75, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 75);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Edelta.g:2090:8: (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature )
            	            {
            	            // Edelta.g:2090:8: (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature )
            	            // Edelta.g:2091:5: a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature
            	            {
            	            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1912);
            	            a7_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
            	              						incompleteObjects.push(element);
            	              					}
            	              					if (a7_0 != null) {
            	              						if (a7_0 != null) {
            	              							Object value = a7_0;
            	              							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__FEATURESOPERATIONS, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_6_0_1_1, a7_0, true);
            	              						copyLocalizationInfos(a7_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 76, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 76, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 76, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 76);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 77, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 77, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 77, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 77);
              	
            }
            a8=(Token)match(input,10,FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1953); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 78, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 78, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 78);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 78);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 78);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass"
    // Edelta.g:2149:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass returns [it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass element = null] : a0= 'deleteClass' a1= '(' ( (a2= TEXT ) | (a3= QUOTED_34_34 ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) ) )* a8= '}' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a8=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Setter a6_0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.Feature a7_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Edelta.g:2152:1: (a0= 'deleteClass' a1= '(' ( (a2= TEXT ) | (a3= QUOTED_34_34 ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) ) )* a8= '}' )
            // Edelta.g:2153:2: a0= 'deleteClass' a1= '(' ( (a2= TEXT ) | (a3= QUOTED_34_34 ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) ) )* a8= '}'
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass1982); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_51, 79);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass1996); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_52, 80);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_53, 80);
              	
            }
            // Edelta.g:2182:2: ( (a2= TEXT ) | (a3= QUOTED_34_34 ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==TEXT) ) {
                alt18=1;
            }
            else if ( (LA18_0==QUOTED_34_34) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // Edelta.g:2183:3: (a2= TEXT )
                    {
                    // Edelta.g:2183:3: (a2= TEXT )
                    // Edelta.g:2184:4: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2019); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__EXT), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__EXT), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_3_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_54, 81);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:2220:6: (a3= QUOTED_34_34 )
                    {
                    // Edelta.g:2220:6: (a3= QUOTED_34_34 )
                    // Edelta.g:2221:4: a3= QUOTED_34_34
                    {
                    a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2057); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__REF), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      					}
                      					String resolved = (String) resolvedObject;
                      					it.univaq.coevolution.emftext.edelta.language.edelta.Class proxy = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createClass();
                      					collectHiddenTokens(element);
                      					registerContextDependentProxy(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaContextDependentURIFragmentFactory<it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass, it.univaq.coevolution.emftext.edelta.language.edelta.Class>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getdeleteClassRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__REF), resolved, proxy);
                      					if (proxy != null) {
                      						Object value = proxy;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__REF), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_3_0_1_0, proxy, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_54, 82);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_54, 83);
              	
            }
            a4=(Token)match(input,16,FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2091); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_55, 84);
              	
            }
            a5=(Token)match(input,9,FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2105); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 85, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 85, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 85, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 85);
              	
            }
            // Edelta.g:2297:2: ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=31 && LA20_0<=33)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Edelta.g:2298:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) )
            	    {
            	    // Edelta.g:2298:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) | (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==33) ) {
            	        alt19=1;
            	    }
            	    else if ( ((LA19_0>=31 && LA19_0<=32)) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // Edelta.g:2299:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	            {
            	            // Edelta.g:2299:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	            // Edelta.g:2300:5: a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter
            	            {
            	            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2134);
            	            a6_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
            	              						incompleteObjects.push(element);
            	              					}
            	              					if (a6_0 != null) {
            	              						if (a6_0 != null) {
            	              							Object value = a6_0;
            	              							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__SETTER, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_6_0_0_1, a6_0, true);
            	              						copyLocalizationInfos(a6_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 86, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 86, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 86, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 86);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Edelta.g:2329:8: (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature )
            	            {
            	            // Edelta.g:2329:8: (a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature )
            	            // Edelta.g:2330:5: a7_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature
            	            {
            	            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2176);
            	            a7_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
            	              						incompleteObjects.push(element);
            	              					}
            	              					if (a7_0 != null) {
            	              						if (a7_0 != null) {
            	              							Object value = a7_0;
            	              							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__FEATURESOPERATIONS, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_6_0_1_1, a7_0, true);
            	              						copyLocalizationInfos(a7_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 87, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 87, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 87, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
            	              				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 87);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 88, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 88, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 88, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 88);
              	
            }
            a8=(Token)match(input,10,FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2217); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 89, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 89, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 89);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 89);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 89);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute"
    // Edelta.g:2388:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute returns [it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute element = null] : a0= 'addAttribute' a1= '(' ( (a2= QUOTED_34_34 ) ) a3= ')' a4= '{' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a6= '}' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Setter a5_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // Edelta.g:2391:1: (a0= 'addAttribute' a1= '(' ( (a2= QUOTED_34_34 ) ) a3= ')' a4= '{' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a6= '}' )
            // Edelta.g:2392:2: a0= 'addAttribute' a1= '(' ( (a2= QUOTED_34_34 ) ) a3= ')' a4= '{' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a6= '}'
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2246); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_11_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_58, 90);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2260); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_11_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_59, 91);
              	
            }
            // Edelta.g:2420:2: ( (a2= QUOTED_34_34 ) )
            // Edelta.g:2421:3: (a2= QUOTED_34_34 )
            {
            // Edelta.g:2421:3: (a2= QUOTED_34_34 )
            // Edelta.g:2422:4: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2283); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              				if (terminateParsing) {
              					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
              				}
              				if (element == null) {
              					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddAttribute();
              					incompleteObjects.push(element);
              				}
              				if (a2 != null) {
              					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              					tokenResolver.setOptions(getOptions());
              					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
              					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_ATTRIBUTE__NAME), result);
              					Object resolvedObject = result.getResolvedToken();
              					if (resolvedObject == null) {
              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              					}
              					java.lang.String resolved = (java.lang.String) resolvedObject;
              					if (resolved != null) {
              						Object value = resolved;
              						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_ATTRIBUTE__NAME), value);
              						completedElement(value, false);
              					}
              					collectHiddenTokens(element);
              					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_11_0_0_3_0_0_0, resolved, true);
              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              				}
              			
            }

            }

            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_60, 92);
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_60, 93);
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2317); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_11_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_61, 94);
              	
            }
            a4=(Token)match(input,9,FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2331); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_11_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 95, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_62, 95);
              	
            }
            // Edelta.g:2492:2: ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Edelta.g:2493:3: ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) )
            	    {
            	    // Edelta.g:2493:3: ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) )
            	    // Edelta.g:2494:4: (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	    {
            	    // Edelta.g:2494:4: (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	    // Edelta.g:2495:5: a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter
            	    {
            	    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2360);
            	    a5_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddAttribute();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a5_0 != null) {
            	      						if (a5_0 != null) {
            	      							Object value = a5_0;
            	      							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_ATTRIBUTE__SETTER, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_11_0_0_6_0_0_1, a5_0, true);
            	      						copyLocalizationInfos(a5_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 96, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_62, 96);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 97, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_62, 97);
              	
            }
            a6=(Token)match(input,10,FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2401); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_11_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 98, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 98, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 98, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 98);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 98);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 98);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute"
    // Edelta.g:2550:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute returns [it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute element = null] : a0= 'deleteAttribute' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a7= '}' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Setter a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Edelta.g:2553:1: (a0= 'deleteAttribute' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a7= '}' )
            // Edelta.g:2554:2: a0= 'deleteAttribute' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a7= '}'
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2430); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_12_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_64, 99);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2444); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_12_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_65, 100);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_66, 100);
              	
            }
            // Edelta.g:2583:2: ( (a2= QUOTED_34_34 ) | (a3= TEXT ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==QUOTED_34_34) ) {
                alt22=1;
            }
            else if ( (LA22_0==TEXT) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // Edelta.g:2584:3: (a2= QUOTED_34_34 )
                    {
                    // Edelta.g:2584:3: (a2= QUOTED_34_34 )
                    // Edelta.g:2585:4: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2467); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteAttribute();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__EXT), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__EXT), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_12_0_0_3_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_67, 101);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:2621:6: (a3= TEXT )
                    {
                    // Edelta.g:2621:6: (a3= TEXT )
                    // Edelta.g:2622:4: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2505); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteAttribute();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__REF), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      					}
                      					String resolved = (String) resolvedObject;
                      					it.univaq.coevolution.emftext.edelta.language.edelta.Attribute proxy = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createAttribute();
                      					collectHiddenTokens(element);
                      					registerContextDependentProxy(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaContextDependentURIFragmentFactory<it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute, it.univaq.coevolution.emftext.edelta.language.edelta.Attribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getdeleteAttributeRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__REF), resolved, proxy);
                      					if (proxy != null) {
                      						Object value = proxy;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__REF), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_12_0_0_3_0_1_0, proxy, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_67, 102);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_67, 103);
              	
            }
            a4=(Token)match(input,16,FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2539); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_12_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_68, 104);
              	
            }
            a5=(Token)match(input,9,FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2553); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_12_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 105, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_69, 105);
              	
            }
            // Edelta.g:2696:2: ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Edelta.g:2697:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) )
            	    {
            	    // Edelta.g:2697:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) )
            	    // Edelta.g:2698:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	    {
            	    // Edelta.g:2698:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	    // Edelta.g:2699:5: a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter
            	    {
            	    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2582);
            	    a6_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteAttribute();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a6_0 != null) {
            	      						if (a6_0 != null) {
            	      							Object value = a6_0;
            	      							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__SETTER, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_12_0_0_6_0_0_1, a6_0, true);
            	      						copyLocalizationInfos(a6_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 106, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_69, 106);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 107, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_69, 107);
              	
            }
            a7=(Token)match(input,10,FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2623); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_12_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 108, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 108, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 108, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 108);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 108);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 108);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute"
    // Edelta.g:2754:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute returns [it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute element = null] : a0= 'changeAttribute' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a7= '}' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Setter a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // Edelta.g:2757:1: (a0= 'changeAttribute' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a7= '}' )
            // Edelta.g:2758:2: a0= 'changeAttribute' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a7= '}'
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2652); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_13_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_71, 109);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2666); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_13_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_72, 110);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_73, 110);
              	
            }
            // Edelta.g:2787:2: ( (a2= QUOTED_34_34 ) | (a3= TEXT ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==QUOTED_34_34) ) {
                alt24=1;
            }
            else if ( (LA24_0==TEXT) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // Edelta.g:2788:3: (a2= QUOTED_34_34 )
                    {
                    // Edelta.g:2788:3: (a2= QUOTED_34_34 )
                    // Edelta.g:2789:4: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2689); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeAttribute();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__EXT), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__EXT), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_13_0_0_3_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_74, 111);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:2825:6: (a3= TEXT )
                    {
                    // Edelta.g:2825:6: (a3= TEXT )
                    // Edelta.g:2826:4: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2727); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeAttribute();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__REF), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      					}
                      					String resolved = (String) resolvedObject;
                      					it.univaq.coevolution.emftext.edelta.language.edelta.Attribute proxy = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createAttribute();
                      					collectHiddenTokens(element);
                      					registerContextDependentProxy(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaContextDependentURIFragmentFactory<it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute, it.univaq.coevolution.emftext.edelta.language.edelta.Attribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getchangeAttributeRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__REF), resolved, proxy);
                      					if (proxy != null) {
                      						Object value = proxy;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__REF), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_13_0_0_3_0_1_0, proxy, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_74, 112);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_74, 113);
              	
            }
            a4=(Token)match(input,16,FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2761); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_13_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_75, 114);
              	
            }
            a5=(Token)match(input,9,FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2775); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_13_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 115, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_76, 115);
              	
            }
            // Edelta.g:2900:2: ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Edelta.g:2901:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) )
            	    {
            	    // Edelta.g:2901:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) )
            	    // Edelta.g:2902:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	    {
            	    // Edelta.g:2902:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	    // Edelta.g:2903:5: a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter
            	    {
            	    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2804);
            	    a6_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeAttribute();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a6_0 != null) {
            	      						if (a6_0 != null) {
            	      							Object value = a6_0;
            	      							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__SETTER, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_13_0_0_6_0_0_1, a6_0, true);
            	      						copyLocalizationInfos(a6_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 116, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_76, 116);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 117, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_76, 117);
              	
            }
            a7=(Token)match(input,10,FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2845); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_13_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 118, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 118, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 118, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 118);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 118);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 118);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference"
    // Edelta.g:2958:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference returns [it.univaq.coevolution.emftext.edelta.language.edelta.addReference element = null] : a0= 'addReference' a1= '(' ( (a2= QUOTED_34_34 ) ) a3= ')' a4= '{' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a6= '}' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.addReference parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.addReference element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Setter a5_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // Edelta.g:2961:1: (a0= 'addReference' a1= '(' ( (a2= QUOTED_34_34 ) ) a3= ')' a4= '{' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a6= '}' )
            // Edelta.g:2962:2: a0= 'addReference' a1= '(' ( (a2= QUOTED_34_34 ) ) a3= ')' a4= '{' ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a6= '}'
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference2874); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_14_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_78, 119);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference2888); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_14_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_79, 120);
              	
            }
            // Edelta.g:2990:2: ( (a2= QUOTED_34_34 ) )
            // Edelta.g:2991:3: (a2= QUOTED_34_34 )
            {
            // Edelta.g:2991:3: (a2= QUOTED_34_34 )
            // Edelta.g:2992:4: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference2911); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              				if (terminateParsing) {
              					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
              				}
              				if (element == null) {
              					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddReference();
              					incompleteObjects.push(element);
              				}
              				if (a2 != null) {
              					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              					tokenResolver.setOptions(getOptions());
              					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
              					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_REFERENCE__NAME), result);
              					Object resolvedObject = result.getResolvedToken();
              					if (resolvedObject == null) {
              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              					}
              					java.lang.String resolved = (java.lang.String) resolvedObject;
              					if (resolved != null) {
              						Object value = resolved;
              						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_REFERENCE__NAME), value);
              						completedElement(value, false);
              					}
              					collectHiddenTokens(element);
              					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_14_0_0_3_0_0_0, resolved, true);
              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              				}
              			
            }

            }

            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_80, 121);
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_80, 122);
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference2945); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_14_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_81, 123);
              	
            }
            a4=(Token)match(input,9,FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference2959); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_14_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 124, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_82, 124);
              	
            }
            // Edelta.g:3062:2: ( ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Edelta.g:3063:3: ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) )
            	    {
            	    // Edelta.g:3063:3: ( (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) )
            	    // Edelta.g:3064:4: (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	    {
            	    // Edelta.g:3064:4: (a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	    // Edelta.g:3065:5: a5_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter
            	    {
            	    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference2988);
            	    a5_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddReference();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a5_0 != null) {
            	      						if (a5_0 != null) {
            	      							Object value = a5_0;
            	      							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_REFERENCE__SETTER, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_14_0_0_6_0_0_1, a5_0, true);
            	      						copyLocalizationInfos(a5_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 125, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_82, 125);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 126, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_82, 126);
              	
            }
            a6=(Token)match(input,10,FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference3029); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_14_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 127, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 127, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 127, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 127);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 127);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 127);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference"
    // Edelta.g:3120:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference returns [it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference element = null] : a0= 'deleteReference' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a7= '}' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Setter a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // Edelta.g:3123:1: (a0= 'deleteReference' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a7= '}' )
            // Edelta.g:3124:2: a0= 'deleteReference' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a7= '}'
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3058); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_15_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_84, 128);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3072); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_15_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_85, 129);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_86, 129);
              	
            }
            // Edelta.g:3153:2: ( (a2= QUOTED_34_34 ) | (a3= TEXT ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==QUOTED_34_34) ) {
                alt27=1;
            }
            else if ( (LA27_0==TEXT) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // Edelta.g:3154:3: (a2= QUOTED_34_34 )
                    {
                    // Edelta.g:3154:3: (a2= QUOTED_34_34 )
                    // Edelta.g:3155:4: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3095); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteReference();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__EXT), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__EXT), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_15_0_0_3_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_87, 130);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:3191:6: (a3= TEXT )
                    {
                    // Edelta.g:3191:6: (a3= TEXT )
                    // Edelta.g:3192:4: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3133); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteReference();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__REF), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      					}
                      					String resolved = (String) resolvedObject;
                      					it.univaq.coevolution.emftext.edelta.language.edelta.Reference proxy = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createReference();
                      					collectHiddenTokens(element);
                      					registerContextDependentProxy(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaContextDependentURIFragmentFactory<it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference, it.univaq.coevolution.emftext.edelta.language.edelta.Reference>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getdeleteReferenceRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__REF), resolved, proxy);
                      					if (proxy != null) {
                      						Object value = proxy;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__REF), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_15_0_0_3_0_1_0, proxy, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_87, 131);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_87, 132);
              	
            }
            a4=(Token)match(input,16,FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3167); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_15_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_88, 133);
              	
            }
            a5=(Token)match(input,9,FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3181); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_15_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 134, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_89, 134);
              	
            }
            // Edelta.g:3266:2: ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==33) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Edelta.g:3267:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) )
            	    {
            	    // Edelta.g:3267:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) )
            	    // Edelta.g:3268:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	    {
            	    // Edelta.g:3268:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	    // Edelta.g:3269:5: a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter
            	    {
            	    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3210);
            	    a6_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteReference();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a6_0 != null) {
            	      						if (a6_0 != null) {
            	      							Object value = a6_0;
            	      							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__SETTER, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_15_0_0_6_0_0_1, a6_0, true);
            	      						copyLocalizationInfos(a6_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 135, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_89, 135);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 136, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_89, 136);
              	
            }
            a7=(Token)match(input,10,FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3251); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_15_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 137, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 137, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 137, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 137);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 137);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 137);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference"
    // Edelta.g:3324:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference returns [it.univaq.coevolution.emftext.edelta.language.edelta.changeReference element = null] : a0= 'changeReference' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a7= '}' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.changeReference parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.changeReference element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Setter a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // Edelta.g:3327:1: (a0= 'changeReference' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a7= '}' )
            // Edelta.g:3328:2: a0= 'changeReference' a1= '(' ( (a2= QUOTED_34_34 ) | (a3= TEXT ) ) a4= ')' a5= '{' ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )* a7= '}'
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3280); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_16_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_91, 138);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3294); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_16_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_92, 139);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_93, 139);
              	
            }
            // Edelta.g:3357:2: ( (a2= QUOTED_34_34 ) | (a3= TEXT ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==QUOTED_34_34) ) {
                alt29=1;
            }
            else if ( (LA29_0==TEXT) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // Edelta.g:3358:3: (a2= QUOTED_34_34 )
                    {
                    // Edelta.g:3358:3: (a2= QUOTED_34_34 )
                    // Edelta.g:3359:4: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3317); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeReference();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__EXT), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__EXT), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_16_0_0_3_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_94, 140);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:3395:6: (a3= TEXT )
                    {
                    // Edelta.g:3395:6: (a3= TEXT )
                    // Edelta.g:3396:4: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3355); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeReference();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__REF), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      					}
                      					String resolved = (String) resolvedObject;
                      					it.univaq.coevolution.emftext.edelta.language.edelta.Reference proxy = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createReference();
                      					collectHiddenTokens(element);
                      					registerContextDependentProxy(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaContextDependentURIFragmentFactory<it.univaq.coevolution.emftext.edelta.language.edelta.changeReference, it.univaq.coevolution.emftext.edelta.language.edelta.Reference>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getchangeReferenceRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__REF), resolved, proxy);
                      					if (proxy != null) {
                      						Object value = proxy;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__REF), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_16_0_0_3_0_1_0, proxy, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_94, 141);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_94, 142);
              	
            }
            a4=(Token)match(input,16,FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3389); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_16_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_95, 143);
              	
            }
            a5=(Token)match(input,9,FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3403); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_16_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 144, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_96, 144);
              	
            }
            // Edelta.g:3470:2: ( ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Edelta.g:3471:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) )
            	    {
            	    // Edelta.g:3471:3: ( (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter ) )
            	    // Edelta.g:3472:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	    {
            	    // Edelta.g:3472:4: (a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter )
            	    // Edelta.g:3473:5: a6_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter
            	    {
            	    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3432);
            	    a6_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeReference();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a6_0 != null) {
            	      						if (a6_0 != null) {
            	      							Object value = a6_0;
            	      							addObjectToList(element, it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__SETTER, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_16_0_0_6_0_0_1, a6_0, true);
            	      						copyLocalizationInfos(a6_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 145, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
            	      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_96, 145);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 146, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_96, 146);
              	
            }
            a7=(Token)match(input,10,FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3473); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_16_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 147, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 147, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 147, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 147);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 147);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 147);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute"
    // Edelta.g:3528:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute returns [it.univaq.coevolution.emftext.edelta.language.edelta.Attribute element = null] : a0= 'attribute' (a1= TEXT ) ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation ) ) ) )? ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.Attribute parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.Attribute element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // Edelta.g:3531:1: (a0= 'attribute' (a1= TEXT ) ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation ) ) ) )? )
            // Edelta.g:3532:2: a0= 'attribute' (a1= TEXT ) ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation ) ) ) )?
            {
            a0=(Token)match(input,31,FOLLOW_31_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute3502); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_17_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_97, 148);
              	
            }
            // Edelta.g:3546:2: (a1= TEXT )
            // Edelta.g:3547:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute3520); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
              			}
              			if (element == null) {
              				element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createAttribute();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ATTRIBUTE__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ATTRIBUTE__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_17_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_98, 149);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 149, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 149, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 149, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 149);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 149);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 149);
              	
            }
            // Edelta.g:3588:2: ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation ) ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Edelta.g:3589:3: (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation ) ) )
                    {
                    // Edelta.g:3589:3: (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation ) ) )
                    // Edelta.g:3590:4: a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation ) )
                    {
                    a2=(Token)match(input,20,FOLLOW_20_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute3550); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createAttribute();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_17_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_57, 150, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_10);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_63, 150, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_10);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_70, 150, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_10);
                      			
                    }
                    // Edelta.g:3606:4: ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation ) )
                    // Edelta.g:3607:5: (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation )
                    {
                    // Edelta.g:3607:5: (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation )
                    // Edelta.g:3608:6: a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute3583);
                    a3_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      						if (terminateParsing) {
                      							throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      						}
                      						if (element == null) {
                      							element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createAttribute();
                      							incompleteObjects.push(element);
                      						}
                      						if (a3_0 != null) {
                      							if (a3_0 != null) {
                      								Object value = a3_0;
                      								element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ATTRIBUTE__FEATURES_OP), value);
                      								completedElement(value, true);
                      							}
                      							collectHiddenTokens(element);
                      							retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_17_0_0_3_0_0_1_0_0_0, a3_0, true);
                      							copyLocalizationInfos(a3_0, element);
                      						}
                      					
                    }

                    }

                    if ( state.backtracking==0 ) {

                      					// expected elements (follow set)
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 151, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 151, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 151, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 151);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 151);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 151);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 152, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 152, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 152, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 152);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 152);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 152);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 153, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 153, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 153, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 153);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 153);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 153);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference"
    // Edelta.g:3663:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference returns [it.univaq.coevolution.emftext.edelta.language.edelta.Reference element = null] : a0= 'reference' (a1= TEXT ) ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation ) ) ) )? ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.Reference parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.Reference element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // Edelta.g:3666:1: (a0= 'reference' (a1= TEXT ) ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation ) ) ) )? )
            // Edelta.g:3667:2: a0= 'reference' (a1= TEXT ) ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation ) ) ) )?
            {
            a0=(Token)match(input,32,FOLLOW_32_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference3657); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createReference();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_18_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_99, 154);
              	
            }
            // Edelta.g:3681:2: (a1= TEXT )
            // Edelta.g:3682:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference3675); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
              			}
              			if (element == null) {
              				element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createReference();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.REFERENCE__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.REFERENCE__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_18_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_100, 155);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 155, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 155, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 155, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 155);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 155);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 155);
              	
            }
            // Edelta.g:3723:2: ( (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation ) ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Edelta.g:3724:3: (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation ) ) )
                    {
                    // Edelta.g:3724:3: (a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation ) ) )
                    // Edelta.g:3725:4: a2= '=' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation ) )
                    {
                    a2=(Token)match(input,20,FOLLOW_20_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference3705); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createReference();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_18_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_77, 156, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_11);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_83, 156, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_11);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_90, 156, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_11);
                      			
                    }
                    // Edelta.g:3741:4: ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation ) )
                    // Edelta.g:3742:5: (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation )
                    {
                    // Edelta.g:3742:5: (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation )
                    // Edelta.g:3743:6: a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference3738);
                    a3_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      						if (terminateParsing) {
                      							throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      						}
                      						if (element == null) {
                      							element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createReference();
                      							incompleteObjects.push(element);
                      						}
                      						if (a3_0 != null) {
                      							if (a3_0 != null) {
                      								Object value = a3_0;
                      								element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.REFERENCE__FEATURES_OP), value);
                      								completedElement(value, true);
                      							}
                      							collectHiddenTokens(element);
                      							retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_18_0_0_3_0_0_1_0_0_0, a3_0, true);
                      							copyLocalizationInfos(a3_0, element);
                      						}
                      					
                    }

                    }

                    if ( state.backtracking==0 ) {

                      					// expected elements (follow set)
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 157, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 157, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 157, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 157);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 157);
                      					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 157);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 158, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 158, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 158, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 158);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 158);
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 158);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 159, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 159, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 159, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 159);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 159);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 159);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter"
    // Edelta.g:3798:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter returns [it.univaq.coevolution.emftext.edelta.language.edelta.Setter element = null] : a0= 'set' (a1= TEXT ) a2= '<-' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue ) ) a4= ';' ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.Setter parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.Setter element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // Edelta.g:3801:1: (a0= 'set' (a1= TEXT ) a2= '<-' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue ) ) a4= ';' )
            // Edelta.g:3802:2: a0= 'set' (a1= TEXT ) a2= '<-' ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue ) ) a4= ';'
            {
            a0=(Token)match(input,33,FOLLOW_33_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter3812); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createSetter();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_19_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_101, 160);
              	
            }
            // Edelta.g:3816:2: (a1= TEXT )
            // Edelta.g:3817:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter3830); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
              			}
              			if (element == null) {
              				element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createSetter();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER__METAFEATURE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER__METAFEATURE), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_19_0_0_1, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_102, 161);
              	
            }
            a2=(Token)match(input,34,FOLLOW_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter3851); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createSetter();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_19_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_103, 162, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_12);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_104, 162, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_12);
              	
            }
            // Edelta.g:3867:2: ( (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue ) )
            // Edelta.g:3868:3: (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue )
            {
            // Edelta.g:3868:3: (a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue )
            // Edelta.g:3869:4: a3_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue
            {
            pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter3874);
            a3_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              				if (terminateParsing) {
              					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
              				}
              				if (element == null) {
              					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createSetter();
              					incompleteObjects.push(element);
              				}
              				if (a3_0 != null) {
              					if (a3_0 != null) {
              						Object value = a3_0;
              						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER__VALUE), value);
              						completedElement(value, true);
              					}
              					collectHiddenTokens(element);
              					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_19_0_0_3_0_0_0, a3_0, true);
              					copyLocalizationInfos(a3_0, element);
              				}
              			
            }

            }

            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 163);
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 164);
              	
            }
            a4=(Token)match(input,13,FOLLOW_13_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter3904); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createSetter();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_19_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 165, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 165, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 165);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 165);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 165);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 165, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 165, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 165);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 165);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 165);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_62, 165);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_69, 165);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_76, 165);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_82, 165);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_89, 165);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_96, 165);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue"
    // Edelta.g:3931:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue returns [it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue element = null] : ( (a0= TEXT ) | (a1= QUOTED_34_34 ) ) ( (a2= '.' (a3= TEXT ) ) )? ;
    public final it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }
            // Edelta.g:3934:1: ( ( (a0= TEXT ) | (a1= QUOTED_34_34 ) ) ( (a2= '.' (a3= TEXT ) ) )? )
            // Edelta.g:3935:2: ( (a0= TEXT ) | (a1= QUOTED_34_34 ) ) ( (a2= '.' (a3= TEXT ) ) )?
            {
            // Edelta.g:3935:2: ( (a0= TEXT ) | (a1= QUOTED_34_34 ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==TEXT) ) {
                alt33=1;
            }
            else if ( (LA33_0==QUOTED_34_34) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // Edelta.g:3936:3: (a0= TEXT )
                    {
                    // Edelta.g:3936:3: (a0= TEXT )
                    // Edelta.g:3937:4: a0= TEXT
                    {
                    a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue3942); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createSetterValue();
                      					incompleteObjects.push(element);
                      				}
                      				if (a0 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__NAME), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__NAME), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_20_0_0_0_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_106, 166);
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 166);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:3974:6: (a1= QUOTED_34_34 )
                    {
                    // Edelta.g:3974:6: (a1= QUOTED_34_34 )
                    // Edelta.g:3975:4: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue3980); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createSetterValue();
                      					incompleteObjects.push(element);
                      				}
                      				if (a1 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__NAME), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__NAME), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_20_0_0_0_0_1_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_106, 167);
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 167);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_106, 168);
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 168);
              	
            }
            // Edelta.g:4018:2: ( (a2= '.' (a3= TEXT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Edelta.g:4019:3: (a2= '.' (a3= TEXT ) )
                    {
                    // Edelta.g:4019:3: (a2= '.' (a3= TEXT ) )
                    // Edelta.g:4020:4: a2= '.' (a3= TEXT )
                    {
                    a2=(Token)match(input,35,FOLLOW_35_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue4023); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createSetterValue();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_20_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_107, 169);
                      			
                    }
                    // Edelta.g:4034:4: (a3= TEXT )
                    // Edelta.g:4035:5: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue4049); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createSetterValue();
                      						incompleteObjects.push(element);
                      					}
                      					if (a3 != null) {
                      						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__FEATURE), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__FEATURE), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_20_0_0_1_0_0_1, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 170);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 171);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter"
    // Edelta.g:4079:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter returns [it.univaq.coevolution.emftext.edelta.language.edelta.Parameter element = null] : ( ( (a0= TEXT ) (a1= TEXT ) ) | ( (a2_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type ) ) );
    public final it.univaq.coevolution.emftext.edelta.language.edelta.Parameter parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.Parameter element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        it.univaq.coevolution.emftext.edelta.language.edelta.Type a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }
            // Edelta.g:4082:1: ( ( (a0= TEXT ) (a1= TEXT ) ) | ( (a2_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==TEXT) ) {
                alt35=1;
            }
            else if ( (LA35_0==11||LA35_0==19||LA35_0==21||(LA35_0>=31 && LA35_0<=32)) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // Edelta.g:4083:2: ( (a0= TEXT ) (a1= TEXT ) )
                    {
                    // Edelta.g:4083:2: ( (a0= TEXT ) (a1= TEXT ) )
                    // Edelta.g:4084:3: (a0= TEXT ) (a1= TEXT )
                    {
                    // Edelta.g:4084:3: (a0= TEXT )
                    // Edelta.g:4085:4: a0= TEXT
                    {
                    a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter4119); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createParameter();
                      					incompleteObjects.push(element);
                      				}
                      				if (a0 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__TYPE), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
                      					}
                      					String resolved = (String) resolvedObject;
                      					it.univaq.coevolution.emftext.edelta.language.edelta.Type proxy = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createDataType();
                      					collectHiddenTokens(element);
                      					registerContextDependentProxy(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaContextDependentURIFragmentFactory<it.univaq.coevolution.emftext.edelta.language.edelta.Parameter, it.univaq.coevolution.emftext.edelta.language.edelta.Type>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getParameterTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__TYPE), resolved, proxy);
                      					if (proxy != null) {
                      						Object value = proxy;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__TYPE), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_21_0_0_0_0_0_0, proxy, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_109, 172);
                      		
                    }
                    // Edelta.g:4124:3: (a1= TEXT )
                    // Edelta.g:4125:4: a1= TEXT
                    {
                    a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter4151); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createParameter();
                      					incompleteObjects.push(element);
                      				}
                      				if (a1 != null) {
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__NAME), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String) resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__NAME), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_21_0_0_0_0_0_2, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      	
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:4165:4: ( (a2_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type ) )
                    {
                    // Edelta.g:4165:4: ( (a2_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type ) )
                    // Edelta.g:4166:3: (a2_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type )
                    {
                    // Edelta.g:4166:3: (a2_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type )
                    // Edelta.g:4167:4: a2_0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter4198);
                    a2_0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createParameter();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2_0 != null) {
                      					if (a2_0 != null) {
                      						Object value = a2_0;
                      						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__REF_TYPE), value);
                      						completedElement(value, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_21_0_1_0_0_0_0, a2_0, true);
                      					copyLocalizationInfos(a2_0, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      	
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
            if ( state.backtracking>0 ) { memoize(input, 23, parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation"
    // Edelta.g:4198:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation returns [it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation element = null] : (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage | c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage | c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage );
    public final it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation_StartIndex = input.index();
        it.univaq.coevolution.emftext.edelta.language.edelta.addPackage c0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.changePackage c1 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // Edelta.g:4199:1: (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage | c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage | c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt36=1;
                }
                break;
            case 17:
                {
                alt36=2;
                }
                break;
            case 18:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // Edelta.g:4200:2: c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation4239);
                    c0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:4201:4: c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation4249);
                    c1=parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Edelta.g:4202:4: c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation4259);
                    c2=parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 24, parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation"
    // Edelta.g:4206:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation returns [it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation element = null] : (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass | c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass | c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass );
    public final it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation_StartIndex = input.index();
        it.univaq.coevolution.emftext.edelta.language.edelta.addClass c0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.changeClass c1 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }
            // Edelta.g:4207:1: (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass | c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass | c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt37=1;
                }
                break;
            case 23:
                {
                alt37=2;
                }
                break;
            case 24:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // Edelta.g:4208:2: c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation4280);
                    c0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:4209:4: c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation4290);
                    c1=parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Edelta.g:4210:4: c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation4300);
                    c2=parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 25, parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature"
    // Edelta.g:4214:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature returns [it.univaq.coevolution.emftext.edelta.language.edelta.Feature element = null] : (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute | c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference );
    public final it.univaq.coevolution.emftext.edelta.language.edelta.Feature parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.Feature element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature_StartIndex = input.index();
        it.univaq.coevolution.emftext.edelta.language.edelta.Attribute c0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.Reference c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }
            // Edelta.g:4215:1: (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute | c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            else if ( (LA38_0==32) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // Edelta.g:4216:2: c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature4321);
                    c0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:4217:4: c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature4331);
                    c1=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 26, parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation"
    // Edelta.g:4221:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation returns [it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation element = null] : (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute | c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute | c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute );
    public final it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation_StartIndex = input.index();
        it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute c0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute c1 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }
            // Edelta.g:4222:1: (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute | c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute | c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt39=1;
                }
                break;
            case 26:
                {
                alt39=2;
                }
                break;
            case 27:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // Edelta.g:4223:2: c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation4352);
                    c0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:4224:4: c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation4362);
                    c1=parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Edelta.g:4225:4: c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation4372);
                    c2=parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 27, parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation"
    // Edelta.g:4229:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation returns [it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation element = null] : (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference | c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference | c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference );
    public final it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation_StartIndex = input.index();
        it.univaq.coevolution.emftext.edelta.language.edelta.addReference c0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference c1 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.changeReference c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }
            // Edelta.g:4230:1: (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference | c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference | c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt40=1;
                }
                break;
            case 29:
                {
                alt40=2;
                }
                break;
            case 30:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // Edelta.g:4231:2: c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation4393);
                    c0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:4232:4: c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation4403);
                    c1=parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Edelta.g:4233:4: c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation4413);
                    c2=parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 28, parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation"


    // $ANTLR start "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type"
    // Edelta.g:4237:1: parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type returns [it.univaq.coevolution.emftext.edelta.language.edelta.Type element = null] : (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType | c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package | c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class | c3= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute | c4= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference );
    public final it.univaq.coevolution.emftext.edelta.language.edelta.Type parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type() throws RecognitionException {
        it.univaq.coevolution.emftext.edelta.language.edelta.Type element =  null;
        int parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type_StartIndex = input.index();
        it.univaq.coevolution.emftext.edelta.language.edelta.DataType c0 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.Package c1 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.Class c2 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.Attribute c3 = null;

        it.univaq.coevolution.emftext.edelta.language.edelta.Reference c4 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }
            // Edelta.g:4238:1: (c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType | c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package | c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class | c3= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute | c4= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference )
            int alt41=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt41=1;
                }
                break;
            case 19:
                {
                alt41=2;
                }
                break;
            case 21:
                {
                alt41=3;
                }
                break;
            case 31:
                {
                alt41=4;
                }
                break;
            case 32:
                {
                alt41=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // Edelta.g:4239:2: c0= parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type4434);
                    c0=parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Edelta.g:4240:4: c1= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type4444);
                    c1=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Edelta.g:4241:4: c2= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type4454);
                    c2=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Edelta.g:4242:4: c3= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type4464);
                    c3=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Edelta.g:4243:4: c4= parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference
                    {
                    pushFollow(FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type4474);
                    c4=parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 29, parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model119 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model137 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model151 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model180 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model221 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model250 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module378 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage428 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage442 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage465 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage499 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage513 = new BitSet(new long[]{0x0000000200200400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage542 = new BitSet(new long[]{0x0000000200200400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage584 = new BitSet(new long[]{0x0000000200200400L});
    public static final BitSet FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage654 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage668 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage691 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage729 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage763 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage777 = new BitSet(new long[]{0x0000000200200400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage806 = new BitSet(new long[]{0x0000000200200400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage848 = new BitSet(new long[]{0x0000000200200400L});
    public static final BitSet FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage918 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage932 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage955 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage993 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage1027 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage1041 = new BitSet(new long[]{0x0000000200200400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage1070 = new BitSet(new long[]{0x0000000200200400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage1112 = new BitSet(new long[]{0x0000000200200400L});
    public static final BitSet FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package1182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package1200 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package1230 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class1337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class1355 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class1385 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1492 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1506 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1529 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1563 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1577 = new BitSet(new long[]{0x0000000380000400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1606 = new BitSet(new long[]{0x0000000380000400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1648 = new BitSet(new long[]{0x0000000380000400L});
    public static final BitSet FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1718 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1732 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1755 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1793 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1827 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1841 = new BitSet(new long[]{0x0000000380000400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1870 = new BitSet(new long[]{0x0000000380000400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1912 = new BitSet(new long[]{0x0000000380000400L});
    public static final BitSet FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass1982 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass1996 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2019 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2057 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2091 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2105 = new BitSet(new long[]{0x0000000380000400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2134 = new BitSet(new long[]{0x0000000380000400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2176 = new BitSet(new long[]{0x0000000380000400L});
    public static final BitSet FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2246 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2283 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2317 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2331 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2360 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2430 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2444 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2467 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2505 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2539 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2553 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2582 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2652 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2666 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2689 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2727 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2761 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2775 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2804 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference2874 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference2888 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference2911 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference2945 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference2959 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference2988 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3058 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3072 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3095 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3133 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3167 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3181 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3210 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3280 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3294 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3317 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3355 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3389 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3403 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3432 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_10_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute3502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute3520 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute3550 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference3657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference3675 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference3705 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter3812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter3830 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter3851 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter3874 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue3942 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue3980 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue4023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter4119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference_in_parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type4474 = new BitSet(new long[]{0x0000000000000002L});

}