package it.univaq.coevolution.emfmigrate.compiler.builder;

import it.univaq.coevolution.emfmigrate.compiler.Activator;
import it.univaq.coevolution.emfmigrate.emig.EmigPackage;

import java.util.Collections;
import java.util.Map;
import java.util.logging.Level;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;

public class EmigBuilder extends IncrementalProjectBuilder {

	class SampleDeltaVisitor implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				buildResource(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				buildResource(resource);
				break;
			}
			//return true to continue visiting children.
			return true;
		}
	}

	class SampleResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			buildResource(resource);
			//return true to continue visiting children.
			return true;
		}
	}



	public static final String BUILDER_ID = "it.univaq.coevolution.emfmigrate.compiler.emigBuilder";

	private static final String MARKER_TYPE = "it.univaq.coevolution.emfmigrate.compiler.xmlProblem";

	protected final ResourceSet rs=new ResourceSetImpl();
	
	protected final Metamodel emigMM=EmftvmFactory.eINSTANCE.createMetamodel();
	
	protected final ModuleResolver mr=new DefaultModuleResolver("platform:/plugin/"+Activator.PLUGIN_ID+"/transformations/", rs);
	
	
	
	public EmigBuilder() {
		super();
		// TODO Auto-generated constructor stub
		emigMM.setResource(EmigPackage.eINSTANCE.eResource());
		
	}

	private void addMarker(IFile file, String message, int lineNumber,
			int severity) {
		try {
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (CoreException e) {
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	void buildResource(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".emig")) {
			IFile file = (IFile) resource;
			deleteMarkers(file);
			
			final Model emigModel = EmftvmFactory.eINSTANCE.createModel();
			
			final String emigModelPath=resource.getProject().getName()+"/"+resource.getProjectRelativePath().toString();
			final URI emigModelUri=URI.createPlatformResourceURI(emigModelPath,true);
			final Resource emigModelres=rs.getResource(emigModelUri, true);
			emigModel.setResource(emigModelres);
			
			final Resource r= rs.createResource(URI.createFileURI("out.emftvm"),"be.ac.vub.emftvm");
			final Model emftvmm=EmftvmFactory.eINSTANCE.createModel();
			emftvmm.setResource(r);
			
			final URI riURI=emigModelres.getURI().trimFileExtension().appendFileExtension("emftvm");
			
			//TODO:content ID will change to org.eclipse.m2m.atl.emftvm
			final Resource ri=rs.createResource(riURI,"be.ac.vub.emftvm");
			final Model emftvmmmi=EmftvmFactory.eINSTANCE.createModel();
			emftvmmmi.setResource(ri);
			
			
		
			try {
				ExecEnv env=EmftvmFactory.eINSTANCE.createExecEnv();
				env.registerMetaModel("EMig", emigMM);
				env.registerInputModel("IN", emigModel);
				env.registerOutputModel("OUT", emftvmm);
				env.loadModule(mr, "emig2EMFTVM");
				env.run(null);
				
				env=EmftvmFactory.eINSTANCE.createExecEnv();
				env.registerInputModel("IN", emftvmm);
				env.registerOutputModel("OUT", emftvmmmi);
				env.loadModule(mr, "InlineCodeblocks");
				env.run(null);
				ri.save(Collections.emptyMap());
				if(ri.getURI().isPlatformResource()){
					final IPath riPath=new Path(ri.getURI().toPlatformString(true));
					final IFile riFile=ResourcesPlugin.getWorkspace().getRoot().getFile(riPath);
					riFile.setDerived(true, null);
				}
				
				
				
			}catch (CoreException e) {
				ATLLogger.log(Level.SEVERE, e.getMessage(), e);
			
				Activator.getDefault().getLog().log(e.getStatus());
			} 
			catch (Exception e1) {
				ATLLogger.log(Level.SEVERE, e1.getMessage(), e1);
				final IStatus status=new Status(IStatus.ERROR, Activator.PLUGIN_ID, 0,e1.getMessage(),e1);
				Activator.getDefault().getLog().log(status);
			}finally{
				rs.getResources().remove(r);
				rs.getResources().remove(ri);
				
			}
		}
	}

	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		try {
			getProject().accept(new SampleResourceVisitor());
		} catch (CoreException e) {
		}
	}

	

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new SampleDeltaVisitor());
	}
}
