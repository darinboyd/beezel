package org.beezel.core.runtime.impl;

import java.util.List;

import org.beezel.core.model.project.project.Tag;
import org.beezel.core.runtime.FeatureRunnerResult;
import org.beezel.core.runtime.ProjectRunnerResult;
import org.beezel.core.runtime.StoryRunnerResult;
import org.beezel.core.runtime.TestEntityResultStatus;

/**
 * Implementation od {@link ProjectRunnerResult}
 * @author Darin Boyd
 *
 */
public class ProjectRunnerResultImpl implements ProjectRunnerResult {

	@Override
	public List<StoryRunnerResult> getAllStoryResults() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StoryRunnerResult> getStoryResultsByStatus(TestEntityResultStatus status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StoryRunnerResult> getStoryResultsByTag(Tag tag) {
		// TODO Auto-generated method stub
		return null;
	}

}
