/**
 */
package org.beezel.core.model.project.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.beezel.core.model.project.project.TestEntity#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.beezel.core.model.project.project.ProjectPackage#getTestEntity()
 * @model abstract="true"
 * @generated
 */
public interface TestEntity extends NamedElement, Taggable {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"Active"</code>.
	 * The literals are from the enumeration {@link org.beezel.core.model.project.project.TestEntityStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.beezel.core.model.project.project.TestEntityStatus
	 * @see #setStatus(TestEntityStatus)
	 * @see org.beezel.core.model.project.project.ProjectPackage#getTestEntity_Status()
	 * @model default="Active" required="true"
	 * @generated
	 */
	TestEntityStatus getStatus();

	/**
	 * Sets the value of the '{@link org.beezel.core.model.project.project.TestEntity#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.beezel.core.model.project.project.TestEntityStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(TestEntityStatus value);

} // TestEntity
