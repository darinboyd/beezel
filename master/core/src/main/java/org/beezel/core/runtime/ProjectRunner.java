package org.beezel.core.runtime;

import org.beezel.core.model.project.project.Project;
import org.beezel.core.utils.ModelLoader;

/**
 * Runs test from a Beezel {@link Project} model.
 * @author Darin Boyd
 *
 */
public interface ProjectRunner {
	
	/**
	 * Runs a full test project.
	 * @param projectModelLocation - Location of the project model file.
	 * @return
	 */
	public ProjectRunnerResult run(String projectModelLocation) throws ProjectRunnerException;
	
	/**
	 * Runs a full test project.
	 * @param project - Project instance.
	 * @return
	 */
	public ProjectRunnerResult run(Project project) throws ProjectRunnerException;
	
	/**
	 * Gets the {@link GlueFactory} instance.
	 * @return
	 */
	public GlueFactory getGlueFactory();
	
	/**
	 * Sets the {@link GlueFactory} instance.
	 * @param glueFactory
	 */
	public void setGlueFactory(GlueFactory glueFactory);
	
	/**
	 * Gets the {@link ModelLoader} instance.
	 * @return
	 */
	public ModelLoader<Project> getModelLoader();
	
	/**
	 * Sets the {@link ModelLoader} instance.
	 * @param modelLoader
	 */
	public void setModelLoader(ModelLoader<Project> modelLoader);
	

}
