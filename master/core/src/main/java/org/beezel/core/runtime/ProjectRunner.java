package org.beezel.core.runtime;

import org.beezel.core.model.project.project.Project;

/**
 * Runs test from a beezel {@link Project} model.
 * @author Darin Boyd
 *
 */
public interface ProjectRunner {
	
	public ProjectRunnerResult run(String modelLocaation);

}
