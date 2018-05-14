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
	 * @param projectModelLocation - Location of the project model file.
	 * @return
	 */
	public ProjectRunnerResult run(String projectModelLocation);
	
	/**
	 * Runs a full test project.
	 * @param project - Project instance.
	 * @return
	 */
	public ProjectRunnerResult run(Project project);
	

}
