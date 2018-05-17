package org.beezel.core.runtime.impl;

import org.beezel.core.model.project.project.Feature;
import org.beezel.core.model.project.project.Scenario;
import org.beezel.core.model.project.project.TestEntityStatus;
import org.beezel.core.runtime.FeatureRunner;
import org.beezel.core.runtime.FeatureRunnerResult;
import org.beezel.core.runtime.GlueFactory;
import org.beezel.core.runtime.ScenarioRunner;

/**
 * Implementation of {@link FeatureRunner} interface
 * @author Darin Boyd
 *
 */
public class FeatureRunnerImpl implements FeatureRunner{

	private ScenarioRunner scenarioRunner;
	
	@Override
	public FeatureRunnerResult run(GlueFactory glueFactory, Feature feature) {
		
		FeatureRunnerResult result = null;
		
		// if the Feature is not active, don't run it
		if(feature.getStatus() != TestEntityStatus.ACTIVE) {
			
			//TODO: set up a result and return it
			return result;
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

}
