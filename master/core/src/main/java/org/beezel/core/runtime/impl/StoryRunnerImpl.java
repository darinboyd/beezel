package org.beezel.core.runtime.impl;

import org.beezel.core.model.project.project.Feature;
import org.beezel.core.model.project.project.Story;
import org.beezel.core.model.project.project.TestEntityStatus;
import org.beezel.core.runtime.GlueFactory;
import org.beezel.core.runtime.StoryRunner;
import org.beezel.core.runtime.StoryRunnerException;
import org.beezel.core.runtime.StoryRunnerResult;

/**
 * Implementation of {@link StoryRunner} interface
 * @author Darin Boyd
 *
 */
public class StoryRunnerImpl implements StoryRunner {

	//TODO: Test me
	private GlueFactory glueFactory;
	
	@Override
	public StoryRunnerResult run(Story story) throws StoryRunnerException {
		
		StoryRunnerResult result = new StoryRunnerResultImpl();
		result.setStory(story);
		
		for(Feature feature : story.getFeatures()) {
			
			if(feature.getStatus().equals(TestEntityStatus.ACTIVE)) {
				//run it
			}else {
				//skip it
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

}
