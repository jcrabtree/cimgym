/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Unit#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getUnit()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Quantity being measured. The Unit.name shall be unique among all specified quantities and describe the quantity. The Unit.aliasName is meant to be used for localization.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quantity being measured. The Unit.name shall be unique among all specified quantities and describe the quantity. The Unit.aliasName is meant to be used for localization.'"
 * @generated
 */
public interface Unit extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Measurement}.
	 * It is bidirectional and its opposite is '{@link CPSM.Measurement#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CPSM.CPSMPackage#getUnit_Measurements()
	 * @see CPSM.Measurement#getUnit
	 * @model opposite="Unit"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The Measurements having the Unit'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Measurements having the Unit' Profile\040documentation=''"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

} // Unit
