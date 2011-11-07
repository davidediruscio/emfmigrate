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
		int followSetID = 236;
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_3, 3);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_4, 3, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_0, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 3, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a3 = 'models' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_6, 4, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_2);
			}
			
			(
				a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclModel				{
					if (terminateParsing) {
						throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
					}
					if (element == null) {
						element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
						incompleteObjects.push(element);
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							Object value = a4_0;
							addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__MODELS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_3_0_0_2, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_7, 5);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_8, 5);
			}
			
			(
				(
					a5 = ',' {
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_3_0_0_3_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_6, 6, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_2);
					}
					
					(
						a6_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclModel						{
							if (terminateParsing) {
								throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
							}
							if (element == null) {
								element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
								incompleteObjects.push(element);
							}
							if (a6_0 != null) {
								if (a6_0 != null) {
									Object value = a6_0;
									addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__MODELS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_3_0_0_3_0_0_1, a6_0, true);
								copyLocalizationInfos(a6_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_7, 7);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_8, 7);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_7, 8);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_8, 8);
			}
			
			a7 = ';' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_3_0_0_4, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_4, 9, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_0, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 9, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_4, 10, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_0, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 10, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			(
				(
					a8_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeatureDefinition					{
						if (terminateParsing) {
							throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
						}
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createModule();
							incompleteObjects.push(element);
						}
						if (a8_0 != null) {
							if (a8_0 != null) {
								Object value = a8_0;
								addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__FEATURES, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_0_0_0_4_0_0_1, a8_0, true);
							copyLocalizationInfos(a8_0, element);
						}
					}
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_4, 11, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_0, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 11, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 13);
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_9, 14);
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_10, 15, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_3);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_11, 15, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_3);
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_4, 16, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_0, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 16, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 17, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_4);
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 18);
	}
	
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_3_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_25, 19);
	}
	
	a1 = ':' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_3_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_26, 20);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_3_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_7, 21);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_8, 21);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_4_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_27, 22);
	}
	
	a1 = ':' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_4_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 23, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 23, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 23, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 23, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 23, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 23, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 23, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 23, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 23, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 23, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 23, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 23, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 23, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_5);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_4_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 24);
	}
	
	a3 = '=' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_4_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 25, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_6);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_4_0_0_5, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 26);
	}
	
	a5 = ';' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_4_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_4, 27, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_0, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 27, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_50, 28);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 29, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_8);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 29);
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
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_2_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 30);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 30);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 31, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_8);
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
								retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_2_0_0_1_0_0_1, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 32);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 32);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 33);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 33);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 34);
	}
	
	a5 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_54, 35);
	}
	
	a6 = ':' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 36, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 36, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 36, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 36, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 36, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 36, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 36, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 36, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 36, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 36, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 36, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 36, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 36, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_9);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_5, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 37);
	}
	
	a8 = '=' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 38, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_10);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_8, a9_0, true);
				copyLocalizationInfos(a9_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 39);
	}
	
	a10 = ';' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_5_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_4, 40, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_0, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 40, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_1);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_57, 41);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 41);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 41);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 41);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 41);
	}
	
	(
		(
			a1 = ':' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createParameter();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 42, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 42, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 42, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 42, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 42, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 42, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 42, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 42, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 42, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 42, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 42, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 42, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 42, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
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
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_6_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 43);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 43);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 43);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 43);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_53, 44);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_52, 44);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 44);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 44);
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_61, 45);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 45);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 45);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 45);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 45);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 45);
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
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 46, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 46, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 46, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 46, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 46, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 46, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 46, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 46, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 46, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 46, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 46, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 46, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 46, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
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
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 47);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 47);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 47);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 47);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 47);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 48);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 48);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 48);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 48);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 48);
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
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 49, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
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
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 50);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 50);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 50);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 50);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 51);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 51);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 51);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 51);
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 52, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_13);
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 53);
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 54, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_14);
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_67, 55);
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 56);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 56);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_36_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_71, 57);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 57);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 57);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 57);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 57);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 57);
	}
	
	(
		(
			a1 = ':' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterator();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_36_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 58, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 58, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 58, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 58, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 58, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 58, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 58, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 58, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 58, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 58, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 58, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 58, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 58, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
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
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_36_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 59);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 59);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 59);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 59);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 59);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 60);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 60);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 60);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 60);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 60);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_40_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_77, 61);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 61);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 61);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 61);
	}
	
	(
		(
			a1 = ':' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createVariableDeclaration();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_40_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 62, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_11);
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
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_40_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 63);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 63);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 63);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 64);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 64);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 64);
	}
	
	(
		(
			a3 = '=' {
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createVariableDeclaration();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_40_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 65, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_12);
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
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_40_0_0_2_0_0_1, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 66);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 66);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 67);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 67);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_41_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_79, 68);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_41_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 69, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_41_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 70);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_41_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 71);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 71);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_42_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 72);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 72);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_43_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 73);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 73);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_44_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 74);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 74);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_45_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 75);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 75);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_46_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_88, 76);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBagType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_46_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 77, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_46_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 78);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBagType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_46_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 79);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 79);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_47_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_89, 80);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOrderedSetType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_47_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 81, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 81, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 81, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 81, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 81, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 81, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 81, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 81, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 81, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 81, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 81, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 81, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 81, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_47_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 82);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOrderedSetType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_47_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 83);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 83);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_48_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_90, 84);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSequenceType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_48_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 85, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 85, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 85, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 85, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 85, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 85, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 85, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 85, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 85, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 85, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 85, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 85, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 85, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_48_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 86);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSequenceType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_48_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 87);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 87);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_49_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_91, 88);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSetType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_49_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 89, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 89, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 89, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 89, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 89, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 89, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 89, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 89, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 89, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 89, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 89, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 89, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 89, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_15);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_49_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 90);
	}
	
	a3 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSetType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_49_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 91);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 91);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_50_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 92);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 92);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_51_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_92, 93);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_51_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_93, 94, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 94);
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
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_51_0_0_2_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 95);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 95);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleType();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_51_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_93, 96, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_16);
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
								retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_51_0_0_2_0_0_1_0_0_1, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 97);
						addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 97);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 98);
				addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 98);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 99);
	}
	
	a5 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_51_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 100);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 100);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_52_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_94, 101);
	}
	
	a1 = ':' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createTupleTypeAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_52_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 102, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 102, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 102, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 102, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 102, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 102, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 102, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 102, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 102, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 102, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 102, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 102, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 102, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_17);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_52_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 103);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 103);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_53_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_95, 104);
	}
	
	a1 = '!' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModelElement();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_53_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_96, 105);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_53_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 106);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 106);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_54_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_97, 107);
	}
	
	a1 = '(' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_54_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 108, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 108, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 108, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 108, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 108, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 108, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 108, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 108, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 108, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 108, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 108, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 108, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 108, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_18);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_54_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 109);
	}
	
	a3 = ',' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_54_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_12, 110, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_13, 110, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_14, 110, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_15, 110, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_16, 110, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_17, 110, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_18, 110, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_19, 110, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_20, 110, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_21, 110, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_22, 110, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_23, 110, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_24, 110, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_19);
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_54_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_98, 111);
	}
	
	a5 = ')' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMapType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_54_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_5, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_28, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_55, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_62, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_78, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_80, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_81, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_82, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_83, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_84, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_85, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_86, 112);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_87, 112);
	}
	
;

parseop_OclExpression_level_1 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
	leftArg = parseop_OclExpression_level_2	((
		()
		{ element = null; }
		(
			a0 = BOOLOP			
			{
				if (terminateParsing) {
					throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
				}
				if (element == null) {
					element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperatorCallExp();
					incompleteObjects.push(element);
				}
				if (a0 != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BOOLOP");
					tokenResolver.setOptions(getOptions());
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_26_0_0_1, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
			addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 113, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		}
		
		rightArg = parseop_OclExpression_level_2		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperatorCallExp();
				incompleteObjects.push(element);
			}
			if (leftArg != null) {
				if (leftArg != null) {
					Object value = leftArg;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__SOURCE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_26_0_0_0, leftArg, true);
				copyLocalizationInfos(leftArg, element);
			}
		}
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOperatorCallExp();
				incompleteObjects.push(element);
			}
			if (rightArg != null) {
				if (rightArg != null) {
					Object value = rightArg;
					addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__ARGUMENTS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_26_0_0_2, rightArg, true);
				copyLocalizationInfos(rightArg, element);
			}
		}
		{ leftArg = element; /* this may become an argument in the next iteration */ }
	)+ | /* epsilon */ { element = leftArg; }
	
)
;

parseop_OclExpression_level_2 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
leftArg = parseop_OclExpression_level_3((
	()
	{ element = null; }
	(
		a0 = RELOP		
		{
			if (terminateParsing) {
				throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
			}
			if (element == null) {
				element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createRelOpCallExp();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("RELOP");
				tokenResolver.setOptions(getOptions());
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__OPERATION_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__OPERATION_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_27_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 114, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	}
	
	rightArg = parseop_OclExpression_level_3	{
		if (terminateParsing) {
			throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
		}
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createRelOpCallExp();
			incompleteObjects.push(element);
		}
		if (leftArg != null) {
			if (leftArg != null) {
				Object value = leftArg;
				element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__SOURCE), value);
				completedElement(value, true);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_27_0_0_0, leftArg, true);
			copyLocalizationInfos(leftArg, element);
		}
	}
	{
		if (terminateParsing) {
			throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
		}
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createRelOpCallExp();
			incompleteObjects.push(element);
		}
		if (rightArg != null) {
			if (rightArg != null) {
				Object value = rightArg;
				addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__ARGUMENTS, value);
				completedElement(value, true);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_27_0_0_2, rightArg, true);
			copyLocalizationInfos(rightArg, element);
		}
	}
	{ leftArg = element; /* this may become an argument in the next iteration */ }
)+ | /* epsilon */ { element = leftArg; }

)
;

parseop_OclExpression_level_3 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
leftArg = parseop_OclExpression_level_4((
()
{ element = null; }
(
	a0 = ADDOP	
	{
		if (terminateParsing) {
			throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
		}
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createAddOpCallExp();
			incompleteObjects.push(element);
		}
		if (a0 != null) {
			it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ADDOP");
			tokenResolver.setOptions(getOptions());
			it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
			tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__OPERATION_NAME), result);
			Object resolvedObject = result.getResolvedToken();
			if (resolvedObject == null) {
				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
			}
			java.lang.String resolved = (java.lang.String) resolvedObject;
			if (resolved != null) {
				Object value = resolved;
				element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__OPERATION_NAME), value);
				completedElement(value, false);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_1, resolved, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
		}
	}
)
{
	// expected elements (follow set)
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 115, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
}

rightArg = parseop_OclExpression_level_4{
	if (terminateParsing) {
		throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
	}
	if (element == null) {
		element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createAddOpCallExp();
		incompleteObjects.push(element);
	}
	if (leftArg != null) {
		if (leftArg != null) {
			Object value = leftArg;
			element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__SOURCE), value);
			completedElement(value, true);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_0, leftArg, true);
		copyLocalizationInfos(leftArg, element);
	}
}
{
	if (terminateParsing) {
		throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
	}
	if (element == null) {
		element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createAddOpCallExp();
		incompleteObjects.push(element);
	}
	if (rightArg != null) {
		if (rightArg != null) {
			Object value = rightArg;
			addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__ARGUMENTS, value);
			completedElement(value, true);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_28_0_0_2, rightArg, true);
		copyLocalizationInfos(rightArg, element);
	}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
)+ | /* epsilon */ { element = leftArg; }

)
;

parseop_OclExpression_level_4 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
leftArg = parseop_OclExpression_level_5((
()
{ element = null; }
(
a0 = INTOP
{
	if (terminateParsing) {
		throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
	}
	if (element == null) {
		element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIntOpCallExp();
		incompleteObjects.push(element);
	}
	if (a0 != null) {
		it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTOP");
		tokenResolver.setOptions(getOptions());
		it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
		tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__OPERATION_NAME), result);
		Object resolvedObject = result.getResolvedToken();
		if (resolvedObject == null) {
			addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
		}
		java.lang.String resolved = (java.lang.String) resolvedObject;
		if (resolved != null) {
			Object value = resolved;
			element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__OPERATION_NAME), value);
			completedElement(value, false);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_29_0_0_1, resolved, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 116, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
}

rightArg = parseop_OclExpression_level_5{
if (terminateParsing) {
	throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
}
if (element == null) {
	element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIntOpCallExp();
	incompleteObjects.push(element);
}
if (leftArg != null) {
	if (leftArg != null) {
		Object value = leftArg;
		element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__SOURCE), value);
		completedElement(value, true);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_29_0_0_0, leftArg, true);
	copyLocalizationInfos(leftArg, element);
}
}
{
if (terminateParsing) {
	throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
}
if (element == null) {
	element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIntOpCallExp();
	incompleteObjects.push(element);
}
if (rightArg != null) {
	if (rightArg != null) {
		Object value = rightArg;
		addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__ARGUMENTS, value);
		completedElement(value, true);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_29_0_0_2, rightArg, true);
	copyLocalizationInfos(rightArg, element);
}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
)+ | /* epsilon */ { element = leftArg; }

)
;

parseop_OclExpression_level_5 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
leftArg = parseop_OclExpression_level_6((
()
{ element = null; }
(
a0 = MULOP
{
if (terminateParsing) {
	throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
}
if (element == null) {
	element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMulOpCallExp();
	incompleteObjects.push(element);
}
if (a0 != null) {
	it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MULOP");
	tokenResolver.setOptions(getOptions());
	it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
	tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__OPERATION_NAME), result);
	Object resolvedObject = result.getResolvedToken();
	if (resolvedObject == null) {
		addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
	}
	java.lang.String resolved = (java.lang.String) resolvedObject;
	if (resolved != null) {
		Object value = resolved;
		element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__OPERATION_NAME), value);
		completedElement(value, false);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_30_0_0_1, resolved, true);
	copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 117, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
}

rightArg = parseop_OclExpression_level_6{
if (terminateParsing) {
throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
}
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMulOpCallExp();
incompleteObjects.push(element);
}
if (leftArg != null) {
if (leftArg != null) {
	Object value = leftArg;
	element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__SOURCE), value);
	completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_30_0_0_0, leftArg, true);
copyLocalizationInfos(leftArg, element);
}
}
{
if (terminateParsing) {
throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
}
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createMulOpCallExp();
incompleteObjects.push(element);
}
if (rightArg != null) {
if (rightArg != null) {
	Object value = rightArg;
	addObjectToList(element, it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__ARGUMENTS, value);
	completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_30_0_0_2, rightArg, true);
copyLocalizationInfos(rightArg, element);
}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
)+ | /* epsilon */ { element = leftArg; }

)
;

parseop_OclExpression_level_6 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
(
a0 = NOTOP
{
if (terminateParsing) {
throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
}
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createNotOpCallExp();
incompleteObjects.push(element);
}
if (a0 != null) {
it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NOTOP");
tokenResolver.setOptions(getOptions());
it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__OPERATION_NAME), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
}
java.lang.String resolved = (java.lang.String) resolvedObject;
if (resolved != null) {
Object value = resolved;
element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__OPERATION_NAME), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_31_0_0_0, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 118, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
}

arg = parseop_OclExpression_level_10{
if (terminateParsing) {
throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
}
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createNotOpCallExp();
incompleteObjects.push(element);
}
if (arg != null) {
if (arg != null) {
Object value = arg;
element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__SOURCE), value);
completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_31_0_0_1, arg, true);
copyLocalizationInfos(arg, element);
}
}
|

arg = parseop_OclExpression_level_10{ element = arg; }
;

parseop_OclExpression_level_10 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
arg = parseop_OclExpression_level_11(
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_105, 119);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 120);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 120);
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

parseop_OclExpression_level_11 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
arg = parseop_OclExpression_level_12(
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_119, 121);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_120, 122);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 123, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_121, 123);
}

(
(
(
a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression{
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_122, 124);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_121, 124);
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 125, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	}
	
	(
		a5_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
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
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_122, 126);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_121, 126);
	}
	
)

)*{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_122, 127);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_121, 127);
}

)

)?{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_121, 128);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 129);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 129);
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

parseop_OclExpression_level_12 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
arg = parseop_OclExpression_level_13(
a0 = '->' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionOperationCallExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_33_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_123, 130);
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_33_0_0_2, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_124, 131);
}

a2 = '(' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionOperationCallExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_33_0_0_3, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 132, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_125, 132);
}

(
(
(
a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression{
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
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_33_0_0_4_0_0_0, a3_0, true);
		copyLocalizationInfos(a3_0, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_126, 133);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_125, 133);
}

(
(
	a4 = ',' {
		if (element == null) {
			element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionOperationCallExp();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_33_0_0_4_0_0_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 134, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_20);
	}
	
	(
		a5_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression		{
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
				retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_33_0_0_4_0_0_1_0_0_1, a5_0, true);
				copyLocalizationInfos(a5_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_126, 135);
		addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_125, 135);
	}
	
)

)*{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_126, 136);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_125, 136);
}

)

)?{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_125, 137);
}

a6 = ')' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createCollectionOperationCallExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_33_0_0_5, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 138);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 138);
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_33_0_0_0, arg, true);
copyLocalizationInfos(arg, element);
}
}
|
/* epsilon */ { element = arg; } 
)
;

parseop_OclExpression_level_13 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
arg = parseop_OclExpression_level_14(
a0 = '->' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_35_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_127, 139);
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_35_0_0_2, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_128, 140);
}

a2 = '(' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_35_0_0_3, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 141, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_21);
}

(
a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator{
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_35_0_0_4, a3_0, true);
copyLocalizationInfos(a3_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 142);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 142);
}

(
(
a4 = ',' {
if (element == null) {
	element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
	incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_35_0_0_5_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 143, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_21);
}

(
a5_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator{
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
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_35_0_0_5_0_0_1, a5_0, true);
		copyLocalizationInfos(a5_0, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 144);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 144);
}

)

)*{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_74, 145);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_75, 145);
}

a6 = '|' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_35_0_0_6, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 146, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
}

(
a7_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression{
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_35_0_0_7, a7_0, true);
copyLocalizationInfos(a7_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_129, 147);
}

a8 = ')' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIteratorExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_35_0_0_8, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 148);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 148);
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_35_0_0_0, arg, true);
copyLocalizationInfos(arg, element);
}
}
|
/* epsilon */ { element = arg; } 
)
;

parseop_OclExpression_level_14 returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
@init{
}
:
arg = parseop_OclExpression_level_20(
a0 = '->' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_131, 149);
}

a1 = 'iterate' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_2, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_132, 150);
}

a2 = '(' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_3, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 151, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_21);
}

(
a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator{
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_4, a3_0, true);
copyLocalizationInfos(a3_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 152);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 152);
}

(
(
a4 = ',' {
if (element == null) {
	element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
	incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_5_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 153, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_21);
}

(
a5_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator{
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
		retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_5_0_0_1, a5_0, true);
		copyLocalizationInfos(a5_0, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 154);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 154);
}

)

)*{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_72, 155);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_73, 155);
}

a6 = ';' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_6, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 156, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_23);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_60, 156, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_23);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 156, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_23);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 156, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_23);
}

(
a7_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_VariableDeclaration{
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_7, a7_0, true);
copyLocalizationInfos(a7_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 157);
}

a8 = '|' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_8, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 158, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_22);
}

(
a9_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression{
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_9, a9_0, true);
copyLocalizationInfos(a9_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_133, 159);
}

a10 = ')' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIterateExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_10, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a10, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 160);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 160);
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_34_0_0_0, arg, true);
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
|c1 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_SuperExp{ element = c1; /* this is a subclass or primitive expression choice */ }
|c2 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_SelfExp{ element = c2; /* this is a subclass or primitive expression choice */ }
|c3 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_StringExp{ element = c3; /* this is a subclass or primitive expression choice */ }
|c4 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanExp{ element = c4; /* this is a subclass or primitive expression choice */ }
|c5 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_RealExp{ element = c5; /* this is a subclass or primitive expression choice */ }
|c6 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerExp{ element = c6; /* this is a subclass or primitive expression choice */ }
|c7 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_BagExp{ element = c7; /* this is a subclass or primitive expression choice */ }
|c8 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetExp{ element = c8; /* this is a subclass or primitive expression choice */ }
|c9 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceExp{ element = c9; /* this is a subclass or primitive expression choice */ }
|c10 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_SetExp{ element = c10; /* this is a subclass or primitive expression choice */ }
|c11 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_TupleExp{ element = c11; /* this is a subclass or primitive expression choice */ }
|c12 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_MapExp{ element = c12; /* this is a subclass or primitive expression choice */ }
|c13 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_EnumLiteralExp{ element = c13; /* this is a subclass or primitive expression choice */ }
|c14 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclUndefinedExp{ element = c14; /* this is a subclass or primitive expression choice */ }
|c15 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_BraceExp{ element = c15; /* this is a subclass or primitive expression choice */ }
|c16 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_LetExp{ element = c16; /* this is a subclass or primitive expression choice */ }
|c17 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_IfExp{ element = c17; /* this is a subclass or primitive expression choice */ }
|c18 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElementExp{ element = c18; /* this is a subclass or primitive expression choice */ }
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_7_0_0_0, proxy, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 161);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 161);
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_8_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 162);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 162);
}

;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_SelfExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.SelfExp element = null]
@init{
}
:
a0 = 'self' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createSelfExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_9_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 163);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 163);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 164);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 164);
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
|a1 = 'false' {
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 165);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 165);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 166);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 166);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 167);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 167);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_134, 168);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 169, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 169);
}

(
(
(
a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression{
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 170);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 170);
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
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 171, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
}

(
	a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression	{
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
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 172);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 172);
}

)

)*{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 173);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 173);
}

)

)?{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 174);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 175);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 175);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_135, 176);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 177, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 177);
}

(
(
(
a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression{
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 178);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 178);
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
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 179, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
}

(
	a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression	{
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
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 180);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 180);
}

)

)*{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 181);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 181);
}

)

)?{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 182);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 183);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 183);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_136, 184);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 185, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 185);
}

(
(
(
a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression{
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 186);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 186);
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
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 187, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
}

(
	a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression	{
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
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 188);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 188);
}

)

)*{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 189);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 189);
}

)

)?{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 190);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 191);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 191);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_137, 192);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 193, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 193);
}

(
(
(
a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression{
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 194);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 194);
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
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 195, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_24);
}

(
	a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression	{
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
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 196);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 196);
}

)

)*{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 197);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 197);
}

)

)?{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 198);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 199);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 199);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_138, 200);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_60, 201, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_25);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 201);
}

(
(
(
a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_TuplePart{
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 202);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 202);
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
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_60, 203, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_25);
}

(
	a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_TuplePart	{
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
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 204);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 204);
}

)

)*{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 205);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 205);
}

)

)?{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 206);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 207);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 207);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_139, 208);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 209, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_26);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 209);
}

(
(
(
a2_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_MapElement{
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 210);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 210);
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
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_65, 211, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_26);
}

(
	a4_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_MapElement	{
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
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 212);
	addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 212);
}

)

)*{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_68, 213);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 213);
}

)

)?{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_69, 214);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 215);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 215);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_140, 216);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 217);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 217);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 218);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 218);
}

;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_BraceExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp element = null]
@init{
}
:
a0 = '(' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBraceExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_32_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 219, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7);
}

(
a1_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression{
if (terminateParsing) {
throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
}
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBraceExp();
incompleteObjects.push(element);
}
if (a1_0 != null) {
if (a1_0 != null) {
Object value = a1_0;
element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__SOURCE), value);
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
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 220);
}

a2 = ')' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createBraceExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_32_0_0_2, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 221);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 221);
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_37_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_51, 222, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_27);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_60, 222, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_27);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_70, 222, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_27);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_76, 222, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_27);
}

(
a1_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_VariableDeclaration{
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_37_0_0_1, a1_0, true);
copyLocalizationInfos(a1_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 223);
}

a2 = 'in' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createLetExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_37_0_0_2, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 224, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_28);
}

(
a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression{
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_37_0_0_3, a3_0, true);
copyLocalizationInfos(a3_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 225);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 225);
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_38_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 226, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_29);
}

(
a1_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression{
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_38_0_0_1, a1_0, true);
copyLocalizationInfos(a1_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 227);
}

a2 = 'then' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIfExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_38_0_0_2, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 228, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_30);
}

(
a3_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression{
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_38_0_0_3, a3_0, true);
copyLocalizationInfos(a3_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_141, 229);
}

a4 = 'else' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIfExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_38_0_0_4, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_29, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_30, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_31, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_32, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_33, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_34, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_35, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_36, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_37, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_38, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_39, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_40, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_41, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_42, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_43, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_44, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_45, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_46, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_47, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_48, 230, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_7, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.FEATURE_31);
}

(
a5_0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression{
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
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_38_0_0_5, a5_0, true);
copyLocalizationInfos(a5_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_142, 231);
}

a6 = 'endif' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createIfExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_38_0_0_6, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 232);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 232);
}

;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElementExp returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp element = null]
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
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModelElementExp();
incompleteObjects.push(element);
}
if (a0 != null) {
it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
tokenResolver.setOptions(getOptions());
it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__MODEL), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
}
String resolved = (String) resolvedObject;
it.univaq.coevolution.emfmigrate.EmigOcl.OclModel proxy = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModel();
collectHiddenTokens(element);
registerContextDependentProxy(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclContextDependentURIFragmentFactory<it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp, it.univaq.coevolution.emfmigrate.EmigOcl.OclModel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementExpModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__MODEL), resolved, proxy);
if (proxy != null) {
Object value = proxy;
element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__MODEL), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_39_0_0_0, proxy, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_143, 233);
}

a1 = '!' {
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModelElementExp();
incompleteObjects.push(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_39_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
}
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_144, 234);
}

(
a2 = TEXT
{
if (terminateParsing) {
throw new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTerminateParsingException();
}
if (element == null) {
element = it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory.eINSTANCE.createOclModelElementExp();
incompleteObjects.push(element);
}
if (a2 != null) {
it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
tokenResolver.setOptions(getOptions());
it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__NAME), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
}
java.lang.String resolved = (java.lang.String) resolvedObject;
if (resolved != null) {
Object value = resolved;
element.eSet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__NAME), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclGrammarInformationProvider.EMIGOCL_39_0_0_2, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_49, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_56, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_106, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_107, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_108, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_109, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_110, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_111, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_112, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_113, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_63, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_64, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_58, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_59, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_66, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_104, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_114, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_99, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_100, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_101, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_102, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_103, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_115, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_116, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_117, 235);
addExpectedElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFollowSetProvider.TERMINAL_118, 235);
}

;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeature returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature element = null]
:
c0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Attribute{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_Operation{ element = c1; /* this is a subclass or primitive expression choice */ }

;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclType returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclType element = null]
:
c0 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionType{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_StringType{ element = c1; /* this is a subclass or primitive expression choice */ }
|c2 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanType{ element = c2; /* this is a subclass or primitive expression choice */ }
|c3 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerType{ element = c3; /* this is a subclass or primitive expression choice */ }
|c4 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_RealType{ element = c4; /* this is a subclass or primitive expression choice */ }
|c5 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_BagType{ element = c5; /* this is a subclass or primitive expression choice */ }
|c6 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetType{ element = c6; /* this is a subclass or primitive expression choice */ }
|c7 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceType{ element = c7; /* this is a subclass or primitive expression choice */ }
|c8 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_SetType{ element = c8; /* this is a subclass or primitive expression choice */ }
|c9 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclAnyType{ element = c9; /* this is a subclass or primitive expression choice */ }
|c10 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_TupleType{ element = c10; /* this is a subclass or primitive expression choice */ }
|c11 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElement{ element = c11; /* this is a subclass or primitive expression choice */ }
|c12 = parse_it_univaq_coevolution_emfmigrate_EmigOcl_MapType{ element = c12; /* this is a subclass or primitive expression choice */ }

;

parse_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression returns [it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression element = null]
:
c = parseop_OclExpression_level_1{ element = c; /* this rule is an expression root */ }

;

NOTOP:
('not')
;
BOOLOP:
(('and'|'or'|'xor'|'implies'))
;
INTOP:
(('div'|'mod'))
;
RELOP:
(('='|'>'|'<'|'>='|'<='))
;
ADDOP:
(('-'|'+'))
;
MULOP:
(('*'|'/'))
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
('\''.*'\'')
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

