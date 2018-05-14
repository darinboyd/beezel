package org.beezel.core.runtime;

import org.beezel.core.model.project.project.Project;

/**
 * Runs test from a Beezel {@link Project} model.
 * @author Darin Boyd
 *
 */
public interface ProjectRunner {
	
	/**
	 * Runs a full test project.
	 * @param projectModelLocation - Location of the project model file.
	 * @return
	 */
	public ProjectRunnerResult run(String projectModelLocation) throws ProjectRunnerException;
	
	/**
	 * Runs a full test project.
	 * @param project - Project instance.
	 * @return
	 */
	public ProjectRunnerResult run(Project project) throws ProjectRunnerException;
	

}
