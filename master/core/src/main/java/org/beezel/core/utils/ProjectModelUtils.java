package org.beezel.core.utils;

import java.util.ArrayList;
import java.util.List;

import org.beezel.core.model.project.project.Feature;
import org.beezel.core.model.project.project.Project;
import org.beezel.core.model.project.project.Story;
import org.beezel.core.model.project.project.TestEntityStatus;
import org.beezel.core.runtime.GlueFactory;
import org.beezel.core.runtime.GlueFactoryException;

/**
 * Utilities for performing common {@link Project} tasks.
 * @author Darin Boyd
 *
 */
public class ProjectModelUtils {
	
	//TODO: Test me
	
	/**
	 * Returns a list of project features with the desired status.
	 * @param project
	 * @param status
	 * @return
	 */
	public static List<Feature> getProjectFeaturesByStatus(Project project, TestEntityStatus status){
		
		List<Feature> results = new ArrayList<Feature>();
		
		for(Story story : project.getStories()) {
			
			results.addAll(getStoryFeaturesByStatus(story, status));
			
		}
		
		return results;		
	}
	
	/**
	 * Returns a list of story features with the desired status.
	 * @param story
	 * @param status
	 * @return
	 */
	public static List<Feature> getStoryFeaturesByStatus(Story story, TestEntityStatus status){
		
		List<Feature> results = new ArrayList<Feature>();
		
		for(Feature feature : story.getFeatures()) {
			
			if(feature.getStatus().equals(status)) {
				results.add(feature);
			}			
		}
		
		return results;		
		
	}
	
	/**
	 * Registers glue code from all active project features.
	 * @param project - Project containing features.
	 * @param factory - Glue factory in which to register feature glue code.
	 * @throws GlueFactoryException 
	 */
	public static void registerFeatureGlue(Project project, GlueFactory factory) throws GlueFactoryException {
		
		List<Feature> activeFeatures = getProjectFeaturesByStatus(project, TestEntityStatus.ACTIVE);
		
		for(Feature feature : activeFeatures) {
			
			factory.addClass(feature.getCodeBehindClass());
			
		}
	}

}
