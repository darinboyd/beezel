package org.beezel.core.runtime;

import org.beezel.core.model.project.project.Project;

/**
 * Runs test from a beezel {@link Project} model.
 * @author Darin Boyd
 *
 */
public interface ProjectRunner {
	
	/**
	 * Runs a full test project.
	 * @param modelLocation - Location of the project model file.
	 * @return
	 */
	public ProjectRunnerResult run(String modelLocation);
	

}
