/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Equivalents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CPSM.Equivalents.EquivalentsPackage
 * @generated
 */
public interface EquivalentsFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EquivalentsFactory eINSTANCE = CPSM.Equivalents.impl.EquivalentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Equivalent Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Network</em>'.
	 * @generated
	 */
	EquivalentNetwork createEquivalentNetwork();

	/**
	 * Returns a new object of class '<em>Equivalent Shunt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Shunt</em>'.
	 * @generated
	 */
	EquivalentShunt createEquivalentShunt();

	/**
	 * Returns a new object of class '<em>Equivalent Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Branch</em>'.
	 * @generated
	 */
	EquivalentBranch createEquivalentBranch();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EquivalentsPackage getEquivalentsPackage();

} //EquivalentsFactory
