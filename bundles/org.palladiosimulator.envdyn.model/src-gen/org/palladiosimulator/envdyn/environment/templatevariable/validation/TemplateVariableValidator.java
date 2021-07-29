/**
 *
 * $Id$
 */
package org.palladiosimulator.envdyn.environment.templatevariable.validation;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.envdyn.environment.templatevariable.LogicalVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;

/**
 * A sample validator interface for {@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TemplateVariableValidator {
	boolean validate();

	boolean validateShared(boolean value);
	boolean validateSignature(EList<LogicalVariable> value);
	boolean validateRefines(TemplateVariable value);
}
