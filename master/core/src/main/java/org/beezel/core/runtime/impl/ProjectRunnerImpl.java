package org.beezel.core.runtime.impl;

import java.util.List;

import org.beezel.core.model.project.project.Project;
import org.beezel.core.model.project.project.ProjectPackage;
import org.beezel.core.model.project.project.Story;
import org.beezel.core.model.project.project.TestEntityStatus;
import org.beezel.core.runtime.GlueFactory;
import org.beezel.core.runtime.GlueFactoryException;
import org.beezel.core.runtime.ProjectRunner;
import org.beezel.core.runtime.ProjectRunnerException;
import org.beezel.core.runtime.ProjectRunnerResult;
import org.beezel.core.runtime.StoryRunnerResult;
import org.beezel.core.runtime.TestEntityResultStatus;
import org.beezel.core.utils.ModelLoader;
import org.beezel.core.utils.ProjectModelUtils;

/**
 * Implementation of {@link ProjectRunner} interface.
 * @author Darin Boyd
 *
 */
public class ProjectRunnerImpl implements ProjectRunner {
	
	GlueFactory glueFactory;
	ModelLoader<Project> modelLoader;
	
	List<Story> activeStories;
	Project project;
	ProjectRunnerResult result;

	@Override
	public ProjectRunnerResult run(String projectModelLocation) throws ProjectRunnerException {
		
		Project project = modelLoader.load(ProjectPackage.eINSTANCE.eClass(), projectModelLocation, "beezel");
		
		if(project == null) {
			
			throw new ProjectRunnerException("project file was not loaded", null );
			
		}
		else {
			
			return run(project);
			
		}
		
	}

	@Override
	public ProjectRunnerResult run(Project project) throws ProjectRunnerException {
		
		this.project = project;
		
		result = new ProjectRunnerResultImpl();
		
		// register all of the Feature glue classes
		try {
			ProjectModelUtils.registerFeatureGlue(project, glueFactory);
		} catch (GlueFactoryException e) {
			throw new ProjectRunnerException(e);
		}
		
		for(Story story : project.getStories()) {
			
			//TODO: Rework Project Runner interface.
			if(story.getStatus().equals(TestEntityStatus.ACTIVE)) {
				
				// run the story
				
			}else {
				
				result.getAllStoryResults().add(createSkippedStoryresutl(story));
				
			}
		}
		
		return result;
	}	

	@Override
	public GlueFactory getGlueFactory() {
		
		return glueFactory;
	}

	@Override
	public void setGlueFactory(GlueFactory glueFactory) {
		
		this.glueFactory = glueFactory;
		
	}

	@Override
	public ModelLoader<Project> getModelLoader() {
		
		return modelLoader;
	}

	@Override
	public void setModelLoader(ModelLoader<Project> modelLoader) {
		
		this.modelLoader = modelLoader;
		
	}
	
	/**
	 * Helper method creates an instance of {@link StoryRunnerResult} from a {@link Story} instance for skipped stories.
	 * @param story
	 * @return
	 */
	private StoryRunnerResult createSkippedStoryresutl(Story story) {
		
		StoryRunnerResult result = new StoryRunnerResultImpl();
		result.setStory(story);
		
		switch (story.getStatus()) {
		
		case IN_ACTIVE:
			result.setStatus(TestEntityResultStatus.Skipped);
			break;
			
		case IN_PROGRESS:
			result.setStatus(TestEntityResultStatus.InProgress);
			break;
			
		case PENDING:
			result.setStatus(TestEntityResultStatus.Pending);
			break;

		default:
			break;
		}
		
		return result;
	}

}
