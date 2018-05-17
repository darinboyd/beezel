package org.beezel.core.runtime;

import org.beezel.core.model.project.project.Scenario;

/**
 * Runs test from a Beezel {@link Scenario} model.
 * @author Darin Boyd
 *
 */
public interface ScenarioRunner extends RunnerResult {
	
	/**
	 * Runs the scenario
	 * @param glueInstance - instance of glue code class from the glue factory.
	 * @param scenario - scenario to run.
	 * @return
	 */
	public ScenarioRunnerResult run(Object glueInstance, Scenario scenario);

}
