/*
 * generated by Xtext 2.17.0
 */
package org.xtext.t2.lisp.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractLispValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.t2.lisp.lisp.LispPackage.eINSTANCE);
		return result;
	}
}
