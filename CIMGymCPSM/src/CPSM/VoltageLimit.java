/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.VoltageLimit#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getVoltageLimit()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Operational limit applied to voltage.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Operational limit applied to voltage.'"
 * @generated
 */
public interface VoltageLimit extends OperationalLimit {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see CPSM.CPSMPackage#getVoltageLimit_Value()
	 * @model dataType="CPSM.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Limit on voltage. High or low limit depends on the OperatoinalLimit.limitKind'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Limit on voltage. High or low limit depends on the OperatoinalLimit.limitKind'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link CPSM.VoltageLimit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // VoltageLimit
