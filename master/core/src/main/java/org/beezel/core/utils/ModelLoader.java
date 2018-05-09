/**
 * @author Darin Boyd
 * Loads an EMF model generically.
 */
package org.beezel.core.utils;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ModelLoader<T> {
	
	/**
	 * Loads a model of type T
	 * @param initializedModelPackage - The result of a call to T.eINSTANCE
	 * @param modelLocation - Model URI
	 * @param fileExtension - File extension of model file.
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T load(EClass initializedModelPackage, String modelLocation, String fileExtension) {
		
		// Register the XMI resource factory for the file extension

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> map = reg.getExtensionToFactoryMap();
        map.put(fileExtension, new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI.createURI(modelLocation), true);
        
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        T modelInstance = (T) resource.getContents().get(0);
        
        return modelInstance;
	}

}
