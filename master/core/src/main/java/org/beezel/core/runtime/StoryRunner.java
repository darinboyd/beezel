package org.beezel.core.runtime;

import org.beezel.core.model.project.project.Story;

/**
 * Runs test from a Beezel {@link Story} model.
 * @author Darin Boyd
 *
 */
public interface StoryRunner {	
		
	/**
	 * Runs a {@link Story}.
	 * @param story - Story instance.
	 * @return
	 */
	public StoryRunnerResult run(Story story) throws StoryRunnerException;
	
	/**
	 * Gets the {@link GlueFactory} instance.
	 * @return
	 */
	public GlueFactory getGlueFactory();
	
	/**
	 * Sets the {@link GlueFactory} instance.
	 * @param glueFactory
	 */
	public void setGlueFactory(GlueFactory glueFactory);
	
	/**
	 * Gets the {@link FeatureRunner} instance.
	 * @return
	 */
	public FeatureRunner getFeatureRunner();
	
	/**
	 * Sets the {@link FeatureRunner} instance.
	 * @param featureRunner
	 */
	public void setFeatureRunner(FeatureRunner featureRunner);
	
	/**
	 * Gets the {@link Story} instance.
	 * @return
	 */
	public Story getStory();
	

}
