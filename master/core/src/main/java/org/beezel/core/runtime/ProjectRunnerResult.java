package org.beezel.core.runtime;

import java.util.List;

import org.beezel.core.model.project.project.Feature;
import org.beezel.core.model.project.project.Project;
import org.beezel.core.model.project.project.Tag;

/**
 * Reports run results for a full {@link Project} model.
 * @author Darin Boyd
 *
 */
public interface ProjectRunnerResult {
	
	/**
	 * Returns all of the run results for the {@link Feature}s in the {@link Project}
	 * @return
	 */
	public List<FeatureRunnerResult> getAllFeatureResults();
	
	/**
	 * Returns the run results for the {@link Feature}s in the {@link Project} by status.
	 * @return
	 */
	public List<FeatureRunnerResult> getFeatureResultsByStatus(TestEntityResultStatus status);
	
	/**
	 * Returns the run results for the {@link Feature}s in the {@link Project} with a specified {@link Tag}.
	 * @return
	 */
	public List<FeatureRunnerResult> getFeatureResultsByTag(Tag tag);

}
