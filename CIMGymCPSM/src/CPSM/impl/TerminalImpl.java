/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.ConductingEquipment;
import CPSM.ConnectivityNode;
import CPSM.Measurement;
import CPSM.RegulatingControl;
import CPSM.Terminal;

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
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.TerminalImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CPSM.impl.TerminalImpl#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link CPSM.impl.TerminalImpl#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link CPSM.impl.TerminalImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalImpl extends IdentifiedObjectImpl implements Terminal {
	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurements;

	/**
	 * The cached value of the '{@link #getRegulatingControl() <em>Regulating Control</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatingControl()
	 * @generated
	 * @ordered
	 */
	protected EList<RegulatingControl> regulatingControl;

	/**
	 * The cached value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityNode()
	 * @generated
	 * @ordered
	 */
	protected ConnectivityNode connectivityNode;

	/**
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
	protected ConductingEquipment conductingEquipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.TERMINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectWithInverseResolvingEList<Measurement>(Measurement.class, this, CPSMPackage.TERMINAL__MEASUREMENTS, CPSMPackage.MEASUREMENT__TERMINAL);
		}
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegulatingControl> getRegulatingControl() {
		if (regulatingControl == null) {
			regulatingControl = new EObjectWithInverseResolvingEList<RegulatingControl>(RegulatingControl.class, this, CPSMPackage.TERMINAL__REGULATING_CONTROL, CPSMPackage.REGULATING_CONTROL__TERMINAL);
		}
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNode getConnectivityNode() {
		if (connectivityNode != null && connectivityNode.eIsProxy()) {
			InternalEObject oldConnectivityNode = (InternalEObject)connectivityNode;
			connectivityNode = (ConnectivityNode)eResolveProxy(oldConnectivityNode);
			if (connectivityNode != oldConnectivityNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.TERMINAL__CONNECTIVITY_NODE, oldConnectivityNode, connectivityNode));
			}
		}
		return connectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNode basicGetConnectivityNode() {
		return connectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectivityNode(ConnectivityNode newConnectivityNode, NotificationChain msgs) {
		ConnectivityNode oldConnectivityNode = connectivityNode;
		connectivityNode = newConnectivityNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.TERMINAL__CONNECTIVITY_NODE, oldConnectivityNode, newConnectivityNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectivityNode(ConnectivityNode newConnectivityNode) {
		if (newConnectivityNode != connectivityNode) {
			NotificationChain msgs = null;
			if (connectivityNode != null)
				msgs = ((InternalEObject)connectivityNode).eInverseRemove(this, CPSMPackage.CONNECTIVITY_NODE__TERMINALS, ConnectivityNode.class, msgs);
			if (newConnectivityNode != null)
				msgs = ((InternalEObject)newConnectivityNode).eInverseAdd(this, CPSMPackage.CONNECTIVITY_NODE__TERMINALS, ConnectivityNode.class, msgs);
			msgs = basicSetConnectivityNode(newConnectivityNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.TERMINAL__CONNECTIVITY_NODE, newConnectivityNode, newConnectivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment getConductingEquipment() {
		if (conductingEquipment != null && conductingEquipment.eIsProxy()) {
			InternalEObject oldConductingEquipment = (InternalEObject)conductingEquipment;
			conductingEquipment = (ConductingEquipment)eResolveProxy(oldConductingEquipment);
			if (conductingEquipment != oldConductingEquipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.TERMINAL__CONDUCTING_EQUIPMENT, oldConductingEquipment, conductingEquipment));
			}
		}
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment basicGetConductingEquipment() {
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductingEquipment(ConductingEquipment newConductingEquipment, NotificationChain msgs) {
		ConductingEquipment oldConductingEquipment = conductingEquipment;
		conductingEquipment = newConductingEquipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.TERMINAL__CONDUCTING_EQUIPMENT, oldConductingEquipment, newConductingEquipment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductingEquipment(ConductingEquipment newConductingEquipment) {
		if (newConductingEquipment != conductingEquipment) {
			NotificationChain msgs = null;
			if (conductingEquipment != null)
				msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CPSMPackage.CONDUCTING_EQUIPMENT__TERMINALS, ConductingEquipment.class, msgs);
			if (newConductingEquipment != null)
				msgs = ((InternalEObject)newConductingEquipment).eInverseAdd(this, CPSMPackage.CONDUCTING_EQUIPMENT__TERMINALS, ConductingEquipment.class, msgs);
			msgs = basicSetConductingEquipment(newConductingEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.TERMINAL__CONDUCTING_EQUIPMENT, newConductingEquipment, newConductingEquipment));
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
			case CPSMPackage.TERMINAL__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
			case CPSMPackage.TERMINAL__REGULATING_CONTROL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegulatingControl()).basicAdd(otherEnd, msgs);
			case CPSMPackage.TERMINAL__CONNECTIVITY_NODE:
				if (connectivityNode != null)
					msgs = ((InternalEObject)connectivityNode).eInverseRemove(this, CPSMPackage.CONNECTIVITY_NODE__TERMINALS, ConnectivityNode.class, msgs);
				return basicSetConnectivityNode((ConnectivityNode)otherEnd, msgs);
			case CPSMPackage.TERMINAL__CONDUCTING_EQUIPMENT:
				if (conductingEquipment != null)
					msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CPSMPackage.CONDUCTING_EQUIPMENT__TERMINALS, ConductingEquipment.class, msgs);
				return basicSetConductingEquipment((ConductingEquipment)otherEnd, msgs);
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
			case CPSMPackage.TERMINAL__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
			case CPSMPackage.TERMINAL__REGULATING_CONTROL:
				return ((InternalEList<?>)getRegulatingControl()).basicRemove(otherEnd, msgs);
			case CPSMPackage.TERMINAL__CONNECTIVITY_NODE:
				return basicSetConnectivityNode(null, msgs);
			case CPSMPackage.TERMINAL__CONDUCTING_EQUIPMENT:
				return basicSetConductingEquipment(null, msgs);
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
			case CPSMPackage.TERMINAL__MEASUREMENTS:
				return getMeasurements();
			case CPSMPackage.TERMINAL__REGULATING_CONTROL:
				return getRegulatingControl();
			case CPSMPackage.TERMINAL__CONNECTIVITY_NODE:
				if (resolve) return getConnectivityNode();
				return basicGetConnectivityNode();
			case CPSMPackage.TERMINAL__CONDUCTING_EQUIPMENT:
				if (resolve) return getConductingEquipment();
				return basicGetConductingEquipment();
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
			case CPSMPackage.TERMINAL__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
				return;
			case CPSMPackage.TERMINAL__REGULATING_CONTROL:
				getRegulatingControl().clear();
				getRegulatingControl().addAll((Collection<? extends RegulatingControl>)newValue);
				return;
			case CPSMPackage.TERMINAL__CONNECTIVITY_NODE:
				setConnectivityNode((ConnectivityNode)newValue);
				return;
			case CPSMPackage.TERMINAL__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)newValue);
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
			case CPSMPackage.TERMINAL__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case CPSMPackage.TERMINAL__REGULATING_CONTROL:
				getRegulatingControl().clear();
				return;
			case CPSMPackage.TERMINAL__CONNECTIVITY_NODE:
				setConnectivityNode((ConnectivityNode)null);
				return;
			case CPSMPackage.TERMINAL__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)null);
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
			case CPSMPackage.TERMINAL__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case CPSMPackage.TERMINAL__REGULATING_CONTROL:
				return regulatingControl != null && !regulatingControl.isEmpty();
			case CPSMPackage.TERMINAL__CONNECTIVITY_NODE:
				return connectivityNode != null;
			case CPSMPackage.TERMINAL__CONDUCTING_EQUIPMENT:
				return conductingEquipment != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminalImpl
