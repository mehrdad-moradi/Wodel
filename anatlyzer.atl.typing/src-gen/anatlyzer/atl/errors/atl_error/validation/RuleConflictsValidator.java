/**
 *
 * $Id$
 */
package anatlyzer.atl.errors.atl_error.validation;

import anatlyzer.atl.errors.atl_error.ConflictingRuleSet;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link anatlyzer.atl.errors.atl_error.RuleConflicts}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RuleConflictsValidator {
	boolean validate();

	boolean validateConflicts(EList<ConflictingRuleSet> value);
}
