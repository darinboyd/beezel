package org.beezel.core.runtime.impl;

import java.util.List;

import org.beezel.core.model.project.project.Feature;
import org.beezel.core.runtime.FeatureRunnerResult;
import org.beezel.core.runtime.ScenarioRunnerResult;
import org.beezel.core.runtime.TestEntityResultStatus;

/**
 * Implementation of {@link FeatureRunnerResult} interface
 * @author Darin Boyd
 *
 */
public class FeatureRunnerResultImpl implements FeatureRunnerResult {

	@Override
	public TestEntityResultStatus getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStatus(TestEntityResultStatus status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ScenarioRunnerResult> getAllScenarioRunnerResults() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScenarioRunnerResult> getScenarioResultsByStatus(TestEntityResultStatus status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Feature getFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFeature(Feature feature) {
		// TODO Auto-generated method stub
		
	}

}
