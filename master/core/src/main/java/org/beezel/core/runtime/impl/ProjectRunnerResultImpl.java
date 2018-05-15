package org.beezel.core.runtime.impl;

import java.util.ArrayList;
import java.util.List;

import org.beezel.core.model.project.project.Tag;
import org.beezel.core.runtime.ProjectRunnerResult;
import org.beezel.core.runtime.StoryRunnerResult;
import org.beezel.core.runtime.TestEntityResultStatus;

/**
 * Implementation od {@link ProjectRunnerResult}
 * @author Darin Boyd
 *
 */
public class ProjectRunnerResultImpl implements ProjectRunnerResult {
	
	//TODO: Test me
	
	
	private List<StoryRunnerResult> allResults = new ArrayList<StoryRunnerResult>();

	@Override
	public List<StoryRunnerResult> getAllStoryResults() {
		return allResults;
	}

	@Override
	public List<StoryRunnerResult> getStoryResultsByStatus(TestEntityResultStatus status) {
		
		List<StoryRunnerResult> results = new ArrayList<StoryRunnerResult>();
		
		for(StoryRunnerResult result : allResults) {
			
			if(result.getStatus().equals(status)) {
				results.add(result);
			}
		}
		
		return results;
	}

	@Override
	public List<StoryRunnerResult> getStoryResultsByTag(Tag tag) {
		
		List<StoryRunnerResult> results = new ArrayList<StoryRunnerResult>();
		
		for(StoryRunnerResult result : allResults) {
			
			if(result.getStory().getTags().contains(tag)) {
				results.add(result);
			}
		}
		
		return results;
	}

}
