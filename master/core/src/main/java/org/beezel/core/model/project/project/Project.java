/**
 */
package org.beezel.core.model.project.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.beezel.core.model.project.project.Project#getStories <em>Stories</em>}</li>
 *   <li>{@link org.beezel.core.model.project.project.Project#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.beezel.core.model.project.project.ProjectPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Stories</b></em>' containment reference list.
	 * The list contents are of type {@link org.beezel.core.model.project.project.Story}.
	 * It is bidirectional and its opposite is '{@link org.beezel.core.model.project.project.Story#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stories</em>' containment reference list.
	 * @see org.beezel.core.model.project.project.ProjectPackage#getProject_Stories()
	 * @see org.beezel.core.model.project.project.Story#getProject
	 * @model opposite="Project" containment="true"
	 * @generated
	 */
	EList<Story> getStories();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link org.beezel.core.model.project.project.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see org.beezel.core.model.project.project.ProjectPackage#getProject_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

} // Project
