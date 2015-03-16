/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class EmigContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public EmigContextDependentURIFragmentFactory(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
