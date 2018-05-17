package org.beezel.core.runtime;

import java.util.List;

import org.beezel.core.model.project.project.Story;

/**
 * Reports run results for a {@link Story}
 * @author Darin Boyd
 *
 */
public interface StoryRunnerResult extends RunnerResult {
	
	/**
	 * All results from the features contained in the story.
	 * @return
	 */
	public List<FeatureRunnerResult> getAllFeatureResults();
	
	/**
	 * Returns results by status.
	 * @return
	 */
	public List<FeatureRunnerResult> getFeatureResultsByStatus(TestEntityResultStatus status);
	
	/**
	 * Gets the project model Story
	 * @return
	 */
	public Story getStory();
	
	/**
	 * Sets the project model Story.
	 * @param story
	 */
	public void setStory(Story story);

}
