/**
 */
package eu.paasage.camel.unit;

import eu.paasage.camel.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.unit.UnitModel#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.unit.UnitPackage#getUnitModel()
 * @model
 * @generated
 */
public interface UnitModel extends Model {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.unit.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see eu.paasage.camel.unit.UnitPackage#getUnitModel_Units()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unit> getUnits();

} // UnitModel
