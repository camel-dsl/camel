/**
 */
package eu.paasage.camel.scalability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.UnaryEventPattern#getEvent <em>Event</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.UnaryEventPattern#getOccurrenceNum <em>Occurrence Num</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.UnaryEventPattern#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.scalability.ScalabilityPackage#getUnaryEventPattern()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='unary_event_pattern_correct_values_per_operator'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot unary_event_pattern_correct_values_per_operator='Tuple {\n\tmessage : String = \'In UnaryEventPattern: \' + self.name +\n\t\t\t\t\t\' either a REPEAT operator there is an incorrect combination of values of the operator and occurrenceNum attributes and of the timer association. When operator is REPEAT, occurrenceNum should be positive; otherwise, equal to zero. When operator is WHERE, then a timer must be specified; otherwise, no timer should be specified\',\n\tstatus : Boolean = (self.operator\n\t\t\t\t\t= UnaryPatternOperatorType::REPEAT implies occurrenceNum > 0) and (self.operator <>\n\t\t\t\t\tUnaryPatternOperatorType::REPEAT implies occurrenceNum = 0) and (self.operator = UnaryPatternOperatorType::WHEN\n\t\t\t\t\timplies self.oclAsType(EventPattern).timer <> null) and (self.operator <> UnaryPatternOperatorType::WHEN implies\n\t\t\t\t\tself.oclAsType(EventPattern).timer = null)\n}.status'"
 * @generated
 */
public interface UnaryEventPattern extends EventPattern {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getUnaryEventPattern_Event()
	 * @model required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.UnaryEventPattern#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Occurrence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Num</em>' attribute.
	 * @see #setOccurrenceNum(int)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getUnaryEventPattern_OccurrenceNum()
	 * @model
	 * @generated
	 */
	int getOccurrenceNum();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.UnaryEventPattern#getOccurrenceNum <em>Occurrence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Num</em>' attribute.
	 * @see #getOccurrenceNum()
	 * @generated
	 */
	void setOccurrenceNum(int value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.scalability.UnaryPatternOperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see eu.paasage.camel.scalability.UnaryPatternOperatorType
	 * @see #setOperator(UnaryPatternOperatorType)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getUnaryEventPattern_Operator()
	 * @model required="true"
	 * @generated
	 */
	UnaryPatternOperatorType getOperator();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.UnaryEventPattern#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see eu.paasage.camel.scalability.UnaryPatternOperatorType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryPatternOperatorType value);

} // UnaryEventPattern
