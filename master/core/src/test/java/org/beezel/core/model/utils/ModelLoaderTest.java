package org.beezel.core.model.utils;

import static org.junit.Assert.*;

import org.beezel.core.model.project.project.Project;
import org.beezel.core.model.project.project.ProjectPackage;
import org.beezel.core.utils.ModelLoader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Verify functionality of the {@link ModelLoader} utility.
 * @author Darin Boyd
 *
 */
public class ModelLoaderTest {

	private ModelLoader<Project> loader;
	private Project project;
	
	@Before
	public void setup() {
		
		loader = new ModelLoader<Project>();
		project = loader.load(ProjectPackage.eINSTANCE.eClass(), "src/test/resources/Project.beezel", "beezel");
		
	}
	
	@Test
	public void model_is_not_null() {
		
		Assert.assertTrue("model should not be null.", project != null);
	}

}
