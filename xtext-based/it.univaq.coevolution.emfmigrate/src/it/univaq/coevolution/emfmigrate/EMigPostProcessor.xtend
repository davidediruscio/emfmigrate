package it.univaq.coevolution.emfmigrate


import it.univaq.coevolution.emfmigrate.*
import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EClass


class EMigPostProcessor implements IXtext2EcorePostProcessor{
	
	override process(GeneratedMetamodel mm) {
		
	        for (c : mm.EPackage.EClassifiers.filter(typeof(EClass))) {
	            if (c.name == "LocatedElement") {
	                c.setLocatedElementAttributes
	            }
	           
	         //adding eopposites   
	         val rwrInMigSx = EcoreFactory::eINSTANCE.createEReference
	         rwrInMigSx.setName('rewritingRule');
	         rwrInMigSx.setContainment(false);
	        
	         val rwrInMigDx = EcoreFactory::eINSTANCE.createEReference
	         rwrInMigDx.setName('rewritingRule');
	         rwrInMigDx.setContainment(false);
	        
	            //setting eopposite
	            if(c.name=="MigratorSX" ){
	            	for (c1 : mm.EPackage.EClassifiers.filter(typeof(EClass))) {	
	            	 	 if(c1.name=="RewritingRule"){
	            	 	 	rwrInMigSx.setEType(c1);
	            	 	 	 for (r :c1.EReferences) {
		            	 	if(r.name=="migratorSX"){
		            	 		rwrInMigSx.setEOpposite(r);
		            	 		r.setEOpposite(rwrInMigSx);
		            	 		}
		            	 	}
	            	 	 	
	            	 	 	}
	            	 	 }
	            	c.EStructuralFeatures+=rwrInMigSx;
	            	}
	            	
	            	//migratorDX
	            	      if(c.name=="MigratorDX" ){
	            	for (c2 : mm.EPackage.EClassifiers.filter(typeof(EClass))) {	
	            	 	 if(c2.name=="RewritingRule"){
	            	 	 	rwrInMigDx.setEType(c2);
	            	 	 	 for (r :c2.EReferences) {
		            	 	if(r.name=="migratorDX"){
		            	 		rwrInMigDx.setEOpposite(r);
		            	 		r.setEOpposite(rwrInMigDx);
		            	 		}
		            	 	}
	            	 	 	
	            	 	 	}
	            	 	 }
	            	c.EStructuralFeatures+=rwrInMigDx;
	            	}
	            
	      }
	    }
	    def setLocatedElementAttributes (EClass c) {
	    	for (EAttribute s : c.EAllAttributes) {
				s.setDerived(true);
				s.setChangeable(false);
				s.setVolatile(true);
				s.setLowerBound(1);
				s.setTransient(true);
		}
//	        val op = EcoreFactory::eINSTANCE.createEOperation
//	        op.name = "getFullName"
//	        op.EType = EcorePackage::eINSTANCE.EString
//	        val body = EcoreFactory::eINSTANCE.createEAnnotation
//	        body.source = GenModelPackage::eNS_URI
//	        val map = EcoreFactory::eINSTANCE.create(EcorePackage::eINSTANCE.getEStringToStringMapEntry()) as BasicEMap$Entry<String,String>
//	        map.key = "body"
//	        map.value = "return getFirstname() + \" \" + getLastname();"
//	        body.details.add(map)
//	        op.EAnnotations += body
//	        c.EOperations += op
	    }
	 
}