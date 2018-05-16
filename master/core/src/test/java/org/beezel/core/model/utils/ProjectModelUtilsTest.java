package org.beezel.core.model.utils;



import java.util.List;

import org.beezel.core.model.project.project.Feature;
import org.beezel.core.model.project.project.Project;
import org.beezel.core.model.project.project.ProjectPackage;
import org.beezel.core.model.project.project.TestEntityStatus;
import org.beezel.core.utils.ModelLoader;
import org.beezel.core.utils.ProjectModelUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link ProjectModelUtils}
 * @author Darin Boyd
 *
 */
public class ProjectModelUtilsTest {

	private Project project;
	
	@Before
	public void setUp() {
		
		ModelLoader<Project> loader = new ModelLoader<Project>();
		project = loader.load(ProjectPackage.eINSTANCE.eClass(), "src/test/resources/Project2.beezel", "beezel");
	}
	
	@Test
	public void project_has_three_active_features() {

		List<Feature> features = ProjectModelUtils.getProjectFeaturesByStatus(project, TestEntityStatus.ACTIVE);
		
		Assert.assertEquals(3, features.size());
		
	}
	
	@Test
	public void story_has_two_active_features() {

		List<Feature> features = ProjectModelUtils.getStoryFeaturesByStatus(project.getStories().get(1), TestEntityStatus.ACTIVE);
		
		Assert.assertEquals(2, features.size());
		
	}
	
	

}
