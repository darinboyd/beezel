/**
 */
package org.beezel.core.model.project.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Story</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.beezel.core.model.project.project.Story#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.beezel.core.model.project.project.Story#getProject <em>Project</em>}</li>
 *   <li>{@link org.beezel.core.model.project.project.Story#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.beezel.core.model.project.project.ProjectPackage#getStory()
 * @model
 * @generated
 */
public interface Story extends TestEntity {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.beezel.core.model.project.project.Feature}.
	 * It is bidirectional and its opposite is '{@link org.beezel.core.model.project.project.Feature#getStory <em>Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.beezel.core.model.project.project.ProjectPackage#getStory_Features()
	 * @see org.beezel.core.model.project.project.Feature#getStory
	 * @model opposite="Story" containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.beezel.core.model.project.project.Project#getStories <em>Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see org.beezel.core.model.project.project.ProjectPackage#getStory_Project()
	 * @see org.beezel.core.model.project.project.Project#getStories
	 * @model opposite="Stories" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.beezel.core.model.project.project.Story#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.beezel.core.model.project.project.ProjectPackage#getStory_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.beezel.core.model.project.project.Story#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Story
