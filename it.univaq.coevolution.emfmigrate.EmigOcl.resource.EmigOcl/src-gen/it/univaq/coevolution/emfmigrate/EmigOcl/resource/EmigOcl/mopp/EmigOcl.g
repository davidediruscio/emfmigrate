grammar EmigOcl;

options {
	superClass = EmigOclANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;
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
	package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;
}

@members{
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolverFactory tokenResolverFactory = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenResolverFactory();
	
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
	private java.util.List<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal> expectedElements = new java.util.ArrayList<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal>();
	
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
		postParseCommands.add(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclCommand<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource>() {
			public boolean execute(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclProblem() {
					public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemSeverity getSeverity() {
						return it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemSeverity.ERROR;
					}
					public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemType getType() {
						return it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
		if (!this.rememberExpectedElements) {
			return;
		}
		it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal expectedElement = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal(terminal, followSetID, containmentTrace);
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
		postParseCommands.add(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclCommand<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource>() {
			public boolean execute(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource resource) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclCommand<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource>() {
			public boolean execute(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource resource) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclLocationMap locationMap = resource.getLocationMap();
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
	protected void setLocalizationEnd(java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclCommand<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		postParseCommands.add(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclCommand<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource>() {
			public boolean execute(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource resource) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclLocationMap locationMap = resource.getLocationMap();
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
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new EmigOclParser(new org.antlr.runtime3_3_0.CommonTokenStream(new EmigOclLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new EmigOclParser(new org.antlr.runtime3_3_0.CommonTokenStream(new EmigOclLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public EmigOclParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((EmigOclLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((EmigOclLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.Module.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_Module();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeatureDefinition();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclContextDefinition();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.OclType.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.OclModel.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclModel();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.Attribute.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_Attribute();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.Operation.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_Operation();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.Parameter.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_Parameter();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_TuplePart();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.MapElement.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_MapElement();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_OperatorCallExp();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.Iterator.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_VariableDeclaration();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionType();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.StringType.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_StringType();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.BooleanType.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanType();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.IntegerType.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerType();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.RealType.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_RealType();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.BagType.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_BagType();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetType.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetType();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.SequenceType.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceType();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.SetType.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_SetType();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclAnyType();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.TupleType.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_TupleType();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_TupleTypeAttribute();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElement();
			}
			if (type.getInstanceClass() == it.univaq.coevolution.emfmigrate.EmigOcl.MapType.class) {
				return parse_it_univaq_coevolution_emfmigrate_EmigOcl_MapType();
			}
		}
		throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclUnexpectedContentTypeException(typeObject);
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
			typeObject = options.get(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclCommand<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource>>();
		it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclParseResult parseResult = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclParseResult();
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
	
	public java.util.List<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
		it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclParseResult result = parse();
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
			for (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclCommand<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal>();
		java.util.List<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal> newFollowSet = new java.util.ArrayList<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 238;
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
				for (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclPair<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclPair<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
							it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclExpectedElement newFollower = newFollowerPair.getLeft();
							it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal newFollowTerminal = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
		for (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclExpectedTerminal expectedElement, int tokenIndex) {
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_0, 0);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Module{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_Module returns [it.univaq.coevolution.emfmigrate.EmigOcl.Module element = null]
@init{
}
:
	a0 = 'module' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_1, 1);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_2, 2);
	}
	
	a2 = ';' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_3, 3, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_0);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_4, 3, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_2);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 3, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_2);
	}
	
	(
		(
			(
				a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclModel				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
						incompleteObjects.push(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__MODELS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_3_0_0_1, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_6, 4);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_7, 4);
			}
			
			(
				(
					a4 = ',' {
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_3_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_3, 5, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_0);
					}
					
					(
						a5_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclModel						{
							if (terminateParsing) {
								throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
							}
							if (element == null) {
								element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
								incompleteObjects.push(element);
							}
							if (a5_0 != null) {
								if (a5_0 != null) {
									Object value = a5_0;
									addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__MODELS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_3_0_0_2_0_0_1, a5_0, true);
								copyLocalizationInfos(a5_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_6, 6);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_7, 6);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_6, 7);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_7, 7);
			}
			
			a6 = ';' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_3_0_0_3, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_4, 8, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_2);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 8, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_2);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_4, 9, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_2);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 9, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_2);
	}
	
	(
		(
			(
				a7_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeatureDefinition				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
						incompleteObjects.push(element);
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							Object value = a7_0;
							addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__FEATURES, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_4_0_0_1, a7_0, true);
						copyLocalizationInfos(a7_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_8, 10);
			}
			
			(
				(
					a8 = ',' {
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_4_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_4, 11, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_2);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 11, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_2);
					}
					
					(
						a9_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeatureDefinition						{
							if (terminateParsing) {
								throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
							}
							if (element == null) {
								element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
								incompleteObjects.push(element);
							}
							if (a9_0 != null) {
								if (a9_0 != null) {
									Object value = a9_0;
									addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__FEATURES, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_4_0_0_2_0_0_1, a9_0, true);
								copyLocalizationInfos(a9_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_8, 12);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_8, 13);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeatureDefinition returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition element = null]
@init{
}
:
	(
		(
			a0_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclContextDefinition			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclFeatureDefinition();
					incompleteObjects.push(element);
				}
				if (a0_0 != null) {
					if (a0_0 != null) {
						Object value = a0_0;
						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_FEATURE_DEFINITION__CONTEXT_), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_1_0_0_0, a0_0, true);
					copyLocalizationInfos(a0_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 15);
	}
	
	a1 = 'def' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclFeatureDefinition();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_1_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_9, 16);
	}
	
	a2 = ':' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclFeatureDefinition();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_1_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_10, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_3);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_11, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_3);
	}
	
	(
		a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeature		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclFeatureDefinition();
				incompleteObjects.push(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_FEATURE_DEFINITION__FEATURE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_1_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_8, 18);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclContextDefinition returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition element = null]
@init{
}
:
	a0 = 'context' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclContextDefinition();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 19, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
	}
	
	(
		a1_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclContextDefinition();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_2_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 20);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclType element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclType();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_3_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 21);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionType{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_StringType{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanType{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerType{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_RealType{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_BagType{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetType{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceType{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_SetType{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclAnyType{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_TupleType{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElement{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_MapType{ element = c12; /* this is a subclass or primitive expression choice */ }
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclModel returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclModel element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModel();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_4_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 22);
	}
	
	a1 = ':' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_4_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 23);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModel();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__METAMODEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				it.univaq.coevolution.emfmigrate.EmigOcl.OclModel proxy = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModel();
				collectHiddenTokens(element);
				registerContextDependentProxy(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclContextDependentURIFragmentFactory<it.univaq.coevolution.emfmigrate.EmigOcl.OclModel, it.univaq.coevolution.emfmigrate.EmigOcl.OclModel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelMetamodelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__METAMODEL), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__METAMODEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_4_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_6, 24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_7, 24);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_Attribute returns [it.univaq.coevolution.emfmigrate.EmigOcl.Attribute element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createAttribute();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_60, 25);
	}
	
	a1 = ':' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 26, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
	}
	
	(
		a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createAttribute();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 27);
	}
	
	a3 = '=' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 28, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
	}
	
	(
		a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createAttribute();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__INIT_EXPRESSION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_5, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 29);
	}
	
	a5 = ';' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_8, 30);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_Operation returns [it.univaq.coevolution.emfmigrate.EmigOcl.Operation element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_79, 31);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 32, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 32);
	}
	
	(
		(
			(
				a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Parameter				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__PARAMETERS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_2_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 33);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 33);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 34, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_8);
					}
					
					(
						a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Parameter						{
							if (terminateParsing) {
								throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
							}
							if (element == null) {
								element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
								incompleteObjects.push(element);
							}
							if (a4_0 != null) {
								if (a4_0 != null) {
									Object value = a4_0;
									addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__PARAMETERS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_2_0_0_1_0_0_1, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 35);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 35);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 36);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 36);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 37);
	}
	
	a5 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 38);
	}
	
	a6 = ':' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 39, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
	}
	
	(
		a7_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
				incompleteObjects.push(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__RETURN_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_5, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 40);
	}
	
	a8 = '=' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 41, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
	}
	
	(
		a9_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
				incompleteObjects.push(element);
			}
			if (a9_0 != null) {
				if (a9_0 != null) {
					Object value = a9_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__BODY), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_8, a9_0, true);
				copyLocalizationInfos(a9_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 42);
	}
	
	a10 = ';' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_8, 43);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_Parameter returns [it.univaq.coevolution.emfmigrate.EmigOcl.Parameter element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createParameter();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PARAMETER__VAR_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PARAMETER__VAR_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_7_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 44);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 44);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 44);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 44);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 44);
	}
	
	(
		(
			a1 = ':' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createParameter();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_7_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 45, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
			}
			
			(
				a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createParameter();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PARAMETER__TYPE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_7_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 46);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 46);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 46);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 46);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 47);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 47);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 47);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 47);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_TuplePart returns [it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTuplePart();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__VAR_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__VAR_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_19_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 48);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 48);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 48);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 48);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 48);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 48);
	}
	
	(
		(
			a1 = ':' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTuplePart();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_19_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
			}
			
			(
				a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTuplePart();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__TYPE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_19_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 50);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 50);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 50);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 50);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 50);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 51);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 51);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 51);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 51);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 51);
	}
	
	(
		(
			a3 = '=' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTuplePart();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_19_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
			}
			
			(
				a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTuplePart();
						incompleteObjects.push(element);
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							Object value = a4_0;
							element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__INIT_EXPRESSION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_19_0_0_2_0_0_1, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 53);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 53);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 53);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 53);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 54);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 54);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 54);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 54);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_MapElement returns [it.univaq.coevolution.emfmigrate.EmigOcl.MapElement element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapElement();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_21_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 55, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
	}
	
	(
		a1_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapElement();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_ELEMENT__KEY), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_21_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 56);
	}
	
	a2 = ',' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapElement();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_21_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 57, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
	}
	
	(
		a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapElement();
				incompleteObjects.push(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_ELEMENT__VALUE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_21_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_89, 58);
	}
	
	a4 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapElement();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_21_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_90, 59);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_91, 59);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OperatorCallExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperatorCallExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_26_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 60, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
	}
	
	(
		a1_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperatorCallExp();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__SOURCE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_26_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 61);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 61);
	}
	
	(
		(
			a2 = TXTOP			
			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperatorCallExp();
					incompleteObjects.push(element);
				}
				if (a2 != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTOP");
					tokenResolver.setOptions(getOptions());
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_26_0_0_2_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		}
		
		
		|		(
			a3 = SYMOP			
			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperatorCallExp();
					incompleteObjects.push(element);
				}
				if (a3 != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SYMOP");
					tokenResolver.setOptions(getOptions());
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_26_0_0_2_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 63, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 64, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
	}
	
	(
		a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperatorCallExp();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__ARGUMENTS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_26_0_0_3, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_92, 65);
	}
	
	a5 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperatorCallExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_26_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 66);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 66);
	}
	
	
	|	(
		a6_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperatorCallExp();
				incompleteObjects.push(element);
			}
			if (a6_0 != null) {
				if (a6_0 != null) {
					Object value = a6_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__SOURCE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_26_0_1_0, a6_0, true);
				copyLocalizationInfos(a6_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_93, 67);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_94, 67);
	}
	
	(
		(
			a7 = TXTOP			
			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperatorCallExp();
					incompleteObjects.push(element);
				}
				if (a7 != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTOP");
					tokenResolver.setOptions(getOptions());
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_26_0_1_1_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 68, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		}
		
		
		|		(
			a8 = SYMOP			
			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperatorCallExp();
					incompleteObjects.push(element);
				}
				if (a8 != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SYMOP");
					tokenResolver.setOptions(getOptions());
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_26_0_1_1_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a8, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 70, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
	}
	
	(
		a9_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperatorCallExp();
				incompleteObjects.push(element);
			}
			if (a9_0 != null) {
				if (a9_0 != null) {
					Object value = a9_0;
					addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__ARGUMENTS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_26_0_1_2, a9_0, true);
				copyLocalizationInfos(a9_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 71);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator returns [it.univaq.coevolution.emfmigrate.EmigOcl.Iterator element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterator();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR__VAR_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR__VAR_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_30_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_96, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_97, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_98, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 72);
	}
	
	(
		(
			a1 = ':' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterator();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_30_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 73, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
			}
			
			(
				a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterator();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR__TYPE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_30_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_97, 74);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_98, 74);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 74);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 74);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 74);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_97, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_98, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 75);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_VariableDeclaration returns [it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createVariableDeclaration();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_DECLARATION__VAR_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_DECLARATION__VAR_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_33_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 76);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 76);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 76);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 76);
	}
	
	(
		(
			a1 = ':' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createVariableDeclaration();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_33_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
			}
			
			(
				a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createVariableDeclaration();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_DECLARATION__TYPE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_33_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 78);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 78);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 78);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 79);
	}
	
	(
		(
			a3 = '=' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createVariableDeclaration();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_33_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 80, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
			}
			
			(
				a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createVariableDeclaration();
						incompleteObjects.push(element);
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							Object value = a4_0;
							element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_DECLARATION__INIT_EXPRESSION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_33_0_0_2_0_0_1, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 81);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 81);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 82);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 82);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Parameter{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_TuplePart{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionType returns [it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionType();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 83);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 84, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
	}
	
	(
		a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionType();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__ELEMENT_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 85);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 86);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 86);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_BagType{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetType{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceType{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_SetType{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_StringType returns [it.univaq.coevolution.emfmigrate.EmigOcl.StringType element = null]
@init{
}
:
	(
		a0 = STRINGTYPE		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createStringType();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRINGTYPE");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_35_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 87);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanType returns [it.univaq.coevolution.emfmigrate.EmigOcl.BooleanType element = null]
@init{
}
:
	(
		a0 = BOOLEANTYPE		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBooleanType();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BOOLEANTYPE");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_36_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 88);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 88);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerType returns [it.univaq.coevolution.emfmigrate.EmigOcl.IntegerType element = null]
@init{
}
:
	(
		a0 = INTEGERTYPE		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIntegerType();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGERTYPE");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_37_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 89);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 89);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_RealType returns [it.univaq.coevolution.emfmigrate.EmigOcl.RealType element = null]
@init{
}
:
	(
		a0 = REALTYPE		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createRealType();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REALTYPE");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_38_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 90);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 90);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_BagType returns [it.univaq.coevolution.emfmigrate.EmigOcl.BagType element = null]
@init{
}
:
	(
		a0 = BAGTYPE		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBagType();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BAGTYPE");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_39_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 91);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBagType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_39_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 92, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
	}
	
	(
		a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBagType();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__ELEMENT_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_39_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 93);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBagType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_39_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 94);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 94);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetType returns [it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetType element = null]
@init{
}
:
	(
		a0 = ORDEREDSETTYPE		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOrderedSetType();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ORDEREDSETTYPE");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_40_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_105, 95);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOrderedSetType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_40_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
	}
	
	(
		a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOrderedSetType();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__ELEMENT_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_40_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 97);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOrderedSetType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_40_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 98);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 98);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceType returns [it.univaq.coevolution.emfmigrate.EmigOcl.SequenceType element = null]
@init{
}
:
	(
		a0 = SEQUENCETYPE		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSequenceType();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SEQUENCETYPE");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_41_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 99);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSequenceType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_41_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 100, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
	}
	
	(
		a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSequenceType();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__ELEMENT_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_41_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 101);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSequenceType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_41_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 102);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 102);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_SetType returns [it.univaq.coevolution.emfmigrate.EmigOcl.SetType element = null]
@init{
}
:
	(
		a0 = SETTYPE		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSetType();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SETTYPE");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_42_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 103);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSetType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_42_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 104, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
	}
	
	(
		a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSetType();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__ELEMENT_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_42_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 105);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSetType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_42_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 106);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclAnyType returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType element = null]
@init{
}
:
	(
		a0 = OCLANYTYPE		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclAnyType();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("OCLANYTYPE");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_43_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 107);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 107);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_TupleType returns [it.univaq.coevolution.emfmigrate.EmigOcl.TupleType element = null]
@init{
}
:
	(
		a0 = TUPLETYPE		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleType();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TUPLETYPE");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_44_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 108);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_44_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 109, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 109);
	}
	
	(
		(
			(
				a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_TupleTypeAttribute				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleType();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__ATTRIBUTES, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_44_0_0_2_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 110);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 110);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleType();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_44_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 111, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
					}
					
					(
						a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_TupleTypeAttribute						{
							if (terminateParsing) {
								throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
							}
							if (element == null) {
								element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleType();
								incompleteObjects.push(element);
							}
							if (a4_0 != null) {
								if (a4_0 != null) {
									Object value = a4_0;
									addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__ATTRIBUTES, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_44_0_0_2_0_0_1_0_0_1, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 112);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 112);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 113);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 113);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 114);
	}
	
	a5 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_44_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 115);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 115);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_TupleTypeAttribute returns [it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleTypeAttribute();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE_ATTRIBUTE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE_ATTRIBUTE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_45_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 116);
	}
	
	a1 = ':' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleTypeAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_45_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
	}
	
	(
		a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleTypeAttribute();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE_ATTRIBUTE__TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_45_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 118);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 118);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElement returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModelElement();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__MODEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				it.univaq.coevolution.emfmigrate.EmigOcl.OclModel proxy = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModel();
				collectHiddenTokens(element);
				registerContextDependentProxy(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclContextDependentURIFragmentFactory<it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement, it.univaq.coevolution.emfmigrate.EmigOcl.OclModel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__MODEL), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__MODEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_46_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 119);
	}
	
	a1 = '!' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModelElement();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_46_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 120);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModelElement();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_46_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 121);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 121);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_MapType returns [it.univaq.coevolution.emfmigrate.EmigOcl.MapType element = null]
@init{
}
:
	(
		a0 = MAPTYPE		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapType();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MAPTYPE");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_47_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 122);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_47_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
	}
	
	(
		a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapType();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__KEY_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_47_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 124);
	}
	
	a3 = ',' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_47_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	}
	
	(
		a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapType();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__VALUE_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_47_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 126);
	}
	
	a5 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_47_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 127);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 127);
	}
	
;

parseop_OclExpression_level_1 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
	arg = parseop_OclExpression_level_2	(
		a0 = '.' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createNavigationOrAttributeCallExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_24_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 128);
		}
		
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createNavigationOrAttributeCallExp();
					incompleteObjects.push(element);
				}
				if (a1 != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NAVIGATION_OR_ATTRIBUTE_CALL_EXP__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NAVIGATION_OR_ATTRIBUTE_CALL_EXP__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_24_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 129);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 129);
		}
		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createNavigationOrAttributeCallExp();
				incompleteObjects.push(element);
			}
			if (arg != null) {
				if (arg != null) {
					Object value = arg;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NAVIGATION_OR_ATTRIBUTE_CALL_EXP__SOURCE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_24_0_0_0, arg, true);
				copyLocalizationInfos(arg, element);
			}
		}
		|		
		/* epsilon */ { element = arg; } 		
	)
;

parseop_OclExpression_level_2 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
	arg = parseop_OclExpression_level_3	(
		a0 = '.' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperationCallExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_25_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 130);
		}
		
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperationCallExp();
					incompleteObjects.push(element);
				}
				if (a1 != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION_CALL_EXP__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION_CALL_EXP__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_25_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 131);
		}
		
		a2 = '(' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperationCallExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_25_0_0_3, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 132);
		}
		
		(
			(
				(
					a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression					{
						if (terminateParsing) {
							throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
						}
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperationCallExp();
							incompleteObjects.push(element);
						}
						if (a3_0 != null) {
							if (a3_0 != null) {
								Object value = a3_0;
								addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION_CALL_EXP__ARGUMENTS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_25_0_0_4_0_0_0, a3_0, true);
							copyLocalizationInfos(a3_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_119, 133);
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 133);
				}
				
				(
					(
						a4 = ',' {
							if (element == null) {
								element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperationCallExp();
								incompleteObjects.push(element);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_25_0_0_4_0_0_1_0_0_0, null, true);
							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
						}
						{
							// expected elements (follow set)
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
						}
						
						(
							a5_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression							{
								if (terminateParsing) {
									throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
								}
								if (element == null) {
									element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperationCallExp();
									incompleteObjects.push(element);
								}
								if (a5_0 != null) {
									if (a5_0 != null) {
										Object value = a5_0;
										addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION_CALL_EXP__ARGUMENTS, value);
										completedElement(value, true);
									}
									collectHiddenTokens(element);
									retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_25_0_0_4_0_0_1_0_0_1, a5_0, true);
									copyLocalizationInfos(a5_0, element);
								}
							}
						)
						{
							// expected elements (follow set)
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_119, 135);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 135);
						}
						
					)
					
				)*				{
					// expected elements (follow set)
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_119, 136);
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 136);
				}
				
			)
			
		)?		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 137);
		}
		
		a6 = ')' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperationCallExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_25_0_0_5, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 138);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 138);
		}
		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperationCallExp();
				incompleteObjects.push(element);
			}
			if (arg != null) {
				if (arg != null) {
					Object value = arg;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION_CALL_EXP__SOURCE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_25_0_0_0, arg, true);
				copyLocalizationInfos(arg, element);
			}
		}
		|		
		/* epsilon */ { element = arg; } 		
	)
;

parseop_OclExpression_level_3 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
	arg = parseop_OclExpression_level_4	(
		a0 = '->' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionOperationCallExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_27_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_120, 139);
		}
		
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionOperationCallExp();
					incompleteObjects.push(element);
				}
				if (a1 != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_OPERATION_CALL_EXP__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_OPERATION_CALL_EXP__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_27_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_121, 140);
		}
		
		a2 = '(' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionOperationCallExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_27_0_0_3, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_122, 141);
		}
		
		(
			(
				(
					a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression					{
						if (terminateParsing) {
							throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
						}
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionOperationCallExp();
							incompleteObjects.push(element);
						}
						if (a3_0 != null) {
							if (a3_0 != null) {
								Object value = a3_0;
								addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_OPERATION_CALL_EXP__ARGUMENTS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_27_0_0_4_0_0_0, a3_0, true);
							copyLocalizationInfos(a3_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_123, 142);
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_122, 142);
				}
				
				(
					(
						a4 = ',' {
							if (element == null) {
								element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionOperationCallExp();
								incompleteObjects.push(element);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_27_0_0_4_0_0_1_0_0_0, null, true);
							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
						}
						{
							// expected elements (follow set)
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
						}
						
						(
							a5_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression							{
								if (terminateParsing) {
									throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
								}
								if (element == null) {
									element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionOperationCallExp();
									incompleteObjects.push(element);
								}
								if (a5_0 != null) {
									if (a5_0 != null) {
										Object value = a5_0;
										addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_OPERATION_CALL_EXP__ARGUMENTS, value);
										completedElement(value, true);
									}
									collectHiddenTokens(element);
									retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_27_0_0_4_0_0_1_0_0_1, a5_0, true);
									copyLocalizationInfos(a5_0, element);
								}
							}
						)
						{
							// expected elements (follow set)
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_123, 144);
							addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_122, 144);
						}
						
					)
					
				)*				{
					// expected elements (follow set)
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_123, 145);
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_122, 145);
				}
				
			)
			
		)?		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_122, 146);
		}
		
		a6 = ')' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionOperationCallExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_27_0_0_5, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 147);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 147);
		}
		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionOperationCallExp();
				incompleteObjects.push(element);
			}
			if (arg != null) {
				if (arg != null) {
					Object value = arg;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_OPERATION_CALL_EXP__SOURCE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_27_0_0_0, arg, true);
				copyLocalizationInfos(arg, element);
			}
		}
		|		
		/* epsilon */ { element = arg; } 		
	)
;

parseop_OclExpression_level_4 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
	arg = parseop_OclExpression_level_5	(
		a0 = '->' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_29_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_124, 148);
		}
		
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
					incompleteObjects.push(element);
				}
				if (a1 != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_29_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_125, 149);
		}
		
		a2 = '(' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_29_0_0_3, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_95, 150, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_21);
		}
		
		(
			a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
					incompleteObjects.push(element);
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						Object value = a3_0;
						addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__ITERATORS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_29_0_0_4, a3_0, true);
					copyLocalizationInfos(a3_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 151);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 151);
		}
		
		(
			(
				a4 = ',' {
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
						incompleteObjects.push(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_29_0_0_5_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_95, 152, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_21);
				}
				
				(
					a5_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator					{
						if (terminateParsing) {
							throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
						}
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
							incompleteObjects.push(element);
						}
						if (a5_0 != null) {
							if (a5_0 != null) {
								Object value = a5_0;
								addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__ITERATORS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_29_0_0_5_0_0_1, a5_0, true);
							copyLocalizationInfos(a5_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 153);
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 153);
				}
				
			)
			
		)*		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 154);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 154);
		}
		
		a6 = '|' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_29_0_0_6, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 155, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
		}
		
		(
			a7_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
					incompleteObjects.push(element);
				}
				if (a7_0 != null) {
					if (a7_0 != null) {
						Object value = a7_0;
						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__BODY), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_29_0_0_7, a7_0, true);
					copyLocalizationInfos(a7_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_126, 156);
		}
		
		a8 = ')' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_29_0_0_8, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 157);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 157);
		}
		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
				incompleteObjects.push(element);
			}
			if (arg != null) {
				if (arg != null) {
					Object value = arg;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__SOURCE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_29_0_0_0, arg, true);
				copyLocalizationInfos(arg, element);
			}
		}
		|		
		/* epsilon */ { element = arg; } 		
	)
;

parseop_OclExpression_level_5 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
	arg = parseop_OclExpression_level_20	(
		a0 = '->' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_128, 158);
		}
		
		a1 = 'iterate' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_2, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_129, 159);
		}
		
		a2 = '(' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_3, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_95, 160, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_21);
		}
		
		(
			a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
					incompleteObjects.push(element);
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						Object value = a3_0;
						addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATE_EXP__ITERATORS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_4, a3_0, true);
					copyLocalizationInfos(a3_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_97, 161);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_98, 161);
		}
		
		(
			(
				a4 = ',' {
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
						incompleteObjects.push(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_5_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_95, 162, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_21);
				}
				
				(
					a5_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator					{
						if (terminateParsing) {
							throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
						}
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
							incompleteObjects.push(element);
						}
						if (a5_0 != null) {
							if (a5_0 != null) {
								Object value = a5_0;
								addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATE_EXP__ITERATORS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_5_0_0_1, a5_0, true);
							copyLocalizationInfos(a5_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_97, 163);
					addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_98, 163);
				}
				
			)
			
		)*		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_97, 164);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_98, 164);
		}
		
		a6 = ';' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_6, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 165, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_23);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 165, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_23);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_95, 165, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_23);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 165, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_23);
		}
		
		(
			a7_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_VariableDeclaration			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
					incompleteObjects.push(element);
				}
				if (a7_0 != null) {
					if (a7_0 != null) {
						Object value = a7_0;
						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATE_EXP__RESULT), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_7, a7_0, true);
					copyLocalizationInfos(a7_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 166);
		}
		
		a8 = '|' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_8, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 167, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
		}
		
		(
			a9_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
					incompleteObjects.push(element);
				}
				if (a9_0 != null) {
					if (a9_0 != null) {
						Object value = a9_0;
						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATE_EXP__BODY), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_9, a9_0, true);
					copyLocalizationInfos(a9_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_130, 168);
		}
		
		a10 = ')' {
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_10, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a10, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 169);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 169);
		}
		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
				incompleteObjects.push(element);
			}
			if (arg != null) {
				if (arg != null) {
					Object value = arg;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATE_EXP__SOURCE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_0, arg, true);
				copyLocalizationInfos(arg, element);
			}
		}
		|		
		/* epsilon */ { element = arg; } 		
	)
;

parseop_OclExpression_level_20 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
	c0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_VariableExp{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_SuperExp{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_StringExp{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanExp{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_RealExp{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerExp{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_BagExp{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetExp{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceExp{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_SetExp{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_TupleExp{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_MapExp{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_EnumLiteralExp{ element = c12; /* this is a subclass or primitive expression choice */ }
	|	c13 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclUndefinedExp{ element = c13; /* this is a subclass or primitive expression choice */ }
	|	c14 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_LetExp{ element = c14; /* this is a subclass or primitive expression choice */ }
	|	c15 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_IfExp{ element = c15; /* this is a subclass or primitive expression choice */ }
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_VariableExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createVariableExp();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__REFERRED_VARIABLE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration proxy = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createVariableDeclaration();
				collectHiddenTokens(element);
				registerContextDependentProxy(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclContextDependentURIFragmentFactory<it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp, it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableExpReferredVariableReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__REFERRED_VARIABLE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__REFERRED_VARIABLE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_8_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 170);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 170);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_SuperExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.SuperExp element = null]
@init{
}
:
	a0 = 'super' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSuperExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 171);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 171);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_StringExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.StringExp element = null]
@init{
}
:
	(
		a0 = STRING		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createStringExp();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__STRING_SYMBOL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__STRING_SYMBOL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_10_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 172);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 172);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp element = null]
@init{
}
:
	(
		(
			a0 = 'true' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBooleanExp();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_11_0_0_0, true, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__BOOLEAN_SYMBOL), value);
				completedElement(value, false);
			}
			|			a1 = 'false' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBooleanExp();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_11_0_0_0, false, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
				// set value of boolean attribute
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__BOOLEAN_SYMBOL), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 173);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 173);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_RealExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.RealExp element = null]
@init{
}
:
	(
		a0 = FLOAT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createRealExp();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__REAL_SYMBOL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__REAL_SYMBOL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_12_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 174);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 174);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp element = null]
@init{
}
:
	(
		a0 = INTEGER		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIntegerExp();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__INTEGER_SYMBOL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__INTEGER_SYMBOL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_13_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 175);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 175);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_BagExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.BagExp element = null]
@init{
}
:
	a0 = 'Bag' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBagExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_14_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_131, 176);
	}
	
	a1 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBagExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_14_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 177);
	}
	
	(
		(
			(
				a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBagExp();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__ELEMENTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_14_0_0_2_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 178);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 178);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBagExp();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_14_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
					}
					
					(
						a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression						{
							if (terminateParsing) {
								throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
							}
							if (element == null) {
								element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBagExp();
								incompleteObjects.push(element);
							}
							if (a4_0 != null) {
								if (a4_0 != null) {
									Object value = a4_0;
									addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__ELEMENTS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_14_0_0_2_0_0_1_0_0_1, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 180);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 180);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 181);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 181);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 182);
	}
	
	a5 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBagExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_14_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 183);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 183);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp element = null]
@init{
}
:
	a0 = 'OrderedSet' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOrderedSetExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_15_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_132, 184);
	}
	
	a1 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOrderedSetExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_15_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 185);
	}
	
	(
		(
			(
				a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOrderedSetExp();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__ELEMENTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_15_0_0_2_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 186);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 186);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOrderedSetExp();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_15_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
					}
					
					(
						a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression						{
							if (terminateParsing) {
								throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
							}
							if (element == null) {
								element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOrderedSetExp();
								incompleteObjects.push(element);
							}
							if (a4_0 != null) {
								if (a4_0 != null) {
									Object value = a4_0;
									addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__ELEMENTS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_15_0_0_2_0_0_1_0_0_1, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 188);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 188);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 189);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 189);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 190);
	}
	
	a5 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOrderedSetExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_15_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 191);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 191);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp element = null]
@init{
}
:
	a0 = 'Sequence' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSequenceExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_133, 192);
	}
	
	a1 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSequenceExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_16_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 193);
	}
	
	(
		(
			(
				a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSequenceExp();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__ELEMENTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_16_0_0_2_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 194);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 194);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSequenceExp();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_16_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
					}
					
					(
						a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression						{
							if (terminateParsing) {
								throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
							}
							if (element == null) {
								element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSequenceExp();
								incompleteObjects.push(element);
							}
							if (a4_0 != null) {
								if (a4_0 != null) {
									Object value = a4_0;
									addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__ELEMENTS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_16_0_0_2_0_0_1_0_0_1, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 196);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 196);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 197);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 197);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 198);
	}
	
	a5 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSequenceExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_16_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 199);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 199);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_SetExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.SetExp element = null]
@init{
}
:
	a0 = 'Set' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSetExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_17_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_134, 200);
	}
	
	a1 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSetExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_17_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 201);
	}
	
	(
		(
			(
				a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSetExp();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__ELEMENTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_17_0_0_2_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 202);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 202);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSetExp();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_17_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
					}
					
					(
						a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression						{
							if (terminateParsing) {
								throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
							}
							if (element == null) {
								element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSetExp();
								incompleteObjects.push(element);
							}
							if (a4_0 != null) {
								if (a4_0 != null) {
									Object value = a4_0;
									addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__ELEMENTS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_17_0_0_2_0_0_1_0_0_1, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 204);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 204);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 205);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 205);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 206);
	}
	
	a5 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSetExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_17_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 207);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 207);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_TupleExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp element = null]
@init{
}
:
	a0 = 'Tuple' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_18_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_135, 208);
	}
	
	a1 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_18_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 209, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_25);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 209);
	}
	
	(
		(
			(
				a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_TuplePart				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleExp();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__TUPLE_PART, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_18_0_0_2_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 210);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 210);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleExp();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_18_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 211, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_25);
					}
					
					(
						a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_TuplePart						{
							if (terminateParsing) {
								throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
							}
							if (element == null) {
								element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleExp();
								incompleteObjects.push(element);
							}
							if (a4_0 != null) {
								if (a4_0 != null) {
									Object value = a4_0;
									addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__TUPLE_PART, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_18_0_0_2_0_0_1_0_0_1, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 212);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 212);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 213);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 213);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 214);
	}
	
	a5 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_18_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 215);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 215);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_MapExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.MapExp element = null]
@init{
}
:
	a0 = 'Map' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_20_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_136, 216);
	}
	
	a1 = '{' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_20_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_88, 217, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_26);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_91, 217);
	}
	
	(
		(
			(
				a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_MapElement				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapExp();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__ELEMENTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_20_0_0_2_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_90, 218);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_91, 218);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapExp();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_20_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_88, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_26);
					}
					
					(
						a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_MapElement						{
							if (terminateParsing) {
								throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
							}
							if (element == null) {
								element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapExp();
								incompleteObjects.push(element);
							}
							if (a4_0 != null) {
								if (a4_0 != null) {
									Object value = a4_0;
									addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__ELEMENTS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_20_0_0_2_0_0_1_0_0_1, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_90, 220);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_91, 220);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_90, 221);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_91, 221);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_91, 222);
	}
	
	a5 = '}' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_20_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 223);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 223);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_EnumLiteralExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp element = null]
@init{
}
:
	a0 = '#' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createEnumLiteralExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_22_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_137, 224);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createEnumLiteralExp();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_22_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 225);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 225);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclUndefinedExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclUndefinedExp element = null]
@init{
}
:
	a0 = 'OclUndefined' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclUndefinedExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_23_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 226);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 226);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_LetExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.LetExp element = null]
@init{
}
:
	a0 = 'let' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createLetExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_31_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 227, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_27);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 227, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_27);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_95, 227, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_27);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 227, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_27);
	}
	
	(
		a1_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_VariableDeclaration		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createLetExp();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__VARIABLE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_31_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 228);
	}
	
	a2 = 'in' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createLetExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_31_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 229, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
	}
	
	(
		a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createLetExp();
				incompleteObjects.push(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__IN_), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_31_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 230);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 230);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_IfExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.IfExp element = null]
@init{
}
:
	a0 = 'if' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIfExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_32_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 231, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
	}
	
	(
		a1_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIfExp();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_32_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 232);
	}
	
	a2 = 'then' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIfExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_32_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 233, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
	}
	
	(
		a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIfExp();
				incompleteObjects.push(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__THEN_EXPRESSION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_32_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_138, 234);
	}
	
	a4 = 'else' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIfExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_32_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 235, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
	}
	
	(
		a5_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIfExp();
				incompleteObjects.push(element);
			}
			if (a5_0 != null) {
				if (a5_0 != null) {
					Object value = a5_0;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__ELSE_EXPRESSION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_32_0_0_5, a5_0, true);
				copyLocalizationInfos(a5_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_139, 236);
	}
	
	a6 = 'endif' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIfExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_32_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 237);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 237);
	}
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeature returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature element = null]
:
	c0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Attribute{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Operation{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
:
	c = parseop_OclExpression_level_1{ element = c; /* this rule is an expression root */ }
	
;

TXTOP:
	(('not'|'and'|'or'|'xor'|'implies'|'div'|'mod'))
;
SYMOP:
	(('-'|'+'|'*'|'/'|'='|'>'|'<'|'>='|'<='))
;
COMMENT:
	('--'(~('\n'|'\r'|'\uffff'))*)
	{ _channel = 99; }
;
FLOAT:
	('-'?(('0'..'9'))+'.'(('0'..'9'))+)
;
INTEGER:
	('-'?(('0'..'9'))+)
;
STRINGTYPE:
	('String')
;
BOOLEANTYPE:
	('Boolean')
;
INTEGERTYPE:
	('Integer')
;
REALTYPE:
	('Real')
;
BAGTYPE:
	'Bag';
ORDEREDSETTYPE:
	'OrderedSet';
SEQUENCETYPE:
	'Sequence';
SETTYPE:
	'Set';
OCLANYTYPE:
	('OclAny')
;
TUPLETYPE:
	'Tuple';
MAPTYPE:
	'Map';
STRING:
	('"'.*'"')
;
TEXT:
	(('A'..'Z'|'a'..'z')(('A'..'Z'|'a'..'z')|('0'..'9')|'-'|'_')*)
;
LINEBREAK:
	(('\r\n'|'\'r'|'\n'))
	{ _channel = 99; }
;
WHITESPACE:
	((' '|'\t'|'\f'))
	{ _channel = 99; }
;

