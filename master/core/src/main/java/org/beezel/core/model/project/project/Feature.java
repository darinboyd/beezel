/**
 */
package org.beezel.core.model.project.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.beezel.core.model.project.project.Feature#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link org.beezel.core.model.project.project.Feature#getCodeBehindClass <em>Code Behind Class</em>}</li>
 *   <li>{@link org.beezel.core.model.project.project.Feature#getStory <em>Story</em>}</li>
 *   <li>{@link org.beezel.core.model.project.project.Feature#getNarrative <em>Narrative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.beezel.core.model.project.project.ProjectPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends TestEntity {
	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link org.beezel.core.model.project.project.Scenario}.
	 * It is bidirectional and its opposite is '{@link org.beezel.core.model.project.project.Scenario#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see org.beezel.core.model.project.project.ProjectPackage#getFeature_Scenarios()
	 * @see org.beezel.core.model.project.project.Scenario#getFeature
	 * @model opposite="Feature" containment="true"
	 * @generated
	 */
	EList<Scenario> getScenarios();

	/**
	 * Returns the value of the '<em><b>Code Behind Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Behind Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Behind Class</em>' attribute.
	 * @see #setCodeBehindClass(String)
	 * @see org.beezel.core.model.project.project.ProjectPackage#getFeature_CodeBehindClass()
	 * @model
	 * @generated
	 */
	String getCodeBehindClass();

	/**
	 * Sets the value of the '{@link org.beezel.core.model.project.project.Feature#getCodeBehindClass <em>Code Behind Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Behind Class</em>' attribute.
	 * @see #getCodeBehindClass()
	 * @generated
	 */
	void setCodeBehindClass(String value);

	/**
	 * Returns the value of the '<em><b>Story</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.beezel.core.model.project.project.Story#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Story</em>' container reference.
	 * @see #setStory(Story)
	 * @see org.beezel.core.model.project.project.ProjectPackage#getFeature_Story()
	 * @see org.beezel.core.model.project.project.Story#getFeatures
	 * @model opposite="Features" required="true" transient="false"
	 * @generated
	 */
	Story getStory();

	/**
	 * Sets the value of the '{@link org.beezel.core.model.project.project.Feature#getStory <em>Story</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Story</em>' container reference.
	 * @see #getStory()
	 * @generated
	 */
	void setStory(Story value);

	/**
	 * Returns the value of the '<em><b>Narrative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Narrative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Narrative</em>' attribute.
	 * @see #setNarrative(String)
	 * @see org.beezel.core.model.project.project.ProjectPackage#getFeature_Narrative()
	 * @model
	 * @generated
	 */
	String getNarrative();

	/**
	 * Sets the value of the '{@link org.beezel.core.model.project.project.Feature#getNarrative <em>Narrative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Narrative</em>' attribute.
	 * @see #getNarrative()
	 * @generated
	 */
	void setNarrative(String value);

} // Feature
