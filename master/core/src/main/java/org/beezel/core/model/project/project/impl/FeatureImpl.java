/**
 */
package org.beezel.core.model.project.project.impl;

import java.util.Collection;

import org.beezel.core.model.project.project.Feature;
import org.beezel.core.model.project.project.ProjectPackage;
import org.beezel.core.model.project.project.Scenario;
import org.beezel.core.model.project.project.Story;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.beezel.core.model.project.project.impl.FeatureImpl#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link org.beezel.core.model.project.project.impl.FeatureImpl#getCodeBehindClass <em>Code Behind Class</em>}</li>
 *   <li>{@link org.beezel.core.model.project.project.impl.FeatureImpl#getStory <em>Story</em>}</li>
 *   <li>{@link org.beezel.core.model.project.project.impl.FeatureImpl#getNarrative <em>Narrative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends TestEntityImpl implements Feature {
	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

	/**
	 * The default value of the '{@link #getCodeBehindClass() <em>Code Behind Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBehindClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_BEHIND_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeBehindClass() <em>Code Behind Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBehindClass()
	 * @generated
	 * @ordered
	 */
	protected String codeBehindClass = CODE_BEHIND_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNarrative() <em>Narrative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarrative()
	 * @generated
	 * @ordered
	 */
	protected static final String NARRATIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNarrative() <em>Narrative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarrative()
	 * @generated
	 * @ordered
	 */
	protected String narrative = NARRATIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentWithInverseEList<Scenario>(Scenario.class, this, ProjectPackage.FEATURE__SCENARIOS, ProjectPackage.SCENARIO__FEATURE);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeBehindClass() {
		return codeBehindClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeBehindClass(String newCodeBehindClass) {
		String oldCodeBehindClass = codeBehindClass;
		codeBehindClass = newCodeBehindClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.FEATURE__CODE_BEHIND_CLASS, oldCodeBehindClass, codeBehindClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Story getStory() {
		if (eContainerFeatureID() != ProjectPackage.FEATURE__STORY) return null;
		return (Story)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStory(Story newStory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStory, ProjectPackage.FEATURE__STORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStory(Story newStory) {
		if (newStory != eInternalContainer() || (eContainerFeatureID() != ProjectPackage.FEATURE__STORY && newStory != null)) {
			if (EcoreUtil.isAncestor(this, newStory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStory != null)
				msgs = ((InternalEObject)newStory).eInverseAdd(this, ProjectPackage.STORY__FEATURES, Story.class, msgs);
			msgs = basicSetStory(newStory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.FEATURE__STORY, newStory, newStory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNarrative() {
		return narrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNarrative(String newNarrative) {
		String oldNarrative = narrative;
		narrative = newNarrative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.FEATURE__NARRATIVE, oldNarrative, narrative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectPackage.FEATURE__SCENARIOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScenarios()).basicAdd(otherEnd, msgs);
			case ProjectPackage.FEATURE__STORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStory((Story)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectPackage.FEATURE__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
			case ProjectPackage.FEATURE__STORY:
				return basicSetStory(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProjectPackage.FEATURE__STORY:
				return eInternalContainer().eInverseRemove(this, ProjectPackage.STORY__FEATURES, Story.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjectPackage.FEATURE__SCENARIOS:
				return getScenarios();
			case ProjectPackage.FEATURE__CODE_BEHIND_CLASS:
				return getCodeBehindClass();
			case ProjectPackage.FEATURE__STORY:
				return getStory();
			case ProjectPackage.FEATURE__NARRATIVE:
				return getNarrative();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProjectPackage.FEATURE__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends Scenario>)newValue);
				return;
			case ProjectPackage.FEATURE__CODE_BEHIND_CLASS:
				setCodeBehindClass((String)newValue);
				return;
			case ProjectPackage.FEATURE__STORY:
				setStory((Story)newValue);
				return;
			case ProjectPackage.FEATURE__NARRATIVE:
				setNarrative((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProjectPackage.FEATURE__SCENARIOS:
				getScenarios().clear();
				return;
			case ProjectPackage.FEATURE__CODE_BEHIND_CLASS:
				setCodeBehindClass(CODE_BEHIND_CLASS_EDEFAULT);
				return;
			case ProjectPackage.FEATURE__STORY:
				setStory((Story)null);
				return;
			case ProjectPackage.FEATURE__NARRATIVE:
				setNarrative(NARRATIVE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProjectPackage.FEATURE__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
			case ProjectPackage.FEATURE__CODE_BEHIND_CLASS:
				return CODE_BEHIND_CLASS_EDEFAULT == null ? codeBehindClass != null : !CODE_BEHIND_CLASS_EDEFAULT.equals(codeBehindClass);
			case ProjectPackage.FEATURE__STORY:
				return getStory() != null;
			case ProjectPackage.FEATURE__NARRATIVE:
				return NARRATIVE_EDEFAULT == null ? narrative != null : !NARRATIVE_EDEFAULT.equals(narrative);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (CodeBehindClass: ");
		result.append(codeBehindClass);
		result.append(", Narrative: ");
		result.append(narrative);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
