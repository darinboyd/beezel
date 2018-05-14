package org.beezel.core.runtime.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.beezel.core.runtime.GlueFactory;
import org.beezel.core.runtime.GlueFactoryException;

/**
 * Implementation of the {@link GlueFactory} interface.
 * @author Darin Boyd
 *
 */
public class GlueFactoryImpl implements GlueFactory {
	
	
	private Map<String, Object> instances = new HashMap<String, Object>();

	@Override
	public void addClass(String glueClassName) throws GlueFactoryException{
		if(instanceExists(glueClassName)) {
			return;
		}
		
		Class<?> glueClass;
		
		try {
			
			glueClass = Class.forName(glueClassName);
			addClass(glueClass);			
		
		} catch (SecurityException | IllegalArgumentException | ClassNotFoundException e) {
			
			throw new GlueFactoryException(e);
			
		}
		
	}

	@Override
	public void addClass(Class<?> glueClass) throws GlueFactoryException {
		
		if(instanceExists(glueClass.getName())) {
			return;
		}
		
		Constructor<?> constructor;
		try {
			
			constructor = glueClass.getConstructor();
			Object instance = constructor.newInstance();
			
			instances.put(glueClass.getName(), instance);
			
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			
			throw new GlueFactoryException(e);
			
		}
		
		
	}

	@Override
	public void addClassesByName(List<String> glueClassNames) throws GlueFactoryException {
		
		for(String className : glueClassNames) {
			try {
				addClass(className);
			} catch (SecurityException | IllegalArgumentException e) {
				throw new GlueFactoryException(e);
			}
		}
		
	}

	@Override
	public void addClasses(List<Class<?>> glueClasses) throws GlueFactoryException {
		
		for(Class<?> glueClass : glueClasses) {
			addClass(glueClass);
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getInstance(Class<T> glueClass) {
		
		return (T) instances.get(glueClass.getName());
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getInstance(String glueClassName) {
		
		return (T) instances.get(glueClassName);
	}

	@Override
	public List<Object> getAllInstances() {
		
		List<Object> allInstances = new ArrayList<Object>();
		
		for(Object instance : instances.values()) {
			allInstances.add(instance);
		}
		
		return allInstances;
	}
	
	/**
	 * Helper method to check for the existence of a registered class instance.
	 * @param className
	 * @return
	 */
	private boolean instanceExists(String className) {
		
		return instances.get(className) != null;
		
	}

}
