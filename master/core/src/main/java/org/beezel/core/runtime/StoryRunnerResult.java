package org.beezel.core.runtime;

import org.beezel.core.model.project.project.Story;

/**
 * Reports run results for a {@link Story}
 * @author Darin Boyd
 *
 */
public interface StoryRunnerResult extends RunnerResult {
	
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
