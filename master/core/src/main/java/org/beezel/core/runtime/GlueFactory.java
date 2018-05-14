package org.beezel.core.runtime;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Creates instances of glue classes and maintains a registry of those instances.
 * @author Darin Boyd
 *
 */
public interface GlueFactory {
	
	/**
	 * Adds an instance of a class to the registry by its fully qualified name.  Duplicates are ignored.
	 * @param glueClassName - fully qualified name of the class.
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void addClass(String glueClassName) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * Adds an instance of a class to the registry.  Duplicates are ignored.
	 * @param glueClass - class object from which to create and register an instance.
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void addClass(Class<?> glueClass) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * Adds multiple class instances to the registry.  Duplicates are ignored.
	 * @param glusClassNames - List of fully qualified class names.
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws ClassNotFoundException 
	 */
	public void addClassesByName(List<String> glueClassNames) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * Adds multiple class instances to the registry.  Duplicates are ignored.
	 * @param glueClasses - list of class objects from which to create and register an instances.
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public void addClasses(List<Class<?>> glueClasses) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * Retrieves an instance of a glue class from the registry.
	 * @param glueClass - class object of the desired class instance.
	 * @return - Returns the instance if available.  Null is returned if not found.
	 */
	public <T> T getInstance(Class<T> glueClass);
	
	/**
	 * Retrieves an instance of a glue class from the registry.
	 * @param glueClassName - fully qualified class name of the desired class instance.
	 * @return
	 */
	public <T> T getInstance(String glueClassName);
	
	/**
	 * Returns the full registry of class instances as a list of objects.
	 * @return - Returns a list of objects.
	 */
	public List<Object> getAllInstances();

}