package org.beezel.core.runtime;

/**
 * Run time status of an executed test entity.
 * @author Darin Boyd
 *
 */
public enum TestEntityResultStatus {
	
	/**
	 * Execution did not throw an assertion exception
	 */
	Pass, 
	
	/**
	 * Execution threw an assertion exception
	 */
	Fail,
	
	/**
	 * Execution threw a non-assertion exception
	 */
	Error,
	
	/**
	 * Entity was pending (not yet worked on), so no execution took place
	 */
	Pending,
	
	/**
	 * Entity was worked on but not ready to test, s ono execution took place
	 */
	InProgress,
	
	/**
	 * For a non specified reason, no execution took place.
	 */
	Skipped

}
