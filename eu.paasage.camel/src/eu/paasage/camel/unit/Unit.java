/**
 */
package eu.paasage.camel.unit;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.unit.Unit#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.unit.Unit#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.unit.UnitPackage#getUnit()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correct_unit'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot correct_unit='Tuple {\n\tmessage : String = \'Unit: \' + name + \' is incorrect as its type( \' + self.unit.toString() +\n\t\t\t\t\t\t\' that does not correspond to its dimension\',\n\tstatus : Boolean = checkUnit()\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface Unit extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.paasage.camel.unit.UnitPackage#getUnit_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.unit.Unit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.unit.UnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see eu.paasage.camel.unit.UnitType
	 * @see #setUnit(UnitType)
	 * @see eu.paasage.camel.unit.UnitPackage#getUnit_Unit()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Feature'"
	 * @generated
	 */
	UnitType getUnit();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.unit.Unit#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see eu.paasage.camel.unit.UnitType
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (self.oclIsTypeOf(TimeIntervalUnit))\n\t\t\t\t\t\tthen if (unit = UnitType::MILLISECONDS or unit = UnitType::SECONDS or unit = UnitType::MINUTES or unit =\n\t\t\t\t\t\t\t\tUnitType::HOURS or unit = UnitType::DAYS or unit = UnitType::WEEKS or unit = UnitType::MONTHS)\n\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse if (self.oclIsTypeOf(StorageUnit))\n\t\t\t\t\t\t\tthen if (unit = UnitType::BYTES or unit = UnitType::KILOBYTES or unit = UnitType::MEGABYTES or unit =\n\t\t\t\t\t\t\t\t\tUnitType::GIGABYTES)\n\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\telse if (self.oclIsTypeOf(MonetaryUnit))\n\t\t\t\t\t\t\t\tthen if (unit = UnitType::EUROS or unit = UnitType::DOLLARS or unit = UnitType::POUNDS)\n\t\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(ThroughputUnit))\n\t\t\t\t\t\t\t\t\tthen if (unit = UnitType::BYTES_PER_SECOND or unit = UnitType::TRANSACTIONS_PER_SECOND or unit =\n\t\t\t\t\t\t\t\t\t\t\tUnitType::REQUESTS_PER_SECOND)\n\t\t\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(RequestUnit))\n\t\t\t\t\t\t\t\t\t\tthen if (unit = UnitType::REQUESTS)\n\t\t\t\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(TransactionUnit))\n\t\t\t\t\t\t\t\t\t\t\tthen if (unit = UnitType::TRANSACTIONS)\n\t\t\t\t\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(Dimensionless))\n\t\t\t\t\t\t\t\t\t\t\t\tthen if (unit = UnitType::PERCENTAGE)\n\t\t\t\t\t\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\t\telse if (self.oclIsTypeOf(CoreUnit))\n\t\t\t\t\t\t\t\t\t\t\t\t\tthen if (unit = UnitType::CORES)\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean checkUnit();

} // Unit
