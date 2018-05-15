package org.beezel.core.runtime;

/**
 * Basic interface for all executable test entity results.
 * @author Darin Boyd
 *
 */
public interface RunnerResult {
	
	/**
	 * Gets the status of the runner result.
	 * @return
	 */
	public TestEntityResultStatus getStatus();
	
	/**
	 * Sets the runner result status.
	 * @param status
	 */
	public void setStatus(TestEntityResultStatus status);
	
}
