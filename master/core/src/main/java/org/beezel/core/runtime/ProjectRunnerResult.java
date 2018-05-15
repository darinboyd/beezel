package org.beezel.core.runtime;

import java.util.List;

import org.beezel.core.model.project.project.Project;
import org.beezel.core.model.project.project.Story;
import org.beezel.core.model.project.project.Tag;

/**
 * Reports run results for a full {@link Project} model.
 * @author Darin Boyd
 *
 */
public interface ProjectRunnerResult {
	
	/**
	 * Returns all of the run results for the {@link Story}s in the {@link Project}
	 * @return
	 */
	public List<StoryRunnerResult> getAllStoryResults();
	
	/**
	 * Returns the run results for the {@link Story}s in the {@link Project} by status.
	 * @return
	 */
	public List<StoryRunnerResult> getStoryResultsByStatus(TestEntityResultStatus status);
	
	/**
	 * Returns the run results for the {@link Story}s in the {@link Project} with a specified {@link Tag}.
	 * @return
	 */
	public List<StoryRunnerResult> getStoryResultsByTag(Tag tag);

}
