package org.beezel.core.runtime.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.beezel.core.runtime.GlueFactory;
import org.beezel.core.runtime.GlueFactoryException;
import org.beezel.core.runtime.impl.GlueFactoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link GlueFactory} test fixture.
 * 
 * @author Darin Boyd
 *
 */
public class GlueFactoryTest {

	private GlueFactory factory;

	@Before
	public void setUp() {

		factory = new GlueFactoryImpl();

	}

	@Test
	public void register_by_name() throws GlueFactoryException {

		// use any valid class name and register by name.
		// I'm using the factories class name;
		String className = GlueFactoryImpl.class.getName();
		factory.addClass(className);

		Assert.assertNotNull(factory.getInstance(className));
		Assert.assertEquals(1, factory.getAllInstances().size());
	}
	
	@Test
	public void register_by__bad_name_throws_exception() {

		
		String className = "some.bad.class.name.NotReal";
		try {
			factory.addClass(className);
		} catch (GlueFactoryException e) {
			Assert.assertEquals(GlueFactoryException.class, e.getClass());
		}

		
		Assert.assertEquals(0, factory.getAllInstances().size());
	}

	@Test
	public void register_by_class_object() throws GlueFactoryException {

		factory.addClass(GlueFactoryImpl.class);

		Assert.assertNotNull(factory.getInstance(GlueFactoryImpl.class));
		Assert.assertEquals(1, factory.getAllInstances().size());
	}

	@Test
	public void register_by_name_list() throws GlueFactoryException {
		
		List<String> classNames = new ArrayList<String>();
		classNames.add(String.class.getName());
		classNames.add(this.getClass().getName());
		
		factory.addClassesByName(classNames);

		Assert.assertEquals(2, factory.getAllInstances().size());
	}

	@Test
	public void register_by_class_list() throws GlueFactoryException {
		
		List<Class<?>> classes = new ArrayList<Class<?>>();
		classes.add(this.getClass());
		classes.add(String.class);
		
		factory.addClasses(classes);
		
		Assert.assertEquals(2, factory.getAllInstances().size());
		
	}

	@Test
	public void duplicates_are_not_registered() throws GlueFactoryException {
		
		// register twice to see if there is still only one instance registered.
		factory.addClass(GlueFactoryImpl.class);
		factory.addClass(GlueFactoryImpl.class);

		Assert.assertNotNull(factory.getInstance(GlueFactoryImpl.class));
		Assert.assertEquals(1, factory.getAllInstances().size());
		
	}

}
