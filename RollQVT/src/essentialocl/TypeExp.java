/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package essentialocl;

import emof.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link essentialocl.TypeExp#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see essentialocl.EssentialoclPackage#getTypeExp()
 * @model
 * @generated
 */
public interface TypeExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Referred Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Type</em>' reference.
	 * @see #setReferredType(Type)
	 * @see essentialocl.EssentialoclPackage#getTypeExp_ReferredType()
	 * @model
	 * @generated
	 */
	Type getReferredType();

	/**
	 * Sets the value of the '{@link essentialocl.TypeExp#getReferredType <em>Referred Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Type</em>' reference.
	 * @see #getReferredType()
	 * @generated
	 */
	void setReferredType(Type value);

} // TypeExp
