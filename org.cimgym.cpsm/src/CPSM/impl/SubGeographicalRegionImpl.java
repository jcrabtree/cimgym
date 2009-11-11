/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.GeographicalRegion;
import CPSM.Line;
import CPSM.SubGeographicalRegion;
import CPSM.Substation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Geographical Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.SubGeographicalRegionImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link CPSM.impl.SubGeographicalRegionImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link CPSM.impl.SubGeographicalRegionImpl#getSubstations <em>Substations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubGeographicalRegionImpl extends IdentifiedObjectImpl implements SubGeographicalRegion {
	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected GeographicalRegion region;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * The cached value of the '{@link #getSubstations() <em>Substations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstations()
	 * @generated
	 * @ordered
	 */
	protected EList<Substation> substations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubGeographicalRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.SUB_GEOGRAPHICAL_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicalRegion getRegion() {
		if (region != null && region.eIsProxy()) {
			InternalEObject oldRegion = (InternalEObject)region;
			region = (GeographicalRegion)eResolveProxy(oldRegion);
			if (region != oldRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.SUB_GEOGRAPHICAL_REGION__REGION, oldRegion, region));
			}
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicalRegion basicGetRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(GeographicalRegion newRegion, NotificationChain msgs) {
		GeographicalRegion oldRegion = region;
		region = newRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.SUB_GEOGRAPHICAL_REGION__REGION, oldRegion, newRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(GeographicalRegion newRegion) {
		if (newRegion != region) {
			NotificationChain msgs = null;
			if (region != null)
				msgs = ((InternalEObject)region).eInverseRemove(this, CPSMPackage.GEOGRAPHICAL_REGION__REGIONS, GeographicalRegion.class, msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, CPSMPackage.GEOGRAPHICAL_REGION__REGIONS, GeographicalRegion.class, msgs);
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.SUB_GEOGRAPHICAL_REGION__REGION, newRegion, newRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new EObjectWithInverseResolvingEList<Line>(Line.class, this, CPSMPackage.SUB_GEOGRAPHICAL_REGION__LINES, CPSMPackage.LINE__REGION);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Substation> getSubstations() {
		if (substations == null) {
			substations = new EObjectWithInverseResolvingEList<Substation>(Substation.class, this, CPSMPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, CPSMPackage.SUBSTATION__REGION);
		}
		return substations;
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
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__REGION:
				if (region != null)
					msgs = ((InternalEObject)region).eInverseRemove(this, CPSMPackage.GEOGRAPHICAL_REGION__REGIONS, GeographicalRegion.class, msgs);
				return basicSetRegion((GeographicalRegion)otherEnd, msgs);
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLines()).basicAdd(otherEnd, msgs);
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstations()).basicAdd(otherEnd, msgs);
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
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__REGION:
				return basicSetRegion(null, msgs);
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
				return ((InternalEList<?>)getSubstations()).basicRemove(otherEnd, msgs);
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
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__REGION:
				if (resolve) return getRegion();
				return basicGetRegion();
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__LINES:
				return getLines();
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
				return getSubstations();
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
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__REGION:
				setRegion((GeographicalRegion)newValue);
				return;
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends Line>)newValue);
				return;
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
				getSubstations().clear();
				getSubstations().addAll((Collection<? extends Substation>)newValue);
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
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__REGION:
				setRegion((GeographicalRegion)null);
				return;
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__LINES:
				getLines().clear();
				return;
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
				getSubstations().clear();
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
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__REGION:
				return region != null;
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__LINES:
				return lines != null && !lines.isEmpty();
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
				return substations != null && !substations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubGeographicalRegionImpl
