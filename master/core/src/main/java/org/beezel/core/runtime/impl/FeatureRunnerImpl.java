package org.beezel.core.runtime.impl;

import org.beezel.core.model.project.project.Feature;
import org.beezel.core.model.project.project.Scenario;
import org.beezel.core.model.project.project.Story;
import org.beezel.core.model.project.project.TestEntityStatus;
import org.beezel.core.runtime.FeatureRunner;
import org.beezel.core.runtime.FeatureRunnerResult;
import org.beezel.core.runtime.GlueFactory;
import org.beezel.core.runtime.ScenarioRunner;
import org.beezel.core.runtime.StoryRunnerResult;
import org.beezel.core.runtime.TestEntityResultStatus;

/**
 * Implementation of {@link FeatureRunner} interface
 * @author Darin Boyd
 *
 */
public class FeatureRunnerImpl implements FeatureRunner{

	//TODO: Test me
	private ScenarioRunner scenarioRunner;
	private Feature feature;
	
	@Override
	public FeatureRunnerResult run(GlueFactory glueFactory, Feature feature) {
		
		this.feature = feature;
		
		FeatureRunnerResult result = null;
		
		// if the Feature is not active, don't run it
		if(feature.getStatus() != TestEntityStatus.ACTIVE) {
			
			return createSkippedStoryResult();
		}
		
		result = new FeatureRunnerResultImpl();
		
		for(Scenario scenario : feature.getScenarios()) {
			
			Object glueInstance = glueFactory.getInstance(feature.getCodeBehindClass());
			result.getAllScenarioRunnerResults().add(scenarioRunner.run(glueInstance, scenario));
			
		}
		
		return result;
	}

	@Override
	public ScenarioRunner getScenarioRunner() {
		
		return scenarioRunner;
	}

	@Override
	public void setScenarioRunner(ScenarioRunner scenarioRunner) {
		
		this.scenarioRunner = scenarioRunner;
		
	}
	
	/**
	 * Helper method creates an instance of {@link FeatureRunnerResult} from a {@link Story} instance for skipped stories.
	 * @return
	 */
	private FeatureRunnerResult createSkippedStoryResult() {
		
		FeatureRunnerResult result = new FeatureRunnerResultImpl();
		result.setFeature(feature);
		
		switch (feature.getStatus()) {
		
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
	public Feature getFeature() {
		return feature;
	}

}
