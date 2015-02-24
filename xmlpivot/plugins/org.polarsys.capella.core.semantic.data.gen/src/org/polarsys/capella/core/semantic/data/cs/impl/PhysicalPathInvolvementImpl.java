/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *     
 * Contributors:
 *    Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.core.semantic.data.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.semantic.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.core.semantic.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.semantic.data.capellacore.PropertyValueGroup;

import org.polarsys.capella.core.semantic.data.cs.AbstractPathInvolvedElement;
import org.polarsys.capella.core.semantic.data.cs.CsPackage;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement;

import org.polarsys.capella.core.semantic.data.modellingcore.impl.ModelElementImpl;

import org.polarsys.capella.core.semantic.data.requirement.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Path Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl#getAppliedRequirements <em>Applied Requirements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl#getNextInvolvements <em>Next Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl#getInvolvedElement <em>Involved Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalPathInvolvementImpl extends ModelElementImpl implements PhysicalPathInvolvement {
	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReview() <em>Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected static final String REVIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReview() <em>Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected String review = REVIEW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValues() <em>Owned Property Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPropertyValue> ownedPropertyValues;

	/**
	 * The cached value of the '{@link #getOwnedEnumerationPropertyTypes() <em>Owned Enumeration Property Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnumerationPropertyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationPropertyType> ownedEnumerationPropertyTypes;

	/**
	 * The cached value of the '{@link #getAppliedPropertyValues() <em>Applied Property Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPropertyValue> appliedPropertyValues;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValueGroups() <em>Owned Property Value Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValueGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValueGroup> ownedPropertyValueGroups;

	/**
	 * The cached value of the '{@link #getAppliedPropertyValueGroups() <em>Applied Property Value Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPropertyValueGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValueGroup> appliedPropertyValueGroups;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EnumerationPropertyLiteral status;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationPropertyLiteral> features;

	/**
	 * The cached value of the '{@link #getAppliedRequirements() <em>Applied Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> appliedRequirements;

	/**
	 * The cached value of the '{@link #getNextInvolvements() <em>Next Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPathInvolvement> nextInvolvements;

	/**
	 * The cached value of the '{@link #getInvolvedElement() <em>Involved Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedElement()
	 * @generated
	 * @ordered
	 */
	protected AbstractPathInvolvedElement involvedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalPathInvolvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PHYSICAL_PATH_INVOLVEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PHYSICAL_PATH_INVOLVEMENT__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PHYSICAL_PATH_INVOLVEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReview() {
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReview(String newReview) {
		String oldReview = review;
		review = newReview;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PHYSICAL_PATH_INVOLVEMENT__REVIEW, oldReview, review));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPropertyValue> getOwnedPropertyValues() {
		if (ownedPropertyValues == null) {
			ownedPropertyValues = new EObjectContainmentEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUES);
		}
		return ownedPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationPropertyType> getOwnedEnumerationPropertyTypes() {
		if (ownedEnumerationPropertyTypes == null) {
			ownedEnumerationPropertyTypes = new EObjectContainmentEList<EnumerationPropertyType>(EnumerationPropertyType.class, this, CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_ENUMERATION_PROPERTY_TYPES);
		}
		return ownedEnumerationPropertyTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPropertyValue> getAppliedPropertyValues() {
		if (appliedPropertyValues == null) {
			appliedPropertyValues = new EObjectResolvingEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUES);
		}
		return appliedPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValueGroup> getOwnedPropertyValueGroups() {
		if (ownedPropertyValueGroups == null) {
			ownedPropertyValueGroups = new EObjectContainmentEList<PropertyValueGroup>(PropertyValueGroup.class, this, CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUE_GROUPS);
		}
		return ownedPropertyValueGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValueGroup> getAppliedPropertyValueGroups() {
		if (appliedPropertyValueGroups == null) {
			appliedPropertyValueGroups = new EObjectResolvingEList<PropertyValueGroup>(PropertyValueGroup.class, this, CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUE_GROUPS);
		}
		return appliedPropertyValueGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationPropertyLiteral getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (EnumerationPropertyLiteral)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PHYSICAL_PATH_INVOLVEMENT__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationPropertyLiteral basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EnumerationPropertyLiteral newStatus) {
		EnumerationPropertyLiteral oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PHYSICAL_PATH_INVOLVEMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationPropertyLiteral> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<EnumerationPropertyLiteral>(EnumerationPropertyLiteral.class, this, CsPackage.PHYSICAL_PATH_INVOLVEMENT__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getAppliedRequirements() {
		if (appliedRequirements == null) {
			appliedRequirements = new EObjectResolvingEList<Requirement>(Requirement.class, this, CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_REQUIREMENTS);
		}
		return appliedRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPathInvolvement> getNextInvolvements() {
		if (nextInvolvements == null) {
			nextInvolvements = new EObjectResolvingEList<PhysicalPathInvolvement>(PhysicalPathInvolvement.class, this, CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS);
		}
		return nextInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPathInvolvedElement getInvolvedElement() {
		if (involvedElement != null && involvedElement.eIsProxy()) {
			InternalEObject oldInvolvedElement = (InternalEObject)involvedElement;
			involvedElement = (AbstractPathInvolvedElement)eResolveProxy(oldInvolvedElement);
			if (involvedElement != oldInvolvedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT, oldInvolvedElement, involvedElement));
			}
		}
		return involvedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPathInvolvedElement basicGetInvolvedElement() {
		return involvedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvolvedElement(AbstractPathInvolvedElement newInvolvedElement) {
		AbstractPathInvolvedElement oldInvolvedElement = involvedElement;
		involvedElement = newInvolvedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT, oldInvolvedElement, involvedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUES:
				return ((InternalEList<?>)getOwnedPropertyValues()).basicRemove(otherEnd, msgs);
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ((InternalEList<?>)getOwnedEnumerationPropertyTypes()).basicRemove(otherEnd, msgs);
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUE_GROUPS:
				return ((InternalEList<?>)getOwnedPropertyValueGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__SUMMARY:
				return getSummary();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__DESCRIPTION:
				return getDescription();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__REVIEW:
				return getReview();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUES:
				return getOwnedPropertyValues();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
				return getOwnedEnumerationPropertyTypes();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUES:
				return getAppliedPropertyValues();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUE_GROUPS:
				return getOwnedPropertyValueGroups();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
				return getAppliedPropertyValueGroups();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__FEATURES:
				return getFeatures();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_REQUIREMENTS:
				return getAppliedRequirements();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS:
				return getNextInvolvements();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT:
				if (resolve) return getInvolvedElement();
				return basicGetInvolvedElement();
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
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__SUMMARY:
				setSummary((String)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__REVIEW:
				setReview((String)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				getOwnedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				getOwnedEnumerationPropertyTypes().addAll((Collection<? extends EnumerationPropertyType>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				getAppliedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				getOwnedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				getAppliedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__STATUS:
				setStatus((EnumerationPropertyLiteral)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EnumerationPropertyLiteral>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_REQUIREMENTS:
				getAppliedRequirements().clear();
				getAppliedRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS:
				getNextInvolvements().clear();
				getNextInvolvements().addAll((Collection<? extends PhysicalPathInvolvement>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT:
				setInvolvedElement((AbstractPathInvolvedElement)newValue);
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
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__REVIEW:
				setReview(REVIEW_EDEFAULT);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__STATUS:
				setStatus((EnumerationPropertyLiteral)null);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__FEATURES:
				getFeatures().clear();
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_REQUIREMENTS:
				getAppliedRequirements().clear();
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS:
				getNextInvolvements().clear();
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT:
				setInvolvedElement((AbstractPathInvolvedElement)null);
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
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__REVIEW:
				return REVIEW_EDEFAULT == null ? review != null : !REVIEW_EDEFAULT.equals(review);
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUES:
				return ownedPropertyValues != null && !ownedPropertyValues.isEmpty();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ownedEnumerationPropertyTypes != null && !ownedEnumerationPropertyTypes.isEmpty();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUES:
				return appliedPropertyValues != null && !appliedPropertyValues.isEmpty();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUE_GROUPS:
				return ownedPropertyValueGroups != null && !ownedPropertyValueGroups.isEmpty();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
				return appliedPropertyValueGroups != null && !appliedPropertyValueGroups.isEmpty();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__STATUS:
				return status != null;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__FEATURES:
				return features != null && !features.isEmpty();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__APPLIED_REQUIREMENTS:
				return appliedRequirements != null && !appliedRequirements.isEmpty();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS:
				return nextInvolvements != null && !nextInvolvements.isEmpty();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT:
				return involvedElement != null;
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
		result.append(" (summary: ");
		result.append(summary);
		result.append(", description: ");
		result.append(description);
		result.append(", review: ");
		result.append(review);
		result.append(')');
		return result.toString();
	}

} //PhysicalPathInvolvementImpl