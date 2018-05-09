/**
 */
package org.beezel.core.model.project.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.beezel.core.model.project.project.Scenario#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.beezel.core.model.project.project.Scenario#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.beezel.core.model.project.project.ProjectPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends TestEntity {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.beezel.core.model.project.project.Step}.
	 * It is bidirectional and its opposite is '{@link org.beezel.core.model.project.project.Step#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.beezel.core.model.project.project.ProjectPackage#getScenario_Steps()
	 * @see org.beezel.core.model.project.project.Step#getScenario
	 * @model opposite="Scenario" containment="true" required="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.beezel.core.model.project.project.Feature#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' container reference.
	 * @see #setFeature(Feature)
	 * @see org.beezel.core.model.project.project.ProjectPackage#getScenario_Feature()
	 * @see org.beezel.core.model.project.project.Feature#getScenarios
	 * @model opposite="Scenarios" required="true" transient="false"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link org.beezel.core.model.project.project.Scenario#getFeature <em>Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' container reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // Scenario
