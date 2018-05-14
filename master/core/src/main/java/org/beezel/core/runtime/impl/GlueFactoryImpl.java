package org.beezel.core.runtime.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.beezel.core.runtime.GlueFactory;

/**
 * Implementation of the {@link GlueFactory} interface.
 * @author Darin Boyd
 *
 */
public class GlueFactoryImpl implements GlueFactory {
	
	
	private Map<String, Object> instances = new HashMap<String, Object>();

	@Override
	public void addClass(String glueClassName) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		if(instanceExists(glueClassName)) {
			return;
		}
		
		Class<?> glueClass = Class.forName(glueClassName);
		addClass(glueClass);
		
	}

	@Override
	public void addClass(Class<?> glueClass) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		if(instanceExists(glueClass.getName())) {
			return;
		}
		
		Constructor<?> constructor = glueClass.getConstructor();
		Object instance = constructor.newInstance();
		
		instances.put(glueClass.getName(), instance);
		
	}

	@Override
	public void addClassesByName(List<String> glueClassNames) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		for(String className : glueClassNames) {
			addClass(className);
		}
		
	}

	@Override
	public void addClasses(List<Class<?>> glueClasses) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
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
