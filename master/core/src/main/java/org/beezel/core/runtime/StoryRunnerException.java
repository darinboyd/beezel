package org.beezel.core.runtime;

/**
 * Custom exception class for {@link StoryRunner}s
 * @author Darin Boyd
 *
 */
public class StoryRunnerException extends Throwable {
	
	/**
	 * Default serialization ID
	 */
	private static final long serialVersionUID = 1L;

	public StoryRunnerException(Throwable cause) {
		
		super("An exception was thrown while trying to run a story.", cause);
		
	}

}
