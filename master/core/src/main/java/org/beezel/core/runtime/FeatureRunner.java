package org.beezel.core.runtime;

import org.beezel.core.model.project.project.Feature;

/**
 * Runs test from a Beezel {@link Feature} model.
 * @author Darin Boyd
 *
 */
public interface FeatureRunner {
	
	/**
	 * Runs the selected {@link Feature}
	 * @param glueFactory - Contains a registry of glue code for all features.
	 * @param feature - {@link Feature} to run.
	 * @return
	 */
	public FeatureRunnerResult run(GlueFactory glueFactory, Feature feature);
	
	/**
	 * Returns the {@link ScenarioRunner}
	 * @return
	 */
	public ScenarioRunner getScenarioRunner();
	
	/**
	 * Sets the {@link ScenarioRunner}
	 * @param scenarioRunner
	 */
	public void setScenarioRunner(ScenarioRunner scenarioRunner);
	
	/**
	 * Gets the model {@link Feature}
	 * @return
	 */
	public Feature getFeature();

}
