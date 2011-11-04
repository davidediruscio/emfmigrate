/*******************************************************************************
 * Copyright (c) 2011 Dennis Wagelaar, Vrije Universiteit Brussel.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dennis Wagelaar, Vrije Universiteit Brussel
 *******************************************************************************/
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

import it.univaq.coevolution.emfmigrate.EmigOcl.util.LocationResource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * Adds {@link LocationResource} methods to {@link SimplegtResource}.
 * @author <a href="mailto:dennis.wagelaar@vub.ac.be">Dennis Wagelaar</a>
 *
 */
public class EmigOclLocationResource extends EmigOclResource implements
		LocationResource {

	/**
	 * Creates a new {@link EmigOclLocationResource}.
	 */
	public EmigOclLocationResource() {
		super();
	}

	/**
	 * Creates a new {@link EmigOclLocationResource}.
	 * @param uri the resource URI
	 */
	public EmigOclLocationResource(URI uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see be.ac.vub.simplegt.util.LocationResource#getCharEnd(org.eclipse.emf.ecore.EObject)
	 */
	public int getCharEnd(final EObject element) {
		return getLocationMap().getCharEnd(element);
	}

	/* (non-Javadoc)
	 * @see be.ac.vub.simplegt.util.LocationResource#getCharStart(org.eclipse.emf.ecore.EObject)
	 */
	public int getCharStart(final EObject element) {
		return getLocationMap().getCharStart(element);
	}

	/* (non-Javadoc)
	 * @see be.ac.vub.simplegt.util.LocationResource#getColumn(org.eclipse.emf.ecore.EObject)
	 */
	public int getColumn(EObject element) {
		return getLocationMap().getColumn(element);
	}

	/* (non-Javadoc)
	 * @see be.ac.vub.simplegt.util.LocationResource#getLine(org.eclipse.emf.ecore.EObject)
	 */
	public int getLine(EObject element) {
		return getLocationMap().getLine(element);
	}

}
