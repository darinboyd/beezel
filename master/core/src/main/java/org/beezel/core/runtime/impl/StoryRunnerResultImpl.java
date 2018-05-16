package org.beezel.core.runtime.impl;

import java.util.ArrayList;
import java.util.List;

import org.beezel.core.model.project.project.Story;
import org.beezel.core.runtime.FeatureRunnerResult;
import org.beezel.core.runtime.StoryRunnerResult;
import org.beezel.core.runtime.TestEntityResultStatus;

/**
 * Implementation of {@link StoryRunnerResult} interface
 * @author Darin Boyd
 *
 */
public class StoryRunnerResultImpl implements StoryRunnerResult {
	
	private Story story;
	private TestEntityResultStatus status;
	private List<FeatureRunnerResult> allFeatureResults = new ArrayList<FeatureRunnerResult>();
	
	//TODO: Test me
	@Override
	public TestEntityResultStatus getStatus() {
		
		return status;
	}

	@Override
	public void setStatus(TestEntityResultStatus status) {
		
		this.status = status;
	}

	@Override
	public Story getStory() {
		
		return story;
	}

	@Override
	public void setStory(Story story) {
		
		this.story = story;
	}

	@Override
	public List<FeatureRunnerResult> getAllFeatureResults() {
		
		return allFeatureResults;
	}

}
