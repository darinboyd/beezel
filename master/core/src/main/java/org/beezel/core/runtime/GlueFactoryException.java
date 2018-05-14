package org.beezel.core.runtime;


/**
 * Exceptions related to class and instance loading in the {@link GlueFactory}.
 * @author Darin Boyd
 *
 */
public class GlueFactoryException extends Throwable {

	/**
	 * Default serialization ID
	 */
	private static final long serialVersionUID = 1L;	
	
	public GlueFactoryException(String message, Throwable cause) {
		super(message, cause);
		
	}
	
	public GlueFactoryException(Throwable cause) {
		super("An exception was thrown while trying to register a glue class in the Glue Factory.", cause);
		
	}
	

}
