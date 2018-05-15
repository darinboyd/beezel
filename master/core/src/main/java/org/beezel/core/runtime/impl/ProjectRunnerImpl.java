package org.beezel.core.runtime.impl;

import java.util.List;

import org.beezel.core.model.project.project.Project;
import org.beezel.core.model.project.project.ProjectPackage;
import org.beezel.core.model.project.project.Story;
import org.beezel.core.runtime.GlueFactory;
import org.beezel.core.runtime.ProjectRunner;
import org.beezel.core.runtime.ProjectRunnerException;
import org.beezel.core.runtime.ProjectRunnerResult;
import org.beezel.core.utils.ModelLoader;

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
		
		for(Story story : project.getStories()) {
			
			//TODO: Rework Project Runner interface.
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
	
	private void loadActiveFeatureGlue() {
		
	}
	
	

}
