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
	
	@Test
	public void project_has_two_tags() {
		
		Assert.assertEquals(2, project.getTags().size());
		
	}
	
	@Test
	public void project_has_one_story() {
		
		Assert.assertEquals(1, project.getStories().size());
		
	}
	
	@Test
	public void story_has_one_tag() {
		
		Assert.assertEquals(1, project.getStories().get(0).getTags().size());
		
	}
	
	@Test
	public void story_has_one_feature() {
		
		Assert.assertEquals(1, project.getStories().get(0).getFeatures().size());
		
	}
	
	@Test
	public void feature_has_one_tag() {
		
		Assert.assertEquals(1, project.getStories().get(0).getFeatures().get(0).getTags().size());
		
	}
	
	@Test
	public void feature_has_one_scenario() {
		
		Assert.assertEquals(1, project.getStories().get(0).getFeatures().get(0).getScenarios().size());
		
	}
	
	@Test
	public void scenario_has_one_tag() {
		
		Assert.assertEquals(1, project.getStories().get(0).getFeatures().get(0).getScenarios().get(0).getTags().size());
		
	}
	
	@Test
	public void scenario_has_one_step() {
		
		Assert.assertEquals(1, project.getStories().get(0).getFeatures().get(0).getScenarios().get(0).getSteps().size());
		
	}

}
