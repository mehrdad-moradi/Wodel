/**
 *
 * $Id$
 */
package mutatorenvironment.miniOCL.validation;

import mutatorenvironment.miniOCL.CallExpCS;
import mutatorenvironment.miniOCL.NavigationExpCS;

/**
 * A sample validator interface for {@link mutatorenvironment.miniOCL.CallExpCS}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CallExpCSValidator {
	boolean validate();

	boolean validateSource(CallExpCS value);
	boolean validateNavExp(NavigationExpCS value);
}