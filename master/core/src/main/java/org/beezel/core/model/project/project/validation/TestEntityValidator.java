/**
 *
 * $Id$
 */
package org.beezel.core.model.project.project.validation;

import org.beezel.core.model.project.project.TestEntityStatus;

/**
 * A sample validator interface for {@link org.beezel.core.model.project.project.TestEntity}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TestEntityValidator {
	boolean validate();

	boolean validateStatus(TestEntityStatus value);
}
