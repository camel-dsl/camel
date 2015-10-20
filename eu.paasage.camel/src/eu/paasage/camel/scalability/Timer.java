/**
 */
package eu.paasage.camel.scalability;

import eu.paasage.camel.unit.TimeIntervalUnit;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.Timer#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.Timer#getType <em>Type</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.Timer#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.Timer#getMaxOccurrenceNum <em>Max Occurrence Num</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.Timer#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.scalability.ScalabilityPackage#getTimer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='timer_correct_values'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot timer_correct_values='Tuple {\n\tmessage : String = \'Timer: \' + self.toString() +\n\t\t\t\t\t\' as wrong value combinations for its attributes. This means that either the timeValue is non-positive or the time type is WITHIN_MAX and a non-positive maxOccurrenceNum has been provided or that the time type is not WITHIN_MAX and a positive maxOccurrenceNum has been given\',\n\tstatus : Boolean = timeValue\n\t\t\t\t\t> 0 and (self.type = TimerType::WITHIN_MAX implies self.maxOccurrenceNum > 0) and (self.type <>\n\t\t\t\t\tTimerType::WITHIN_MAX implies self.maxOccurrenceNum = 0)\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface Timer extends CDOObject {
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
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getTimer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.Timer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.scalability.TimerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.paasage.camel.scalability.TimerType
	 * @see #setType(TimerType)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getTimer_Type()
	 * @model required="true"
	 * @generated
	 */
	TimerType getType();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.Timer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.paasage.camel.scalability.TimerType
	 * @see #getType()
	 * @generated
	 */
	void setType(TimerType value);

	/**
	 * Returns the value of the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Value</em>' attribute.
	 * @see #setTimeValue(int)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getTimer_TimeValue()
	 * @model required="true"
	 * @generated
	 */
	int getTimeValue();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.Timer#getTimeValue <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value</em>' attribute.
	 * @see #getTimeValue()
	 * @generated
	 */
	void setTimeValue(int value);

	/**
	 * Returns the value of the '<em><b>Max Occurrence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Occurrence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Occurrence Num</em>' attribute.
	 * @see #setMaxOccurrenceNum(int)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getTimer_MaxOccurrenceNum()
	 * @model
	 * @generated
	 */
	int getMaxOccurrenceNum();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.Timer#getMaxOccurrenceNum <em>Max Occurrence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurrence Num</em>' attribute.
	 * @see #getMaxOccurrenceNum()
	 * @generated
	 */
	void setMaxOccurrenceNum(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(TimeIntervalUnit)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getTimer_Unit()
	 * @model required="true"
	 * @generated
	 */
	TimeIntervalUnit getUnit();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.Timer#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeIntervalUnit value);

} // Timer
