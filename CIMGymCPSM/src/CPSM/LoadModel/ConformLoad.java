/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.LoadModel;

import CPSM.Wires.EnergyConsumer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conform Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.LoadModel.ConformLoad#getLoadGroup <em>Load Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.LoadModel.LoadModelPackage#getConformLoad()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='ConformLoad represent loads that follow a daily load change pattern where the pattern can be used to scale the load with a system load.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='ConformLoad represent loads that follow a daily load change pattern where the pattern can be used to scale the load with a system load.'"
 * @generated
 */
public interface ConformLoad extends EnergyConsumer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Load Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.LoadModel.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Group</em>' reference.
	 * @see #setLoadGroup(ConformLoadGroup)
	 * @see CPSM.LoadModel.LoadModelPackage#getConformLoad_LoadGroup()
	 * @see CPSM.LoadModel.ConformLoadGroup#getEnergyConsumers
	 * @model opposite="EnergyConsumers" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Group of this ConformLoad.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Group of this ConformLoad.'"
	 * @generated
	 */
	ConformLoadGroup getLoadGroup();

	/**
	 * Sets the value of the '{@link CPSM.LoadModel.ConformLoad#getLoadGroup <em>Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Group</em>' reference.
	 * @see #getLoadGroup()
	 * @generated
	 */
	void setLoadGroup(ConformLoadGroup value);

} // ConformLoad
