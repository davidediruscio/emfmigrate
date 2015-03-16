/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

public class EdeltaResource extends org.eclipse.emf.ecore.resource.impl.ResourceImpl implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource {
	
	public class ElementBasedTextDiagnostic implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextDiagnostic {
		
		private final it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaLocationMap locationMap;
		private final org.eclipse.emf.common.util.URI uri;
		private final org.eclipse.emf.ecore.EObject element;
		private final it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaProblem problem;
		
		public ElementBasedTextDiagnostic(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaLocationMap locationMap, org.eclipse.emf.common.util.URI uri, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaProblem problem, org.eclipse.emf.ecore.EObject element) {
			super();
			this.uri = uri;
			this.locationMap = locationMap;
			this.element = element;
			this.problem = problem;
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaProblem getProblem() {
			return problem;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public int getCharStart() {
			return Math.max(0, locationMap.getCharStart(element));
		}
		
		public int getCharEnd() {
			return Math.max(0, locationMap.getCharEnd(element));
		}
		
		public int getColumn() {
			return Math.max(0, locationMap.getColumn(element));
		}
		
		public int getLine() {
			return Math.max(0, locationMap.getLine(element));
		}
		
		public org.eclipse.emf.ecore.EObject getElement() {
			return element;
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			if (this.element == null) {
				return false;
			}
			return this.element.equals(element);
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	public class PositionBasedTextDiagnostic implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextDiagnostic {
		
		private final org.eclipse.emf.common.util.URI uri;
		
		private int column;
		private int line;
		private int charStart;
		private int charEnd;
		private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaProblem problem;
		
		public PositionBasedTextDiagnostic(org.eclipse.emf.common.util.URI uri, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaProblem problem, int column, int line, int charStart, int charEnd) {
			
			super();
			this.uri = uri;
			this.column = column;
			this.line = line;
			this.charStart = charStart;
			this.charEnd = charEnd;
			this.problem = problem;
		}
		
		public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaProblem getProblem() {
			return problem;
		}
		
		public int getCharStart() {
			return charStart;
		}
		
		public int getCharEnd() {
			return charEnd;
		}
		
		public int getColumn() {
			return column;
		}
		
		public int getLine() {
			return line;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			return false;
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolverSwitch resolverSwitch;
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaLocationMap locationMap;
	private int proxyCounter = 0;
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextParser parser;
	private java.util.Map<String, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>> internalURIFragmentMap = new java.util.LinkedHashMap<String, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>>();
	private java.util.Map<String, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix> quickFixMap = new java.util.LinkedHashMap<String, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix>();
	private java.util.Map<?, ?> loadOptions;
	
	/**
	 * If a post-processor is currently running, this field holds a reference to it.
	 * This reference is used to terminate post-processing if needed.
	 */
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourcePostProcessor runningPostProcessor;
	
	/**
	 * A flag to indicate whether reloading of the resource shall be cancelled.
	 */
	private boolean terminateReload = false;
	
	public EdeltaResource() {
		super();
		resetLocationMap();
	}
	
	public EdeltaResource(org.eclipse.emf.common.util.URI uri) {
		super(uri);
		resetLocationMap();
	}
	
	protected void doLoad(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		this.loadOptions = options;
		this.terminateReload = false;
		String encoding = null;
		java.io.InputStream actualInputStream = inputStream;
		Object inputStreamPreProcessorProvider = null;
		if (options != null) {
			inputStreamPreProcessorProvider = options.get(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaOptions.INPUT_STREAM_PREPROCESSOR_PROVIDER);
		}
		if (inputStreamPreProcessorProvider != null) {
			if (inputStreamPreProcessorProvider instanceof it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaInputStreamProcessorProvider) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaInputStreamProcessorProvider provider = (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaInputStreamProcessorProvider) inputStreamPreProcessorProvider;
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaInputStreamProcessor processor = provider.getInputStreamProcessor(inputStream);
				actualInputStream = processor;
				encoding = processor.getOutputEncoding();
			}
		}
		
		parser = getMetaInformation().createParser(actualInputStream, encoding);
		parser.setOptions(options);
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaParseResult result = parser.parse();
		clearState();
		getContentsInternal().clear();
		org.eclipse.emf.ecore.EObject root = null;
		if (result != null) {
			root = result.getRoot();
			if (root != null) {
				getContentsInternal().add(root);
			}
			java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaCommand<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource>> commands = result.getPostParseCommands();
			if (commands != null) {
				for (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaCommand<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource>  command : commands) {
					command.execute(this);
				}
			}
		}
		getReferenceResolverSwitch().setOptions(options);
		if (getErrors().isEmpty()) {
			runPostProcessors(options);
			if (root != null) {
				runValidators(root);
			}
		}
	}
	
	public void reload(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		try {
			isLoaded = false;
			java.util.Map<Object, Object> loadOptions = addDefaultLoadOptions(options);
			doLoad(inputStream, loadOptions);
			org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this.getResourceSet());
		} catch (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTerminateParsingException tpe) {
			// do nothing - the resource is left unchanged if this exception is thrown
		}
		isLoaded = true;
	}
	
	public void cancelReload() {
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextParser parserCopy = parser;
		parserCopy.terminate();
		this.terminateReload = true;
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourcePostProcessor runningPostProcessorCopy = runningPostProcessor;
		if (runningPostProcessorCopy != null) {
			runningPostProcessorCopy.terminate();
		}
	}
	
	protected void doSave(java.io.OutputStream outputStream, java.util.Map<?,?> options) throws java.io.IOException {
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextPrinter printer = getMetaInformation().createPrinter(outputStream, this);
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		for (org.eclipse.emf.ecore.EObject root : getContentsInternal()) {
			printer.print(root);
		}
	}
	
	protected String getSyntaxName() {
		return "edelta";
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolverSwitch getReferenceResolverSwitch() {
		if (resolverSwitch == null) {
			resolverSwitch = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaReferenceResolverSwitch();
		}
		return resolverSwitch;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaMetaInformation getMetaInformation() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaMetaInformation();
	}
	
	protected void resetLocationMap() {
		locationMap = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaLocationMap();
	}
	
	public void addURIFragment(String internalURIFragment, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment) {
		internalURIFragmentMap.put(internalURIFragment, uriFragment);
	}
	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, org.eclipse.emf.ecore.EReference reference, String id, org.eclipse.emf.ecore.EObject proxyElement, int position) {
		org.eclipse.emf.ecore.InternalEObject proxy = (org.eclipse.emf.ecore.InternalEObject) proxyElement;
		String internalURIFragment = it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX + (proxyCounter++) + "_" + id;
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaContextDependentURIFragment<?> uriFragment = factory.create(id, container, reference, position, proxy);
		proxy.eSetProxyURI(getURI().appendFragment(internalURIFragment));
		addURIFragment(internalURIFragment, uriFragment);
	}
	
	public org.eclipse.emf.ecore.EObject getEObject(String id) {
		if (internalURIFragmentMap.containsKey(id)) {
			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment = internalURIFragmentMap.get(id);
			boolean wasResolvedBefore = uriFragment.isResolved();
			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result = null;
			// catch and report all Exceptions that occur during proxy resolving
			try {
				result = uriFragment.resolve();
			} catch (Exception e) {
				String message = "An expection occured while resolving the proxy for: "+ id + ". (" + e.toString() + ")";
				addProblem(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaProblem(message, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.UNRESOLVED_REFERENCE, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity.ERROR),uriFragment.getProxy());
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaPlugin.logError(message, e);
			}
			if (result == null) {
				// the resolving did call itself
				return null;
			}
			if (!wasResolvedBefore && !result.wasResolved()) {
				attachResolveError(result, uriFragment.getProxy());
				return null;
			} else if (!result.wasResolved()) {
				return null;
			} else {
				org.eclipse.emf.ecore.EObject proxy = uriFragment.getProxy();
				// remove an error that might have been added by an earlier attempt
				removeDiagnostics(proxy, getErrors());
				// remove old warnings and attach new
				removeDiagnostics(proxy, getWarnings());
				attachResolveWarnings(result, proxy);
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping = result.getMappings().iterator().next();
				org.eclipse.emf.ecore.EObject resultElement = getResultElement(uriFragment, mapping, proxy, result.getErrorMessage());
				org.eclipse.emf.ecore.EObject container = uriFragment.getContainer();
				replaceProxyInLayoutAdapters(container, proxy, resultElement);
				return resultElement;
			}
		} else {
			return super.getEObject(id);
		}
	}
	
	protected void replaceProxyInLayoutAdapters(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject proxy, org.eclipse.emf.ecore.EObject target) {
		for (org.eclipse.emf.common.notify.Adapter adapter : container.eAdapters()) {
			if (adapter instanceof it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaLayoutInformationAdapter) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaLayoutInformationAdapter layoutInformationAdapter = (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaLayoutInformationAdapter) adapter;
				layoutInformationAdapter.replaceProxy(proxy, target);
			}
		}
	}
	
	private org.eclipse.emf.ecore.EObject getResultElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping, org.eclipse.emf.ecore.EObject proxy, final String errorMessage) {
		if (mapping instanceof it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaURIMapping<?>) {
			org.eclipse.emf.common.util.URI uri = ((it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaURIMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetIdentifier();
			if (uri != null) {
				org.eclipse.emf.ecore.EObject result = null;
				try {
					result = this.getResourceSet().getEObject(uri, true);
				} catch (Exception e) {
					// we can catch exceptions here, because EMF will try to resolve again and handle
					// the exception
				}
				if (result == null || result.eIsProxy()) {
					// unable to resolve: attach error
					if (errorMessage == null) {
						assert(false);
					} else {
						addProblem(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaProblem(errorMessage, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.UNRESOLVED_REFERENCE, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity.ERROR), proxy);
					}
				}
				return result;
			}
			return null;
		} else if (mapping instanceof it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaElementMapping<?>) {
			org.eclipse.emf.ecore.EObject element = ((it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaElementMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetElement();
			org.eclipse.emf.ecore.EReference reference = uriFragment.getReference();
			org.eclipse.emf.ecore.EReference oppositeReference = uriFragment.getReference().getEOpposite();
			if (!uriFragment.getReference().isContainment() && oppositeReference != null) {
				if (reference.isMany()) {
					org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList.ManyInverse<org.eclipse.emf.ecore.EObject> list = it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaCastUtil.cast(element.eGet(oppositeReference, false));										// avoids duplicate entries in the reference caused by adding to the
					// oppositeReference
					list.basicAdd(uriFragment.getContainer(),null);
				} else {
					uriFragment.getContainer().eSet(uriFragment.getReference(), element);
				}
			}
			return element;
		} else {
			assert(false);
			return null;
		}
	}
	
	private void removeDiagnostics(org.eclipse.emf.ecore.EObject cause, java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> diagnostics) {
		// remove all errors/warnings from this resource
		for (org.eclipse.emf.ecore.resource.Resource.Diagnostic errorCand : new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(diagnostics)) {
			if (errorCand instanceof it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextDiagnostic) {
				if (((it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextDiagnostic) errorCand).wasCausedBy(cause)) {
					diagnostics.remove(errorCand);
					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaMarkerHelper.unmark(this, cause);
				}
			}
		}
	}
	
	private void attachResolveError(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolveResult<?> result, org.eclipse.emf.ecore.EObject proxy) {
		// attach errors to this resource
		assert result != null;
		final String errorMessage = result.getErrorMessage();
		if (errorMessage == null) {
			assert(false);
		} else {
			addProblem(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaProblem(errorMessage, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.UNRESOLVED_REFERENCE, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity.ERROR, result.getQuickFixes()), proxy);
		}
	}
	
	private void attachResolveWarnings(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result, org.eclipse.emf.ecore.EObject proxy) {
		assert result != null;
		assert result.wasResolved();
		if (result.wasResolved()) {
			for (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping : result.getMappings()) {
				final String warningMessage = mapping.getWarning();
				if (warningMessage == null) {
					continue;
				}
				addProblem(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaProblem(warningMessage, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.UNRESOLVED_REFERENCE, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity.WARNING), proxy);
			}
		}
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void doUnload() {
		super.doUnload();
		clearState();
		loadOptions = null;
	}
	
	protected void runPostProcessors(java.util.Map<?, ?> loadOptions) {
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaMarkerHelper.unmark(this, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.ANALYSIS_PROBLEM);
		if (terminateReload) {
			return;
		}
		// first, run the generated post processor
		runPostProcessor(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaResourcePostProcessor());
		if (loadOptions == null) {
			return;
		}
		// then, run post processors that are registered via the load options extension
		// point
		Object resourcePostProcessorProvider = loadOptions.get(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaOptions.RESOURCE_POSTPROCESSOR_PROVIDER);
		if (resourcePostProcessorProvider != null) {
			if (resourcePostProcessorProvider instanceof it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourcePostProcessorProvider) {
				runPostProcessor(((it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourcePostProcessorProvider) resourcePostProcessorProvider).getResourcePostProcessor());
			} else if (resourcePostProcessorProvider instanceof java.util.Collection<?>) {
				java.util.Collection<?> resourcePostProcessorProviderCollection = (java.util.Collection<?>) resourcePostProcessorProvider;
				for (Object processorProvider : resourcePostProcessorProviderCollection) {
					if (terminateReload) {
						return;
					}
					if (processorProvider instanceof it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourcePostProcessorProvider) {
						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourcePostProcessorProvider csProcessorProvider = (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourcePostProcessorProvider) processorProvider;
						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourcePostProcessor postProcessor = csProcessorProvider.getResourcePostProcessor();
						runPostProcessor(postProcessor);
					}
				}
			}
		}
	}
	
	protected void runPostProcessor(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourcePostProcessor postProcessor) {
		try {
			this.runningPostProcessor = postProcessor;
			postProcessor.process(this);
		} catch (Exception e) {
			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaPlugin.logError("Exception while running a post-processor.", e);
		}
		this.runningPostProcessor = null;
	}
	
	public void load(java.util.Map<?, ?> options) throws java.io.IOException {
		java.util.Map<Object, Object> loadOptions = addDefaultLoadOptions(options);
		super.load(loadOptions);
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this.getResourceSet());
	}
	
	public void setURI(org.eclipse.emf.common.util.URI uri) {
		// because of the context dependent proxy resolving it is essential to resolve all
		// proxies before the URI is changed which can cause loss of object identities
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this);
		super.setURI(uri);
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void addProblem(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaProblem problem, org.eclipse.emf.ecore.EObject element) {
		ElementBasedTextDiagnostic diagnostic = new ElementBasedTextDiagnostic(locationMap, getURI(), problem, element);
		getDiagnostics(problem.getSeverity()).add(diagnostic);
		if (isMarkerCreationEnabled()) {
			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaMarkerHelper.mark(this, diagnostic);
		}
		java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix> quickFixes = problem.getQuickFixes();
		if (quickFixes != null) {
			for (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix quickFix : quickFixes) {
				if (quickFix != null) {
					quickFixMap.put(quickFix.getContextAsString(), quickFix);
				}
			}
		}
	}
	
	public void addProblem(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaProblem problem, int column, int line, int charStart, int charEnd) {
		PositionBasedTextDiagnostic diagnostic = new PositionBasedTextDiagnostic(getURI(), problem, column, line, charStart, charEnd);
		getDiagnostics(problem.getSeverity()).add(diagnostic);
		if (isMarkerCreationEnabled()) {
			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaMarkerHelper.mark(this, diagnostic);
		}
	}
	
	@Deprecated	
	public void addError(String message, org.eclipse.emf.ecore.EObject cause) {
		addError(message, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.UNKNOWN, cause);
	}
	
	public void addError(String message, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType type, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaProblem(message, type, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity.ERROR), cause);
	}
	
	@Deprecated	
	public void addWarning(String message, org.eclipse.emf.ecore.EObject cause) {
		addWarning(message, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.UNKNOWN, cause);
	}
	
	public void addWarning(String message, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType type, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaProblem(message, type, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity.WARNING), cause);
	}
	
	private java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getDiagnostics(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity severity) {
		if (severity == it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity.ERROR) {
			return getErrors();
		} else {
			return getWarnings();
		}
	}
	
	protected java.util.Map<Object, Object> addDefaultLoadOptions(java.util.Map<?, ?> loadOptions) {
		java.util.Map<Object, Object> loadOptionsCopy = it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaMapUtil.copySafelyToObjectToObjectMap(loadOptions);
		if (org.eclipse.core.runtime.Platform.isRunning()) {
			// find default load option providers
			org.eclipse.core.runtime.IExtensionRegistry extensionRegistry = org.eclipse.core.runtime.Platform.getExtensionRegistry();
			org.eclipse.core.runtime.IConfigurationElement configurationElements[] = extensionRegistry.getConfigurationElementsFor(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaPlugin.EP_DEFAULT_LOAD_OPTIONS_ID);
			for (org.eclipse.core.runtime.IConfigurationElement element : configurationElements) {
				try {
					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaOptionProvider provider = (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaOptionProvider) element.createExecutableExtension("class");
					final java.util.Map<?, ?> options = provider.getOptions();
					final java.util.Collection<?> keys = options.keySet();
					for (Object key : keys) {
						addLoadOption(loadOptionsCopy, key, options.get(key));
					}
				} catch (org.eclipse.core.runtime.CoreException ce) {
					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaPlugin.logError("Exception while getting default options.", ce);
				}
			}
		}
		return loadOptionsCopy;
	}
	
	/**
	 * Adds a new key,value pair to the list of options. If there is already an option
	 * with the same key, the two values are collected in a list.
	 */
	private void addLoadOption(java.util.Map<Object, Object> options,Object key, Object value) {
		// check if there is already an option set
		if (options.containsKey(key)) {
			Object currentValue = options.get(key);
			if (currentValue instanceof java.util.List<?>) {
				// if the current value is a list, we add the new value to this list
				java.util.List<?> currentValueAsList = (java.util.List<?>) currentValue;
				java.util.List<Object> currentValueAsObjectList = it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaListUtil.copySafelyToObjectList(currentValueAsList);
				if (value instanceof java.util.Collection<?>) {
					currentValueAsObjectList.addAll((java.util.Collection<?>) value);
				} else {
					currentValueAsObjectList.add(value);
				}
				options.put(key, currentValueAsObjectList);
			} else {
				// if the current value is not a list, we create a fresh list and add both the old
				// (current) and the new value to this list
				java.util.List<Object> newValueList = new java.util.ArrayList<Object>();
				newValueList.add(currentValue);
				if (value instanceof java.util.Collection<?>) {
					newValueList.addAll((java.util.Collection<?>) value);
				} else {
					newValueList.add(value);
				}
				options.put(key, newValueList);
			}
		} else {
			options.put(key, value);
		}
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void clearState() {
		// clear concrete syntax information
		resetLocationMap();
		internalURIFragmentMap.clear();
		getErrors().clear();
		getWarnings().clear();
		if (isMarkerCreationEnabled()) {
			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaMarkerHelper.unmark(this, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.UNKNOWN);
			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaMarkerHelper.unmark(this, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.SYNTAX_ERROR);
			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaMarkerHelper.unmark(this, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.UNRESOLVED_REFERENCE);
		}
		proxyCounter = 0;
		resolverSwitch = null;
	}
	
	/**
	 * Returns a copy of the contents of this resource wrapped in a list that
	 * propagates changes to the original resource list. Wrapping is required to make
	 * sure that clients which obtain a reference to the list of contents do not
	 * interfere when changing the list.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContents() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaCopiedEObjectInternalEList((org.eclipse.emf.ecore.util.InternalEList<org.eclipse.emf.ecore.EObject>) super.getContents());
	}
	
	/**
	 * Returns the raw contents of this resource.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContentsInternal() {
		return super.getContents();
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getWarnings() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getWarnings());
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getErrors() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getErrors());
	}
	
	@SuppressWarnings("restriction")	
	private void runValidators(org.eclipse.emf.ecore.EObject root) {
		// checking constraints provided by EMF validator classes was disabled
		
		// check EMF validation constraints
		// EMF validation does not work if OSGi is not running
		// The EMF validation framework code throws a NPE if the validation plug-in is not
		// loaded. This is a bug, which is fixed in the Helios release. Nonetheless, we
		// need to catch the exception here.
		if (org.eclipse.core.runtime.Platform.isRunning()) {
			// The EMF validation framework code throws a NPE if the validation plug-in is not
			// loaded. This is a workaround for bug 322079.
			if (org.eclipse.emf.validation.internal.EMFModelValidationPlugin.getPlugin() != null) {
				try {
					org.eclipse.emf.validation.service.ModelValidationService service = org.eclipse.emf.validation.service.ModelValidationService.getInstance();
					org.eclipse.emf.validation.service.IBatchValidator validator = service.<org.eclipse.emf.ecore.EObject, org.eclipse.emf.validation.service.IBatchValidator>newValidator(org.eclipse.emf.validation.model.EvaluationMode.BATCH);
					validator.setIncludeLiveConstraints(true);
					org.eclipse.core.runtime.IStatus status = validator.validate(root);
					addStatus(status, root);
				} catch (Throwable t) {
					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaPlugin.logError("Exception while checking contraints provided by EMF validator classes.", t);
				}
			}
		}
	}
	
	private void addStatus(org.eclipse.core.runtime.IStatus status, org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> causes = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		causes.add(root);
		if (status instanceof org.eclipse.emf.validation.model.ConstraintStatus) {
			org.eclipse.emf.validation.model.ConstraintStatus constraintStatus = (org.eclipse.emf.validation.model.ConstraintStatus) status;
			java.util.Set<org.eclipse.emf.ecore.EObject> resultLocus = constraintStatus.getResultLocus();
			causes.clear();
			causes.addAll(resultLocus);
		}
		boolean hasChildren = status.getChildren() != null && status.getChildren().length > 0;
		// Ignore composite status objects that have children. The actual status
		// information is then contained in the child objects.
		if (!status.isMultiStatus() || !hasChildren) {
			if (status.getSeverity() == org.eclipse.core.runtime.IStatus.ERROR) {
				for (org.eclipse.emf.ecore.EObject cause : causes) {
					addError(status.getMessage(), it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.ANALYSIS_PROBLEM, cause);
				}
			}
			if (status.getSeverity() == org.eclipse.core.runtime.IStatus.WARNING) {
				for (org.eclipse.emf.ecore.EObject cause : causes) {
					addWarning(status.getMessage(), it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.ANALYSIS_PROBLEM, cause);
				}
			}
		}
		for (org.eclipse.core.runtime.IStatus child : status.getChildren()) {
			addStatus(child, root);
		}
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix getQuickFix(String quickFixContext) {
		return quickFixMap.get(quickFixContext);
	}
	
	public boolean isMarkerCreationEnabled() {
		if (loadOptions == null) {
			return true;
		}
		return !loadOptions.containsKey(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaOptions.DISABLE_CREATING_MARKERS_FOR_PROBLEMS);
	}
}
