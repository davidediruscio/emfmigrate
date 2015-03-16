grammar Edelta;

options {
	superClass = EdeltaANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
	}
}
@header{
	package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;
}

@members{
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_0, 0, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_0);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_Model returns [it.univaq.coevolution.emftext.edelta.language.edelta.Model element = null]
@init{
}
:
	(
		a0_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_1, 1);
	}
	
	a1 = 'datatypes' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_0_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_2, 2);
	}
	
	a2 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_0_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_3, 3, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_1);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_4, 3);
	}
	
	(
		(
			(
				a3_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_3, 4, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_1);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_4, 4);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_3, 5, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_1);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_4, 5);
	}
	
	a4 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_0_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 6, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
	}
	
	(
		(
			(
				a5_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 7, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 8, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType returns [it.univaq.coevolution.emftext.edelta.language.edelta.DataType element = null]
@init{
}
:
	a0 = 'datatype' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createDataType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_6, 9);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_3, 10, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_1);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_4, 10);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_Module returns [it.univaq.coevolution.emftext.edelta.language.edelta.Module element = null]
@init{
}
:
	a0 = 'module' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModule();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_7, 11);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_8, 12);
	}
	
	a2 = ';' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createModule();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_2_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_1, 13);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage returns [it.univaq.coevolution.emftext.edelta.language.edelta.addPackage element = null]
@init{
}
:
	a0 = 'addPackage' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddPackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_10, 14);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddPackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_3_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_11, 15);
	}
	
	(
		(
			a2 = QUOTED_34_34			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_12, 16);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_12, 17);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddPackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_3_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_13, 18);
	}
	
	a4 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddPackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_3_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 19, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 19, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 19);
	}
	
	(
		(
			(
				a5_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 20, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 20, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 20);
			}
			
			
			|			(
				a6_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 21, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 21, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 21);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 22, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 22, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 22);
	}
	
	a7 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddPackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_3_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 23, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage returns [it.univaq.coevolution.emftext.edelta.language.edelta.changePackage element = null]
@init{
}
:
	a0 = 'changePackage' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_18, 24);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_19, 25);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_20, 25);
	}
	
	(
		(
			a2 = QUOTED_34_34			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_21, 26);
		}
		
		
		|		(
			a3 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_21, 27);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_21, 28);
	}
	
	a4 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_22, 29);
	}
	
	a5 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 30, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 30, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 30);
	}
	
	(
		(
			(
				a6_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 31, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 31, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 31);
			}
			
			
			|			(
				a7_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 32, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 32, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 32);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 33, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 33, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 33);
	}
	
	a8 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangePackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_4_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 34, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage returns [it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage element = null]
@init{
}
:
	a0 = 'deletePackage' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_25, 35);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_26, 36);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_27, 36);
	}
	
	(
		(
			a2 = QUOTED_34_34			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_28, 37);
		}
		
		
		|		(
			a3 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_28, 38);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_28, 39);
	}
	
	a4 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_29, 40);
	}
	
	a5 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 41, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 41, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 41);
	}
	
	(
		(
			(
				a6_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 42, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 42, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 42);
			}
			
			
			|			(
				a7_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 43, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 43, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 43);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 44, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 44, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 44);
	}
	
	a8 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeletePackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_5_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 45, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package returns [it.univaq.coevolution.emftext.edelta.language.edelta.Package element = null]
@init{
}
:
	a0 = 'package' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createPackage();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_6_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_31, 46);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_32, 47);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 47, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
	}
	
	(
		(
			a2 = '=' {
				if (element == null) {
					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createPackage();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_6_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_9, 48, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_5);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_17, 48, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_5);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_24, 48, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_5);
			}
			
			(
				(
					a3_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 49, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 50, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_5, 51, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_2);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class returns [it.univaq.coevolution.emftext.edelta.language.edelta.Class element = null]
@init{
}
:
	a0 = 'class' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_7_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_33, 52);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_34, 53);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 53, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 53, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 53);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 53);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 53);
	}
	
	(
		(
			a2 = '=' {
				if (element == null) {
					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createClass();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_7_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_35, 54, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_6);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_36, 54, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_6);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_37, 54, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_6);
			}
			
			(
				(
					a3_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 55, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 55, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 55);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 55);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 55);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 56, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 56, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 56);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 56);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 56);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 57, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 57, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 57);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 57);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 57);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass returns [it.univaq.coevolution.emftext.edelta.language.edelta.addClass element = null]
@init{
}
:
	a0 = 'addClass' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_38, 58);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_8_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_39, 59);
	}
	
	(
		(
			a2 = QUOTED_34_34			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_40, 60);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_40, 61);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_8_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_41, 62);
	}
	
	a4 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_8_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 63, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 63, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 63, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 63);
	}
	
	(
		(
			(
				a5_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 64, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 64, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 64, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 64);
			}
			
			
			|			(
				a6_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 65, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 65, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 65, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 65);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 66, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 66, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 66, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 66);
	}
	
	a7 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_8_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 67, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 67, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 67);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 67);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 67);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass returns [it.univaq.coevolution.emftext.edelta.language.edelta.changeClass element = null]
@init{
}
:
	a0 = 'changeClass' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_45, 68);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_46, 69);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_47, 69);
	}
	
	(
		(
			a2 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_48, 70);
		}
		
		
		|		(
			a3 = QUOTED_34_34			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_48, 71);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_48, 72);
	}
	
	a4 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_49, 73);
	}
	
	a5 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 74, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 74, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 74, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 74);
	}
	
	(
		(
			(
				a6_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 75, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 75, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 75, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 75);
			}
			
			
			|			(
				a7_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 76, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 76, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 76, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 76);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 77, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 77, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 77, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 77);
	}
	
	a8 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_9_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 78, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 78, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 78);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 78);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 78);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass returns [it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass element = null]
@init{
}
:
	a0 = 'deleteClass' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_51, 79);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_52, 80);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_53, 80);
	}
	
	(
		(
			a2 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_54, 81);
		}
		
		
		|		(
			a3 = QUOTED_34_34			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_54, 82);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_54, 83);
	}
	
	a4 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_55, 84);
	}
	
	a5 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 85, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 85, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 85, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 85);
	}
	
	(
		(
			(
				a6_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 86, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 86, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 86, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 86);
			}
			
			
			|			(
				a7_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 87, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 87, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 87, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 87);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 88, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 88, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 88, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 88);
	}
	
	a8 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteClass();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_10_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 89, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_3);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_15, 89, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_16, 89);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_23, 89);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_30, 89);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute returns [it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute element = null]
@init{
}
:
	a0 = 'addAttribute' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_11_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_58, 90);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_11_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_59, 91);
	}
	
	(
		(
			a2 = QUOTED_34_34			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_60, 92);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_60, 93);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_11_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_61, 94);
	}
	
	a4 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_11_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 95, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_62, 95);
	}
	
	(
		(
			(
				a5_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 96, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_62, 96);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 97, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_62, 97);
	}
	
	a6 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_11_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 98, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 98, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 98, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 98);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 98);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 98);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute returns [it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute element = null]
@init{
}
:
	a0 = 'deleteAttribute' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_12_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_64, 99);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_12_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_65, 100);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_66, 100);
	}
	
	(
		(
			a2 = QUOTED_34_34			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_67, 101);
		}
		
		
		|		(
			a3 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_67, 102);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_67, 103);
	}
	
	a4 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_12_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_68, 104);
	}
	
	a5 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_12_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 105, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_69, 105);
	}
	
	(
		(
			(
				a6_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 106, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_69, 106);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 107, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_69, 107);
	}
	
	a7 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_12_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 108, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 108, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 108, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 108);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 108);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 108);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute returns [it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute element = null]
@init{
}
:
	a0 = 'changeAttribute' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_13_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_71, 109);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_13_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_72, 110);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_73, 110);
	}
	
	(
		(
			a2 = QUOTED_34_34			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_74, 111);
		}
		
		
		|		(
			a3 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_74, 112);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_74, 113);
	}
	
	a4 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_13_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_75, 114);
	}
	
	a5 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_13_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 115, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_76, 115);
	}
	
	(
		(
			(
				a6_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 116, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_76, 116);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 117, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_76, 117);
	}
	
	a7 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_13_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 118, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 118, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 118, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 118);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 118);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 118);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference returns [it.univaq.coevolution.emftext.edelta.language.edelta.addReference element = null]
@init{
}
:
	a0 = 'addReference' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_14_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_78, 119);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_14_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_79, 120);
	}
	
	(
		(
			a2 = QUOTED_34_34			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_80, 121);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_80, 122);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_14_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_81, 123);
	}
	
	a4 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_14_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 124, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_82, 124);
	}
	
	(
		(
			(
				a5_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 125, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_82, 125);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 126, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_82, 126);
	}
	
	a6 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createaddReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_14_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 127, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 127, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 127, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 127);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 127);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 127);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference returns [it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference element = null]
@init{
}
:
	a0 = 'deleteReference' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_15_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_84, 128);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_15_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_85, 129);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_86, 129);
	}
	
	(
		(
			a2 = QUOTED_34_34			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_87, 130);
		}
		
		
		|		(
			a3 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_87, 131);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_87, 132);
	}
	
	a4 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_15_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_88, 133);
	}
	
	a5 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_15_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 134, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_89, 134);
	}
	
	(
		(
			(
				a6_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 135, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_89, 135);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 136, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_89, 136);
	}
	
	a7 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createdeleteReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_15_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 137, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 137, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 137, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 137);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 137);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 137);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference returns [it.univaq.coevolution.emftext.edelta.language.edelta.changeReference element = null]
@init{
}
:
	a0 = 'changeReference' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_91, 138);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_16_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_92, 139);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_93, 139);
	}
	
	(
		(
			a2 = QUOTED_34_34			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_94, 140);
		}
		
		
		|		(
			a3 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_94, 141);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_94, 142);
	}
	
	a4 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_16_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_95, 143);
	}
	
	a5 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_16_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 144, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_96, 144);
	}
	
	(
		(
			(
				a6_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 145, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_96, 145);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 146, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_96, 146);
	}
	
	a7 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createchangeReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_16_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 147, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 147, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 147, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 147);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 147);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 147);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute returns [it.univaq.coevolution.emftext.edelta.language.edelta.Attribute element = null]
@init{
}
:
	a0 = 'attribute' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_17_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_97, 148);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_98, 149);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 149, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 149, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 149, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 149);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 149);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 149);
	}
	
	(
		(
			a2 = '=' {
				if (element == null) {
					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createAttribute();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_17_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_57, 150, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_10);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_63, 150, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_10);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_70, 150, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_10);
			}
			
			(
				(
					a3_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 151, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 151, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 151, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 151);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 151);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 151);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 152, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 152, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 152, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 152);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 152);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 152);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 153, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 153, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 153, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 153);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 153);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 153);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference returns [it.univaq.coevolution.emftext.edelta.language.edelta.Reference element = null]
@init{
}
:
	a0 = 'reference' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_18_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_99, 154);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_100, 155);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 155, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 155, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 155, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 155);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 155);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 155);
	}
	
	(
		(
			a2 = '=' {
				if (element == null) {
					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createReference();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_18_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_77, 156, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_83, 156, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_90, 156, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_11);
			}
			
			(
				(
					a3_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 157, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 157, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 157, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 157);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 157);
					addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 157);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 158, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 158, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 158, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 158);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 158);
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 158);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_14, 159, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_42, 159, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_43, 159, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_44, 159);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_50, 159);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_56, 159);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_Setter returns [it.univaq.coevolution.emftext.edelta.language.edelta.Setter element = null]
@init{
}
:
	a0 = 'set' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createSetter();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_19_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_101, 160);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_102, 161);
	}
	
	a2 = '<-' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createSetter();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_19_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_103, 162, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_12);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_104, 162, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.FEATURE_12);
	}
	
	(
		(
			a3_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 163);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 164);
	}
	
	a4 = ';' {
		if (element == null) {
			element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createSetter();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_19_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
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
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue returns [it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue element = null]
@init{
}
:
	(
		(
			a0 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_106, 166);
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 166);
		}
		
		
		|		(
			a1 = QUOTED_34_34			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_106, 167);
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 167);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_106, 168);
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 168);
	}
	
	(
		(
			a2 = '.' {
				if (element == null) {
					element = it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory.eINSTANCE.createSetterValue();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaGrammarInformationProvider.EDELTA_20_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_107, 169);
			}
			
			(
				a3 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 170);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_105, 171);
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter returns [it.univaq.coevolution.emftext.edelta.language.edelta.Parameter element = null]
@init{
}
:
	(
		(
			a0 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFollowSetProvider.TERMINAL_109, 172);
		}
		
		(
			a1 = TEXT			
			{
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
		)
		{
			// expected elements (follow set)
		}
		
	)
	{
		// expected elements (follow set)
	}
	
	
	|	(
		(
			a2_0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type			{
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
		)
		{
			// expected elements (follow set)
		}
		
	)
	{
		// expected elements (follow set)
	}
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation returns [it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation element = null]
:
	c0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation returns [it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation element = null]
:
	c0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_addClass{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_Feature returns [it.univaq.coevolution.emftext.edelta.language.edelta.Feature element = null]
:
	c0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation returns [it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation element = null]
:
	c0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation returns [it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation element = null]
:
	c0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_addReference{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_it_univaq_coevolution_emftext_edelta_language_edelta_Type returns [it.univaq.coevolution.emftext.edelta.language.edelta.Type element = null]
:
	c0 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_DataType{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Package{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Class{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_it_univaq_coevolution_emftext_edelta_language_edelta_Reference{ element = c4; /* this is a subclass or primitive expression choice */ }
	
;

TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;
QUOTED_34_34:
	(('"')(~('"'))*('"'))
;

