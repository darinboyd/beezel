/**
 */
package org.beezel.core.model.project.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taggable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.beezel.core.model.project.project.Taggable#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.beezel.core.model.project.project.ProjectPackage#getTaggable()
 * @model abstract="true"
 * @generated
 */
public interface Taggable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link org.beezel.core.model.project.project.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see org.beezel.core.model.project.project.ProjectPackage#getTaggable_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

} // Taggable
