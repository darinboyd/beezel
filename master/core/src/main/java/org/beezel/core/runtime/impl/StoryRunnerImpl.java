package org.beezel.core.runtime.impl;

import org.beezel.core.model.project.project.Feature;
import org.beezel.core.model.project.project.Story;
import org.beezel.core.model.project.project.TestEntityStatus;
import org.beezel.core.runtime.FeatureRunner;
import org.beezel.core.runtime.GlueFactory;
import org.beezel.core.runtime.StoryRunner;
import org.beezel.core.runtime.StoryRunnerException;
import org.beezel.core.runtime.StoryRunnerResult;
import org.beezel.core.runtime.TestEntityResultStatus;

/**
 * Implementation of {@link StoryRunner} interface
 * @author Darin Boyd
 *
 */
public class StoryRunnerImpl implements StoryRunner {

	//TODO: Test me
	private GlueFactory glueFactory;
	private FeatureRunner featureRunner;
	
	@Override
	public StoryRunnerResult run(Story story) throws StoryRunnerException {
		
		StoryRunnerResult result = new StoryRunnerResultImpl();
		result.setStory(story);
		
		for(Feature feature : story.getFeatures()) {
			
			if(feature.getStatus().equals(TestEntityStatus.ACTIVE)) {
				//run it
			}else {
				result = createSkippedStoryresutl(story);
			}
			
		}
		
		return result;
	}

	@Override
	public GlueFactory getGlueFactory() {
		
		return glueFactory;
	}

	@Override
	public void setGlueFactory(GlueFactory glueFactory) {
		
		this.glueFactory = glueFactory;
		
	}

	/**
	 * Helper method creates an instance of {@link StoryRunnerResult} from a {@link Story} instance for skipped stories.
	 * @param story
	 * @return
	 */
	private StoryRunnerResult createSkippedStoryresutl(Story story) {
		
		StoryRunnerResult result = new StoryRunnerResultImpl();
		result.setStory(story);
		
		switch (story.getStatus()) {
		
		case IN_ACTIVE:
			result.setStatus(TestEntityResultStatus.Skipped);
			break;
			
		case IN_PROGRESS:
			result.setStatus(TestEntityResultStatus.InProgress);
			break;
			
		case PENDING:
			result.setStatus(TestEntityResultStatus.Pending);
			break;

		default:
			break;
		}
		
		return result;
	}

	@Override
	public FeatureRunner getFeatureRunner() {
		
		return featureRunner;
	}

	@Override
	public void setFeatureRunner(FeatureRunner featureRunner) {
		
		this.featureRunner = featureRunner;
	}
}
