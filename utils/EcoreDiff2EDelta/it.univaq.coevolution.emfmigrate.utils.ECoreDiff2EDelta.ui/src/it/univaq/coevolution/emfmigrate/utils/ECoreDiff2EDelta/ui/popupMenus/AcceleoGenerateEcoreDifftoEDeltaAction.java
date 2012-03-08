/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package it.univaq.coevolution.emfmigrate.utils.ECoreDiff2EDelta.ui.popupMenus;

import it.univaq.coevolution.emfmigrate.utils.ECoreDiff2EDelta.ui.Activator;
import it.univaq.coevolution.emfmigrate.utils.ECoreDiff2EDelta.ui.common.GenerateAll;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.xpath.XPathExpressionException;

import org.eclipse.acceleo.engine.AcceleoEvaluationException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;
import org.xml.sax.SAXException;

/**
 * EcoreDiff to EDelta code generation.
 */
public class AcceleoGenerateEcoreDifftoEDeltaAction extends ActionDelegate implements IActionDelegate, IObjectActionDelegate {
	
	/**
	 * Selected model files.
	 */
	protected List<IFile> files;
	private Shell shell;

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}
	
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated
	 */
	public void run(IAction action) {
if (files != null) {			
			
			ConversionPage dialog = new ConversionPage(shell);
			dialog.setText("Import metamodels for the conversion");
			final ConversionProperty property = dialog.open();
			
			if (property != null) {
				
				IRunnableWithProgress operation = new IRunnableWithProgress() {
					
					private String mess = "";
										
					@Override
					public String toString() {
						return mess;
					}

					public void run(IProgressMonitor monitor) {
						try {
							Iterator<IFile> filesIt = files.iterator();
							while (filesIt.hasNext()) {							
								IFile model = (IFile) filesIt.next();
								ReadEcoreDiff reader = new ReadEcoreDiff(model.getLocation().toString(), property);
								File tempModelFile = reader.run();
								URI modelURI = URI.createFileURI(tempModelFile.getAbsolutePath());
								GenerateAll generator = null;
								boolean genDone = false;
								try {
									File target = new File(property.getPath_target());
									generator = new GenerateAll(modelURI, target, getArguments());
									generator.doGenerate(monitor);
									genDone = true; 
								} catch (IOException e) {
									IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,	e.getMessage(), e);
									Activator.getDefault().getLog().log(status);
									mess = e.getMessage();
								} catch (AcceleoEvaluationException e){}
								  catch (Exception e){
										IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,	e.getMessage(), e);
										Activator.getDefault().getLog().log(status);
										mess = e.getMessage();
								  }
								finally {
									if (!genDone)
										generator.doGenerate(monitor);
									model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
								}
							}
						} catch (CoreException e) {
							IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
							Activator.getDefault().getLog().log(status);
							mess = "CoreException:\n" + e.getMessage();
						} catch (XPathExpressionException e) {
							IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
							Activator.getDefault().getLog().log(status);
							mess = "XPathExpressionException:\n" + e.getMessage();
						} catch (ParserConfigurationException e) {
							IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
							Activator.getDefault().getLog().log(status);
							mess = "ParserConfigurationException:\n" + e.getMessage();
						} catch (SAXException e) {
							IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
							Activator.getDefault().getLog().log(status);
							mess = "SAXException:\n" + e.getMessage();
						} catch (IOException e) {
							IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
							Activator.getDefault().getLog().log(status);
							mess = "IOException:\n" + e.getMessage();
						} catch (TransformerFactoryConfigurationError e) {
							IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
							Activator.getDefault().getLog().log(status);
							mess = "TransformerFactoryConfigurationError:\n" + e.getMessage();
						} catch (TransformerException e) {
							IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
							Activator.getDefault().getLog().log(status);
							mess = "TransformerException:\n" + e.getMessage();
						}
					}
				};
				
				Message msg = new Message(shell);
				
				try {					
					PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
					if (!operation.toString().isEmpty())
						msg.showMessage("Error", operation.toString(), "error");
				} catch (InvocationTargetException e) {
					IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
					msg.showMessage("Error", "InvocationTargetException\n" + operation.toString(), "error");
				} catch (InterruptedException e) {
					IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
					msg.showMessage("Error", "InterruptedException\n" + operation.toString(), "error");
				}
			}
		}
	}

	/**
	 * Computes the arguments of the generator.
	 * 
	 * @return the arguments
	 * @generated
	 */
	protected List<? extends Object> getArguments() {
		return new ArrayList<String>();
	}

}