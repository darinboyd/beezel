package org.beezel.core.runtime;

/**
 * Exceptions related to class and instance loading in the {@link ProjectRunner}.
 * @author Darin Boyd
 *
 */
public class ProjectRunnerException extends Throwable {
	
	/**
	 * Default serialization ID
	 */
	private static final long serialVersionUID = 1L;	
	
	public ProjectRunnerException(String message, Throwable cause) {
		super(message, cause);
		
	}
	
	public ProjectRunnerException(Throwable cause) {
		super("An exception was thrown while trying to run a beezel project.", cause);
		
	}

}
