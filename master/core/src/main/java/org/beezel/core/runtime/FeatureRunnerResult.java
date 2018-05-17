package org.beezel.core.runtime;

import java.util.List;

import org.beezel.core.model.project.project.Feature;

/**
 * Reports run results for a {@link Feature}
 * @author Darin Boyd
 *
 */
public interface FeatureRunnerResult extends RunnerResult {
	
	/**
	 * Returns all scenario results.
	 * @return
	 */
	public List<ScenarioRunnerResult> getAllScenarioRunnerResults();
	
	/**
	 * Returns scenario results by status.
	 * @param status
	 * @return
	 */
	public List<ScenarioRunnerResult> getScenarioResultsByStatus(TestEntityResultStatus status);
	
	/**
	 * Returns the feature which was run.
	 * @return
	 */
	public Feature getFeature();
	
	/**
	 * Sets the feature which was run.
	 * @param feature
	 */
	public void setFeature(Feature feature);

}
