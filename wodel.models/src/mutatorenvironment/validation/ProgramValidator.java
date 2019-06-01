/**
 *
 * $Id$
 */
package mutatorenvironment.validation;

import mutatorenvironment.Resource;
import mutatorenvironment.Source;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link mutatorenvironment.Program}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ProgramValidator {
	boolean validate();

	boolean validateOutput(String value);
	boolean validateNum(int value);
	boolean validateSource(Source value);
	boolean validateDescription(String value);
	boolean validateExhaustive(boolean value);
	boolean validateResources(EList<Resource> value);
}