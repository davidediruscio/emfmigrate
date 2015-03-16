package it.univaq.coevolution.emfmigrate;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import OCLinEmig.VariableDeclaration;

public class MyQN extends DefaultDeclarativeQualifiedNameProvider{
 
	    QualifiedName qualifiedName(VariableDeclaration e) {
	        
	        return QualifiedName.create(e.getVarName());
	    }
	 
	}
